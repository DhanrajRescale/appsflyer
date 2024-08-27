package fg;

import com.assetgro.stockgro.ui.payments.withdrawal.PaymentWithdrawalOTPVerifyViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class i extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16076a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PaymentWithdrawalOTPVerifyViewModel f16077b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(PaymentWithdrawalOTPVerifyViewModel paymentWithdrawalOTPVerifyViewModel, int i10) {
        super(1);
        this.f16076a = i10;
        this.f16077b = paymentWithdrawalOTPVerifyViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10 = this.f16076a;
        PaymentWithdrawalOTPVerifyViewModel paymentWithdrawalOTPVerifyViewModel = this.f16077b;
        switch (i10) {
            case 0:
                Integer timePassed = (Integer) obj;
                Intrinsics.checkNotNullParameter(timePassed, "timePassed");
                return Integer.valueOf(paymentWithdrawalOTPVerifyViewModel.f9753v - timePassed.intValue());
            default:
                Integer num = (Integer) obj;
                Intrinsics.c(num);
                if (num.intValue() > 0) {
                    paymentWithdrawalOTPVerifyViewModel.f9745n.postValue(num + " sec");
                } else {
                    paymentWithdrawalOTPVerifyViewModel.f9745n.postValue(HttpUrl.FRAGMENT_ENCODE_SET);
                    paymentWithdrawalOTPVerifyViewModel.f9739h.postValue(Boolean.TRUE);
                }
                return Unit.f23355a;
        }
    }
}
