package ag;

import android.view.View;
import ba.rl;
import com.assetgro.stockgro.data.AnalyticEvent;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.base.BaseBottomSheetViewModel;
import com.assetgro.stockgro.ui.payments.recharge.AbortTransactionBottomSheetViewModel;
import com.assetgro.stockgro.ui.payments.recharge.RechargeWalletViewModel;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import kj.j;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import ls.n0;
import vt.p0;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lag/c;", "Lgd/h;", "Lcom/assetgro/stockgro/ui/payments/recharge/AbortTransactionBottomSheetViewModel;", "Lba/rl;", "<init>", "()V", "de/d", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class c extends gd.h<AbortTransactionBottomSheetViewModel, rl> {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f407j = 0;

    /* renamed from: i, reason: collision with root package name */
    public final ut.g f408i = ut.h.a(new b(this, 0));

    @Override // gd.h
    public final void u(da.a bottomSheetDialogFragmentComponent) {
        Intrinsics.checkNotNullParameter(bottomSheetDialogFragmentComponent, "bottomSheetDialogFragmentComponent");
        kq.e schedulerProvider = bottomSheetDialogFragmentComponent.f14246a.k();
        ct.a compositeDisposable = bottomSheetDialogFragmentComponent.f14246a.c();
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        this.f17270b = new BaseBottomSheetViewModel(schedulerProvider, compositeDisposable);
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
        return R.layout.fragment_payment_abort_transaction_bottom_sheet;
    }

    @Override // gd.h
    public final void z(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        rl rlVar = (rl) r();
        final int i10 = 0;
        rlVar.f5980s.setOnClickListener(new View.OnClickListener(this) { // from class: ag.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f404b;

            {
                this.f404b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i11 = i10;
                c this$0 = this.f404b;
                switch (i11) {
                    case 0:
                        int i12 = c.f407j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        AnalyticEvent analyticEvent = new AnalyticEvent("add_money_payment_page_back_press", p0.f(new Pair("abort", Boolean.FALSE)));
                        this$0.v(analyticEvent);
                        this$0.w(analyticEvent);
                        this$0.dismissAllowingStateLoss();
                        return;
                    default:
                        int i13 = c.f407j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        AnalyticEvent analyticEvent2 = new AnalyticEvent("add_money_payment_page_back_press", p0.f(new Pair("abort", Boolean.TRUE)));
                        this$0.v(analyticEvent2);
                        this$0.w(analyticEvent2);
                        RechargeWalletViewModel rechargeWalletViewModel = (RechargeWalletViewModel) this$0.f408i.getValue();
                        rechargeWalletViewModel.C = false;
                        rechargeWalletViewModel.F.setValue(new j(Unit.f23355a));
                        this$0.dismiss();
                        return;
                }
            }
        });
        rl rlVar2 = (rl) r();
        final int i11 = 1;
        rlVar2.f5981t.setOnClickListener(new View.OnClickListener(this) { // from class: ag.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f404b;

            {
                this.f404b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i112 = i11;
                c this$0 = this.f404b;
                switch (i112) {
                    case 0:
                        int i12 = c.f407j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        AnalyticEvent analyticEvent = new AnalyticEvent("add_money_payment_page_back_press", p0.f(new Pair("abort", Boolean.FALSE)));
                        this$0.v(analyticEvent);
                        this$0.w(analyticEvent);
                        this$0.dismissAllowingStateLoss();
                        return;
                    default:
                        int i13 = c.f407j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        AnalyticEvent analyticEvent2 = new AnalyticEvent("add_money_payment_page_back_press", p0.f(new Pair("abort", Boolean.TRUE)));
                        this$0.v(analyticEvent2);
                        this$0.w(analyticEvent2);
                        RechargeWalletViewModel rechargeWalletViewModel = (RechargeWalletViewModel) this$0.f408i.getValue();
                        rechargeWalletViewModel.C = false;
                        rechargeWalletViewModel.F.setValue(new j(Unit.f23355a));
                        this$0.dismiss();
                        return;
                }
            }
        });
    }
}
