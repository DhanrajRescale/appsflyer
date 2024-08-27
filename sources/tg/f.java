package tg;

import ba.gm;
import com.assetgro.stockgro.data.model.portfolio.holdings.Portfolio;
import com.assetgro.stockgro.ui.portfolio.orders.PortfolioFnoOrdersViewModel;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class f extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36051a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f36052b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(h hVar, int i10) {
        super(1);
        this.f36051a = i10;
        this.f36052b = hVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String portfolioId;
        int i10 = this.f36051a;
        boolean z10 = true;
        boolean z11 = true;
        h hVar = this.f36052b;
        switch (i10) {
            case 0:
                String orderId = (String) obj;
                Intrinsics.checkNotNullParameter(orderId, "orderId");
                int i11 = ka.i.f22796j;
                Portfolio portfolio = ((PortfolioFnoOrdersViewModel) hVar.r()).f9909o;
                if (portfolio == null || (portfolioId = portfolio.getPortfolioId()) == null) {
                    portfolioId = HttpUrl.FRAGMENT_ENCODE_SET;
                }
                Portfolio portfolio2 = ((PortfolioFnoOrdersViewModel) hVar.r()).f9909o;
                if (portfolio2 != null) {
                    z10 = portfolio2.isModelPortfolio();
                }
                Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
                Intrinsics.checkNotNullParameter(orderId, "orderId");
                ka.i iVar = new ka.i();
                iVar.setArguments(hl.f.y(new Pair("PORTFOLIO_ID", portfolioId), new Pair("ORDERID", orderId), new Pair("IS_MODEL", Boolean.valueOf(z10)), new Pair("CALL_FROM_PORTFOLIO", Boolean.TRUE)));
                iVar.show(hVar.getChildFragmentManager(), "ModifyOrderPageBottomSheetFragment");
                return Unit.f23355a;
            default:
                gm gmVar = (gm) hVar.q();
                g gVar = new g(hVar, z11 ? 1 : 0);
                Object obj2 = b1.d.f3079a;
                gmVar.f4829s.setContent(new b1.c(gVar, true, -1460754528));
                return Unit.f23355a;
        }
    }
}
