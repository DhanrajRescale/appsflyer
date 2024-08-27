package yf;

import android.view.View;
import androidx.lifecycle.h1;
import ba.r5;
import com.assetgro.stockgro.data.model.KycResponseDto;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.payments.kyc.KycVerificationRejectedViewModel;
import com.assetgro.stockgro.ui.payments.kyc.bottomsheet.KycRetryConfirmationBottomSheetViewModel;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import ea.b0;
import ea.f0;
import gd.h;
import iu.a0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ls.n0;
import qu.i0;
import xf.z;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lyf/g;", "Lgd/h;", "Lcom/assetgro/stockgro/ui/payments/kyc/bottomsheet/KycRetryConfirmationBottomSheetViewModel;", "Lba/r5;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class g extends h<KycRetryConfirmationBottomSheetViewModel, r5> {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f41621j = 0;

    /* renamed from: i, reason: collision with root package name */
    public final ut.g f41622i = ut.h.a(new lc.b(this, 29));

    @Override // gd.h
    public final void u(da.a bottomSheetDialogFragmentComponent) {
        Intrinsics.checkNotNullParameter(bottomSheetDialogFragmentComponent, "bottomSheetDialogFragmentComponent");
        f0 f0Var = (f0) bottomSheetDialogFragmentComponent.f14247b;
        kq.e schedulerProvider = bottomSheetDialogFragmentComponent.f14246a.k();
        ct.a compositeDisposable = bottomSheetDialogFragmentComponent.f14246a.c();
        f0Var.getClass();
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        ca.c factory = new ca.c(a0.a(KycRetryConfirmationBottomSheetViewModel.class), new b0(schedulerProvider, compositeDisposable, 9));
        h hVar = f0Var.f15153a;
        h1 d10 = com.google.android.gms.internal.p002firebaseauthapi.a.d(hVar, "owner", factory, "factory");
        y4.c defaultCreationExtras = com.google.android.gms.internal.p002firebaseauthapi.a.n(hVar, "owner", d10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h10 = com.google.android.gms.internal.p002firebaseauthapi.a.h(d10, factory, defaultCreationExtras, KycRetryConfirmationBottomSheetViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(KycRetryConfirmationBottomSheetViewModel.class, "<this>", KycRetryConfirmationBottomSheetViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            KycRetryConfirmationBottomSheetViewModel kycRetryConfirmationBottomSheetViewModel = (KycRetryConfirmationBottomSheetViewModel) h10.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            yk.g.j(kycRetryConfirmationBottomSheetViewModel);
            this.f17270b = kycRetryConfirmationBottomSheetViewModel;
            FirebaseAnalytics d11 = bottomSheetDialogFragmentComponent.f14246a.d();
            yk.g.i(d11);
            this.f17273e = d11;
            Analytics o10 = bottomSheetDialogFragmentComponent.f14246a.o();
            yk.g.i(o10);
            this.f17274f = o10;
            n0 h11 = bottomSheetDialogFragmentComponent.f14246a.h();
            yk.g.i(h11);
            this.f17275g = h11;
            return;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
    }

    @Override // gd.h
    public final int x() {
        return R.layout.bottom_sheet_kyc_retry_confirmation;
    }

    @Override // gd.h
    public final void z(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        r5 r5Var = (r5) r();
        final int i10 = 0;
        r5Var.f5930t.setOnClickListener(new View.OnClickListener(this) { // from class: yf.f

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f41620b;

            {
                this.f41620b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i11 = i10;
                g this$0 = this.f41620b;
                switch (i11) {
                    case 0:
                        int i12 = g.f41621j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        KycVerificationRejectedViewModel kycVerificationRejectedViewModel = (KycVerificationRejectedViewModel) this$0.f41622i.getValue();
                        KycResponseDto kycResponseDto = kycVerificationRejectedViewModel.f9703r;
                        if (kycResponseDto != null) {
                            Boolean isKycInMaintenance = kycResponseDto.isKycInMaintenance();
                            Boolean bool = Boolean.TRUE;
                            if (Intrinsics.a(isKycInMaintenance, bool)) {
                                kycVerificationRejectedViewModel.f9701p.postValue(kycResponseDto);
                            } else {
                                kycVerificationRejectedViewModel.f9084g.setValue(bool);
                                nt.h c10 = kycVerificationRejectedViewModel.f9699n.createKyc().c(((kq.e) kycVerificationRejectedViewModel.f9079b).J());
                                jt.d dVar = new jt.d(new vf.d(20, new z(kycVerificationRejectedViewModel, 0)), new vf.d(21, new z(kycVerificationRejectedViewModel, 1)));
                                c10.a(dVar);
                                kycVerificationRejectedViewModel.f9080c.c(dVar);
                            }
                        }
                        this$0.dismiss();
                        return;
                    default:
                        int i13 = g.f41621j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.dismiss();
                        return;
                }
            }
        });
        r5 r5Var2 = (r5) r();
        final int i11 = 1;
        r5Var2.f5929s.setOnClickListener(new View.OnClickListener(this) { // from class: yf.f

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f41620b;

            {
                this.f41620b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i112 = i11;
                g this$0 = this.f41620b;
                switch (i112) {
                    case 0:
                        int i12 = g.f41621j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        KycVerificationRejectedViewModel kycVerificationRejectedViewModel = (KycVerificationRejectedViewModel) this$0.f41622i.getValue();
                        KycResponseDto kycResponseDto = kycVerificationRejectedViewModel.f9703r;
                        if (kycResponseDto != null) {
                            Boolean isKycInMaintenance = kycResponseDto.isKycInMaintenance();
                            Boolean bool = Boolean.TRUE;
                            if (Intrinsics.a(isKycInMaintenance, bool)) {
                                kycVerificationRejectedViewModel.f9701p.postValue(kycResponseDto);
                            } else {
                                kycVerificationRejectedViewModel.f9084g.setValue(bool);
                                nt.h c10 = kycVerificationRejectedViewModel.f9699n.createKyc().c(((kq.e) kycVerificationRejectedViewModel.f9079b).J());
                                jt.d dVar = new jt.d(new vf.d(20, new z(kycVerificationRejectedViewModel, 0)), new vf.d(21, new z(kycVerificationRejectedViewModel, 1)));
                                c10.a(dVar);
                                kycVerificationRejectedViewModel.f9080c.c(dVar);
                            }
                        }
                        this$0.dismiss();
                        return;
                    default:
                        int i13 = g.f41621j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.dismiss();
                        return;
                }
            }
        });
    }
}
