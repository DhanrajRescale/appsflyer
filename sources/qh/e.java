package qh;

import android.view.View;
import androidx.lifecycle.h1;
import ba.wm;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.redemption.home.RedemptionHostViewModel;
import com.assetgro.stockgro.ui.redemption.offers.details.RedemptionStatusBottomSheetViewModel;
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
import r3.k;
import ut.g;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lqh/e;", "Lgd/h;", "Lcom/assetgro/stockgro/ui/redemption/offers/details/RedemptionStatusBottomSheetViewModel;", "Lba/wm;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class e extends h<RedemptionStatusBottomSheetViewModel, wm> {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f31964j = 0;

    /* renamed from: i, reason: collision with root package name */
    public final g f31965i = ut.h.a(new ag.b(this, 18));

    @Override // gd.h
    public final void u(da.a bottomSheetDialogFragmentComponent) {
        Intrinsics.checkNotNullParameter(bottomSheetDialogFragmentComponent, "bottomSheetDialogFragmentComponent");
        f0 f0Var = (f0) bottomSheetDialogFragmentComponent.f14247b;
        kq.e schedulerProvider = bottomSheetDialogFragmentComponent.f14246a.k();
        ct.a compositeDisposable = bottomSheetDialogFragmentComponent.f14246a.c();
        f0Var.getClass();
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        ca.c factory = new ca.c(a0.a(RedemptionStatusBottomSheetViewModel.class), new b0(schedulerProvider, compositeDisposable, 13));
        h hVar = f0Var.f15153a;
        h1 d10 = com.google.android.gms.internal.p002firebaseauthapi.a.d(hVar, "owner", factory, "factory");
        y4.c defaultCreationExtras = com.google.android.gms.internal.p002firebaseauthapi.a.n(hVar, "owner", d10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h10 = com.google.android.gms.internal.p002firebaseauthapi.a.h(d10, factory, defaultCreationExtras, RedemptionStatusBottomSheetViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(RedemptionStatusBottomSheetViewModel.class, "<this>", RedemptionStatusBottomSheetViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            RedemptionStatusBottomSheetViewModel redemptionStatusBottomSheetViewModel = (RedemptionStatusBottomSheetViewModel) h10.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            yk.g.j(redemptionStatusBottomSheetViewModel);
            this.f17270b = redemptionStatusBottomSheetViewModel;
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
        return R.layout.fragment_redemption_status_bottom_sheet;
    }

    @Override // gd.h
    public final void z(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        wm wmVar = (wm) r();
        final int i10 = 0;
        wmVar.f6545s.setOnClickListener(new View.OnClickListener(this) { // from class: qh.d

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f31963b;

            {
                this.f31963b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i11 = i10;
                e this$0 = this.f31963b;
                switch (i11) {
                    case 0:
                        int i12 = e.f31964j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        ((RedemptionHostViewModel) this$0.f31965i.getValue()).f10088u.postValue(Boolean.TRUE);
                        this$0.dismiss();
                        return;
                    case 1:
                        int i13 = e.f31964j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.dismiss();
                        return;
                    default:
                        int i14 = e.f31964j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.dismiss();
                        return;
                }
            }
        });
        wm wmVar2 = (wm) r();
        final int i11 = 1;
        wmVar2.f6546t.setOnClickListener(new View.OnClickListener(this) { // from class: qh.d

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f31963b;

            {
                this.f31963b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i112 = i11;
                e this$0 = this.f31963b;
                switch (i112) {
                    case 0:
                        int i12 = e.f31964j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        ((RedemptionHostViewModel) this$0.f31965i.getValue()).f10088u.postValue(Boolean.TRUE);
                        this$0.dismiss();
                        return;
                    case 1:
                        int i13 = e.f31964j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.dismiss();
                        return;
                    default:
                        int i14 = e.f31964j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.dismiss();
                        return;
                }
            }
        });
        wm wmVar3 = (wm) r();
        final int i12 = 2;
        wmVar3.f6548v.setOnClickListener(new View.OnClickListener(this) { // from class: qh.d

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f31963b;

            {
                this.f31963b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i112 = i12;
                e this$0 = this.f31963b;
                switch (i112) {
                    case 0:
                        int i122 = e.f31964j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        ((RedemptionHostViewModel) this$0.f31965i.getValue()).f10088u.postValue(Boolean.TRUE);
                        this$0.dismiss();
                        return;
                    case 1:
                        int i13 = e.f31964j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.dismiss();
                        return;
                    default:
                        int i14 = e.f31964j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.dismiss();
                        return;
                }
            }
        });
        g gVar = this.f31965i;
        if (((RedemptionHostViewModel) gVar.getValue()).f10085r.equals("SUCCESS")) {
            wm wmVar4 = (wm) r();
            wmVar4.f6549w.setImageDrawable(k.getDrawable(requireContext(), R.drawable.ic_payment_successful));
            ((wm) r()).f6551y.setVisibility(0);
            ((wm) r()).f6547u.setVisibility(8);
            wm wmVar5 = (wm) r();
            wmVar5.f6550x.setText(((RedemptionHostViewModel) gVar.getValue()).f10084q);
            return;
        }
        wm wmVar6 = (wm) r();
        wmVar6.f6549w.setImageDrawable(k.getDrawable(requireContext(), R.drawable.ic_payment_failed));
        ((wm) r()).f6551y.setVisibility(8);
        ((wm) r()).f6547u.setVisibility(0);
        wm wmVar7 = (wm) r();
        wmVar7.f6550x.setText(((RedemptionHostViewModel) gVar.getValue()).f10084q);
    }
}
