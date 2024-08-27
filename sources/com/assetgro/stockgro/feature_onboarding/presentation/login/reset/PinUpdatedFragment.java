package com.assetgro.stockgro.feature_onboarding.presentation.login.reset;

import android.view.View;
import androidx.lifecycle.h1;
import ba.am;
import ca.c;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.prod.R;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import ct.a;
import d7.j;
import da.b;
import da.f;
import ea.j0;
import ea.o0;
import gd.m;
import iu.a0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kq.e;
import ls.n0;
import qu.i0;
import yk.g;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/assetgro/stockgro/feature_onboarding/presentation/login/reset/PinUpdatedFragment;", "Lgd/m;", "Lcom/assetgro/stockgro/feature_onboarding/presentation/login/reset/PinUpdatedViewModel;", "Lba/am;", "<init>", "()V", "mt/p", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class PinUpdatedFragment extends m<PinUpdatedViewModel, am> {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f8752g = 0;

    @Override // gd.m
    public final int C() {
        return R.layout.fragment_pin_updated;
    }

    @Override // gd.m
    public final void E(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        am amVar = (am) q();
        amVar.f4210s.setOnClickListener(new j(this, 16));
    }

    @Override // gd.m
    public final void w(f fragmentComponent) {
        Intrinsics.checkNotNullParameter(fragmentComponent, "fragmentComponent");
        b bVar = fragmentComponent.f14279b;
        e schedulerProvider = bVar.k();
        a compositeDisposable = bVar.c();
        UserRepository userRepository = bVar.m();
        g.i(userRepository);
        o0 o0Var = fragmentComponent.f14280c;
        o0Var.getClass();
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        c factory = new c(a0.a(PinUpdatedViewModel.class), new j0(schedulerProvider, compositeDisposable, userRepository, 21));
        m mVar = o0Var.f15244a;
        h1 e10 = com.google.android.gms.internal.p002firebaseauthapi.a.e(mVar, "owner", factory, "factory");
        y4.c defaultCreationExtras = com.google.android.gms.internal.p002firebaseauthapi.a.o(mVar, "owner", e10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h10 = com.google.android.gms.internal.p002firebaseauthapi.a.h(e10, factory, defaultCreationExtras, PinUpdatedViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(PinUpdatedViewModel.class, "<this>", PinUpdatedViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            PinUpdatedViewModel pinUpdatedViewModel = (PinUpdatedViewModel) h10.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            g.j(pinUpdatedViewModel);
            this.f17284b = pinUpdatedViewModel;
            FirebaseAnalytics d10 = bVar.d();
            g.i(d10);
            this.f17285c = d10;
            Analytics o10 = bVar.o();
            g.i(o10);
            this.f17286d = o10;
            n0 h11 = bVar.h();
            g.i(h11);
            this.f17287e = h11;
            return;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
    }
}
