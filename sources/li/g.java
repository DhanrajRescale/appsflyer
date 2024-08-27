package li;

import com.assetgro.stockgro.data.model.StockDetailDto;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.stock.detail.StockDetailViewModel;
import iu.k;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ni.j;

/* loaded from: classes.dex */
public final class g extends k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24866a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ StockDetailViewModel f24867b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(StockDetailViewModel stockDetailViewModel, int i10) {
        super(1);
        this.f24866a = i10;
        this.f24867b = stockDetailViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        StockDetailViewModel stockDetailViewModel = this.f24867b;
        int i10 = this.f24866a;
        switch (i10) {
            case 0:
                stockDetailViewModel.f9084g.postValue(Boolean.TRUE);
                return Unit.f23355a;
            case 1:
                StockDetailDto stockDetailDto = (StockDetailDto) obj;
                switch (i10) {
                    case 1:
                        stockDetailViewModel.f9084g.postValue(Boolean.FALSE);
                        break;
                    default:
                        if (stockDetailDto != null) {
                            stockDetailViewModel.f10196p.postValue(stockDetailDto.getStockDto());
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
                        stockDetailViewModel.f9084g.postValue(Boolean.FALSE);
                        break;
                    default:
                        if (stockDetailDto2 != null) {
                            stockDetailViewModel.f10196p.postValue(stockDetailDto2.getStockDto());
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
        int i10 = this.f24866a;
        StockDetailViewModel stockDetailViewModel = this.f24867b;
        switch (i10) {
            case 2:
                stockDetailViewModel.f9084g.postValue(Boolean.FALSE);
                return;
            default:
                th2.printStackTrace();
                stockDetailViewModel.f9082e.postValue(j.i(Integer.valueOf(R.string.error_stock_details)));
                return;
        }
    }
}
