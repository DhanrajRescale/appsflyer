package ki;

import androidx.lifecycle.e0;
import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.data.remote.response.StockOrderResponse;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.stock.cover.review.StockCoverOrderConfirmationViewModel;
import iu.k;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ni.j;

/* loaded from: classes.dex */
public final class f extends k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23204a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ StockCoverOrderConfirmationViewModel f23205b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(StockCoverOrderConfirmationViewModel stockCoverOrderConfirmationViewModel, int i10) {
        super(1);
        this.f23204a = i10;
        this.f23205b = stockCoverOrderConfirmationViewModel;
    }

    public final void invoke(Throwable th2) {
        int i10 = this.f23204a;
        StockCoverOrderConfirmationViewModel stockCoverOrderConfirmationViewModel = this.f23205b;
        switch (i10) {
            case 2:
                stockCoverOrderConfirmationViewModel.f9084g.postValue(Boolean.FALSE);
                return;
            default:
                stockCoverOrderConfirmationViewModel.f9082e.postValue(j.i(Integer.valueOf(R.string.sell_order_error)));
                th2.printStackTrace();
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f23204a) {
            case 0:
                this.f23205b.f9084g.postValue(Boolean.TRUE);
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
        int i10 = this.f23204a;
        StockCoverOrderConfirmationViewModel stockCoverOrderConfirmationViewModel = this.f23205b;
        switch (i10) {
            case 1:
                stockCoverOrderConfirmationViewModel.f9084g.postValue(Boolean.FALSE);
                return;
            default:
                if (baseResponseDto.getSuccess()) {
                    e0 e0Var = stockCoverOrderConfirmationViewModel.f10185o;
                    StockOrderResponse stockOrderResponse = (StockOrderResponse) baseResponseDto.getData();
                    e0Var.postValue(stockOrderResponse != null ? Boolean.valueOf(stockOrderResponse.isOrderExecuted()) : null);
                    return;
                }
                stockCoverOrderConfirmationViewModel.f9083f.postValue(j.i(baseResponseDto.getMessage()));
                return;
        }
    }
}
