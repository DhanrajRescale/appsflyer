package com.assetgro.stockgro.ui.subscription.purchase;

import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.j0;
import androidx.lifecycle.h1;
import androidx.lifecycle.u0;
import androidx.navigation.i;
import ba.kp;
import ba.lp;
import bj.c;
import com.assetgro.stockgro.data.repository.PaymentRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.subscription.ManageSubscriptionViewModel;
import com.assetgro.stockgro.ui.subscription.purchase.SubscriptionPurchaseStatusFragment;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import ct.a;
import da.f;
import ea.n0;
import gd.m;
import hj.b;
import hj.d;
import hj.e;
import iu.a0;
import kj.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import q6.l;
import qu.i0;
import ut.g;
import ut.h;
import xf.x;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/assetgro/stockgro/ui/subscription/purchase/SubscriptionPurchaseStatusFragment;", "Lgd/m;", "Lcom/assetgro/stockgro/ui/subscription/purchase/SubscriptionPurchaseStatusViewModel;", "Lba/kp;", "<init>", "()V", "ni/j", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class SubscriptionPurchaseStatusFragment extends m<SubscriptionPurchaseStatusViewModel, kp> {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f10569i = 0;

    /* renamed from: g, reason: collision with root package name */
    public final i f10570g = new i(a0.a(e.class), new x(this, 18));

    /* renamed from: h, reason: collision with root package name */
    public final g f10571h = h.a(new b(this, 0));

    @Override // gd.m
    public final int C() {
        return R.layout.fragment_subscription_purchase_status;
    }

    @Override // gd.m
    public final void D() {
        super.D();
        ((SubscriptionPurchaseStatusViewModel) r()).f9084g.observe(this, new c(14, new hj.c(this, 0)));
        ((SubscriptionPurchaseStatusViewModel) r()).f10575q.observe(this, new c(14, new hj.c(this, 1)));
        ((SubscriptionPurchaseStatusViewModel) r()).f10577s.observe(this, new c(14, d.f18498a));
        ((SubscriptionPurchaseStatusViewModel) r()).f10580v.observe(this, new c(14, new hj.c(this, 2)));
    }

    @Override // gd.m
    public final void E(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Toolbar toolbar = ((kp) q()).f5283w;
        Intrinsics.c(toolbar);
        p(toolbar);
        final int i10 = 0;
        toolbar.setNavigationOnClickListener(new View.OnClickListener(this) { // from class: hj.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SubscriptionPurchaseStatusFragment f18493b;

            {
                this.f18493b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i11 = i10;
                SubscriptionPurchaseStatusFragment this$0 = this.f18493b;
                switch (i11) {
                    case 0:
                        int i12 = SubscriptionPurchaseStatusFragment.f10569i;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        l.h(this$0).o(new androidx.navigation.a(R.id.action_subscriptionPurchaseStatus_to_mySubscription));
                        return;
                    default:
                        int i13 = SubscriptionPurchaseStatusFragment.f10569i;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        l.h(this$0).o(new androidx.navigation.a(R.id.action_subscriptionPurchaseStatus_to_mySubscription));
                        return;
                }
            }
        });
        lp lpVar = (lp) ((kp) q());
        lpVar.f5284x = (SubscriptionPurchaseStatusViewModel) r();
        synchronized (lpVar) {
            lpVar.f5382y |= 8;
        }
        lpVar.a(24);
        lpVar.m();
        ((kp) q()).p(getViewLifecycleOwner());
        if (H().f18502d) {
            SubscriptionPurchaseStatusViewModel subscriptionPurchaseStatusViewModel = (SubscriptionPurchaseStatusViewModel) r();
            String str = H().f18503e;
            subscriptionPurchaseStatusViewModel.f10581w.postValue(new j(Boolean.TRUE));
            if (str != null) {
                subscriptionPurchaseStatusViewModel.f10578t.postValue(str);
            }
        } else {
            SubscriptionPurchaseStatusViewModel subscriptionPurchaseStatusViewModel2 = (SubscriptionPurchaseStatusViewModel) r();
            String pgRoute = H().f18500b;
            String packageId = H().f18499a;
            String str2 = H().f18501c;
            boolean z10 = ((ManageSubscriptionViewModel) this.f10571h.getValue()).f10498q;
            Intrinsics.checkNotNullParameter(pgRoute, "pgRoute");
            Intrinsics.checkNotNullParameter(packageId, "packageId");
            subscriptionPurchaseStatusViewModel2.f9084g.setValue(Boolean.TRUE);
            yk.g.H(u0.f(subscriptionPurchaseStatusViewModel2), null, null, new hj.g(subscriptionPurchaseStatusViewModel2, pgRoute, packageId, str2, z10, null), 3);
        }
        final int i11 = 1;
        ((kp) q()).f5279s.setOnClickListener(new View.OnClickListener(this) { // from class: hj.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SubscriptionPurchaseStatusFragment f18493b;

            {
                this.f18493b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i112 = i11;
                SubscriptionPurchaseStatusFragment this$0 = this.f18493b;
                switch (i112) {
                    case 0:
                        int i12 = SubscriptionPurchaseStatusFragment.f10569i;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        l.h(this$0).o(new androidx.navigation.a(R.id.action_subscriptionPurchaseStatus_to_mySubscription));
                        return;
                    default:
                        int i13 = SubscriptionPurchaseStatusFragment.f10569i;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        l.h(this$0).o(new androidx.navigation.a(R.id.action_subscriptionPurchaseStatus_to_mySubscription));
                        return;
                }
            }
        });
    }

    public final e H() {
        return (e) this.f10570g.getValue();
    }

    @Override // gd.m
    public final void w(f fragmentComponent) {
        Intrinsics.checkNotNullParameter(fragmentComponent, "fragmentComponent");
        da.b bVar = fragmentComponent.f14279b;
        kq.e k10 = bVar.k();
        a c10 = bVar.c();
        UserRepository userRepository = bVar.m();
        yk.g.i(userRepository);
        PaymentRepository paymentRepository = bVar.i();
        yk.g.i(paymentRepository);
        jj.a appsFlyerAnalyticsEngineImpl = bVar.n();
        yk.g.i(appsFlyerAnalyticsEngineImpl);
        n0 n0Var = fragmentComponent.f14278a;
        com.google.android.gms.internal.p002firebaseauthapi.a.s(n0Var, k10, "schedulerProvider", c10, "compositeDisposable");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(paymentRepository, "paymentRepository");
        Intrinsics.checkNotNullParameter(appsFlyerAnalyticsEngineImpl, "appsFlyerAnalyticsEngineImpl");
        j0 requireActivity = n0Var.f15238a.requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        ca.c factory = new ca.c(a0.a(SubscriptionPurchaseStatusViewModel.class), new z2.e(k10, c10, userRepository, paymentRepository, appsFlyerAnalyticsEngineImpl, 9));
        h1 h10 = da.e.h(requireActivity, "owner", factory, "factory");
        y4.c defaultCreationExtras = da.e.u(requireActivity, "owner", h10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h11 = com.google.android.gms.internal.p002firebaseauthapi.a.h(h10, factory, defaultCreationExtras, SubscriptionPurchaseStatusViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(SubscriptionPurchaseStatusViewModel.class, "<this>", SubscriptionPurchaseStatusViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            SubscriptionPurchaseStatusViewModel subscriptionPurchaseStatusViewModel = (SubscriptionPurchaseStatusViewModel) h11.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            yk.g.j(subscriptionPurchaseStatusViewModel);
            this.f17284b = subscriptionPurchaseStatusViewModel;
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
