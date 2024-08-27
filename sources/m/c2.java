package m;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;
import com.assetgro.stockgro.data.model.BottomSheetItem;
import com.assetgro.stockgro.ui.portfolio.history.PortfolioHistoryViewModel;
import com.assetgro.stockgro.ui.portfolio.orders.PortfolioOrdersViewModel;
import com.assetgro.stockgro.ui.stock.detail.order.StockOrderFragment;
import com.assetgro.stockgro.ui.stock.detail.order.StockOrderViewModel;
import com.assetgro.stockgro.ui.stock.modify.short_sell.ModifyShortSellOrderFragment;
import com.assetgro.stockgro.ui.stock.modify.short_sell.ModifyShortSellOrderViewModel;
import com.assetgro.stockgro.ui.stock.shortSell.order.StockShortSellOrderFragment;
import com.assetgro.stockgro.ui.stock.shortSell.order.StockShortSellOrderViewModel;
import com.assetgro.stockgro.widget.InputView;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class c2 implements AdapterView.OnItemSelectedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25505a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f25506b;

    public /* synthetic */ c2(Object obj, int i10) {
        this.f25505a = i10;
        this.f25506b = obj;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView parent, View view, int i10, long j10) {
        w1 w1Var;
        String str;
        int i11 = this.f25505a;
        Object obj = this.f25506b;
        switch (i11) {
            case 0:
                if (i10 != -1 && (w1Var = ((i2) obj).f25560c) != null) {
                    w1Var.setListSelectionHidden(false);
                    return;
                }
                return;
            case 1:
                ((SearchView) obj).q(i10);
                return;
            case 2:
                Intrinsics.checkNotNullParameter(parent, "parent");
                Intrinsics.checkNotNullParameter(view, "view");
                lg.k kVar = (lg.k) obj;
                if (((PortfolioHistoryViewModel) kVar.r()).f9823s) {
                    ((PortfolioHistoryViewModel) kVar.r()).f9822r = i10;
                    ((PortfolioHistoryViewModel) kVar.r()).h(((PortfolioHistoryViewModel) kVar.r()).f9824t);
                    return;
                }
                return;
            case 3:
                Intrinsics.checkNotNullParameter(parent, "parent");
                tg.o oVar = (tg.o) obj;
                if (((PortfolioOrdersViewModel) oVar.r()).f9922u) {
                    ((PortfolioOrdersViewModel) oVar.r()).f9925x = i10;
                    ((PortfolioOrdersViewModel) oVar.r()).f9923v = new BottomSheetItem("All Orders", HttpUrl.FRAGMENT_ENCODE_SET);
                    ((PortfolioOrdersViewModel) oVar.r()).h(((PortfolioOrdersViewModel) oVar.r()).f9920s);
                    return;
                }
                return;
            case 4:
                Intrinsics.checkNotNullParameter(view, "selectedItemView");
                ((StockOrderViewModel) ((StockOrderFragment) obj).r()).O.setValue(Integer.valueOf(i10));
                return;
            case 5:
                Intrinsics.checkNotNullParameter(view, "selectedItemView");
                ((ModifyShortSellOrderViewModel) ((ModifyShortSellOrderFragment) obj).r()).V.setValue(Integer.valueOf(i10));
                return;
            case 6:
                Intrinsics.checkNotNullParameter(view, "selectedItemView");
                ((StockShortSellOrderViewModel) ((StockShortSellOrderFragment) obj).r()).O.setValue(Integer.valueOf(i10));
                return;
            default:
                InputView inputView = (InputView) obj;
                Object item = inputView.D.f6125z.getAdapter().getItem(i10);
                if (item instanceof String) {
                    str = (String) item;
                } else {
                    str = null;
                }
                qj.r onInputViewAction = inputView.getOnInputViewAction();
                if (onInputViewAction != null) {
                    onInputViewAction.f(str);
                    return;
                }
                return;
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView parent) {
        switch (this.f25505a) {
            case 2:
                Intrinsics.checkNotNullParameter(parent, "parent");
                return;
            case 3:
                Intrinsics.checkNotNullParameter(parent, "parent");
                return;
            default:
                return;
        }
    }
}
