package com.appsflyer.internal;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFd1jSDK;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import in.juspay.hypersdk.core.PaymentConstants;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import okhttp3.HttpUrl;
import okhttp3.internal.http2.Settings;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import vt.o0;
import vt.p0;

/* loaded from: classes.dex */
public final class AFd1iSDK implements AFd1jSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static long afInfoLog = -3294779024785760528L;
    private static int force = 680283152;

    /* renamed from: i */
    private static char f8412i = 19472;

    /* renamed from: v */
    private static int f8413v = 0;

    /* renamed from: w */
    private static int f8414w = 1;

    @NotNull
    private final ut.g AFInAppEventParameterName;

    @NotNull
    private final ut.g AFInAppEventType;

    @NotNull
    private AFd1kSDK AFKeystoreWrapper;
    private AFd1jSDK.AFa1zSDK AFLogger;

    /* renamed from: d */
    @NotNull
    private final ut.g f8415d;

    /* renamed from: e */
    @NotNull
    private final ut.g f8416e;

    @NotNull
    private final String registerClient;

    @NotNull
    private final ut.g unregisterClient;

    @NotNull
    private final ut.g valueOf;

    @NotNull
    private final ut.g values;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/appsflyer/internal/AFf1bSDK;", "valueOf", "()Lcom/appsflyer/internal/AFf1bSDK;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFd1iSDK$1 */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends iu.k implements Function0<AFf1bSDK> {
        public AnonymousClass1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: valueOf */
        public final AFf1bSDK mo2invoke() {
            AFf1bSDK registerClient = AFd1iSDK.AFKeystoreWrapper(AFd1iSDK.this).registerClient();
            Intrinsics.checkNotNullExpressionValue(registerClient, "");
            return registerClient;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljava/util/concurrent/ExecutorService;", "valueOf", "()Ljava/util/concurrent/ExecutorService;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFd1iSDK$2 */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends iu.k implements Function0<ExecutorService> {
        public AnonymousClass2() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: valueOf */
        public final ExecutorService mo2invoke() {
            ExecutorService values = AFd1iSDK.AFKeystoreWrapper(AFd1iSDK.this).values();
            Intrinsics.checkNotNullExpressionValue(values, "");
            return values;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/appsflyer/internal/AFd1qSDK;", "values", "()Lcom/appsflyer/internal/AFd1qSDK;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFd1iSDK$3 */
    /* loaded from: classes.dex */
    public static final class AnonymousClass3 extends iu.k implements Function0<AFd1qSDK> {
        public AnonymousClass3() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: values */
        public final AFd1qSDK mo2invoke() {
            AFd1qSDK valueOf = AFd1iSDK.AFKeystoreWrapper(AFd1iSDK.this).valueOf();
            Intrinsics.checkNotNullExpressionValue(valueOf, "");
            return valueOf;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/appsflyer/internal/AFd1hSDK;", "AFInAppEventParameterName", "()Lcom/appsflyer/internal/AFd1hSDK;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFd1iSDK$4 */
    /* loaded from: classes.dex */
    public static final class AnonymousClass4 extends iu.k implements Function0<AFd1hSDK> {
        public AnonymousClass4() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: AFInAppEventParameterName */
        public final AFd1hSDK mo2invoke() {
            AFd1lSDK w10 = AFd1iSDK.AFKeystoreWrapper(AFd1iSDK.this).w();
            Intrinsics.checkNotNullExpressionValue(w10, "");
            return new AFd1hSDK(w10);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/appsflyer/internal/AFd1sSDK;", "values", "()Lcom/appsflyer/internal/AFd1sSDK;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFd1iSDK$5 */
    /* loaded from: classes.dex */
    public static final class AnonymousClass5 extends iu.k implements Function0<AFd1sSDK> {
        public AnonymousClass5() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: values */
        public final AFd1sSDK mo2invoke() {
            AFd1sSDK AFInAppEventType = AFd1iSDK.AFKeystoreWrapper(AFd1iSDK.this).AFInAppEventType();
            Intrinsics.checkNotNullExpressionValue(AFInAppEventType, "");
            return AFInAppEventType;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/appsflyer/internal/AFd1cSDK;", "AFInAppEventType", "()Lcom/appsflyer/internal/AFd1cSDK;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFd1iSDK$7 */
    /* loaded from: classes.dex */
    public static final class AnonymousClass7 extends iu.k implements Function0<AFd1cSDK> {
        public AnonymousClass7() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: AFInAppEventType */
        public final AFd1cSDK mo2invoke() {
            return new AFd1cSDK(AFd1iSDK.this.valueOf());
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/appsflyer/internal/AFg1wSDK;", "AFInAppEventType", "()Lcom/appsflyer/internal/AFg1wSDK;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFd1iSDK$8 */
    /* loaded from: classes.dex */
    public static final class AnonymousClass8 extends iu.k implements Function0<AFg1wSDK> {
        public AnonymousClass8() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: AFInAppEventType */
        public final AFg1wSDK mo2invoke() {
            AFg1wSDK i10 = AFd1iSDK.AFKeystoreWrapper(AFd1iSDK.this).i();
            Intrinsics.checkNotNullExpressionValue(i10, "");
            return i10;
        }
    }

    public AFd1iSDK(@NotNull AFd1kSDK aFd1kSDK) {
        Intrinsics.checkNotNullParameter(aFd1kSDK, "");
        this.AFKeystoreWrapper = aFd1kSDK;
        this.values = ut.h.a(new AnonymousClass1());
        this.AFInAppEventType = ut.h.a(new AnonymousClass5());
        this.AFInAppEventParameterName = ut.h.a(new AnonymousClass3());
        this.valueOf = ut.h.a(new AnonymousClass8());
        this.unregisterClient = ut.h.a(new AnonymousClass2());
        this.registerClient = "6.14.0";
        this.f8415d = ut.h.a(new AnonymousClass4());
        this.f8416e = ut.h.a(new AnonymousClass7());
    }

    public static final void AFInAppEventParameterName(AFd1iSDK aFd1iSDK, Throwable th2, String str) {
        Intrinsics.checkNotNullParameter(aFd1iSDK, "");
        Intrinsics.checkNotNullParameter(th2, "");
        Intrinsics.checkNotNullParameter(str, "");
        AFh1fSDK e10 = aFd1iSDK.e();
        if (e10 == null || !aFd1iSDK.AFKeystoreWrapper(e10)) {
            return;
        }
        int i10 = f8414w + 103;
        int i11 = i10 % 128;
        f8413v = i11;
        int i12 = i10 % 2;
        int i13 = i11 + 93;
        int i14 = i13 % 128;
        f8414w = i14;
        int i15 = i13 % 2;
        int i16 = i14 + 3;
        f8413v = i16 % 128;
        int i17 = i16 % 2;
        aFd1iSDK.valueOf().AFInAppEventParameterName(th2, str);
    }

    public static final void AFInAppEventType(AFd1iSDK aFd1iSDK) {
        int i10 = f8413v + 93;
        f8414w = i10 % 128;
        int i11 = i10 % 2;
        Intrinsics.checkNotNullParameter(aFd1iSDK, "");
        aFd1iSDK.w();
        int i12 = f8414w + 35;
        f8413v = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 87 / 0;
        }
    }

    public static final /* synthetic */ AFd1kSDK AFKeystoreWrapper(AFd1iSDK aFd1iSDK) {
        int i10 = f8413v + 25;
        int i11 = i10 % 128;
        f8414w = i11;
        int i12 = i10 % 2;
        AFd1kSDK aFd1kSDK = aFd1iSDK.AFKeystoreWrapper;
        if (i12 == 0) {
            throw null;
        }
        int i13 = i11 + 87;
        f8413v = i13 % 128;
        if (i13 % 2 != 0) {
            int i14 = 67 / 0;
        }
        return aFd1kSDK;
    }

    private final ExecutorService AFLogger() {
        int i10 = f8414w + 15;
        f8413v = i10 % 128;
        int i11 = i10 % 2;
        ExecutorService executorService = (ExecutorService) this.unregisterClient.getValue();
        int i12 = f8414w + 101;
        f8413v = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 89 / 0;
        }
        return executorService;
    }

    private final AFh1fSDK e() {
        AFi1zSDK aFi1zSDK;
        int i10 = f8413v + 125;
        f8414w = i10 % 128;
        if (i10 % 2 == 0) {
            aFi1zSDK = AFKeystoreWrapper().valueOf.valueOf;
            int i11 = 85 / 0;
            if (aFi1zSDK == null) {
                return null;
            }
        } else {
            aFi1zSDK = AFKeystoreWrapper().valueOf.valueOf;
            if (aFi1zSDK == null) {
                return null;
            }
        }
        AFh1gSDK aFh1gSDK = aFi1zSDK.AFInAppEventParameterName;
        if (aFh1gSDK != null) {
            AFh1fSDK aFh1fSDK = aFh1gSDK.valueOf;
            int i12 = f8414w + 27;
            f8413v = i12 % 128;
            int i13 = i12 % 2;
            return aFh1fSDK;
        }
        return null;
    }

    private final void i() {
        int i10 = f8413v + 51;
        f8414w = i10 % 128;
        int i11 = i10 % 2;
        AFh1fSDK e10 = e();
        if (e10 != null) {
            if (!(!values(e10))) {
                int i12 = f8413v + 81;
                f8414w = i12 % 128;
                int i13 = i12 % 2;
                String str = unregisterClient().AFLogger;
                if (str != null) {
                    String jSONObject = new JSONObject(AFInAppEventParameterName(AFInAppEventParameterName(e10), valueOf().AFInAppEventParameterName())).toString();
                    Intrinsics.checkNotNullExpressionValue(jSONObject, "");
                    Intrinsics.checkNotNullExpressionValue(str, "");
                    valueOf(jSONObject, str);
                    return;
                }
                return;
            }
            AFg1fSDK.v$default(AFLogger.INSTANCE, AFg1aSDK.EXCEPTION_MANAGER, "skipping", false, 4, null);
            int i14 = f8414w + 57;
            f8413v = i14 % 128;
            if (i14 % 2 == 0) {
            } else {
                throw null;
            }
        }
    }

    private final AFd1qSDK registerClient() {
        int i10 = f8413v + 123;
        f8414w = i10 % 128;
        int i11 = i10 % 2;
        AFd1qSDK aFd1qSDK = (AFd1qSDK) this.AFInAppEventParameterName.getValue();
        int i12 = f8413v + 37;
        f8414w = i12 % 128;
        int i13 = i12 % 2;
        return aFd1qSDK;
    }

    private final AFg1wSDK unregisterClient() {
        int i10 = f8413v + 123;
        f8414w = i10 % 128;
        int i11 = i10 % 2;
        AFg1wSDK aFg1wSDK = (AFg1wSDK) this.valueOf.getValue();
        int i12 = f8413v + 25;
        f8414w = i12 % 128;
        int i13 = i12 % 2;
        return aFg1wSDK;
    }

    private final synchronized void v() {
        boolean z10;
        try {
            int i10 = f8413v + 121;
            f8414w = i10 % 128;
            int i11 = i10 % 2;
            AFh1fSDK e10 = e();
            if (e10 != null) {
                if (e10.AFInAppEventType == -1) {
                    registerClient().AFKeystoreWrapper("af_send_exc_to_server_window");
                } else if (registerClient().values("af_send_exc_to_server_window", -1L) == -1) {
                    valueOf(e10);
                }
                z10 = AFKeystoreWrapper(e10);
                int i12 = f8414w + 13;
                f8413v = i12 % 128;
                int i13 = i12 % 2;
            } else {
                z10 = false;
            }
            AFd1jSDK.AFa1zSDK aFa1zSDK = this.AFLogger;
            if (aFa1zSDK != null) {
                int i14 = f8414w + 11;
                f8413v = i14 % 128;
                int i15 = i14 % 2;
                aFa1zSDK.onConfigurationChanged(z10);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private final AFd1sSDK values() {
        int i10 = f8414w + 81;
        f8413v = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
        AFd1sSDK aFd1sSDK = (AFd1sSDK) this.AFInAppEventType.getValue();
        int i11 = f8413v + 29;
        f8414w = i11 % 128;
        if (i11 % 2 != 0) {
            return aFd1sSDK;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x0133, code lost:
    
        if (r0.intValue() != (-1)) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x00eb, code lost:
    
        if (r0 != null) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0063, code lost:
    
        if (AFInAppEventType(r0) == true) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00e2, code lost:
    
        if (r0 != null) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00ed, code lost:
    
        r0 = r0.intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01d9, code lost:
    
        if (r1 != null) goto L235;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01e4, code lost:
    
        r2 = AFKeystoreWrapper(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01e2, code lost:
    
        if (r1 != null) goto L235;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x012f A[Catch: all -> 0x000a, TryCatch #1 {all -> 0x000a, blocks: (B:3:0x0001, B:5:0x0007, B:6:0x000f, B:8:0x001e, B:12:0x0045, B:14:0x004c, B:16:0x0058, B:19:0x0065, B:21:0x006d, B:23:0x0071, B:25:0x0083, B:27:0x0094, B:29:0x0098, B:31:0x009e, B:32:0x00a4, B:34:0x00b0, B:36:0x00b4, B:38:0x00ba, B:39:0x00c0, B:41:0x00cc, B:43:0x00d0, B:45:0x00db, B:50:0x00ed, B:51:0x00f3, B:52:0x00f6, B:53:0x00fc, B:55:0x0102, B:57:0x010f, B:58:0x0115, B:60:0x011b, B:62:0x011f, B:64:0x0125, B:66:0x0137, B:67:0x01c3, B:69:0x01c7, B:71:0x01d2, B:76:0x01e8, B:79:0x01e4, B:82:0x01dd, B:83:0x01de, B:88:0x0148, B:90:0x0153, B:96:0x016f, B:97:0x0170, B:99:0x018a, B:100:0x01a2, B:101:0x012f, B:106:0x00e6, B:107:0x00e7, B:114:0x005f, B:116:0x01b3, B:48:0x00e1, B:74:0x01d8, B:93:0x016c), top: B:2:0x0001, inners: #0, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0125 A[Catch: all -> 0x000a, TryCatch #1 {all -> 0x000a, blocks: (B:3:0x0001, B:5:0x0007, B:6:0x000f, B:8:0x001e, B:12:0x0045, B:14:0x004c, B:16:0x0058, B:19:0x0065, B:21:0x006d, B:23:0x0071, B:25:0x0083, B:27:0x0094, B:29:0x0098, B:31:0x009e, B:32:0x00a4, B:34:0x00b0, B:36:0x00b4, B:38:0x00ba, B:39:0x00c0, B:41:0x00cc, B:43:0x00d0, B:45:0x00db, B:50:0x00ed, B:51:0x00f3, B:52:0x00f6, B:53:0x00fc, B:55:0x0102, B:57:0x010f, B:58:0x0115, B:60:0x011b, B:62:0x011f, B:64:0x0125, B:66:0x0137, B:67:0x01c3, B:69:0x01c7, B:71:0x01d2, B:76:0x01e8, B:79:0x01e4, B:82:0x01dd, B:83:0x01de, B:88:0x0148, B:90:0x0153, B:96:0x016f, B:97:0x0170, B:99:0x018a, B:100:0x01a2, B:101:0x012f, B:106:0x00e6, B:107:0x00e7, B:114:0x005f, B:116:0x01b3, B:48:0x00e1, B:74:0x01d8, B:93:0x016c), top: B:2:0x0001, inners: #0, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0137 A[Catch: all -> 0x000a, TryCatch #1 {all -> 0x000a, blocks: (B:3:0x0001, B:5:0x0007, B:6:0x000f, B:8:0x001e, B:12:0x0045, B:14:0x004c, B:16:0x0058, B:19:0x0065, B:21:0x006d, B:23:0x0071, B:25:0x0083, B:27:0x0094, B:29:0x0098, B:31:0x009e, B:32:0x00a4, B:34:0x00b0, B:36:0x00b4, B:38:0x00ba, B:39:0x00c0, B:41:0x00cc, B:43:0x00d0, B:45:0x00db, B:50:0x00ed, B:51:0x00f3, B:52:0x00f6, B:53:0x00fc, B:55:0x0102, B:57:0x010f, B:58:0x0115, B:60:0x011b, B:62:0x011f, B:64:0x0125, B:66:0x0137, B:67:0x01c3, B:69:0x01c7, B:71:0x01d2, B:76:0x01e8, B:79:0x01e4, B:82:0x01dd, B:83:0x01de, B:88:0x0148, B:90:0x0153, B:96:0x016f, B:97:0x0170, B:99:0x018a, B:100:0x01a2, B:101:0x012f, B:106:0x00e6, B:107:0x00e7, B:114:0x005f, B:116:0x01b3, B:48:0x00e1, B:74:0x01d8, B:93:0x016c), top: B:2:0x0001, inners: #0, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01c7 A[Catch: all -> 0x000a, TryCatch #1 {all -> 0x000a, blocks: (B:3:0x0001, B:5:0x0007, B:6:0x000f, B:8:0x001e, B:12:0x0045, B:14:0x004c, B:16:0x0058, B:19:0x0065, B:21:0x006d, B:23:0x0071, B:25:0x0083, B:27:0x0094, B:29:0x0098, B:31:0x009e, B:32:0x00a4, B:34:0x00b0, B:36:0x00b4, B:38:0x00ba, B:39:0x00c0, B:41:0x00cc, B:43:0x00d0, B:45:0x00db, B:50:0x00ed, B:51:0x00f3, B:52:0x00f6, B:53:0x00fc, B:55:0x0102, B:57:0x010f, B:58:0x0115, B:60:0x011b, B:62:0x011f, B:64:0x0125, B:66:0x0137, B:67:0x01c3, B:69:0x01c7, B:71:0x01d2, B:76:0x01e8, B:79:0x01e4, B:82:0x01dd, B:83:0x01de, B:88:0x0148, B:90:0x0153, B:96:0x016f, B:97:0x0170, B:99:0x018a, B:100:0x01a2, B:101:0x012f, B:106:0x00e6, B:107:0x00e7, B:114:0x005f, B:116:0x01b3, B:48:0x00e1, B:74:0x01d8, B:93:0x016c), top: B:2:0x0001, inners: #0, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01ed A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0148 A[Catch: all -> 0x000a, TryCatch #1 {all -> 0x000a, blocks: (B:3:0x0001, B:5:0x0007, B:6:0x000f, B:8:0x001e, B:12:0x0045, B:14:0x004c, B:16:0x0058, B:19:0x0065, B:21:0x006d, B:23:0x0071, B:25:0x0083, B:27:0x0094, B:29:0x0098, B:31:0x009e, B:32:0x00a4, B:34:0x00b0, B:36:0x00b4, B:38:0x00ba, B:39:0x00c0, B:41:0x00cc, B:43:0x00d0, B:45:0x00db, B:50:0x00ed, B:51:0x00f3, B:52:0x00f6, B:53:0x00fc, B:55:0x0102, B:57:0x010f, B:58:0x0115, B:60:0x011b, B:62:0x011f, B:64:0x0125, B:66:0x0137, B:67:0x01c3, B:69:0x01c7, B:71:0x01d2, B:76:0x01e8, B:79:0x01e4, B:82:0x01dd, B:83:0x01de, B:88:0x0148, B:90:0x0153, B:96:0x016f, B:97:0x0170, B:99:0x018a, B:100:0x01a2, B:101:0x012f, B:106:0x00e6, B:107:0x00e7, B:114:0x005f, B:116:0x01b3, B:48:0x00e1, B:74:0x01d8, B:93:0x016c), top: B:2:0x0001, inners: #0, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0188  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final synchronized void w() {
        /*
            Method dump skipped, instructions count: 497
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFd1iSDK.w():void");
    }

    @NotNull
    public final AFd1gSDK valueOf() {
        int i10 = f8413v + 41;
        f8414w = i10 % 128;
        if (i10 % 2 != 0) {
            return (AFd1gSDK) this.f8415d.getValue();
        }
        throw null;
    }

    private final AFf1bSDK AFKeystoreWrapper() {
        int i10 = f8414w + 95;
        f8413v = i10 % 128;
        int i11 = i10 % 2;
        AFf1bSDK aFf1bSDK = (AFf1bSDK) this.values.getValue();
        int i12 = f8414w + 41;
        f8413v = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 64 / 0;
        }
        return aFf1bSDK;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static void a(int i10, char c10, String str, String str2, String str3, Object[] objArr) {
        int i11 = $10 + 61;
        $11 = i11 % 128;
        int i12 = i11 % 2;
        char[] charArray = str3 != null ? str3.toCharArray() : str3;
        char[] charArray2 = str2 != null ? str2.toCharArray() : str2;
        char[] charArray3 = str != 0 ? str.toCharArray() : str;
        AFj1eSDK aFj1eSDK = new AFj1eSDK();
        int length = charArray.length;
        char[] cArr = new char[length];
        int length2 = charArray2.length;
        char[] cArr2 = new char[length2];
        System.arraycopy(charArray, 0, cArr, 0, length);
        System.arraycopy(charArray2, 0, cArr2, 0, length2);
        cArr[0] = (char) (cArr[0] ^ c10);
        cArr2[2] = (char) (cArr2[2] + ((char) i10));
        int length3 = charArray3.length;
        char[] cArr3 = new char[length3];
        aFj1eSDK.valueOf = 0;
        while (true) {
            int i13 = aFj1eSDK.valueOf;
            if (i13 < length3) {
                int i14 = $10 + 3;
                $11 = i14 % 128;
                int i15 = i14 % 2;
                int i16 = (i13 + 3) % 4;
                int i17 = cArr[i13 % 4] * 32718;
                char c11 = cArr2[(i13 + 2) % 4];
                char c12 = (char) ((i17 + c11) % Settings.DEFAULT_INITIAL_WINDOW_SIZE);
                aFj1eSDK.AFKeystoreWrapper = c12;
                cArr2[i16] = (char) (((cArr[i16] * 32718) + c11) / Settings.DEFAULT_INITIAL_WINDOW_SIZE);
                cArr[i16] = c12;
                cArr3[i13] = (char) ((((charArray3[i13] ^ c12) ^ (afInfoLog ^ (-2499805256334160880L))) ^ ((int) (force ^ (-2499805256334160880L)))) ^ ((char) (f8412i ^ (-2499805256334160880L))));
                aFj1eSDK.valueOf = i13 + 1;
            } else {
                objArr[0] = new String(cArr3);
                return;
            }
        }
    }

    @NotNull
    private AFd1bSDK d() {
        int i10 = f8414w + 39;
        f8413v = i10 % 128;
        int i11 = i10 % 2;
        AFd1bSDK aFd1bSDK = (AFd1bSDK) this.f8416e.getValue();
        int i12 = f8414w + 17;
        f8413v = i12 % 128;
        int i13 = i12 % 2;
        return aFd1bSDK;
    }

    public static final void valueOf(AFd1iSDK aFd1iSDK) {
        int i10 = f8413v + 69;
        f8414w = i10 % 128;
        int i11 = i10 % 2;
        Intrinsics.checkNotNullParameter(aFd1iSDK, "");
        aFd1iSDK.v();
        int i12 = f8413v + 63;
        f8414w = i12 % 128;
        if (i12 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.internal.AFd1jSDK
    public final void values(@NotNull final Throwable th2, @NotNull final String str) {
        int i10 = f8413v + 9;
        f8414w = i10 % 128;
        if (i10 % 2 != 0) {
            Intrinsics.checkNotNullParameter(th2, "");
            Intrinsics.checkNotNullParameter(str, "");
            final int i11 = 0;
            AFLogger().execute(new Runnable(this) { // from class: com.appsflyer.internal.f

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ AFd1iSDK f8534b;

                {
                    this.f8534b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i12 = i11;
                    AFd1iSDK.AFInAppEventParameterName(this.f8534b, th2, str);
                }
            });
            return;
        }
        Intrinsics.checkNotNullParameter(th2, "");
        Intrinsics.checkNotNullParameter(str, "");
        final int i12 = 1;
        AFLogger().execute(new Runnable(this) { // from class: com.appsflyer.internal.f

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AFd1iSDK f8534b;

            {
                this.f8534b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i122 = i12;
                AFd1iSDK.AFInAppEventParameterName(this.f8534b, th2, str);
            }
        });
        throw null;
    }

    private final boolean AFKeystoreWrapper(AFh1fSDK aFh1fSDK) {
        int i10 = f8414w + 13;
        f8413v = i10 % 128;
        if (i10 % 2 == 0) {
            long currentTimeMillis = System.currentTimeMillis();
            long values = registerClient().values("af_send_exc_to_server_window", -1L);
            if (aFh1fSDK.AFInAppEventParameterName < TimeUnit.MILLISECONDS.toSeconds(currentTimeMillis)) {
                int i11 = f8414w + 109;
                f8413v = i11 % 128;
                return i11 % 2 != 0;
            }
            if (values == -1 || values < currentTimeMillis) {
                return false;
            }
            return AFInAppEventType(aFh1fSDK);
        }
        long currentTimeMillis2 = System.currentTimeMillis();
        registerClient().values("af_send_exc_to_server_window", -1L);
        long j10 = aFh1fSDK.AFInAppEventParameterName;
        TimeUnit.MILLISECONDS.toSeconds(currentTimeMillis2);
        throw null;
    }

    @Override // com.appsflyer.internal.AFd1jSDK
    public final void AFInAppEventParameterName() {
        int i10 = f8414w + 67;
        f8413v = i10 % 128;
        int i11 = i10 % 2;
        AFLogger().execute(new e(this, 1));
        int i12 = f8413v + 99;
        f8414w = i12 % 128;
        if (i12 % 2 == 0) {
            int i13 = 95 / 0;
        }
    }

    private final Map<String, String> AFInAppEventParameterName(AFh1fSDK aFh1fSDK) {
        Object[] objArr = new Object[1];
        a(View.MeasureSpec.makeMeasureSpec(0, 0) - 801052847, (char) (TextUtils.indexOf(HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, 0, 0) + 25652), "텤\ue8cd㘏跣艷", "틠\udeb0羳༈", "册䃧㓐蹤", objArr);
        Pair pair = new Pair(((String) objArr[0]).intern(), Build.BRAND);
        Pair pair2 = new Pair("model", Build.MODEL);
        Pair pair3 = new Pair("app_id", values().valueOf.AFKeystoreWrapper.getPackageName());
        Pair pair4 = new Pair("p_ex", new AFb1hSDK().valueOf());
        Pair pair5 = new Pair("api", String.valueOf(Build.VERSION.SDK_INT));
        Pair pair6 = new Pair(PaymentConstants.Category.SDK, this.registerClient);
        AFd1sSDK values = values();
        Map<String, String> g10 = p0.g(pair, pair2, pair3, pair4, pair5, pair6, new Pair("uid", AFb1kSDK.valueOf(values.valueOf, values.AFKeystoreWrapper)), new Pair("exc_config", aFh1fSDK.valueOf()));
        int i10 = f8414w + 33;
        f8413v = i10 % 128;
        int i11 = i10 % 2;
        return g10;
    }

    @Override // com.appsflyer.internal.AFd1jSDK
    public final void AFInAppEventType() {
        int i10 = f8414w + 103;
        f8413v = i10 % 128;
        int i11 = i10 % 2;
        AFLogger().execute(new e(this, 0));
        int i12 = f8414w + 95;
        f8413v = i12 % 128;
        int i13 = i12 % 2;
    }

    private final boolean AFInAppEventType(AFh1fSDK aFh1fSDK) {
        new AFe1zSDK();
        String str = this.registerClient;
        String str2 = aFh1fSDK.AFKeystoreWrapper;
        Intrinsics.checkNotNullExpressionValue(str2, "");
        boolean AFInAppEventType = AFe1zSDK.AFInAppEventType(str, str2);
        int i10 = f8413v + 51;
        f8414w = i10 % 128;
        if (i10 % 2 != 0) {
            return AFInAppEventType;
        }
        throw null;
    }

    private final void valueOf(AFh1fSDK aFh1fSDK) {
        int i10;
        long millis;
        int i11 = f8413v + 83;
        f8414w = i11 % 128;
        if (i11 % 2 == 0) {
            i10 = aFh1fSDK.valueOf;
            millis = TimeUnit.DAYS.toMillis(aFh1fSDK.AFInAppEventType) * System.currentTimeMillis();
        } else {
            i10 = aFh1fSDK.valueOf;
            millis = TimeUnit.DAYS.toMillis(aFh1fSDK.AFInAppEventType) + System.currentTimeMillis();
        }
        AFd1qSDK registerClient = registerClient();
        registerClient.AFKeystoreWrapper("af_send_exc_to_server_window", millis);
        registerClient.AFInAppEventParameterName("af_send_exc_min", i10);
    }

    @Override // com.appsflyer.internal.AFd1jSDK
    public final void values(AFd1jSDK.AFa1zSDK aFa1zSDK) {
        int i10 = f8414w + 77;
        f8413v = i10 % 128;
        if (i10 % 2 == 0) {
            this.AFLogger = aFa1zSDK;
            AFLogger().execute(new e(this, 2));
        } else {
            this.AFLogger = aFa1zSDK;
            AFLogger().execute(new e(this, 3));
            throw null;
        }
    }

    public static final void values(AFd1iSDK aFd1iSDK) {
        int i10 = f8413v + 59;
        f8414w = i10 % 128;
        if (i10 % 2 == 0) {
            Intrinsics.checkNotNullParameter(aFd1iSDK, "");
            aFd1iSDK.i();
            throw null;
        }
        Intrinsics.checkNotNullParameter(aFd1iSDK, "");
        aFd1iSDK.i();
        int i11 = f8414w + 51;
        f8413v = i11 % 128;
        int i12 = i11 % 2;
    }

    private final boolean values(AFh1fSDK aFh1fSDK) {
        int valueOf;
        int i10 = f8414w + 13;
        f8413v = i10 % 128;
        int i11 = i10 % 2;
        long currentTimeMillis = System.currentTimeMillis();
        long values = registerClient().values("af_send_exc_to_server_window", -1L);
        if (aFh1fSDK.AFInAppEventParameterName >= TimeUnit.MILLISECONDS.toSeconds(currentTimeMillis) && values != -1 && values >= currentTimeMillis && (valueOf = registerClient().valueOf("af_send_exc_min", -1)) != -1) {
            int i12 = f8414w + 73;
            f8413v = i12 % 128;
            if (i12 % 2 != 0) {
                valueOf().values();
                throw null;
            }
            if (valueOf().values() >= valueOf) {
                return AFInAppEventType(aFh1fSDK);
            }
        }
        return false;
    }

    private final void valueOf(String str, String str2) {
        int i10 = f8413v + 37;
        f8414w = i10 % 128;
        int i11 = i10 % 2;
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        d().valueOf(bytes, o0.b(new Pair("Authorization", AFb1lSDK.AFKeystoreWrapper(str, str2))), CredentialsApi.CREDENTIAL_PICKER_REQUEST_CODE);
        int i12 = f8414w + 83;
        f8413v = i12 % 128;
        int i13 = i12 % 2;
    }

    private static Map<String, Object> AFInAppEventParameterName(Map<String, ? extends Object> map, List<AFd1fSDK> list) {
        Map<String, Object> g10;
        int i10 = f8413v + 63;
        f8414w = i10 % 128;
        if (i10 % 2 == 0) {
            g10 = p0.g(new Pair("deviceInfo", map), new Pair("excs", AFd1eSDK.AFInAppEventType(list)));
        } else {
            g10 = p0.g(new Pair("deviceInfo", map), new Pair("excs", AFd1eSDK.AFInAppEventType(list)));
        }
        int i11 = f8414w + 73;
        f8413v = i11 % 128;
        int i12 = i11 % 2;
        return g10;
    }
}
