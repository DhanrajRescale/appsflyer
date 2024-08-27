package og;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.d1;
import ba.iv;
import ba.km;
import com.assetgro.stockgro.data.model.UnifiedPortfolio;
import com.assetgro.stockgro.data.model.UnifiedStockTransaction;
import com.assetgro.stockgro.data.model.portfolio.holdings.PeriodicChangeDto;
import com.assetgro.stockgro.data.model.portfolio.holdings.PortfolioPeriodicReturn;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.portfolio.holdings.PortfolioHoldingsViewModel;
import com.assetgro.stockgro.widget.StockChangeInfoView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import vt.c0;
import vt.g0;
import vt.v;

/* loaded from: classes.dex */
public final class n extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30060a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f30061b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(o oVar, int i10) {
        super(1);
        this.f30060a = i10;
        this.f30061b = oVar;
    }

    public final void a(Boolean bool) {
        int i10;
        int i11;
        int i12 = this.f30060a;
        int i13 = 8;
        o oVar = this.f30061b;
        switch (i12) {
            case 0:
                if (Intrinsics.a(bool, Boolean.TRUE)) {
                    ((km) oVar.q()).E.setRefreshing(true);
                    return;
                } else {
                    if (Intrinsics.a(bool, Boolean.FALSE)) {
                        ((km) oVar.q()).E.setRefreshing(false);
                        return;
                    }
                    return;
                }
            case 1:
                ((PortfolioHoldingsViewModel) oVar.r()).f9846z.setValue(bool);
                return;
            case 2:
                ((PortfolioHoldingsViewModel) oVar.r()).j();
                return;
            case 3:
                if (Intrinsics.a(bool, Boolean.TRUE)) {
                    ((km) oVar.q()).f5265w.setVisibility(0);
                    ((km) oVar.q()).f5261s.f6684v.setVisibility(0);
                    ((km) oVar.q()).f5262t.f5179u.setVisibility(8);
                    return;
                } else {
                    if (Intrinsics.a(bool, Boolean.FALSE)) {
                        ((km) oVar.q()).f5265w.setVisibility(8);
                        ((km) oVar.q()).f5261s.f6684v.setVisibility(8);
                        ((km) oVar.q()).f5262t.f5179u.setVisibility(0);
                        return;
                    }
                    return;
                }
            case 4:
                if (Intrinsics.a(bool, Boolean.TRUE)) {
                    ((km) oVar.q()).D.setVisibility(0);
                    return;
                } else {
                    if (Intrinsics.a(bool, Boolean.FALSE)) {
                        ((km) oVar.q()).D.setVisibility(8);
                        return;
                    }
                    return;
                }
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            default:
                ImageView imageView = ((km) oVar.q()).C.f4525t;
                Intrinsics.c(bool);
                if (bool.booleanValue()) {
                    i13 = 0;
                }
                imageView.setVisibility(i13);
                return;
            case 9:
                TextView textView = ((km) oVar.q()).f5263u.f6476w;
                Intrinsics.c(bool);
                if (bool.booleanValue()) {
                    i10 = R.string.realised_profit;
                } else {
                    i10 = R.string.realised_loss;
                }
                textView.setText(oVar.getString(i10));
                return;
            case 11:
                TextView textView2 = ((km) oVar.q()).f5263u.A;
                Intrinsics.c(bool);
                if (bool.booleanValue()) {
                    i11 = R.string.unrealised_profit;
                } else {
                    i11 = R.string.unrealised_loss;
                }
                textView2.setText(oVar.getString(i11));
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:90:0x038f, code lost:
    
        if (((java.lang.Boolean) r2).booleanValue() != false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0391, code lost:
    
        r2 = 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0399, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.a(r17, "Active") != false) goto L78;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 974
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: og.n.d(java.lang.String):void");
    }

    public final void e(List list) {
        int i10 = this.f30060a;
        o oVar = this.f30061b;
        switch (i10) {
            case 14:
                androidx.lifecycle.o lifecycle = oVar.getLifecycle();
                Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
                xg.b bVar = new xg.b(lifecycle);
                bVar.u(list);
                ((km) oVar.q()).C.f4529x.setAdapter(bVar);
                return;
            default:
                if (list != null && !list.isEmpty()) {
                    ((km) oVar.q()).D.setVisibility(0);
                    k kVar = oVar.f30063g;
                    if (kVar != null) {
                        String optionName = ((PortfolioHoldingsViewModel) oVar.r()).f9841u.getOptionName();
                        switch (optionName.hashCode()) {
                            case -1211074094:
                                if (optionName.equals("amount_invested:asc")) {
                                    list = g0.M(list, new c2.p(9));
                                    break;
                                }
                                break;
                            case -226799577:
                                if (optionName.equals("performance:asc")) {
                                    list = g0.M(list, new c2.p(10));
                                    break;
                                }
                                break;
                            case 1111485264:
                                if (optionName.equals("amount_invested:desc")) {
                                    list = g0.M(list, new c2.p(11));
                                    break;
                                }
                                break;
                            case 1559224219:
                                if (optionName.equals("performance:desc")) {
                                    list = g0.M(list, new c2.p(12));
                                    break;
                                }
                                break;
                        }
                        kVar.u(list);
                        return;
                    }
                    Intrinsics.k("portfolioStockHoldingAdapter");
                    throw null;
                }
                ((km) oVar.q()).D.setVisibility(8);
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v27, types: [k7.z0, z7.e, xg.f] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit unit;
        CharSequence charSequence;
        String r10;
        int i10;
        switch (this.f30060a) {
            case 0:
                a((Boolean) obj);
                return Unit.f23355a;
            case 1:
                a((Boolean) obj);
                return Unit.f23355a;
            case 2:
                a((Boolean) obj);
                return Unit.f23355a;
            case 3:
                a((Boolean) obj);
                return Unit.f23355a;
            case 4:
                a((Boolean) obj);
                return Unit.f23355a;
            case 5:
                d((String) obj);
                return Unit.f23355a;
            case 6:
                d((String) obj);
                return Unit.f23355a;
            case 7:
                d((String) obj);
                return Unit.f23355a;
            case 8:
                d((String) obj);
                return Unit.f23355a;
            case 9:
                a((Boolean) obj);
                return Unit.f23355a;
            case 10:
                d((String) obj);
                return Unit.f23355a;
            case 11:
                a((Boolean) obj);
                return Unit.f23355a;
            case 12:
                d((String) obj);
                return Unit.f23355a;
            case 13:
                a((Boolean) obj);
                return Unit.f23355a;
            case 14:
                e((List) obj);
                return Unit.f23355a;
            case 15:
                UnifiedPortfolio portfolio = (UnifiedPortfolio) obj;
                o oVar = this.f30061b;
                View view = ((km) oVar.q()).f5262t.f27491e;
                Intrinsics.checkNotNullExpressionValue(view, "getRoot(...)");
                zq.f.m0(view);
                Intrinsics.c(portfolio);
                List<PortfolioPeriodicReturn> periodicPNL = portfolio.getPortfolioValue().getPeriodicPNL();
                ViewGroup viewGroup = null;
                int i11 = 8;
                if (periodicPNL != null) {
                    if (periodicPNL.isEmpty()) {
                        ((km) oVar.q()).B.f4979s.setVisibility(8);
                    } else {
                        ((km) oVar.q()).B.f4979s.setVisibility(0);
                        ((km) oVar.q()).B.f4980t.removeAllViews();
                        int i12 = 0;
                        for (PortfolioPeriodicReturn portfolioPeriodicReturn : periodicPNL) {
                            int i13 = i12 + 1;
                            View inflate = oVar.getLayoutInflater().inflate(R.layout.cell_market_sentiment, viewGroup);
                            Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
                            ((TextView) inflate.findViewById(R.id.title)).setText(portfolioPeriodicReturn.getPeriodicity());
                            StockChangeInfoView stockChangeInfoView = (StockChangeInfoView) inflate.findViewById(R.id.stock_change_info_view);
                            PeriodicChangeDto change = portfolioPeriodicReturn.getChange();
                            if (change != null) {
                                iv ivVar = stockChangeInfoView.f10740a;
                                TextView textView = ivVar.f5090t;
                                ij.h hVar = ij.h.f20067a;
                                r10 = ij.h.f20067a.r(1, change.getValue());
                                textView.setText(r10);
                                ivVar.f5089s.setText(ij.h.t(String.valueOf(ij.h.c(change.getPercentage()))));
                                if (ij.h.c(change.getPercentage()) == 0.0d) {
                                    i10 = 8;
                                } else {
                                    i10 = 0;
                                }
                                ivVar.f5091u.setVisibility(i10);
                                stockChangeInfoView.b(change.getType());
                            } else {
                                stockChangeInfoView.getClass();
                            }
                            if (periodicPNL.size() - 1 == i12) {
                                inflate.findViewById(R.id.market_sentiment_cell_divider).setVisibility(8);
                            }
                            ((km) oVar.q()).B.f4980t.addView(inflate);
                            i12 = i13;
                            viewGroup = null;
                        }
                    }
                    unit = Unit.f23355a;
                } else {
                    unit = null;
                }
                if (unit == null) {
                    ((km) oVar.q()).B.f4979s.setVisibility(8);
                }
                ((PortfolioHoldingsViewModel) oVar.r()).f9845y.clear();
                List<UnifiedStockTransaction> stockvalues = portfolio.getStockvalues();
                if (stockvalues != null) {
                    ((PortfolioHoldingsViewModel) oVar.r()).f9845y.addAll(stockvalues);
                }
                ((PortfolioHoldingsViewModel) oVar.r()).f9843w.clear();
                ((km) oVar.q()).C.f4530y.l();
                PortfolioHoldingsViewModel portfolioHoldingsViewModel = (PortfolioHoldingsViewModel) oVar.r();
                Intrinsics.checkNotNullParameter(portfolio, "portfolio");
                portfolioHoldingsViewModel.f9838r.clear();
                Map<String, String> pieDistribution = portfolio.getPortfolioValue().getPieDistribution();
                if (!pieDistribution.isEmpty()) {
                    Iterator<Map.Entry<String, String>> it = pieDistribution.entrySet().iterator();
                    while (true) {
                        boolean hasNext = it.hasNext();
                        float f10 = s0.g.f34069a;
                        if (hasNext) {
                            Map.Entry<String, String> next = it.next();
                            ArrayList arrayList = portfolioHoldingsViewModel.f9838r;
                            String value = next.getValue();
                            if (value != null && value.length() > 0) {
                                f10 = Float.parseFloat(value);
                            }
                            arrayList.add(new um.o(f10, next.getKey()));
                        } else {
                            ArrayList arrayList2 = portfolioHoldingsViewModel.f9838r;
                            if (arrayList2.size() > 1) {
                                c0.l(arrayList2, new c2.p(8));
                            }
                            if (portfolioHoldingsViewModel.f9838r.size() > 3) {
                                ArrayList arrayList3 = new ArrayList(g0.N(portfolioHoldingsViewModel.f9838r, 3));
                                portfolioHoldingsViewModel.f9838r = arrayList3;
                                Iterator it2 = arrayList3.iterator();
                                while (it2.hasNext()) {
                                    f10 += ((um.o) it2.next()).f37246a;
                                }
                                portfolioHoldingsViewModel.f9838r.add(new um.o(100.0f - f10, "Others"));
                            }
                        }
                    }
                }
                Map<String, String> pieDistribution2 = portfolio.getPortfolioValue().getPieDistribution();
                if (!pieDistribution2.isEmpty()) {
                    Iterator<Map.Entry<String, String>> it3 = pieDistribution2.entrySet().iterator();
                    while (it3.hasNext()) {
                        ((PortfolioHoldingsViewModel) oVar.r()).f9843w.add(it3.next().getKey());
                        ((km) oVar.q()).C.f4530y.b(((km) oVar.q()).C.f4530y.j());
                    }
                }
                ((km) oVar.q()).C.f4531z.setPieChart(((PortfolioHoldingsViewModel) oVar.r()).f9838r);
                d1 fragmentManager = oVar.getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(fragmentManager, "getChildFragmentManager(...)");
                androidx.lifecycle.o lifecycle = oVar.getLifecycle();
                Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
                oVar.getArguments();
                Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
                Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
                ?? eVar = new z7.e(fragmentManager, lifecycle);
                eVar.f40259m = 1;
                eVar.f40259m = ((PortfolioHoldingsViewModel) oVar.r()).f9843w.size();
                ((km) oVar.q()).C.f4526u.setAdapter(eVar);
                new yo.n(((km) oVar.q()).C.f4530y, ((km) oVar.q()).C.f4526u, new m(oVar)).a();
                new WeakReference(((km) oVar.q()).C.f4530y);
                ((km) oVar.q()).C.f4530y.a(new nc.c(oVar, i11));
                new WeakReference(((km) oVar.q()).C.f4530y);
                int i14 = 2;
                if (((km) oVar.q()).C.f4530y.getTabCount() <= 2) {
                    ((km) oVar.q()).C.f4530y.setTabMode(1);
                } else {
                    ((km) oVar.q()).C.f4530y.setTabMode(0);
                }
                PortfolioHoldingsViewModel portfolioHoldingsViewModel2 = (PortfolioHoldingsViewModel) oVar.r();
                yo.g i15 = ((km) oVar.q()).C.f4530y.i(0);
                if (i15 != null) {
                    charSequence = i15.f41753b;
                } else {
                    charSequence = null;
                }
                portfolioHoldingsViewModel2.h(String.valueOf(charSequence));
                if (portfolio.getStockvalues() != null && (!r3.isEmpty())) {
                    xg.b bVar = oVar.f30064h;
                    if (bVar != null) {
                        bVar.u(((PortfolioHoldingsViewModel) oVar.r()).f9844x);
                    } else {
                        Intrinsics.k("portfolioSectorStocksAdapter");
                        throw null;
                    }
                }
                if (kj.a.f23207b) {
                    ((km) oVar.q()).f5267y.setVisibility(8);
                } else {
                    ((km) oVar.q()).f5267y.setVisibility(0);
                    if (v.o(new String[]{"Inactive"}, portfolio.getPortfolioStatus())) {
                        ((km) oVar.q()).f5268z.setText(oVar.getString(R.string.portfolio_data_disclaimer_two));
                    } else {
                        ((km) oVar.q()).f5268z.setText(oVar.getString(R.string.portfolio_data_disclaimer_one));
                    }
                }
                ((km) oVar.q()).f5267y.setOnClickListener(new l(oVar, i14));
                return Unit.f23355a;
            case 16:
                e((List) obj);
                return Unit.f23355a;
            case 17:
                d((String) obj);
                return Unit.f23355a;
            case 18:
                d((String) obj);
                return Unit.f23355a;
            case 19:
                d((String) obj);
                return Unit.f23355a;
            case 20:
                d((String) obj);
                return Unit.f23355a;
            case 21:
                d((String) obj);
                return Unit.f23355a;
            case 22:
                d((String) obj);
                return Unit.f23355a;
            case 23:
                d((String) obj);
                return Unit.f23355a;
            case 24:
                d((String) obj);
                return Unit.f23355a;
            case 25:
                d((String) obj);
                return Unit.f23355a;
            default:
                d((String) obj);
                return Unit.f23355a;
        }
    }
}
