package com.assetgro.stockgro.ui.subscription;

import ag.b;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.j0;
import androidx.lifecycle.h1;
import androidx.lifecycle.o;
import androidx.navigation.i;
import ba.nl;
import bj.c;
import com.assetgro.stockgro.data.AnalyticEvent;
import com.assetgro.stockgro.data.repository.PaymentRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.prod.R;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import da.f;
import dj.e;
import ea.k;
import ea.n0;
import ej.j;
import gd.m;
import gj.a;
import iu.a0;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import qu.i0;
import ut.g;
import ut.h;
import vt.p0;
import xf.x;
import yo.n;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/assetgro/stockgro/ui/subscription/OtherSubscriptionPlansFragment;", "Lgd/m;", "Lcom/assetgro/stockgro/ui/subscription/OtherSubscriptionPlansViewModel;", "Lba/nl;", "<init>", "()V", "ni/g", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class OtherSubscriptionPlansFragment extends m<OtherSubscriptionPlansViewModel, nl> {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f10518k = 0;

    /* renamed from: h, reason: collision with root package name */
    public a f10520h;

    /* renamed from: g, reason: collision with root package name */
    public final i f10519g = new i(a0.a(j.class), new x(this, 13));

    /* renamed from: i, reason: collision with root package name */
    public ej.a f10521i = ej.a.f15445a;

    /* renamed from: j, reason: collision with root package name */
    public final g f10522j = h.a(new b(this, 25));

    public static final void H(OtherSubscriptionPlansFragment otherSubscriptionPlansFragment, boolean z10, String str) {
        String str2;
        otherSubscriptionPlansFragment.getClass();
        Pair[] pairArr = new Pair[2];
        pairArr[0] = new Pair("target_plan", str);
        if (z10) {
            str2 = "click";
        } else {
            str2 = "swipe";
        }
        pairArr[1] = new Pair("interaction_type", str2);
        AnalyticEvent analyticEvent = new AnalyticEvent("app_sub_plan_features_compared", p0.f(pairArr));
        otherSubscriptionPlansFragment.z(analyticEvent);
        otherSubscriptionPlansFragment.B(analyticEvent);
    }

    @Override // gd.m
    public final int C() {
        return R.layout.fragment_other_subscription_plans;
    }

    @Override // gd.m
    public final void D() {
        super.D();
        ((OtherSubscriptionPlansViewModel) r()).f10525p.observe(this, new c(9, new ej.h(this, 0)));
        ((OtherSubscriptionPlansViewModel) r()).f10527r.observe(this, new c(9, new ej.h(this, 1)));
        ((OtherSubscriptionPlansViewModel) r()).f10529t.observe(this, new c(9, new ej.h(this, 2)));
    }

    @Override // gd.m
    public final void E(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        nl nlVar = (nl) q();
        String string = getString(R.string.more_plans);
        Toolbar toolbar = nlVar.f5585u;
        toolbar.setTitle(string);
        p(toolbar);
        toolbar.setNavigationOnClickListener(new ph.a(this, 15));
        o lifecycle = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
        this.f10520h = new a(lifecycle, new be.b(this, 21));
        nl nlVar2 = (nl) q();
        a aVar = this.f10520h;
        if (aVar != null) {
            nlVar2.f5583s.setAdapter(aVar);
            nl nlVar3 = (nl) q();
            nlVar3.f5583s.a(new z7.c(this, 4));
            nl nlVar4 = (nl) q();
            nl nlVar5 = (nl) q();
            new n(nlVar4.f5584t, nlVar5.f5583s, new e(this, 2)).a();
            nl nlVar6 = (nl) q();
            nlVar6.f5584t.a(new nc.c(this, 12));
            a aVar2 = this.f10520h;
            if (aVar2 != null) {
                aVar2.u(I().f15490a.getPackages());
                yk.g.H(yk.j.X0(this), null, null, new ej.i(this, null), 3);
                return;
            } else {
                Intrinsics.k("subscriptionPlanDetailAdapter");
                throw null;
            }
        }
        Intrinsics.k("subscriptionPlanDetailAdapter");
        throw null;
    }

    public final j I() {
        return (j) this.f10519g.getValue();
    }

    @Override // gd.m
    public final void w(f fragmentComponent) {
        Intrinsics.checkNotNullParameter(fragmentComponent, "fragmentComponent");
        da.b bVar = fragmentComponent.f14279b;
        kq.e k10 = bVar.k();
        ct.a c10 = bVar.c();
        UserRepository userRepository = bVar.m();
        yk.g.i(userRepository);
        PaymentRepository paymentRepository = bVar.i();
        yk.g.i(paymentRepository);
        n0 n0Var = fragmentComponent.f14278a;
        com.google.android.gms.internal.p002firebaseauthapi.a.s(n0Var, k10, "schedulerProvider", c10, "compositeDisposable");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(paymentRepository, "paymentRepository");
        j0 requireActivity = n0Var.f15238a.requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        ca.c factory = new ca.c(a0.a(OtherSubscriptionPlansViewModel.class), new k(k10, c10, userRepository, paymentRepository, 7));
        h1 h10 = da.e.h(requireActivity, "owner", factory, "factory");
        y4.c defaultCreationExtras = da.e.u(requireActivity, "owner", h10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h11 = com.google.android.gms.internal.p002firebaseauthapi.a.h(h10, factory, defaultCreationExtras, OtherSubscriptionPlansViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(OtherSubscriptionPlansViewModel.class, "<this>", OtherSubscriptionPlansViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            OtherSubscriptionPlansViewModel otherSubscriptionPlansViewModel = (OtherSubscriptionPlansViewModel) h11.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            yk.g.j(otherSubscriptionPlansViewModel);
            this.f17284b = otherSubscriptionPlansViewModel;
            FirebaseAnalytics d10 = bVar.d();
            yk.g.i(d10);
            this.f17285c = d10;
            Analytics o10 = bVar.o();
            yk.g.i(o10);
            this.f17286d = o10;
            ls.n0 h12 = bVar.h();
            yk.g.i(h12);
            this.f17287e = h12;
            return;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
    }
}
