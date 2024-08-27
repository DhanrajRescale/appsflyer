package fg;

import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.data.remote.response.WithdrawOtpRegenerateResponseDto;
import com.assetgro.stockgro.data.repository.PaymentRepository;
import com.assetgro.stockgro.ui.payments.withdrawal.PaymentWithdrawalOTPVerifyViewModel;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import nv.v0;
import okhttp3.HttpUrl;
import okhttp3.ResponseBody;
import qu.f0;

/* loaded from: classes.dex */
public final class j extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f16078a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PaymentWithdrawalOTPVerifyViewModel f16079b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(PaymentWithdrawalOTPVerifyViewModel paymentWithdrawalOTPVerifyViewModel, yt.a aVar) {
        super(2, aVar);
        this.f16079b = paymentWithdrawalOTPVerifyViewModel;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new j(this.f16079b, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((j) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        WithdrawOtpRegenerateResponseDto withdrawOtpRegenerateResponseDto;
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f16078a;
        PaymentWithdrawalOTPVerifyViewModel paymentWithdrawalOTPVerifyViewModel = this.f16079b;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            PaymentRepository paymentRepository = paymentWithdrawalOTPVerifyViewModel.f9738g;
            this.f16078a = 1;
            obj = paymentRepository.resendOtp(this);
            if (obj == aVar) {
                return aVar;
            }
        }
        v0 v0Var = (v0) obj;
        paymentWithdrawalOTPVerifyViewModel.f9070f.postValue(Boolean.FALSE);
        if (v0Var.f29302a.isSuccessful()) {
            BaseResponseDto baseResponseDto = (BaseResponseDto) v0Var.f29303b;
            if (baseResponseDto != null && (withdrawOtpRegenerateResponseDto = (WithdrawOtpRegenerateResponseDto) baseResponseDto.getData()) != null) {
                String sessionId = withdrawOtpRegenerateResponseDto.getSessionId();
                Intrinsics.checkNotNullParameter(sessionId, "<set-?>");
                paymentWithdrawalOTPVerifyViewModel.f9754w = sessionId;
                paymentWithdrawalOTPVerifyViewModel.f9753v = withdrawOtpRegenerateResponseDto.getOtpTime();
                paymentWithdrawalOTPVerifyViewModel.g();
                paymentWithdrawalOTPVerifyViewModel.f9747p.postValue(HttpUrl.FRAGMENT_ENCODE_SET);
                paymentWithdrawalOTPVerifyViewModel.f9743l.postValue(new Pair(withdrawOtpRegenerateResponseDto.getMessage(), Boolean.TRUE));
            }
        } else {
            ResponseBody responseBody = v0Var.f29304c;
            if (responseBody != null) {
                PaymentWithdrawalOTPVerifyViewModel.f(paymentWithdrawalOTPVerifyViewModel, responseBody);
            }
        }
        return Unit.f23355a;
    }
}
