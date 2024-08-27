package ea;

import com.assetgro.stockgro.data.repository.StockRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.feature_market.presentation.market.asset.stocks.asset.MarketAssetInsightsViewModel;
import com.assetgro.stockgro.ui.stock.cover.review.StockCoverOrderConfirmationViewModel;
import com.assetgro.stockgro.ui.stock.detail.order.StockOrderConfirmationViewModel;
import com.assetgro.stockgro.ui.stock.modify.buy.StockModifyOrderConfirmationViewModel;
import com.assetgro.stockgro.ui.stock.modify.cover.ModifyStockCoverOrderConfirmationViewModel;
import com.assetgro.stockgro.ui.stock.modify.sell.StockModifySellOrderConfirmationViewModel;
import com.assetgro.stockgro.ui.stock.modify.short_sell.StockModifyShortSellOrderConfirmationViewModel;
import com.assetgro.stockgro.ui.stock.search.MarketAssetSearchViewModel;
import com.assetgro.stockgro.ui.stock.sell.StockSellOrderConfirmationViewModel;
import com.assetgro.stockgro.ui.stock.shortSell.confirm.StockSortSellConfirmationViewModel;
import com.assetgro.stockgro.ui.stock.v2.presentation.analysis.StockAnalysisViewModel;
import com.assetgro.stockgro.ui.stock.v2.presentation.chart.StockChartViewModel;
import com.assetgro.stockgro.ui.stock.v2.presentation.chart.StockTradingViewFullScreenChartViewModel;
import com.assetgro.stockgro.ui.stock.v2.presentation.overview.StockOverviewV2ViewModel;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class a extends iu.k implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15104a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ pj.a f15105b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ct.a f15106c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ StockRepository f15107d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ UserRepository f15108e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(StockRepository stockRepository, UserRepository userRepository, kq.e eVar, ct.a aVar) {
        super(0);
        this.f15104a = 2;
        this.f15105b = eVar;
        this.f15106c = aVar;
        this.f15108e = userRepository;
        this.f15107d = stockRepository;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo2invoke() {
        int i10 = this.f15104a;
        UserRepository userRepository = this.f15108e;
        StockRepository stockRepository = this.f15107d;
        ct.a aVar = this.f15106c;
        pj.a aVar2 = this.f15105b;
        switch (i10) {
            case 0:
                return new StockTradingViewFullScreenChartViewModel(stockRepository, userRepository, aVar2, aVar);
            case 1:
                switch (i10) {
                    case 1:
                        return new MarketAssetSearchViewModel(stockRepository, userRepository, aVar2, aVar);
                    default:
                        return new MarketAssetSearchViewModel(stockRepository, userRepository, aVar2, aVar);
                }
            case 2:
                return new MarketAssetInsightsViewModel(stockRepository, userRepository, aVar2, aVar);
            case 3:
                switch (i10) {
                    case 1:
                        return new MarketAssetSearchViewModel(stockRepository, userRepository, aVar2, aVar);
                    default:
                        return new MarketAssetSearchViewModel(stockRepository, userRepository, aVar2, aVar);
                }
            case 4:
                return new ModifyStockCoverOrderConfirmationViewModel(stockRepository, userRepository, aVar2, aVar);
            case 5:
                return new StockAnalysisViewModel(stockRepository, userRepository, aVar2, aVar);
            case 6:
                return new StockChartViewModel(stockRepository, userRepository, aVar2, aVar);
            case 7:
                return new StockCoverOrderConfirmationViewModel(stockRepository, userRepository, aVar2, aVar);
            case 8:
                return new StockModifyOrderConfirmationViewModel(stockRepository, userRepository, aVar2, aVar);
            case 9:
                return new StockModifySellOrderConfirmationViewModel(stockRepository, userRepository, aVar2, aVar);
            case 10:
                return new StockModifyShortSellOrderConfirmationViewModel(stockRepository, userRepository, aVar2, aVar);
            case 11:
                return new StockOrderConfirmationViewModel(stockRepository, userRepository, aVar2, aVar);
            case 12:
                return new StockOverviewV2ViewModel(stockRepository, userRepository, aVar2, aVar);
            case 13:
                return new StockSellOrderConfirmationViewModel(stockRepository, userRepository, aVar2, aVar);
            default:
                return new StockSortSellConfirmationViewModel(stockRepository, userRepository, aVar2, aVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(pj.a aVar, ct.a aVar2, StockRepository stockRepository, UserRepository userRepository, int i10) {
        super(0);
        this.f15104a = i10;
        this.f15105b = aVar;
        this.f15106c = aVar2;
        this.f15107d = stockRepository;
        this.f15108e = userRepository;
    }
}
