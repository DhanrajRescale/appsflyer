package com.assetgro.stockgro.ui.subscription;

import android.view.View;
import androidx.fragment.app.j0;
import androidx.lifecycle.h1;
import androidx.navigation.i;
import ba.ep;
import ca.c;
import com.assetgro.stockgro.data.AnalyticEvent;
import com.assetgro.stockgro.data.remote.response.SubscriptionFeatureFlag;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.subscription.SubscriptionMaintenanceFragment;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import ct.a;
import da.b;
import da.f;
import ea.n0;
import ej.z;
import gd.m;
import iu.a0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kq.e;
import qu.i0;
import xf.x;
import yk.g;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/assetgro/stockgro/ui/subscription/SubscriptionMaintenanceFragment;", "Lgd/m;", "Lcom/assetgro/stockgro/ui/subscription/SubscriptionMaintenanceViewModel;", "Lba/ep;", "<init>", "()V", "ni/j", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class SubscriptionMaintenanceFragment extends m<SubscriptionMaintenanceViewModel, ep> {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f10544h = 0;

    /* renamed from: g, reason: collision with root package name */
    public final i f10545g = new i(a0.a(z.class), new x(this, 15));

    @Override // gd.m
    public final int C() {
        return R.layout.fragment_subscription_maintenance;
    }

    @Override // gd.m
    public final void E(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        y(new AnalyticEvent("app_sub_purchase_maintenance_screen_viewed", null, 2, null));
        ep epVar = (ep) q();
        final int i10 = 0;
        epVar.f4637v.setNavigationOnClickListener(new View.OnClickListener(this) { // from class: ej.y

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SubscriptionMaintenanceFragment f15562b;

            {
                this.f15562b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i11 = i10;
                SubscriptionMaintenanceFragment this$0 = this.f15562b;
                switch (i11) {
                    case 0:
                        int i12 = SubscriptionMaintenanceFragment.f10544h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        q6.l.h(this$0).q();
                        return;
                    default:
                        int i13 = SubscriptionMaintenanceFragment.f10544h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        q6.l.h(this$0).q();
                        return;
                }
            }
        });
        SubscriptionFeatureFlag subscriptionFeatureFlag = ((z) this.f10545g.getValue()).f15563a;
        if (subscriptionFeatureFlag != null) {
            ((ep) q()).f4636u.setText(subscriptionFeatureFlag.getTitle());
            ((ep) q()).f4635t.setText(subscriptionFeatureFlag.getDescription());
        }
        ep epVar2 = (ep) q();
        final int i11 = 1;
        epVar2.f4634s.setOnClickListener(new View.OnClickListener(this) { // from class: ej.y

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SubscriptionMaintenanceFragment f15562b;

            {
                this.f15562b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i112 = i11;
                SubscriptionMaintenanceFragment this$0 = this.f15562b;
                switch (i112) {
                    case 0:
                        int i12 = SubscriptionMaintenanceFragment.f10544h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        q6.l.h(this$0).q();
                        return;
                    default:
                        int i13 = SubscriptionMaintenanceFragment.f10544h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        q6.l.h(this$0).q();
                        return;
                }
            }
        });
    }

    @Override // gd.m
    public final void w(f fragmentComponent) {
        Intrinsics.checkNotNullParameter(fragmentComponent, "fragmentComponent");
        b bVar = fragmentComponent.f14279b;
        e k10 = bVar.k();
        a c10 = bVar.c();
        UserRepository userRepository = bVar.m();
        g.i(userRepository);
        n0 n0Var = fragmentComponent.f14278a;
        com.google.android.gms.internal.p002firebaseauthapi.a.s(n0Var, k10, "schedulerProvider", c10, "compositeDisposable");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        j0 requireActivity = n0Var.f15238a.requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        c factory = new c(a0.a(SubscriptionMaintenanceViewModel.class), new ea.j0(k10, c10, userRepository, 14));
        h1 h10 = da.e.h(requireActivity, "owner", factory, "factory");
        y4.c defaultCreationExtras = da.e.u(requireActivity, "owner", h10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h11 = com.google.android.gms.internal.p002firebaseauthapi.a.h(h10, factory, defaultCreationExtras, SubscriptionMaintenanceViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(SubscriptionMaintenanceViewModel.class, "<this>", SubscriptionMaintenanceViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            SubscriptionMaintenanceViewModel subscriptionMaintenanceViewModel = (SubscriptionMaintenanceViewModel) h11.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            g.j(subscriptionMaintenanceViewModel);
            this.f17284b = subscriptionMaintenanceViewModel;
            FirebaseAnalytics d10 = bVar.d();
            g.i(d10);
            this.f17285c = d10;
            Analytics o10 = bVar.o();
            g.i(o10);
            this.f17286d = o10;
            ls.n0 h12 = bVar.h();
            g.i(h12);
            this.f17287e = h12;
            return;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
    }
}
