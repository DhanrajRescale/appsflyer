package com.assetgro.stockgro.ui.payments.withdrawal;

import android.content.Intent;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.h1;
import ba.a5;
import ba.z4;
import ca.c;
import com.assetgro.stockgro.data.repository.PaymentRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.payments.home.WalletHomeActivity;
import com.assetgro.stockgro.ui.payments.withdrawal.PaymentWithdrawalActivity;
import com.assetgro.stockgro.ui.payments.withdrawal.WithdrawalDetailActivity;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import da.a;
import ea.k;
import gd.b;
import iu.a0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kq.e;
import ls.n0;
import qu.i0;
import ub.f;
import xf.v;
import yk.g;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/assetgro/stockgro/ui/payments/withdrawal/PaymentWithdrawalActivity;", "Lgd/b;", "Lcom/assetgro/stockgro/ui/payments/withdrawal/PaymentWithdrawalViewModel;", "Lba/z4;", "<init>", "()V", "yk/o", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class PaymentWithdrawalActivity extends b {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f9737k = 0;

    @Override // gd.b
    public final int F() {
        return R.layout.activity_withdrawal_home;
    }

    @Override // gd.b
    public final void H() {
        super.H();
        ((PaymentWithdrawalViewModel) x()).f9084g.observe(this, new v(3, new f(this, 25)));
    }

    @Override // gd.b
    public final void I() {
        a5 a5Var = (a5) ((z4) w());
        a5Var.B = (PaymentWithdrawalViewModel) x();
        synchronized (a5Var) {
            a5Var.M |= 4;
        }
        a5Var.a(24);
        a5Var.m();
        ((z4) w()).p(this);
        Toolbar toolbar = ((z4) w()).f6803y;
        toolbar.setTitle(getString(R.string.text_payment_withdrawal));
        u(toolbar);
        final int i10 = 0;
        toolbar.setNavigationOnClickListener(new View.OnClickListener(this) { // from class: fg.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PaymentWithdrawalActivity f16059b;

            {
                this.f16059b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i11 = i10;
                PaymentWithdrawalActivity this$0 = this.f16059b;
                switch (i11) {
                    case 0:
                        int i12 = PaymentWithdrawalActivity.f9737k;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.finish();
                        return;
                    case 1:
                        int i13 = PaymentWithdrawalActivity.f9737k;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intent intent = new Intent(this$0, (Class<?>) WithdrawalDetailActivity.class);
                        intent.putExtra("WITHDRAWAL_TRANSFER_MODE", "TRANSFER_TO_PAYTM_WALLET");
                        this$0.startActivityForResult(intent, 110);
                        return;
                    case 2:
                        int i14 = PaymentWithdrawalActivity.f9737k;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intent intent2 = new Intent(this$0, (Class<?>) WithdrawalDetailActivity.class);
                        intent2.putExtra("WITHDRAWAL_TRANSFER_MODE", "TRANSFER_TO_BANK");
                        this$0.startActivityForResult(intent2, 110);
                        return;
                    default:
                        int i15 = PaymentWithdrawalActivity.f9737k;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intent intent3 = new Intent(this$0, (Class<?>) WithdrawalDetailActivity.class);
                        intent3.putExtra("WITHDRAWAL_TRANSFER_MODE", "TRANSFER_TO_UPI");
                        this$0.startActivityForResult(intent3, 110);
                        return;
                }
            }
        });
        v(toolbar);
        this.f17260h = "wallet-withdraw-pg-list";
        final int i11 = 1;
        ((z4) w()).f6799u.setOnClickListener(new View.OnClickListener(this) { // from class: fg.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PaymentWithdrawalActivity f16059b;

            {
                this.f16059b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i112 = i11;
                PaymentWithdrawalActivity this$0 = this.f16059b;
                switch (i112) {
                    case 0:
                        int i12 = PaymentWithdrawalActivity.f9737k;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.finish();
                        return;
                    case 1:
                        int i13 = PaymentWithdrawalActivity.f9737k;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intent intent = new Intent(this$0, (Class<?>) WithdrawalDetailActivity.class);
                        intent.putExtra("WITHDRAWAL_TRANSFER_MODE", "TRANSFER_TO_PAYTM_WALLET");
                        this$0.startActivityForResult(intent, 110);
                        return;
                    case 2:
                        int i14 = PaymentWithdrawalActivity.f9737k;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intent intent2 = new Intent(this$0, (Class<?>) WithdrawalDetailActivity.class);
                        intent2.putExtra("WITHDRAWAL_TRANSFER_MODE", "TRANSFER_TO_BANK");
                        this$0.startActivityForResult(intent2, 110);
                        return;
                    default:
                        int i15 = PaymentWithdrawalActivity.f9737k;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intent intent3 = new Intent(this$0, (Class<?>) WithdrawalDetailActivity.class);
                        intent3.putExtra("WITHDRAWAL_TRANSFER_MODE", "TRANSFER_TO_UPI");
                        this$0.startActivityForResult(intent3, 110);
                        return;
                }
            }
        });
        final int i12 = 2;
        ((z4) w()).f6798t.setOnClickListener(new View.OnClickListener(this) { // from class: fg.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PaymentWithdrawalActivity f16059b;

            {
                this.f16059b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i112 = i12;
                PaymentWithdrawalActivity this$0 = this.f16059b;
                switch (i112) {
                    case 0:
                        int i122 = PaymentWithdrawalActivity.f9737k;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.finish();
                        return;
                    case 1:
                        int i13 = PaymentWithdrawalActivity.f9737k;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intent intent = new Intent(this$0, (Class<?>) WithdrawalDetailActivity.class);
                        intent.putExtra("WITHDRAWAL_TRANSFER_MODE", "TRANSFER_TO_PAYTM_WALLET");
                        this$0.startActivityForResult(intent, 110);
                        return;
                    case 2:
                        int i14 = PaymentWithdrawalActivity.f9737k;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intent intent2 = new Intent(this$0, (Class<?>) WithdrawalDetailActivity.class);
                        intent2.putExtra("WITHDRAWAL_TRANSFER_MODE", "TRANSFER_TO_BANK");
                        this$0.startActivityForResult(intent2, 110);
                        return;
                    default:
                        int i15 = PaymentWithdrawalActivity.f9737k;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intent intent3 = new Intent(this$0, (Class<?>) WithdrawalDetailActivity.class);
                        intent3.putExtra("WITHDRAWAL_TRANSFER_MODE", "TRANSFER_TO_UPI");
                        this$0.startActivityForResult(intent3, 110);
                        return;
                }
            }
        });
        final int i13 = 3;
        ((z4) w()).f6800v.setOnClickListener(new View.OnClickListener(this) { // from class: fg.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PaymentWithdrawalActivity f16059b;

            {
                this.f16059b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i112 = i13;
                PaymentWithdrawalActivity this$0 = this.f16059b;
                switch (i112) {
                    case 0:
                        int i122 = PaymentWithdrawalActivity.f9737k;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.finish();
                        return;
                    case 1:
                        int i132 = PaymentWithdrawalActivity.f9737k;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intent intent = new Intent(this$0, (Class<?>) WithdrawalDetailActivity.class);
                        intent.putExtra("WITHDRAWAL_TRANSFER_MODE", "TRANSFER_TO_PAYTM_WALLET");
                        this$0.startActivityForResult(intent, 110);
                        return;
                    case 2:
                        int i14 = PaymentWithdrawalActivity.f9737k;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intent intent2 = new Intent(this$0, (Class<?>) WithdrawalDetailActivity.class);
                        intent2.putExtra("WITHDRAWAL_TRANSFER_MODE", "TRANSFER_TO_BANK");
                        this$0.startActivityForResult(intent2, 110);
                        return;
                    default:
                        int i15 = PaymentWithdrawalActivity.f9737k;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intent intent3 = new Intent(this$0, (Class<?>) WithdrawalDetailActivity.class);
                        intent3.putExtra("WITHDRAWAL_TRANSFER_MODE", "TRANSFER_TO_UPI");
                        this$0.startActivityForResult(intent3, 110);
                        return;
                }
            }
        });
    }

    @Override // androidx.fragment.app.j0, androidx.activity.m, android.app.Activity
    public final void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        if (i10 == 110 && i11 == -1) {
            Intent intent2 = new Intent();
            Unit unit = Unit.f23355a;
            setResult(-1, intent2);
            finish();
        }
    }

    @Override // gd.b, androidx.activity.m, android.app.Activity
    public final void onBackPressed() {
        if (isTaskRoot()) {
            startActivity(new Intent(this, (Class<?>) WalletHomeActivity.class));
            finish();
        } else {
            super.onBackPressed();
        }
    }

    @Override // gd.b
    public final void z(a activityComponent) {
        Intrinsics.checkNotNullParameter(activityComponent, "activityComponent");
        ea.v vVar = (ea.v) activityComponent.f14247b;
        e schedulerProvider = activityComponent.f14246a.k();
        ct.a compositeDisposable = activityComponent.f14246a.c();
        UserRepository userRepository = activityComponent.f14246a.m();
        g.i(userRepository);
        PaymentRepository paymentRepository = activityComponent.f14246a.i();
        g.i(paymentRepository);
        vVar.getClass();
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(paymentRepository, "paymentRepository");
        c factory = new c(a0.a(PaymentWithdrawalViewModel.class), new k(schedulerProvider, compositeDisposable, userRepository, paymentRepository, 1));
        b bVar = vVar.f15290a;
        h1 c10 = com.google.android.gms.internal.p002firebaseauthapi.a.c(bVar, "owner", factory, "factory");
        y4.c defaultCreationExtras = com.google.android.gms.internal.p002firebaseauthapi.a.m(bVar, "owner", c10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h10 = com.google.android.gms.internal.p002firebaseauthapi.a.h(c10, factory, defaultCreationExtras, PaymentWithdrawalViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(PaymentWithdrawalViewModel.class, "<this>", PaymentWithdrawalViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            PaymentWithdrawalViewModel paymentWithdrawalViewModel = (PaymentWithdrawalViewModel) h10.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            g.j(paymentWithdrawalViewModel);
            this.f17254b = paymentWithdrawalViewModel;
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
