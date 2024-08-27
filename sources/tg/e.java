package tg;

import com.assetgro.stockgro.data.model.portfolio.holdings.Portfolio;
import com.assetgro.stockgro.data.repository.PortfolioRepository;
import com.assetgro.stockgro.ui.portfolio.orders.PortfolioFnoOrdersViewModel;
import com.assetgro.stockgro.ui.portfolio.orders.model.PortfolioFnoOrderResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import nv.v0;
import qu.f0;

/* loaded from: classes.dex */
public final class e extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f36048a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PortfolioFnoOrdersViewModel f36049b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f36050c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(PortfolioFnoOrdersViewModel portfolioFnoOrdersViewModel, String str, yt.a aVar) {
        super(2, aVar);
        this.f36049b = portfolioFnoOrdersViewModel;
        this.f36050c = str;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new e(this.f36049b, this.f36050c, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        String str;
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f36048a;
        PortfolioFnoOrdersViewModel portfolioFnoOrdersViewModel = this.f36049b;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            PortfolioRepository portfolioRepository = portfolioFnoOrdersViewModel.f9908n;
            Portfolio portfolio = portfolioFnoOrdersViewModel.f9909o;
            Boolean bool = null;
            if (portfolio != null) {
                str = portfolio.getPortfolioId();
            } else {
                str = null;
            }
            Portfolio portfolio2 = portfolioFnoOrdersViewModel.f9909o;
            if (portfolio2 != null) {
                bool = Boolean.valueOf(portfolio2.isModelPortfolio());
            }
            this.f36048a = 1;
            obj = portfolioRepository.getFnoPortfolioOrders(str, this.f36050c, bool, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        v0 v0Var = (v0) obj;
        if (v0Var.f29302a.isSuccessful()) {
            portfolioFnoOrdersViewModel.f9084g.setValue(Boolean.FALSE);
            PortfolioFnoOrderResponse portfolioFnoOrderResponse = (PortfolioFnoOrderResponse) v0Var.f29303b;
            if (portfolioFnoOrderResponse != null) {
                portfolioFnoOrdersViewModel.f9910p.postValue(portfolioFnoOrderResponse.getData());
            }
        }
        return Unit.f23355a;
    }
}
