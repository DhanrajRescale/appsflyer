package ag;

import android.os.Bundle;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.g0;
import androidx.fragment.app.j0;
import ba.p4;
import com.assetgro.stockgro.missions.presentation.home.MissionsHomeViewModel;
import com.assetgro.stockgro.ui.payments.recharge.RechargeWalletActivity;
import com.assetgro.stockgro.ui.payments.recharge.RechargeWalletViewModel;
import com.assetgro.stockgro.ui.payments.transactions.list.WalletTransactionListFragment;
import com.assetgro.stockgro.ui.payments.transactions.list.WalletTransactionListViewModel;
import com.assetgro.stockgro.ui.payments.withdrawal.WithdrawalDetailActivity;
import com.assetgro.stockgro.ui.portfolio.PortfolioViewModel;
import com.assetgro.stockgro.ui.portfolio.detail.PortfolioDetailActivity;
import com.assetgro.stockgro.ui.portfolio.detail.PortfolioDetailViewModel;
import com.assetgro.stockgro.ui.portfolio.holdings.PortfolioFnoHoldingsViewModel;
import com.assetgro.stockgro.ui.portfolio.holdings.PortfolioHoldingsViewModel;
import com.assetgro.stockgro.ui.profile.self.ImagePreviewActivity;
import com.assetgro.stockgro.ui.profile.statistics.UserStatisticsViewModel;
import com.assetgro.stockgro.ui.profile.user.UserProfileActivity;
import com.assetgro.stockgro.ui.redemption.home.RedemptionHostViewModel;
import com.assetgro.stockgro.ui.redemption.offers.details.OfferDetailsActivity;
import com.assetgro.stockgro.ui.stock.detail.StockDetailFragment;
import com.assetgro.stockgro.ui.stock.list.StockListViewModel;
import com.assetgro.stockgro.ui.stock.v2.presentation.chart.StockTradingViewFullScreenChartActivity;
import com.assetgro.stockgro.ui.subscription.ManageSubscriptionActivity;
import com.assetgro.stockgro.ui.subscription.ManageSubscriptionViewModel;
import com.assetgro.stockgro.ui.subscription.MySubscriptionFragment;
import com.assetgro.stockgro.ui.subscription.OtherSubscriptionPlansFragment;
import com.assetgro.stockgro.ui.subscription.SubscriptionDowngradePromptFragment;
import com.assetgro.stockgro.ui.subscription.SubscriptionPaymentNonSuccessFragment;
import com.assetgro.stockgro.ui.subscription.SubscriptionPlanConfirmationFragment;
import dg.n;
import ej.r0;
import iu.k;
import kh.y;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import og.j;
import og.o;

/* loaded from: classes.dex */
public final class b extends k implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f405a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f406b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Object obj, int i10) {
        super(0);
        this.f405a = i10;
        this.f406b = obj;
    }

    public final RechargeWalletViewModel a() {
        int i10 = this.f405a;
        Object obj = this.f406b;
        switch (i10) {
            case 0:
                j0 activity = ((c) obj).getActivity();
                Intrinsics.d(activity, "null cannot be cast to non-null type com.assetgro.stockgro.ui.payments.recharge.RechargeWalletActivity");
                return (RechargeWalletViewModel) ((RechargeWalletActivity) activity).x();
            default:
                j0 activity2 = ((bg.b) obj).getActivity();
                Intrinsics.d(activity2, "null cannot be cast to non-null type com.assetgro.stockgro.ui.payments.recharge.RechargeWalletActivity");
                return (RechargeWalletViewModel) ((RechargeWalletActivity) activity2).x();
        }
    }

    public final PortfolioDetailViewModel d() {
        int i10 = this.f405a;
        Object obj = this.f406b;
        switch (i10) {
            case 12:
                j0 activity = ((vg.c) obj).getActivity();
                Intrinsics.d(activity, "null cannot be cast to non-null type com.assetgro.stockgro.ui.portfolio.detail.PortfolioDetailActivity");
                return (PortfolioDetailViewModel) ((PortfolioDetailActivity) activity).x();
            default:
                j0 activity2 = ((wg.b) obj).getActivity();
                Intrinsics.d(activity2, "null cannot be cast to non-null type com.assetgro.stockgro.ui.portfolio.detail.PortfolioDetailActivity");
                return (PortfolioDetailViewModel) ((PortfolioDetailActivity) activity2).x();
        }
    }

    public final ManageSubscriptionViewModel e() {
        int i10 = this.f405a;
        Object obj = this.f406b;
        switch (i10) {
            case 24:
                j0 activity = ((MySubscriptionFragment) obj).getActivity();
                Intrinsics.d(activity, "null cannot be cast to non-null type com.assetgro.stockgro.ui.subscription.ManageSubscriptionActivity");
                return (ManageSubscriptionViewModel) ((ManageSubscriptionActivity) activity).x();
            case 25:
                j0 requireActivity = ((OtherSubscriptionPlansFragment) obj).requireActivity();
                Intrinsics.d(requireActivity, "null cannot be cast to non-null type com.assetgro.stockgro.ui.subscription.ManageSubscriptionActivity");
                return (ManageSubscriptionViewModel) ((ManageSubscriptionActivity) requireActivity).x();
            case 26:
                j0 activity2 = ((SubscriptionDowngradePromptFragment) obj).getActivity();
                Intrinsics.d(activity2, "null cannot be cast to non-null type com.assetgro.stockgro.ui.subscription.ManageSubscriptionActivity");
                return (ManageSubscriptionViewModel) ((ManageSubscriptionActivity) activity2).x();
            case 27:
                j0 activity3 = ((SubscriptionPaymentNonSuccessFragment) obj).getActivity();
                Intrinsics.d(activity3, "null cannot be cast to non-null type com.assetgro.stockgro.ui.subscription.ManageSubscriptionActivity");
                return (ManageSubscriptionViewModel) ((ManageSubscriptionActivity) activity3).x();
            case 28:
                j0 activity4 = ((SubscriptionPlanConfirmationFragment) obj).getActivity();
                Intrinsics.d(activity4, "null cannot be cast to non-null type com.assetgro.stockgro.ui.subscription.ManageSubscriptionActivity");
                return (ManageSubscriptionViewModel) ((ManageSubscriptionActivity) activity4).x();
            default:
                j0 activity5 = ((r0) obj).getActivity();
                Intrinsics.d(activity5, "null cannot be cast to non-null type com.assetgro.stockgro.ui.subscription.ManageSubscriptionActivity");
                return (ManageSubscriptionViewModel) ((ManageSubscriptionActivity) activity5).x();
        }
    }

    public final String f() {
        String string;
        int i10 = this.f405a;
        Object obj = this.f406b;
        switch (i10) {
            case 20:
                String string2 = ((StockDetailFragment) obj).requireArguments().getString("STOCK_NAME");
                if (string2 != null) {
                    return string2;
                }
                throw new IllegalStateException("Stock ID is a required argument for StockDetailFragment".toString());
            case 21:
            default:
                String stringExtra = ((StockTradingViewFullScreenChartActivity) obj).getIntent().getStringExtra("STOCK_NAME");
                if (stringExtra != null) {
                    return stringExtra;
                }
                throw new IllegalStateException("Stock ID is a required argument for StockTradingViewFullScreenChartActivity".toString());
            case 22:
                Bundle arguments = ((cj.g) obj).getArguments();
                if (arguments != null && (string = arguments.getString("STOCK_NAME")) != null) {
                    return string;
                }
                throw new IllegalStateException("Stock ID is a required argument for StockChartFragment".toString());
        }
    }

    public final void i() {
        int i10 = this.f405a;
        Object obj = this.f406b;
        switch (i10) {
            case 5:
                ((PortfolioViewModel) ((gg.e) obj).r()).i(gg.h.f17406m);
                return;
            case 6:
                int i11 = ng.e.f28689j;
                Bundle bundle = new Bundle();
                ng.e eVar = new ng.e();
                eVar.setArguments(bundle);
                eVar.show(((lg.g) obj).getChildFragmentManager(), "HistoryFilterBottomSheetDialogFragment");
                return;
            case 7:
            case 10:
            case 11:
            case 12:
            case 13:
            case 16:
            default:
                ((MissionsHomeViewModel) obj).j(new uh.g(false));
                return;
            case 8:
                int i12 = qg.b.f31950j;
                Bundle bundle2 = new Bundle();
                qg.b bVar = new qg.b();
                bVar.setArguments(bundle2);
                bVar.show(((j) obj).getChildFragmentManager(), "HoldingsOptionsSortBottomSheetDialogFragment");
                return;
            case 9:
                ((PortfolioFnoHoldingsViewModel) obj).i();
                return;
            case 14:
                ((ih.b) obj).dismiss();
                return;
            case 15:
                int i13 = ImagePreviewActivity.f10046n;
                ((ImagePreviewActivity) obj).K();
                return;
            case 17:
                ComposeView reportedText = ((p4) ((UserProfileActivity) obj).w()).f5720u;
                Intrinsics.checkNotNullExpressionValue(reportedText, "reportedText");
                zq.f.M(reportedText);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo2invoke() {
        int i10 = this.f405a;
        Object obj = this.f406b;
        switch (i10) {
            case 0:
                return a();
            case 1:
                return a();
            case 2:
                g0 requireParentFragment = ((dg.c) obj).requireParentFragment();
                Intrinsics.d(requireParentFragment, "null cannot be cast to non-null type com.assetgro.stockgro.ui.payments.transactions.list.WalletTransactionListFragment");
                return (WalletTransactionListViewModel) ((WalletTransactionListFragment) requireParentFragment).r();
            case 3:
                WalletTransactionListViewModel walletTransactionListViewModel = (WalletTransactionListViewModel) obj;
                return new n(walletTransactionListViewModel.f9728n, walletTransactionListViewModel.f9731q, walletTransactionListViewModel.f9732r);
            case 4:
                j0 requireActivity = ((fg.f) obj).requireActivity();
                Intrinsics.d(requireActivity, "null cannot be cast to non-null type com.assetgro.stockgro.ui.payments.withdrawal.WithdrawalDetailActivity");
                return (WithdrawalDetailActivity) requireActivity;
            case 5:
                i();
                return Unit.f23355a;
            case 6:
                i();
                return Unit.f23355a;
            case 7:
                ng.e eVar = (ng.e) obj;
                g0 parentFragment = eVar.getParentFragment();
                if (parentFragment instanceof lg.k) {
                    g0 parentFragment2 = eVar.getParentFragment();
                    Intrinsics.d(parentFragment2, "null cannot be cast to non-null type com.assetgro.stockgro.ui.portfolio.history.PortfolioStockHistoryFragment");
                    return ((lg.k) parentFragment2).r();
                }
                if (parentFragment instanceof lg.g) {
                    g0 parentFragment3 = eVar.getParentFragment();
                    Intrinsics.d(parentFragment3, "null cannot be cast to non-null type com.assetgro.stockgro.ui.portfolio.history.PortfolioOptionHistoryFragment");
                    return ((lg.g) parentFragment3).r();
                }
                return Unit.f23355a;
            case 8:
                i();
                return Unit.f23355a;
            case 9:
                i();
                return Unit.f23355a;
            case 10:
                g0 parentFragment4 = ((qg.b) obj).getParentFragment();
                Intrinsics.d(parentFragment4, "null cannot be cast to non-null type com.assetgro.stockgro.ui.portfolio.holdings.PortfolioOptionHoldingsFragment");
                return (PortfolioFnoHoldingsViewModel) ((j) parentFragment4).r();
            case 11:
                g0 parentFragment5 = ((qg.c) obj).getParentFragment();
                Intrinsics.d(parentFragment5, "null cannot be cast to non-null type com.assetgro.stockgro.ui.portfolio.holdings.PortfolioStockHoldingFragment");
                return (PortfolioHoldingsViewModel) ((o) parentFragment5).r();
            case 12:
                return d();
            case 13:
                return d();
            case 14:
                i();
                return Unit.f23355a;
            case 15:
                i();
                return Unit.f23355a;
            case 16:
                g0 parentFragment6 = ((kh.o) obj).getParentFragment();
                Intrinsics.d(parentFragment6, "null cannot be cast to non-null type com.assetgro.stockgro.ui.profile.statistics.UserStatisticsFragment");
                return (UserStatisticsViewModel) ((y) parentFragment6).r();
            case 17:
                i();
                return Unit.f23355a;
            case 18:
                j0 activity = ((qh.e) obj).getActivity();
                Intrinsics.d(activity, "null cannot be cast to non-null type com.assetgro.stockgro.ui.redemption.offers.details.OfferDetailsActivity");
                return (RedemptionHostViewModel) ((OfferDetailsActivity) activity).x();
            case 19:
                i();
                return Unit.f23355a;
            case 20:
                return f();
            case 21:
                g0 parentFragment7 = ((yi.b) obj).getParentFragment();
                Intrinsics.d(parentFragment7, "null cannot be cast to non-null type com.assetgro.stockgro.ui.stock.list.StockListFragment");
                return (StockListViewModel) ((ni.o) parentFragment7).r();
            case 22:
                return f();
            case 23:
                return f();
            case 24:
                return e();
            case 25:
                return e();
            case 26:
                return e();
            case 27:
                return e();
            case 28:
                return e();
            default:
                return e();
        }
    }
}
