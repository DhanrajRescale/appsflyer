package vc;

import au.i;
import com.assetgro.stockgro.data.model.LeagueUnifiedResponseDto;
import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.data.repository.ArenaRepository;
import com.assetgro.stockgro.ui.arena.completed.CompletedLeaguePortfolioViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import nv.v0;
import okhttp3.HttpUrl;
import qu.f0;
import ut.n;

/* loaded from: classes.dex */
public final class f extends i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f37954a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CompletedLeaguePortfolioViewModel f37955b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f37956c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(CompletedLeaguePortfolioViewModel completedLeaguePortfolioViewModel, String str, yt.a aVar) {
        super(2, aVar);
        this.f37955b = completedLeaguePortfolioViewModel;
        this.f37956c = str;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new f(this.f37955b, this.f37956c, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        BaseResponseDto baseResponseDto;
        LeagueUnifiedResponseDto leagueUnifiedResponseDto;
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f37954a;
        CompletedLeaguePortfolioViewModel completedLeaguePortfolioViewModel = this.f37955b;
        if (i10 != 0) {
            if (i10 == 1) {
                n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            n.b(obj);
            ArenaRepository arenaRepository = completedLeaguePortfolioViewModel.f8969n;
            String str = this.f37956c;
            String derivedPortfolioId = completedLeaguePortfolioViewModel.h().getDerivedPortfolioId();
            if (derivedPortfolioId == null) {
                derivedPortfolioId = HttpUrl.FRAGMENT_ENCODE_SET;
            }
            String gameId = completedLeaguePortfolioViewModel.h().getGameId();
            this.f37954a = 1;
            obj = arenaRepository.getUnifiedLeaguePortfolioData(str, derivedPortfolioId, gameId, false, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        v0 v0Var = (v0) obj;
        completedLeaguePortfolioViewModel.f9084g.postValue(Boolean.FALSE);
        if (v0Var.f29302a.isSuccessful() && (baseResponseDto = (BaseResponseDto) v0Var.f29303b) != null && (leagueUnifiedResponseDto = (LeagueUnifiedResponseDto) baseResponseDto.getData()) != null) {
            completedLeaguePortfolioViewModel.f8970o.postValue(leagueUnifiedResponseDto.getPortfolio());
        }
        return Unit.f23355a;
    }
}
