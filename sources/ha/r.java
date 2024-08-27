package ha;

import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.data.repository.FnoRepository;
import com.assetgro.stockgro.feature_market.data.remote.OptionOverviewDto;
import com.assetgro.stockgro.feature_market.presentation.fno.details.OptionDetailViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import nv.v0;
import qu.f0;

/* loaded from: classes.dex */
public final class r extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f18108a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ OptionDetailViewModel f18109b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(OptionDetailViewModel optionDetailViewModel, yt.a aVar) {
        super(2, aVar);
        this.f18109b = optionDetailViewModel;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new r(this.f18109b, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((r) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        BaseResponseDto baseResponseDto;
        OptionOverviewDto optionOverviewDto;
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f18108a;
        OptionDetailViewModel optionDetailViewModel = this.f18109b;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    ut.n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ut.n.b(obj);
                FnoRepository fnoRepository = optionDetailViewModel.f8593n;
                String identifier = optionDetailViewModel.i().getIdentifier();
                this.f18108a = 1;
                obj = FnoRepository.getOptionOverview$default(fnoRepository, identifier, null, this, 2, null);
                if (obj == aVar) {
                    return aVar;
                }
            }
            v0 v0Var = (v0) obj;
            optionDetailViewModel.f9084g.postValue(Boolean.FALSE);
            if (v0Var.f29302a.isSuccessful() && (baseResponseDto = (BaseResponseDto) v0Var.f29303b) != null && (optionOverviewDto = (OptionOverviewDto) baseResponseDto.getData()) != null) {
                OptionDetailViewModel.h(optionDetailViewModel, optionOverviewDto.toOptionOverview());
            }
        } catch (Exception unused) {
            optionDetailViewModel.f9084g.setValue(Boolean.FALSE);
        }
        return Unit.f23355a;
    }
}
