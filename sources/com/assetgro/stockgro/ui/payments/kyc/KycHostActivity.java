package com.assetgro.stockgro.ui.payments.kyc;

import android.content.Intent;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.h1;
import androidx.lifecycle.u0;
import androidx.navigation.f0;
import androidx.navigation.i0;
import androidx.navigation.t;
import ba.g1;
import com.assetgro.stockgro.data.model.KycResponseDto;
import com.assetgro.stockgro.data.model.KycSupportTicketResponseDto;
import com.assetgro.stockgro.data.repository.PaymentRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.payments.home.WalletHomeActivity;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import da.a;
import ea.v;
import gd.b;
import iu.a0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kq.e;
import ls.n0;
import p004if.c;
import re.d;
import ut.g;
import ut.h;
import xf.k;
import xf.m;
import xf.o;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/assetgro/stockgro/ui/payments/kyc/KycHostActivity;", "Lgd/b;", "Lcom/assetgro/stockgro/ui/payments/kyc/KycHostViewModel;", "Lba/g1;", "<init>", "()V", "de/d", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class KycHostActivity extends b {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f9673m = 0;

    /* renamed from: k, reason: collision with root package name */
    public final g f9674k = h.a(new lc.b(this, 26));

    /* renamed from: l, reason: collision with root package name */
    public f0 f9675l;

    @Override // gd.b
    public final int F() {
        return R.layout.activity_kyc_tutorial;
    }

    @Override // gd.b
    public final void H() {
        super.H();
        ((KycHostViewModel) x()).f9678p.observe(this, new d(28, new k(this, 0)));
        ((KycHostViewModel) x()).f9677o.observe(this, new d(28, new k(this, 1)));
        ((KycHostViewModel) x()).f9679q.observe(this, new d(28, new k(this, 2)));
        ((KycHostViewModel) x()).f9680r.observe(this, new d(28, new k(this, 3)));
        ((KycHostViewModel) x()).f9681s.observe(this, new d(28, new k(this, 4)));
        ((KycHostViewModel) x()).f9683u.observe(this, new d(28, new k(this, 5)));
        ((KycHostViewModel) x()).f9685w.observe(this, new d(28, new k(this, 6)));
    }

    @Override // gd.b
    public final void I() {
        g1 g1Var = (g1) w();
        String string = getString(R.string.kyc_verification);
        Toolbar toolbar = g1Var.f4773s;
        toolbar.setTitle(string);
        v(toolbar);
        u(toolbar);
        toolbar.setNavigationOnClickListener(new c(this, 11));
        this.f9675l = ((i0) K().B.getValue()).b(R.navigation.kyc_navigation);
        KycHostViewModel kycHostViewModel = (KycHostViewModel) x();
        KycResponseDto kycResponseDto = (KycResponseDto) getIntent().getParcelableExtra("kycData");
        boolean booleanExtra = getIntent().getBooleanExtra("is_deep_link_flag", false);
        String stringExtra = getIntent().getStringExtra("DESTINATION");
        if (booleanExtra) {
            if (Intrinsics.a(stringExtra, "kyc")) {
                kycHostViewModel.h(kycResponseDto);
                return;
            } else if (Intrinsics.a(stringExtra, "help_center")) {
                kycHostViewModel.f9084g.postValue(Boolean.TRUE);
                yk.g.H(u0.f(kycHostViewModel), null, null, new m(kycHostViewModel, null), 3);
                return;
            } else {
                kycHostViewModel.h(kycResponseDto);
                return;
            }
        }
        kycHostViewModel.h(kycResponseDto);
    }

    public final t K() {
        return (t) this.f9674k.getValue();
    }

    @Override // androidx.fragment.app.j0, androidx.activity.m, android.app.Activity
    public final void onActivityResult(int i10, int i11, Intent intent) {
        KycSupportTicketResponseDto kycSupportTicketResponseDto;
        super.onActivityResult(i10, i11, intent);
        if (i10 == 9865) {
            if (i11 == -1) {
                if (intent != null) {
                    kycSupportTicketResponseDto = (KycSupportTicketResponseDto) intent.getParcelableExtra("DATA");
                } else {
                    kycSupportTicketResponseDto = null;
                }
                if (!(kycSupportTicketResponseDto instanceof KycSupportTicketResponseDto)) {
                    kycSupportTicketResponseDto = null;
                }
                if (kycSupportTicketResponseDto != null) {
                    f0 f0Var = this.f9675l;
                    if (f0Var != null) {
                        f0Var.q(R.id.kycQuerySubmittedFragment);
                        t K = K();
                        f0 f0Var2 = this.f9675l;
                        if (f0Var2 != null) {
                            K.x(f0Var2, new o(kycSupportTicketResponseDto).a());
                            return;
                        } else {
                            Intrinsics.k("navGraph");
                            throw null;
                        }
                    }
                    Intrinsics.k("navGraph");
                    throw null;
                }
                return;
            }
            finish();
        }
    }

    @Override // gd.b, androidx.activity.m, android.app.Activity
    public final void onBackPressed() {
        if (isTaskRoot()) {
            startActivity(new Intent(this, (Class<?>) WalletHomeActivity.class));
        }
        finish();
    }

    @Override // gd.b
    public final void z(a activityComponent) {
        Intrinsics.checkNotNullParameter(activityComponent, "activityComponent");
        v vVar = (v) activityComponent.f14247b;
        e schedulerProvider = activityComponent.f14246a.k();
        ct.a compositeDisposable = activityComponent.f14246a.c();
        UserRepository userRepository = activityComponent.f14246a.m();
        yk.g.i(userRepository);
        PaymentRepository paymentRepository = activityComponent.f14246a.i();
        yk.g.i(paymentRepository);
        vVar.getClass();
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(paymentRepository, "paymentRepository");
        ca.c factory = new ca.c(a0.a(KycHostViewModel.class), new ea.k(schedulerProvider, compositeDisposable, userRepository, paymentRepository, 0));
        b bVar = vVar.f15290a;
        h1 c10 = com.google.android.gms.internal.p002firebaseauthapi.a.c(bVar, "owner", factory, "factory");
        y4.c defaultCreationExtras = com.google.android.gms.internal.p002firebaseauthapi.a.m(bVar, "owner", c10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h10 = com.google.android.gms.internal.p002firebaseauthapi.a.h(c10, factory, defaultCreationExtras, KycHostViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(KycHostViewModel.class, "<this>", KycHostViewModel.class, "modelClass", "modelClass");
        String s7 = qu.i0.s(b10);
        if (s7 != null) {
            KycHostViewModel kycHostViewModel = (KycHostViewModel) h10.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            yk.g.j(kycHostViewModel);
            this.f17254b = kycHostViewModel;
            FirebaseAnalytics d10 = activityComponent.f14246a.d();
            yk.g.i(d10);
            this.f17256d = d10;
            Analytics o10 = activityComponent.f14246a.o();
            yk.g.i(o10);
            this.f17257e = o10;
            n0 h11 = activityComponent.f14246a.h();
            yk.g.i(h11);
            this.f17258f = h11;
            return;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
    }
}
