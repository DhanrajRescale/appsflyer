package tg;

import com.assetgro.stockgro.data.model.portfolio.holdings.Portfolio;
import com.assetgro.stockgro.ui.portfolio.orders.PortfolioFnoOrdersViewModel;
import com.assetgro.stockgro.ui.portfolio.orders.model.PortfolioPendingOrderCancelRequest;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class g extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36053a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f36054b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(h hVar, int i10) {
        super(2);
        this.f36053a = i10;
        this.f36054b = hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        String str;
        boolean z10;
        int i10 = this.f36053a;
        h hVar = this.f36054b;
        switch (i10) {
            case 0:
                String type = (String) obj;
                String orderIdValue = (String) obj2;
                Intrinsics.checkNotNullParameter(type, "type");
                Intrinsics.checkNotNullParameter(orderIdValue, "orderIdValue");
                Portfolio portfolio = ((PortfolioFnoOrdersViewModel) hVar.r()).f9909o;
                if (portfolio == null || (str = portfolio.getPortfolioId()) == null) {
                    str = HttpUrl.FRAGMENT_ENCODE_SET;
                }
                Portfolio portfolio2 = ((PortfolioFnoOrdersViewModel) hVar.r()).f9909o;
                if (portfolio2 != null) {
                    z10 = portfolio2.isModelPortfolio();
                } else {
                    z10 = true;
                }
                PortfolioPendingOrderCancelRequest portfolioPendingOrderCancelRequest = new PortfolioPendingOrderCancelRequest(orderIdValue, str, z10);
                if (Intrinsics.a(type, "buy")) {
                    ((PortfolioFnoOrdersViewModel) hVar.r()).h("buy", portfolioPendingOrderCancelRequest);
                } else if (Intrinsics.a(type, "sell")) {
                    ((PortfolioFnoOrdersViewModel) hVar.r()).h("sell", portfolioPendingOrderCancelRequest);
                }
                return Unit.f23355a;
            default:
                t0.n nVar = (t0.n) obj;
                if ((((Number) obj2).intValue() & 11) == 2) {
                    t0.r rVar = (t0.r) nVar;
                    if (rVar.G()) {
                        rVar.V();
                        return Unit.f23355a;
                    }
                }
                PortfolioFnoOrdersViewModel portfolioFnoOrdersViewModel = (PortfolioFnoOrdersViewModel) hVar.r();
                t0.r rVar2 = (t0.r) nVar;
                rVar2.b0(1050779990);
                boolean h10 = rVar2.h(hVar);
                Object Q = rVar2.Q();
                to.e eVar = t0.m.f35080a;
                int i11 = 0;
                if (h10 || Q == eVar) {
                    Q = new f(hVar, i11);
                    rVar2.k0(Q);
                }
                Function1 function1 = (Function1) Q;
                rVar2.s(false);
                rVar2.b0(1050795981);
                boolean h11 = rVar2.h(hVar);
                Object Q2 = rVar2.Q();
                if (h11 || Q2 == eVar) {
                    Q2 = new g(hVar, i11);
                    rVar2.k0(Q2);
                }
                rVar2.s(false);
                dp.b.N(portfolioFnoOrdersViewModel, function1, (Function2) Q2, rVar2, 8);
                return Unit.f23355a;
        }
    }
}
