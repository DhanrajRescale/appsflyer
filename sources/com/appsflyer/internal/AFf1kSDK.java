package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.deeplink.DeepLink;
import com.appsflyer.deeplink.DeepLinkResult;
import com.appsflyer.internal.AFi1hSDK;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import vt.p0;

/* loaded from: classes.dex */
public final class AFf1kSDK extends AFf1nSDK<AFc1pSDK> {

    @NotNull
    private final CountDownLatch afDebugLog;

    @NotNull
    private final List<AFi1hSDK> afErrorLog;

    @NotNull
    private final AFd1sSDK afInfoLog;
    private int afRDLog;
    private int afVerboseLog;
    private int afWarnLog;

    @NotNull
    private final AFi1aSDK force;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final AFh1wSDK f8453i;

    @NotNull
    private final AFc1jSDK unregisterClient;

    /* renamed from: v, reason: collision with root package name */
    @NotNull
    private final AFd1pSDK f8454v;

    /* renamed from: w, reason: collision with root package name */
    @NotNull
    private final AFc1vSDK f8455w;

    /* loaded from: classes.dex */
    public /* synthetic */ class AFa1tSDK {
        public static final /* synthetic */ int[] valueOf;
        public static final /* synthetic */ int[] values;

        static {
            int[] iArr = new int[AFe1bSDK.values().length];
            iArr[AFe1bSDK.SUCCESS.ordinal()] = 1;
            iArr[AFe1bSDK.FAILURE.ordinal()] = 2;
            valueOf = iArr;
            int[] iArr2 = new int[AFi1hSDK.AFa1ySDK.values().length];
            iArr2[AFi1hSDK.AFa1ySDK.FINISHED.ordinal()] = 1;
            iArr2[AFi1hSDK.AFa1ySDK.STARTED.ordinal()] = 2;
            values = iArr2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFf1kSDK(@NotNull AFc1jSDK aFc1jSDK, @NotNull AFd1kSDK aFd1kSDK) {
        super(AFf1zSDK.DLSDK, new AFf1zSDK[]{AFf1zSDK.RC_CDN, AFf1zSDK.FETCH_ADVERTISING_ID}, aFd1kSDK, "DdlSdk");
        int i10;
        Intrinsics.checkNotNullParameter(aFc1jSDK, "");
        Intrinsics.checkNotNullParameter(aFd1kSDK, "");
        this.unregisterClient = aFc1jSDK;
        this.afDebugLog = new CountDownLatch(1);
        this.afErrorLog = new ArrayList();
        AFd1sSDK AFInAppEventType = aFd1kSDK.AFInAppEventType();
        Intrinsics.checkNotNullExpressionValue(AFInAppEventType, "");
        this.afInfoLog = AFInAppEventType;
        AFd1pSDK level = aFd1kSDK.getLevel();
        Intrinsics.checkNotNullExpressionValue(level, "");
        this.f8454v = level;
        AFc1vSDK afRDLog = aFd1kSDK.afRDLog();
        Intrinsics.checkNotNullExpressionValue(afRDLog, "");
        this.f8455w = afRDLog;
        AFh1wSDK AFLogger = aFd1kSDK.AFLogger();
        Intrinsics.checkNotNullExpressionValue(AFLogger, "");
        this.f8453i = AFLogger;
        AFi1aSDK force = aFd1kSDK.force();
        Intrinsics.checkNotNullExpressionValue(force, "");
        this.force = force;
        AFi1hSDK[] AFKeystoreWrapper = force.AFKeystoreWrapper();
        Intrinsics.checkNotNullExpressionValue(AFKeystoreWrapper, "");
        ArrayList<AFi1hSDK> arrayList = new ArrayList();
        for (AFi1hSDK aFi1hSDK : AFKeystoreWrapper) {
            if (aFi1hSDK != null && aFi1hSDK.unregisterClient != AFi1hSDK.AFa1ySDK.NOT_STARTED) {
                arrayList.add(aFi1hSDK);
            }
        }
        this.afRDLog = arrayList.size();
        for (final AFi1hSDK aFi1hSDK2 : arrayList) {
            AFi1hSDK.AFa1ySDK aFa1ySDK = aFi1hSDK2.unregisterClient;
            if (aFa1ySDK == null) {
                i10 = -1;
            } else {
                i10 = AFa1tSDK.values[aFa1ySDK.ordinal()];
            }
            if (i10 != 1) {
                if (i10 == 2) {
                    aFi1hSDK2.addObserver(new Observer() { // from class: com.appsflyer.internal.j
                        @Override // java.util.Observer
                        public final void update(Observable observable, Object obj) {
                            AFf1kSDK.AFInAppEventType(AFi1hSDK.this, this, observable, obj);
                        }
                    });
                }
            } else {
                AFLogger aFLogger = AFLogger.INSTANCE;
                AFg1aSDK aFg1aSDK = AFg1aSDK.DDL;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(aFi1hSDK2.AFInAppEventParameterName.get("source"));
                sb2.append(" referrer collected earlier");
                AFg1fSDK.d$default(aFLogger, aFg1aSDK, sb2.toString(), false, 4, null);
                Intrinsics.checkNotNullExpressionValue(aFi1hSDK2, "");
                AFInAppEventParameterName(aFi1hSDK2);
            }
        }
    }

    private final void AFInAppEventParameterName(AFi1hSDK aFi1hSDK) {
        if (AFKeystoreWrapper(aFi1hSDK)) {
            this.afErrorLog.add(aFi1hSDK);
            this.afDebugLog.countDown();
            AFg1fSDK.d$default(AFLogger.INSTANCE, AFg1aSDK.DDL, "Added non-organic ".concat(aFi1hSDK.getClass().getSimpleName()), false, 4, null);
        } else {
            int i10 = this.afVerboseLog + 1;
            this.afVerboseLog = i10;
            if (i10 == this.afRDLog) {
                this.afDebugLog.countDown();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AFInAppEventType(AFi1hSDK aFi1hSDK, AFf1kSDK aFf1kSDK, Observable observable, Object obj) {
        Intrinsics.checkNotNullParameter(aFf1kSDK, "");
        AFLogger aFLogger = AFLogger.INSTANCE;
        AFg1aSDK aFg1aSDK = AFg1aSDK.DDL;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(aFi1hSDK.AFInAppEventParameterName.get("source"));
        sb2.append(" referrer collected via observer");
        AFg1fSDK.d$default(aFLogger, aFg1aSDK, sb2.toString(), false, 4, null);
        if (observable != null) {
            aFf1kSDK.AFInAppEventParameterName((AFi1hSDK) observable);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.appsflyer.internal.referrer.Referrer");
    }

    private final boolean w() {
        List list;
        int i10;
        Object obj = this.unregisterClient.AFInAppEventParameterName().get("referrers");
        if (obj instanceof List) {
            list = (List) obj;
        } else {
            list = null;
        }
        if (list != null) {
            i10 = list.size();
        } else {
            i10 = 0;
        }
        if (i10 >= this.afRDLog || this.unregisterClient.AFInAppEventParameterName().containsKey("referrers")) {
            return false;
        }
        return true;
    }

    @Override // com.appsflyer.internal.AFf1nSDK, com.appsflyer.internal.AFe1dSDK
    @NotNull
    public final AFe1bSDK AFKeystoreWrapper() {
        AFe1bSDK AFKeystoreWrapper;
        AFe1bSDK aFe1bSDK = AFe1bSDK.FAILURE;
        try {
            AFKeystoreWrapper = super.AFKeystoreWrapper();
            Intrinsics.checkNotNullExpressionValue(AFKeystoreWrapper, "");
        } catch (Exception e10) {
            e = e10;
        }
        try {
            AFh1wSDK aFh1wSDK = this.f8453i;
            int i10 = this.afWarnLog;
            if (i10 > 0 && i10 <= 2) {
                int i11 = i10 - 1;
                aFh1wSDK.AFLogger[i11] = System.currentTimeMillis();
                long j10 = aFh1wSDK.f8502e[i11];
                if (j10 != 0) {
                    long[] jArr = aFh1wSDK.f8501d;
                    jArr[i11] = aFh1wSDK.AFLogger[i11] - j10;
                    aFh1wSDK.valueOf.put("net", jArr);
                    aFh1wSDK.AFInAppEventParameterName.AFInAppEventParameterName("ddl", new JSONObject(aFh1wSDK.valueOf).toString());
                } else {
                    StringBuilder sb2 = new StringBuilder("Metrics: ddlStart[");
                    sb2.append(i11);
                    sb2.append("] ts is missing");
                    AFLogger.afInfoLog(sb2.toString());
                }
            } else {
                AFLogger.afErrorLogForExcManagerOnly("Unexpected ddl requestCount - end", new IllegalStateException("Metrics: Unexpected ddl requestCount = ".concat(String.valueOf(i10))));
            }
            int i12 = AFa1tSDK.valueOf[AFKeystoreWrapper.ordinal()];
            if (i12 != 1) {
                if (i12 != 2) {
                    return AFKeystoreWrapper;
                }
                AFLogger aFLogger = AFLogger.INSTANCE;
                AFg1aSDK aFg1aSDK = AFg1aSDK.DDL;
                StringBuilder sb3 = new StringBuilder("Error occurred. Server response code = ");
                ResponseNetwork responseNetwork = ((AFf1nSDK) this).registerClient;
                sb3.append(responseNetwork != null ? Integer.valueOf(responseNetwork.getStatusCode()) : null);
                AFg1fSDK.d$default(aFLogger, aFg1aSDK, sb3.toString(), false, 4, null);
                DeepLinkResult deepLinkResult = new DeepLinkResult(null, DeepLinkResult.Error.HTTP_STATUS_CODE);
                this.f8453i.AFInAppEventParameterName(deepLinkResult, this.f8455w.registerClient);
                this.f8455w.values(deepLinkResult);
                return AFKeystoreWrapper;
            }
            ResponseNetwork responseNetwork2 = ((AFf1nSDK) this).registerClient;
            Intrinsics.c(responseNetwork2);
            Object body = responseNetwork2.getBody();
            Intrinsics.checkNotNullExpressionValue(body, "");
            AFc1pSDK aFc1pSDK = (AFc1pSDK) body;
            DeepLink deepLink = aFc1pSDK.values;
            if (deepLink != null) {
                DeepLinkResult deepLinkResult2 = new DeepLinkResult(deepLink, null);
                this.f8453i.AFInAppEventParameterName(deepLinkResult2, this.f8455w.registerClient);
                this.f8455w.values(deepLinkResult2);
                return AFKeystoreWrapper;
            }
            if (this.afWarnLog <= 1 && aFc1pSDK.getAFInAppEventType() && w()) {
                AFg1fSDK.d$default(AFLogger.INSTANCE, AFg1aSDK.DDL, "Waiting for referrers...", false, 4, null);
                this.afDebugLog.await();
                AFh1wSDK aFh1wSDK2 = this.f8453i;
                long currentTimeMillis = System.currentTimeMillis();
                long j11 = aFh1wSDK2.AFLogger[0];
                if (j11 != 0) {
                    aFh1wSDK2.valueOf.put("rfr_wait", Long.valueOf(currentTimeMillis - j11));
                    aFh1wSDK2.AFInAppEventParameterName.AFInAppEventParameterName("ddl", new JSONObject(aFh1wSDK2.valueOf).toString());
                } else {
                    AFLogger.afInfoLog("Metrics: ddlEnd[0] ts is missing");
                }
                if (this.afVerboseLog == this.afRDLog) {
                    DeepLinkResult deepLinkResult3 = new DeepLinkResult(null, null);
                    this.f8453i.AFInAppEventParameterName(deepLinkResult3, this.f8455w.registerClient);
                    this.f8455w.values(deepLinkResult3);
                    return AFe1bSDK.SUCCESS;
                }
                return AFKeystoreWrapper();
            }
            DeepLinkResult deepLinkResult4 = new DeepLinkResult(null, null);
            this.f8453i.AFInAppEventParameterName(deepLinkResult4, this.f8455w.registerClient);
            this.f8455w.values(deepLinkResult4);
            return AFKeystoreWrapper;
        } catch (Exception e11) {
            e = e11;
            aFe1bSDK = AFKeystoreWrapper;
            Throwable cause = e.getCause();
            if ((cause instanceof InterruptedException) || (cause instanceof InterruptedIOException)) {
                AFLogger.afErrorLogForExcManagerOnly("[DDL] Timeout", new TimeoutException());
                AFLogger aFLogger2 = AFLogger.INSTANCE;
                AFg1aSDK aFg1aSDK2 = AFg1aSDK.DDL;
                StringBuilder sb4 = new StringBuilder("Timeout, didn't manage to find deferred deeplink after ");
                sb4.append(this.afWarnLog);
                sb4.append(" attempt(s) within ");
                sb4.append(this.f8455w.registerClient);
                sb4.append(" milliseconds");
                AFg1fSDK.d$default(aFLogger2, aFg1aSDK2, sb4.toString(), false, 4, null);
                DeepLinkResult deepLinkResult5 = new DeepLinkResult(null, DeepLinkResult.Error.TIMEOUT);
                this.f8453i.AFInAppEventParameterName(deepLinkResult5, this.f8455w.registerClient);
                this.f8455w.values(deepLinkResult5);
                return AFe1bSDK.TIMEOUT;
            }
            if (cause instanceof IOException) {
                AFg1fSDK.d$default(AFLogger.INSTANCE, AFg1aSDK.DDL, "Http Exception: the request was not sent to the server", false, 4, null);
                DeepLinkResult deepLinkResult6 = new DeepLinkResult(null, DeepLinkResult.Error.NETWORK);
                this.f8453i.AFInAppEventParameterName(deepLinkResult6, this.f8455w.registerClient);
                this.f8455w.values(deepLinkResult6);
            } else {
                AFg1fSDK.d$default(AFLogger.INSTANCE, AFg1aSDK.DDL, "Unexpected Exception: ".concat(String.valueOf(e)), false, 4, null);
                DeepLinkResult deepLinkResult7 = new DeepLinkResult(null, DeepLinkResult.Error.UNEXPECTED);
                this.f8453i.AFInAppEventParameterName(deepLinkResult7, this.f8455w.registerClient);
                this.f8455w.values(deepLinkResult7);
            }
            return aFe1bSDK;
        }
    }

    @Override // com.appsflyer.internal.AFf1nSDK
    public final boolean a_() {
        return false;
    }

    @Override // com.appsflyer.internal.AFf1nSDK
    public final /* bridge */ /* synthetic */ AppsFlyerRequestListener e() {
        return null;
    }

    @Override // com.appsflyer.internal.AFf1nSDK
    public final boolean i() {
        return false;
    }

    @Override // com.appsflyer.internal.AFf1nSDK, com.appsflyer.internal.AFe1dSDK
    public final boolean valueOf() {
        return false;
    }

    private static Map<String, String> valueOf(AFb1zSDK aFb1zSDK) {
        String str;
        if (aFb1zSDK == null || (str = aFb1zSDK.AFInAppEventParameterName) == null) {
            return null;
        }
        Intrinsics.checkNotNullExpressionValue(str, "");
        Boolean bool = aFb1zSDK.AFKeystoreWrapper;
        if (bool == null || !bool.booleanValue()) {
            return p0.g(new Pair("type", "unhashed"), new Pair(AppMeasurementSdk.ConditionalUserProperty.VALUE, str));
        }
        return null;
    }

    @Override // com.appsflyer.internal.AFf1nSDK, com.appsflyer.internal.AFe1dSDK
    public final long AFInAppEventParameterName() {
        return this.f8455w.registerClient;
    }

    private static boolean AFKeystoreWrapper(AFi1hSDK aFi1hSDK) {
        Object obj = aFi1hSDK.AFInAppEventParameterName.get("click_ts");
        Long l10 = obj instanceof Long ? (Long) obj : null;
        if (l10 != null) {
            if (System.currentTimeMillis() - TimeUnit.SECONDS.toMillis(l10.longValue()) < TimeUnit.DAYS.toMillis(1L)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0161 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x010e A[SYNTHETIC] */
    @Override // com.appsflyer.internal.AFf1nSDK
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.appsflyer.internal.AFe1sSDK<com.appsflyer.internal.AFc1pSDK> AFKeystoreWrapper(@org.jetbrains.annotations.NotNull java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 625
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFf1kSDK.AFKeystoreWrapper(java.lang.String):com.appsflyer.internal.AFe1sSDK");
    }
}
