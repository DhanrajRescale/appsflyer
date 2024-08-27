package wf;

import com.assetgro.stockgro.data.remote.response.AddResponse;
import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.data.remote.response.BulletInDto;
import com.assetgro.stockgro.data.repository.PaymentRepository;
import com.assetgro.stockgro.ui.payments.home.WalletHomeViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import nv.v0;
import qu.f0;
import ut.n;

/* loaded from: classes.dex */
public final class g extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f39052a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WalletHomeViewModel f39053b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(WalletHomeViewModel walletHomeViewModel, yt.a aVar) {
        super(2, aVar);
        this.f39053b = walletHomeViewModel;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new g(this.f39053b, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        BaseResponseDto baseResponseDto;
        AddResponse addResponse;
        List<BulletInDto> creatives;
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f39052a;
        WalletHomeViewModel walletHomeViewModel = this.f39053b;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                n.b(obj);
                PaymentRepository paymentRepository = walletHomeViewModel.f9648n;
                this.f39052a = 1;
                obj = paymentRepository.getAddData(this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            v0 v0Var = (v0) obj;
            if (v0Var.f29302a.isSuccessful() && (baseResponseDto = (BaseResponseDto) v0Var.f29303b) != null && (addResponse = (AddResponse) baseResponseDto.getData()) != null && (creatives = addResponse.getCreatives()) != null) {
                walletHomeViewModel.F.postValue(creatives);
            }
        } catch (Exception unused) {
        }
        return Unit.f23355a;
    }
}
