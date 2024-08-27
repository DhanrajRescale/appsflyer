package pg;

import com.assetgro.stockgro.feature_market.data.remote.FnoPortfolioHolding;
import com.assetgro.stockgro.feature_market.data.remote.Value;
import com.assetgro.stockgro.ui.portfolio.holdings.PortfolioFnoHoldingsViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import qu.f0;
import t0.l3;
import vt.c0;
import vt.g0;

/* loaded from: classes.dex */
public final class p extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PortfolioFnoHoldingsViewModel f31075a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l3 f31076b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(PortfolioFnoHoldingsViewModel portfolioFnoHoldingsViewModel, l3 l3Var, yt.a aVar) {
        super(2, aVar);
        this.f31075a = portfolioFnoHoldingsViewModel;
        this.f31076b = l3Var;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new p(this.f31075a, this.f31076b, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((p) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        Map<String, String> map;
        Value value;
        Map<String, String> pieDistribution;
        float f10;
        Value value2;
        zt.a aVar = zt.a.f42823a;
        ut.n.b(obj);
        l3 l3Var = this.f31076b;
        FnoPortfolioHolding fnoPortfolioHolding = (FnoPortfolioHolding) l3Var.getValue();
        PortfolioFnoHoldingsViewModel portfolioFnoHoldingsViewModel = this.f31075a;
        portfolioFnoHoldingsViewModel.f9826o.clear();
        if (fnoPortfolioHolding != null && (value2 = fnoPortfolioHolding.getValue()) != null) {
            map = value2.getPieDistribution();
        } else {
            map = null;
        }
        if (map != null && !map.isEmpty()) {
            Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                f10 = s0.g.f34069a;
                if (!hasNext) {
                    break;
                }
                Map.Entry<String, String> next = it.next();
                ArrayList arrayList = portfolioFnoHoldingsViewModel.f9826o;
                String value3 = next.getValue();
                if (value3 != null && value3.length() > 0) {
                    f10 = Float.parseFloat(value3);
                }
                arrayList.add(new um.o(f10, next.getKey()));
            }
            ArrayList arrayList2 = portfolioFnoHoldingsViewModel.f9826o;
            if (arrayList2.size() > 1) {
                c0.l(arrayList2, new c2.p(7));
            }
            if (portfolioFnoHoldingsViewModel.f9826o.size() > 3) {
                ArrayList arrayList3 = new ArrayList(g0.N(portfolioFnoHoldingsViewModel.f9826o, 3));
                portfolioFnoHoldingsViewModel.f9826o = arrayList3;
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    f10 += ((um.o) it2.next()).f37246a;
                }
                portfolioFnoHoldingsViewModel.f9826o.add(new um.o(100.0f - f10, "Others"));
            }
        }
        FnoPortfolioHolding fnoPortfolioHolding2 = (FnoPortfolioHolding) l3Var.getValue();
        if (fnoPortfolioHolding2 != null && (value = fnoPortfolioHolding2.getValue()) != null && (pieDistribution = value.getPieDistribution()) != null && (!pieDistribution.isEmpty())) {
            for (Map.Entry<String, String> entry : pieDistribution.entrySet()) {
                if (!portfolioFnoHoldingsViewModel.f9828q.contains(entry.getKey())) {
                    portfolioFnoHoldingsViewModel.f9828q.add(entry.getKey());
                }
            }
        }
        return Unit.f23355a;
    }
}
