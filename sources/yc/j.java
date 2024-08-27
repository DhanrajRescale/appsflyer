package yc;

import com.assetgro.stockgro.data.model.LeagueUnifiedResponseDto;
import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.data.repository.ArenaRepository;
import com.assetgro.stockgro.ui.arena.detail.post.LeaguePortfolioViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import nv.v0;
import qu.f0;
import ut.n;

/* loaded from: classes.dex */
public final class j extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f41515a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LeaguePortfolioViewModel f41516b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(LeaguePortfolioViewModel leaguePortfolioViewModel, yt.a aVar) {
        super(2, aVar);
        this.f41516b = leaguePortfolioViewModel;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new j(this.f41516b, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((j) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f41515a;
        LeaguePortfolioViewModel leaguePortfolioViewModel = this.f41516b;
        if (i10 != 0) {
            if (i10 == 1) {
                n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            n.b(obj);
            ArenaRepository arenaRepository = leaguePortfolioViewModel.f8999n;
            String str = leaguePortfolioViewModel.B;
            if (str != null) {
                String str2 = leaguePortfolioViewModel.f9001p;
                Intrinsics.c(str2);
                String str3 = leaguePortfolioViewModel.f9002q;
                this.f41515a = 1;
                obj = arenaRepository.getUnifiedLeaguePortfolioData(str, str2, str3, false, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                Intrinsics.k("leagueAssetClass");
                throw null;
            }
        }
        leaguePortfolioViewModel.f9084g.postValue(Boolean.FALSE);
        BaseResponseDto baseResponseDto = (BaseResponseDto) ((v0) obj).f29303b;
        if (baseResponseDto != null) {
            leaguePortfolioViewModel.f9005t.postValue(Boolean.TRUE);
            LeagueUnifiedResponseDto leagueUnifiedResponseDto = (LeagueUnifiedResponseDto) baseResponseDto.getData();
            if (leagueUnifiedResponseDto != null) {
                leaguePortfolioViewModel.f9007v.postValue(leagueUnifiedResponseDto);
            }
            LeagueUnifiedResponseDto leagueUnifiedResponseDto2 = (LeagueUnifiedResponseDto) baseResponseDto.getData();
            if (leagueUnifiedResponseDto2 != null) {
                leaguePortfolioViewModel.f9006u.postValue(leagueUnifiedResponseDto2.getPortfolio());
                leaguePortfolioViewModel.f9003r = leagueUnifiedResponseDto2.getPortfolio();
            }
        }
        return Unit.f23355a;
    }
}
