package com.appsflyer.internal;

import android.content.Context;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.search.SearchAuth;
import in.juspay.hypersdk.core.PaymentConstants;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import okhttp3.HttpUrl;
import okhttp3.internal.http2.Settings;

/* loaded from: classes.dex */
public final class AFe1ySDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static String AFInAppEventParameterName = null;
    public static String AFKeystoreWrapper = null;
    private static int AFLogger = 0;

    /* renamed from: d, reason: collision with root package name */
    private static long f8436d = 0;

    /* renamed from: i, reason: collision with root package name */
    private static int f8437i = 1;
    private static int registerClient;
    private static char unregisterClient;
    private final AFd1sSDK AFInAppEventType;

    /* renamed from: e, reason: collision with root package name */
    private final AFe1gSDK f8438e;
    private final AFe1xSDK valueOf;
    private final AppsFlyerProperties values;

    static {
        AFInAppEventParameterName();
        AFKeystoreWrapper = "https://%sgcdsdk.%s/install_data/v5.0/";
        AFInAppEventParameterName = "https://%sonelink.%s/shortlink-sdk/v2";
        int i10 = f8437i + 43;
        AFLogger = i10 % 128;
        int i11 = i10 % 2;
    }

    public AFe1ySDK(AFe1xSDK aFe1xSDK, AFd1sSDK aFd1sSDK, AppsFlyerProperties appsFlyerProperties, AFe1gSDK aFe1gSDK) {
        this.valueOf = aFe1xSDK;
        this.AFInAppEventType = aFd1sSDK;
        this.values = appsFlyerProperties;
        this.f8438e = aFe1gSDK;
    }

    public static void AFInAppEventParameterName() {
        registerClient = 680283152;
        unregisterClient = (char) 54699;
        f8436d = -2499805256334160880L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static void a(int i10, char c10, String str, String str2, String str3, Object[] objArr) {
        char[] cArr;
        char[] cArr2;
        char[] cArr3;
        if (str3 != null) {
            int i11 = $11 + 37;
            $10 = i11 % 128;
            if (i11 % 2 != 0) {
                cArr = str3.toCharArray();
                int i12 = 35 / 0;
            } else {
                cArr = str3.toCharArray();
            }
        } else {
            cArr = str3;
        }
        char[] cArr4 = cArr;
        if (str2 != null) {
            int i13 = $10 + 9;
            $11 = i13 % 128;
            int i14 = i13 % 2;
            cArr2 = str2.toCharArray();
        } else {
            cArr2 = str2;
        }
        char[] cArr5 = cArr2;
        if (str != 0) {
            int i15 = $10 + 5;
            $11 = i15 % 128;
            int i16 = i15 % 2;
            cArr3 = str.toCharArray();
        } else {
            cArr3 = str;
        }
        AFj1eSDK aFj1eSDK = new AFj1eSDK();
        int length = cArr4.length;
        char[] cArr6 = new char[length];
        int length2 = cArr5.length;
        char[] cArr7 = new char[length2];
        System.arraycopy(cArr4, 0, cArr6, 0, length);
        System.arraycopy(cArr5, 0, cArr7, 0, length2);
        cArr6[0] = (char) (cArr6[0] ^ c10);
        cArr7[2] = (char) (cArr7[2] + ((char) i10));
        int length3 = cArr3.length;
        char[] cArr8 = new char[length3];
        aFj1eSDK.valueOf = 0;
        while (true) {
            int i17 = aFj1eSDK.valueOf;
            if (i17 < length3) {
                int i18 = $10 + 29;
                $11 = i18 % 128;
                int i19 = i18 % 2;
                int i20 = (i17 + 3) % 4;
                int i21 = cArr6[i17 % 4] * 32718;
                char c11 = cArr7[(i17 + 2) % 4];
                char c12 = (char) ((i21 + c11) % Settings.DEFAULT_INITIAL_WINDOW_SIZE);
                aFj1eSDK.AFKeystoreWrapper = c12;
                cArr7[i20] = (char) (((cArr6[i20] * 32718) + c11) / Settings.DEFAULT_INITIAL_WINDOW_SIZE);
                cArr6[i20] = c12;
                cArr8[i17] = (char) ((((r4[i17] ^ c12) ^ (f8436d ^ (-2499805256334160880L))) ^ ((int) (registerClient ^ (-2499805256334160880L)))) ^ ((char) (unregisterClient ^ (-2499805256334160880L))));
                aFj1eSDK.valueOf = i17 + 1;
            } else {
                objArr[0] = new String(cArr8);
                return;
            }
        }
    }

    public final AFe1sSDK<String> AFInAppEventType(Map<String, Object> map, String str, String str2) {
        String AFInAppEventParameterName2;
        int i10 = f8437i + 117;
        AFLogger = i10 % 128;
        boolean z10 = false;
        try {
            if (i10 % 2 != 0) {
                try {
                    Object[] objArr = {map, str};
                    Map<Integer, Object> map2 = AFa1uSDK.afRDLog;
                    Object obj = map2.get(-1459762567);
                    if (obj == null) {
                        obj = ((Class) AFa1uSDK.values((char) (28425 - View.resolveSize(0, 0)), TextUtils.indexOf(HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, 0, 0) + 36, 73 - KeyEvent.getDeadChar(0, 0))).getMethod("AFKeystoreWrapper", Map.class, String.class);
                        map2.put(-1459762567, obj);
                    }
                    throw null;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th2;
                }
            }
            try {
                Object[] objArr2 = {map, str};
                Map<Integer, Object> map3 = AFa1uSDK.afRDLog;
                Object obj2 = map3.get(-1459762567);
                if (obj2 == null) {
                    obj2 = ((Class) AFa1uSDK.values((char) (TextUtils.indexOf((CharSequence) HttpUrl.FRAGMENT_ENCODE_SET, '0', 0, 0) + 28426), 36 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 72)).getMethod("AFKeystoreWrapper", Map.class, String.class);
                    map3.put(-1459762567, obj2);
                }
                byte[] bArr = (byte[]) ((Method) obj2).invoke(null, objArr2);
                AFj1xSDK aFj1xSDK = new AFj1xSDK(this.AFInAppEventType);
                if (str2 == null || str2.length() == 0 || new Regex("4.?(\\d+)?.?(\\d+)").c(str2) || !(!new Regex("3.?(\\d+)?.?(\\d+)").c(str2))) {
                    int i11 = AFLogger + 95;
                    f8437i = i11 % 128;
                    int i12 = i11 % 2;
                    z10 = true;
                }
                if (!z10) {
                    AFInAppEventParameterName2 = aFj1xSDK.values.AFInAppEventParameterName("https://%sviap.%s/api/v1/android/validate_purchase_v2?app_id=");
                } else {
                    int i13 = AFLogger + 103;
                    f8437i = i13 % 128;
                    int i14 = i13 % 2;
                    AFInAppEventParameterName2 = aFj1xSDK.values.AFInAppEventParameterName("https://%sviap.%s/api/v1/android/validate_purchase?app_id=");
                    int i15 = AFLogger + 77;
                    f8437i = i15 % 128;
                    int i16 = i15 % 2;
                }
                StringBuilder p10 = da.e.p(AFInAppEventParameterName2);
                p10.append(aFj1xSDK.valueOf.valueOf.AFKeystoreWrapper.getPackageName());
                return AFKeystoreWrapper(new AFe1nSDK(aFj1xSDK.valueOf(p10.toString()), bArr, "POST", Collections.emptyMap(), true), new AFe1pSDK());
            } catch (Throwable th3) {
                Throwable cause2 = th3.getCause();
                if (cause2 != null) {
                    throw cause2;
                }
                throw th3;
            }
        } catch (Exception e10) {
            AFLogger.afErrorLogForExcManagerOnly("AFFinalizer: reflection init failed", e10);
            return null;
        }
        AFLogger.afErrorLogForExcManagerOnly("AFFinalizer: reflection init failed", e10);
        return null;
    }

    public final AFe1sSDK<String> AFKeystoreWrapper(AFa1qSDK aFa1qSDK, String str, AFd1lSDK aFd1lSDK) {
        int i10 = AFLogger + 9;
        f8437i = i10 % 128;
        int i11 = i10 % 2;
        try {
            Object[] objArr = {aFa1qSDK, str, aFd1lSDK};
            Map<Integer, Object> map = AFa1uSDK.afRDLog;
            Object obj = map.get(943641481);
            if (obj == null) {
                obj = ((Class) AFa1uSDK.values((char) (28426 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 36, 73 - ExpandableListView.getPackedPositionType(0L))).getMethod("AFInAppEventType", AFa1qSDK.class, String.class, AFd1lSDK.class);
                map.put(943641481, obj);
            }
            AFe1sSDK<String> AFKeystoreWrapper2 = AFKeystoreWrapper(new AFe1nSDK(aFa1qSDK.registerClient, (byte[]) ((Method) obj).invoke(null, objArr), "POST", Collections.emptyMap(), aFa1qSDK.valueOf()), new AFe1pSDK());
            int i12 = f8437i + 119;
            AFLogger = i12 % 128;
            if (i12 % 2 != 0) {
                int i13 = 27 / 0;
            }
            return AFKeystoreWrapper2;
        } catch (Throwable th2) {
            try {
                Throwable cause = th2.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th2;
            } catch (Throwable th3) {
                AFLogger.afErrorLogForExcManagerOnly("AFFinalizer: reflection init failed", th3);
                return null;
            }
        }
    }

    public final AFe1sSDK<String> valueOf(Map<String, Object> map, String str) {
        int i10 = f8437i + 117;
        AFLogger = i10 % 128;
        try {
            if (i10 % 2 != 0) {
                try {
                    Object[] objArr = {map, str};
                    Map<Integer, Object> map2 = AFa1uSDK.afRDLog;
                    Object obj = map2.get(-1459762567);
                    if (obj == null) {
                        obj = ((Class) AFa1uSDK.values((char) (28424 - MotionEvent.axisFromString(HttpUrl.FRAGMENT_ENCODE_SET)), View.resolveSizeAndState(0, 0, 0) + 36, 73 - (ViewConfiguration.getWindowTouchSlop() >> 8))).getMethod("AFKeystoreWrapper", Map.class, String.class);
                        map2.put(-1459762567, obj);
                    }
                    throw null;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th2;
                }
            }
            try {
                Object[] objArr2 = {map, str};
                Map<Integer, Object> map3 = AFa1uSDK.afRDLog;
                Object obj2 = map3.get(-1459762567);
                if (obj2 == null) {
                    obj2 = ((Class) AFa1uSDK.values((char) (28425 - TextUtils.indexOf(HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, 0)), 36 - View.MeasureSpec.makeMeasureSpec(0, 0), 73 - (ViewConfiguration.getDoubleTapTimeout() >> 16))).getMethod("AFKeystoreWrapper", Map.class, String.class);
                    map3.put(-1459762567, obj2);
                }
                byte[] bArr = (byte[]) ((Method) obj2).invoke(null, objArr2);
                AFj1xSDK aFj1xSDK = new AFj1xSDK(this.AFInAppEventType);
                StringBuilder p10 = da.e.p(aFj1xSDK.values.AFInAppEventParameterName("https://%svalidate-and-log.%s/api/v1.0/android/validateAndLog?app_id="));
                p10.append(aFj1xSDK.valueOf.valueOf.AFKeystoreWrapper.getPackageName());
                AFe1sSDK<String> AFKeystoreWrapper2 = AFKeystoreWrapper(new AFe1nSDK(p10.toString(), bArr, "POST", Collections.emptyMap(), true), new AFe1pSDK());
                int i11 = f8437i + 47;
                AFLogger = i11 % 128;
                if (i11 % 2 != 0) {
                    int i12 = 15 / 0;
                }
                return AFKeystoreWrapper2;
            } catch (Throwable th3) {
                Throwable cause2 = th3.getCause();
                if (cause2 != null) {
                    throw cause2;
                }
                throw th3;
            }
        } catch (Throwable th4) {
            AFLogger.INSTANCE.e(AFg1aSDK.PURCHASE_VALIDATION, "AFFinalizer: reflection init failed", th4, false, false);
            return null;
        }
        AFLogger.INSTANCE.e(AFg1aSDK.PURCHASE_VALIDATION, "AFFinalizer: reflection init failed", th4, false, false);
        return null;
    }

    public final AFe1sSDK<String> values(Map<String, Object> map, String str, String str2) {
        byte[] bArr;
        AFj1xSDK aFj1xSDK;
        String AFInAppEventParameterName2;
        int i10 = AFLogger + 67;
        f8437i = i10 % 128;
        try {
            if (i10 % 2 == 0) {
                try {
                    Object[] objArr = {map, str};
                    Map<Integer, Object> map2 = AFa1uSDK.afRDLog;
                    Object obj = map2.get(-1459762567);
                    if (obj == null) {
                        obj = ((Class) AFa1uSDK.values((char) (28424 - TextUtils.lastIndexOf(HttpUrl.FRAGMENT_ENCODE_SET, '0', 0)), 36 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 73 - Gravity.getAbsoluteGravity(0, 0))).getMethod("AFKeystoreWrapper", Map.class, String.class);
                        map2.put(-1459762567, obj);
                    }
                    bArr = (byte[]) ((Method) obj).invoke(null, objArr);
                    int i11 = 47 / 0;
                    byte[] bArr2 = bArr;
                    aFj1xSDK = new AFj1xSDK(this.AFInAppEventType);
                    if (str2 != null && str2.length() != 0) {
                        int i12 = AFLogger + 19;
                        f8437i = i12 % 128;
                        int i13 = i12 % 2;
                        if (!new Regex("4.?(\\d+)?.?(\\d+)").c(str2) && !new Regex("3.?(\\d+)?.?(\\d+)").c(str2)) {
                            AFInAppEventParameterName2 = aFj1xSDK.values.AFInAppEventParameterName("https://%sars.%s/api/v2/android/validate_subscription_v2?app_id=");
                            StringBuilder p10 = da.e.p(AFInAppEventParameterName2);
                            p10.append(aFj1xSDK.valueOf.valueOf.AFKeystoreWrapper.getPackageName());
                            return AFKeystoreWrapper(new AFe1nSDK(aFj1xSDK.valueOf(p10.toString()), bArr2, "POST", Collections.emptyMap(), true), new AFe1pSDK());
                        }
                    }
                    AFInAppEventParameterName2 = aFj1xSDK.values.AFInAppEventParameterName("https://%sars.%s/api/v2/android/validate_subscription?app_id=");
                    StringBuilder p102 = da.e.p(AFInAppEventParameterName2);
                    p102.append(aFj1xSDK.valueOf.valueOf.AFKeystoreWrapper.getPackageName());
                    return AFKeystoreWrapper(new AFe1nSDK(aFj1xSDK.valueOf(p102.toString()), bArr2, "POST", Collections.emptyMap(), true), new AFe1pSDK());
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th2;
                }
            }
            try {
                Object[] objArr2 = {map, str};
                Map<Integer, Object> map3 = AFa1uSDK.afRDLog;
                Object obj2 = map3.get(-1459762567);
                if (obj2 == null) {
                    obj2 = ((Class) AFa1uSDK.values((char) (28424 - TextUtils.indexOf((CharSequence) HttpUrl.FRAGMENT_ENCODE_SET, '0', 0)), (TypedValue.complexToFraction(0, s0.g.f34069a, s0.g.f34069a) > s0.g.f34069a ? 1 : (TypedValue.complexToFraction(0, s0.g.f34069a, s0.g.f34069a) == s0.g.f34069a ? 0 : -1)) + 36, (ViewConfiguration.getEdgeSlop() >> 16) + 73)).getMethod("AFKeystoreWrapper", Map.class, String.class);
                    map3.put(-1459762567, obj2);
                }
                bArr = (byte[]) ((Method) obj2).invoke(null, objArr2);
                byte[] bArr22 = bArr;
                aFj1xSDK = new AFj1xSDK(this.AFInAppEventType);
                if (str2 != null) {
                    int i122 = AFLogger + 19;
                    f8437i = i122 % 128;
                    int i132 = i122 % 2;
                    if (!new Regex("4.?(\\d+)?.?(\\d+)").c(str2)) {
                        AFInAppEventParameterName2 = aFj1xSDK.values.AFInAppEventParameterName("https://%sars.%s/api/v2/android/validate_subscription_v2?app_id=");
                        StringBuilder p1022 = da.e.p(AFInAppEventParameterName2);
                        p1022.append(aFj1xSDK.valueOf.valueOf.AFKeystoreWrapper.getPackageName());
                        return AFKeystoreWrapper(new AFe1nSDK(aFj1xSDK.valueOf(p1022.toString()), bArr22, "POST", Collections.emptyMap(), true), new AFe1pSDK());
                    }
                }
                AFInAppEventParameterName2 = aFj1xSDK.values.AFInAppEventParameterName("https://%sars.%s/api/v2/android/validate_subscription?app_id=");
                StringBuilder p10222 = da.e.p(AFInAppEventParameterName2);
                p10222.append(aFj1xSDK.valueOf.valueOf.AFKeystoreWrapper.getPackageName());
                return AFKeystoreWrapper(new AFe1nSDK(aFj1xSDK.valueOf(p10222.toString()), bArr22, "POST", Collections.emptyMap(), true), new AFe1pSDK());
            } catch (Throwable th3) {
                Throwable cause2 = th3.getCause();
                if (cause2 != null) {
                    throw cause2;
                }
                throw th3;
            }
        } catch (Exception e10) {
            AFLogger.afErrorLogForExcManagerOnly("AFFinalizer: reflection init failed", e10);
            return null;
        }
    }

    public final AFe1sSDK<String> AFInAppEventParameterName(@NonNull String str, @NonNull Map<String, String> map, String str2, @NonNull UUID uuid, @NonNull String str3) {
        String obj = uuid.toString();
        HashMap hashMap = new HashMap();
        hashMap.put("ttl", "-1");
        hashMap.put("uuid", obj);
        hashMap.put("data", map);
        hashMap.put("meta", valueOf());
        if (str2 != null) {
            int i10 = f8437i + 117;
            AFLogger = i10 % 128;
            if (i10 % 2 != 0) {
                hashMap.put("brand_domain", str2);
                int i11 = 45 / 0;
            } else {
                hashMap.put("brand_domain", str2);
            }
            int i12 = AFLogger + 65;
            f8437i = i12 % 128;
            int i13 = i12 % 2;
        }
        String jSONObject = AFa1oSDK.AFInAppEventType((Map<String, ?>) hashMap).toString();
        HashMap hashMap2 = new HashMap();
        Object[] objArr = new Object[1];
        a((AudioTrack.getMinVolume() > s0.g.f34069a ? 1 : (AudioTrack.getMinVolume() == s0.g.f34069a ? 0 : -1)), (char) (Process.myTid() >> 22), "㰯䃧럯僄蘿侇ᾟ\uf303\ue862腉\ud833凟", "\u0000\u0000\u0000\u0000", "왘됽䆵晻", objArr);
        hashMap2.put(((String) objArr[0]).intern(), AFInAppEventParameterName(str3, obj, "POST", jSONObject));
        StringBuilder sb2 = new StringBuilder();
        sb2.append(String.format(AFInAppEventParameterName, AppsFlyerLib.getInstance().getHostPrefix(), AFb1vSDK.AFKeystoreWrapper().getHostName()));
        sb2.append("/");
        sb2.append(str);
        return values(new AFe1nSDK(sb2.toString(), jSONObject.getBytes(Charset.defaultCharset()), "POST", hashMap2, false), (AFe1iSDK) new AFe1pSDK(), true);
    }

    @NonNull
    public final AFe1sSDK<AFc1pSDK> AFKeystoreWrapper(AFc1jSDK aFc1jSDK) {
        AFe1sSDK<AFc1pSDK> AFKeystoreWrapper2 = AFKeystoreWrapper(new AFe1nSDK(aFc1jSDK.registerClient, AFa1oSDK.AFInAppEventType((Map<String, ?>) aFc1jSDK.AFInAppEventParameterName()).toString().getBytes(Charset.defaultCharset()), "POST", Collections.emptyMap(), aFc1jSDK.valueOf()), new AFc1qSDK());
        int i10 = f8437i + 79;
        AFLogger = i10 % 128;
        if (i10 % 2 == 0) {
            return AFKeystoreWrapper2;
        }
        throw null;
    }

    public final AFe1sSDK<Map<String, String>> AFKeystoreWrapper(@NonNull String str, @NonNull String str2, @NonNull UUID uuid, @NonNull String str3) {
        String obj = uuid.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(String.format(AFInAppEventParameterName, AppsFlyerLib.getInstance().getHostPrefix(), AFb1vSDK.AFKeystoreWrapper().getHostName()));
        sb2.append("/");
        sb2.append(str);
        sb2.append("?id=");
        sb2.append(str2);
        String obj2 = sb2.toString();
        Map<String, Object> valueOf = valueOf();
        String valueOf2 = String.valueOf(valueOf.get("build_number"));
        HashMap hashMap = new HashMap();
        hashMap.put("Af-UUID", uuid.toString());
        hashMap.put("Af-Meta-Sdk-Ver", valueOf2);
        hashMap.put("Af-Meta-Counter", String.valueOf(valueOf.get("counter")));
        hashMap.put("Af-Meta-Model", String.valueOf(valueOf.get("model")));
        hashMap.put("Af-Meta-Platform", String.valueOf(valueOf.get("platformextension")));
        hashMap.put("Af-Meta-System-Version", String.valueOf(valueOf.get(PaymentConstants.Category.SDK)));
        Object[] objArr = new Object[1];
        a(Gravity.getAbsoluteGravity(0, 0), (char) (TypedValue.complexToFloat(0) > s0.g.f34069a ? 1 : (TypedValue.complexToFloat(0) == s0.g.f34069a ? 0 : -1)), "㰯䃧럯僄蘿侇ᾟ\uf303\ue862腉\ud833凟", "\u0000\u0000\u0000\u0000", "왘됽䆵晻", objArr);
        hashMap.put(((String) objArr[0]).intern(), AFInAppEventParameterName(str3, obj, "GET", obj, str, str2, valueOf2));
        AFe1sSDK<Map<String, String>> AFKeystoreWrapper2 = AFKeystoreWrapper(new AFe1nSDK(obj2, null, "GET", hashMap, false), new AFe1lSDK());
        int i10 = AFLogger + 9;
        f8437i = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 39 / 0;
        }
        return AFKeystoreWrapper2;
    }

    private Map<String, Object> valueOf() {
        HashMap hashMap = new HashMap();
        hashMap.put("build_number", "6.14.0");
        hashMap.put("counter", Integer.valueOf(this.AFInAppEventType.AFKeystoreWrapper.valueOf("appsFlyerCount", 0)));
        hashMap.put("model", Build.MODEL);
        Object[] objArr = new Object[1];
        a(1190071419 - View.resolveSizeAndState(0, 0, 0), (char) (TextUtils.lastIndexOf(HttpUrl.FRAGMENT_ENCODE_SET, '0') + 54887), "Ǌ䴭ᘙᙛ鄏", "\u0000\u0000\u0000\u0000", "筢\uef0c晆ᯖ", objArr);
        hashMap.put(((String) objArr[0]).intern(), Build.BRAND);
        hashMap.put(PaymentConstants.Category.SDK, Integer.toString(Build.VERSION.SDK_INT));
        Context context = this.AFInAppEventType.valueOf.AFKeystoreWrapper;
        hashMap.put("app_version_name", AFb1uSDK.AFInAppEventType(context, context.getPackageName()));
        hashMap.put("app_id", this.AFInAppEventType.valueOf.AFKeystoreWrapper.getPackageName());
        hashMap.put("platformextension", new AFb1hSDK().valueOf());
        int i10 = AFLogger + 19;
        f8437i = i10 % 128;
        if (i10 % 2 != 0) {
            return hashMap;
        }
        throw null;
    }

    private static String AFInAppEventParameterName(String str, String str2, String... strArr) {
        ArrayList arrayList = new ArrayList(Arrays.asList(strArr));
        arrayList.add(1, "v2");
        String join = TextUtils.join("\u2063", (String[]) arrayList.toArray(new String[0]));
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(str2);
        sb2.append("v2");
        String AFKeystoreWrapper2 = AFb1lSDK.AFKeystoreWrapper(join, sb2.toString());
        int i10 = AFLogger + 121;
        f8437i = i10 % 128;
        if (i10 % 2 != 0) {
            return AFKeystoreWrapper2;
        }
        throw null;
    }

    private <T> AFe1sSDK<T> values(AFe1nSDK aFe1nSDK, AFe1iSDK<T> aFe1iSDK, boolean z10) {
        aFe1nSDK.AFInAppEventParameterName = z10;
        AFe1xSDK aFe1xSDK = this.valueOf;
        AFe1sSDK<T> aFe1sSDK = new AFe1sSDK<>(aFe1nSDK, aFe1xSDK.AFInAppEventParameterName, aFe1xSDK.AFInAppEventType, aFe1iSDK);
        int i10 = f8437i + 23;
        AFLogger = i10 % 128;
        int i11 = i10 % 2;
        return aFe1sSDK;
    }

    @NonNull
    public final AFe1sSDK<AFi1zSDK> AFInAppEventType(boolean z10, boolean z11, @NonNull String str, int i10) {
        String str2;
        String str3;
        int i11 = f8437i + 91;
        AFLogger = i11 % 128;
        int i12 = i11 % 2;
        AFe1gSDK aFe1gSDK = this.f8438e;
        Intrinsics.checkNotNullParameter(str, "");
        String str4 = z10 ? AFe1gSDK.AFInAppEventParameterName : AFe1gSDK.AFInAppEventType;
        if (z11) {
            int i13 = AFLogger + 71;
            f8437i = i13 % 128;
            int i14 = i13 % 2;
            str2 = "stg";
        } else {
            int i15 = AFLogger + 71;
            f8437i = i15 % 128;
            int i16 = i15 % 2;
            str2 = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        Object[] objArr = new Object[4];
        if (AFe1gSDK.valueOf()) {
            int i17 = AFLogger + 73;
            f8437i = i17 % 128;
            if (i17 % 2 != 0) {
                str3 = (String) aFe1gSDK.AFInAppEventParameterName.getValue();
                int i18 = AFLogger + 57;
                f8437i = i18 % 128;
                int i19 = i18 % 2;
            } else {
                throw null;
            }
        } else {
            str3 = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        objArr[0] = str3;
        objArr[1] = str2;
        objArr[2] = aFe1gSDK.AFInAppEventParameterName();
        objArr[3] = str;
        AFe1nSDK aFe1nSDK = new AFe1nSDK(a3.a.m(objArr, 4, str4, HttpUrl.FRAGMENT_ENCODE_SET), "GET");
        aFe1nSDK.registerClient = ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED;
        return AFKeystoreWrapper(aFe1nSDK, new AFe1oSDK());
    }

    public final AFe1sSDK<String> AFKeystoreWrapper(@NonNull String str) {
        AFe1nSDK aFe1nSDK = new AFe1nSDK(str, null, "GET", Collections.emptyMap(), false);
        aFe1nSDK.registerClient = SearchAuth.StatusCodes.AUTH_DISABLED;
        aFe1nSDK.AFKeystoreWrapper = false;
        AFe1sSDK<String> AFKeystoreWrapper2 = AFKeystoreWrapper(aFe1nSDK, new AFe1pSDK());
        int i10 = f8437i + 57;
        AFLogger = i10 % 128;
        int i11 = i10 % 2;
        return AFKeystoreWrapper2;
    }

    public final AFe1wSDK AFKeystoreWrapper(Map<String, Object> map, String str) {
        int i10 = AFLogger + 55;
        f8437i = i10 % 128;
        int i11 = i10 % 2;
        try {
            try {
                Object[] objArr = {map, str};
                Map<Integer, Object> map2 = AFa1uSDK.afRDLog;
                Object obj = map2.get(-1459762567);
                if (obj == null) {
                    obj = ((Class) AFa1uSDK.values((char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 28425), View.resolveSizeAndState(0, 0, 0) + 36, (AudioTrack.getMinVolume() > s0.g.f34069a ? 1 : (AudioTrack.getMinVolume() == s0.g.f34069a ? 0 : -1)) + 73)).getMethod("AFKeystoreWrapper", Map.class, String.class);
                    map2.put(-1459762567, obj);
                }
                byte[] bArr = (byte[]) ((Method) obj).invoke(null, objArr);
                if (bArr == null) {
                    AFLogger.afErrorLogForExcManagerOnly("AFFinalizer: failed to create bytes", new IllegalArgumentException("failed to create bytes from proxyData"));
                    return null;
                }
                AFe1wSDK aFe1wSDK = new AFe1wSDK(this.AFInAppEventType, bArr);
                int i12 = f8437i + 19;
                AFLogger = i12 % 128;
                if (i12 % 2 == 0) {
                    return aFe1wSDK;
                }
                throw null;
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th2;
            }
        } catch (Exception e10) {
            AFLogger.afErrorLogForExcManagerOnly("AFFinalizer: reflection init failed", e10);
            return null;
        }
    }

    private <T> AFe1sSDK<T> AFKeystoreWrapper(AFe1nSDK aFe1nSDK, AFe1iSDK<T> aFe1iSDK) {
        int i10 = f8437i + 103;
        AFLogger = i10 % 128;
        int i11 = i10 % 2;
        AFe1sSDK<T> values = values(aFe1nSDK, aFe1iSDK, AFInAppEventType());
        int i12 = AFLogger + 15;
        f8437i = i12 % 128;
        if (i12 % 2 != 0) {
            return values;
        }
        throw null;
    }

    public final AFe1sSDK<String> AFInAppEventType(AFh1qSDK aFh1qSDK) {
        AFe1sSDK<String> AFKeystoreWrapper2 = AFKeystoreWrapper(new AFe1nSDK(aFh1qSDK.registerClient, aFh1qSDK.AFKeystoreWrapper(), "POST", Collections.emptyMap(), true), new AFe1pSDK());
        int i10 = f8437i + 9;
        AFLogger = i10 % 128;
        int i11 = i10 % 2;
        return AFKeystoreWrapper2;
    }

    public final AFe1sSDK<Map<String, Object>> AFKeystoreWrapper(String str, String str2) {
        String packageName = this.AFInAppEventType.valueOf.AFKeystoreWrapper.getPackageName();
        AFd1sSDK aFd1sSDK = this.AFInAppEventType;
        AFe1sSDK<Map<String, Object>> AFKeystoreWrapper2 = AFKeystoreWrapper(AFe1rSDK.AFInAppEventParameterName(packageName, AFb1kSDK.valueOf(aFd1sSDK.valueOf, aFd1sSDK.AFKeystoreWrapper), str, str2), new AFe1tSDK());
        int i10 = AFLogger + 67;
        f8437i = i10 % 128;
        int i11 = i10 % 2;
        return AFKeystoreWrapper2;
    }

    private boolean AFInAppEventType() {
        if (!this.values.getBoolean(AppsFlyerProperties.HTTP_CACHE, true)) {
            int i10 = f8437i + 85;
            AFLogger = i10 % 128;
            return i10 % 2 == 0;
        }
        int i11 = AFLogger + 83;
        f8437i = i11 % 128;
        int i12 = i11 % 2;
        return false;
    }
}
