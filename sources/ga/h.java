package ga;

import androidx.lifecycle.e0;
import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.data.repository.FnoRepository;
import com.assetgro.stockgro.feature_market.data.remote.OptionChainDto;
import com.assetgro.stockgro.feature_market.domain.model.OptionChain;
import com.assetgro.stockgro.feature_market.presentation.fno.chain.OptionChainViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import nv.v0;
import qu.f0;
import ut.n;

/* loaded from: classes.dex */
public final class h extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f17188a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ OptionChainViewModel f17189b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f17190c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(OptionChainViewModel optionChainViewModel, String str, yt.a aVar) {
        super(2, aVar);
        this.f17189b = optionChainViewModel;
        this.f17190c = str;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new h(this.f17189b, this.f17190c, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        BaseResponseDto baseResponseDto;
        OptionChainDto optionChainDto;
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f17188a;
        OptionChainViewModel optionChainViewModel = this.f17189b;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                n.b(obj);
                FnoRepository fnoRepository = optionChainViewModel.f8584n;
                String str = this.f17190c;
                this.f17188a = 1;
                obj = fnoRepository.getOptionChain(str, "ALL", this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            v0 v0Var = (v0) obj;
            optionChainViewModel.f9084g.postValue(Boolean.FALSE);
            if (v0Var.f29302a.isSuccessful() && (baseResponseDto = (BaseResponseDto) v0Var.f29303b) != null && (optionChainDto = (OptionChainDto) baseResponseDto.getData()) != null) {
                OptionChain optionChain = optionChainDto.toOptionChain();
                optionChainViewModel.f8585o.postValue(optionChain);
                boolean a10 = Intrinsics.a(optionChainViewModel.f8590t.getValue(), Boolean.TRUE);
                e0 e0Var = optionChainViewModel.f8587q;
                if (a10) {
                    e0Var.postValue(optionChain.getPutOptionData().getContracts());
                } else {
                    e0Var.postValue(optionChain.getCallOptionData().getContracts());
                }
            }
        } catch (Exception unused) {
            optionChainViewModel.f9084g.postValue(Boolean.FALSE);
        }
        return Unit.f23355a;
    }
}
