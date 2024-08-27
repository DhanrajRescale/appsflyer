package yf;

import android.view.View;
import androidx.lifecycle.h1;
import ba.l5;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.payments.kyc.bottomsheet.KycCancelBottomSheetViewModel;
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

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lyf/b;", "Lgd/h;", "Lcom/assetgro/stockgro/ui/payments/kyc/bottomsheet/KycCancelBottomSheetViewModel;", "Lba/l5;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class b extends h<KycCancelBottomSheetViewModel, l5> {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f41614i = 0;

    @Override // gd.h
    public final void u(da.a bottomSheetDialogFragmentComponent) {
        Intrinsics.checkNotNullParameter(bottomSheetDialogFragmentComponent, "bottomSheetDialogFragmentComponent");
        f0 f0Var = (f0) bottomSheetDialogFragmentComponent.f14247b;
        kq.e schedulerProvider = bottomSheetDialogFragmentComponent.f14246a.k();
        ct.a compositeDisposable = bottomSheetDialogFragmentComponent.f14246a.c();
        f0Var.getClass();
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        ca.c factory = new ca.c(a0.a(KycCancelBottomSheetViewModel.class), new b0(schedulerProvider, compositeDisposable, 6));
        h hVar = f0Var.f15153a;
        h1 d10 = com.google.android.gms.internal.p002firebaseauthapi.a.d(hVar, "owner", factory, "factory");
        y4.c defaultCreationExtras = com.google.android.gms.internal.p002firebaseauthapi.a.n(hVar, "owner", d10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h10 = com.google.android.gms.internal.p002firebaseauthapi.a.h(d10, factory, defaultCreationExtras, KycCancelBottomSheetViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(KycCancelBottomSheetViewModel.class, "<this>", KycCancelBottomSheetViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            KycCancelBottomSheetViewModel kycCancelBottomSheetViewModel = (KycCancelBottomSheetViewModel) h10.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            yk.g.j(kycCancelBottomSheetViewModel);
            this.f17270b = kycCancelBottomSheetViewModel;
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
        return R.layout.bottom_sheet_kyc_cancel;
    }

    @Override // gd.h
    public final void z(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        l5 l5Var = (l5) r();
        final int i10 = 0;
        l5Var.f5318t.setOnClickListener(new View.OnClickListener(this) { // from class: yf.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f41613b;

            {
                this.f41613b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i11 = i10;
                b this$0 = this.f41613b;
                switch (i11) {
                    case 0:
                        int i12 = b.f41614i;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.dismiss();
                        return;
                    default:
                        int i13 = b.f41614i;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.requireActivity().finish();
                        return;
                }
            }
        });
        l5 l5Var2 = (l5) r();
        final int i11 = 1;
        l5Var2.f5317s.setOnClickListener(new View.OnClickListener(this) { // from class: yf.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f41613b;

            {
                this.f41613b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i112 = i11;
                b this$0 = this.f41613b;
                switch (i112) {
                    case 0:
                        int i12 = b.f41614i;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.dismiss();
                        return;
                    default:
                        int i13 = b.f41614i;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.requireActivity().finish();
                        return;
                }
            }
        });
    }
}
