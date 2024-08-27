package com.assetgro.stockgro.feature_onboarding.presentation.login;

import android.content.Context;
import androidx.lifecycle.h1;
import androidx.navigation.t;
import com.assetgro.stockgro.StockGroApplication;
import com.assetgro.stockgro.data.local.preference.GlobalUserPreferences;
import com.assetgro.stockgro.data.model.CountriesDto;
import com.assetgro.stockgro.data.model.CountrySelectDto;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.prod.R;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.gson.Gson;
import com.webengage.sdk.android.Analytics;
import ea.v;
import f7.i;
import fu.n;
import gd.b;
import iu.a0;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import kj.j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kq.e;
import ll.o;
import ls.n0;
import nq.c;
import nq.d;
import qu.i0;
import xa.a;
import yk.g;
import yk.h;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/assetgro/stockgro/feature_onboarding/presentation/login/LoginActivity;", "Lgd/b;", "Lcom/assetgro/stockgro/feature_onboarding/presentation/login/LoginViewModel;", "Lba/g;", "<init>", "()V", "kq/e", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class LoginActivity extends b {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f8700l = 0;

    /* renamed from: k, reason: collision with root package name */
    public t f8701k;

    @Override // gd.b
    public final int F() {
        return R.layout.activity_login;
    }

    @Override // gd.b
    public final void H() {
        super.H();
        ((LoginViewModel) x()).f9084g.observe(this, new i(22, new a(this, 0)));
        ((LoginViewModel) x()).f8704p.observe(this, new i(22, new a(this, 1)));
        ((LoginViewModel) x()).f8705q.observe(this, new i(22, new a(this, 2)));
        ((LoginViewModel) x()).f8706r.observe(this, new i(22, new a(this, 3)));
    }

    @Override // gd.b
    public final void I() {
        FirebaseMessaging firebaseMessaging;
        List<CountrySelectDto> countries;
        InputStream open = getAssets().open("countries.json");
        Intrinsics.checkNotNullExpressionValue(open, "open(...)");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(open));
        try {
            String b10 = n.b(bufferedReader);
            g.k(bufferedReader, null);
            CountriesDto countriesDto = (CountriesDto) new Gson().fromJson(b10, CountriesDto.class);
            int i10 = 0;
            if (countriesDto != null && (countries = countriesDto.getCountries()) != null) {
                byte[] bArr = kj.a.f23206a;
                Intrinsics.checkNotNullParameter(countries, "<set-?>");
                kj.a.f23209d = countries;
                ((LoginViewModel) x()).f8708t.setValue(kj.a.f23209d.get(0));
            }
            t t10 = g.t(this, R.id.login_nav_host_fragment);
            Intrinsics.checkNotNullParameter(t10, "<set-?>");
            this.f8701k = t10;
            o oVar = FirebaseMessaging.f11684k;
            synchronized (FirebaseMessaging.class) {
                firebaseMessaging = FirebaseMessaging.getInstance(pp.g.d());
            }
            firebaseMessaging.getClass();
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            firebaseMessaging.f11692f.execute(new h(18, firebaseMessaging, taskCompletionSource));
            taskCompletionSource.getTask().addOnCompleteListener(new xa.b(this));
            Object obj = c.f29079m;
            pp.g d10 = pp.g.d();
            Preconditions.checkArgument(true, "Null is not a valid value of FirebaseApp.");
            ((c) d10.b(d.class)).d().addOnCompleteListener(new b3.t(this, i10));
            Context applicationContext = getApplicationContext();
            Intrinsics.d(applicationContext, "null cannot be cast to non-null type com.assetgro.stockgro.StockGroApplication");
            GlobalUserPreferences globalUserPreferences = ((StockGroApplication) applicationContext).f8561b;
            if (globalUserPreferences != null) {
                if (globalUserPreferences.isExistingUser()) {
                    ((LoginViewModel) x()).f8704p.postValue(new j(Unit.f23355a));
                    return;
                } else {
                    ((LoginViewModel) x()).f8705q.postValue(new j(Unit.f23355a));
                    return;
                }
            }
            Intrinsics.k("globalUserPreferences");
            throw null;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                g.k(bufferedReader, th2);
                throw th3;
            }
        }
    }

    @Override // gd.b
    public final void z(da.a activityComponent) {
        Intrinsics.checkNotNullParameter(activityComponent, "activityComponent");
        v vVar = (v) activityComponent.f14247b;
        e schedulerProvider = activityComponent.f14246a.k();
        ct.a compositeDisposable = activityComponent.f14246a.c();
        UserRepository userRepository = activityComponent.f14246a.m();
        g.i(userRepository);
        qf.a maintenanceConfigManager = activityComponent.f14246a.g();
        g.i(maintenanceConfigManager);
        vVar.getClass();
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(maintenanceConfigManager, "maintenanceConfigManager");
        ca.c factory = new ca.c(a0.a(LoginViewModel.class), new ea.o(schedulerProvider, compositeDisposable, userRepository, maintenanceConfigManager, 0));
        b bVar = vVar.f15290a;
        h1 c10 = com.google.android.gms.internal.p002firebaseauthapi.a.c(bVar, "owner", factory, "factory");
        y4.c defaultCreationExtras = com.google.android.gms.internal.p002firebaseauthapi.a.m(bVar, "owner", c10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h10 = com.google.android.gms.internal.p002firebaseauthapi.a.h(c10, factory, defaultCreationExtras, LoginViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(LoginViewModel.class, "<this>", LoginViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            LoginViewModel loginViewModel = (LoginViewModel) h10.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            g.j(loginViewModel);
            this.f17254b = loginViewModel;
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
