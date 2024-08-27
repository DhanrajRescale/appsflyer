package c1;

import am.d;
import androidx.lifecycle.f0;
import androidx.work.h0;
import com.assetgro.stockgro.data.model.portfolio.holdings.Portfolio;
import com.assetgro.stockgro.ui.chat.helper.search.SearchContactViewModel;
import com.assetgro.stockgro.ui.portfolio.orders.PortfolioFnoOrdersViewModel;
import com.assetgro.stockgro.ui.stock.common.StockTransactionPendingFragment;
import com.assetgro.stockgro.ui.stock.common.StockTransactionPendingViewModel;
import com.assetgro.stockgro.ui.stock.detail.order.StockOrderPaymentSuccessFragment;
import com.assetgro.stockgro.ui.stock.detail.order.StockOrderPaymentSuccessfulViewModel;
import com.assetgro.stockgro.ui.stock.modify.common.ModifyOrderPaymentSuccessFragment;
import com.assetgro.stockgro.ui.stock.modify.common.ModifyOrderPaymentSuccessfulViewModel;
import ge.r;
import gm.f;
import kj.j;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import t0.g1;
import tg.h;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7627a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7628b;

    public /* synthetic */ a(Object obj, int i10) {
        this.f7627a = i10;
        this.f7628b = obj;
    }

    @Override // androidx.lifecycle.f0
    public final void d(Object obj) {
        int i10 = this.f7627a;
        Object obj2 = this.f7628b;
        switch (i10) {
            case 0:
                ((g1) obj2).setValue(obj);
                return;
            case 1:
            default:
                f fVar = (f) obj2;
                int i11 = f.f17510m;
                fVar.getClass();
                if (((d) obj).f760a == 2) {
                    fVar.f17519j.setText(HttpUrl.FRAGMENT_ENCODE_SET);
                    return;
                }
                return;
            case 2:
                SearchContactViewModel this$0 = (SearchContactViewModel) obj2;
                h0 workInfo = (h0) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(workInfo, "workInfo");
                int ordinal = workInfo.f2577b.ordinal();
                if (ordinal != 0 && ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal != 3) {
                            if (ordinal != 4) {
                                if (ordinal != 5) {
                                    return;
                                }
                            }
                        }
                        if (this$0.f9355r) {
                            this$0.F.postValue(new j(r.f17340d));
                            this$0.f9083f.postValue(ni.j.i(workInfo.f2578c.b("message")));
                        }
                        this$0.f9355r = true;
                        return;
                    }
                    this$0.F.postValue(new j(r.f17339c));
                    return;
                }
                this$0.F.postValue(new j(r.f17338b));
                return;
            case 3:
                h this$02 = (h) obj2;
                int i12 = h.f36055g;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                ((PortfolioFnoOrdersViewModel) this$02.r()).i(null);
                return;
            case 4:
                StockTransactionPendingFragment this$03 = (StockTransactionPendingFragment) obj2;
                Portfolio portfolio = (Portfolio) obj;
                int i13 = StockTransactionPendingFragment.f10166i;
                Intrinsics.checkNotNullParameter(this$03, "this$0");
                Intrinsics.checkNotNullParameter(portfolio, "portfolio");
                ((StockTransactionPendingViewModel) this$03.r()).f10169n.postValue(portfolio);
                return;
            case 5:
                StockOrderPaymentSuccessFragment this$04 = (StockOrderPaymentSuccessFragment) obj2;
                Portfolio portfolio2 = (Portfolio) obj;
                int i14 = StockOrderPaymentSuccessFragment.f10223h;
                Intrinsics.checkNotNullParameter(this$04, "this$0");
                Intrinsics.checkNotNullParameter(portfolio2, "portfolio");
                ((StockOrderPaymentSuccessfulViewModel) this$04.r()).f10226o.postValue(portfolio2);
                return;
            case 6:
                ModifyOrderPaymentSuccessFragment this$05 = (ModifyOrderPaymentSuccessFragment) obj2;
                Portfolio portfolio3 = (Portfolio) obj;
                int i15 = ModifyOrderPaymentSuccessFragment.f10300h;
                Intrinsics.checkNotNullParameter(this$05, "this$0");
                Intrinsics.checkNotNullParameter(portfolio3, "portfolio");
                ((ModifyOrderPaymentSuccessfulViewModel) this$05.r()).f10303o.postValue(portfolio3);
                return;
        }
    }
}
