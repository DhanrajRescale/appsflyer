package com.appsflyer.internal;

import android.adservices.measurement.MeasurementManager;
import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.os.OutcomeReceiver;
import com.appsflyer.AFLogger;
import com.google.android.gms.common.api.Api;
import in.juspay.hypersdk.core.PaymentConstants;
import iu.z;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vt.p0;

/* loaded from: classes.dex */
public final class AFf1qSDK extends AFe1dSDK<Unit> {

    @NotNull
    private final String AFLogger;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final AFd1lSDK f8466d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final AFg1wSDK f8467e;

    @NotNull
    private final AFg1mSDK registerClient;

    @NotNull
    private final AFd1sSDK unregisterClient;

    /* loaded from: classes.dex */
    public static final class AFa1tSDK implements OutcomeReceiver {
        private /* synthetic */ z AFInAppEventParameterName;
        private /* synthetic */ CountDownLatch valueOf;
        private /* synthetic */ AFf1qSDK values;

        public AFa1tSDK(z zVar, CountDownLatch countDownLatch, AFf1qSDK aFf1qSDK) {
            this.AFInAppEventParameterName = zVar;
            this.valueOf = countDownLatch;
            this.values = aFf1qSDK;
        }

        public final /* synthetic */ void onError(Throwable th2) {
            Exception exc = (Exception) th2;
            Intrinsics.checkNotNullParameter(exc, "");
            AFf1qSDK.valueOf(exc);
            this.valueOf.countDown();
        }

        public final void onResult(@NotNull Object obj) {
            Intrinsics.checkNotNullParameter(obj, "");
            this.AFInAppEventParameterName.f20560a = AFe1bSDK.SUCCESS;
            this.valueOf.countDown();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFf1qSDK(@NotNull AFd1kSDK aFd1kSDK, @NotNull String str) {
        super(AFf1zSDK.REGISTER_TRIGGER, new AFf1zSDK[]{AFf1zSDK.RC_CDN, AFf1zSDK.CONVERSION}, "RegisterTrigger");
        Intrinsics.checkNotNullParameter(aFd1kSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.AFLogger = str;
        AFd1sSDK AFInAppEventType = aFd1kSDK.AFInAppEventType();
        Intrinsics.checkNotNullExpressionValue(AFInAppEventType, "");
        this.unregisterClient = AFInAppEventType;
        AFd1lSDK w10 = aFd1kSDK.w();
        Intrinsics.checkNotNullExpressionValue(w10, "");
        this.f8466d = w10;
        AFg1mSDK e10 = aFd1kSDK.e();
        Intrinsics.checkNotNullExpressionValue(e10, "");
        this.registerClient = e10;
        AFg1wSDK i10 = aFd1kSDK.i();
        Intrinsics.checkNotNullExpressionValue(i10, "");
        this.f8467e = i10;
    }

    @Override // com.appsflyer.internal.AFe1dSDK
    public final long AFInAppEventParameterName() {
        return 20000L;
    }

    @Override // com.appsflyer.internal.AFe1dSDK
    @SuppressLint({"NewApi"})
    @NotNull
    public final AFe1bSDK AFKeystoreWrapper() {
        MeasurementManager a10;
        z zVar = new z();
        zVar.f20560a = AFe1bSDK.FAILURE;
        CountDownLatch countDownLatch = new CountDownLatch(1);
        try {
            Context context = this.f8466d.AFKeystoreWrapper;
            if (context != null && (a10 = b.a(context.getSystemService(b.b()))) != null) {
                new AFj1xSDK(this.unregisterClient, null, 2, 0 == true ? 1 : 0);
                Uri.Builder buildUpon = Uri.parse(AFj1xSDK.valueOf()).buildUpon();
                Context context2 = this.unregisterClient.valueOf.AFKeystoreWrapper;
                LinkedHashMap h10 = p0.h(new Pair("event_name", this.AFLogger), new Pair("app_id", this.unregisterClient.valueOf.AFKeystoreWrapper.getPackageName()), new Pair("app_version", AFb1uSDK.AFInAppEventType(context2, context2.getPackageName())), new Pair("sdk_version", AFd1sSDK.AFInAppEventType()), new Pair("api_version", AFd1sSDK.values()), new Pair(PaymentConstants.TIMESTAMP, String.valueOf(this.registerClient.AFInAppEventType())), new Pair("request_id", AFd1sSDK.valueOf()));
                AFd1sSDK aFd1sSDK = this.unregisterClient;
                String valueOf = AFb1kSDK.valueOf(aFd1sSDK.valueOf, aFd1sSDK.AFKeystoreWrapper);
                if (valueOf != null) {
                    h10.put("appsflyer_id", valueOf);
                }
                Long AFInAppEventParameterName = this.registerClient.AFInAppEventParameterName();
                if (AFInAppEventParameterName != null) {
                    h10.put("install_time", String.valueOf(AFInAppEventParameterName.longValue()));
                }
                for (Map.Entry entry : h10.entrySet()) {
                    buildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
                }
                Uri build = buildUpon.build();
                Intrinsics.checkNotNullExpressionValue(build, "");
                a10.registerTrigger(build, new ThreadPoolExecutor(0, Api.BaseClientBuilder.API_PRIORITY_OTHER, 60L, TimeUnit.SECONDS, new SynchronousQueue()), new AFa1tSDK(zVar, countDownLatch, this));
            }
            countDownLatch.await(4L, TimeUnit.SECONDS);
        } catch (Throwable th2) {
            valueOf(th2);
        }
        return (AFe1bSDK) zVar.f20560a;
    }

    @Override // com.appsflyer.internal.AFe1dSDK
    public final boolean valueOf() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void valueOf(Throwable th2) {
        AFLogger aFLogger = AFLogger.INSTANCE;
        AFg1aSDK aFg1aSDK = AFg1aSDK.PRIVACY_SANDBOX;
        StringBuilder sb2 = new StringBuilder("Error occurred: ");
        sb2.append(th2.getMessage());
        aFLogger.e(aFg1aSDK, sb2.toString(), th2, false, false, true, true);
    }
}
