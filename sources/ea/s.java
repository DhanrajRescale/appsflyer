package ea;

import com.assetgro.stockgro.data.repository.ArenaRepository;
import com.assetgro.stockgro.data.repository.PortfolioRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.ui.arena.completed.CompletedLeaguePortfolioViewModel;
import com.assetgro.stockgro.ui.portfolio.detail.PortfolioDetailViewModel;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class s extends iu.k implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15271a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ pj.a f15272b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ct.a f15273c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ PortfolioRepository f15274d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ArenaRepository f15275e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ UserRepository f15276f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(kq.e eVar, ct.a aVar, PortfolioRepository portfolioRepository, ArenaRepository arenaRepository, UserRepository userRepository, int i10) {
        super(0);
        this.f15271a = i10;
        this.f15272b = eVar;
        this.f15273c = aVar;
        this.f15274d = portfolioRepository;
        this.f15275e = arenaRepository;
        this.f15276f = userRepository;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo2invoke() {
        switch (this.f15271a) {
            case 0:
                return new PortfolioDetailViewModel(this.f15272b, this.f15273c, this.f15274d, this.f15275e, this.f15276f);
            default:
                return new CompletedLeaguePortfolioViewModel(this.f15272b, this.f15273c, this.f15274d, this.f15275e, this.f15276f);
        }
    }
}
