package tf;

import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.data.remote.response.WithdrawableLimitDto;
import com.assetgro.stockgro.data.repository.PaymentRepository;
import com.assetgro.stockgro.ui.payments.WithdrawableLimitViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import nv.v0;
import qu.f0;
import ut.n;

/* loaded from: classes.dex */
public final class i extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f36021a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WithdrawableLimitViewModel f36022b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(WithdrawableLimitViewModel withdrawableLimitViewModel, yt.a aVar) {
        super(2, aVar);
        this.f36022b = withdrawableLimitViewModel;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new i(this.f36022b, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        WithdrawableLimitDto withdrawableLimitDto;
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f36021a;
        WithdrawableLimitViewModel withdrawableLimitViewModel = this.f36022b;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                n.b(obj);
                PaymentRepository paymentRepository = withdrawableLimitViewModel.f9634n;
                this.f36021a = 1;
                obj = paymentRepository.getWalletLimit(this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            v0 v0Var = (v0) obj;
            if (v0Var.f29302a.isSuccessful()) {
                BaseResponseDto baseResponseDto = (BaseResponseDto) v0Var.f29303b;
                if (baseResponseDto != null) {
                    withdrawableLimitDto = (WithdrawableLimitDto) baseResponseDto.getData();
                } else {
                    withdrawableLimitDto = null;
                }
                withdrawableLimitViewModel.f9635o.postValue(withdrawableLimitDto);
            }
        } catch (Exception unused) {
        }
        return Unit.f23355a;
    }
}
