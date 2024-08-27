package in.juspay.hypersdk.services;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Build;
import android.util.Base64;
import androidx.annotation.NonNull;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import dalvik.system.ZipPathValidator;
import in.juspay.hyper.constants.Labels;
import in.juspay.hyper.constants.LogCategory;
import in.juspay.hyper.constants.LogSubCategory;
import in.juspay.hypersdk.core.JuspayServices;
import in.juspay.hypersdk.core.PaymentConstants;
import in.juspay.hypersdk.core.SdkTracker;
import in.juspay.hypersdk.data.KeyValueStore;
import in.juspay.hypersdk.data.SessionInfo;
import in.juspay.hypersdk.security.EncryptionHelper;
import in.juspay.hypersdk.utils.network.SessionizedNetUtils;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.util.HashMap;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import nn.d;
import okhttp3.HttpUrl;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import v.e;

/* loaded from: classes2.dex */
public class RemoteAssetService {
    private static final String LOG_TAG = "RemoteAssetService";
    private static final JSONArray fileDownloadTimes = new JSONArray();
    private JSONObject assetMetadata;

    @NonNull
    private final JuspayServices juspayServices;
    private final String sdkName;

    /* loaded from: classes2.dex */
    public static class AssetDownloadTask extends AsyncTask<Void, Void, Boolean> {
        private String callback;
        private Context context;
        private String fileName;
        private String location;
        private RemoteAssetService remoteAssetService;
        private long renewFileStartTime;
        private long ttlInMilliSeconds;

        public AssetDownloadTask(@NonNull Context context, String str, String str2, String str3, long j10, RemoteAssetService remoteAssetService, long j11) {
            this.location = str;
            this.fileName = str2;
            this.callback = str3;
            this.ttlInMilliSeconds = j10;
            this.remoteAssetService = remoteAssetService;
            this.context = context;
            this.renewFileStartTime = j11;
        }

        @Override // android.os.AsyncTask
        public Boolean doInBackground(Void... voidArr) {
            if (this.context != null) {
                try {
                    if (!this.location.contains("certificates")) {
                        return Boolean.valueOf(this.remoteAssetService.getContent(this.context, this.location, this.fileName, this.ttlInMilliSeconds));
                    }
                    this.remoteAssetService.updateCertificates(this.context, this.location, this.ttlInMilliSeconds);
                } catch (Exception e10) {
                    this.remoteAssetService.juspayServices.getSdkTracker().trackAndLogException(RemoteAssetService.LOG_TAG, LogCategory.ACTION, LogSubCategory.Action.SYSTEM, Labels.System.REMOTE_ASSET_SERVICE, "Could not renew file " + this.location + ": " + e10.getMessage(), e10);
                }
            }
            return Boolean.FALSE;
        }

        @Override // android.os.AsyncTask
        public void onPostExecute(Boolean bool) {
            super.onPostExecute((AssetDownloadTask) bool);
            long currentTimeMillis = System.currentTimeMillis();
            long j10 = currentTimeMillis - this.renewFileStartTime;
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("startTime", this.renewFileStartTime);
                jSONObject.put("endTime", currentTimeMillis);
                jSONObject.put("totalTime", j10);
                jSONObject.put("fileName", this.fileName);
            } catch (JSONException unused) {
            }
            RemoteAssetService.fileDownloadTimes.put(jSONObject);
            String str = this.callback;
            if (str != null) {
                String format = String.format("window.callUICallback('%s', '%b', '%s', '%s');", str, bool, this.location, this.remoteAssetService.juspayServices.getFileProviderService().appendSdkNameAndVersion(this.fileName));
                this.remoteAssetService.juspayServices.sdkDebug(RemoteAssetService.LOG_TAG, format);
                this.remoteAssetService.juspayServices.addJsToWebView(format);
            }
        }
    }

    public RemoteAssetService(@NonNull JuspayServices juspayServices) {
        this.juspayServices = juspayServices;
        this.sdkName = juspayServices.getSdkInfo().getSdkName();
    }

    private String decideAndUpdateInternalStorage(@NonNull Context context, byte[] bArr, String str, String str2) {
        SdkTracker sdkTracker = this.juspayServices.getSdkTracker();
        FileProviderService fileProviderService = this.juspayServices.getFileProviderService();
        String md5 = EncryptionHelper.md5(bArr);
        if (md5 == null) {
            md5 = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        String str3 = md5;
        this.juspayServices.sdkDebug(LOG_TAG, "hashInDisk: " + str);
        this.juspayServices.sdkDebug(LOG_TAG, "newHash: ".concat(str3));
        sdkTracker.trackAction(LogSubCategory.Action.SYSTEM, "info", Labels.System.REMOTE_ASSET_SERVICE, "remote_asset_service_update_hash", e.j(new StringBuilder("Hash of used file '"), str2, "' is now ", str3));
        if (str != null && str.equals(str3)) {
            sdkTracker.trackAction(LogSubCategory.Action.SYSTEM, "info", Labels.System.REMOTE_ASSET_SERVICE, "remote_asset_service_compare_hash", d.k("Remote hash is same as disk hash. Not updating asset '", str2, "'"));
        } else {
            sdkTracker.trackAction(LogSubCategory.Action.SYSTEM, "info", Labels.System.REMOTE_ASSET_SERVICE, "remote_asset_service_compare_hash", d.k("Remote hash differs from disk hash. Updating asset '", str2, "'"));
            if (fileProviderService.updateFile(context, str2, bArr)) {
                return str3;
            }
        }
        return null;
    }

    private byte[] download(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("ts", String.valueOf(System.currentTimeMillis()));
        hashMap.put("If-None-Match", str);
        hashMap.put("Accept-Encoding", "gzip");
        this.juspayServices.sdkDebug(LOG_TAG, "START fetching content from: " + str2);
        try {
            return new SessionizedNetUtils(this.juspayServices.getSessionInfo(), 0, 0, false).fetchIfModified(str2, hashMap);
        } catch (Exception e10) {
            this.juspayServices.getSdkTracker().trackAndLogException(LOG_TAG, LogCategory.ACTION, LogSubCategory.Action.SYSTEM, Labels.System.REMOTE_ASSET_SERVICE, "Error While Downloading File", e10);
            return null;
        }
    }

    private long getAssetTtl() {
        return Long.parseLong(KeyValueStore.read(this.juspayServices.getContext(), this.sdkName, "REMOTE_ASSET_TTL_MILLISECONDS", String.valueOf(3600000L)));
    }

    private synchronized void setMetadata(String str, JSONObject jSONObject) {
        try {
            if (this.assetMetadata == null) {
                getMetadata(str);
            }
            this.assetMetadata.put(str, jSONObject);
            KeyValueStore.write(this.juspayServices.getContext(), this.sdkName, "asset_metadata.json", this.assetMetadata.toString());
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1, types: [java.io.ByteArrayInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.io.InputStream] */
    private byte[] unZipAndVerify(@NonNull Context context, byte[] bArr, String str) {
        Throwable th2;
        ?? r32;
        ZipInputStream zipInputStream;
        ZipInputStream zipInputStream2;
        String str2;
        Throwable th3;
        byte[] bArr2;
        byte[] bArr3;
        ?? r33;
        String str3;
        ObjectInputStream objectInputStream;
        Signature signature;
        FileProviderService fileProviderService = this.juspayServices.getFileProviderService();
        SdkTracker sdkTracker = this.juspayServices.getSdkTracker();
        if (bArr != null) {
            String str4 = ".zip";
            if (str.contains(".zip")) {
                try {
                    ?? byteArrayInputStream = new ByteArrayInputStream(bArr);
                    try {
                        try {
                            zipInputStream = new ZipInputStream(byteArrayInputStream);
                            try {
                                if (Build.VERSION.SDK_INT >= 34) {
                                    try {
                                        ZipPathValidator.clearCallback();
                                    } catch (Throwable th4) {
                                        th3 = th4;
                                        zipInputStream2 = zipInputStream;
                                        str4 = byteArrayInputStream;
                                        try {
                                            zipInputStream2.close();
                                            throw th3;
                                        } catch (Throwable th5) {
                                            th3.addSuppressed(th5);
                                            throw th3;
                                        }
                                    }
                                }
                                bArr2 = null;
                                bArr3 = null;
                                while (true) {
                                    try {
                                        ZipEntry nextEntry = zipInputStream.getNextEntry();
                                        if (nextEntry == null) {
                                            try {
                                                break;
                                            } catch (ClassNotFoundException e10) {
                                                e = e10;
                                                str3 = "Exception while Reading Public Key";
                                                sdkTracker.trackAndLogException(LOG_TAG, LogCategory.ACTION, LogSubCategory.Action.SYSTEM, Labels.System.REMOTE_ASSET_SERVICE, str3, e);
                                                zipInputStream2 = zipInputStream;
                                                r33 = byteArrayInputStream;
                                                zipInputStream2.close();
                                                r33.close();
                                                return null;
                                            } catch (InvalidKeyException e11) {
                                                e = e11;
                                                str3 = "Key Used was Invalid";
                                                sdkTracker.trackAndLogException(LOG_TAG, LogCategory.ACTION, LogSubCategory.Action.SYSTEM, Labels.System.REMOTE_ASSET_SERVICE, str3, e);
                                                zipInputStream2 = zipInputStream;
                                                r33 = byteArrayInputStream;
                                                zipInputStream2.close();
                                                r33.close();
                                                return null;
                                            } catch (NoSuchAlgorithmException e12) {
                                                e = e12;
                                                str3 = "DSA Algorithm not found";
                                                sdkTracker.trackAndLogException(LOG_TAG, LogCategory.ACTION, LogSubCategory.Action.SYSTEM, Labels.System.REMOTE_ASSET_SERVICE, str3, e);
                                                zipInputStream2 = zipInputStream;
                                                r33 = byteArrayInputStream;
                                                zipInputStream2.close();
                                                r33.close();
                                                return null;
                                            } catch (SignatureException e13) {
                                                e = e13;
                                                str3 = "Exception while matching Signature for file";
                                                sdkTracker.trackAndLogException(LOG_TAG, LogCategory.ACTION, LogSubCategory.Action.SYSTEM, Labels.System.REMOTE_ASSET_SERVICE, str3, e);
                                                zipInputStream2 = zipInputStream;
                                                r33 = byteArrayInputStream;
                                                zipInputStream2.close();
                                                r33.close();
                                                return null;
                                            }
                                        }
                                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                        byte[] bArr4 = new byte[UserMetadata.MAX_ATTRIBUTE_SIZE];
                                        while (true) {
                                            int read = zipInputStream.read(bArr4);
                                            if (read == -1) {
                                                break;
                                            }
                                            byteArrayOutputStream.write(bArr4, 0, read);
                                        }
                                        zipInputStream.closeEntry();
                                        byteArrayOutputStream.close();
                                        if (nextEntry.getName().contains(PaymentConstants.SIGNATURE)) {
                                            bArr2 = Base64.decode(byteArrayOutputStream.toByteArray(), 2);
                                        } else if (nextEntry.getName().contains(".jsa") || (str.contains("certificate") && nextEntry.getName().contains(".zip"))) {
                                            bArr3 = byteArrayOutputStream.toByteArray();
                                        }
                                    } catch (Exception e14) {
                                        zipInputStream2 = zipInputStream;
                                        str2 = byteArrayInputStream;
                                        try {
                                            sdkTracker.trackAndLogException(LOG_TAG, LogCategory.ACTION, LogSubCategory.Action.SYSTEM, Labels.System.REMOTE_ASSET_SERVICE, "Exception while verifying Signature", e14);
                                            r33 = str2;
                                        } catch (Throwable th6) {
                                            th = th6;
                                            th3 = th;
                                            str4 = str2;
                                            zipInputStream2.close();
                                            throw th3;
                                        }
                                    }
                                }
                                objectInputStream = new ObjectInputStream(new ByteArrayInputStream(fileProviderService.getAssetFileAsByte(context, "remoteAssetPublicKey")));
                                try {
                                    PublicKey publicKey = (PublicKey) objectInputStream.readObject();
                                    signature = Signature.getInstance("DSA");
                                    signature.initVerify(publicKey);
                                    signature.update(bArr3);
                                } finally {
                                }
                            } catch (Throwable th7) {
                                th = th7;
                                zipInputStream2 = zipInputStream;
                                str2 = byteArrayInputStream;
                            }
                        } catch (Throwable th8) {
                            th = th8;
                            th2 = th;
                            r32 = str4;
                            try {
                                r32.close();
                                throw th2;
                            } catch (Throwable th9) {
                                th2.addSuppressed(th9);
                                throw th2;
                            }
                        }
                        try {
                            if (signature.verify(bArr2)) {
                                sdkTracker.trackAction(LogSubCategory.Action.SYSTEM, "info", Labels.System.REMOTE_ASSET_SERVICE, "signature_verified", str);
                                objectInputStream.close();
                                zipInputStream.close();
                                byteArrayInputStream.close();
                                return bArr3;
                            }
                            sdkTracker.trackAction(LogSubCategory.Action.SYSTEM, "info", Labels.System.REMOTE_ASSET_SERVICE, "signature_not_verified", str);
                            objectInputStream.close();
                            zipInputStream.close();
                            byteArrayInputStream.close();
                            return null;
                        } catch (Throwable th10) {
                            th2 = th10;
                            r32 = byteArrayInputStream;
                            r32.close();
                            throw th2;
                        }
                    } catch (Throwable th11) {
                        th = th11;
                        str4 = byteArrayInputStream;
                        th2 = th;
                        r32 = str4;
                        r32.close();
                        throw th2;
                    }
                } catch (IOException e15) {
                    sdkTracker.trackAndLogException(LOG_TAG, LogCategory.ACTION, LogSubCategory.Action.SYSTEM, Labels.System.REMOTE_ASSET_SERVICE, "IOException while verifying Signature", e15);
                    return null;
                }
            }
        }
        return bArr;
    }

    /* JADX WARN: Finally extract failed */
    private String unzipAndUpdateInternalStorage(@NonNull Context context, byte[] bArr) {
        FileProviderService fileProviderService = this.juspayServices.getFileProviderService();
        String md5 = EncryptionHelper.md5(bArr);
        if (md5 == null) {
            md5 = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        ZipInputStream zipInputStream = new ZipInputStream(new ByteArrayInputStream(bArr));
        while (true) {
            try {
                ZipEntry nextEntry = zipInputStream.getNextEntry();
                if (nextEntry == null) {
                    zipInputStream.close();
                    return md5;
                }
                String name = nextEntry.getName();
                if (!nextEntry.isDirectory()) {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    while (true) {
                        try {
                            int read = zipInputStream.read();
                            if (read == -1) {
                                break;
                            }
                            byteArrayOutputStream.write(read);
                        } catch (Throwable th2) {
                            try {
                                byteArrayOutputStream.close();
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                            throw th2;
                        }
                    }
                    fileProviderService.updateCertificate(context, name, byteArrayOutputStream.toByteArray());
                    byteArrayOutputStream.close();
                }
            } catch (Throwable th4) {
                try {
                    zipInputStream.close();
                } catch (Throwable th5) {
                    th4.addSuppressed(th5);
                }
                throw th4;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateCertificates(@NonNull Context context, String str, long j10) {
        String str2;
        String str3;
        SdkTracker sdkTracker = this.juspayServices.getSdkTracker();
        JSONObject metadata = getMetadata(str);
        boolean z10 = true;
        String substring = str.substring(str.lastIndexOf("/") + 1);
        if (metadata.getString("lastChecked") != null) {
            str2 = metadata.getString(PaymentConstants.ATTR_HASH_IN_DISK);
            str3 = metadata.getString("zipHashInDisk");
        } else {
            str2 = HttpUrl.FRAGMENT_ENCODE_SET;
            str3 = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        byte[] download = download(str3, str);
        if (download != null) {
            str3 = EncryptionHelper.md5(download);
        } else {
            z10 = false;
        }
        boolean z11 = z10;
        Object obj = str3;
        byte[] unZipAndVerify = unZipAndVerify(context, download, substring);
        this.juspayServices.sdkDebug(LOG_TAG, "DONE fetching content from: ".concat(str));
        this.juspayServices.sdkDebug(LOG_TAG, "hashInDisk: " + str2);
        this.juspayServices.sdkDebug(LOG_TAG, "newHash: ");
        sdkTracker.trackAction(LogSubCategory.Action.SYSTEM, "info", Labels.System.REMOTE_ASSET_SERVICE, "remote_asset_service_update_hash", "Hash of used file '" + substring + "' is now ");
        if (unZipAndVerify != null) {
            String unzipAndUpdateInternalStorage = unzipAndUpdateInternalStorage(context, unZipAndVerify);
            metadata.put("lastChecked", System.currentTimeMillis());
            metadata.put(PaymentConstants.ATTR_HASH_IN_DISK, unzipAndUpdateInternalStorage);
            metadata.put("zipHashInDisk", obj);
            setMetadata(str, metadata);
            return;
        }
        if (z11) {
            return;
        }
        sdkTracker.trackAction(LogSubCategory.Action.SYSTEM, "info", Labels.System.REMOTE_ASSET_SERVICE, "remote_asset_service_etag_match", "ETAG matches for '" + substring + "'. Not downloading from " + str);
    }

    public boolean getContent(@NonNull Context context, String str) {
        return getContent(context, str, getAssetTtl());
    }

    public JSONArray getFileDownloadTimes() {
        return fileDownloadTimes;
    }

    public synchronized JSONObject getMetadata(String str) {
        try {
            SdkTracker sdkTracker = this.juspayServices.getSdkTracker();
            try {
                this.assetMetadata = new JSONObject(KeyValueStore.read(this.juspayServices.getContext(), this.sdkName, "asset_metadata.json", "{}"));
                this.juspayServices.sdkDebug(LOG_TAG, "assetMetadata: " + this.assetMetadata);
                if (!this.assetMetadata.has(str)) {
                    this.assetMetadata.put(str, new JSONObject());
                    ((JSONObject) this.assetMetadata.get(str)).put("lastChecked", 0);
                    ((JSONObject) this.assetMetadata.get(str)).put(PaymentConstants.ATTR_HASH_IN_DISK, HttpUrl.FRAGMENT_ENCODE_SET);
                    ((JSONObject) this.assetMetadata.get(str)).put("zipHashInDisk", HttpUrl.FRAGMENT_ENCODE_SET);
                }
            } catch (JSONException e10) {
                sdkTracker.trackAndLogException(LOG_TAG, LogCategory.ACTION, LogSubCategory.Action.SYSTEM, Labels.System.REMOTE_ASSET_SERVICE, "Exception trying to read from KeyStore: asset_metadata.json", e10);
                throw new RuntimeException("Unexpected internal error.", e10);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (JSONObject) this.assetMetadata.get(str);
    }

    public void renewFile(@NonNull Context context, String str, String str2, long j10) {
        renewFile(context, str, str2, getAssetTtl(), null, j10);
    }

    public synchronized void resetMetadata(String str) {
        try {
            if (this.assetMetadata == null) {
                getMetadata(str);
            }
            this.assetMetadata.remove(str);
            KeyValueStore.write(this.juspayServices.getContext(), this.sdkName, "asset_metadata.json", this.assetMetadata.toString());
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private boolean getContent(@NonNull Context context, String str, long j10) {
        return getContent(context, str, null, j10);
    }

    public void renewFile(@NonNull Context context, String str, String str2, long j10, String str3, long j11) {
        this.juspayServices.sdkDebug(LOG_TAG, "Looking to renew file: " + str);
        new AssetDownloadTask(context, str, str3, str2, j10, this, j11).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean getContent(@NonNull Context context, String str, String str2, long j10) {
        String str3;
        String str4;
        boolean z10;
        SessionInfo sessionInfo = this.juspayServices.getSessionInfo();
        SdkTracker sdkTracker = this.juspayServices.getSdkTracker();
        FileProviderService fileProviderService = this.juspayServices.getFileProviderService();
        String replace = !sessionInfo.isVerifyAssetsEnabled() ? str.replace(".zip", ".jsa") : str;
        String substring = str2 == null ? replace.substring(replace.lastIndexOf("/") + 1) : str2;
        String replace2 = substring.replace(".zip", ".jsa");
        JSONObject metadata = getMetadata(replace2);
        if (metadata.getString("lastChecked") != null) {
            str4 = metadata.getString(PaymentConstants.ATTR_HASH_IN_DISK);
            str3 = metadata.getString("zipHashInDisk");
        } else {
            boolean contains = substring.contains(".zip");
            str3 = HttpUrl.FRAGMENT_ENCODE_SET;
            if (contains) {
                str4 = HttpUrl.FRAGMENT_ENCODE_SET;
            } else {
                FileInputStream fileInputStream = new FileInputStream(fileProviderService.readFromFile(context, substring, false));
                try {
                    String md5 = EncryptionHelper.md5(fileInputStream);
                    fileInputStream.close();
                    str4 = md5;
                } finally {
                }
            }
        }
        byte[] download = download(str3, replace);
        if (download != null) {
            str3 = EncryptionHelper.md5(download);
            z10 = true;
        } else {
            z10 = false;
        }
        byte[] unZipAndVerify = unZipAndVerify(context, download, substring);
        if (unZipAndVerify == null) {
            if (!z10) {
                sdkTracker.trackAction(LogSubCategory.Action.SYSTEM, "info", Labels.System.REMOTE_ASSET_SERVICE, "remote_asset_service_etag_match", "ETAG matches for '" + substring + "'. Not downloading from " + replace);
                return false;
            }
            unZipAndVerify = EncryptionHelper.v1Encrypt(fileProviderService.readFromFile(context, replace2, false).getBytes());
        }
        if (unZipAndVerify != null) {
            this.juspayServices.sdkDebug(LOG_TAG, "DONE fetching content from: ".concat(replace));
            this.juspayServices.sdkDebug(LOG_TAG, "Text: ".concat(new String(unZipAndVerify)));
        }
        String decideAndUpdateInternalStorage = decideAndUpdateInternalStorage(context, unZipAndVerify, str4, replace2);
        if (decideAndUpdateInternalStorage != null) {
            metadata.put("lastChecked", System.currentTimeMillis());
            metadata.put(PaymentConstants.ATTR_HASH_IN_DISK, decideAndUpdateInternalStorage);
            metadata.put("zipHashInDisk", str3);
            setMetadata(replace2, metadata);
        }
        return true;
    }

    public void renewFile(@NonNull Context context, String str, String str2, String str3, long j10) {
        renewFile(context, str, str2, getAssetTtl(), str3, j10);
    }
}
