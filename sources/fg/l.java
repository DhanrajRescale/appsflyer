package fg;

import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.data.remote.response.ConfigDto;
import com.assetgro.stockgro.ui.payments.withdrawal.PaymentWithdrawalViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class l extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16084a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PaymentWithdrawalViewModel f16085b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(PaymentWithdrawalViewModel paymentWithdrawalViewModel, int i10) {
        super(1);
        this.f16084a = i10;
        this.f16085b = paymentWithdrawalViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ConfigDto configDto;
        int i10 = this.f16084a;
        PaymentWithdrawalViewModel paymentWithdrawalViewModel = this.f16085b;
        switch (i10) {
            case 0:
                BaseResponseDto baseResponseDto = (BaseResponseDto) obj;
                paymentWithdrawalViewModel.f9084g.postValue(Boolean.FALSE);
                if (baseResponseDto.getSuccess() && (configDto = (ConfigDto) baseResponseDto.getData()) != null) {
                    paymentWithdrawalViewModel.f9755n.postValue(configDto);
                }
                return Unit.f23355a;
            default:
                paymentWithdrawalViewModel.f9084g.postValue(Boolean.FALSE);
                return Unit.f23355a;
        }
    }
}
