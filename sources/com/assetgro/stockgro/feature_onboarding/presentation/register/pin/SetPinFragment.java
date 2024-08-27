package com.assetgro.stockgro.feature_onboarding.presentation.register.pin;

import android.view.View;
import androidx.fragment.app.z1;
import androidx.lifecycle.h1;
import androidx.navigation.i;
import ba.an;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.prod.R;
import com.chaos.view.PinView;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import d7.j;
import ea.j0;
import ea.o0;
import eb.c;
import el.l;
import fb.a;
import fb.b;
import gd.m;
import iu.a0;
import kj.f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kq.e;
import ls.n0;
import qu.i0;
import yk.g;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/assetgro/stockgro/feature_onboarding/presentation/register/pin/SetPinFragment;", "Lgd/m;", "Lcom/assetgro/stockgro/feature_onboarding/presentation/register/pin/SetPinViewModel;", "Lba/an;", "<init>", "()V", "kq/e", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class SetPinFragment extends m<SetPinViewModel, an> {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f8787h = 0;

    /* renamed from: g, reason: collision with root package name */
    public final i f8788g = new i(a0.a(b.class), new z1(this, 13));

    @Override // gd.m
    public final int C() {
        return R.layout.fragment_set_pin;
    }

    @Override // gd.m
    public final void D() {
        super.D();
        ((SetPinViewModel) r()).f8789n.observe(this, new c(3, new a(this, 0)));
        ((SetPinViewModel) r()).f8790o.observe(this, new c(3, new a(this, 1)));
        ((SetPinViewModel) r()).f9084g.observe(this, new c(3, new a(this, 2)));
    }

    @Override // gd.m
    public final void E(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        View next = ((an) q()).f4211s.getNext();
        next.setEnabled(false);
        next.setAlpha(l.s(false));
        PinView pinView = ((an) q()).f4212t;
        Intrinsics.checkNotNullExpressionValue(pinView, "pinView");
        f.n(pinView, new a(this, 3));
        ((an) q()).f4211s.getNext().setOnClickListener(new j(this, 18));
        an anVar = (an) q();
        anVar.f4211s.setNumberClick(new a(this, 4));
    }

    @Override // gd.m
    public final void w(da.f fragmentComponent) {
        Intrinsics.checkNotNullParameter(fragmentComponent, "fragmentComponent");
        da.b bVar = fragmentComponent.f14279b;
        e schedulerProvider = bVar.k();
        ct.a compositeDisposable = bVar.c();
        UserRepository userRepository = bVar.m();
        g.i(userRepository);
        o0 o0Var = fragmentComponent.f14280c;
        o0Var.getClass();
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        ca.c factory = new ca.c(a0.a(SetPinViewModel.class), new j0(schedulerProvider, compositeDisposable, userRepository, 22));
        m mVar = o0Var.f15244a;
        h1 e10 = com.google.android.gms.internal.p002firebaseauthapi.a.e(mVar, "owner", factory, "factory");
        y4.c defaultCreationExtras = com.google.android.gms.internal.p002firebaseauthapi.a.o(mVar, "owner", e10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h10 = com.google.android.gms.internal.p002firebaseauthapi.a.h(e10, factory, defaultCreationExtras, SetPinViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(SetPinViewModel.class, "<this>", SetPinViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            SetPinViewModel setPinViewModel = (SetPinViewModel) h10.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            g.j(setPinViewModel);
            this.f17284b = setPinViewModel;
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
