package zc;

import com.assetgro.stockgro.data.enums.LeagueStatus;
import com.assetgro.stockgro.data.model.LeaderBoard;
import com.assetgro.stockgro.data.model.LeagueUnifiedResponseDto;
import com.assetgro.stockgro.data.model.arenaV2.ArenaGame;
import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.data.repository.ArenaRepository;
import com.assetgro.stockgro.ui.arena.detail.post.leaderboard.LeagueLeaderBoardViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import nv.v0;
import okhttp3.HttpUrl;
import qu.f0;

/* loaded from: classes.dex */
public final class o extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f42400a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LeagueLeaderBoardViewModel f42401b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArenaGame f42402c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(LeagueLeaderBoardViewModel leagueLeaderBoardViewModel, ArenaGame arenaGame, yt.a aVar) {
        super(2, aVar);
        this.f42401b = leagueLeaderBoardViewModel;
        this.f42402c = arenaGame;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new o(this.f42401b, this.f42402c, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((o) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        LeaderBoard leaderBoard;
        ArenaGame arenaGame = this.f42402c;
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f42400a;
        LeagueLeaderBoardViewModel leagueLeaderBoardViewModel = this.f42401b;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    ut.n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ut.n.b(obj);
                ArenaRepository arenaRepository = leagueLeaderBoardViewModel.f9017n;
                String assetClass = arenaGame.getAssetClass();
                String derivedPortfolioId = arenaGame.getDerivedPortfolioId();
                if (derivedPortfolioId == null) {
                    derivedPortfolioId = HttpUrl.FRAGMENT_ENCODE_SET;
                }
                String gameId = arenaGame.getGameId();
                this.f42400a = 1;
                obj = arenaRepository.getUnifiedLeaguePortfolioData(assetClass, derivedPortfolioId, gameId, false, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            v0 v0Var = (v0) obj;
            if (v0Var.f29302a.isSuccessful()) {
                leagueLeaderBoardViewModel.f9084g.postValue(Boolean.FALSE);
                BaseResponseDto baseResponseDto = (BaseResponseDto) v0Var.f29303b;
                if (baseResponseDto != null) {
                    leagueLeaderBoardViewModel.f9025v.postValue(baseResponseDto.getData());
                    LeagueUnifiedResponseDto leagueUnifiedResponseDto = (LeagueUnifiedResponseDto) baseResponseDto.getData();
                    if (leagueUnifiedResponseDto != null && (leaderBoard = leagueUnifiedResponseDto.getLeaderBoard()) != null) {
                        leagueLeaderBoardViewModel.f9022s.postValue(leaderBoard);
                        if (!leagueLeaderBoardViewModel.R && leagueLeaderBoardViewModel.f9028y == LeagueStatus.LEAGUE_WINNER_NOT_DECLARED) {
                            leagueLeaderBoardViewModel.R = true;
                            leagueLeaderBoardViewModel.S.postValue(Unit.f23355a);
                        }
                    }
                }
            } else {
                leagueLeaderBoardViewModel.f9084g.postValue(Boolean.FALSE);
            }
        } catch (Exception unused) {
            leagueLeaderBoardViewModel.f9084g.postValue(Boolean.FALSE);
        }
        return Unit.f23355a;
    }
}
