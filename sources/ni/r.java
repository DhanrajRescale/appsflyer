package ni;

import androidx.lifecycle.e0;
import com.assetgro.stockgro.data.remote.response.IndexDto;
import com.assetgro.stockgro.data.remote.response.StocksListResponse;
import com.assetgro.stockgro.ui.stock.list.StockListViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import vt.g0;

/* loaded from: classes.dex */
public final class r extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28760a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ StockListViewModel f28761b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(StockListViewModel stockListViewModel, int i10) {
        super(1);
        this.f28760a = i10;
        this.f28761b = stockListViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        List<IndexDto> index;
        int i10 = this.f28760a;
        StockListViewModel stockListViewModel = this.f28761b;
        switch (i10) {
            case 0:
                Throwable th2 = (Throwable) obj;
                switch (i10) {
                    case 0:
                        stockListViewModel.f9084g.postValue(Boolean.FALSE);
                        th2.printStackTrace();
                        break;
                    default:
                        stockListViewModel.f9084g.postValue(Boolean.FALSE);
                        th2.printStackTrace();
                        break;
                }
                return Unit.f23355a;
            case 1:
                StocksListResponse stocksListResponse = (StocksListResponse) obj;
                stockListViewModel.f9084g.postValue(Boolean.FALSE);
                if (stocksListResponse != null) {
                    boolean z10 = stockListViewModel.C;
                    e0 e0Var = stockListViewModel.f10255p;
                    if (z10) {
                        e0Var.postValue(g0.N(stocksListResponse.getStocks(), 20));
                    } else {
                        e0Var.postValue(stocksListResponse.getStocks());
                    }
                    int stocksCount = stocksListResponse.getStocksCount();
                    int i11 = stockListViewModel.f10262w;
                    int i12 = stocksCount / i11;
                    stockListViewModel.f10261v = i12;
                    if (stocksCount % i11 > 0) {
                        stockListViewModel.f10261v = i12 + 1;
                    }
                    if (stockListViewModel.D && (index = stocksListResponse.getIndex()) != null && !index.isEmpty()) {
                        stockListViewModel.f10265z.postValue(stocksListResponse.getIndex().get(0));
                    }
                }
                return Unit.f23355a;
            case 2:
                Throwable th3 = (Throwable) obj;
                switch (i10) {
                    case 0:
                        stockListViewModel.f9084g.postValue(Boolean.FALSE);
                        th3.printStackTrace();
                        break;
                    default:
                        stockListViewModel.f9084g.postValue(Boolean.FALSE);
                        th3.printStackTrace();
                        break;
                }
                return Unit.f23355a;
            default:
                stockListViewModel.getClass();
                stockListViewModel.i();
                return Unit.f23355a;
        }
    }
}
