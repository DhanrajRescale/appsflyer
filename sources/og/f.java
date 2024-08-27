package og;

import com.assetgro.stockgro.data.model.LeagueUnifiedResponseDto;
import com.assetgro.stockgro.data.model.UnifiedPortfolio;
import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.data.repository.PortfolioRepository;
import com.assetgro.stockgro.ui.portfolio.holdings.PortfolioHoldingsViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import nv.v0;
import okhttp3.HttpUrl;
import qu.f0;

/* loaded from: classes.dex */
public final class f extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f30039a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PortfolioHoldingsViewModel f30040b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(PortfolioHoldingsViewModel portfolioHoldingsViewModel, yt.a aVar) {
        super(2, aVar);
        this.f30040b = portfolioHoldingsViewModel;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new f(this.f30040b, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        String str;
        LeagueUnifiedResponseDto leagueUnifiedResponseDto;
        UnifiedPortfolio portfolio;
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f30039a;
        String str2 = HttpUrl.FRAGMENT_ENCODE_SET;
        PortfolioHoldingsViewModel portfolioHoldingsViewModel = this.f30040b;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            PortfolioRepository portfolioRepository = portfolioHoldingsViewModel.f9834n;
            String assetClass = portfolioHoldingsViewModel.i().getAssetClass();
            if (assetClass == null) {
                str = HttpUrl.FRAGMENT_ENCODE_SET;
            } else {
                str = assetClass;
            }
            String portfolioId = portfolioHoldingsViewModel.i().getPortfolioId();
            portfolioHoldingsViewModel.getClass();
            this.f30039a = 1;
            obj = portfolioRepository.getUnifiedLeaguePortfolioData(str, portfolioId, null, true, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        v0 v0Var = (v0) obj;
        portfolioHoldingsViewModel.f9084g.postValue(Boolean.FALSE);
        if (v0Var.f29302a.isSuccessful()) {
            BaseResponseDto baseResponseDto = (BaseResponseDto) v0Var.f29303b;
            if (baseResponseDto != null && (leagueUnifiedResponseDto = (LeagueUnifiedResponseDto) baseResponseDto.getData()) != null && (portfolio = leagueUnifiedResponseDto.getPortfolio()) != null) {
                portfolioHoldingsViewModel.f9835o.postValue(portfolio);
                String assetClass2 = portfolio.getAssetClass();
                if (assetClass2 != null) {
                    str2 = assetClass2;
                }
                Intrinsics.checkNotNullParameter(str2, "<set-?>");
                portfolioHoldingsViewModel.f9837q = str2;
            }
            portfolioHoldingsViewModel.f9836p.postValue(Boolean.valueOf(Intrinsics.a(portfolioHoldingsViewModel.f9837q, "EQUITY")));
        }
        return Unit.f23355a;
    }
}
