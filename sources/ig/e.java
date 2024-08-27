package ig;

import com.assetgro.stockgro.data.model.portfolio.holdings.Portfolio;
import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.data.repository.PortfolioRepository;
import com.assetgro.stockgro.ui.portfolio.detail.PortfolioDetailViewModel;
import com.assetgro.stockgro.ui.portfolio.v2.data.remote.PortfolioSectionDto;
import com.assetgro.stockgro.ui.portfolio.v2.data.remote.PortfoliosDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import nv.v0;
import qu.f0;
import ut.n;
import vt.v;

/* loaded from: classes.dex */
public final class e extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f19973a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PortfolioDetailViewModel f19974b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(PortfolioDetailViewModel portfolioDetailViewModel, yt.a aVar) {
        super(2, aVar);
        this.f19974b = portfolioDetailViewModel;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new e(this.f19974b, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        BaseResponseDto baseResponseDto;
        PortfoliosDto portfoliosDto;
        Object obj2;
        List<Portfolio> portfolios;
        List<Portfolio> portfolios2;
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f19973a;
        PortfolioDetailViewModel portfolioDetailViewModel = this.f19974b;
        if (i10 != 0) {
            if (i10 == 1) {
                n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            n.b(obj);
            PortfolioRepository portfolioRepository = portfolioDetailViewModel.f9777n;
            this.f19973a = 1;
            obj = portfolioRepository.getPortfoliosV2(this);
            if (obj == aVar) {
                return aVar;
            }
        }
        v0 v0Var = (v0) obj;
        if (v0Var.f29302a.isSuccessful() && (baseResponseDto = (BaseResponseDto) v0Var.f29303b) != null && (portfoliosDto = (PortfoliosDto) baseResponseDto.getData()) != null) {
            PortfolioSectionDto modelPortfoliosSection = portfoliosDto.getModelPortfoliosSection();
            if (modelPortfoliosSection != null && (portfolios2 = modelPortfoliosSection.getPortfolios()) != null) {
                Iterator<T> it = portfolios2.iterator();
                while (it.hasNext()) {
                    ((Portfolio) it.next()).setModelPortfolio(true);
                }
            }
            PortfolioSectionDto leaguePortfoliosSection = portfoliosDto.getLeaguePortfoliosSection();
            if (leaguePortfoliosSection != null && (portfolios = leaguePortfoliosSection.getPortfolios()) != null) {
                Iterator<T> it2 = portfolios.iterator();
                while (it2.hasNext()) {
                    ((Portfolio) it2.next()).setModelPortfolio(false);
                }
            }
            PortfolioSectionDto[] elements = {portfoliosDto.getModelPortfoliosSection(), portfoliosDto.getLeaguePortfoliosSection()};
            Intrinsics.checkNotNullParameter(elements, "elements");
            ArrayList p10 = v.p(elements);
            ArrayList arrayList = new ArrayList();
            Iterator it3 = p10.iterator();
            while (it3.hasNext()) {
                Object next = it3.next();
                List<Portfolio> portfolios3 = ((PortfolioSectionDto) next).getPortfolios();
                if (portfolios3 != null && !portfolios3.isEmpty()) {
                    arrayList.add(next);
                }
            }
            Iterator it4 = arrayList.iterator();
            while (it4.hasNext()) {
                List<Portfolio> portfolios4 = ((PortfolioSectionDto) it4.next()).getPortfolios();
                if (portfolios4 != null) {
                    Iterator<T> it5 = portfolios4.iterator();
                    while (true) {
                        if (it5.hasNext()) {
                            obj2 = it5.next();
                            if (Intrinsics.a(((Portfolio) obj2).getPortfolioId(), portfolioDetailViewModel.f9782s)) {
                                break;
                            }
                        } else {
                            obj2 = null;
                            break;
                        }
                    }
                    Portfolio portfolio = (Portfolio) obj2;
                    if (portfolio != null) {
                        portfolioDetailViewModel.k(portfolio);
                    }
                }
            }
        }
        portfolioDetailViewModel.f9084g.postValue(Boolean.FALSE);
        return Unit.f23355a;
    }
}
