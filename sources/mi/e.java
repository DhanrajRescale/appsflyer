package mi;

import com.assetgro.stockgro.data.model.StockOrderDto;
import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.data.remote.response.StockOrderResponse;
import com.assetgro.stockgro.ui.stock.detail.order.StockOrderConfirmationViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class e extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27785a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ StockOrderConfirmationViewModel f27786b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(StockOrderConfirmationViewModel stockOrderConfirmationViewModel, int i10) {
        super(1);
        this.f27785a = i10;
        this.f27786b = stockOrderConfirmationViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Integer num;
        int i10 = this.f27785a;
        StockOrderConfirmationViewModel stockOrderConfirmationViewModel = this.f27786b;
        switch (i10) {
            case 0:
                BaseResponseDto baseResponseDto = (BaseResponseDto) obj;
                stockOrderConfirmationViewModel.f9084g.postValue(Boolean.FALSE);
                if (baseResponseDto.getSuccess()) {
                    StockOrderResponse stockOrderResponse = (StockOrderResponse) baseResponseDto.getData();
                    if (stockOrderResponse != null) {
                        stockOrderConfirmationViewModel.f10208p.postValue(Boolean.valueOf(stockOrderResponse.isOrderExecuted()));
                    }
                } else {
                    stockOrderConfirmationViewModel.f9083f.postValue(ni.j.i(baseResponseDto.getMessage()));
                }
                stockOrderConfirmationViewModel.f10210r.postValue(Boolean.TRUE);
                return Unit.f23355a;
            case 1:
                stockOrderConfirmationViewModel.f9084g.postValue(Boolean.FALSE);
                ((Throwable) obj).printStackTrace();
                stockOrderConfirmationViewModel.f10210r.postValue(Boolean.TRUE);
                return Unit.f23355a;
            default:
                StockOrderDto stockOrderDto = (StockOrderDto) obj;
                String quantity = stockOrderDto.getQuantity();
                if (quantity != null) {
                    num = Integer.valueOf(Integer.parseInt(quantity));
                } else {
                    num = null;
                }
                Double executionPrice = stockOrderDto.getExecutionPrice();
                if (num != null && executionPrice != null) {
                    return ij.h.m(ij.h.f20067a, executionPrice.doubleValue() * num.intValue());
                }
                stockOrderConfirmationViewModel.f9083f.setValue(ni.j.i("Technical Error Occurred"));
                return HttpUrl.FRAGMENT_ENCODE_SET;
        }
    }
}
