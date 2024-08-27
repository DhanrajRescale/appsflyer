package wi;

import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.data.remote.response.StockOrderResponse;
import com.assetgro.stockgro.ui.stock.shortSell.confirm.StockSortSellConfirmationViewModel;
import iu.k;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ni.j;

/* loaded from: classes.dex */
public final class e extends k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39095a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ StockSortSellConfirmationViewModel f39096b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(StockSortSellConfirmationViewModel stockSortSellConfirmationViewModel, int i10) {
        super(1);
        this.f39095a = i10;
        this.f39096b = stockSortSellConfirmationViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10 = this.f39095a;
        StockSortSellConfirmationViewModel stockSortSellConfirmationViewModel = this.f39096b;
        switch (i10) {
            case 0:
                BaseResponseDto baseResponseDto = (BaseResponseDto) obj;
                stockSortSellConfirmationViewModel.f9084g.postValue(Boolean.FALSE);
                if (baseResponseDto.getSuccess()) {
                    StockOrderResponse stockOrderResponse = (StockOrderResponse) baseResponseDto.getData();
                    if (stockOrderResponse != null) {
                        stockSortSellConfirmationViewModel.f10411p.postValue(Boolean.valueOf(stockOrderResponse.isOrderExecuted()));
                    }
                } else {
                    stockSortSellConfirmationViewModel.f9083f.postValue(j.i(baseResponseDto.getMessage()));
                }
                stockSortSellConfirmationViewModel.f10413r.postValue(Boolean.TRUE);
                return Unit.f23355a;
            default:
                stockSortSellConfirmationViewModel.f9084g.postValue(Boolean.FALSE);
                ((Throwable) obj).printStackTrace();
                stockSortSellConfirmationViewModel.f10413r.postValue(Boolean.TRUE);
                return Unit.f23355a;
        }
    }
}
