package com.assetgro.stockgro.ui.stock.v2.presentation.chart;

import android.webkit.WebView;
import androidx.lifecycle.h1;
import ba.h4;
import bj.c;
import cj.m;
import cj.n;
import cj.o;
import cj.p;
import com.assetgro.stockgro.data.model.StockDetailDto;
import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.data.repository.StockRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.prod.R;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import ea.v;
import el.l;
import gd.b;
import iu.a0;
import jt.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.s;
import ls.n0;
import nt.f;
import qu.i0;
import ui.a;
import ut.g;
import ut.h;
import ut.i;
import v.e;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0006\u0007B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/assetgro/stockgro/ui/stock/v2/presentation/chart/StockTradingViewFullScreenChartActivity;", "Lgd/b;", "Lcom/assetgro/stockgro/ui/stock/v2/presentation/chart/StockTradingViewFullScreenChartViewModel;", "Lba/h4;", "<init>", "()V", "ni/j", "cj/l", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class StockTradingViewFullScreenChartActivity extends b {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f10472l = 0;

    /* renamed from: k, reason: collision with root package name */
    public final g f10473k;

    public StockTradingViewFullScreenChartActivity() {
        i iVar = i.f37392a;
        this.f10473k = h.b(new ag.b(this, 23));
    }

    @Override // gd.b
    public final int F() {
        return R.layout.activity_stock_trading_view_full_screen_chart;
    }

    @Override // gd.b
    public final void H() {
        super.H();
        ((StockTradingViewFullScreenChartViewModel) x()).f10477q.observe(this, new c(4, new m(this, 0)));
        ((StockTradingViewFullScreenChartViewModel) x()).f10478r.observe(this, new c(4, new m(this, 1)));
    }

    @Override // gd.b
    public final void I() {
        StockTradingViewFullScreenChartViewModel stockTradingViewFullScreenChartViewModel = (StockTradingViewFullScreenChartViewModel) x();
        String stockId = (String) this.f10473k.getValue();
        Intrinsics.checkNotNullExpressionValue(stockId, "<get-stockId>(...)");
        Intrinsics.checkNotNullParameter(stockId, "stockId");
        StringBuilder l10 = e.l("https://app.stockgro.club/ui/market/chart?id=", s.n(stockId, "&", "~", false), ":stock&token=", stockTradingViewFullScreenChartViewModel.f9081d.getUserToken(), "&sessionId=");
        l10.append(stockTradingViewFullScreenChartViewModel.f10475o);
        stockTradingViewFullScreenChartViewModel.f10476p.postValue(l10.toString());
        at.m<BaseResponseDto<StockDetailDto>> stockDetails = stockTradingViewFullScreenChartViewModel.f10474n.getStockDetails(stockId);
        a aVar = new a(25, o.f8186a);
        stockDetails.getClass();
        nt.b bVar = new nt.b(new nt.b(new nt.b(new f(stockDetails, aVar, 1).c(((kq.e) stockTradingViewFullScreenChartViewModel.f9079b).J()), new a(26, new p(stockTradingViewFullScreenChartViewModel, 0)), 1), new a(27, new p(stockTradingViewFullScreenChartViewModel, 1)), 2), new a(28, new p(stockTradingViewFullScreenChartViewModel, 2)), 0);
        d dVar = new d(new a(29, new p(stockTradingViewFullScreenChartViewModel, 3)), new n(0, new p(stockTradingViewFullScreenChartViewModel, 4)));
        bVar.a(dVar);
        Intrinsics.checkNotNullExpressionValue(dVar, "subscribe(...)");
        stockTradingViewFullScreenChartViewModel.f9080c.e(dVar);
        ((h4) w()).f4891t.setNavigationOnClickListener(new ph.a(this, 13));
        WebView webView = ((h4) w()).f4892u;
        Intrinsics.c(webView);
        l.q(webView, this);
        webView.addJavascriptInterface(new cj.l(this, this), "ApplicationBridge");
    }

    @Override // gd.b
    public final void z(da.a activityComponent) {
        Intrinsics.checkNotNullParameter(activityComponent, "activityComponent");
        v vVar = (v) activityComponent.f14247b;
        kq.e k10 = activityComponent.f14246a.k();
        ct.a compositeDisposable = activityComponent.f14246a.c();
        StockRepository stockRepository = activityComponent.f14246a.l();
        yk.g.i(stockRepository);
        UserRepository userRepository = com.google.android.gms.internal.p002firebaseauthapi.a.f(activityComponent.f14246a, vVar, k10, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(stockRepository, "stockRepository");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        ca.c factory = new ca.c(a0.a(StockTradingViewFullScreenChartViewModel.class), new ea.a(k10, compositeDisposable, stockRepository, userRepository, 0));
        b bVar = vVar.f15290a;
        h1 c10 = com.google.android.gms.internal.p002firebaseauthapi.a.c(bVar, "owner", factory, "factory");
        y4.c defaultCreationExtras = com.google.android.gms.internal.p002firebaseauthapi.a.m(bVar, "owner", c10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h10 = com.google.android.gms.internal.p002firebaseauthapi.a.h(c10, factory, defaultCreationExtras, StockTradingViewFullScreenChartViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(StockTradingViewFullScreenChartViewModel.class, "<this>", StockTradingViewFullScreenChartViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            StockTradingViewFullScreenChartViewModel stockTradingViewFullScreenChartViewModel = (StockTradingViewFullScreenChartViewModel) h10.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            yk.g.j(stockTradingViewFullScreenChartViewModel);
            this.f17254b = stockTradingViewFullScreenChartViewModel;
            FirebaseAnalytics d10 = activityComponent.f14246a.d();
            yk.g.i(d10);
            this.f17256d = d10;
            Analytics o10 = activityComponent.f14246a.o();
            yk.g.i(o10);
            this.f17257e = o10;
            n0 h11 = activityComponent.f14246a.h();
            yk.g.i(h11);
            this.f17258f = h11;
            return;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
    }
}
