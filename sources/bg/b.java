package bg;

import android.view.View;
import ba.tl;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.payments.recharge.RechargeWalletViewModel;
import com.assetgro.stockgro.ui.payments.status.PaymentTransactionBottomSheetViewModel;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import gd.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ls.n0;
import r3.k;
import ut.g;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lbg/b;", "Lgd/h;", "Lcom/assetgro/stockgro/ui/payments/status/PaymentTransactionBottomSheetViewModel;", "Lba/tl;", "<init>", "()V", "yk/g", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class b extends h<PaymentTransactionBottomSheetViewModel, tl> {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f6970j = 0;

    /* renamed from: i, reason: collision with root package name */
    public final g f6971i = ut.h.a(new ag.b(this, 1));

    public final RechargeWalletViewModel B() {
        return (RechargeWalletViewModel) this.f6971i.getValue();
    }

    @Override // gd.h
    public final void u(da.a bottomSheetDialogFragmentComponent) {
        Intrinsics.checkNotNullParameter(bottomSheetDialogFragmentComponent, "bottomSheetDialogFragmentComponent");
        this.f17270b = bottomSheetDialogFragmentComponent.i();
        FirebaseAnalytics d10 = bottomSheetDialogFragmentComponent.f14246a.d();
        yk.g.i(d10);
        this.f17273e = d10;
        Analytics o10 = bottomSheetDialogFragmentComponent.f14246a.o();
        yk.g.i(o10);
        this.f17274f = o10;
        n0 h10 = bottomSheetDialogFragmentComponent.f14246a.h();
        yk.g.i(h10);
        this.f17275g = h10;
    }

    @Override // gd.h
    public final int x() {
        return R.layout.fragment_payment_status_bottom_sheet;
    }

    @Override // gd.h
    public final void z(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        tl tlVar = (tl) r();
        final int i10 = 0;
        tlVar.f6202s.setOnClickListener(new View.OnClickListener(this) { // from class: bg.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f6969b;

            {
                this.f6969b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i11 = i10;
                b this$0 = this.f6969b;
                switch (i11) {
                    case 0:
                        int i12 = b.f6970j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.B().f9714u.postValue(Boolean.TRUE);
                        this$0.dismiss();
                        return;
                    case 1:
                        int i13 = b.f6970j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.dismiss();
                        return;
                    default:
                        int i14 = b.f6970j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.B().f9713t.postValue(Boolean.TRUE);
                        this$0.dismiss();
                        return;
                }
            }
        });
        tl tlVar2 = (tl) r();
        final int i11 = 1;
        tlVar2.f6203t.setOnClickListener(new View.OnClickListener(this) { // from class: bg.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f6969b;

            {
                this.f6969b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i112 = i11;
                b this$0 = this.f6969b;
                switch (i112) {
                    case 0:
                        int i12 = b.f6970j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.B().f9714u.postValue(Boolean.TRUE);
                        this$0.dismiss();
                        return;
                    case 1:
                        int i13 = b.f6970j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.dismiss();
                        return;
                    default:
                        int i14 = b.f6970j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.B().f9713t.postValue(Boolean.TRUE);
                        this$0.dismiss();
                        return;
                }
            }
        });
        tl tlVar3 = (tl) r();
        final int i12 = 2;
        tlVar3.f6205v.setOnClickListener(new View.OnClickListener(this) { // from class: bg.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f6969b;

            {
                this.f6969b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i112 = i12;
                b this$0 = this.f6969b;
                switch (i112) {
                    case 0:
                        int i122 = b.f6970j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.B().f9714u.postValue(Boolean.TRUE);
                        this$0.dismiss();
                        return;
                    case 1:
                        int i13 = b.f6970j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.dismiss();
                        return;
                    default:
                        int i14 = b.f6970j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.B().f9713t.postValue(Boolean.TRUE);
                        this$0.dismiss();
                        return;
                }
            }
        });
        String str = B().f9710q;
        if (str.equals("TXN_SUCCESS")) {
            tl tlVar4 = (tl) r();
            tlVar4.f6206w.setImageDrawable(k.getDrawable(requireContext(), R.drawable.ic_payment_successful));
            ((tl) r()).f6208y.setVisibility(0);
            ((tl) r()).f6204u.setVisibility(8);
            tl tlVar5 = (tl) r();
            tlVar5.f6207x.setText(B().f9709p);
            return;
        }
        if (str.equals("PENDING")) {
            tl tlVar6 = (tl) r();
            tlVar6.f6206w.setImageDrawable(k.getDrawable(requireContext(), R.drawable.ic_payment_pending));
            ((tl) r()).f6208y.setVisibility(0);
            ((tl) r()).f6204u.setVisibility(8);
            tl tlVar7 = (tl) r();
            tlVar7.f6207x.setText(B().f9709p);
            return;
        }
        if (str.equals("PENDING")) {
            tl tlVar8 = (tl) r();
            tlVar8.f6206w.setImageDrawable(k.getDrawable(requireContext(), R.drawable.ic_payment_failed));
            ((tl) r()).f6208y.setVisibility(8);
            ((tl) r()).f6204u.setVisibility(0);
            tl tlVar9 = (tl) r();
            tlVar9.f6207x.setText(B().f9709p);
            return;
        }
        tl tlVar10 = (tl) r();
        tlVar10.f6206w.setImageDrawable(k.getDrawable(requireContext(), R.drawable.ic_payment_failed));
        ((tl) r()).f6208y.setVisibility(8);
        ((tl) r()).f6204u.setVisibility(0);
        tl tlVar11 = (tl) r();
        tlVar11.f6207x.setText(B().f9709p);
    }
}
