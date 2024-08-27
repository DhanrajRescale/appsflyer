package ti;

import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.ui.stock.modify.short_sell.StockModifyShortSellOrderConfirmationViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class m extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36128a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ StockModifyShortSellOrderConfirmationViewModel f36129b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(StockModifyShortSellOrderConfirmationViewModel stockModifyShortSellOrderConfirmationViewModel, int i10) {
        super(1);
        this.f36128a = i10;
        this.f36129b = stockModifyShortSellOrderConfirmationViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10 = this.f36128a;
        StockModifyShortSellOrderConfirmationViewModel stockModifyShortSellOrderConfirmationViewModel = this.f36129b;
        switch (i10) {
            case 0:
                BaseResponseDto baseResponseDto = (BaseResponseDto) obj;
                stockModifyShortSellOrderConfirmationViewModel.f9084g.postValue(Boolean.FALSE);
                if (baseResponseDto.getSuccess()) {
                    stockModifyShortSellOrderConfirmationViewModel.f10374p.postValue(Boolean.TRUE);
                } else {
                    stockModifyShortSellOrderConfirmationViewModel.f9083f.postValue(ni.j.i(baseResponseDto.getMessage()));
                }
                return Unit.f23355a;
            default:
                stockModifyShortSellOrderConfirmationViewModel.f9084g.postValue(Boolean.FALSE);
                ((Throwable) obj).printStackTrace();
                return Unit.f23355a;
        }
    }
}
