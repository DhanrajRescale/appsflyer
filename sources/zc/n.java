package zc;

import com.assetgro.stockgro.data.model.LeaderBoard;
import com.assetgro.stockgro.data.model.LeaderBoardUserDto;
import com.assetgro.stockgro.data.model.TopLeaguesDto;
import com.assetgro.stockgro.ui.arena.detail.post.leaderboard.LeagueLeaderBoardViewModel;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import vt.i0;
import vt.y;

/* loaded from: classes.dex */
public final class n extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42398a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LeagueLeaderBoardViewModel f42399b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(LeagueLeaderBoardViewModel leagueLeaderBoardViewModel, int i10) {
        super(1);
        this.f42398a = i10;
        this.f42399b = leagueLeaderBoardViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        LeaderBoardUserDto self;
        int i10 = this.f42398a;
        LeagueLeaderBoardViewModel leagueLeaderBoardViewModel = this.f42399b;
        switch (i10) {
            case 0:
                LeaderBoard leaderBoard = (LeaderBoard) obj;
                if (leaderBoard != null && (self = leaderBoard.getSelf()) != null) {
                    return y.c(self);
                }
                return new ArrayList();
            case 1:
                leagueLeaderBoardViewModel.f9084g.postValue(Boolean.FALSE);
                ((Throwable) obj).printStackTrace();
                return Unit.f23355a;
            case 2:
                TopLeaguesDto topLeaguesDto = (TopLeaguesDto) obj;
                if (topLeaguesDto.getWinners().size() > 3 && topLeaguesDto.getTotalPages() > 1) {
                    leagueLeaderBoardViewModel.B.postValue(new kj.j(Boolean.TRUE));
                    return topLeaguesDto.getWinners().subList(3, Math.min(topLeaguesDto.getWinners().size(), 100));
                }
                if (topLeaguesDto.getWinners().size() > 3 && topLeaguesDto.getTotalPages() <= 1) {
                    leagueLeaderBoardViewModel.B.postValue(new kj.j(Boolean.FALSE));
                    return topLeaguesDto.getWinners().subList(3, topLeaguesDto.getWinners().size());
                }
                return i0.f38321a;
            case 3:
                LeagueLeaderBoardViewModel.h(leagueLeaderBoardViewModel);
                return Unit.f23355a;
            default:
                LeagueLeaderBoardViewModel.h(leagueLeaderBoardViewModel);
                return Unit.f23355a;
        }
    }
}
