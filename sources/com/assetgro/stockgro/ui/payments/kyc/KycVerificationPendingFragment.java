package com.assetgro.stockgro.ui.payments.kyc;

import a3.a;
import android.view.View;
import androidx.fragment.app.j0;
import androidx.fragment.app.z1;
import androidx.lifecycle.e0;
import androidx.lifecycle.h1;
import androidx.navigation.i;
import ba.wi;
import ca.c;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.payments.kyc.KycVerificationPendingFragment;
import com.assetgro.stockgro.ui.payments.kyc.KycVerificationPendingViewModel;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import da.b;
import ea.n0;
import gd.m;
import iu.a0;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kq.e;
import qu.i0;
import re.d;
import ub.f;
import xf.t;
import yk.g;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/assetgro/stockgro/ui/payments/kyc/KycVerificationPendingFragment;", "Lgd/m;", "Lcom/assetgro/stockgro/ui/payments/kyc/KycVerificationPendingViewModel;", "Lba/wi;", "<init>", "()V", "kq/e", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class KycVerificationPendingFragment extends m<KycVerificationPendingViewModel, wi> {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f9694h = 0;

    /* renamed from: g, reason: collision with root package name */
    public final i f9695g = new i(a0.a(t.class), new z1(this, 29));

    @Override // gd.m
    public final int C() {
        return R.layout.fragment_kyc_verification_pending;
    }

    @Override // gd.m
    public final void D() {
        super.D();
        ((KycVerificationPendingViewModel) r()).f9696n.observe(this, new d(29, new f(this, 24)));
    }

    @Override // gd.m
    public final void E(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        wi wiVar = (wi) q();
        final int i10 = 0;
        wiVar.f6534s.setOnClickListener(new View.OnClickListener(this) { // from class: xf.s

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ KycVerificationPendingFragment f40234b;

            {
                this.f40234b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i11 = i10;
                KycVerificationPendingFragment this$0 = this.f40234b;
                switch (i11) {
                    case 0:
                        int i12 = KycVerificationPendingFragment.f9694h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.requireActivity().finish();
                        return;
                    case 1:
                        int i13 = KycVerificationPendingFragment.f9694h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        KycVerificationPendingViewModel kycVerificationPendingViewModel = (KycVerificationPendingViewModel) this$0.r();
                        e0 e0Var = kycVerificationPendingViewModel.f9696n;
                        UserRepository userRepository = kycVerificationPendingViewModel.f9081d;
                        e0Var.setValue(new Pair(userRepository.getUserDisplayName(), userRepository.getUserPhoneNumber().toString()));
                        return;
                    default:
                        int i14 = KycVerificationPendingFragment.f9694h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        q6.l.h(this$0).l(R.id.moveToHelpCenter, ((t) this$0.f9695g.getValue()).a(), null);
                        return;
                }
            }
        });
        String submittedOn = ((t) this.f9695g.getValue()).f40235a.getSubmittedOn();
        wi wiVar2 = (wi) q();
        String string = getString(R.string.submitted_on);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        final int i11 = 1;
        wiVar2.f6537v.setText(a.m(new Object[]{submittedOn}, 1, string, "format(...)"));
        wi wiVar3 = (wi) q();
        wiVar3.f6535t.setOnClickListener(new View.OnClickListener(this) { // from class: xf.s

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ KycVerificationPendingFragment f40234b;

            {
                this.f40234b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i112 = i11;
                KycVerificationPendingFragment this$0 = this.f40234b;
                switch (i112) {
                    case 0:
                        int i12 = KycVerificationPendingFragment.f9694h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.requireActivity().finish();
                        return;
                    case 1:
                        int i13 = KycVerificationPendingFragment.f9694h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        KycVerificationPendingViewModel kycVerificationPendingViewModel = (KycVerificationPendingViewModel) this$0.r();
                        e0 e0Var = kycVerificationPendingViewModel.f9696n;
                        UserRepository userRepository = kycVerificationPendingViewModel.f9081d;
                        e0Var.setValue(new Pair(userRepository.getUserDisplayName(), userRepository.getUserPhoneNumber().toString()));
                        return;
                    default:
                        int i14 = KycVerificationPendingFragment.f9694h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        q6.l.h(this$0).l(R.id.moveToHelpCenter, ((t) this$0.f9695g.getValue()).a(), null);
                        return;
                }
            }
        });
        wi wiVar4 = (wi) q();
        final int i12 = 2;
        wiVar4.f6536u.setOnClickListener(new View.OnClickListener(this) { // from class: xf.s

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ KycVerificationPendingFragment f40234b;

            {
                this.f40234b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i112 = i12;
                KycVerificationPendingFragment this$0 = this.f40234b;
                switch (i112) {
                    case 0:
                        int i122 = KycVerificationPendingFragment.f9694h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.requireActivity().finish();
                        return;
                    case 1:
                        int i13 = KycVerificationPendingFragment.f9694h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        KycVerificationPendingViewModel kycVerificationPendingViewModel = (KycVerificationPendingViewModel) this$0.r();
                        e0 e0Var = kycVerificationPendingViewModel.f9696n;
                        UserRepository userRepository = kycVerificationPendingViewModel.f9081d;
                        e0Var.setValue(new Pair(userRepository.getUserDisplayName(), userRepository.getUserPhoneNumber().toString()));
                        return;
                    default:
                        int i14 = KycVerificationPendingFragment.f9694h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        q6.l.h(this$0).l(R.id.moveToHelpCenter, ((t) this$0.f9695g.getValue()).a(), null);
                        return;
                }
            }
        });
    }

    @Override // gd.m
    public final void w(da.f fragmentComponent) {
        Intrinsics.checkNotNullParameter(fragmentComponent, "fragmentComponent");
        b bVar = fragmentComponent.f14279b;
        e k10 = bVar.k();
        ct.a c10 = bVar.c();
        UserRepository userRepository = bVar.m();
        g.i(userRepository);
        n0 n0Var = fragmentComponent.f14278a;
        com.google.android.gms.internal.p002firebaseauthapi.a.s(n0Var, k10, "schedulerProvider", c10, "compositeDisposable");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        j0 requireActivity = n0Var.f15238a.requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        c factory = new c(a0.a(KycVerificationPendingViewModel.class), new ea.c(k10, c10, userRepository, 29));
        h1 h10 = da.e.h(requireActivity, "owner", factory, "factory");
        y4.c defaultCreationExtras = da.e.u(requireActivity, "owner", h10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h11 = com.google.android.gms.internal.p002firebaseauthapi.a.h(h10, factory, defaultCreationExtras, KycVerificationPendingViewModel.class, "modelClass");
        iu.e b10 = a.b(KycVerificationPendingViewModel.class, "<this>", KycVerificationPendingViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            KycVerificationPendingViewModel kycVerificationPendingViewModel = (KycVerificationPendingViewModel) h11.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            g.j(kycVerificationPendingViewModel);
            this.f17284b = kycVerificationPendingViewModel;
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
