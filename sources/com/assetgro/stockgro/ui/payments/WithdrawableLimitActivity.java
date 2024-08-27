package com.assetgro.stockgro.ui.payments;

import android.content.Intent;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.h1;
import ba.v4;
import ba.w4;
import ca.c;
import com.assetgro.stockgro.data.repository.PaymentRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.payments.WithdrawableLimitActivity;
import com.assetgro.stockgro.ui.subscription.ManageSubscriptionActivity;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import da.a;
import ea.k;
import ea.v;
import gd.b;
import iu.a0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kq.e;
import ls.n0;
import qu.i0;
import re.d;
import ub.f;
import yk.g;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/assetgro/stockgro/ui/payments/WithdrawableLimitActivity;", "Lgd/b;", "Lcom/assetgro/stockgro/ui/payments/WithdrawableLimitViewModel;", "Lba/v4;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class WithdrawableLimitActivity extends b {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f9633k = 0;

    @Override // gd.b
    public final int F() {
        return R.layout.activity_withdrawable_limit;
    }

    @Override // gd.b
    public final void H() {
        super.H();
        ((WithdrawableLimitViewModel) x()).f9635o.observe(this, new d(23, new f(this, 23)));
    }

    @Override // gd.b
    public final void I() {
        w4 w4Var = (w4) ((v4) w());
        w4Var.A = (WithdrawableLimitViewModel) x();
        synchronized (w4Var) {
            w4Var.B |= 2;
        }
        w4Var.a(24);
        w4Var.m();
        ((v4) w()).p(this);
        Toolbar toolbar = ((v4) w()).f6387z;
        toolbar.setTitle(getString(R.string.stockgro_wallet));
        v(toolbar);
        u(toolbar);
        final int i10 = 0;
        toolbar.setNavigationOnClickListener(new View.OnClickListener(this) { // from class: tf.h

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WithdrawableLimitActivity f36020b;

            {
                this.f36020b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i11 = i10;
                WithdrawableLimitActivity this$0 = this.f36020b;
                switch (i11) {
                    case 0:
                        int i12 = WithdrawableLimitActivity.f9633k;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.onBackPressed();
                        return;
                    default:
                        int i13 = WithdrawableLimitActivity.f9633k;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.startActivity(new Intent(this$0, (Class<?>) ManageSubscriptionActivity.class));
                        return;
                }
            }
        });
        final int i11 = 1;
        ((v4) w()).f6380s.setOnClickListener(new View.OnClickListener(this) { // from class: tf.h

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WithdrawableLimitActivity f36020b;

            {
                this.f36020b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i112 = i11;
                WithdrawableLimitActivity this$0 = this.f36020b;
                switch (i112) {
                    case 0:
                        int i12 = WithdrawableLimitActivity.f9633k;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.onBackPressed();
                        return;
                    default:
                        int i13 = WithdrawableLimitActivity.f9633k;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.startActivity(new Intent(this$0, (Class<?>) ManageSubscriptionActivity.class));
                        return;
                }
            }
        });
    }

    @Override // gd.b
    public final void z(a activityComponent) {
        Intrinsics.checkNotNullParameter(activityComponent, "activityComponent");
        v vVar = (v) activityComponent.f14247b;
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
        c factory = new c(a0.a(WithdrawableLimitViewModel.class), new k(schedulerProvider, compositeDisposable, userRepository, paymentRepository, 4));
        b bVar = vVar.f15290a;
        h1 c10 = com.google.android.gms.internal.p002firebaseauthapi.a.c(bVar, "owner", factory, "factory");
        y4.c defaultCreationExtras = com.google.android.gms.internal.p002firebaseauthapi.a.m(bVar, "owner", c10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h10 = com.google.android.gms.internal.p002firebaseauthapi.a.h(c10, factory, defaultCreationExtras, WithdrawableLimitViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(WithdrawableLimitViewModel.class, "<this>", WithdrawableLimitViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            WithdrawableLimitViewModel withdrawableLimitViewModel = (WithdrawableLimitViewModel) h10.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            g.j(withdrawableLimitViewModel);
            this.f17254b = withdrawableLimitViewModel;
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
