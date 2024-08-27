package pi;

import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.ui.stock.modify.buy.StockModifyOrderConfirmationViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class m extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31147a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ StockModifyOrderConfirmationViewModel f31148b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(StockModifyOrderConfirmationViewModel stockModifyOrderConfirmationViewModel, int i10) {
        super(1);
        this.f31147a = i10;
        this.f31148b = stockModifyOrderConfirmationViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10 = this.f31147a;
        StockModifyOrderConfirmationViewModel stockModifyOrderConfirmationViewModel = this.f31148b;
        switch (i10) {
            case 0:
                BaseResponseDto baseResponseDto = (BaseResponseDto) obj;
                stockModifyOrderConfirmationViewModel.f9084g.postValue(Boolean.FALSE);
                if (baseResponseDto.getSuccess()) {
                    stockModifyOrderConfirmationViewModel.f10289p.postValue(Boolean.TRUE);
                } else {
                    stockModifyOrderConfirmationViewModel.f9083f.postValue(ni.j.i(baseResponseDto.getMessage()));
                }
                return Unit.f23355a;
            default:
                stockModifyOrderConfirmationViewModel.f9084g.postValue(Boolean.FALSE);
                ((Throwable) obj).printStackTrace();
                return Unit.f23355a;
        }
    }
}
