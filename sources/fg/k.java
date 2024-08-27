package fg;

import com.assetgro.stockgro.data.remote.request.WithdrawInitiateDto;
import com.assetgro.stockgro.data.remote.request.WithdrawProcessDto;
import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.data.remote.response.WithdrawProcessResponseDto;
import com.assetgro.stockgro.data.repository.PaymentRepository;
import com.assetgro.stockgro.ui.payments.withdrawal.PaymentWithdrawalOTPVerifyViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import nv.v0;
import okhttp3.ResponseBody;
import qu.f0;

/* loaded from: classes.dex */
public final class k extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f16080a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PaymentWithdrawalOTPVerifyViewModel f16081b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ WithdrawInitiateDto f16082c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f16083d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(PaymentWithdrawalOTPVerifyViewModel paymentWithdrawalOTPVerifyViewModel, WithdrawInitiateDto withdrawInitiateDto, String str, yt.a aVar) {
        super(2, aVar);
        this.f16081b = paymentWithdrawalOTPVerifyViewModel;
        this.f16082c = withdrawInitiateDto;
        this.f16083d = str;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new k(this.f16081b, this.f16082c, this.f16083d, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((k) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        WithdrawProcessResponseDto withdrawProcessResponseDto;
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f16080a;
        PaymentWithdrawalOTPVerifyViewModel paymentWithdrawalOTPVerifyViewModel = this.f16081b;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            PaymentRepository paymentRepository = paymentWithdrawalOTPVerifyViewModel.f9738g;
            WithdrawInitiateDto withdrawInitiateDto = this.f16082c;
            WithdrawProcessDto withdrawProcessDto = new WithdrawProcessDto(withdrawInitiateDto.getAmount(), withdrawInitiateDto.getBeneficiary(), withdrawInitiateDto.getBeneficiaryType(), withdrawInitiateDto.getIfsc(), paymentWithdrawalOTPVerifyViewModel.f9754w, this.f16083d);
            this.f16080a = 1;
            obj = paymentRepository.withdrawProcess(withdrawProcessDto, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        v0 v0Var = (v0) obj;
        paymentWithdrawalOTPVerifyViewModel.f9070f.postValue(Boolean.FALSE);
        if (v0Var.f29302a.isSuccessful()) {
            BaseResponseDto baseResponseDto = (BaseResponseDto) v0Var.f29303b;
            if (baseResponseDto != null && (withdrawProcessResponseDto = (WithdrawProcessResponseDto) baseResponseDto.getData()) != null) {
                paymentWithdrawalOTPVerifyViewModel.f9749r.postValue(withdrawProcessResponseDto.getTxnTd());
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
