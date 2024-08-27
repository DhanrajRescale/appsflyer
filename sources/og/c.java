package og;

import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.data.repository.PortfolioRepository;
import com.assetgro.stockgro.feature_market.data.remote.PortfolioFnoHoldingResponseDto;
import com.assetgro.stockgro.ui.portfolio.holdings.PortfolioFnoHoldingsViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import nv.v0;
import qu.f0;

/* loaded from: classes.dex */
public final class c extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f30011a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PortfolioFnoHoldingsViewModel f30012b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(PortfolioFnoHoldingsViewModel portfolioFnoHoldingsViewModel, yt.a aVar) {
        super(2, aVar);
        this.f30012b = portfolioFnoHoldingsViewModel;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new c(this.f30012b, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        BaseResponseDto baseResponseDto;
        PortfolioFnoHoldingResponseDto portfolioFnoHoldingResponseDto;
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f30011a;
        PortfolioFnoHoldingsViewModel portfolioFnoHoldingsViewModel = this.f30012b;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            PortfolioRepository portfolioRepository = portfolioFnoHoldingsViewModel.f9825n;
            String str = portfolioFnoHoldingsViewModel.f9827p;
            this.f30011a = 1;
            obj = portfolioRepository.getPortfolioFnoHolding(str, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        v0 v0Var = (v0) obj;
        portfolioFnoHoldingsViewModel.f9084g.setValue(Boolean.FALSE);
        if (v0Var.f29302a.isSuccessful() && (baseResponseDto = (BaseResponseDto) v0Var.f29303b) != null && (portfolioFnoHoldingResponseDto = (PortfolioFnoHoldingResponseDto) baseResponseDto.getData()) != null) {
            portfolioFnoHoldingsViewModel.f9830s.postValue(portfolioFnoHoldingResponseDto.getFnoPortfolioHolding());
        }
        return Unit.f23355a;
    }
}
