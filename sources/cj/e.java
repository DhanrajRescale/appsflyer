package cj;

import android.content.Intent;
import ba.sn;
import com.assetgro.stockgro.ui.stock.v2.presentation.chart.StockTradingViewFullScreenChartActivity;
import com.github.mikephil.charting.charts.LineChart;
import com.google.android.material.tabs.TabLayout;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zi.q;
import zi.r;

/* loaded from: classes.dex */
public final class e extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8166a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f8167b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(g gVar, int i10) {
        super(1);
        this.f8166a = i10;
        this.f8167b = gVar;
    }

    public final void a(String str) {
        int i10 = this.f8166a;
        g gVar = this.f8167b;
        switch (i10) {
            case 0:
                ((sn) gVar.q()).M.loadUrl(str);
                return;
            default:
                Intent intent = new Intent(gVar.requireContext(), (Class<?>) StockTradingViewFullScreenChartActivity.class);
                intent.putExtra("STOCK_NAME", str);
                gVar.startActivity(intent);
                return;
        }
    }

    public final void d(kj.j jVar) {
        int i10 = this.f8166a;
        g gVar = this.f8167b;
        switch (i10) {
            case 2:
                List<r> list = (List) jVar.a();
                if (list != null) {
                    for (r rVar : list) {
                        TabLayout tabLayout = ((sn) gVar.q()).G;
                        yo.g j10 = tabLayout.j();
                        j10.b(rVar.f42522a);
                        Intrinsics.checkNotNullExpressionValue(j10, "setText(...)");
                        tabLayout.b(j10);
                        if (rVar.f42524c) {
                            j10.a();
                        }
                    }
                    return;
                }
                return;
            case 3:
                List<r> list2 = (List) jVar.a();
                if (list2 != null) {
                    for (r rVar2 : list2) {
                        TabLayout tabLayout2 = ((sn) gVar.q()).B;
                        yo.g j11 = tabLayout2.j();
                        j11.b(rVar2.f42522a);
                        Intrinsics.checkNotNullExpressionValue(j11, "setText(...)");
                        tabLayout2.b(j11);
                        if (rVar2.f42524c) {
                            j11.a();
                        }
                    }
                    return;
                }
                return;
            case 4:
                q qVar = (q) jVar.a();
                if (qVar != null) {
                    LineChart peData = ((sn) gVar.q()).E;
                    Intrinsics.checkNotNullExpressionValue(peData, "peData");
                    el.l.B0(peData, qVar);
                    return;
                }
                return;
            case 5:
                q qVar2 = (q) jVar.a();
                if (qVar2 != null) {
                    LineChart pbData = ((sn) gVar.q()).f6111y;
                    Intrinsics.checkNotNullExpressionValue(pbData, "pbData");
                    el.l.B0(pbData, qVar2);
                    return;
                }
                return;
            default:
                zi.k kVar = (zi.k) jVar.a();
                if (kVar != null) {
                    int i11 = aj.c.f442c;
                    ni.g.c(kVar).show(gVar.getChildFragmentManager(), "MarketSectionTermBottomSheetDialogFragment");
                    return;
                }
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f8166a) {
            case 0:
                a((String) obj);
                return Unit.f23355a;
            case 1:
                a((String) obj);
                return Unit.f23355a;
            case 2:
                d((kj.j) obj);
                return Unit.f23355a;
            case 3:
                d((kj.j) obj);
                return Unit.f23355a;
            case 4:
                d((kj.j) obj);
                return Unit.f23355a;
            case 5:
                d((kj.j) obj);
                return Unit.f23355a;
            default:
                d((kj.j) obj);
                return Unit.f23355a;
        }
    }
}
