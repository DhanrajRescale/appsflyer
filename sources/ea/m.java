package ea;

import com.assetgro.stockgro.data.repository.PortfolioRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.ui.base.BaseViewModel;
import com.assetgro.stockgro.ui.portfolio.PortfolioViewModel;
import com.assetgro.stockgro.ui.portfolio.history.PortfolioFnoHistoryViewModel;
import com.assetgro.stockgro.ui.portfolio.history.PortfolioHistoryViewModel;
import com.assetgro.stockgro.ui.portfolio.holdings.PortfolioFnoHoldingsViewModel;
import com.assetgro.stockgro.ui.portfolio.holdings.PortfolioHoldingsViewModel;
import com.assetgro.stockgro.ui.portfolio.orders.PortfolioFnoOrdersViewModel;
import com.assetgro.stockgro.ui.portfolio.orders.PortfolioOrdersViewModel;
import com.assetgro.stockgro.ui.portfolio.unlock.list.UnlockPortfolioListViewModel;
import com.assetgro.stockgro.ui.profile.portfolio.LeaguePortfolioHoldingViewModel;
import com.assetgro.stockgro.ui.profile.portfolio.UserPortfolioDetailsViewModel;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class m extends iu.k implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15223a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ pj.a f15224b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ct.a f15225c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ PortfolioRepository f15226d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ UserRepository f15227e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(pj.a aVar, ct.a aVar2, PortfolioRepository portfolioRepository, UserRepository userRepository, int i10) {
        super(0);
        this.f15223a = i10;
        this.f15224b = aVar;
        this.f15225c = aVar2;
        this.f15226d = portfolioRepository;
        this.f15227e = userRepository;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo2invoke() {
        int i10 = this.f15223a;
        UserRepository userRepository = this.f15227e;
        PortfolioRepository portfolioRepository = this.f15226d;
        ct.a compositeDisposable = this.f15225c;
        pj.a schedulerProvider = this.f15224b;
        switch (i10) {
            case 0:
                return new LeaguePortfolioHoldingViewModel(schedulerProvider, compositeDisposable, portfolioRepository, userRepository);
            case 1:
                Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
                Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
                Intrinsics.checkNotNullParameter(portfolioRepository, "portfolioRepository");
                Intrinsics.checkNotNullParameter(userRepository, "userRepository");
                return new BaseViewModel(schedulerProvider, compositeDisposable, userRepository);
            case 2:
                return new PortfolioFnoHistoryViewModel(schedulerProvider, compositeDisposable, portfolioRepository, userRepository);
            case 3:
                return new PortfolioFnoHoldingsViewModel(schedulerProvider, compositeDisposable, portfolioRepository, userRepository);
            case 4:
                return new PortfolioFnoOrdersViewModel(schedulerProvider, compositeDisposable, portfolioRepository, userRepository);
            case 5:
                return new PortfolioHistoryViewModel(schedulerProvider, compositeDisposable, portfolioRepository, userRepository);
            case 6:
                return new PortfolioHoldingsViewModel(schedulerProvider, compositeDisposable, portfolioRepository, userRepository);
            case 7:
                return new PortfolioViewModel(schedulerProvider, compositeDisposable, portfolioRepository, userRepository);
            case 8:
                return new PortfolioOrdersViewModel(schedulerProvider, compositeDisposable, portfolioRepository, userRepository);
            case 9:
                return new UnlockPortfolioListViewModel(schedulerProvider, compositeDisposable, portfolioRepository, userRepository);
            default:
                return new UserPortfolioDetailsViewModel(schedulerProvider, compositeDisposable, portfolioRepository, userRepository);
        }
    }
}
