package com.appsflyer.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class AFb1gSDK implements AFb1bSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static final int AFInAppEventParameterName;
    private static int AFLogger = 0;

    /* renamed from: d, reason: collision with root package name */
    private static char[] f8399d = null;
    private static int force = 1;
    private final AFd1kSDK unregisterClient;
    private List<String> valueOf = new ArrayList();
    private boolean AFInAppEventType = true;

    @NonNull
    private final Map<String, Object> values = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    private boolean f8400e = true ^ AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.DPM, false);
    private int AFKeystoreWrapper = 0;
    private boolean registerClient = false;

    static {
        AFLogger();
        AFInAppEventParameterName = 98166;
        int i10 = force + 31;
        AFLogger = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 22 / 0;
        }
    }

    public AFb1gSDK(AFd1kSDK aFd1kSDK) {
        this.unregisterClient = aFd1kSDK;
    }

    public static void AFLogger() {
        f8399d = new char[]{54246, 54193, 54207, 54197, 54204};
    }

    private static void a(int[] iArr, String str, boolean z10, Object[] objArr) {
        String str2 = str;
        byte[] bArr = str2;
        if (str2 != null) {
            int i10 = $10 + 79;
            $11 = i10 % 128;
            int i11 = i10 % 2;
            bArr = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr2 = bArr;
        AFj1dSDK aFj1dSDK = new AFj1dSDK();
        int i12 = iArr[0];
        int i13 = iArr[1];
        int i14 = iArr[2];
        int i15 = iArr[3];
        char[] cArr = f8399d;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i16 = 0; i16 < length; i16++) {
                cArr2[i16] = (char) (cArr[i16] ^ 4656066899128210390L);
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i13];
        System.arraycopy(cArr, i12, cArr3, 0, i13);
        if (bArr2 != null) {
            int i17 = $11 + 9;
            $10 = i17 % 128;
            int i18 = i17 % 2;
            char[] cArr4 = new char[i13];
            aFj1dSDK.AFKeystoreWrapper = 0;
            char c10 = 0;
            while (true) {
                int i19 = aFj1dSDK.AFKeystoreWrapper;
                if (i19 >= i13) {
                    break;
                }
                int i20 = $11 + 59;
                $10 = i20 % 128;
                if (i20 % 2 == 0 ? bArr2[i19] == 1 : bArr2[i19] == 0) {
                    cArr4[i19] = (char) (((cArr3[i19] * 2) + 1) - c10);
                } else {
                    cArr4[i19] = (char) ((cArr3[i19] * 2) - c10);
                }
                c10 = cArr4[i19];
                aFj1dSDK.AFKeystoreWrapper = i19 + 1;
            }
            cArr3 = cArr4;
        }
        if (i15 > 0) {
            char[] cArr5 = new char[i13];
            System.arraycopy(cArr3, 0, cArr5, 0, i13);
            int i21 = i13 - i15;
            System.arraycopy(cArr5, 0, cArr3, i21, i15);
            System.arraycopy(cArr5, i15, cArr3, 0, i21);
        }
        if (z10) {
            char[] cArr6 = new char[i13];
            aFj1dSDK.AFKeystoreWrapper = 0;
            while (true) {
                int i22 = aFj1dSDK.AFKeystoreWrapper;
                if (i22 >= i13) {
                    break;
                }
                cArr6[i22] = cArr3[(i13 - i22) - 1];
                aFj1dSDK.AFKeystoreWrapper = i22 + 1;
            }
            int i23 = $11 + 19;
            $10 = i23 % 128;
            int i24 = i23 % 2;
            cArr3 = cArr6;
        }
        if (i14 > 0) {
            aFj1dSDK.AFKeystoreWrapper = 0;
            int i25 = $10 + 123;
            $11 = i25 % 128;
            int i26 = i25 % 2;
            while (true) {
                int i27 = aFj1dSDK.AFKeystoreWrapper;
                if (i27 >= i13) {
                    break;
                }
                int i28 = $11 + 107;
                $10 = i28 % 128;
                int i29 = i28 % 2;
                cArr3[i27] = (char) (cArr3[i27] - iArr[2]);
                aFj1dSDK.AFKeystoreWrapper = i27 + 1;
            }
        }
        objArr[0] = new String(cArr3);
    }

    private boolean afInfoLog() {
        int i10 = AFLogger + 107;
        force = i10 % 128;
        if (i10 % 2 != 0) {
            boolean AFInAppEventType = this.unregisterClient.valueOf().AFInAppEventType("participantInProxy");
            int i11 = AFLogger + 121;
            force = i11 % 128;
            if (i11 % 2 == 0) {
                int i12 = 69 / 0;
            }
            return AFInAppEventType;
        }
        this.unregisterClient.valueOf().AFInAppEventType("participantInProxy");
        throw null;
    }

    private static String d() {
        int i10 = force;
        int i11 = i10 + 35;
        AFLogger = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 8 / 0;
        }
        int i13 = i10 + 63;
        AFLogger = i13 % 128;
        int i14 = i13 % 2;
        return "6.14.0";
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002f, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x001f, code lost:
    
        if (r4.registerClient == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x001b, code lost:
    
        if (r4.AFInAppEventType == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0016, code lost:
    
        if (r4.AFInAppEventType == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0021, code lost:
    
        r2 = r2 + 33;
        com.appsflyer.internal.AFb1gSDK.force = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002a, code lost:
    
        if ((r2 % 2) != 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002c, code lost:
    
        r2 = 48 / 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean force() {
        /*
            r4 = this;
            boolean r0 = r4.f8400e
            r1 = 0
            if (r0 == 0) goto L30
            int r0 = com.appsflyer.internal.AFb1gSDK.force
            int r0 = r0 + 73
            int r2 = r0 % 128
            com.appsflyer.internal.AFb1gSDK.AFLogger = r2
            int r0 = r0 % 2
            if (r0 == 0) goto L19
            boolean r0 = r4.AFInAppEventType
            r3 = 78
            int r3 = r3 / r1
            if (r0 != 0) goto L21
            goto L1d
        L19:
            boolean r0 = r4.AFInAppEventType
            if (r0 != 0) goto L21
        L1d:
            boolean r0 = r4.registerClient
            if (r0 == 0) goto L30
        L21:
            int r2 = r2 + 33
            int r0 = r2 % 128
            com.appsflyer.internal.AFb1gSDK.force = r0
            int r2 = r2 % 2
            r0 = 1
            if (r2 != 0) goto L2f
            r2 = 48
            int r2 = r2 / r1
        L2f:
            return r0
        L30:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFb1gSDK.force():boolean");
    }

    private void i() {
        int i10 = AFLogger + 1;
        force = i10 % 128;
        if (i10 % 2 != 0) {
            this.unregisterClient.valueOf().AFKeystoreWrapper("participantInProxy");
            int i11 = force + 23;
            AFLogger = i11 % 128;
            int i12 = i11 % 2;
            return;
        }
        this.unregisterClient.valueOf().AFKeystoreWrapper("participantInProxy");
        throw null;
    }

    private synchronized void registerClient() {
        try {
            int i10 = AFLogger + 77;
            int i11 = i10 % 128;
            force = i11;
            if (i10 % 2 != 0) {
                if (this.registerClient) {
                    int i12 = i11 + 59;
                    AFLogger = i12 % 128;
                    if (i12 % 2 == 0) {
                        return;
                    } else {
                        throw null;
                    }
                }
                this.registerClient = true;
                try {
                    AFInAppEventParameterName("r_debugging_on", new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ", Locale.ENGLISH).format(Long.valueOf(System.currentTimeMillis())), new String[0]);
                    return;
                } catch (Throwable th2) {
                    AFLogger.INSTANCE.e(AFg1aSDK.PROXY, "Error while starting remote debugger", th2, true, true, true);
                    return;
                }
            }
            throw null;
        } catch (Throwable th3) {
            throw th3;
        }
        throw th3;
    }

    private static float unregisterClient() {
        float nextFloat = new Random().nextFloat();
        int i10 = force + 37;
        AFLogger = i10 % 128;
        if (i10 % 2 == 0) {
            return nextFloat;
        }
        throw null;
    }

    @NonNull
    private synchronized Map<String, Object> v() {
        Map<String, Object> map;
        int i10 = force + 125;
        AFLogger = i10 % 128;
        if (i10 % 2 == 0) {
            this.values.put("data", this.valueOf);
            w();
            map = this.values;
            int i11 = force + 61;
            AFLogger = i11 % 128;
            int i12 = i11 % 2;
        } else {
            this.values.put("data", this.valueOf);
            w();
            throw null;
        }
        return map;
    }

    private synchronized void w() {
        this.valueOf = new ArrayList();
        this.AFKeystoreWrapper = 0;
        int i10 = force + 43;
        AFLogger = i10 % 128;
        int i11 = i10 % 2;
    }

    @Override // com.appsflyer.internal.AFb1bSDK
    public final void AFInAppEventParameterName(String str, String... strArr) {
        int i10 = AFLogger + 67;
        force = i10 % 128;
        int i11 = i10 % 2;
        AFInAppEventParameterName("public_api_call", str, strArr);
        int i12 = AFLogger + 89;
        force = i12 % 128;
        if (i12 % 2 == 0) {
            int i13 = 74 / 0;
        }
    }

    @Override // com.appsflyer.internal.AFb1bSDK
    public final synchronized void AFInAppEventType() {
        int i10 = force + 49;
        int i11 = i10 % 128;
        AFLogger = i11;
        int i12 = i10 % 2;
        if (!this.registerClient) {
            int i13 = i11 + 83;
            force = i13 % 128;
            int i14 = i13 % 2;
            if (!this.AFInAppEventType) {
                return;
            }
        }
        this.registerClient = false;
        this.AFInAppEventType = false;
        try {
            AFInAppEventParameterName("r_debugging_off", new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ", Locale.ENGLISH).format(Long.valueOf(System.currentTimeMillis())), new String[0]);
        } catch (Throwable th2) {
            AFLogger.INSTANCE.e(AFg1aSDK.PROXY, "Error while stopping remote debugger", th2, true, true, true);
        }
    }

    @Override // com.appsflyer.internal.AFb1bSDK
    public final void AFKeystoreWrapper(String str, int i10, String str2) {
        int i11 = AFLogger + 77;
        force = i11 % 128;
        int i12 = i11 % 2;
        AFInAppEventParameterName("server_response", str, String.valueOf(i10), str2);
        int i13 = AFLogger + 43;
        force = i13 % 128;
        if (i13 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.internal.AFb1bSDK
    public final boolean e() {
        int i10 = force;
        int i11 = i10 + 15;
        AFLogger = i11 % 128;
        int i12 = i11 % 2;
        boolean z10 = this.registerClient;
        int i13 = i10 + 37;
        AFLogger = i13 % 128;
        if (i13 % 2 != 0) {
            int i14 = 31 / 0;
        }
        return z10;
    }

    @Override // com.appsflyer.internal.AFb1bSDK
    public final synchronized void valueOf() {
        try {
            int i10 = force + 87;
            AFLogger = i10 % 128;
            if (i10 % 2 != 0) {
                this.values.clear();
                this.valueOf.clear();
            } else {
                this.values.clear();
                this.valueOf.clear();
            }
            this.AFKeystoreWrapper = 0;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.appsflyer.internal.AFb1bSDK
    public final boolean values() {
        int i10;
        boolean AFInAppEventParameterName2 = AFInAppEventParameterName(AFInAppEventType(this.unregisterClient.registerClient().valueOf.valueOf), AFInAppEventType(this.unregisterClient.registerClient().valueOf.values));
        if (AFInAppEventParameterName2) {
            int i11 = AFLogger + 103;
            force = i11 % 128;
            int i12 = i11 % 2;
            registerClient();
            i10 = force + 95;
        } else {
            AFKeystoreWrapper();
            AFInAppEventType();
            i10 = force + 91;
        }
        AFLogger = i10 % 128;
        int i13 = i10 % 2;
        return AFInAppEventParameterName2;
    }

    @Override // com.appsflyer.internal.AFb1bSDK
    public final void AFInAppEventParameterName() {
        int i10 = force + 81;
        int i11 = i10 % 128;
        AFLogger = i11;
        int i12 = i10 % 2;
        this.f8400e = false;
        int i13 = i11 + 57;
        force = i13 % 128;
        if (i13 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.internal.AFb1bSDK
    public final void AFKeystoreWrapper(String str, String str2) {
        int i10 = AFLogger + 41;
        force = i10 % 128;
        int i11 = i10 % 2;
        AFInAppEventParameterName(null, str, str2);
        int i12 = AFLogger + 51;
        force = i12 % 128;
        int i13 = i12 % 2;
    }

    private Map<String, Object> AFInAppEventParameterName(String str, PackageManager packageManager) {
        int i10 = AFLogger + 63;
        force = i10 % 128;
        if (i10 % 2 != 0) {
            valueOf(str, packageManager, this.unregisterClient.i(), this.unregisterClient.getLevel());
            return v();
        }
        valueOf(str, packageManager, this.unregisterClient.i(), this.unregisterClient.getLevel());
        v();
        throw null;
    }

    @Override // com.appsflyer.internal.AFb1bSDK
    public final synchronized void AFKeystoreWrapper() {
        int i10 = force + 65;
        AFLogger = i10 % 128;
        int i11 = i10 % 2;
        this.AFInAppEventType = false;
        valueOf();
        w();
        int i12 = AFLogger + 41;
        force = i12 % 128;
        int i13 = i12 % 2;
    }

    private synchronized void AFInAppEventType(String str, String str2, String str3) {
        int i10 = AFLogger + 33;
        force = i10 % 128;
        int i11 = i10 % 2;
        try {
            Map<String, Object> map = this.values;
            Object[] objArr = new Object[1];
            a(new int[]{0, 5, 0, 3}, "\u0001\u0001\u0000\u0000\u0000", false, objArr);
            map.put(((String) objArr[0]).intern(), Build.BRAND);
            this.values.put("model", Build.MODEL);
            this.values.put("platform", "Android");
            this.values.put("platform_version", Build.VERSION.RELEASE);
            if (str != null) {
                int i12 = force + 121;
                AFLogger = i12 % 128;
                int i13 = i12 % 2;
                if (str.length() > 0) {
                    int i14 = AFLogger + 43;
                    force = i14 % 128;
                    if (i14 % 2 == 0) {
                        this.values.put("advertiserId", str);
                        throw null;
                    }
                    this.values.put("advertiserId", str);
                }
            }
            if (str2 != null) {
                int i15 = AFLogger + 59;
                force = i15 % 128;
                int i16 = i15 % 2;
                if (str2.length() > 0) {
                    this.values.put("imei", str2);
                }
            }
            if (str3 != null && str3.length() > 0) {
                this.values.put("android_id", str3);
            }
        } catch (Throwable unused) {
        }
    }

    private synchronized void AFKeystoreWrapper(String str, String str2, String str3, String str4) {
        try {
            this.values.put("sdk_version", str);
            if (str2 != null && str2.length() > 0) {
                this.values.put("devkey", str2);
            }
            if (str3 != null && str3.length() > 0) {
                try {
                    int i10 = AFLogger + 31;
                    force = i10 % 128;
                    if (i10 % 2 == 0) {
                        this.values.put("originalAppsFlyerId", str3);
                        int i11 = 19 / 0;
                    } else {
                        this.values.put("originalAppsFlyerId", str3);
                    }
                } finally {
                }
            }
            if (str4 != null && str4.length() > 0) {
                int i12 = force + 87;
                AFLogger = i12 % 128;
                int i13 = i12 % 2;
                this.values.put("uid", str4);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.appsflyer.internal.AFb1bSDK
    public final void valueOf(String str, String str2) {
        int i10 = AFLogger + 97;
        force = i10 % 128;
        if (i10 % 2 == 0) {
            String[] strArr = new String[1];
            strArr[1] = str2;
            AFInAppEventParameterName("server_request", str, strArr);
        } else {
            AFInAppEventParameterName("server_request", str, str2);
        }
        int i11 = force + 65;
        AFLogger = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
    }

    private synchronized void AFInAppEventParameterName(String str, String str2, String str3, String str4) {
        int i10 = force + 45;
        AFLogger = i10 % 128;
        int i11 = i10 % 2;
        if (str != null) {
            try {
                if (str.length() > 0) {
                    int i12 = force + 21;
                    AFLogger = i12 % 128;
                    if (i12 % 2 == 0) {
                        this.values.put("app_id", str);
                        int i13 = AFLogger + 21;
                        force = i13 % 128;
                        int i14 = i13 % 2;
                    } else {
                        this.values.put("app_id", str);
                        throw null;
                    }
                }
            } catch (Throwable unused) {
                return;
            }
        }
        if (str2 != null) {
            int i15 = AFLogger + 107;
            force = i15 % 128;
            if (i15 % 2 != 0) {
                if (str2.length() > 0) {
                    this.values.put("app_version", str2);
                }
            } else {
                throw null;
            }
        }
        if (str3 != null && str3.length() > 0) {
            this.values.put(AppsFlyerProperties.CHANNEL, str3);
        }
        if (str4 != null) {
            int i16 = AFLogger + 7;
            force = i16 % 128;
            int i17 = i16 % 2;
            if (str4.length() > 0) {
                this.values.put("preInstall", str4);
            }
        }
    }

    private synchronized void valueOf(String str, PackageManager packageManager, AFg1wSDK aFg1wSDK, AFd1pSDK aFd1pSDK) {
        try {
            AppsFlyerProperties appsFlyerProperties = AppsFlyerProperties.getInstance();
            String string = appsFlyerProperties.getString("remote_debug_static_data");
            this.values.clear();
            if (string != null) {
                try {
                    this.values.putAll(AFa1oSDK.AFInAppEventType(new JSONObject(string)));
                    int i10 = AFLogger + 121;
                    force = i10 % 128;
                    int i11 = i10 % 2;
                } catch (Throwable unused) {
                }
            } else {
                AFb1vSDK AFKeystoreWrapper = AFb1vSDK.AFKeystoreWrapper();
                AFh1uSDK aFh1uSDK = AFb1vSDK.AFKeystoreWrapper().AFInAppEventParameterName().AFInAppEventType().AFInAppEventType.AFLogger;
                String str2 = null;
                AFb1zSDK aFb1zSDK = aFh1uSDK != null ? new AFb1zSDK(aFh1uSDK.values, aFh1uSDK.registerClient) : null;
                if (aFb1zSDK != null) {
                    int i12 = force + 19;
                    AFLogger = i12 % 128;
                    int i13 = i12 % 2;
                    str2 = aFb1zSDK.AFInAppEventParameterName;
                }
                AFInAppEventType(str2, aFg1wSDK.unregisterClient, aFd1pSDK.AFInAppEventType);
                StringBuilder sb2 = new StringBuilder("6.14.0.");
                sb2.append(AFb1vSDK.values);
                AFKeystoreWrapper(sb2.toString(), AFKeystoreWrapper.AFInAppEventParameterName().i().AFLogger, appsFlyerProperties.getString("KSAppsFlyerId"), appsFlyerProperties.getString("uid"));
                try {
                    AFInAppEventParameterName(str, String.valueOf(packageManager.getPackageInfo(str, 0).versionCode), appsFlyerProperties.getString(AppsFlyerProperties.CHANNEL), appsFlyerProperties.getString("preInstallName"));
                } catch (Throwable unused2) {
                }
                appsFlyerProperties.set("remote_debug_static_data", new JSONObject(this.values).toString());
            }
            this.values.put("launch_counter", String.valueOf(this.unregisterClient.AFInAppEventType().AFKeystoreWrapper.valueOf("appsFlyerCount", 0)));
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.appsflyer.internal.AFb1bSDK
    public final void values(String str, PackageManager packageManager) {
        int i10 = force + 33;
        AFLogger = i10 % 128;
        int i11 = i10 % 2;
        try {
            AFe1wSDK AFKeystoreWrapper = this.unregisterClient.AFInAppEventParameterName().AFKeystoreWrapper(AFInAppEventParameterName(str, packageManager), this.unregisterClient.i().AFLogger);
            if (AFKeystoreWrapper == null) {
                AFLogger.afErrorLogForExcManagerOnly("could not send null proxy data", new NullPointerException("request was null"));
                return;
            }
            this.unregisterClient.values().execute(new a(AFKeystoreWrapper, 0));
            int i12 = force + 33;
            AFLogger = i12 % 128;
            int i13 = i12 % 2;
        } catch (Throwable th2) {
            AFLogger.afErrorLogForExcManagerOnly("could not send proxy data", th2);
        }
    }

    private boolean AFKeystoreWrapper(@NonNull AFh1hSDK aFh1hSDK, AFh1hSDK aFh1hSDK2) {
        int i10 = AFLogger + 25;
        force = i10 % 128;
        int i11 = i10 % 2;
        if (aFh1hSDK.equals(aFh1hSDK2)) {
            int i12 = force + 37;
            AFLogger = i12 % 128;
            if (i12 % 2 == 0) {
                return afInfoLog();
            }
            afInfoLog();
            throw null;
        }
        boolean values = values(aFh1hSDK.AFInAppEventType);
        AFKeystoreWrapper(values);
        return values;
    }

    private static boolean AFInAppEventType(String str) {
        int i10 = force + 65;
        AFLogger = i10 % 128;
        int i11 = i10 % 2;
        if (!(!AFc1tSDK.AFInAppEventType(str))) {
            return true;
        }
        new AFe1zSDK();
        boolean AFInAppEventType = AFe1zSDK.AFInAppEventType(d(), str);
        int i12 = AFLogger + 115;
        force = i12 % 128;
        int i13 = i12 % 2;
        return AFInAppEventType;
    }

    private synchronized void AFInAppEventParameterName(String str, String str2, String... strArr) {
        String obj;
        int i10 = AFLogger + 121;
        force = i10 % 128;
        int i11 = i10 % 2;
        if (force()) {
            int i12 = force + 35;
            AFLogger = i12 % 128;
            int i13 = i12 % 2;
            if (this.AFKeystoreWrapper < 98304) {
                try {
                    long currentTimeMillis = System.currentTimeMillis();
                    String join = TextUtils.join(", ", strArr);
                    if (str != null) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(currentTimeMillis);
                        sb2.append(" ");
                        sb2.append(Thread.currentThread().getId());
                        sb2.append(" _/AppsFlyer_6.14.0 [");
                        sb2.append(str);
                        sb2.append("] ");
                        sb2.append(str2);
                        sb2.append(" ");
                        sb2.append(join);
                        obj = sb2.toString();
                        int i14 = force + 99;
                        AFLogger = i14 % 128;
                        int i15 = i14 % 2;
                    } else {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(currentTimeMillis);
                        sb3.append(" ");
                        sb3.append(Thread.currentThread().getId());
                        sb3.append(" ");
                        sb3.append(str2);
                        sb3.append("/AppsFlyer_6.14.0 ");
                        sb3.append(join);
                        obj = sb3.toString();
                    }
                    int length = this.AFKeystoreWrapper + (obj.length() << 1);
                    int i16 = AFInAppEventParameterName;
                    boolean z10 = false;
                    if (length > i16) {
                        obj = obj.substring(0, (i16 - this.AFKeystoreWrapper) / 2);
                        z10 = true;
                    }
                    this.valueOf.add(obj);
                    this.AFKeystoreWrapper += obj.length() << 1;
                    if (z10) {
                        this.valueOf.add("+~+~ The limit has been exceeded, and no more data is available. +~+~");
                        this.AFKeystoreWrapper += 138;
                        int i17 = AFLogger + 17;
                        force = i17 % 128;
                        int i18 = i17 % 2;
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0018, code lost:
    
        if (r2 != null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r2 != null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001c, code lost:
    
        return r2.AFInAppEventType;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.appsflyer.internal.AFh1hSDK AFInAppEventType(com.appsflyer.internal.AFi1zSDK r2) {
        /*
            if (r2 == 0) goto L1d
            int r0 = com.appsflyer.internal.AFb1gSDK.AFLogger
            int r0 = r0 + 5
            int r1 = r0 % 128
            com.appsflyer.internal.AFb1gSDK.force = r1
            int r0 = r0 % 2
            if (r0 != 0) goto L16
            com.appsflyer.internal.AFh1gSDK r2 = r2.AFInAppEventParameterName
            r0 = 1
            int r0 = r0 / 0
            if (r2 == 0) goto L1d
            goto L1a
        L16:
            com.appsflyer.internal.AFh1gSDK r2 = r2.AFInAppEventParameterName
            if (r2 == 0) goto L1d
        L1a:
            com.appsflyer.internal.AFh1hSDK r2 = r2.AFInAppEventType
            return r2
        L1d:
            int r2 = com.appsflyer.internal.AFb1gSDK.AFLogger
            int r2 = r2 + 5
            int r0 = r2 % 128
            com.appsflyer.internal.AFb1gSDK.force = r0
            int r2 = r2 % 2
            r0 = 0
            if (r2 == 0) goto L2b
            return r0
        L2b:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFb1gSDK.AFInAppEventType(com.appsflyer.internal.AFi1zSDK):com.appsflyer.internal.AFh1hSDK");
    }

    private boolean AFKeystoreWrapper(String str) {
        if (AFc1tSDK.AFInAppEventType(str)) {
            int i10 = force + 85;
            AFLogger = i10 % 128;
            int i11 = i10 % 2;
            return true;
        }
        Context context = this.unregisterClient.AFInAppEventType().valueOf.AFKeystoreWrapper;
        boolean equals = str.equals(AFb1uSDK.AFInAppEventType(context, context.getPackageName()));
        int i12 = force + 47;
        AFLogger = i12 % 128;
        int i13 = i12 % 2;
        return equals;
    }

    @Override // com.appsflyer.internal.AFb1bSDK
    public final void values(Throwable th2) {
        String message;
        StackTraceElement[] stackTrace;
        Throwable cause = th2.getCause();
        String simpleName = th2.getClass().getSimpleName();
        if (cause == null) {
            int i10 = force + 57;
            AFLogger = i10 % 128;
            int i11 = i10 % 2;
            message = th2.getMessage();
        } else {
            message = cause.getMessage();
        }
        if (cause == null) {
            int i12 = force + 53;
            AFLogger = i12 % 128;
            if (i12 % 2 != 0) {
                stackTrace = th2.getStackTrace();
                int i13 = 26 / 0;
            } else {
                stackTrace = th2.getStackTrace();
            }
        } else {
            stackTrace = cause.getStackTrace();
            int i14 = force + 85;
            AFLogger = i14 % 128;
            int i15 = i14 % 2;
        }
        AFInAppEventParameterName("exception", simpleName, AFInAppEventParameterName(message, stackTrace));
    }

    private void AFKeystoreWrapper(boolean z10) {
        int i10 = force + 69;
        AFLogger = i10 % 128;
        if (i10 % 2 != 0) {
            this.unregisterClient.valueOf().valueOf("participantInProxy", z10);
            throw null;
        }
        this.unregisterClient.valueOf().valueOf("participantInProxy", z10);
        int i11 = force + 57;
        AFLogger = i11 % 128;
        int i12 = i11 % 2;
    }

    private static boolean values(float f10) {
        double d10 = f10;
        if (d10 >= 1.0d) {
            int i10 = AFLogger + 79;
            force = i10 % 128;
            int i11 = i10 % 2;
            return true;
        }
        if (d10 > 0.0d) {
            return unregisterClient() <= f10;
        }
        int i12 = force + 117;
        AFLogger = i12 % 128;
        int i13 = i12 % 2;
        return false;
    }

    private static String[] AFInAppEventParameterName(String str, StackTraceElement[] stackTraceElementArr) {
        int i10 = AFLogger;
        int i11 = i10 + 73;
        force = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
        if (stackTraceElementArr == null) {
            int i12 = i10 + 95;
            force = i12 % 128;
            if (i12 % 2 != 0) {
                return new String[]{str};
            }
            String[] strArr = new String[1];
            strArr[1] = str;
            return strArr;
        }
        String[] strArr2 = new String[stackTraceElementArr.length + 1];
        strArr2[0] = str;
        for (int i13 = 1; i13 < stackTraceElementArr.length; i13++) {
            strArr2[i13] = stackTraceElementArr[i13].toString();
        }
        return strArr2;
    }

    private synchronized boolean AFInAppEventParameterName(AFh1hSDK aFh1hSDK, AFh1hSDK aFh1hSDK2) {
        if (aFh1hSDK == null) {
            i();
            int i10 = AFLogger + 59;
            force = i10 % 128;
            int i11 = i10 % 2;
            return false;
        }
        if (!aFh1hSDK.AFInAppEventParameterName()) {
            int i12 = force + 93;
            AFLogger = i12 % 128;
            if (i12 % 2 == 0) {
                return false;
            }
            throw null;
        }
        if (!(!(this.unregisterClient.AFInAppEventType().AFKeystoreWrapper.valueOf("appsFlyerCount", 0) > aFh1hSDK.AFInAppEventParameterName))) {
            int i13 = force + 121;
            AFLogger = i13 % 128;
            return i13 % 2 != 0 ? false : false;
        }
        if (!AFKeystoreWrapper(aFh1hSDK, aFh1hSDK2)) {
            return false;
        }
        if (!AFKeystoreWrapper(aFh1hSDK.valueOf)) {
            int i14 = AFLogger + 13;
            int i15 = i14 % 128;
            force = i15;
            boolean z10 = i14 % 2 == 0;
            int i16 = i15 + 113;
            AFLogger = i16 % 128;
            int i17 = i16 % 2;
            return z10;
        }
        if (AFInAppEventType(aFh1hSDK.AFKeystoreWrapper)) {
            return true;
        }
        int i18 = AFLogger + 79;
        force = i18 % 128;
        return i18 % 2 == 0 ? false : false;
    }
}
