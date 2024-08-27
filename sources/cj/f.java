package cj;

import androidx.lifecycle.u0;
import com.assetgro.stockgro.data.WifiService;
import com.assetgro.stockgro.ui.stock.v2.presentation.chart.StockChartViewModel;
import java.util.List;
import kotlin.Unit;
import zi.q;
import zi.r;

/* loaded from: classes.dex */
public final class f implements yo.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8168a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f8169b;

    public /* synthetic */ f(g gVar, int i10) {
        this.f8168a = i10;
        this.f8169b = gVar;
    }

    @Override // yo.c
    public final void a(yo.g gVar) {
    }

    @Override // yo.c
    public final void b(yo.g gVar) {
        List list;
        List list2;
        int i10 = this.f8168a;
        g gVar2 = this.f8169b;
        switch (i10) {
            case 0:
                if (gVar != null) {
                    StockChartViewModel stockChartViewModel = (StockChartViewModel) gVar2.r();
                    int i11 = gVar.f41755d;
                    if (WifiService.INSTANCE.getInstance().isOnline()) {
                        if (i11 == 0 && stockChartViewModel.K) {
                            stockChartViewModel.K = false;
                            return;
                        }
                        kj.j jVar = (kj.j) stockChartViewModel.f10464s.getValue();
                        if (jVar != null && (list = (List) jVar.f23227a) != null) {
                            String str = ((r) list.get(i11)).f42523b;
                            q qVar = (q) stockChartViewModel.H.get(str);
                            if (qVar != null) {
                                stockChartViewModel.f10467v.postValue(new kj.j(qVar));
                                return;
                            }
                            try {
                                yk.g.H(u0.f(stockChartViewModel), null, null, new k(stockChartViewModel, str, null), 3);
                                return;
                            } catch (Exception e10) {
                                e10.printStackTrace();
                                Unit unit = Unit.f23355a;
                                return;
                            }
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                if (gVar != null) {
                    StockChartViewModel stockChartViewModel2 = (StockChartViewModel) gVar2.r();
                    int i12 = gVar.f41755d;
                    if (WifiService.INSTANCE.getInstance().isOnline()) {
                        if (i12 == 0 && stockChartViewModel2.L) {
                            stockChartViewModel2.L = false;
                            return;
                        }
                        kj.j jVar2 = (kj.j) stockChartViewModel2.f10466u.getValue();
                        if (jVar2 != null && (list2 = (List) jVar2.f23227a) != null) {
                            String str2 = ((r) list2.get(i12)).f42523b;
                            q qVar2 = (q) stockChartViewModel2.I.get(str2);
                            if (qVar2 != null) {
                                stockChartViewModel2.f10469x.postValue(new kj.j(qVar2));
                                return;
                            }
                            try {
                                yk.g.H(u0.f(stockChartViewModel2), null, null, new j(stockChartViewModel2, str2, null), 3);
                                return;
                            } catch (Exception e11) {
                                e11.printStackTrace();
                                Unit unit2 = Unit.f23355a;
                                return;
                            }
                        }
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override // yo.c
    public final void c(yo.g gVar) {
    }
}
