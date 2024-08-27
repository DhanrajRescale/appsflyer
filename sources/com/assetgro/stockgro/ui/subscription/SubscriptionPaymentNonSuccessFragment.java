package com.assetgro.stockgro.ui.subscription;

import ag.b;
import android.content.Intent;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.j0;
import androidx.lifecycle.e0;
import androidx.lifecycle.h1;
import androidx.navigation.i;
import ba.ip;
import ca.c;
import com.assetgro.stockgro.data.AnalyticEvent;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.payments.home.WalletHomeActivity;
import com.assetgro.stockgro.ui.subscription.SubscriptionPaymentNonSuccessFragment;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import ct.a;
import da.f;
import ea.n0;
import ej.b0;
import ej.q0;
import gd.m;
import iu.a0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kq.e;
import qu.i0;
import r3.k;
import ut.h;
import xf.x;
import yk.g;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/assetgro/stockgro/ui/subscription/SubscriptionPaymentNonSuccessFragment;", "Lgd/m;", "Lcom/assetgro/stockgro/ui/subscription/SubscriptionPaymentNonSuccessViewModel;", "Lba/ip;", "<init>", "()V", "ni/g", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class SubscriptionPaymentNonSuccessFragment extends m<SubscriptionPaymentNonSuccessViewModel, ip> {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f10546h = 0;

    /* renamed from: g, reason: collision with root package name */
    public final i f10547g = new i(a0.a(b0.class), new x(this, 16));

    public SubscriptionPaymentNonSuccessFragment() {
        h.a(new b(this, 27));
    }

    @Override // gd.m
    public final int C() {
        return R.layout.fragment_subscription_purchase_non_success;
    }

    @Override // gd.m
    public final void E(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ip ipVar = (ip) q();
        String string = getString(R.string.subscription_pending);
        Toolbar toolbar = ipVar.f5072w;
        toolbar.setTitle(string);
        p(toolbar);
        final int i10 = 0;
        toolbar.setNavigationOnClickListener(new View.OnClickListener(this) { // from class: ej.a0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SubscriptionPaymentNonSuccessFragment f15450b;

            {
                this.f15450b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i11 = i10;
                SubscriptionPaymentNonSuccessFragment this$0 = this.f15450b;
                switch (i11) {
                    case 0:
                        int i12 = SubscriptionPaymentNonSuccessFragment.f10546h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.requireActivity().onBackPressed();
                        return;
                    case 1:
                        int i13 = SubscriptionPaymentNonSuccessFragment.f10546h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.startActivity(new Intent(this$0.requireContext(), (Class<?>) WalletHomeActivity.class));
                        this$0.requireActivity().finish();
                        return;
                    case 2:
                        int i14 = SubscriptionPaymentNonSuccessFragment.f10546h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        androidx.navigation.t h10 = q6.l.h(this$0);
                        String packageId = this$0.H().f15455c;
                        boolean a10 = Intrinsics.a(this$0.H().f15454b, "UPI-AUTOPAY");
                        Intrinsics.checkNotNullParameter(packageId, "packageId");
                        h10.o(new c0(packageId, a10));
                        return;
                    default:
                        int i15 = SubscriptionPaymentNonSuccessFragment.f10546h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.startActivity(new Intent(this$0.requireContext(), (Class<?>) WalletHomeActivity.class));
                        this$0.requireActivity().finish();
                        return;
                }
            }
        });
        SubscriptionPaymentNonSuccessViewModel subscriptionPaymentNonSuccessViewModel = (SubscriptionPaymentNonSuccessViewModel) r();
        String type = H().f15453a;
        Intrinsics.checkNotNullParameter(type, "type");
        boolean a10 = Intrinsics.a(type, "PENDING");
        e0 e0Var = subscriptionPaymentNonSuccessViewModel.f10548n;
        if (a10) {
            e0Var.postValue(new q0(R.string.subscription_pending, R.drawable.ic_payment_failed, R.string.subscription_pending_title, R.string.subscription_pending_message, R.string.goto_stockgro_account, WalletHomeActivity.class));
        } else {
            e0Var.postValue(new q0(R.string.subscription_failed, R.drawable.ic_bull_timer, R.string.subscription_failed_title, R.string.subscription_failed_message, R.string.retry, ManageSubscriptionActivity.class));
        }
        ((ip) q()).p(this);
        String str = H().f15453a;
        final int i11 = 2;
        if (Intrinsics.a(str, "PENDING")) {
            z(new AnalyticEvent("app_sub_purchase_pending", null, 2, null));
            if (Intrinsics.a(H().f15454b, "UPI-AUTOPAY")) {
                ip ipVar2 = (ip) q();
                ipVar2.f5072w.setTitle(getResources().getString(R.string.payment_pending_text));
                ip ipVar3 = (ip) q();
                ipVar3.f5071v.setText(getResources().getString(R.string.upi_auto_pay_mandate_pendingtitle));
                ip ipVar4 = (ip) q();
                ipVar4.f5070u.setText(getResources().getString(R.string.upi_auto_pay_mandate_pending_message));
            } else {
                ip ipVar5 = (ip) q();
                ipVar5.f5072w.setTitle(getResources().getString(R.string.subscription_pending));
                ip ipVar6 = (ip) q();
                ipVar6.f5071v.setText(getResources().getString(R.string.subscription_pending_title));
                ip ipVar7 = (ip) q();
                ipVar7.f5070u.setText(getResources().getString(R.string.subscription_pending_message));
            }
            ip ipVar8 = (ip) q();
            ipVar8.f5069t.setImageDrawable(k.getDrawable(requireContext(), R.drawable.ic_bull_timer));
            ip ipVar9 = (ip) q();
            ipVar9.f5068s.setText(getResources().getString(R.string.goto_stockgro_account));
            ip ipVar10 = (ip) q();
            final int i12 = 1;
            ipVar10.f5068s.setOnClickListener(new View.OnClickListener(this) { // from class: ej.a0

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ SubscriptionPaymentNonSuccessFragment f15450b;

                {
                    this.f15450b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i112 = i12;
                    SubscriptionPaymentNonSuccessFragment this$0 = this.f15450b;
                    switch (i112) {
                        case 0:
                            int i122 = SubscriptionPaymentNonSuccessFragment.f10546h;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            this$0.requireActivity().onBackPressed();
                            return;
                        case 1:
                            int i13 = SubscriptionPaymentNonSuccessFragment.f10546h;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            this$0.startActivity(new Intent(this$0.requireContext(), (Class<?>) WalletHomeActivity.class));
                            this$0.requireActivity().finish();
                            return;
                        case 2:
                            int i14 = SubscriptionPaymentNonSuccessFragment.f10546h;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            androidx.navigation.t h10 = q6.l.h(this$0);
                            String packageId = this$0.H().f15455c;
                            boolean a102 = Intrinsics.a(this$0.H().f15454b, "UPI-AUTOPAY");
                            Intrinsics.checkNotNullParameter(packageId, "packageId");
                            h10.o(new c0(packageId, a102));
                            return;
                        default:
                            int i15 = SubscriptionPaymentNonSuccessFragment.f10546h;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            this$0.startActivity(new Intent(this$0.requireContext(), (Class<?>) WalletHomeActivity.class));
                            this$0.requireActivity().finish();
                            return;
                    }
                }
            });
            return;
        }
        if (Intrinsics.a(str, "FAILURE")) {
            z(new AnalyticEvent("app_sub_purchase_fail", null, 2, null));
            if (Intrinsics.a(H().f15454b, "UPI-AUTOPAY")) {
                ip ipVar11 = (ip) q();
                ipVar11.f5072w.setTitle(getResources().getString(R.string.payment_failed));
                ip ipVar12 = (ip) q();
                ipVar12.f5071v.setText(getResources().getString(R.string.upi_auto_pay_mandate_failed_title));
                ip ipVar13 = (ip) q();
                ipVar13.f5070u.setText(getResources().getString(R.string.upi_auto_pay_mandate_failed_message));
            } else {
                ip ipVar14 = (ip) q();
                ipVar14.f5072w.setTitle(getResources().getString(R.string.subscription_failed));
                ip ipVar15 = (ip) q();
                ipVar15.f5071v.setText(getResources().getString(R.string.subscription_failed_title));
                ip ipVar16 = (ip) q();
                ipVar16.f5070u.setText(getResources().getString(R.string.subscription_failed_message));
            }
            ip ipVar17 = (ip) q();
            ipVar17.f5069t.setImageDrawable(k.getDrawable(requireContext(), R.drawable.ic_payment_failed));
            ip ipVar18 = (ip) q();
            ipVar18.f5068s.setText(getResources().getString(R.string.retry));
            ip ipVar19 = (ip) q();
            ipVar19.f5068s.setOnClickListener(new View.OnClickListener(this) { // from class: ej.a0

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ SubscriptionPaymentNonSuccessFragment f15450b;

                {
                    this.f15450b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i112 = i11;
                    SubscriptionPaymentNonSuccessFragment this$0 = this.f15450b;
                    switch (i112) {
                        case 0:
                            int i122 = SubscriptionPaymentNonSuccessFragment.f10546h;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            this$0.requireActivity().onBackPressed();
                            return;
                        case 1:
                            int i13 = SubscriptionPaymentNonSuccessFragment.f10546h;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            this$0.startActivity(new Intent(this$0.requireContext(), (Class<?>) WalletHomeActivity.class));
                            this$0.requireActivity().finish();
                            return;
                        case 2:
                            int i14 = SubscriptionPaymentNonSuccessFragment.f10546h;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            androidx.navigation.t h10 = q6.l.h(this$0);
                            String packageId = this$0.H().f15455c;
                            boolean a102 = Intrinsics.a(this$0.H().f15454b, "UPI-AUTOPAY");
                            Intrinsics.checkNotNullParameter(packageId, "packageId");
                            h10.o(new c0(packageId, a102));
                            return;
                        default:
                            int i15 = SubscriptionPaymentNonSuccessFragment.f10546h;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            this$0.startActivity(new Intent(this$0.requireContext(), (Class<?>) WalletHomeActivity.class));
                            this$0.requireActivity().finish();
                            return;
                    }
                }
            });
            return;
        }
        z(new AnalyticEvent("app_sub_purchase_error", null, 2, null));
        ip ipVar20 = (ip) q();
        ipVar20.f5072w.setTitle(getResources().getString(R.string.plan_purchase_failed_toolbar_title));
        ip ipVar21 = (ip) q();
        ipVar21.f5069t.setImageDrawable(k.getDrawable(requireContext(), R.drawable.ic_bull_timer));
        ip ipVar22 = (ip) q();
        ipVar22.f5071v.setText(getResources().getString(R.string.plan_purchase_failed_title));
        ip ipVar23 = (ip) q();
        ipVar23.f5070u.setText(getResources().getString(R.string.plan_purchase_failed_message));
        ip ipVar24 = (ip) q();
        ipVar24.f5068s.setText(getResources().getString(R.string.goto_stockgro_account));
        ip ipVar25 = (ip) q();
        final int i13 = 3;
        ipVar25.f5068s.setOnClickListener(new View.OnClickListener(this) { // from class: ej.a0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SubscriptionPaymentNonSuccessFragment f15450b;

            {
                this.f15450b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i112 = i13;
                SubscriptionPaymentNonSuccessFragment this$0 = this.f15450b;
                switch (i112) {
                    case 0:
                        int i122 = SubscriptionPaymentNonSuccessFragment.f10546h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.requireActivity().onBackPressed();
                        return;
                    case 1:
                        int i132 = SubscriptionPaymentNonSuccessFragment.f10546h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.startActivity(new Intent(this$0.requireContext(), (Class<?>) WalletHomeActivity.class));
                        this$0.requireActivity().finish();
                        return;
                    case 2:
                        int i14 = SubscriptionPaymentNonSuccessFragment.f10546h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        androidx.navigation.t h10 = q6.l.h(this$0);
                        String packageId = this$0.H().f15455c;
                        boolean a102 = Intrinsics.a(this$0.H().f15454b, "UPI-AUTOPAY");
                        Intrinsics.checkNotNullParameter(packageId, "packageId");
                        h10.o(new c0(packageId, a102));
                        return;
                    default:
                        int i15 = SubscriptionPaymentNonSuccessFragment.f10546h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.startActivity(new Intent(this$0.requireContext(), (Class<?>) WalletHomeActivity.class));
                        this$0.requireActivity().finish();
                        return;
                }
            }
        });
    }

    public final b0 H() {
        return (b0) this.f10547g.getValue();
    }

    @Override // gd.m
    public final void w(f fragmentComponent) {
        Intrinsics.checkNotNullParameter(fragmentComponent, "fragmentComponent");
        da.b bVar = fragmentComponent.f14279b;
        e k10 = bVar.k();
        a c10 = bVar.c();
        UserRepository userRepository = bVar.m();
        g.i(userRepository);
        n0 n0Var = fragmentComponent.f14278a;
        com.google.android.gms.internal.p002firebaseauthapi.a.s(n0Var, k10, "schedulerProvider", c10, "compositeDisposable");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        j0 requireActivity = n0Var.f15238a.requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        c factory = new c(a0.a(SubscriptionPaymentNonSuccessViewModel.class), new ea.j0(k10, c10, userRepository, 15));
        h1 h10 = da.e.h(requireActivity, "owner", factory, "factory");
        y4.c defaultCreationExtras = da.e.u(requireActivity, "owner", h10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h11 = com.google.android.gms.internal.p002firebaseauthapi.a.h(h10, factory, defaultCreationExtras, SubscriptionPaymentNonSuccessViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(SubscriptionPaymentNonSuccessViewModel.class, "<this>", SubscriptionPaymentNonSuccessViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            SubscriptionPaymentNonSuccessViewModel subscriptionPaymentNonSuccessViewModel = (SubscriptionPaymentNonSuccessViewModel) h11.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            g.j(subscriptionPaymentNonSuccessViewModel);
            this.f17284b = subscriptionPaymentNonSuccessViewModel;
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
