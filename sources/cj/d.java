package cj;

import android.content.Context;
import android.webkit.JavascriptInterface;
import com.assetgro.stockgro.data.AnalyticEvent;
import com.assetgro.stockgro.ui.stock.v2.presentation.chart.StockChartViewModel;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f8165a;

    public d(g gVar, Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f8165a = gVar;
    }

    @JavascriptInterface
    public final void fullScreenTV(boolean z10) {
        AnalyticEvent analyticEvent = new AnalyticEvent("app_market_charts_full_screen", null, 2, null);
        g gVar = this.f8165a;
        gVar.z(analyticEvent);
        StockChartViewModel stockChartViewModel = (StockChartViewModel) gVar.r();
        stockChartViewModel.D.postValue(stockChartViewModel.h());
    }

    @JavascriptInterface
    public final void upgradeStockGroPlus(@NotNull String message, int i10) {
        Intrinsics.checkNotNullParameter(message, "message");
        AnalyticEvent analyticEvent = new AnalyticEvent("app_market_charts_getindicators", null, 2, null);
        g gVar = this.f8165a;
        gVar.y(analyticEvent);
        int i11 = ej.p.f15521j;
        ni.g.f(message, new AnalyticEvent("app_market_charts_getindicators_upgrade", null, 2, null)).show(gVar.getChildFragmentManager(), "SubscribeToAccessBottomSheetDialogFragment");
    }
}
