package com.assetgro.stockgro.feature_onboarding.presentation.login.pin;

import android.os.Build;
import android.view.View;
import androidx.fragment.app.z1;
import androidx.lifecycle.h1;
import androidx.navigation.i;
import ba.vl;
import c2.p0;
import ca.c;
import cb.a;
import cb.b;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.prod.R;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import d7.j;
import da.f;
import ea.m0;
import ea.n0;
import gd.m;
import iu.a0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kq.e;
import okhttp3.HttpUrl;
import qu.i0;
import ut.g;
import ut.h;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/assetgro/stockgro/feature_onboarding/presentation/login/pin/PinLoginFragment;", "Lgd/m;", "Lcom/assetgro/stockgro/feature_onboarding/presentation/login/pin/PinLoginViewModel;", "Lba/vl;", "<init>", "()V", "mt/p", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class PinLoginFragment extends m<PinLoginViewModel, vl> {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f8744i = 0;

    /* renamed from: g, reason: collision with root package name */
    public final i f8745g = new i(a0.a(b.class), new z1(this, 8));

    /* renamed from: h, reason: collision with root package name */
    public final g f8746h = h.a(new p0(this, 23));

    @Override // gd.m
    public final int C() {
        return R.layout.fragment_pin_login;
    }

    @Override // gd.m
    public final void D() {
        super.D();
        ((PinLoginViewModel) r()).f8750q.observe(this, new f7.i(28, new a(this, 0)));
        ((PinLoginViewModel) r()).f8751r.observe(this, new f7.i(28, new a(this, 1)));
        ((PinLoginViewModel) r()).f9084g.observe(this, new f7.i(28, new a(this, 2)));
        ((PinLoginViewModel) r()).f8748o.observe(this, new f7.i(28, new a(this, 3)));
        ((PinLoginViewModel) r()).f8749p.observe(this, new f7.i(28, new a(this, 4)));
    }

    @Override // gd.m
    public final void E(View view) {
        String str;
        Intrinsics.checkNotNullParameter(view, "view");
        try {
            str = String.valueOf(Build.VERSION.SDK_INT);
        } catch (Exception unused) {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        ((vl) q()).f6449t.getNext().setOnClickListener(new bb.a(1, this, str));
        vl vlVar = (vl) q();
        vlVar.f6449t.setNumberClick(new a(this, 5));
        vl vlVar2 = (vl) q();
        vlVar2.f6448s.setOnClickListener(new j(this, 15));
    }

    @Override // gd.m
    public final void w(f fragmentComponent) {
        Intrinsics.checkNotNullParameter(fragmentComponent, "fragmentComponent");
        da.b bVar = fragmentComponent.f14279b;
        e k10 = bVar.k();
        ct.a c10 = bVar.c();
        UserRepository userRepository = bVar.m();
        yk.g.i(userRepository);
        jj.a appsFlyerAnalyticsEngineImpl = bVar.n();
        yk.g.i(appsFlyerAnalyticsEngineImpl);
        n0 n0Var = fragmentComponent.f14278a;
        com.google.android.gms.internal.p002firebaseauthapi.a.s(n0Var, k10, "schedulerProvider", c10, "compositeDisposable");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(appsFlyerAnalyticsEngineImpl, "appsFlyerAnalyticsEngineImpl");
        c factory = new c(a0.a(PinLoginViewModel.class), new m0(k10, c10, userRepository, appsFlyerAnalyticsEngineImpl, 1));
        m mVar = n0Var.f15238a;
        h1 e10 = com.google.android.gms.internal.p002firebaseauthapi.a.e(mVar, "owner", factory, "factory");
        y4.c defaultCreationExtras = com.google.android.gms.internal.p002firebaseauthapi.a.o(mVar, "owner", e10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h10 = com.google.android.gms.internal.p002firebaseauthapi.a.h(e10, factory, defaultCreationExtras, PinLoginViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(PinLoginViewModel.class, "<this>", PinLoginViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            PinLoginViewModel pinLoginViewModel = (PinLoginViewModel) h10.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            yk.g.j(pinLoginViewModel);
            this.f17284b = pinLoginViewModel;
            FirebaseAnalytics d10 = bVar.d();
            yk.g.i(d10);
            this.f17285c = d10;
            Analytics o10 = bVar.o();
            yk.g.i(o10);
            this.f17286d = o10;
            ls.n0 h11 = bVar.h();
            yk.g.i(h11);
            this.f17287e = h11;
            return;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
    }
}
