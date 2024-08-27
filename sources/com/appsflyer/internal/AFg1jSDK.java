package com.appsflyer.internal;

import android.annotation.SuppressLint;
import android.app.UiModeManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.os.SystemClock;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.TypedValue;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.AFd1vSDK;
import in.juspay.hyper.constants.LogSubCategory;
import in.juspay.hypersdk.core.PaymentConstants;
import java.io.File;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.w;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import ut.l;
import vt.p0;

/* loaded from: classes.dex */
public final class AFg1jSDK implements AFg1mSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int afErrorLog = 0;
    private static int afVerboseLog = 1;

    @NotNull
    private final AFd1vSDK AFInAppEventParameterName;

    @NotNull
    private final AFa1bSDK AFInAppEventType;

    @NotNull
    private final Context AFKeystoreWrapper;

    @NotNull
    private final AFd1qSDK AFLogger;

    @NotNull
    private final AFd1pSDK afInfoLog;

    @NotNull
    private final ut.g afRDLog;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final AFg1wSDK f8489d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final AFh1wSDK f8490e;

    @NotNull
    private final AFd1lSDK force;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final ut.g f8491i;

    @NotNull
    private final AFh1cSDK registerClient;

    @NotNull
    private final AFd1sSDK unregisterClient;

    /* renamed from: v, reason: collision with root package name */
    @NotNull
    private final AFg1rSDK f8492v;

    @NotNull
    private final AFi1sSDK valueOf;

    @NotNull
    private final AFi1cSDK values;

    /* renamed from: w, reason: collision with root package name */
    @NotNull
    private final AFb1hSDK f8493w;
    private static char[] afDebugLog = {35987, 35999, 35977, 35989, 35983, 35976, 35995, 35986, 35993, 35992, 36022, 35988, 35996, 35982, 36030, 35998};
    private static char afWarnLog = 47460;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0006*\u00020\u00000\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljava/text/SimpleDateFormat;", "AFInAppEventType", "()Ljava/text/SimpleDateFormat;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFg1jSDK$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends iu.k implements Function0<SimpleDateFormat> {
        public static final AnonymousClass1 values = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: AFInAppEventType, reason: merged with bridge method [inline-methods] */
        public final SimpleDateFormat mo2invoke() {
            return new SimpleDateFormat("yyyy-MM-dd_HHmmssZ", Locale.US);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0006*\u00020\u00000\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/appsflyer/AppsFlyerProperties;", "AFKeystoreWrapper", "()Lcom/appsflyer/AppsFlyerProperties;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFg1jSDK$5, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass5 extends iu.k implements Function0<AppsFlyerProperties> {
        public static final AnonymousClass5 valueOf = new AnonymousClass5();

        public AnonymousClass5() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: AFKeystoreWrapper, reason: merged with bridge method [inline-methods] */
        public final AppsFlyerProperties mo2invoke() {
            return AppsFlyerProperties.getInstance();
        }
    }

    public AFg1jSDK(@NotNull Context context, @NotNull AFi1sSDK aFi1sSDK, @NotNull AFd1vSDK aFd1vSDK, @NotNull AFi1cSDK aFi1cSDK, @NotNull AFa1bSDK aFa1bSDK, @NotNull AFh1wSDK aFh1wSDK, @NotNull AFd1qSDK aFd1qSDK, @NotNull AFd1sSDK aFd1sSDK, @NotNull AFh1cSDK aFh1cSDK, @NotNull AFg1wSDK aFg1wSDK, @NotNull AFb1hSDK aFb1hSDK, @NotNull AFd1lSDK aFd1lSDK, @NotNull AFg1rSDK aFg1rSDK, @NotNull AFd1pSDK aFd1pSDK) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(aFi1sSDK, "");
        Intrinsics.checkNotNullParameter(aFd1vSDK, "");
        Intrinsics.checkNotNullParameter(aFi1cSDK, "");
        Intrinsics.checkNotNullParameter(aFa1bSDK, "");
        Intrinsics.checkNotNullParameter(aFh1wSDK, "");
        Intrinsics.checkNotNullParameter(aFd1qSDK, "");
        Intrinsics.checkNotNullParameter(aFd1sSDK, "");
        Intrinsics.checkNotNullParameter(aFh1cSDK, "");
        Intrinsics.checkNotNullParameter(aFg1wSDK, "");
        Intrinsics.checkNotNullParameter(aFb1hSDK, "");
        Intrinsics.checkNotNullParameter(aFd1lSDK, "");
        Intrinsics.checkNotNullParameter(aFg1rSDK, "");
        Intrinsics.checkNotNullParameter(aFd1pSDK, "");
        this.AFKeystoreWrapper = context;
        this.valueOf = aFi1sSDK;
        this.AFInAppEventParameterName = aFd1vSDK;
        this.values = aFi1cSDK;
        this.AFInAppEventType = aFa1bSDK;
        this.f8490e = aFh1wSDK;
        this.AFLogger = aFd1qSDK;
        this.unregisterClient = aFd1sSDK;
        this.registerClient = aFh1cSDK;
        this.f8489d = aFg1wSDK;
        this.f8493w = aFb1hSDK;
        this.force = aFd1lSDK;
        this.f8492v = aFg1rSDK;
        this.afInfoLog = aFd1pSDK;
        this.f8491i = ut.h.a(AnonymousClass5.valueOf);
        this.afRDLog = ut.h.a(AnonymousClass1.values);
    }

    private final void AFInAppEventParameterName(Map<String, Object> map) {
        try {
            long j10 = this.AFKeystoreWrapper.getPackageManager().getPackageInfo(this.AFKeystoreWrapper.getPackageName(), 0).firstInstallTime;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd_HHmmssZ", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            map.put("installDate", simpleDateFormat.format(new Date(j10)));
            int i10 = afErrorLog + 19;
            afVerboseLog = i10 % 128;
            if (i10 % 2 == 0) {
                int i11 = 60 / 0;
            }
        } catch (Exception e10) {
            AFLogger.afErrorLog("Exception while collecting install date. ", e10);
        }
    }

    private final AppsFlyerProperties AFKeystoreWrapper() {
        int i10 = afErrorLog + 43;
        afVerboseLog = i10 % 128;
        if (i10 % 2 != 0) {
            return (AppsFlyerProperties) this.f8491i.getValue();
        }
        throw null;
    }

    private static long AFLogger() {
        int i10 = afVerboseLog + 35;
        afErrorLog = i10 % 128;
        return i10 % 2 != 0 ? System.currentTimeMillis() & SystemClock.elapsedRealtime() : System.currentTimeMillis() - SystemClock.elapsedRealtime();
    }

    private void AFLogger$LogLevel(@NotNull Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        AFb1zSDK AFInAppEventParameterName = AFb1rSDK.AFInAppEventParameterName(this.AFKeystoreWrapper.getContentResolver());
        if (AFInAppEventParameterName != null) {
            int i10 = afVerboseLog + 33;
            afErrorLog = i10 % 128;
            int i11 = i10 % 2;
            map.put("amazon_aid", AFInAppEventParameterName.AFInAppEventParameterName);
            map.put("amazon_aid_limit", String.valueOf(AFInAppEventParameterName.AFKeystoreWrapper));
            int i12 = afErrorLog + 15;
            afVerboseLog = i12 % 128;
            if (i12 % 2 != 0) {
            } else {
                throw null;
            }
        }
    }

    private void AFPurchaseDetails(@NotNull Map<String, Object> map) {
        int i10 = afErrorLog + 117;
        afVerboseLog = i10 % 128;
        if (i10 % 2 != 0) {
            Intrinsics.checkNotNullParameter(map, "");
            String str = this.f8489d.AFLogger;
            if (str != null && str.length() != 0) {
                int i11 = afErrorLog + 23;
                afVerboseLog = i11 % 128;
                int i12 = i11 % 2;
                map.put("appsflyerKey", str);
                int i13 = afErrorLog + 123;
                afVerboseLog = i13 % 128;
                int i14 = i13 % 2;
                return;
            }
            return;
        }
        Intrinsics.checkNotNullParameter(map, "");
        String str2 = this.f8489d.AFLogger;
        throw null;
    }

    private static void a(String str, int i10, byte b10, Object[] objArr) {
        char[] cArr;
        int i11;
        if (str != null) {
            cArr = str.toCharArray();
        } else {
            cArr = str;
        }
        char[] cArr2 = cArr;
        AFk1wSDK aFk1wSDK = new AFk1wSDK();
        char[] cArr3 = afDebugLog;
        if (cArr3 != null) {
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            for (int i12 = 0; i12 < length; i12++) {
                cArr4[i12] = (char) (cArr3[i12] ^ 8472772857875446112L);
            }
            int i13 = $11 + 9;
            $10 = i13 % 128;
            int i14 = i13 % 2;
            cArr3 = cArr4;
        }
        char c10 = (char) (8472772857875446112L ^ afWarnLog);
        char[] cArr5 = new char[i10];
        if (i10 % 2 != 0) {
            int i15 = $10 + 57;
            $11 = i15 % 128;
            if (i15 % 2 == 0) {
                i11 = i10 + 103;
                cArr5[i11] = (char) (cArr2[i11] / b10);
            } else {
                i11 = i10 - 1;
                cArr5[i11] = (char) (cArr2[i11] - b10);
            }
        } else {
            i11 = i10;
        }
        if (i11 > 1) {
            aFk1wSDK.AFInAppEventType = 0;
            while (true) {
                int i16 = aFk1wSDK.AFInAppEventType;
                if (i16 >= i11) {
                    break;
                }
                char c11 = cArr2[i16];
                aFk1wSDK.AFInAppEventParameterName = c11;
                char c12 = cArr2[i16 + 1];
                aFk1wSDK.AFKeystoreWrapper = c12;
                if (c11 == c12) {
                    cArr5[i16] = (char) (c11 - b10);
                    cArr5[i16 + 1] = (char) (c12 - b10);
                    int i17 = $10 + 9;
                    $11 = i17 % 128;
                    int i18 = i17 % 2;
                } else {
                    int i19 = c11 / c10;
                    aFk1wSDK.valueOf = i19;
                    int i20 = c11 % c10;
                    aFk1wSDK.registerClient = i20;
                    int i21 = c12 / c10;
                    aFk1wSDK.values = i21;
                    int i22 = c12 % c10;
                    aFk1wSDK.unregisterClient = i22;
                    if (i20 == i22) {
                        int i23 = $10 + 67;
                        $11 = i23 % 128;
                        int i24 = i23 % 2;
                        int i25 = ((i19 + c10) - 1) % c10;
                        aFk1wSDK.valueOf = i25;
                        int i26 = ((i21 + c10) - 1) % c10;
                        aFk1wSDK.values = i26;
                        cArr5[i16] = cArr3[(i25 * c10) + i20];
                        cArr5[i16 + 1] = cArr3[(i26 * c10) + i22];
                    } else if (i19 == i21) {
                        int i27 = ((i20 + c10) - 1) % c10;
                        aFk1wSDK.registerClient = i27;
                        int i28 = ((i22 + c10) - 1) % c10;
                        aFk1wSDK.unregisterClient = i28;
                        cArr5[i16] = cArr3[(i19 * c10) + i27];
                        cArr5[i16 + 1] = cArr3[(i21 * c10) + i28];
                    } else {
                        cArr5[i16] = cArr3[(i19 * c10) + i22];
                        cArr5[i16 + 1] = cArr3[(i21 * c10) + i20];
                    }
                }
                aFk1wSDK.AFInAppEventType = i16 + 2;
            }
        }
        for (int i29 = 0; i29 < i10; i29++) {
            cArr5[i29] = (char) (cArr5[i29] ^ 13722);
        }
        String str2 = new String(cArr5);
        int i30 = $10 + 83;
        $11 = i30 % 128;
        int i31 = i30 % 2;
        objArr[0] = str2;
    }

    private void afDebugLog(@NotNull Map<String, Object> map) {
        int i10 = afVerboseLog + 27;
        afErrorLog = i10 % 128;
        int i11 = i10 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        map.putAll(this.f8492v.values());
        int i12 = afErrorLog + 117;
        afVerboseLog = i12 % 128;
        if (i12 % 2 != 0) {
        } else {
            throw null;
        }
    }

    private void afErrorLog(@NotNull Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        try {
            String valueOf = AFb1kSDK.valueOf(this.force, this.AFLogger);
            if (valueOf != null) {
                int i10 = afVerboseLog + 87;
                afErrorLog = i10 % 128;
                int i11 = i10 % 2;
                map.put("uid", valueOf);
                return;
            }
        } catch (Throwable th2) {
            StringBuilder sb2 = new StringBuilder("ERROR: could not get uid ");
            sb2.append(th2.getMessage());
            String obj = sb2.toString();
            Intrinsics.checkNotNullExpressionValue(obj, "");
            AFLogger.afErrorLog(obj, th2);
        }
        int i12 = afErrorLog + 41;
        afVerboseLog = i12 % 128;
        if (i12 % 2 != 0) {
        } else {
            throw null;
        }
    }

    private void afErrorLogForExcManagerOnly(@NotNull Map<String, Object> map) {
        int i10 = afVerboseLog + 45;
        afErrorLog = i10 % 128;
        int i11 = i10 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        if (this.AFLogger.values("is_stop_tracking_used")) {
            int i12 = afErrorLog + 75;
            afVerboseLog = i12 % 128;
            int i13 = i12 % 2;
            map.put("istu", String.valueOf(this.AFLogger.AFInAppEventType("is_stop_tracking_used")));
            int i14 = afVerboseLog + 71;
            afErrorLog = i14 % 128;
            int i15 = i14 % 2;
        }
    }

    private boolean afInfoLog() {
        int i10 = afErrorLog + 93;
        afVerboseLog = i10 % 128;
        int i11 = i10 % 2;
        boolean parseBoolean = Boolean.parseBoolean(this.AFLogger.AFKeystoreWrapper("sentSuccessfully", (String) null));
        int i12 = afVerboseLog + 41;
        afErrorLog = i12 % 128;
        if (i12 % 2 == 0) {
            return parseBoolean;
        }
        throw null;
    }

    private void afLogForce(@NotNull Map<String, Object> map) {
        int i10 = afErrorLog + 79;
        afVerboseLog = i10 % 128;
        if (i10 % 2 != 0) {
            Intrinsics.checkNotNullParameter(map, "");
            boolean AFInAppEventParameterName = AFg1nSDK.AFInAppEventParameterName(this.AFKeystoreWrapper);
            AFLogger.afDebugLog("didConfigureTokenRefreshService=".concat(String.valueOf(AFInAppEventParameterName)));
            if (!AFInAppEventParameterName) {
                map.put("tokenRefreshConfigured", Boolean.FALSE);
                int i11 = afVerboseLog + 23;
                afErrorLog = i11 % 128;
                int i12 = i11 % 2;
            }
            map.put("registeredUninstall", Boolean.valueOf(AFg1nSDK.valueOf(this.AFLogger)));
            return;
        }
        Intrinsics.checkNotNullParameter(map, "");
        AFLogger.afDebugLog("didConfigureTokenRefreshService=".concat(String.valueOf(AFg1nSDK.AFInAppEventParameterName(this.AFKeystoreWrapper))));
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0047, code lost:
    
        if ((r2 % 2) == 0) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void afRDLog(@org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> r9) {
        /*
            r8 = this;
            int r0 = com.appsflyer.internal.AFg1jSDK.afVerboseLog
            int r0 = r0 + 99
            int r1 = r0 % 128
            com.appsflyer.internal.AFg1jSDK.afErrorLog = r1
            int r0 = r0 % 2
            java.lang.String r0 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            com.appsflyer.internal.AFd1sSDK r1 = r8.unregisterClient
            java.lang.String r1 = r1.d()
            com.appsflyer.internal.AFd1qSDK r2 = r8.AFLogger
            java.lang.String r2 = values(r2, r1)
            r3 = 1
            r4 = 0
            r5 = 0
            if (r2 == 0) goto L38
            int r6 = com.appsflyer.internal.AFg1jSDK.afErrorLog
            int r6 = r6 + 87
            int r7 = r6 % 128
            com.appsflyer.internal.AFg1jSDK.afVerboseLog = r7
            int r6 = r6 % 2
            if (r6 == 0) goto L34
            boolean r6 = kotlin.jvm.internal.Intrinsics.a(r2, r1)
            if (r6 != 0) goto L38
            r6 = r3
            goto L39
        L34:
            kotlin.jvm.internal.Intrinsics.a(r2, r1)
            throw r4
        L38:
            r6 = r5
        L39:
            if (r2 != 0) goto L49
            if (r1 == 0) goto L49
            int r2 = com.appsflyer.internal.AFg1jSDK.afVerboseLog
            int r2 = r2 + 117
            int r7 = r2 % 128
            com.appsflyer.internal.AFg1jSDK.afErrorLog = r7
            int r2 = r2 % 2
            if (r2 == 0) goto L4a
        L49:
            r3 = r5
        L4a:
            if (r6 != 0) goto L4e
            if (r3 == 0) goto L53
        L4e:
            java.lang.String r2 = "af_latestchannel"
            r9.put(r2, r1)
        L53:
            java.lang.String r1 = r8.d()
            if (r1 == 0) goto L8b
            int r2 = com.appsflyer.internal.AFg1jSDK.afVerboseLog
            int r2 = r2 + 25
            int r3 = r2 % 128
            com.appsflyer.internal.AFg1jSDK.afErrorLog = r3
            int r2 = r2 % 2
            java.lang.String r3 = "af_installstore"
            if (r2 != 0) goto L79
            java.util.Locale r2 = java.util.Locale.getDefault()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r0)
            java.lang.String r1 = r1.toLowerCase(r2)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            r9.put(r3, r1)
            goto L8b
        L79:
            java.util.Locale r2 = java.util.Locale.getDefault()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r0)
            java.lang.String r1 = r1.toLowerCase(r2)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            r9.put(r3, r1)
            throw r4
        L8b:
            java.lang.String r1 = r8.w()
            if (r1 == 0) goto La4
            java.util.Locale r2 = java.util.Locale.getDefault()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r0)
            java.lang.String r1 = r1.toLowerCase(r2)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            java.lang.String r2 = "af_preinstall_name"
            r9.put(r2, r1)
        La4:
            java.lang.String r1 = r8.e()
            if (r1 == 0) goto Lbe
            java.util.Locale r2 = java.util.Locale.getDefault()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r0)
            java.lang.String r1 = r1.toLowerCase(r2)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            java.lang.String r0 = "af_currentstore"
            r9.put(r0, r1)
            return
        Lbe:
            int r9 = com.appsflyer.internal.AFg1jSDK.afErrorLog
            int r9 = r9 + 85
            int r0 = r9 % 128
            com.appsflyer.internal.AFg1jSDK.afVerboseLog = r0
            int r9 = r9 % 2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFg1jSDK.afRDLog(java.util.Map):void");
    }

    private void afVerboseLog(@NotNull Map<String, Object> map) {
        boolean z10;
        Intrinsics.checkNotNullParameter(map, "");
        String string = AFKeystoreWrapper().getString(AppsFlyerProperties.EXTENSION);
        if (string != null && string.length() != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            int i10 = afVerboseLog + 45;
            afErrorLog = i10 % 128;
            int i11 = i10 % 2;
            map.put(AppsFlyerProperties.EXTENSION, string);
            int i12 = afErrorLog + 119;
            afVerboseLog = i12 % 128;
            int i13 = i12 % 2;
        }
    }

    private static void afWarnLog(@NotNull Map<String, Object> map) {
        int i10 = afVerboseLog + 41;
        afErrorLog = i10 % 128;
        try {
            if (i10 % 2 != 0) {
                Intrinsics.checkNotNullParameter(map, "");
                map.put("lang", Locale.getDefault().getDisplayLanguage());
                int i11 = 37 / 0;
            } else {
                Intrinsics.checkNotNullParameter(map, "");
                map.put("lang", Locale.getDefault().getDisplayLanguage());
            }
        } catch (Exception e10) {
            AFLogger.afErrorLog("Exception while collecting display language name. ", e10);
        }
        try {
            map.put("lang_code", Locale.getDefault().getLanguage());
            int i12 = afErrorLog + 117;
            afVerboseLog = i12 % 128;
            int i13 = i12 % 2;
        } catch (Exception e11) {
            AFLogger.afErrorLog("Exception while collecting display language code. ", e11);
        }
        try {
            map.put("country", Locale.getDefault().getCountry());
        } catch (Exception e12) {
            AFLogger.afErrorLog("Exception while collecting country name. ", e12);
        }
    }

    private void d(@NotNull Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        String string = AFKeystoreWrapper().getString(AppsFlyerProperties.ONELINK_ID);
        String string2 = AFKeystoreWrapper().getString(AppsFlyerProperties.ONELINK_VERSION);
        if (string != null) {
            int i10 = afVerboseLog + 51;
            afErrorLog = i10 % 128;
            if (i10 % 2 != 0) {
                map.put("onelink_id", string);
                throw null;
            }
            map.put("onelink_id", string);
        }
        if (string2 != null) {
            map.put("onelink_ver", string2);
        }
        int i11 = afErrorLog + 125;
        afVerboseLog = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    private final void e(Map<String, Object> map) {
        int i10 = afVerboseLog + 21;
        afErrorLog = i10 % 128;
        int i11 = i10 % 2;
        AFd1vSDK.AFa1uSDK AFInAppEventParameterName = this.AFInAppEventParameterName.AFInAppEventParameterName(this.AFKeystoreWrapper);
        float f10 = AFInAppEventParameterName.valueOf;
        String str = AFInAppEventParameterName.values;
        map.put("btl", String.valueOf(f10));
        if (str != null) {
            int i12 = afErrorLog + 43;
            afVerboseLog = i12 % 128;
            int i13 = i12 % 2;
            map.put("btch", str);
            if (i13 == 0) {
                int i14 = 91 / 0;
            }
        }
        int i15 = afVerboseLog + 91;
        afErrorLog = i15 % 128;
        if (i15 % 2 != 0) {
            throw null;
        }
    }

    private final void force(Map<String, Object> map) {
        UiModeManager uiModeManager = (UiModeManager) this.AFKeystoreWrapper.getSystemService(UiModeManager.class);
        if (uiModeManager == null || uiModeManager.getCurrentModeType() != 4) {
            return;
        }
        int i10 = afErrorLog + 103;
        afVerboseLog = i10 % 128;
        if (i10 % 2 != 0) {
            map.put("tv", Boolean.TRUE);
        } else {
            map.put("tv", Boolean.TRUE);
            int i11 = 12 / 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SuppressLint({"HardwareIds"})
    private final String i() {
        String str;
        int i10 = afErrorLog + 7;
        afVerboseLog = i10 % 128;
        int i11 = i10 % 2;
        try {
        } catch (Exception e10) {
            AFLogger.afErrorLog(e10.getMessage(), e10);
            str = i11;
        }
        if (i11 != 0) {
            String AFKeystoreWrapper = this.AFLogger.AFKeystoreWrapper("androidIdCached", (String) null);
            String string = Settings.Secure.getString(this.AFKeystoreWrapper.getContentResolver(), "android_id");
            str = AFKeystoreWrapper;
            if (string != null) {
                return string;
            }
            if (str == 0) {
                return null;
            }
            int i12 = afVerboseLog + 61;
            afErrorLog = i12 % 128;
            int i13 = i12 % 2;
            AFLogger.afDebugLog("use cached AndroidId: ".concat(String.valueOf(str)));
            return str;
        }
        this.AFLogger.AFKeystoreWrapper("androidIdCached", (String) null);
        Settings.Secure.getString(this.AFKeystoreWrapper.getContentResolver(), "android_id");
        throw null;
    }

    private boolean registerClient() {
        int i10 = afVerboseLog + 59;
        afErrorLog = i10 % 128;
        int i11 = i10 % 2;
        if (!(!this.AFLogger.values("appsFlyerCount"))) {
            return false;
        }
        int i12 = afVerboseLog + 41;
        afErrorLog = i12 % 128;
        return i12 % 2 == 0;
    }

    @NotNull
    private static String unregisterClient() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getAbsolutePath());
        long blockSizeLong = statFs.getBlockSizeLong();
        long availableBlocksLong = statFs.getAvailableBlocksLong() * blockSizeLong;
        long blockCountLong = statFs.getBlockCountLong() * blockSizeLong;
        double pow = Math.pow(2.0d, 20.0d);
        StringBuilder sb2 = new StringBuilder();
        sb2.append((long) (availableBlocksLong / pow));
        sb2.append('/');
        sb2.append((long) (blockCountLong / pow));
        String obj = sb2.toString();
        int i10 = afErrorLog + 35;
        afVerboseLog = i10 % 128;
        if (i10 % 2 != 0) {
            return obj;
        }
        throw null;
    }

    private final String v() {
        int i10 = afErrorLog + 109;
        afVerboseLog = i10 % 128;
        int i11 = i10 % 2;
        File AFInAppEventParameterName = AFInAppEventParameterName(AFInAppEventType("ro.appsflyer.preinstall.path"));
        if (!(!AFKeystoreWrapper(AFInAppEventParameterName))) {
            int i12 = afErrorLog + 93;
            afVerboseLog = i12 % 128;
            if (i12 % 2 == 0) {
                AFInAppEventParameterName = AFInAppEventParameterName(valueOf("AF_PRE_INSTALL_PATH"));
                int i13 = 93 / 0;
            } else {
                AFInAppEventParameterName = AFInAppEventParameterName(valueOf("AF_PRE_INSTALL_PATH"));
            }
        }
        if (AFKeystoreWrapper(AFInAppEventParameterName)) {
            int i14 = afVerboseLog + 37;
            afErrorLog = i14 % 128;
            if (i14 % 2 != 0) {
                AFInAppEventParameterName("/data/local/tmp/pre_install.appsflyer");
                throw null;
            }
            AFInAppEventParameterName = AFInAppEventParameterName("/data/local/tmp/pre_install.appsflyer");
        }
        if (AFKeystoreWrapper(AFInAppEventParameterName)) {
            AFInAppEventParameterName = AFInAppEventParameterName("/etc/pre_install.appsflyer");
        }
        if (AFKeystoreWrapper(AFInAppEventParameterName)) {
            return null;
        }
        String packageName = this.AFKeystoreWrapper.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "");
        String valueOf = valueOf(AFInAppEventParameterName, packageName);
        int i15 = afVerboseLog + 97;
        afErrorLog = i15 % 128;
        if (i15 % 2 == 0) {
            return valueOf;
        }
        throw null;
    }

    private String valueOf() throws CertificateException, NoSuchAlgorithmException, PackageManager.NameNotFoundException {
        int i10 = afErrorLog + 125;
        afVerboseLog = i10 % 128;
        int i11 = i10 % 2;
        String AFInAppEventParameterName = AFb1uSDK.AFInAppEventParameterName(this.AFKeystoreWrapper.getApplicationContext().getPackageManager(), this.AFKeystoreWrapper.getApplicationContext().getPackageName());
        int i12 = afErrorLog + 117;
        afVerboseLog = i12 % 128;
        if (i12 % 2 != 0) {
            return AFInAppEventParameterName;
        }
        throw null;
    }

    private final SimpleDateFormat values() {
        int i10 = afVerboseLog + 41;
        afErrorLog = i10 % 128;
        int i11 = i10 % 2;
        SimpleDateFormat simpleDateFormat = (SimpleDateFormat) this.afRDLog.getValue();
        int i12 = afVerboseLog + 111;
        afErrorLog = i12 % 128;
        if (i12 % 2 == 0) {
            return simpleDateFormat;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0041, code lost:
    
        if (r0 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004a, code lost:
    
        r0 = valueOf("AF_PRE_INSTALL_NAME");
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0048, code lost:
    
        if (r0 == null) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String w() {
        /*
            r3 = this;
            int r0 = com.appsflyer.internal.AFg1jSDK.afErrorLog
            int r0 = r0 + 63
            int r1 = r0 % 128
            com.appsflyer.internal.AFg1jSDK.afVerboseLog = r1
            int r0 = r0 % 2
            com.appsflyer.AppsFlyerProperties r0 = r3.AFKeystoreWrapper()
            java.lang.String r1 = "preInstallName"
            java.lang.String r0 = r0.getString(r1)
            if (r0 == 0) goto L17
            return r0
        L17:
            com.appsflyer.internal.AFd1qSDK r2 = r3.AFLogger
            boolean r2 = r2.values(r1)
            if (r2 == 0) goto L27
            com.appsflyer.internal.AFd1qSDK r0 = r3.AFLogger
            r2 = 0
            java.lang.String r0 = r0.AFKeystoreWrapper(r1, r2)
            goto L57
        L27:
            boolean r2 = r3.registerClient()
            if (r2 == 0) goto L50
            int r0 = com.appsflyer.internal.AFg1jSDK.afErrorLog
            int r0 = r0 + 63
            int r2 = r0 % 128
            com.appsflyer.internal.AFg1jSDK.afVerboseLog = r2
            int r0 = r0 % 2
            if (r0 != 0) goto L44
            java.lang.String r0 = r3.v()
            r2 = 13
            int r2 = r2 / 0
            if (r0 != 0) goto L50
            goto L4a
        L44:
            java.lang.String r0 = r3.v()
            if (r0 != 0) goto L50
        L4a:
            java.lang.String r0 = "AF_PRE_INSTALL_NAME"
            java.lang.String r0 = r3.valueOf(r0)
        L50:
            if (r0 == 0) goto L57
            com.appsflyer.internal.AFd1qSDK r2 = r3.AFLogger
            r2.AFInAppEventParameterName(r1, r0)
        L57:
            if (r0 == 0) goto L60
            com.appsflyer.AppsFlyerProperties r2 = r3.AFKeystoreWrapper()
            r2.set(r1, r0)
        L60:
            int r1 = com.appsflyer.internal.AFg1jSDK.afVerboseLog
            int r1 = r1 + 27
            int r2 = r1 % 128
            com.appsflyer.internal.AFg1jSDK.afErrorLog = r2
            int r1 = r1 % 2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFg1jSDK.w():java.lang.String");
    }

    @Override // com.appsflyer.internal.AFg1mSDK
    public final void AFInAppEventType(@NotNull Map<String, Object> map, boolean z10, @NotNull Function0<String> function0) {
        int i10 = afErrorLog + 45;
        afVerboseLog = i10 % 128;
        int i11 = i10 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(function0, "");
        AFInAppEventParameterName(map);
        AFKeystoreWrapper(map);
        afRDLog(map);
        valueOf(map, z10);
        valueOf(map, function0);
        int i12 = afErrorLog + 45;
        afVerboseLog = i12 % 128;
        if (i12 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0048, code lost:
    
        if (r1.versionCode > r10.AFLogger.valueOf("versionCode", 0)) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void AFKeystoreWrapper(java.util.Map<java.lang.String, java.lang.Object> r11) {
        /*
            r10 = this;
            java.lang.String r0 = ""
            int r1 = com.appsflyer.internal.AFg1jSDK.afErrorLog
            int r1 = r1 + 55
            int r2 = r1 % 128
            com.appsflyer.internal.AFg1jSDK.afVerboseLog = r2
            int r1 = r1 % 2
            r2 = 1
            java.lang.String r3 = "versionCode"
            r4 = 0
            if (r1 != 0) goto L30
            android.content.Context r1 = r10.AFKeystoreWrapper     // Catch: java.lang.Throwable -> L2d
            android.content.pm.PackageManager r1 = r1.getPackageManager()     // Catch: java.lang.Throwable -> L2d
            android.content.Context r5 = r10.AFKeystoreWrapper     // Catch: java.lang.Throwable -> L2d
            java.lang.String r5 = r5.getPackageName()     // Catch: java.lang.Throwable -> L2d
            android.content.pm.PackageInfo r1 = r1.getPackageInfo(r5, r4)     // Catch: java.lang.Throwable -> L2d
            com.appsflyer.internal.AFd1qSDK r5 = r10.AFLogger     // Catch: java.lang.Throwable -> L2d
            int r5 = r5.valueOf(r3, r2)     // Catch: java.lang.Throwable -> L2d
            int r6 = r1.versionCode     // Catch: java.lang.Throwable -> L2d
            if (r6 <= r5) goto L65
            goto L4a
        L2d:
            r11 = move-exception
            goto Leb
        L30:
            android.content.Context r1 = r10.AFKeystoreWrapper     // Catch: java.lang.Throwable -> L2d
            android.content.pm.PackageManager r1 = r1.getPackageManager()     // Catch: java.lang.Throwable -> L2d
            android.content.Context r5 = r10.AFKeystoreWrapper     // Catch: java.lang.Throwable -> L2d
            java.lang.String r5 = r5.getPackageName()     // Catch: java.lang.Throwable -> L2d
            android.content.pm.PackageInfo r1 = r1.getPackageInfo(r5, r4)     // Catch: java.lang.Throwable -> L2d
            com.appsflyer.internal.AFd1qSDK r5 = r10.AFLogger     // Catch: java.lang.Throwable -> L2d
            int r5 = r5.valueOf(r3, r4)     // Catch: java.lang.Throwable -> L2d
            int r6 = r1.versionCode     // Catch: java.lang.Throwable -> L2d
            if (r6 <= r5) goto L65
        L4a:
            int r5 = com.appsflyer.internal.AFg1jSDK.afVerboseLog
            int r5 = r5 + 117
            int r6 = r5 % 128
            com.appsflyer.internal.AFg1jSDK.afErrorLog = r6
            int r5 = r5 % 2
            com.appsflyer.internal.AFd1qSDK r5 = r10.AFLogger     // Catch: java.lang.Throwable -> L2d
            int r6 = r1.versionCode     // Catch: java.lang.Throwable -> L2d
            r5.AFInAppEventParameterName(r3, r6)     // Catch: java.lang.Throwable -> L2d
            int r3 = com.appsflyer.internal.AFg1jSDK.afVerboseLog
            int r3 = r3 + 7
            int r5 = r3 % 128
            com.appsflyer.internal.AFg1jSDK.afErrorLog = r5
            int r3 = r3 % 2
        L65:
            java.lang.String r3 = "app_version_code"
            int r5 = r1.versionCode     // Catch: java.lang.Throwable -> L2d
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch: java.lang.Throwable -> L2d
            r11.put(r3, r5)     // Catch: java.lang.Throwable -> L2d
            java.lang.String r3 = "app_version_name"
            com.appsflyer.internal.AFd1sSDK r5 = r10.unregisterClient     // Catch: java.lang.Throwable -> L2d
            com.appsflyer.internal.AFd1lSDK r5 = r5.valueOf     // Catch: java.lang.Throwable -> L2d
            android.content.Context r5 = r5.AFKeystoreWrapper     // Catch: java.lang.Throwable -> L2d
            java.lang.String r6 = r5.getPackageName()     // Catch: java.lang.Throwable -> L2d
            java.lang.String r5 = com.appsflyer.internal.AFb1uSDK.AFInAppEventType(r5, r6)     // Catch: java.lang.Throwable -> L2d
            r11.put(r3, r5)     // Catch: java.lang.Throwable -> L2d
            java.lang.String r3 = "targetSDKver"
            com.appsflyer.internal.AFd1sSDK r5 = r10.unregisterClient     // Catch: java.lang.Throwable -> L2d
            com.appsflyer.internal.AFd1lSDK r5 = r5.valueOf     // Catch: java.lang.Throwable -> L2d
            android.content.Context r5 = r5.AFKeystoreWrapper     // Catch: java.lang.Throwable -> L2d
            android.content.pm.ApplicationInfo r5 = r5.getApplicationInfo()     // Catch: java.lang.Throwable -> L2d
            int r5 = r5.targetSdkVersion     // Catch: java.lang.Throwable -> L2d
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L2d
            r11.put(r3, r5)     // Catch: java.lang.Throwable -> L2d
            long r5 = r1.firstInstallTime     // Catch: java.lang.Throwable -> L2d
            long r7 = r1.lastUpdateTime     // Catch: java.lang.Throwable -> L2d
            java.lang.String r1 = "date1"
            java.text.SimpleDateFormat r3 = r10.values()     // Catch: java.lang.Throwable -> L2d
            java.util.Date r9 = new java.util.Date     // Catch: java.lang.Throwable -> L2d
            r9.<init>(r5)     // Catch: java.lang.Throwable -> L2d
            java.lang.String r3 = r3.format(r9)     // Catch: java.lang.Throwable -> L2d
            r11.put(r1, r3)     // Catch: java.lang.Throwable -> L2d
            java.lang.String r1 = "date2"
            java.text.SimpleDateFormat r3 = r10.values()     // Catch: java.lang.Throwable -> L2d
            java.util.Date r5 = new java.util.Date     // Catch: java.lang.Throwable -> L2d
            r5.<init>(r7)     // Catch: java.lang.Throwable -> L2d
            java.lang.String r3 = r3.format(r5)     // Catch: java.lang.Throwable -> L2d
            r11.put(r1, r3)     // Catch: java.lang.Throwable -> L2d
            java.lang.String r1 = "\u0000\u0004\u0006\u0001\u000e\t\u0007\u0005\b\t\u0006\u000f\u0005\u000e㘉"
            int r3 = android.text.TextUtils.getOffsetAfter(r0, r4)     // Catch: java.lang.Throwable -> L2d
            int r3 = r3 + 15
            int r5 = android.view.View.resolveSize(r4, r4)     // Catch: java.lang.Throwable -> L2d
            int r5 = 10 - r5
            byte r5 = (byte) r5     // Catch: java.lang.Throwable -> L2d
            java.lang.Object[] r6 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L2d
            a(r1, r3, r5, r6)     // Catch: java.lang.Throwable -> L2d
            r1 = r6[r4]     // Catch: java.lang.Throwable -> L2d
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L2d
            java.lang.String r1 = r1.intern()     // Catch: java.lang.Throwable -> L2d
            java.text.SimpleDateFormat r3 = r10.values()     // Catch: java.lang.Throwable -> L2d
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r0)     // Catch: java.lang.Throwable -> L2d
            java.lang.String r0 = r10.AFInAppEventParameterName(r3)     // Catch: java.lang.Throwable -> L2d
            r11.put(r1, r0)     // Catch: java.lang.Throwable -> L2d
            return
        Leb:
            java.lang.String r0 = "Exception while collecting app version data "
            com.appsflyer.AFLogger.afErrorLog(r0, r11, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFg1jSDK.AFKeystoreWrapper(java.util.Map):void");
    }

    private final void AFLogger(Map<String, Object> map) {
        int i10 = afVerboseLog + 25;
        afErrorLog = i10 % 128;
        int i11 = i10 % 2;
        if (!AFKeystoreWrapper().isOtherSdkStringDisabled()) {
            map.put("batteryLevel", String.valueOf(this.AFInAppEventParameterName.AFInAppEventParameterName(this.AFKeystoreWrapper).valueOf));
        }
        int i12 = afErrorLog + 13;
        afVerboseLog = i12 % 128;
        if (i12 % 2 == 0) {
            throw null;
        }
    }

    private static void afInfoLog(@NotNull Map<String, Object> map) {
        int i10 = afErrorLog + 93;
        afVerboseLog = i10 % 128;
        int i11 = i10 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        Object AFInAppEventType = AFb1cSDK.AFInAppEventType();
        String AFKeystoreWrapper = AFb1cSDK.AFKeystoreWrapper();
        if (AFInAppEventType != null) {
            int i12 = afErrorLog + 31;
            afVerboseLog = i12 % 128;
            if (i12 % 2 == 0) {
                int i13 = 29 / 0;
                if (AFKeystoreWrapper == null) {
                    return;
                }
            } else if (AFKeystoreWrapper == null) {
                return;
            }
            if (Integer.parseInt(AFKeystoreWrapper) > 0) {
                map.put("reinstallCounter", AFKeystoreWrapper);
                map.put("originalAppsflyerId", AFInAppEventType);
                int i14 = afErrorLog + 99;
                afVerboseLog = i14 % 128;
                int i15 = i14 % 2;
            }
        }
    }

    private static void registerClient(@NotNull Map<String, Object> map) {
        int i10 = afErrorLog + 75;
        afVerboseLog = i10 % 128;
        int i11 = i10 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        Object[] objArr = new Object[1];
        a("\r\t\u0007\n㙑", 4 - TextUtils.lastIndexOf(HttpUrl.FRAGMENT_ENCODE_SET, '0'), (byte) ((TypedValue.complexToFraction(0, s0.g.f34069a, s0.g.f34069a) > s0.g.f34069a ? 1 : (TypedValue.complexToFraction(0, s0.g.f34069a, s0.g.f34069a) == s0.g.f34069a ? 0 : -1)) + 83), objArr);
        map.put(((String) objArr[0]).intern(), Build.BRAND);
        map.put(LogSubCategory.Context.DEVICE, Build.DEVICE);
        map.put("product", Build.PRODUCT);
        map.put(PaymentConstants.Category.SDK, String.valueOf(Build.VERSION.SDK_INT));
        map.put("model", Build.MODEL);
        map.put("deviceType", Build.TYPE);
        int i12 = afVerboseLog + 93;
        afErrorLog = i12 % 128;
        int i13 = i12 % 2;
    }

    @Override // com.appsflyer.internal.AFg1mSDK
    public final void valueOf(@NotNull Map<String, Object> map, int i10, int i11) {
        int i12 = afErrorLog + 57;
        afVerboseLog = i12 % 128;
        if (i12 % 2 != 0) {
            Intrinsics.checkNotNullParameter(map, "");
            map.put("counter", String.valueOf(i10));
            map.put("iaecounter", String.valueOf(i11));
            map.put("isFirstCall", String.valueOf(!afInfoLog()));
            int i13 = afErrorLog + 95;
            afVerboseLog = i13 % 128;
            int i14 = i13 % 2;
            return;
        }
        Intrinsics.checkNotNullParameter(map, "");
        map.put("counter", String.valueOf(i10));
        map.put("iaecounter", String.valueOf(i11));
        afInfoLog();
        throw null;
    }

    @Override // com.appsflyer.internal.AFg1mSDK
    public final void values(@NotNull AFa1qSDK aFa1qSDK) {
        int i10 = afErrorLog + 1;
        afVerboseLog = i10 % 128;
        int i11 = i10 % 2;
        Intrinsics.checkNotNullParameter(aFa1qSDK, "");
        Map<String, Object> AFInAppEventParameterName = aFa1qSDK.AFInAppEventParameterName();
        if (!aFa1qSDK.AFInAppEventType()) {
            if (!(aFa1qSDK instanceof AFh1kSDK)) {
                Intrinsics.checkNotNullExpressionValue(AFInAppEventParameterName, "");
                String str = aFa1qSDK.f8392e;
                Intrinsics.checkNotNullExpressionValue(str, "");
                AFKeystoreWrapper(AFInAppEventParameterName, str);
                int i12 = afVerboseLog + 41;
                afErrorLog = i12 % 128;
                int i13 = i12 % 2;
            }
        } else {
            int i14 = afVerboseLog + 39;
            afErrorLog = i14 % 128;
            int i15 = i14 % 2;
            String str2 = aFa1qSDK.unregisterClient;
            AFd1pSDK aFd1pSDK = this.afInfoLog;
            AFInAppEventType(aFa1qSDK, str2, aFd1pSDK.valueOf, aFd1pSDK.AFInAppEventParameterName);
        }
        Intrinsics.checkNotNullExpressionValue(AFInAppEventParameterName, "");
        AFPurchaseDetails(AFInAppEventParameterName);
        afInfoLog(AFInAppEventParameterName);
        afDebugLog(AFInAppEventParameterName);
        afVerboseLog(AFInAppEventParameterName);
        afErrorLog(AFInAppEventParameterName);
        values(AFInAppEventParameterName, aFa1qSDK.AFInAppEventType());
        afLogForce(AFInAppEventParameterName);
        afErrorLogForExcManagerOnly(AFInAppEventParameterName);
        AFInAppEventParameterName(AFInAppEventParameterName, aFa1qSDK);
        AFInAppEventParameterName.put("af_events_api", "1");
    }

    private final boolean force() {
        if (AFKeystoreWrapper().getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, false) || AFKeystoreWrapper().getBoolean(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, false)) {
            return true;
        }
        int i10 = afVerboseLog + 69;
        int i11 = i10 % 128;
        afErrorLog = i11;
        int i12 = i10 % 2;
        int i13 = i11 + 55;
        afVerboseLog = i13 % 128;
        int i14 = i13 % 2;
        AFb1vSDK.AFKeystoreWrapper();
        Context context = this.AFKeystoreWrapper;
        if (i14 != 0) {
            return !AFb1vSDK.values(context);
        }
        AFb1vSDK.values(context);
        throw null;
    }

    @NotNull
    private String AFInAppEventParameterName(@NotNull SimpleDateFormat simpleDateFormat) {
        Intrinsics.checkNotNullParameter(simpleDateFormat, "");
        String AFKeystoreWrapper = this.AFLogger.AFKeystoreWrapper("appsFlyerFirstInstall", (String) null);
        if (AFKeystoreWrapper == null) {
            int i10 = afErrorLog + 3;
            afVerboseLog = i10 % 128;
            if (i10 % 2 != 0) {
                if (registerClient()) {
                    AFLogger.afDebugLog("AppsFlyer: first launch detected");
                    AFKeystoreWrapper = simpleDateFormat.format(new Date());
                } else {
                    AFKeystoreWrapper = HttpUrl.FRAGMENT_ENCODE_SET;
                }
                this.AFLogger.AFInAppEventParameterName("appsFlyerFirstInstall", AFKeystoreWrapper);
            } else {
                registerClient();
                throw null;
            }
        }
        AFg1fSDK.i$default(AFLogger.INSTANCE, AFg1aSDK.GENERAL, "AppsFlyer: first launch date: ".concat(String.valueOf(AFKeystoreWrapper)), false, 4, null);
        Intrinsics.checkNotNullExpressionValue(AFKeystoreWrapper, "");
        int i11 = afVerboseLog + 59;
        afErrorLog = i11 % 128;
        int i12 = i11 % 2;
        return AFKeystoreWrapper;
    }

    private String d() {
        int i10 = afVerboseLog + 103;
        afErrorLog = i10 % 128;
        if (i10 % 2 == 0) {
            if (this.AFLogger.values("INSTALL_STORE")) {
                int i11 = afVerboseLog + 97;
                afErrorLog = i11 % 128;
                if (i11 % 2 == 0) {
                    return this.AFLogger.AFKeystoreWrapper("INSTALL_STORE", (String) null);
                }
                this.AFLogger.AFKeystoreWrapper("INSTALL_STORE", (String) null);
                throw null;
            }
            String e10 = !(registerClient() ^ true) ? e() : null;
            this.AFLogger.AFInAppEventParameterName("INSTALL_STORE", e10);
            return e10;
        }
        this.AFLogger.values("INSTALL_STORE");
        throw null;
    }

    private String e() {
        String string = AFKeystoreWrapper().getString(AppsFlyerProperties.AF_STORE_FROM_API);
        if (string == null) {
            int i10 = afErrorLog + 55;
            afVerboseLog = i10 % 128;
            int i11 = i10 % 2;
            string = valueOf("AF_STORE");
        }
        int i12 = afErrorLog + 121;
        afVerboseLog = i12 % 128;
        int i13 = i12 % 2;
        return string;
    }

    private void unregisterClient(@NotNull Map<String, ? extends Object> map) {
        boolean z10;
        Intrinsics.checkNotNullParameter(map, "");
        AFh1wSDK aFh1wSDK = this.f8490e;
        HashMap hashMap = new HashMap(aFh1wSDK.AFInAppEventType);
        aFh1wSDK.AFInAppEventType.clear();
        this.f8490e.AFInAppEventParameterName.AFKeystoreWrapper("gcd");
        Intrinsics.checkNotNullExpressionValue(hashMap, "");
        if (hashMap.isEmpty()) {
            int i10 = afErrorLog + 3;
            afVerboseLog = i10 % 128;
            int i11 = i10 % 2;
            z10 = false;
        } else {
            int i12 = afVerboseLog + 125;
            afErrorLog = i12 % 128;
            int i13 = i12 % 2;
            z10 = true;
        }
        if (!z10) {
            return;
        }
        int i14 = afVerboseLog + 85;
        afErrorLog = i14 % 128;
        if (i14 % 2 == 0) {
            Map<String, Object> AFInAppEventParameterName = AFb1vSDK.AFInAppEventParameterName(map);
            Intrinsics.checkNotNullExpressionValue(AFInAppEventParameterName, "");
            AFInAppEventParameterName.put("gcd", hashMap);
        } else {
            Map<String, Object> AFInAppEventParameterName2 = AFb1vSDK.AFInAppEventParameterName(map);
            Intrinsics.checkNotNullExpressionValue(AFInAppEventParameterName2, "");
            AFInAppEventParameterName2.put("gcd", hashMap);
            throw null;
        }
    }

    @Override // com.appsflyer.internal.AFg1mSDK
    public final void AFInAppEventType(@NotNull AFa1qSDK aFa1qSDK) {
        int i10 = afVerboseLog + 9;
        afErrorLog = i10 % 128;
        int i11 = i10 % 2;
        Intrinsics.checkNotNullParameter(aFa1qSDK, "");
        Map<String, Object> AFInAppEventParameterName = aFa1qSDK.AFInAppEventParameterName();
        Intrinsics.checkNotNullExpressionValue(AFInAppEventParameterName, "");
        AFInAppEventType(AFInAppEventParameterName, aFa1qSDK.AFInAppEventType());
        registerClient(AFInAppEventParameterName);
        afWarnLog(AFInAppEventParameterName);
        values(AFInAppEventParameterName);
        AFInAppEventParameterName(AFInAppEventParameterName, this.afInfoLog.AFInAppEventType);
        AFLogger$LogLevel(AFInAppEventParameterName);
        AFInAppEventParameterName.put("cell", p0.g(new Pair(PaymentConstants.MCC, Integer.valueOf(this.AFKeystoreWrapper.getResources().getConfiguration().mcc)), new Pair("mnc", Integer.valueOf(this.AFKeystoreWrapper.getResources().getConfiguration().mnc))));
        AFInAppEventParameterName.put("sig", valueOf());
        AFInAppEventParameterName.put("last_boot_time", Long.valueOf(AFLogger()));
        AFInAppEventParameterName.put("disk", unregisterClient());
        int i12 = afErrorLog + 81;
        afVerboseLog = i12 % 128;
        if (i12 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.internal.AFg1mSDK
    public final void valueOf(@NotNull AFa1qSDK aFa1qSDK) {
        Intrinsics.checkNotNullParameter(aFa1qSDK, "");
        Map<String, Object> AFInAppEventParameterName = aFa1qSDK.AFInAppEventParameterName();
        Intrinsics.checkNotNullExpressionValue(AFInAppEventParameterName, "");
        AFInAppEventParameterName.put("open_referrer", aFa1qSDK.valueOf);
        String str = aFa1qSDK.f8391d;
        if (str != null) {
            int i10 = afErrorLog + 37;
            afVerboseLog = i10 % 128;
            if (i10 % 2 == 0) {
                int i11 = 18 / 0;
                if (!(!w.C(str))) {
                    return;
                }
            } else if (w.C(str)) {
                return;
            }
            int i12 = afVerboseLog + 79;
            afErrorLog = i12 % 128;
            if (i12 % 2 == 0) {
                AFInAppEventParameterName.put("af_web_referrer", aFa1qSDK.f8391d);
            } else {
                AFInAppEventParameterName.put("af_web_referrer", aFa1qSDK.f8391d);
                throw null;
            }
        }
    }

    private final void i(Map<String, Object> map) {
        if (AFg1dSDK.values(this.AFKeystoreWrapper)) {
            int i10 = afErrorLog + 115;
            afVerboseLog = i10 % 128;
            int i11 = i10 % 2;
            map.put("inst_app", Boolean.TRUE);
            int i12 = afVerboseLog + 51;
            afErrorLog = i12 % 128;
            int i13 = i12 % 2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003d, code lost:
    
        if (r0 > 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0026, code lost:
    
        if (r0 > 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0051, code lost:
    
        r0 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x003f, code lost:
    
        r0 = java.util.concurrent.TimeUnit.MILLISECONDS.toSeconds(r5 - r0);
        r2 = com.appsflyer.internal.AFg1jSDK.afVerboseLog + 95;
        com.appsflyer.internal.AFg1jSDK.afErrorLog = r2 % 128;
        r2 = r2 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void w(@org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> r9) {
        /*
            r8 = this;
            int r0 = com.appsflyer.internal.AFg1jSDK.afErrorLog
            int r0 = r0 + 59
            int r1 = r0 % 128
            com.appsflyer.internal.AFg1jSDK.afVerboseLog = r1
            int r0 = r0 % 2
            java.lang.String r1 = ""
            r2 = 0
            java.lang.String r4 = "AppsFlyerTimePassedSincePrevLaunch"
            if (r0 != 0) goto L29
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r1)
            com.appsflyer.internal.AFd1qSDK r0 = r8.AFLogger
            long r0 = r0.values(r4, r2)
            long r5 = java.lang.System.currentTimeMillis()
            com.appsflyer.internal.AFd1qSDK r7 = r8.AFLogger
            r7.AFKeystoreWrapper(r4, r5)
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 <= 0) goto L51
            goto L3f
        L29:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r1)
            com.appsflyer.internal.AFd1qSDK r0 = r8.AFLogger
            long r0 = r0.values(r4, r2)
            long r5 = java.lang.System.currentTimeMillis()
            com.appsflyer.internal.AFd1qSDK r7 = r8.AFLogger
            r7.AFKeystoreWrapper(r4, r5)
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 <= 0) goto L51
        L3f:
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r5 = r5 - r0
            long r0 = r2.toSeconds(r5)
            int r2 = com.appsflyer.internal.AFg1jSDK.afVerboseLog
            int r2 = r2 + 95
            int r3 = r2 % 128
            com.appsflyer.internal.AFg1jSDK.afErrorLog = r3
            int r2 = r2 % 2
            goto L53
        L51:
            r0 = -1
        L53:
            java.lang.String r2 = "timepassedsincelastlaunch"
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r9.put(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFg1jSDK.w(java.util.Map):void");
    }

    private void AFInAppEventParameterName(@NotNull Map<String, Object> map, String str) {
        Intrinsics.checkNotNullParameter(map, "");
        if (AFKeystoreWrapper().getBoolean(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, false)) {
            int i10 = afVerboseLog + 67;
            afErrorLog = i10 % 128;
            if (i10 % 2 == 0) {
                map.put(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, "true");
                return;
            } else {
                map.put(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, "true");
                int i11 = 50 / 0;
                return;
            }
        }
        String AFInAppEventParameterName = this.f8489d.AFInAppEventParameterName(this.AFLogger);
        if (AFInAppEventParameterName != null && AFInAppEventParameterName.length() != 0) {
            int i12 = afVerboseLog;
            int i13 = i12 + 5;
            afErrorLog = i13 % 128;
            int i14 = i13 % 2;
            int i15 = i12 + 59;
            afErrorLog = i15 % 128;
            if (i15 % 2 != 0) {
                map.put("imei", AFInAppEventParameterName);
                throw null;
            }
            map.put("imei", AFInAppEventParameterName);
        }
        String AFKeystoreWrapper = AFKeystoreWrapper(str);
        if (AFKeystoreWrapper != null) {
            int i16 = afErrorLog + 49;
            afVerboseLog = i16 % 128;
            int i17 = i16 % 2;
            this.AFLogger.AFInAppEventParameterName("androidIdCached", AFKeystoreWrapper);
            map.put("android_id", AFKeystoreWrapper);
        } else {
            AFLogger.afInfoLog("Android ID was not collected.");
        }
        AFb1zSDK AFInAppEventType = AFb1rSDK.AFInAppEventType(this.AFKeystoreWrapper);
        if (AFInAppEventType != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Boolean bool = AFInAppEventType.values;
            Intrinsics.checkNotNullExpressionValue(bool, "");
            linkedHashMap.put("isManual", bool);
            String str2 = AFInAppEventType.AFInAppEventParameterName;
            Intrinsics.checkNotNullExpressionValue(str2, "");
            linkedHashMap.put("val", str2);
            Boolean bool2 = AFInAppEventType.AFKeystoreWrapper;
            if (bool2 != null) {
                linkedHashMap.put("isLat", bool2);
            }
            map.put("oaid", linkedHashMap);
        }
    }

    private void v(@NotNull Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        long j10 = this.f8490e.f8504v;
        if (j10 != 0) {
            int i10 = afVerboseLog + 41;
            afErrorLog = i10 % 128;
            int i11 = i10 % 2;
            map.put("prev_session_dur", Long.valueOf(j10));
            int i12 = afVerboseLog + 63;
            afErrorLog = i12 % 128;
            int i13 = i12 % 2;
        }
        int i14 = afVerboseLog + 117;
        afErrorLog = i14 % 128;
        if (i14 % 2 != 0) {
            int i15 = 76 / 0;
        }
    }

    private static void valueOf(@NotNull Map<String, Object> map, String str) {
        Intrinsics.checkNotNullParameter(map, "");
        if (str != null) {
            int i10 = afErrorLog + 125;
            afVerboseLog = i10 % 128;
            int i11 = i10 % 2;
            map.put("phone", str);
            int i12 = afErrorLog + 81;
            afVerboseLog = i12 % 128;
            int i13 = i12 % 2;
        }
    }

    private static void valueOf(@NotNull Map<String, Object> map, boolean z10) {
        int i10 = afErrorLog + 71;
        afVerboseLog = i10 % 128;
        if (i10 % 2 == 0) {
            Intrinsics.checkNotNullParameter(map, "");
            map.put("af_preinstalled", String.valueOf(z10));
            throw null;
        }
        Intrinsics.checkNotNullParameter(map, "");
        map.put("af_preinstalled", String.valueOf(z10));
        int i11 = afErrorLog + 105;
        afVerboseLog = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    private static PackageInfo values(PackageManager packageManager, String str) {
        PackageManager.PackageInfoFlags of2;
        PackageInfo packageInfo;
        int i10 = afVerboseLog + 59;
        afErrorLog = i10 % 128;
        if (i10 % 2 == 0 ? Build.VERSION.SDK_INT >= 33 : Build.VERSION.SDK_INT >= 28) {
            of2 = PackageManager.PackageInfoFlags.of(0L);
            packageInfo = packageManager.getPackageInfo(str, of2);
            Intrinsics.checkNotNullExpressionValue(packageInfo, "");
            int i11 = afErrorLog + 77;
            afVerboseLog = i11 % 128;
            int i12 = i11 % 2;
            return packageInfo;
        }
        PackageInfo packageInfo2 = packageManager.getPackageInfo(str, 0);
        Intrinsics.checkNotNullExpressionValue(packageInfo2, "");
        return packageInfo2;
    }

    private void valueOf(@NotNull Map<String, Object> map, @NotNull Function0<String> function0) {
        Object mo2invoke;
        int i10 = afErrorLog + 33;
        afVerboseLog = i10 % 128;
        int i11 = i10 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(function0, "");
        if (AFKeystoreWrapper().getBoolean(AppsFlyerProperties.COLLECT_FACEBOOK_ATTR_ID, true)) {
            int i12 = afErrorLog + 103;
            afVerboseLog = i12 % 128;
            String str = null;
            try {
                if (i12 % 2 == 0) {
                    this.AFKeystoreWrapper.getPackageManager().getApplicationInfo("com.facebook.katana", 1);
                    mo2invoke = function0.mo2invoke();
                } else {
                    this.AFKeystoreWrapper.getPackageManager().getApplicationInfo("com.facebook.katana", 0);
                    mo2invoke = function0.mo2invoke();
                }
                str = (String) mo2invoke;
            } catch (PackageManager.NameNotFoundException e10) {
                AFLogger.afErrorLogForExcManagerOnly("com.facebook.katana not found", e10, true);
                AFLogger.afWarnLog("Exception while collecting facebook's attribution ID. ");
            } catch (Throwable th2) {
                AFLogger.afErrorLog("Exception while collecting facebook's attribution ID. ", th2);
            }
            if (str != null) {
                int i13 = afVerboseLog + 25;
                afErrorLog = i13 % 128;
                int i14 = i13 % 2;
                map.put("fb", str);
            }
        }
    }

    @Override // com.appsflyer.internal.AFg1mSDK
    public final void AFInAppEventType(@NotNull Map<String, Object> map) {
        String[] strArr;
        Intrinsics.checkNotNullParameter(map, "");
        String string = AFKeystoreWrapper().getString(AppsFlyerProperties.APP_ID);
        if (string != null) {
            map.put(AppsFlyerProperties.APP_ID, string);
            int i10 = afErrorLog + 21;
            afVerboseLog = i10 % 128;
            int i11 = i10 % 2;
        }
        String string2 = AFKeystoreWrapper().getString(AppsFlyerProperties.CURRENCY_CODE);
        if (string2 != null) {
            int i12 = afVerboseLog + 47;
            afErrorLog = i12 % 128;
            if (i12 % 2 == 0 ? string2.length() != 3 : string2.length() != 3) {
                StringBuilder sb2 = new StringBuilder("WARNING: currency code should be 3 characters!!! '");
                sb2.append(string2);
                sb2.append("' is not a legal value.");
                String obj = sb2.toString();
                Intrinsics.checkNotNullExpressionValue(obj, "");
                AFLogger.afWarnLog(obj);
            }
            map.put("currency", string2);
        }
        String string3 = AFKeystoreWrapper().getString(AppsFlyerProperties.IS_UPDATE);
        if (string3 != null) {
            int i13 = afVerboseLog + 117;
            afErrorLog = i13 % 128;
            int i14 = i13 % 2;
            map.put("isUpdate", string3);
        }
        String string4 = AFKeystoreWrapper().getString(AppsFlyerProperties.ADDITIONAL_CUSTOM_DATA);
        if (string4 != null) {
            map.put("customData", string4);
        }
        String string5 = AFKeystoreWrapper().getString(AppsFlyerProperties.APP_USER_ID);
        if (string5 != null) {
            map.put("appUserId", string5);
        }
        String string6 = AFKeystoreWrapper().getString(AppsFlyerProperties.USER_EMAILS);
        if (string6 != null) {
            map.put("user_emails", string6);
        }
        AFd1wSDK aFd1wSDK = this.afInfoLog.AFKeystoreWrapper;
        if (aFd1wSDK != null) {
            int i15 = afVerboseLog + 105;
            afErrorLog = i15 % 128;
            if (i15 % 2 != 0) {
                strArr = aFd1wSDK.AFInAppEventType;
                int i16 = 72 / 0;
                if (strArr == null) {
                    return;
                }
            } else {
                strArr = aFd1wSDK.AFInAppEventType;
                if (strArr == null) {
                    return;
                }
            }
            map.put("sharing_filter", strArr);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x005a, code lost:
    
        if (r3.length() == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0064, code lost:
    
        r7.AFKeystoreWrapper("gaidError", r1.AFKeystoreWrapper);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0061, code lost:
    
        if (r3.length() == 0) goto L22;
     */
    @Override // com.appsflyer.internal.AFg1mSDK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void AFKeystoreWrapper(@org.jetbrains.annotations.NotNull com.appsflyer.internal.AFa1qSDK r7) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFg1jSDK.AFKeystoreWrapper(com.appsflyer.internal.AFa1qSDK):void");
    }

    private void values(@NotNull Map<String, Object> map, boolean z10) {
        Intrinsics.checkNotNullParameter(map, "");
        map.put("platformextension", this.f8493w.valueOf());
        if (!z10) {
            return;
        }
        int i10 = afErrorLog + 75;
        afVerboseLog = i10 % 128;
        int i11 = i10 % 2;
        map.put("platform_extension_v2", this.valueOf.values());
        int i12 = afErrorLog + 13;
        afVerboseLog = i12 % 128;
        int i13 = i12 % 2;
    }

    private static String values(AFd1qSDK aFd1qSDK, String str) {
        String AFKeystoreWrapper = aFd1qSDK.AFKeystoreWrapper("CACHED_CHANNEL", (String) null);
        if (AFKeystoreWrapper != null) {
            int i10 = afErrorLog + 39;
            afVerboseLog = i10 % 128;
            int i11 = i10 % 2;
            return AFKeystoreWrapper;
        }
        aFd1qSDK.AFInAppEventParameterName("CACHED_CHANNEL", str);
        int i12 = afErrorLog + 97;
        afVerboseLog = i12 % 128;
        int i13 = i12 % 2;
        return str;
    }

    @Override // com.appsflyer.internal.AFg1mSDK
    public final void values(@NotNull Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        AFi1xSDK aFi1xSDK = this.registerClient.valueOf;
        AFi1wSDK AFInAppEventType = aFi1xSDK != null ? aFi1xSDK.AFInAppEventType() : null;
        if (AFInAppEventType == null) {
            int i10 = afVerboseLog + 61;
            afErrorLog = i10 % 128;
            int i11 = i10 % 2;
            return;
        }
        map.put(LogSubCategory.ApiCall.NETWORK, AFInAppEventType.AFInAppEventParameterName);
        map.put("ivc", Boolean.valueOf(AFInAppEventType.values()));
        if (!(!AFKeystoreWrapper().getBoolean(AppsFlyerProperties.DISABLE_NETWORK_DATA, false))) {
            return;
        }
        String str = AFInAppEventType.AFKeystoreWrapper;
        if (str != null) {
            map.put("operator", str);
        }
        String str2 = AFInAppEventType.values;
        if (str2 != null) {
            map.put("carrier", str2);
            int i12 = afVerboseLog + 71;
            afErrorLog = i12 % 128;
            int i13 = i12 % 2;
        }
    }

    private static File AFInAppEventParameterName(String str) {
        if (str == null) {
            return null;
        }
        int i10 = afVerboseLog + 101;
        afErrorLog = i10 % 128;
        int i11 = i10 % 2;
        try {
            if (w.X(str).toString().length() > 0) {
                int i12 = afVerboseLog + 125;
                afErrorLog = i12 % 128;
                int i13 = i12 % 2;
                return new File(w.X(str).toString());
            }
            int i14 = afVerboseLog + 79;
            afErrorLog = i14 % 128;
            int i15 = i14 % 2;
            return null;
        } catch (Throwable th2) {
            AFLogger.afErrorLog(th2.getMessage(), th2);
            return null;
        }
    }

    private final String valueOf(String str) {
        int i10 = afVerboseLog + 3;
        afErrorLog = i10 % 128;
        int i11 = i10 % 2;
        String AFInAppEventType = this.unregisterClient.AFInAppEventType(str);
        int i12 = afErrorLog + 73;
        afVerboseLog = i12 % 128;
        int i13 = i12 % 2;
        return AFInAppEventType;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008b  */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.Properties] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.Reader] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.io.Reader] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.io.Reader] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.io.Reader, java.io.InputStreamReader] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String valueOf(java.io.File r5, java.lang.String r6) {
        /*
            int r0 = com.appsflyer.internal.AFg1jSDK.afVerboseLog
            int r1 = r0 + 9
            int r2 = r1 % 128
            com.appsflyer.internal.AFg1jSDK.afErrorLog = r2
            int r1 = r1 % 2
            r1 = 0
            if (r5 != 0) goto L1c
            int r0 = r0 + 45
            int r5 = r0 % 128
            com.appsflyer.internal.AFg1jSDK.afErrorLog = r5
            int r0 = r0 % 2
            if (r0 == 0) goto L1b
            r5 = 9
            int r5 = r5 / 0
        L1b:
            return r1
        L1c:
            java.util.Properties r0 = new java.util.Properties     // Catch: java.lang.Throwable -> L4a java.io.FileNotFoundException -> L64
            r0.<init>()     // Catch: java.lang.Throwable -> L4a java.io.FileNotFoundException -> L64
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L4a java.io.FileNotFoundException -> L64
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L4a java.io.FileNotFoundException -> L64
            r3.<init>(r5)     // Catch: java.lang.Throwable -> L4a java.io.FileNotFoundException -> L64
            java.nio.charset.Charset r4 = java.nio.charset.Charset.defaultCharset()     // Catch: java.lang.Throwable -> L4a java.io.FileNotFoundException -> L64
            r2.<init>(r3, r4)     // Catch: java.lang.Throwable -> L4a java.io.FileNotFoundException -> L64
            r0.load(r2)     // Catch: java.lang.Throwable -> L48 java.io.FileNotFoundException -> L65
            java.lang.String r3 = "Found PreInstall property!"
            com.appsflyer.AFLogger.afInfoLog(r3)     // Catch: java.lang.Throwable -> L48 java.io.FileNotFoundException -> L65
            java.lang.String r5 = r0.getProperty(r6)     // Catch: java.lang.Throwable -> L48 java.io.FileNotFoundException -> L65
            r2.close()     // Catch: java.lang.Throwable -> L3f
            goto L47
        L3f:
            r6 = move-exception
            java.lang.String r0 = r6.getMessage()
            com.appsflyer.AFLogger.afErrorLog(r0, r6)
        L47:
            return r5
        L48:
            r5 = move-exception
            goto L4c
        L4a:
            r5 = move-exception
            r2 = r1
        L4c:
            java.lang.String r6 = r5.getMessage()     // Catch: java.lang.Throwable -> L62
            com.appsflyer.AFLogger.afErrorLog(r6, r5)     // Catch: java.lang.Throwable -> L62
            if (r2 == 0) goto L7f
            r2.close()     // Catch: java.lang.Throwable -> L59
            goto L7f
        L59:
            r5 = move-exception
            java.lang.String r6 = r5.getMessage()
            com.appsflyer.AFLogger.afErrorLog(r6, r5)
            goto L7f
        L62:
            r5 = move-exception
            goto L90
        L64:
            r2 = r1
        L65:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L62
            java.lang.String r0 = "PreInstall file wasn't found: "
            r6.<init>(r0)     // Catch: java.lang.Throwable -> L62
            java.lang.String r5 = r5.getAbsolutePath()     // Catch: java.lang.Throwable -> L62
            r6.append(r5)     // Catch: java.lang.Throwable -> L62
            java.lang.String r5 = r6.toString()     // Catch: java.lang.Throwable -> L62
            com.appsflyer.AFLogger.afDebugLog(r5)     // Catch: java.lang.Throwable -> L62
            if (r2 == 0) goto L7f
            r2.close()     // Catch: java.lang.Throwable -> L59
        L7f:
            int r5 = com.appsflyer.internal.AFg1jSDK.afErrorLog
            int r5 = r5 + 97
            int r6 = r5 % 128
            com.appsflyer.internal.AFg1jSDK.afVerboseLog = r6
            int r5 = r5 % 2
            if (r5 != 0) goto L8f
            r5 = 43
            int r5 = r5 / 0
        L8f:
            return r1
        L90:
            if (r2 == 0) goto L9e
            r2.close()     // Catch: java.lang.Throwable -> L96
            goto L9e
        L96:
            r6 = move-exception
            java.lang.String r0 = r6.getMessage()
            com.appsflyer.AFLogger.afErrorLog(r0, r6)
        L9e:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFg1jSDK.valueOf(java.io.File, java.lang.String):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
    
        r4 = com.appsflyer.internal.AFg1jSDK.afVerboseLog + 113;
        com.appsflyer.internal.AFg1jSDK.afErrorLog = r4 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0031, code lost:
    
        if ((r4 % 2) != 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0033, code lost:
    
        r0 = r0.getPackageName();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, "");
        r0 = values(r2, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003e, code lost:
    
        if (r0 == null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0046, code lost:
    
        return java.lang.Long.valueOf(r0.firstInstallTime);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0047, code lost:
    
        r0 = r0.getPackageName();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, "");
        values(r2, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0051, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0023, code lost:
    
        if (r2 != null) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001c, code lost:
    
        if (r2 != null) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0052, code lost:
    
        r0 = com.appsflyer.internal.AFg1jSDK.afVerboseLog + 57;
        com.appsflyer.internal.AFg1jSDK.afErrorLog = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x005c, code lost:
    
        if ((r0 % 2) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x005e, code lost:
    
        r3 = 73 / 0;
     */
    @Override // com.appsflyer.internal.AFg1mSDK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Long AFInAppEventParameterName() {
        /*
            r6 = this;
            com.appsflyer.internal.AFd1lSDK r0 = r6.force
            android.content.Context r0 = r0.AFKeystoreWrapper
            r1 = 0
            if (r0 == 0) goto L60
            int r2 = com.appsflyer.internal.AFg1jSDK.afVerboseLog
            r3 = 73
            int r2 = r2 + r3
            int r4 = r2 % 128
            com.appsflyer.internal.AFg1jSDK.afErrorLog = r4
            int r2 = r2 % 2
            if (r2 == 0) goto L1f
            android.content.pm.PackageManager r2 = r0.getPackageManager()
            r4 = 92
            int r4 = r4 / 0
            if (r2 == 0) goto L52
            goto L25
        L1f:
            android.content.pm.PackageManager r2 = r0.getPackageManager()
            if (r2 == 0) goto L52
        L25:
            int r4 = com.appsflyer.internal.AFg1jSDK.afVerboseLog
            int r4 = r4 + 113
            int r5 = r4 % 128
            com.appsflyer.internal.AFg1jSDK.afErrorLog = r5
            int r4 = r4 % 2
            java.lang.String r5 = ""
            if (r4 != 0) goto L47
            java.lang.String r0 = r0.getPackageName()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r5)
            android.content.pm.PackageInfo r0 = values(r2, r0)
            if (r0 == 0) goto L52
            long r0 = r0.firstInstallTime
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            return r0
        L47:
            java.lang.String r0 = r0.getPackageName()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r5)
            values(r2, r0)
            throw r1
        L52:
            int r0 = com.appsflyer.internal.AFg1jSDK.afVerboseLog
            int r0 = r0 + 57
            int r2 = r0 % 128
            com.appsflyer.internal.AFg1jSDK.afErrorLog = r2
            int r0 = r0 % 2
            if (r0 == 0) goto L60
            int r3 = r3 / 0
        L60:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFg1jSDK.AFInAppEventParameterName():java.lang.Long");
    }

    private static void AFInAppEventParameterName(@NotNull Map<String, Object> map, @NotNull AFa1qSDK aFa1qSDK) {
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(aFa1qSDK, "");
        String str = aFa1qSDK.f8392e;
        if (str != null) {
            map.put("eventName", str);
            Map map2 = aFa1qSDK.AFInAppEventParameterName;
            if (map2 == null) {
                map2 = new HashMap();
            }
            map.put("eventValue", new JSONObject(map2).toString());
        }
    }

    @Override // com.appsflyer.internal.AFg1mSDK
    public final long AFInAppEventType() {
        int i10 = afVerboseLog + 23;
        afErrorLog = i10 % 128;
        int i11 = i10 % 2;
        long currentTimeMillis = System.currentTimeMillis();
        int i12 = afErrorLog + 51;
        afVerboseLog = i12 % 128;
        int i13 = i12 % 2;
        return currentTimeMillis;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0052, code lost:
    
        if (r4.unregisterClient.AFKeystoreWrapper.valueOf("appsFlyerCount", 1) <= 2) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0063, code lost:
    
        r0.putAll(r4.values.valueOf());
        r6 = com.appsflyer.internal.AFg1jSDK.afVerboseLog + 27;
        com.appsflyer.internal.AFg1jSDK.afErrorLog = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0061, code lost:
    
        if (r4.unregisterClient.AFKeystoreWrapper.valueOf("appsFlyerCount", 0) <= 2) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void AFInAppEventType(@org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> r5, boolean r6) {
        /*
            r4 = this;
            java.lang.String r0 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.String r1 = "ro.product.cpu.abi"
            java.lang.String r1 = AFInAppEventType(r1)
            java.lang.String r2 = "cpu_abi"
            r0.put(r2, r1)
            java.lang.String r1 = "ro.product.cpu.abi2"
            java.lang.String r1 = AFInAppEventType(r1)
            java.lang.String r2 = "cpu_abi2"
            r0.put(r2, r1)
            java.lang.String r1 = "os.arch"
            java.lang.String r1 = AFInAppEventType(r1)
            java.lang.String r2 = "arch"
            r0.put(r2, r1)
            java.lang.String r1 = "ro.build.display.id"
            java.lang.String r1 = AFInAppEventType(r1)
            java.lang.String r2 = "build_display_id"
            r0.put(r2, r1)
            if (r6 == 0) goto L75
            int r6 = com.appsflyer.internal.AFg1jSDK.afErrorLog
            int r6 = r6 + 5
            int r1 = r6 % 128
            com.appsflyer.internal.AFg1jSDK.afVerboseLog = r1
            r1 = 2
            int r6 = r6 % r1
            java.lang.String r2 = "appsFlyerCount"
            if (r6 != 0) goto L55
            r4.e(r0)
            com.appsflyer.internal.AFd1sSDK r6 = r4.unregisterClient
            com.appsflyer.internal.AFd1qSDK r6 = r6.AFKeystoreWrapper
            r3 = 1
            int r6 = r6.valueOf(r2, r3)
            if (r6 > r1) goto L75
            goto L63
        L55:
            r4.e(r0)
            com.appsflyer.internal.AFd1sSDK r6 = r4.unregisterClient
            com.appsflyer.internal.AFd1qSDK r6 = r6.AFKeystoreWrapper
            r3 = 0
            int r6 = r6.valueOf(r2, r3)
            if (r6 > r1) goto L75
        L63:
            com.appsflyer.internal.AFi1cSDK r6 = r4.values
            java.util.Map r6 = r6.valueOf()
            r0.putAll(r6)
            int r6 = com.appsflyer.internal.AFg1jSDK.afVerboseLog
            int r6 = r6 + 27
            int r2 = r6 % 128
            com.appsflyer.internal.AFg1jSDK.afErrorLog = r2
            int r6 = r6 % r1
        L75:
            com.appsflyer.internal.AFa1bSDK r6 = r4.AFInAppEventType
            android.content.Context r1 = r4.AFKeystoreWrapper
            java.util.Map r6 = r6.valueOf(r1)
            java.lang.String r1 = "dim"
            r0.put(r1, r6)
            java.lang.String r6 = "deviceData"
            r5.put(r6, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFg1jSDK.AFInAppEventType(java.util.Map, boolean):void");
    }

    @Override // com.appsflyer.internal.AFg1mSDK
    public final void valueOf(@NotNull Map<String, Object> map) {
        Object a10;
        AFLogger aFLogger;
        AFg1aSDK aFg1aSDK;
        String str;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        int i10;
        Intrinsics.checkNotNullParameter(map, "");
        String str2 = this.afInfoLog.values;
        if (str2 != null) {
            if (map.get("af_deeplink") != null) {
                int i11 = afVerboseLog + 105;
                afErrorLog = i11 % 128;
                if (i11 % 2 != 0) {
                    AFLogger.afDebugLog("Skip 'af' payload as deeplink was found by path");
                    throw null;
                }
                AFLogger.afDebugLog("Skip 'af' payload as deeplink was found by path");
            } else {
                try {
                    l.Companion companion = ut.l.INSTANCE;
                    JSONObject jSONObject = new JSONObject(str2);
                    jSONObject.put("isPush", "true");
                    map.put("af_deeplink", jSONObject.toString());
                    a10 = Unit.f23355a;
                } catch (Throwable th2) {
                    l.Companion companion2 = ut.l.INSTANCE;
                    a10 = ut.n.a(th2);
                }
                Throwable a11 = ut.l.a(a10);
                if (a11 != null) {
                    int i12 = afErrorLog + 71;
                    afVerboseLog = i12 % 128;
                    if (i12 % 2 == 0) {
                        aFLogger = AFLogger.INSTANCE;
                        aFg1aSDK = AFg1aSDK.GENERAL;
                        str = "Exception while trying to create JSONObject from pushPayload";
                        z10 = false;
                        z11 = false;
                        z12 = false;
                        z13 = true;
                        i10 = 31;
                    } else {
                        aFLogger = AFLogger.INSTANCE;
                        aFg1aSDK = AFg1aSDK.GENERAL;
                        str = "Exception while trying to create JSONObject from pushPayload";
                        z10 = false;
                        z11 = false;
                        z12 = false;
                        z13 = false;
                        i10 = 120;
                    }
                    AFg1fSDK.e$default(aFLogger, aFg1aSDK, str, a11, z10, z11, z12, z13, i10, null);
                }
            }
        }
        this.afInfoLog.values = null;
    }

    private void AFKeystoreWrapper(@NotNull Map<String, Object> map, @NotNull String str) {
        int i10 = afVerboseLog + 43;
        afErrorLog = i10 % 128;
        int i11 = i10 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(str, "");
        try {
            String AFKeystoreWrapper = this.AFLogger.AFKeystoreWrapper("prev_event_name", (String) null);
            if (AFKeystoreWrapper != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("prev_event_timestamp", this.AFLogger.values("prev_event_timestamp", -1L));
                jSONObject.put("prev_event_name", AFKeystoreWrapper);
                map.put("prev_event", jSONObject);
            }
            this.AFLogger.AFInAppEventParameterName("prev_event_name", str);
            this.AFLogger.AFKeystoreWrapper("prev_event_timestamp", System.currentTimeMillis());
            int i12 = afErrorLog + 59;
            afVerboseLog = i12 % 128;
            int i13 = i12 % 2;
        } catch (Exception e10) {
            AFLogger.afErrorLog("Error while processing previous event.", e10);
        }
    }

    private void AFInAppEventType(@NotNull AFa1qSDK aFa1qSDK, String str, String str2, AFc1cSDK aFc1cSDK) {
        Intrinsics.checkNotNullParameter(aFa1qSDK, "");
        Map<String, Object> AFInAppEventParameterName = aFa1qSDK.AFInAppEventParameterName();
        if (aFa1qSDK.values() == AFf1zSDK.CONVERSION) {
            int i10 = afVerboseLog + 115;
            afErrorLog = i10 % 128;
            int i11 = i10 % 2;
            Intrinsics.checkNotNullExpressionValue(AFInAppEventParameterName, "");
            AFLogger(AFInAppEventParameterName);
            force(AFInAppEventParameterName);
            i(AFInAppEventParameterName);
            AFb1cSDK.valueOf(this.force, this.AFLogger);
        }
        Intrinsics.checkNotNullExpressionValue(AFInAppEventParameterName, "");
        w(AFInAppEventParameterName);
        d(AFInAppEventParameterName);
        unregisterClient(AFInAppEventParameterName);
        valueOf(AFInAppEventParameterName, str2);
        AFInAppEventType(AFInAppEventParameterName, str);
        v(AFInAppEventParameterName);
        if (aFc1cSDK != null) {
            aFc1cSDK.values(AFInAppEventParameterName);
            int i12 = afErrorLog + 35;
            afVerboseLog = i12 % 128;
            if (i12 % 2 == 0) {
                throw null;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003d, code lost:
    
        if (r6.length() == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0044, code lost:
    
        if (r6.length() == 0) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.String AFKeystoreWrapper(java.lang.String r6) {
        /*
            r5 = this;
            int r0 = com.appsflyer.internal.AFg1jSDK.afVerboseLog
            int r0 = r0 + 93
            int r1 = r0 % 128
            com.appsflyer.internal.AFg1jSDK.afErrorLog = r1
            int r0 = r0 % 2
            r1 = 0
            java.lang.String r2 = "collectAndroidId"
            r3 = 0
            r4 = 1
            if (r0 == 0) goto L1c
            com.appsflyer.AppsFlyerProperties r0 = r5.AFKeystoreWrapper()
            boolean r0 = r0.getBoolean(r2, r4)
            if (r0 == 0) goto L56
            goto L28
        L1c:
            com.appsflyer.AppsFlyerProperties r0 = r5.AFKeystoreWrapper()
            boolean r0 = r0.getBoolean(r2, r3)
            r0 = r0 ^ r4
            if (r0 == 0) goto L28
            goto L56
        L28:
            if (r6 == 0) goto L46
            int r0 = com.appsflyer.internal.AFg1jSDK.afVerboseLog
            int r0 = r0 + 11
            int r2 = r0 % 128
            com.appsflyer.internal.AFg1jSDK.afErrorLog = r2
            int r0 = r0 % 2
            if (r0 == 0) goto L40
            int r0 = r6.length()
            r2 = 99
            int r2 = r2 / r3
            if (r0 != 0) goto L47
            goto L46
        L40:
            int r0 = r6.length()
            if (r0 != 0) goto L47
        L46:
            r3 = r4
        L47:
            if (r3 == 0) goto L56
            boolean r6 = r5.force()
            if (r6 == r4) goto L51
        L4f:
            r6 = r1
            goto L62
        L51:
            java.lang.String r6 = r5.i()
            goto L62
        L56:
            if (r6 == 0) goto L4f
            int r0 = com.appsflyer.internal.AFg1jSDK.afErrorLog
            int r0 = r0 + 99
            int r1 = r0 % 128
            com.appsflyer.internal.AFg1jSDK.afVerboseLog = r1
            int r0 = r0 % 2
        L62:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFg1jSDK.AFKeystoreWrapper(java.lang.String):java.lang.String");
    }

    private static boolean AFKeystoreWrapper(File file) {
        int i10 = afErrorLog + 31;
        int i11 = i10 % 128;
        afVerboseLog = i11;
        if (i10 % 2 == 0) {
            throw null;
        }
        if (file == null) {
            return true;
        }
        int i12 = i11 + 65;
        afErrorLog = i12 % 128;
        int i13 = i12 % 2;
        boolean exists = file.exists();
        if (i13 != 0) {
            int i14 = 30 / 0;
            if (!exists) {
                return true;
            }
        } else if (!exists) {
            return true;
        }
        return false;
    }

    private void AFInAppEventType(@NotNull Map<String, Object> map, String str) {
        int i10 = afErrorLog + 95;
        afVerboseLog = i10 % 128;
        int i11 = i10 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        if (true ^ (str == null || str.length() == 0)) {
            map.put("referrer", str);
        }
        String AFKeystoreWrapper = this.AFLogger.AFKeystoreWrapper("extraReferrers", (String) null);
        if (AFKeystoreWrapper != null) {
            int i12 = afVerboseLog + 93;
            afErrorLog = i12 % 128;
            if (i12 % 2 != 0) {
                map.put("extraReferrers", AFKeystoreWrapper);
                int i13 = 25 / 0;
            } else {
                map.put("extraReferrers", AFKeystoreWrapper);
            }
        }
        String referrer = AFKeystoreWrapper().getReferrer(this.AFLogger);
        if (referrer == null || referrer.length() == 0) {
            int i14 = afVerboseLog + 25;
            afErrorLog = i14 % 128;
            int i15 = i14 % 2;
        } else if (map.get("referrer") == null) {
            int i16 = afVerboseLog + 51;
            afErrorLog = i16 % 128;
            if (i16 % 2 == 0) {
                map.put("referrer", referrer);
            } else {
                map.put("referrer", referrer);
                int i17 = 32 / 0;
            }
        }
    }

    @SuppressLint({"PrivateApi"})
    private static String AFInAppEventType(String str) {
        int i10 = afVerboseLog + 73;
        afErrorLog = i10 % 128;
        int i11 = i10 % 2;
        try {
            Object invoke = Class.forName("android.os.SystemProperties").getMethod("get", String.class).invoke(null, str);
            if (invoke != null) {
                String str2 = (String) invoke;
                int i12 = afVerboseLog + 35;
                afErrorLog = i12 % 128;
                int i13 = i12 % 2;
                return str2;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        } catch (Throwable th2) {
            AFLogger.afErrorLog(th2.getMessage(), th2);
            return null;
        }
    }
}
