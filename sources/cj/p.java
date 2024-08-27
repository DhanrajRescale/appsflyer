package cj;

import com.assetgro.stockgro.data.model.StockDetailDto;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.stock.v2.presentation.chart.StockTradingViewFullScreenChartViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class p extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8187a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ StockTradingViewFullScreenChartViewModel f8188b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(StockTradingViewFullScreenChartViewModel stockTradingViewFullScreenChartViewModel, int i10) {
        super(1);
        this.f8187a = i10;
        this.f8188b = stockTradingViewFullScreenChartViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        StockTradingViewFullScreenChartViewModel stockTradingViewFullScreenChartViewModel = this.f8188b;
        int i10 = this.f8187a;
        switch (i10) {
            case 0:
                stockTradingViewFullScreenChartViewModel.f9084g.postValue(Boolean.TRUE);
                return Unit.f23355a;
            case 1:
                StockDetailDto stockDetailDto = (StockDetailDto) obj;
                switch (i10) {
                    case 1:
                        stockTradingViewFullScreenChartViewModel.f9084g.postValue(Boolean.FALSE);
                        break;
                    default:
                        if (stockDetailDto != null) {
                            stockTradingViewFullScreenChartViewModel.f10478r.postValue(stockDetailDto.getStockDto());
                            break;
                        }
                        break;
                }
                return Unit.f23355a;
            case 2:
                invoke((Throwable) obj);
                return Unit.f23355a;
            case 3:
                StockDetailDto stockDetailDto2 = (StockDetailDto) obj;
                switch (i10) {
                    case 1:
                        stockTradingViewFullScreenChartViewModel.f9084g.postValue(Boolean.FALSE);
                        break;
                    default:
                        if (stockDetailDto2 != null) {
                            stockTradingViewFullScreenChartViewModel.f10478r.postValue(stockDetailDto2.getStockDto());
                            break;
                        }
                        break;
                }
                return Unit.f23355a;
            default:
                invoke((Throwable) obj);
                return Unit.f23355a;
        }
    }

    public final void invoke(Throwable th2) {
        int i10 = this.f8187a;
        StockTradingViewFullScreenChartViewModel stockTradingViewFullScreenChartViewModel = this.f8188b;
        switch (i10) {
            case 2:
                stockTradingViewFullScreenChartViewModel.f9084g.postValue(Boolean.FALSE);
                return;
            default:
                th2.printStackTrace();
                stockTradingViewFullScreenChartViewModel.f9082e.postValue(ni.j.i(Integer.valueOf(R.string.error_stock_details)));
                return;
        }
    }
}
