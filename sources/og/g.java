package og;

import com.assetgro.stockgro.data.model.LeagueUnifiedResponseDto;
import com.assetgro.stockgro.data.model.UnifiedPortfolio;
import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.data.repository.PortfolioRepository;
import com.assetgro.stockgro.ui.portfolio.holdings.PortfolioHoldingsViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import nv.v0;
import qu.f0;

/* loaded from: classes.dex */
public final class g extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f30041a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PortfolioHoldingsViewModel f30042b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f30043c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(PortfolioHoldingsViewModel portfolioHoldingsViewModel, String str, yt.a aVar) {
        super(2, aVar);
        this.f30042b = portfolioHoldingsViewModel;
        this.f30043c = str;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new g(this.f30042b, this.f30043c, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        BaseResponseDto baseResponseDto;
        LeagueUnifiedResponseDto leagueUnifiedResponseDto;
        UnifiedPortfolio portfolio;
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f30041a;
        PortfolioHoldingsViewModel portfolioHoldingsViewModel = this.f30042b;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            PortfolioRepository portfolioRepository = portfolioHoldingsViewModel.f9834n;
            String str = portfolioHoldingsViewModel.f9837q;
            String str2 = this.f30043c;
            portfolioHoldingsViewModel.getClass();
            this.f30041a = 1;
            obj = portfolioRepository.getUnifiedLeaguePortfolioData(str, str2, null, true, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        v0 v0Var = (v0) obj;
        portfolioHoldingsViewModel.f9084g.postValue(Boolean.FALSE);
        if (v0Var.f29302a.isSuccessful() && (baseResponseDto = (BaseResponseDto) v0Var.f29303b) != null && (leagueUnifiedResponseDto = (LeagueUnifiedResponseDto) baseResponseDto.getData()) != null && (portfolio = leagueUnifiedResponseDto.getPortfolio()) != null) {
            portfolioHoldingsViewModel.f9835o.postValue(portfolio);
        }
        return Unit.f23355a;
    }
}
