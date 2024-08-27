package cc;

import com.assetgro.stockgro.feature_social.data.remote.ria.RiaProfileResponseDto;
import com.assetgro.stockgro.feature_social.widget.ExpertTradeViewWidget;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import yo.d;
import yo.g;

/* loaded from: classes.dex */
public final class b implements d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ExpertTradeViewWidget f8097a;

    public b(ExpertTradeViewWidget expertTradeViewWidget) {
        this.f8097a = expertTradeViewWidget;
    }

    @Override // yo.c
    public final void a(g gVar) {
    }

    @Override // yo.c
    public final void b(g gVar) {
        List<RiaProfileResponseDto.TradeViewsPerformance.Stocks.Analysis> analysis;
        if (gVar != null) {
            ExpertTradeViewWidget expertTradeViewWidget = this.f8097a;
            RiaProfileResponseDto.TradeViewsPerformance tradeViewsPerformance = expertTradeViewWidget.f8849u;
            if (tradeViewsPerformance != null) {
                RiaProfileResponseDto.TradeViewsPerformance.Stocks stocks = tradeViewsPerformance.getStocks();
                if (stocks != null && (analysis = stocks.getAnalysis()) != null && !analysis.isEmpty()) {
                    expertTradeViewWidget.m(stocks.getAnalysis().get(gVar.f41759h));
                    return;
                }
                return;
            }
            Intrinsics.k("widgetData");
            throw null;
        }
    }

    @Override // yo.c
    public final void c(g gVar) {
    }
}
