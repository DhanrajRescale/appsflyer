package ri;

import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.ui.stock.modify.cover.ModifyStockCoverOrderConfirmationViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class f extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33764a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ModifyStockCoverOrderConfirmationViewModel f33765b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(ModifyStockCoverOrderConfirmationViewModel modifyStockCoverOrderConfirmationViewModel, int i10) {
        super(1);
        this.f33764a = i10;
        this.f33765b = modifyStockCoverOrderConfirmationViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10 = this.f33764a;
        ModifyStockCoverOrderConfirmationViewModel modifyStockCoverOrderConfirmationViewModel = this.f33765b;
        switch (i10) {
            case 0:
                BaseResponseDto baseResponseDto = (BaseResponseDto) obj;
                modifyStockCoverOrderConfirmationViewModel.f9084g.postValue(Boolean.FALSE);
                if (baseResponseDto.getSuccess()) {
                    modifyStockCoverOrderConfirmationViewModel.f10315o.postValue(Unit.f23355a);
                } else {
                    modifyStockCoverOrderConfirmationViewModel.f9083f.postValue(ni.j.i(baseResponseDto.getMessage()));
                }
                return Unit.f23355a;
            default:
                modifyStockCoverOrderConfirmationViewModel.f9084g.postValue(Boolean.FALSE);
                ((Throwable) obj).printStackTrace();
                return Unit.f23355a;
        }
    }
}
