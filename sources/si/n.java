package si;

import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.ui.stock.modify.sell.StockModifySellOrderConfirmationViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class n extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34659a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ StockModifySellOrderConfirmationViewModel f34660b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(StockModifySellOrderConfirmationViewModel stockModifySellOrderConfirmationViewModel, int i10) {
        super(1);
        this.f34659a = i10;
        this.f34660b = stockModifySellOrderConfirmationViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10 = this.f34659a;
        StockModifySellOrderConfirmationViewModel stockModifySellOrderConfirmationViewModel = this.f34660b;
        switch (i10) {
            case 0:
                BaseResponseDto baseResponseDto = (BaseResponseDto) obj;
                stockModifySellOrderConfirmationViewModel.f9084g.postValue(Boolean.FALSE);
                if (baseResponseDto.getSuccess()) {
                    stockModifySellOrderConfirmationViewModel.f10351o.postValue(Unit.f23355a);
                } else {
                    stockModifySellOrderConfirmationViewModel.f9083f.postValue(ni.j.i(baseResponseDto.getMessage()));
                }
                return Unit.f23355a;
            default:
                stockModifySellOrderConfirmationViewModel.f9084g.postValue(Boolean.FALSE);
                ((Throwable) obj).printStackTrace();
                return Unit.f23355a;
        }
    }
}
