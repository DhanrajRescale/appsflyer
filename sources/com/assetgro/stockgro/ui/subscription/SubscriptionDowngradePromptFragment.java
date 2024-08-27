package com.assetgro.stockgro.ui.subscription;

import ag.b;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.j0;
import androidx.lifecycle.h1;
import androidx.lifecycle.u0;
import androidx.navigation.i;
import ba.cp;
import ba.dp;
import bj.c;
import com.assetgro.stockgro.data.AnalyticEvent;
import com.assetgro.stockgro.data.repository.PaymentRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.subscription.SubscriptionDowngradePromptFragment;
import com.assetgro.stockgro.ui.subscription.SubscriptionDowngradePromptViewModel;
import com.google.android.material.button.MaterialButton;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import ct.a;
import da.f;
import ea.k;
import ea.n0;
import ej.r;
import ej.s;
import gd.m;
import iu.a0;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kq.e;
import qu.i0;
import ut.g;
import ut.h;
import xf.x;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/assetgro/stockgro/ui/subscription/SubscriptionDowngradePromptFragment;", "Lgd/m;", "Lcom/assetgro/stockgro/ui/subscription/SubscriptionDowngradePromptViewModel;", "Lba/cp;", "<init>", "()V", "ni/j", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class SubscriptionDowngradePromptFragment extends m<SubscriptionDowngradePromptViewModel, cp> {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f10530i = 0;

    /* renamed from: g, reason: collision with root package name */
    public final i f10531g = new i(a0.a(s.class), new x(this, 14));

    /* renamed from: h, reason: collision with root package name */
    public final g f10532h = h.a(new b(this, 26));

    @Override // gd.m
    public final int C() {
        return R.layout.fragment_subscription_downgrade_prompt;
    }

    @Override // gd.m
    public final void D() {
        ((SubscriptionDowngradePromptViewModel) r()).f10539t.observe(this, new c(10, new r(this, 0)));
        ((SubscriptionDowngradePromptViewModel) r()).f10537r.observe(this, new c(10, new r(this, 1)));
        ((SubscriptionDowngradePromptViewModel) r()).f10541v.observe(this, new c(10, new r(this, 2)));
        ((SubscriptionDowngradePromptViewModel) r()).f10543x.observe(this, new c(10, new r(this, 3)));
        ((SubscriptionDowngradePromptViewModel) r()).f9084g.observe(this, new c(10, new r(this, 4)));
        ((ManageSubscriptionViewModel) this.f10532h.getValue()).f10501t.observe(this, new c(10, new r(this, 5)));
    }

    @Override // gd.m
    public final void E(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        dp dpVar = (dp) ((cp) q());
        dpVar.f4403x = (SubscriptionDowngradePromptViewModel) r();
        synchronized (dpVar) {
            dpVar.f4512z |= 2;
        }
        dpVar.a(24);
        dpVar.m();
        ((cp) q()).p(getViewLifecycleOwner());
        Toolbar toolbar = ((cp) q()).f4402w;
        toolbar.setTitle(getString(R.string.subscription_plan));
        p(toolbar);
        final int i10 = 0;
        toolbar.setNavigationOnClickListener(new View.OnClickListener(this) { // from class: ej.q

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SubscriptionDowngradePromptFragment f15525b;

            {
                this.f15525b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i11 = i10;
                SubscriptionDowngradePromptFragment this$0 = this.f15525b;
                switch (i11) {
                    case 0:
                        int i12 = SubscriptionDowngradePromptFragment.f10530i;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        q6.l.h(this$0).p();
                        return;
                    case 1:
                        int i13 = SubscriptionDowngradePromptFragment.f10530i;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        q6.l.h(this$0).o(new androidx.navigation.a(R.id.actionDowngradePromptToMySubscription));
                        return;
                    default:
                        int i14 = SubscriptionDowngradePromptFragment.f10530i;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.y(new AnalyticEvent("app_sub_downgrade_initiated", vt.p0.f(new Pair("target_plan", this$0.H().f15540d), new Pair("target_plan_price", this$0.H().f15541e), new Pair("validity_left", this$0.H().f15542f))));
                        SubscriptionDowngradePromptViewModel subscriptionDowngradePromptViewModel = (SubscriptionDowngradePromptViewModel) this$0.r();
                        int i15 = this$0.H().f15538b;
                        String packageId = this$0.H().f15537a;
                        Intrinsics.checkNotNullParameter(packageId, "packageId");
                        subscriptionDowngradePromptViewModel.f9084g.postValue(Boolean.TRUE);
                        yk.g.H(u0.f(subscriptionDowngradePromptViewModel), null, null, new w(subscriptionDowngradePromptViewModel, i15, packageId, null), 3);
                        return;
                }
            }
        });
        SubscriptionDowngradePromptViewModel subscriptionDowngradePromptViewModel = (SubscriptionDowngradePromptViewModel) r();
        String packageId = H().f15537a;
        Intrinsics.checkNotNullParameter(packageId, "packageId");
        subscriptionDowngradePromptViewModel.f9084g.postValue(Boolean.TRUE);
        yk.g.H(u0.f(subscriptionDowngradePromptViewModel), null, null, new ej.x(subscriptionDowngradePromptViewModel, packageId, null), 3);
        MaterialButton materialButton = ((cp) q()).f4400u;
        String string = getString(R.string.stay_on_current_plan, H().f15539c);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String format = String.format(string, Arrays.copyOf(new Object[0], 0));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        materialButton.setText(format);
        final int i11 = 1;
        ((cp) q()).f4400u.setOnClickListener(new View.OnClickListener(this) { // from class: ej.q

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SubscriptionDowngradePromptFragment f15525b;

            {
                this.f15525b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i112 = i11;
                SubscriptionDowngradePromptFragment this$0 = this.f15525b;
                switch (i112) {
                    case 0:
                        int i12 = SubscriptionDowngradePromptFragment.f10530i;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        q6.l.h(this$0).p();
                        return;
                    case 1:
                        int i13 = SubscriptionDowngradePromptFragment.f10530i;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        q6.l.h(this$0).o(new androidx.navigation.a(R.id.actionDowngradePromptToMySubscription));
                        return;
                    default:
                        int i14 = SubscriptionDowngradePromptFragment.f10530i;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.y(new AnalyticEvent("app_sub_downgrade_initiated", vt.p0.f(new Pair("target_plan", this$0.H().f15540d), new Pair("target_plan_price", this$0.H().f15541e), new Pair("validity_left", this$0.H().f15542f))));
                        SubscriptionDowngradePromptViewModel subscriptionDowngradePromptViewModel2 = (SubscriptionDowngradePromptViewModel) this$0.r();
                        int i15 = this$0.H().f15538b;
                        String packageId2 = this$0.H().f15537a;
                        Intrinsics.checkNotNullParameter(packageId2, "packageId");
                        subscriptionDowngradePromptViewModel2.f9084g.postValue(Boolean.TRUE);
                        yk.g.H(u0.f(subscriptionDowngradePromptViewModel2), null, null, new w(subscriptionDowngradePromptViewModel2, i15, packageId2, null), 3);
                        return;
                }
            }
        });
        final int i12 = 2;
        ((cp) q()).f4398s.setOnClickListener(new View.OnClickListener(this) { // from class: ej.q

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SubscriptionDowngradePromptFragment f15525b;

            {
                this.f15525b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i112 = i12;
                SubscriptionDowngradePromptFragment this$0 = this.f15525b;
                switch (i112) {
                    case 0:
                        int i122 = SubscriptionDowngradePromptFragment.f10530i;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        q6.l.h(this$0).p();
                        return;
                    case 1:
                        int i13 = SubscriptionDowngradePromptFragment.f10530i;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        q6.l.h(this$0).o(new androidx.navigation.a(R.id.actionDowngradePromptToMySubscription));
                        return;
                    default:
                        int i14 = SubscriptionDowngradePromptFragment.f10530i;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.y(new AnalyticEvent("app_sub_downgrade_initiated", vt.p0.f(new Pair("target_plan", this$0.H().f15540d), new Pair("target_plan_price", this$0.H().f15541e), new Pair("validity_left", this$0.H().f15542f))));
                        SubscriptionDowngradePromptViewModel subscriptionDowngradePromptViewModel2 = (SubscriptionDowngradePromptViewModel) this$0.r();
                        int i15 = this$0.H().f15538b;
                        String packageId2 = this$0.H().f15537a;
                        Intrinsics.checkNotNullParameter(packageId2, "packageId");
                        subscriptionDowngradePromptViewModel2.f9084g.postValue(Boolean.TRUE);
                        yk.g.H(u0.f(subscriptionDowngradePromptViewModel2), null, null, new w(subscriptionDowngradePromptViewModel2, i15, packageId2, null), 3);
                        return;
                }
            }
        });
    }

    public final s H() {
        return (s) this.f10531g.getValue();
    }

    @Override // gd.m
    public final void w(f fragmentComponent) {
        Intrinsics.checkNotNullParameter(fragmentComponent, "fragmentComponent");
        da.b bVar = fragmentComponent.f14279b;
        e k10 = bVar.k();
        a c10 = bVar.c();
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
        ca.c factory = new ca.c(a0.a(SubscriptionDowngradePromptViewModel.class), new k(k10, c10, userRepository, paymentRepository, 10));
        h1 h10 = da.e.h(requireActivity, "owner", factory, "factory");
        y4.c defaultCreationExtras = da.e.u(requireActivity, "owner", h10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h11 = com.google.android.gms.internal.p002firebaseauthapi.a.h(h10, factory, defaultCreationExtras, SubscriptionDowngradePromptViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(SubscriptionDowngradePromptViewModel.class, "<this>", SubscriptionDowngradePromptViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            SubscriptionDowngradePromptViewModel subscriptionDowngradePromptViewModel = (SubscriptionDowngradePromptViewModel) h11.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            yk.g.j(subscriptionDowngradePromptViewModel);
            this.f17284b = subscriptionDowngradePromptViewModel;
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
