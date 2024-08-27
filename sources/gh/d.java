package gh;

import ba.up;
import c2.p;
import com.assetgro.stockgro.data.model.UnifiedPortfolio;
import com.assetgro.stockgro.data.model.UnifiedStockTransaction;
import com.assetgro.stockgro.data.model.UserReportStatusDto;
import com.assetgro.stockgro.ui.profile.portfolio.UserPortfolioDetailsViewModel;
import iu.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import s0.g;
import um.o;
import vt.c0;
import vt.g0;

/* loaded from: classes.dex */
public final class d extends k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17428a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f17429b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(e eVar, int i10) {
        super(1);
        this.f17428a = i10;
        this.f17429b = eVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10 = this.f17428a;
        e eVar = this.f17429b;
        switch (i10) {
            case 0:
                UnifiedPortfolio portfolio = (UnifiedPortfolio) obj;
                List<UnifiedStockTransaction> stockvalues = portfolio.getStockvalues();
                if (stockvalues != null && !stockvalues.isEmpty()) {
                    ((up) eVar.q()).f6341u.setVisibility(0);
                    ((up) eVar.q()).f6340t.setVisibility(8);
                    UserPortfolioDetailsViewModel userPortfolioDetailsViewModel = (UserPortfolioDetailsViewModel) eVar.r();
                    Intrinsics.checkNotNullParameter(portfolio, "portfolio");
                    userPortfolioDetailsViewModel.f10006p.clear();
                    Iterator<Map.Entry<String, String>> it = portfolio.getPortfolioValue().getPieDistribution().entrySet().iterator();
                    while (true) {
                        boolean hasNext = it.hasNext();
                        float f10 = g.f34069a;
                        if (hasNext) {
                            Map.Entry<String, String> next = it.next();
                            ArrayList arrayList = userPortfolioDetailsViewModel.f10006p;
                            String value = next.getValue();
                            if (value != null && value.length() > 0) {
                                f10 = Float.parseFloat(value);
                            }
                            arrayList.add(new o(f10, next.getKey()));
                        } else {
                            ArrayList arrayList2 = userPortfolioDetailsViewModel.f10006p;
                            if (arrayList2.size() > 1) {
                                c0.l(arrayList2, new p(17));
                            }
                            if (userPortfolioDetailsViewModel.f10006p.size() > 3) {
                                ArrayList arrayList3 = new ArrayList(g0.N(userPortfolioDetailsViewModel.f10006p, 3));
                                userPortfolioDetailsViewModel.f10006p = arrayList3;
                                Iterator it2 = arrayList3.iterator();
                                while (it2.hasNext()) {
                                    f10 += ((o) it2.next()).f37246a;
                                }
                                userPortfolioDetailsViewModel.f10006p.add(new o(100.0f - f10, "Others"));
                            }
                            if (!((UserPortfolioDetailsViewModel) eVar.r()).f10006p.isEmpty()) {
                                ((up) eVar.q()).f6339s.setVisibility(0);
                            } else {
                                ((up) eVar.q()).f6339s.setVisibility(8);
                            }
                            ((up) eVar.q()).f6345y.setPieChart(((UserPortfolioDetailsViewModel) eVar.r()).f10006p);
                            List<UnifiedStockTransaction> stockvalues2 = portfolio.getStockvalues();
                            androidx.lifecycle.o lifecycle = eVar.getLifecycle();
                            Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
                            eVar.f17433i = new xg.b(lifecycle);
                            ((up) eVar.q()).f6344x.setAdapter(eVar.f17433i);
                            xg.b bVar = eVar.f17433i;
                            if (bVar != null) {
                                bVar.u(stockvalues2);
                            }
                        }
                    }
                } else {
                    ((up) eVar.q()).f6341u.setVisibility(8);
                    ((up) eVar.q()).f6340t.setVisibility(0);
                }
                return Unit.f23355a;
            default:
                UserReportStatusDto userReportStatusDto = (UserReportStatusDto) obj;
                if (userReportStatusDto != null) {
                    if (userReportStatusDto.getReportThresholdExceeded() && !eVar.f17431g) {
                        ((up) eVar.q()).f6342v.setVisibility(0);
                        String displayStatus = userReportStatusDto.getDisplayStatus();
                        if (displayStatus != null && displayStatus.length() != 0) {
                            ((up) eVar.q()).f6343w.setText(userReportStatusDto.getDisplayStatus());
                        }
                    } else {
                        ((up) eVar.q()).f6342v.setVisibility(8);
                    }
                }
                return Unit.f23355a;
        }
    }
}
