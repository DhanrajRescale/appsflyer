package androidx.activity;

import android.content.Intent;
import androidx.fragment.app.d1;
import androidx.fragment.app.j0;
import com.assetgro.stockgro.feature_social.presentation.feed.streams.FeedStreamComposeFragment;
import com.assetgro.stockgro.ui.payments.withdrawal.DefaultWebViewActivity;
import com.assetgro.stockgro.ui.social.presentation.video.YoutubeVideoFullScreenActivity;
import com.assetgro.stockgro.ui.social.presentation.video.YoutubeVideoFullScreenViewModel;
import com.assetgro.stockgro.ui.stock.detail.order.StockOrderConfirmationFragment;
import com.assetgro.stockgro.ui.stock.modify.buy.ModifyBuyOrderFragment;
import com.assetgro.stockgro.ui.stock.modify.cover.ModifyStockCoverOrderConfirmationFragment;
import com.assetgro.stockgro.ui.stock.modify.cover.ModifyStockCoverOrderFragment;
import com.assetgro.stockgro.ui.stock.modify.sell.ModifySellOrderFragment;
import com.assetgro.stockgro.ui.stock.modify.sell.StockModifySellOrderConfirmationFragment;
import com.assetgro.stockgro.ui.stock.modify.short_sell.ModifyShortSellOrderFragment;
import com.assetgro.stockgro.ui.stock.shortSell.confirm.StockShortSellConfirmationFragment;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class x extends q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f885a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f886b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(Object obj, int i10) {
        super(true);
        this.f885a = i10;
        this.f886b = obj;
    }

    @Override // androidx.activity.q
    public final void handleOnBackPressed() {
        int i10 = this.f885a;
        Object obj = this.f886b;
        switch (i10) {
            case 0:
                ((Function1) obj).invoke(this);
                return;
            case 1:
                d1 d1Var = (d1) obj;
                d1Var.x(true);
                if (d1Var.f1651h.isEnabled()) {
                    d1Var.P();
                    return;
                } else {
                    d1Var.f1650g.c();
                    return;
                }
            case 2:
                ((androidx.navigation.t) obj).q();
                return;
            case 3:
                ((FeedStreamComposeFragment) obj).requireActivity().finish();
                return;
            case 4:
                ((DefaultWebViewActivity) obj).finish();
                return;
            case 5:
                Intent intent = new Intent();
                YoutubeVideoFullScreenActivity youtubeVideoFullScreenActivity = (YoutubeVideoFullScreenActivity) obj;
                intent.putExtra("ELAPSED_TIME_YOUTUBE", ((YoutubeVideoFullScreenViewModel) youtubeVideoFullScreenActivity.x()).f10155n);
                youtubeVideoFullScreenActivity.setResult(-1, intent);
                youtubeVideoFullScreenActivity.finish();
                return;
            case 6:
                ((StockOrderConfirmationFragment) obj).requireActivity().finish();
                return;
            case 7:
                j0 activity = ((ModifyBuyOrderFragment) obj).getActivity();
                if (activity != null) {
                    activity.finish();
                    return;
                }
                return;
            case 8:
                j0 activity2 = ((ModifyStockCoverOrderConfirmationFragment) obj).getActivity();
                if (activity2 != null) {
                    activity2.finish();
                    return;
                }
                return;
            case 9:
                j0 activity3 = ((ModifyStockCoverOrderFragment) obj).getActivity();
                if (activity3 != null) {
                    activity3.finish();
                    return;
                }
                return;
            case 10:
                ((ModifySellOrderFragment) obj).requireActivity().finish();
                return;
            case 11:
                ((StockModifySellOrderConfirmationFragment) obj).requireActivity().finish();
                return;
            case 12:
                j0 activity4 = ((ModifyShortSellOrderFragment) obj).getActivity();
                if (activity4 != null) {
                    activity4.finish();
                    return;
                }
                return;
            default:
                ((StockShortSellConfirmationFragment) obj).requireActivity().finish();
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(androidx.navigation.t tVar) {
        super(false);
        this.f885a = 2;
        this.f886b = tVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(Function1 function1, boolean z10) {
        super(z10);
        this.f885a = 0;
        this.f886b = function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(d1 d1Var) {
        super(false);
        this.f885a = 1;
        this.f886b = d1Var;
    }
}
