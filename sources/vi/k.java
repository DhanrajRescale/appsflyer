package vi;

import androidx.lifecycle.e0;
import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.data.remote.response.StockOrderResponse;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.stock.sell.StockSellOrderConfirmationViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class k extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38101a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ StockSellOrderConfirmationViewModel f38102b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(StockSellOrderConfirmationViewModel stockSellOrderConfirmationViewModel, int i10) {
        super(1);
        this.f38101a = i10;
        this.f38102b = stockSellOrderConfirmationViewModel;
    }

    public final void invoke(Throwable th2) {
        int i10 = this.f38101a;
        StockSellOrderConfirmationViewModel stockSellOrderConfirmationViewModel = this.f38102b;
        switch (i10) {
            case 2:
                stockSellOrderConfirmationViewModel.f9084g.postValue(Boolean.FALSE);
                return;
            default:
                stockSellOrderConfirmationViewModel.f9082e.postValue(ni.j.i(Integer.valueOf(R.string.sell_order_error)));
                th2.printStackTrace();
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f38101a) {
            case 0:
                this.f38102b.f9084g.postValue(Boolean.TRUE);
                return Unit.f23355a;
            case 1:
                invoke((BaseResponseDto) obj);
                return Unit.f23355a;
            case 2:
                invoke((Throwable) obj);
                return Unit.f23355a;
            case 3:
                invoke((BaseResponseDto) obj);
                return Unit.f23355a;
            default:
                invoke((Throwable) obj);
                return Unit.f23355a;
        }
    }

    public final void invoke(BaseResponseDto baseResponseDto) {
        int i10 = this.f38101a;
        StockSellOrderConfirmationViewModel stockSellOrderConfirmationViewModel = this.f38102b;
        switch (i10) {
            case 1:
                stockSellOrderConfirmationViewModel.f9084g.postValue(Boolean.FALSE);
                return;
            default:
                if (baseResponseDto.getSuccess()) {
                    e0 e0Var = stockSellOrderConfirmationViewModel.f10397o;
                    StockOrderResponse stockOrderResponse = (StockOrderResponse) baseResponseDto.getData();
                    e0Var.postValue(stockOrderResponse != null ? Boolean.valueOf(stockOrderResponse.isOrderExecuted()) : null);
                    return;
                }
                stockSellOrderConfirmationViewModel.f9083f.postValue(ni.j.i(baseResponseDto.getMessage()));
                return;
        }
    }
}
