package in.juspay.hypersdk.services;

import a3.a;
import android.content.Context;
import android.os.Environment;
import androidx.annotation.NonNull;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import da.e;
import in.juspay.hyper.constants.Labels;
import in.juspay.hyper.constants.LogCategory;
import in.juspay.hyper.constants.LogLevel;
import in.juspay.hyper.constants.LogSubCategory;
import in.juspay.hyper.core.FileProviderInterface;
import in.juspay.hyper.core.JuspayLogger;
import in.juspay.hypersdk.R;
import in.juspay.hypersdk.core.JuspayServices;
import in.juspay.hypersdk.core.PaymentConstants;
import in.juspay.hypersdk.core.SdkTracker;
import in.juspay.hypersdk.data.KeyValueStore;
import in.juspay.hypersdk.data.SdkInfo;
import in.juspay.hypersdk.security.EncryptionHelper;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import nn.d;
import okhttp3.HttpUrl;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class FileProviderService implements FileProviderInterface {
    private static final String LOG_TAG = "FileProviderService";

    @NonNull
    private final JuspayServices juspayServices;

    @NonNull
    private final Map<String, String> fileCache = new HashMap();

    @NonNull
    private final List<String> fileCacheWhiteList = new ArrayList();
    private final boolean shouldCheckInternalAssets = true;

    public FileProviderService(@NonNull JuspayServices juspayServices) {
        this.juspayServices = juspayServices;
    }

    private void cacheFile(String str, String str2) {
        this.fileCache.put(str, str2);
        this.juspayServices.sdkDebug(LOG_TAG, "Caching file: " + str);
    }

    private void copyFile(@NonNull Context context, String str, String str2) {
        Exception exc;
        SdkTracker sdkTracker;
        String str3;
        try {
            createJuspayDir(context);
            createRequiredDir(context, str2);
            this.juspayServices.sdkDebug(LOG_TAG, "copyFile: " + str + "   " + str2);
            FileInputStream fileInputStream = new FileInputStream(getFileFromInternalStorage(context, str));
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(getFileFromInternalStorage(context, str2));
                try {
                    byte[] bArr = new byte[UserMetadata.MAX_ATTRIBUTE_SIZE];
                    while (true) {
                        int read = fileInputStream.read(bArr);
                        if (read != -1) {
                            fileOutputStream.write(bArr, 0, read);
                        } else {
                            fileOutputStream.flush();
                            fileOutputStream.close();
                            fileInputStream.close();
                            return;
                        }
                    }
                } finally {
                }
            } catch (Throwable th2) {
                try {
                    fileInputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (FileNotFoundException e10) {
            exc = e10;
            sdkTracker = this.juspayServices.getSdkTracker();
            str3 = "File not found: ";
            sdkTracker.trackException(LogCategory.ACTION, LogSubCategory.Action.SYSTEM, Labels.System.FILE_PROVIDER_SERVICE, a.f(str3, str), exc);
        } catch (Exception e11) {
            exc = e11;
            sdkTracker = this.juspayServices.getSdkTracker();
            str3 = "Exception: ";
            sdkTracker.trackException(LogCategory.ACTION, LogSubCategory.Action.SYSTEM, Labels.System.FILE_PROVIDER_SERVICE, a.f(str3, str), exc);
        }
    }

    private void createCertDir(@NonNull Context context) {
        File file = new File(context.getDir("juspay", 0), "certificates_v1");
        if (file.exists()) {
            return;
        }
        file.mkdir();
    }

    private void createJuspayDir(@NonNull Context context) {
        File file = new File(context.getCacheDir(), "juspay");
        if (file.exists()) {
            return;
        }
        file.mkdir();
    }

    private void createRequiredDir(@NonNull Context context, String str) {
        if (str.contains("/")) {
            File file = new File(context.getDir("juspay", 0), str.substring(0, str.lastIndexOf("/")));
            if (file.exists()) {
                return;
            }
            file.mkdirs();
        }
    }

    private void deleteFileFromCache(String str) {
        if (isFileCached(str)) {
            this.fileCache.remove(str);
        }
    }

    private File getFileFromInternalStorage(@NonNull Context context, String str) {
        this.juspayServices.sdkDebug(LOG_TAG, "Context while reading Internal Storage :" + context);
        this.juspayServices.sdkDebug(LOG_TAG, "Getting file from internal storage. Filename: " + str);
        return new File(context.getDir("juspay", 0), str);
    }

    private boolean isFileCached(String str) {
        return this.fileCache.containsKey(str);
    }

    private String readFromAssets(@NonNull Context context, String str) {
        SdkTracker sdkTracker = this.juspayServices.getSdkTracker();
        try {
            byte[] assetFileAsByte = getAssetFileAsByte(context, str);
            if (str.endsWith("jsa")) {
                this.juspayServices.sdkDebug(LOG_TAG, "Read JSA Asset file " + str + " with encrypted hash - " + EncryptionHelper.md5(assetFileAsByte));
                return new String(EncryptionHelper.decryptThenGunzip(assetFileAsByte, context.getResources().getString(R.string.juspay_encryption_version)));
            }
            this.juspayServices.sdkDebug(LOG_TAG, "Done reading " + str + " from assets");
            return new String(assetFileAsByte);
        } catch (Exception e10) {
            sdkTracker.trackException(LogCategory.ACTION, LogSubCategory.Action.SYSTEM, Labels.System.FILE_PROVIDER_SERVICE, a.f("Exception trying to read from file: ", str), e10);
            return null;
        }
    }

    private void readFromInputStream(ByteArrayOutputStream byteArrayOutputStream, InputStream inputStream) {
        byte[] bArr = new byte[4096];
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return;
            } else {
                byteArrayOutputStream.write(bArr, 0, read);
            }
        }
    }

    private String readFromInternalStorage(@NonNull Context context, String str) {
        String appendSdkNameAndVersion = appendSdkNameAndVersion(str);
        if (this.juspayServices.getSdkInfo().usesLocalAssets()) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        SdkTracker sdkTracker = this.juspayServices.getSdkTracker();
        try {
            if (appendSdkNameAndVersion.endsWith("jsa")) {
                byte[] decryptGunzipInternalStorage = decryptGunzipInternalStorage(context, appendSdkNameAndVersion);
                if (decryptGunzipInternalStorage != null) {
                    return new String(decryptGunzipInternalStorage);
                }
                sdkTracker.trackAction(LogSubCategory.Action.SYSTEM, LogLevel.WARNING, Labels.System.FILE_PROVIDER_SERVICE, "readFromInternalStorage", "Returning null from internal storage for ".concat(appendSdkNameAndVersion));
                return null;
            }
            FileInputStream fileInputStream = new FileInputStream(getFileFromInternalStorage(context, appendSdkNameAndVersion));
            try {
                InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
                try {
                    BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                    while (true) {
                        try {
                            int read = bufferedReader.read();
                            if (read == -1) {
                                bufferedReader.close();
                                inputStreamReader.close();
                                sdkTracker.trackAction(LogSubCategory.Action.SYSTEM, LogLevel.DEBUG, Labels.System.FILE_PROVIDER_SERVICE, "readFromInternalStorage", "Returning the file content without decryption for " + appendSdkNameAndVersion);
                                String sb3 = sb2.toString();
                                fileInputStream.close();
                                return sb3;
                            }
                            sb2.append((char) read);
                        } catch (Throwable th2) {
                            try {
                                bufferedReader.close();
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                            throw th2;
                        }
                    }
                } catch (Throwable th4) {
                    try {
                        inputStreamReader.close();
                    } catch (Throwable th5) {
                        th4.addSuppressed(th5);
                    }
                    throw th4;
                }
            } catch (Throwable th6) {
                try {
                    fileInputStream.close();
                } catch (Throwable th7) {
                    th6.addSuppressed(th7);
                }
                throw th6;
            }
        } catch (Exception e10) {
            sdkTracker.trackException(LogCategory.ACTION, LogSubCategory.Action.SYSTEM, Labels.System.FILE_PROVIDER_SERVICE, "read from internal storage failed", e10);
            return null;
        }
    }

    private void updateFallback(@NonNull Context context, String str, String str2) {
        Exception exc;
        SdkTracker sdkTracker;
        String str3;
        if (str2.endsWith("jsa") && isFilePresent(context, str2)) {
            this.juspayServices.sdkDebug(LOG_TAG, "updateFallback: starting" + str2 + "  " + str);
            try {
                String md5 = EncryptionHelper.md5(decryptGunzipInternalStorage(context, str2));
                JSONObject jSONObject = new JSONObject(KeyValueStore.read(this.juspayServices, PaymentConstants.JP_BLOCKED_HASH, "{}"));
                this.juspayServices.sdkDebug(LOG_TAG, "updateFallback: got the blocked hash");
                if (jSONObject.has(str)) {
                    this.juspayServices.sdkDebug(LOG_TAG, "updateFallback: got the file name " + str);
                    JSONObject jSONObject2 = jSONObject.getJSONObject(str);
                    if (jSONObject2.has("latest_hash") && jSONObject2.getString("latest_hash").equals(md5)) {
                        return;
                    }
                    this.juspayServices.sdkDebug(LOG_TAG, "updateFallback: wonderful.. copying to the fallback");
                    copyFile(context, str2, "fb/".concat(str2));
                    jSONObject2.remove("latest_hash");
                    jSONObject.put(str, jSONObject2);
                    KeyValueStore.write(this.juspayServices, PaymentConstants.JP_BLOCKED_HASH, jSONObject.toString());
                } else {
                    copyFile(context, str2, "fb/".concat(str2));
                    this.juspayServices.sdkDebug(LOG_TAG, "updateFallback: we didn;t get the file name from blocked hash ".concat(str2));
                    this.juspayServices.sdkDebug(LOG_TAG, "updateFallback: wonderful.. copying to the fallback");
                }
                this.juspayServices.sdkDebug(LOG_TAG, "updateFallback: file copied");
            } catch (FileNotFoundException e10) {
                exc = e10;
                sdkTracker = this.juspayServices.getSdkTracker();
                str3 = "File not found: ";
                sdkTracker.trackException(LogCategory.ACTION, LogSubCategory.Action.SYSTEM, Labels.HyperSdk.AUTO_FALLBACK, str3.concat(str2), exc);
            } catch (Exception e11) {
                exc = e11;
                sdkTracker = this.juspayServices.getSdkTracker();
                str3 = "Exception: ";
                sdkTracker.trackException(LogCategory.ACTION, LogSubCategory.Action.SYSTEM, Labels.HyperSdk.AUTO_FALLBACK, str3.concat(str2), exc);
            }
        }
    }

    private boolean writeToFile(@NonNull Context context, String str, byte[] bArr, boolean z10) {
        Exception exc;
        String str2;
        String appendSdkNameAndVersion = appendSdkNameAndVersion(str);
        updateFallback(context, str, appendSdkNameAndVersion);
        deleteFileFromCache(appendSdkNameAndVersion);
        SdkTracker sdkTracker = this.juspayServices.getSdkTracker();
        try {
            createJuspayDir(context);
            createRequiredDir(context, appendSdkNameAndVersion);
            if (z10) {
                createCertDir(context);
            }
            FileOutputStream fileOutputStream = new FileOutputStream(getFileFromInternalStorage(context, appendSdkNameAndVersion));
            try {
                fileOutputStream.write(bArr);
                fileOutputStream.close();
                return true;
            } catch (Throwable th2) {
                try {
                    fileOutputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (FileNotFoundException e10) {
            exc = e10;
            str2 = "File not found: ";
            sdkTracker.trackException(LogCategory.ACTION, LogSubCategory.Action.SYSTEM, Labels.System.FILE_PROVIDER_SERVICE, a.f(str2, appendSdkNameAndVersion), exc);
            return false;
        } catch (IOException e11) {
            exc = e11;
            str2 = "IOException: ";
            sdkTracker.trackException(LogCategory.ACTION, LogSubCategory.Action.SYSTEM, Labels.System.FILE_PROVIDER_SERVICE, a.f(str2, appendSdkNameAndVersion), exc);
            return false;
        } catch (Exception e12) {
            exc = e12;
            str2 = "Exception: ";
            sdkTracker.trackException(LogCategory.ACTION, LogSubCategory.Action.SYSTEM, Labels.System.FILE_PROVIDER_SERVICE, a.f(str2, appendSdkNameAndVersion), exc);
            return false;
        }
    }

    public void addToFileCacheWhiteList(String str) {
        this.fileCacheWhiteList.add(str);
    }

    public String appendSdkNameAndVersion(String str) {
        SdkInfo sdkInfo = this.juspayServices.getSdkInfo();
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf > 0 && lastIndexOf < str.length() - 1) {
            String substring = str.substring(0, lastIndexOf);
            String substring2 = str.substring(lastIndexOf);
            StringBuilder r10 = e.r(substring, "_");
            r10.append(sdkInfo.getSdkName());
            r10.append("_");
            r10.append(sdkInfo.getSdkVersion());
            r10.append(substring2);
            return r10.toString();
        }
        StringBuilder r11 = e.r(str, "_");
        r11.append(sdkInfo.getSdkName());
        r11.append("_");
        r11.append(sdkInfo.getSdkVersion());
        return r11.toString();
    }

    public byte[] decryptGunzipAssetFile(@NonNull Context context, String str) {
        SdkTracker sdkTracker = this.juspayServices.getSdkTracker();
        byte[] bArr = new byte[0];
        try {
            bArr = getAssetFileAsByte(context, str);
        } catch (Exception e10) {
            sdkTracker.trackException(LogCategory.ACTION, LogSubCategory.Action.SYSTEM, Labels.System.FILE_PROVIDER_SERVICE, d.k("Exception in reading ", str, " from assets"), e10);
        }
        return EncryptionHelper.decryptThenGunzip(bArr, context.getResources().getString(R.string.juspay_encryption_version));
    }

    public byte[] decryptGunzipInternalStorage(@NonNull Context context, String str) {
        SdkTracker sdkTracker = this.juspayServices.getSdkTracker();
        try {
            byte[] internalStorageFileAsByte = getInternalStorageFileAsByte(context, str);
            this.juspayServices.sdkDebug(LOG_TAG, "Read Encrypted file from internalStorage - " + str + " with encrypted hash - " + EncryptionHelper.md5(internalStorageFileAsByte));
            return EncryptionHelper.decryptThenGunzip(internalStorageFileAsByte, context.getResources().getString(R.string.juspay_encryption_version));
        } catch (FileNotFoundException e10) {
            this.juspayServices.sdkDebug(LOG_TAG, "No File to decrypt in internal storage: " + str);
            throw e10;
        } catch (Exception e11) {
            sdkTracker.trackException(LogCategory.ACTION, LogSubCategory.Action.SYSTEM, Labels.System.FILE_PROVIDER_SERVICE, d.k("Exception in reading ", str, " from internal storage"), e11);
            return null;
        }
    }

    public boolean deleteFileFromInternalStorage(Context context, String str) {
        SdkTracker sdkTracker = this.juspayServices.getSdkTracker();
        RemoteAssetService remoteAssetService = this.juspayServices.getRemoteAssetService();
        File fileFromInternalStorage = getFileFromInternalStorage(context, str);
        if (!fileFromInternalStorage.exists()) {
            JuspayLogger.e(LOG_TAG, str + " not found");
            return false;
        }
        this.juspayServices.sdkDebug(LOG_TAG, "Deleting " + str + " from internal storage");
        JuspayLogger.e(LOG_TAG, "FILE CORRUPTED. DISABLING SDK");
        sdkTracker.trackAction(LogSubCategory.Action.SYSTEM, LogLevel.WARNING, Labels.System.FILE_PROVIDER_SERVICE, "file_corrupted", str);
        try {
            remoteAssetService.resetMetadata(str.replace(".zip", ".jsa"));
        } catch (Exception e10) {
            sdkTracker.trackException(LogCategory.ACTION, LogSubCategory.Action.SYSTEM, Labels.System.FILE_PROVIDER_SERVICE, "Error while resetting etag", e10);
        }
        return fileFromInternalStorage.delete();
    }

    public byte[] getAssetFileAsByte(@NonNull Context context, String str) {
        SdkTracker sdkTracker = this.juspayServices.getSdkTracker();
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                InputStream open = context.getResources().getAssets().open("juspay/" + str);
                try {
                    readFromInputStream(byteArrayOutputStream, open);
                    if (open != null) {
                        open.close();
                    }
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                    return byteArray;
                } finally {
                }
            } catch (Throwable th2) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (FileNotFoundException e10) {
            sdkTracker.trackException(LogCategory.ACTION, LogSubCategory.Action.SYSTEM, Labels.System.FILE_PROVIDER_SERVICE, a.f("Could not read ", str), e10);
            throw new RuntimeException(e10);
        } catch (IOException e11) {
            sdkTracker.trackException(LogCategory.ACTION, LogSubCategory.Action.SYSTEM, Labels.System.FILE_PROVIDER_SERVICE, a.f("Could not read ", str), e11);
            deleteFileFromInternalStorage(context, str);
            throw new RuntimeException(e11);
        } catch (Exception e12) {
            sdkTracker.trackException(LogCategory.ACTION, LogSubCategory.Action.SYSTEM, Labels.System.FILE_PROVIDER_SERVICE, a.f("Exception: Could not read ", str), e12);
            deleteFileFromInternalStorage(context, str);
            return new byte[0];
        }
    }

    public byte[] getInternalStorageFileAsByte(Context context, String str) {
        SdkTracker sdkTracker = this.juspayServices.getSdkTracker();
        RemoteAssetService remoteAssetService = this.juspayServices.getRemoteAssetService();
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                FileInputStream fileInputStream = new FileInputStream(getFileFromInternalStorage(context, str));
                try {
                    readFromInputStream(byteArrayOutputStream, fileInputStream);
                    fileInputStream.close();
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                    return byteArray;
                } finally {
                }
            } catch (Throwable th2) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (FileNotFoundException e10) {
            this.juspayServices.sdkDebug(LOG_TAG, "File not found " + str);
            try {
                remoteAssetService.resetMetadata(str.replace(".zip", ".jsa"));
            } catch (JSONException unused) {
                sdkTracker.trackException(LogCategory.ACTION, LogSubCategory.Action.SYSTEM, Labels.System.FILE_PROVIDER_SERVICE, a.f("Couldn't reset ", str), e10);
            }
            throw e10;
        } catch (IOException e11) {
            sdkTracker.trackException(LogCategory.ACTION, LogSubCategory.Action.SYSTEM, Labels.System.FILE_PROVIDER_SERVICE, a.f("Could not read ", str), e11);
            deleteFileFromInternalStorage(context, str);
            throw new RuntimeException(e11);
        } catch (Exception e12) {
            sdkTracker.trackException(LogCategory.ACTION, LogSubCategory.Action.SYSTEM, Labels.System.FILE_PROVIDER_SERVICE, a.f("Exception: Could not read ", str), e12);
            deleteFileFromInternalStorage(context, str);
            throw new RuntimeException(e12);
        }
    }

    public boolean isFilePresent(@NonNull Context context, String str) {
        boolean z10 = true;
        if (new File(context.getDir("juspay", 0), appendSdkNameAndVersion(str)).exists()) {
            return true;
        }
        try {
            InputStream open = context.getResources().getAssets().open("juspay/" + str);
            if (open == null) {
                z10 = false;
            }
            if (open != null) {
                open.close();
            }
            return z10;
        } catch (IOException unused) {
            return false;
        }
    }

    public String readFromCache(String str) {
        if (!isFileCached(str)) {
            return null;
        }
        String str2 = this.fileCache.get(str);
        this.juspayServices.sdkDebug(LOG_TAG, "Returning cached value of the file: " + str);
        this.juspayServices.sdkDebug(LOG_TAG, "Cached: " + str2);
        return str2;
    }

    @Override // in.juspay.hyper.core.FileProviderInterface
    @NonNull
    public String readFromFile(@NonNull Context context, String str) {
        return readFromFile(context, str, true);
    }

    @Override // in.juspay.hyper.core.FileProviderInterface
    public void renewFile(@NonNull String str, @NonNull String str2, long j10) {
        this.juspayServices.getRemoteAssetService().renewFile(this.juspayServices.getContext(), str, null, str2, j10);
    }

    public boolean updateCertificate(@NonNull Context context, String str, byte[] bArr) {
        return writeToFile(context, str, bArr, true);
    }

    public boolean updateFile(@NonNull Context context, String str, byte[] bArr) {
        return writeToFile(context, str, bArr, false);
    }

    public String writeFileToDisk(@NonNull Context context, String str, String str2) {
        try {
            File file = new File(context.getExternalFilesDirs(Environment.DIRECTORY_DOWNLOADS)[0].getAbsolutePath());
            file.mkdirs();
            File file2 = new File(file, str2);
            file2.createNewFile();
            if (!file2.exists()) {
                JuspayLogger.d(LOG_TAG, "Exception in creating the file");
                return String.format("{\"error\":\"true\",\"data\":\"%s\"}", "unknown_error::Exception in creating the file");
            }
            FileWriter fileWriter = new FileWriter(file2);
            fileWriter.write(str);
            fileWriter.flush();
            fileWriter.close();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("error", "false");
            jSONObject.put("data", file);
            return jSONObject.toString();
        } catch (Exception e10) {
            JuspayLogger.d(LOG_TAG, "Exception in downloading the file :" + e10);
            return String.format("{\"error\":\"true\",\"data\":\"%s\"}", "unknown_error::" + e10);
        }
    }

    public String readFromFile(@NonNull Context context, String str, boolean z10) {
        String readFromCache = z10 ? readFromCache(str) : null;
        if (readFromCache == null) {
            readFromCache = readFromInternalStorage(context, str);
        }
        if (readFromCache == null) {
            readFromCache = readFromAssets(context, str);
        }
        if (this.fileCacheWhiteList.contains(str) && readFromCache != null) {
            cacheFile(str, readFromCache);
        }
        return readFromCache == null ? HttpUrl.FRAGMENT_ENCODE_SET : readFromCache;
    }
}
