package ea;

import com.assetgro.stockgro.data.repository.ArenaRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.ui.arena.asset.v2.myleagues.viewmodel.ArenaMyLeaguesViewModel;
import com.assetgro.stockgro.ui.arena.asset.v2.upcoming.viewmodel.ArenaUpcomingViewModel;
import com.assetgro.stockgro.ui.arena.detail.post.LeaguePortfolioViewModel;
import com.assetgro.stockgro.ui.arena.detail.post.leaderboard.LeagueLeaderBoardViewModel;
import com.assetgro.stockgro.ui.arena.detail.post.leaderboard.winner.LeagueWinnerViewModel;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class n extends iu.k implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15233a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ pj.a f15234b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ct.a f15235c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ArenaRepository f15236d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ UserRepository f15237e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(ArenaRepository arenaRepository, UserRepository userRepository, kq.e eVar, ct.a aVar) {
        super(0);
        this.f15233a = 0;
        this.f15234b = eVar;
        this.f15235c = aVar;
        this.f15237e = userRepository;
        this.f15236d = arenaRepository;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo2invoke() {
        int i10 = this.f15233a;
        UserRepository userRepository = this.f15237e;
        ArenaRepository arenaRepository = this.f15236d;
        ct.a aVar = this.f15235c;
        pj.a aVar2 = this.f15234b;
        switch (i10) {
            case 0:
                return new LeagueWinnerViewModel(arenaRepository, userRepository, aVar2, aVar);
            case 1:
                return new ArenaMyLeaguesViewModel(arenaRepository, userRepository, aVar2, aVar);
            case 2:
                return new ArenaUpcomingViewModel(arenaRepository, userRepository, aVar2, aVar);
            case 3:
                return new LeagueLeaderBoardViewModel(arenaRepository, userRepository, aVar2, aVar);
            default:
                return new LeaguePortfolioViewModel(arenaRepository, userRepository, aVar2, aVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(kq.e eVar, ct.a aVar, ArenaRepository arenaRepository, UserRepository userRepository, int i10) {
        super(0);
        this.f15233a = i10;
        this.f15234b = eVar;
        this.f15235c = aVar;
        this.f15236d = arenaRepository;
        this.f15237e = userRepository;
    }
}
