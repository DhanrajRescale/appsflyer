package cj;

import android.content.Context;
import android.webkit.JavascriptInterface;
import com.assetgro.stockgro.data.AnalyticEvent;
import com.assetgro.stockgro.ui.stock.v2.presentation.chart.StockTradingViewFullScreenChartActivity;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ StockTradingViewFullScreenChartActivity f8181a;

    public l(StockTradingViewFullScreenChartActivity stockTradingViewFullScreenChartActivity, Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f8181a = stockTradingViewFullScreenChartActivity;
    }

    @JavascriptInterface
    public final void fullScreenTV(boolean z10) {
        this.f8181a.finish();
    }

    @JavascriptInterface
    public final void upgradeStockGroPlus(@NotNull String message, int i10) {
        Intrinsics.checkNotNullParameter(message, "message");
        AnalyticEvent analyticEvent = new AnalyticEvent("app_market_charts_getindicators", null, 2, null);
        StockTradingViewFullScreenChartActivity stockTradingViewFullScreenChartActivity = this.f8181a;
        stockTradingViewFullScreenChartActivity.B(analyticEvent);
        int i11 = ej.p.f15521j;
        ni.g.f(message, new AnalyticEvent("app_market_charts_getindicators_upgrade", null, 2, null)).show(stockTradingViewFullScreenChartActivity.getSupportFragmentManager(), "SubscribeToAccessBottomSheetDialogFragment");
    }
}
