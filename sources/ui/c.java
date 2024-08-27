package ui;

import com.assetgro.stockgro.data.remote.response.StocksListResponse;
import com.assetgro.stockgro.ui.stock.search.MarketAssetSearchViewModel;
import iu.k;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class c extends k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37215a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MarketAssetSearchViewModel f37216b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(MarketAssetSearchViewModel marketAssetSearchViewModel, int i10) {
        super(1);
        this.f37215a = i10;
        this.f37216b = marketAssetSearchViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10 = this.f37215a;
        MarketAssetSearchViewModel marketAssetSearchViewModel = this.f37216b;
        switch (i10) {
            case 0:
                StocksListResponse stocksListResponse = (StocksListResponse) obj;
                marketAssetSearchViewModel.f9084g.postValue(Boolean.FALSE);
                if (stocksListResponse != null) {
                    marketAssetSearchViewModel.f10387o.postValue(stocksListResponse.getStocks());
                }
                return Unit.f23355a;
            case 1:
                marketAssetSearchViewModel.f9084g.postValue(Boolean.FALSE);
                ((Throwable) obj).printStackTrace();
                return Unit.f23355a;
            default:
                marketAssetSearchViewModel.h();
                return Unit.f23355a;
        }
    }
}
