package com.assetgro.stockgro.ui.splash;

import a4.e;
import a4.f;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import androidx.lifecycle.h1;
import ch.c;
import com.android.installreferrer.api.InstallReferrerClient;
import com.appsflyer.AppsFlyerLib;
import com.assetgro.stockgro.data.AnalyticEvent;
import com.assetgro.stockgro.data.LogoutSubject;
import com.assetgro.stockgro.data.MultipleSignInLogoutSubject;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.prod.R;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import da.a;
import ea.v;
import gd.b;
import h.m0;
import iu.a0;
import j5.d;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ls.n0;
import qu.i0;
import yk.g;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/assetgro/stockgro/ui/splash/SplashActivity;", "Lgd/b;", "Lcom/assetgro/stockgro/ui/splash/SplashViewModel;", "Lba/g;", "<init>", "()V", "yk/o", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class SplashActivity extends b {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f10156m = 0;

    /* renamed from: k, reason: collision with root package name */
    public final ExecutorService f10157k;

    /* renamed from: l, reason: collision with root package name */
    public final String f10158l;

    public SplashActivity() {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        Intrinsics.checkNotNullExpressionValue(newSingleThreadExecutor, "newSingleThreadExecutor(...)");
        this.f10157k = newSingleThreadExecutor;
        this.f10158l = "checkedInstallReferrer";
    }

    @Override // gd.b
    public final int F() {
        return R.layout.activity_splash;
    }

    @Override // gd.b
    public final void H() {
        super.H();
        ((SplashViewModel) x()).f10160o.observe(this, new c(26, new hi.b(this, 0)));
        ((SplashViewModel) x()).f10162q.observe(this, new c(26, new hi.b(this, 1)));
        ((SplashViewModel) x()).f10161p.observe(this, new c(26, new hi.b(this, 2)));
        ((SplashViewModel) x()).f10163r.observe(this, new c(26, new hi.b(this, 3)));
        ((SplashViewModel) x()).f10164s.observe(this, new c(26, new hi.b(this, 4)));
    }

    @Override // gd.b
    public final void I() {
        if (!isTaskRoot()) {
            Intent intent = getIntent();
            String action = intent.getAction();
            if (intent.hasCategory("android.intent.category.LAUNCHER") && action != null && Intrinsics.a(action, "android.intent.action.MAIN")) {
                finish();
                return;
            }
        }
        if (!getPreferences(0).getBoolean(this.f10158l, false)) {
            this.f10157k.execute(new m0(21, this, InstallReferrerClient.newBuilder(this).build()));
        }
        D(new AnalyticEvent("app_open", new HashMap()));
    }

    @Override // gd.b, androidx.fragment.app.j0, androidx.activity.m, q3.o, android.app.Activity
    public final void onCreate(Bundle bundle) {
        f fVar;
        Intrinsics.checkNotNullParameter(this, "<this>");
        if (Build.VERSION.SDK_INT >= 31) {
            fVar = new e(this);
        } else {
            fVar = new f(this);
        }
        fVar.a();
        super.onCreate(bundle);
        d condition = new d(15);
        Intrinsics.checkNotNullParameter(condition, "condition");
        fVar.b(condition);
    }

    @Override // androidx.activity.m, android.app.Activity
    public final void onNewIntent(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.onNewIntent(intent);
        setIntent(intent);
    }

    @Override // gd.b, h.m, androidx.fragment.app.j0, android.app.Activity
    public final void onStart() {
        super.onStart();
        try {
            AppsFlyerLib appsFlyerLib = ((SplashViewModel) x()).f10159n.f21411h;
            if (appsFlyerLib != null) {
                appsFlyerLib.subscribeForDeepLink(new vc.b(this, 27));
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    @Override // gd.b
    public final void z(a activityComponent) {
        Intrinsics.checkNotNullParameter(activityComponent, "activityComponent");
        v vVar = (v) activityComponent.f14247b;
        kq.e schedulerProvider = activityComponent.f14246a.k();
        ct.a compositeDisposable = activityComponent.f14246a.c();
        UserRepository userRepository = activityComponent.f14246a.m();
        g.i(userRepository);
        jj.a appsFlyerAnalyticsEngineImpl = activityComponent.f14246a.n();
        g.i(appsFlyerAnalyticsEngineImpl);
        LogoutSubject logoutSubject = (LogoutSubject) activityComponent.f14246a.f14255g.get();
        g.i(logoutSubject);
        MultipleSignInLogoutSubject multipleSignInLogoutSubject = (MultipleSignInLogoutSubject) activityComponent.f14246a.f14256h.get();
        g.i(multipleSignInLogoutSubject);
        vVar.getClass();
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(appsFlyerAnalyticsEngineImpl, "appsFlyerAnalyticsEngineImpl");
        Intrinsics.checkNotNullParameter(logoutSubject, "logoutSubject");
        Intrinsics.checkNotNullParameter(multipleSignInLogoutSubject, "multipleSignInLogoutSubject");
        ca.c factory = new ca.c(a0.a(SplashViewModel.class), new d1.b(schedulerProvider, compositeDisposable, userRepository, appsFlyerAnalyticsEngineImpl, logoutSubject, multipleSignInLogoutSubject, 2));
        b bVar = vVar.f15290a;
        h1 c10 = com.google.android.gms.internal.p002firebaseauthapi.a.c(bVar, "owner", factory, "factory");
        y4.c defaultCreationExtras = com.google.android.gms.internal.p002firebaseauthapi.a.m(bVar, "owner", c10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h10 = com.google.android.gms.internal.p002firebaseauthapi.a.h(c10, factory, defaultCreationExtras, SplashViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(SplashViewModel.class, "<this>", SplashViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            SplashViewModel splashViewModel = (SplashViewModel) h10.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            g.j(splashViewModel);
            this.f17254b = splashViewModel;
            FirebaseAnalytics d10 = activityComponent.f14246a.d();
            g.i(d10);
            this.f17256d = d10;
            Analytics o10 = activityComponent.f14246a.o();
            g.i(o10);
            this.f17257e = o10;
            n0 h11 = activityComponent.f14246a.h();
            g.i(h11);
            this.f17258f = h11;
            return;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
    }
}
