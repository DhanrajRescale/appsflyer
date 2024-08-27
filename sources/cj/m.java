package cj;

import ba.h4;
import com.assetgro.stockgro.data.model.ChangeDto;
import com.assetgro.stockgro.data.model.StockDto;
import com.assetgro.stockgro.ui.stock.v2.presentation.chart.StockTradingViewFullScreenChartActivity;
import com.assetgro.stockgro.widget.MarketAssetToolbarView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class m extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8182a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ StockTradingViewFullScreenChartActivity f8183b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(StockTradingViewFullScreenChartActivity stockTradingViewFullScreenChartActivity, int i10) {
        super(1);
        this.f8182a = i10;
        this.f8183b = stockTradingViewFullScreenChartActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10 = this.f8182a;
        StockTradingViewFullScreenChartActivity stockTradingViewFullScreenChartActivity = this.f8183b;
        switch (i10) {
            case 0:
                ((h4) stockTradingViewFullScreenChartActivity.w()).f4892u.loadUrl((String) obj);
                return Unit.f23355a;
            default:
                StockDto stockDto = (StockDto) obj;
                h4 h4Var = (h4) stockTradingViewFullScreenChartActivity.w();
                String name = stockDto.getName();
                double ltp = stockDto.getLtp();
                String imageUrl = stockDto.getImageUrl();
                MarketAssetToolbarView marketAssetToolbarView = h4Var.f4890s;
                marketAssetToolbarView.m(ltp, name, imageUrl);
                ChangeDto change = stockDto.getChange();
                if (change != null) {
                    marketAssetToolbarView.n(change);
                }
                return Unit.f23355a;
        }
    }
}
