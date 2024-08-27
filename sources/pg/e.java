package pg;

import com.assetgro.stockgro.ui.portfolio.holdings.PortfolioFnoHoldingsViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class e extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31025a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PortfolioFnoHoldingsViewModel f31026b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f31027c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(PortfolioFnoHoldingsViewModel portfolioFnoHoldingsViewModel, int i10, int i11) {
        super(2);
        this.f31025a = i11;
        this.f31026b = portfolioFnoHoldingsViewModel;
        this.f31027c = i10;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f31027c;
        PortfolioFnoHoldingsViewModel portfolioFnoHoldingsViewModel = this.f31026b;
        int i11 = this.f31025a;
        switch (i11) {
            case 0:
                t0.n nVar = (t0.n) obj;
                ((Number) obj2).intValue();
                switch (i11) {
                    case 0:
                        dp.b.g(portfolioFnoHoldingsViewModel, nVar, t0.t.H0(i10 | 1));
                        break;
                    default:
                        dp.b.v(portfolioFnoHoldingsViewModel, nVar, t0.t.H0(i10 | 1));
                        break;
                }
                return Unit.f23355a;
            default:
                t0.n nVar2 = (t0.n) obj;
                ((Number) obj2).intValue();
                switch (i11) {
                    case 0:
                        dp.b.g(portfolioFnoHoldingsViewModel, nVar2, t0.t.H0(i10 | 1));
                        break;
                    default:
                        dp.b.v(portfolioFnoHoldingsViewModel, nVar2, t0.t.H0(i10 | 1));
                        break;
                }
                return Unit.f23355a;
        }
    }
}
