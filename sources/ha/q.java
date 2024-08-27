package ha;

import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.data.repository.FnoRepository;
import com.assetgro.stockgro.feature_market.data.remote.OptionOverviewDto;
import com.assetgro.stockgro.feature_market.data.remote.OptionOverviewSecondaryCallRequestData;
import com.assetgro.stockgro.feature_market.domain.model.OptionOverview;
import com.assetgro.stockgro.feature_market.presentation.fno.details.OptionDetailViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import nv.v0;
import qu.f0;

/* loaded from: classes.dex */
public final class q extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f18105a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ OptionDetailViewModel f18106b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ OptionOverviewSecondaryCallRequestData f18107c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(OptionDetailViewModel optionDetailViewModel, OptionOverviewSecondaryCallRequestData optionOverviewSecondaryCallRequestData, yt.a aVar) {
        super(2, aVar);
        this.f18106b = optionDetailViewModel;
        this.f18107c = optionOverviewSecondaryCallRequestData;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new q(this.f18106b, this.f18107c, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((q) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        BaseResponseDto baseResponseDto;
        OptionOverviewDto optionOverviewDto;
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f18105a;
        OptionDetailViewModel optionDetailViewModel = this.f18106b;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            FnoRepository fnoRepository = optionDetailViewModel.f8593n;
            OptionOverviewSecondaryCallRequestData optionOverviewSecondaryCallRequestData = this.f18107c;
            this.f18105a = 1;
            obj = FnoRepository.getOptionOverview$default(fnoRepository, null, optionOverviewSecondaryCallRequestData, this, 1, null);
            if (obj == aVar) {
                return aVar;
            }
        }
        v0 v0Var = (v0) obj;
        if (v0Var.f29302a.isSuccessful() && (baseResponseDto = (BaseResponseDto) v0Var.f29303b) != null && (optionOverviewDto = (OptionOverviewDto) baseResponseDto.getData()) != null) {
            OptionOverview optionOverview = optionOverviewDto.toOptionOverview();
            optionDetailViewModel.f8595p.postValue(optionOverview);
            optionDetailViewModel.J = String.valueOf(optionOverview.getSelectedExpiry());
            optionDetailViewModel.D.postValue(optionOverview.getDefaultStrike());
            optionDetailViewModel.m();
        }
        return Unit.f23355a;
    }
}
