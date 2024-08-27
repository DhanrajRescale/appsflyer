package com.assetgro.stockgro;

import android.app.Application;
import android.content.Context;
import androidx.work.c;
import androidx.work.d;
import bv.b0;
import com.appsflyer.AppsFlyerLib;
import com.assetgro.stockgro.data.WifiService;
import com.assetgro.stockgro.data.local.preference.GlobalUserPreferences;
import com.assetgro.stockgro.data.local.preference.UserPreferences;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.google.firebase.messaging.FirebaseMessaging;
import com.webengage.sdk.android.User;
import com.webengage.sdk.android.WebEngage;
import com.webengage.sdk.android.WebEngageActivityLifeCycleCallbacks;
import com.webengage.sdk.android.WebEngageConfig;
import da.b;
import ea.p0;
import ea.w;
import fu.k;
import java.io.File;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ll.o;
import ls.l0;
import ls.n0;
import n8.j;
import pp.g;
import ur.a;
import ut.e;
import yk.h;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/assetgro/stockgro/StockGroApplication;", "Landroid/app/Application;", "Landroidx/work/c;", "Ln8/j;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class StockGroApplication extends Application implements c, j {

    /* renamed from: c, reason: collision with root package name */
    public static StockGroApplication f8559c;

    /* renamed from: a, reason: collision with root package name */
    public b f8560a;

    /* renamed from: b, reason: collision with root package name */
    public GlobalUserPreferences f8561b;

    public final b a() {
        b bVar = this.f8560a;
        if (bVar != null) {
            return bVar;
        }
        Intrinsics.k("applicationComponent");
        throw null;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.work.b, java.lang.Object] */
    public final d b() {
        b a10 = a();
        ca.b bVar = new ca.b(a10.f14271w, a10.f14261m, a10.f14272x);
        ?? obj = new Object();
        obj.f2542a = bVar;
        d dVar = new d(obj);
        Intrinsics.checkNotNullExpressionValue(dVar, "build(...)");
        return dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [com.webengage.sdk.android.callbacks.PushNotificationCallbacks, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v22, types: [com.webengage.sdk.android.callbacks.InAppNotificationCallbacks, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v8, types: [com.appsflyer.AppsFlyerConversionListener, java.lang.Object] */
    @Override // android.app.Application
    public final void onCreate() {
        FirebaseMessaging firebaseMessaging;
        super.onCreate();
        f8559c = this;
        da.d dVar = new da.d();
        dVar.f14276b = new w(this);
        if (((p0) dVar.f14277c) == null) {
            dVar.f14277c = new p0();
        }
        b bVar = new b((w) dVar.f14276b, (p0) dVar.f14277c);
        Intrinsics.checkNotNullExpressionValue(bVar, "build(...)");
        Intrinsics.checkNotNullParameter(bVar, "<set-?>");
        this.f8560a = bVar;
        GlobalUserPreferences globalUserPreferences = new GlobalUserPreferences(this);
        Intrinsics.checkNotNullParameter(globalUserPreferences, "<set-?>");
        this.f8561b = globalUserPreferences;
        String uuid = ((UserPreferences) a().f14258j.get()).getUuid();
        if (uuid != null) {
            FirebaseCrashlytics.getInstance().setUserId(uuid);
            FirebaseAnalytics d10 = a().d();
            d10.f11626a.zzN(uuid);
            d10.f11626a.zzO(null, "app_version_name", "1.11.9", false);
            d10.f11626a.zzO(null, "app_version_code", "220", false);
            n0 h10 = a().h();
            h10.j(uuid, true);
            l0 l0Var = h10.f25263e;
            l0Var.f("1.11.9", "app_version_name");
            l0Var.f("220", "app_version_code");
            User user = WebEngage.get().user();
            Intrinsics.checkNotNullExpressionValue(user, "user(...)");
            user.login(uuid);
        }
        registerActivityLifecycleCallbacks(new WebEngageActivityLifeCycleCallbacks(this, new WebEngageConfig.Builder().setWebEngageKey("76aa833").setDebugMode(false).setPushSmallIcon(2131231848).setEveryActivityIsScreen(true).build()));
        o oVar = FirebaseMessaging.f11684k;
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = FirebaseMessaging.getInstance(g.d());
        }
        firebaseMessaging.getClass();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        firebaseMessaging.f11692f.execute(new h(18, firebaseMessaging, taskCompletionSource));
        taskCompletionSource.getTask().addOnCompleteListener(new Object());
        WebEngage.registerPushNotificationCallback(new Object());
        WebEngage.registerInAppNotificationCallback(new Object());
        Intrinsics.checkNotNullParameter(this, "context");
        AppsFlyerLib appsFlyerLib = AppsFlyerLib.getInstance();
        Intrinsics.c(appsFlyerLib);
        jj.c.f21413a = appsFlyerLib;
        appsFlyerLib.subscribeForDeepLink(new j5.d(16));
        ?? obj = new Object();
        appsFlyerLib.waitForCustomerUserId(false);
        appsFlyerLib.init("SwCAr7RRxsAABzbwbVXc6W", obj, this);
        appsFlyerLib.start(this);
        WifiService.INSTANCE.getInstance().initializeWithApplicationContext(this);
        if (!a.f37360a.getAndSet(true)) {
            ur.b bVar2 = new ur.b(this);
            if (!mv.j.f28104a.get()) {
                AtomicReference atomicReference = mv.j.f28105b;
                while (!atomicReference.compareAndSet(null, bVar2)) {
                    if (atomicReference.get() != null) {
                        throw new IllegalStateException("Initializer was already set, possibly with a default during initialization");
                    }
                }
            } else {
                throw new IllegalStateException("Already initialized");
            }
        }
        Context context = getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(context, "getApplicationContext(...)");
        Intrinsics.checkNotNullParameter(context, "context");
        n8.h hVar = new n8.h(context);
        hVar.f28375c = ut.h.a(new f9.a(context, 6));
        q8.a aVar = new q8.a();
        File cacheDir = context.getCacheDir();
        Intrinsics.checkNotNullExpressionValue(cacheDir, "getCacheDir(...)");
        File e10 = k.e(cacheDir);
        String str = b0.f7323b;
        aVar.f31823a = gt.d.g(e10);
        aVar.f31828f = 0L;
        aVar.f31825c = 0.02d;
        hVar.f28376d = new e(aVar.a());
        n8.o a10 = hVar.a();
        synchronized (n8.a.class) {
            n8.a.f28358b = a10;
        }
    }
}
