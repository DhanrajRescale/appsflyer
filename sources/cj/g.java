package cj;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import androidx.fragment.app.g0;
import androidx.lifecycle.e0;
import androidx.lifecycle.h1;
import androidx.lifecycle.u0;
import ba.sn;
import ba.tn;
import com.assetgro.stockgro.data.WifiService;
import com.assetgro.stockgro.data.repository.StockRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.stock.detail.StockDetailFragment;
import com.assetgro.stockgro.ui.stock.v2.presentation.chart.StockChartViewModel;
import com.assetgro.stockgro.widget.NestedScrollWebView;
import com.github.mikephil.charting.charts.LineChart;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import ea.n0;
import iu.a0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.s;
import okhttp3.HttpUrl;
import qu.i0;
import vt.y;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0006\u0007B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcj/g;", "Lgd/m;", "Lcom/assetgro/stockgro/ui/stock/v2/presentation/chart/StockChartViewModel;", "Lba/sn;", "<init>", "()V", "ni/g", "cj/d", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class g extends gd.m<StockChartViewModel, sn> {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f8170h = 0;

    /* renamed from: g, reason: collision with root package name */
    public final ut.g f8171g;

    public g() {
        ut.i iVar = ut.i.f37392a;
        this.f8171g = ut.h.b(new ag.b(this, 22));
    }

    public static void H(LineChart lineChart) {
        lineChart.setBackgroundColor(-1);
        lineChart.getDescription().f36180a = false;
        lineChart.setDragEnabled(true);
        lineChart.getLegend().f36180a = false;
        lineChart.getAxisRight().f36180a = false;
        lineChart.getAxisLeft().f36180a = true;
        lineChart.setNoDataTextColor(r3.k.getColor(lineChart.getContext(), R.color.white));
        lineChart.setTouchEnabled(true);
        lineChart.setDrawGridBackground(false);
        lineChart.setScaleEnabled(true);
        lineChart.setNoDataText(HttpUrl.FRAGMENT_ENCODE_SET);
        lineChart.setExtraLeftOffset(s0.g.f34069a);
        lineChart.setExtraTopOffset(s0.g.f34069a);
        lineChart.setExtraRightOffset(16.0f);
        lineChart.setExtraBottomOffset(16.0f);
        lineChart.getXAxis().I = 2;
    }

    @Override // gd.m
    public final int C() {
        return R.layout.fragment_stock_charts;
    }

    @Override // gd.m
    public final void D() {
        super.D();
        ((StockChartViewModel) r()).C.observe(this, new bj.c(3, new e(this, 0)));
        ((StockChartViewModel) r()).E.observe(this, new bj.c(3, new e(this, 1)));
        ((StockChartViewModel) r()).f10464s.observe(this, new bj.c(3, new e(this, 2)));
        ((StockChartViewModel) r()).f10466u.observe(this, new bj.c(3, new e(this, 3)));
        ((StockChartViewModel) r()).f10468w.observe(this, new bj.c(3, new e(this, 4)));
        ((StockChartViewModel) r()).f10470y.observe(this, new bj.c(3, new e(this, 5)));
        ((StockChartViewModel) r()).G.observe(this, new bj.c(3, new e(this, 6)));
    }

    @Override // gd.m
    public final void E(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        tn tnVar = (tn) ((sn) q());
        tnVar.N = (StockChartViewModel) r();
        synchronized (tnVar) {
            tnVar.O |= 32;
        }
        tnVar.a(24);
        tnVar.m();
        ((sn) q()).p(this);
        final int i10 = 0;
        ((sn) q()).L.setEnabled(false);
        StockChartViewModel stockChartViewModel = (StockChartViewModel) r();
        String str = (String) this.f8171g.getValue();
        Intrinsics.checkNotNullExpressionValue(str, "<get-stockId>(...)");
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        stockChartViewModel.f10461p = str;
        StockChartViewModel stockChartViewModel2 = (StockChartViewModel) r();
        if (WifiService.INSTANCE.getInstance().isOnline()) {
            try {
                yk.g.H(u0.f(stockChartViewModel2), null, null, new i(stockChartViewModel2, null), 3);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        e0 e0Var = stockChartViewModel2.B;
        String n10 = s.n(stockChartViewModel2.h(), "&", "~", false);
        UserRepository userRepository = stockChartViewModel2.f9081d;
        String userToken = userRepository.getUserToken();
        String countryCode = userRepository.getCountryCode();
        StringBuilder l10 = v.e.l("https://app.stockgro.club/ui/market/chart?id=", n10, ":stock&token=", userToken, "&sessionId=");
        l10.append(stockChartViewModel2.f10460o);
        l10.append("&countryCode=");
        l10.append(countryCode);
        e0Var.postValue(l10.toString());
        NestedScrollWebView nestedScrollWebView = ((sn) q()).M;
        Intrinsics.c(nestedScrollWebView);
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        el.l.q(nestedScrollWebView, requireContext);
        Context requireContext2 = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
        nestedScrollWebView.addJavascriptInterface(new d(this, requireContext2), "ApplicationBridge");
        nestedScrollWebView.setOnTouchListener(new View.OnTouchListener(this) { // from class: cj.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f8162b;

            {
                this.f8162b = this;
            }

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                int i11 = i10;
                g this$0 = this.f8162b;
                switch (i11) {
                    case 0:
                        int i12 = g.f8170h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (motionEvent.getAction() == 0) {
                            g0 parentFragment = this$0.getParentFragment();
                            Intrinsics.d(parentFragment, "null cannot be cast to non-null type com.assetgro.stockgro.ui.stock.detail.StockDetailFragment");
                            ((StockDetailFragment) parentFragment).I(false);
                            ((sn) this$0.q()).K.setScrollingEnabled(false);
                        } else if (motionEvent.getAction() == 1) {
                            g0 parentFragment2 = this$0.getParentFragment();
                            Intrinsics.d(parentFragment2, "null cannot be cast to non-null type com.assetgro.stockgro.ui.stock.detail.StockDetailFragment");
                            ((StockDetailFragment) parentFragment2).I(true);
                            ((sn) this$0.q()).K.setScrollingEnabled(true);
                        }
                        return false;
                    case 1:
                        int i13 = g.f8170h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (motionEvent.getAction() == 0) {
                            g0 parentFragment3 = this$0.getParentFragment();
                            Intrinsics.d(parentFragment3, "null cannot be cast to non-null type com.assetgro.stockgro.ui.stock.detail.StockDetailFragment");
                            ((StockDetailFragment) parentFragment3).I(false);
                            ((sn) this$0.q()).K.setScrollingEnabled(false);
                        } else if (motionEvent.getAction() == 1) {
                            g0 parentFragment4 = this$0.getParentFragment();
                            Intrinsics.d(parentFragment4, "null cannot be cast to non-null type com.assetgro.stockgro.ui.stock.detail.StockDetailFragment");
                            ((StockDetailFragment) parentFragment4).I(true);
                            ((sn) this$0.q()).K.setScrollingEnabled(true);
                        }
                        return false;
                    default:
                        int i14 = g.f8170h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (motionEvent.getAction() == 0) {
                            g0 parentFragment5 = this$0.getParentFragment();
                            Intrinsics.d(parentFragment5, "null cannot be cast to non-null type com.assetgro.stockgro.ui.stock.detail.StockDetailFragment");
                            ((StockDetailFragment) parentFragment5).I(false);
                            ((sn) this$0.q()).K.setScrollingEnabled(false);
                        } else if (motionEvent.getAction() == 1) {
                            g0 parentFragment6 = this$0.getParentFragment();
                            Intrinsics.d(parentFragment6, "null cannot be cast to non-null type com.assetgro.stockgro.ui.stock.detail.StockDetailFragment");
                            ((StockDetailFragment) parentFragment6).I(true);
                            ((sn) this$0.q()).K.setScrollingEnabled(true);
                        }
                        return false;
                }
            }
        });
        LineChart peData = ((sn) q()).E;
        Intrinsics.checkNotNullExpressionValue(peData, "peData");
        H(peData);
        LineChart pbData = ((sn) q()).f6111y;
        Intrinsics.checkNotNullExpressionValue(pbData, "pbData");
        H(pbData);
        ((sn) q()).J.setOnClickListener(new View.OnClickListener(this) { // from class: cj.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f8164b;

            {
                this.f8164b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i11 = i10;
                g this$0 = this.f8164b;
                switch (i11) {
                    case 0:
                        int i12 = g.f8170h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        e0 e0Var2 = ((StockChartViewModel) this$0.r()).F;
                        zi.i iVar = new zi.i("Time frames", "Select a 5 min / 30 min or daily chart or choose from a bunch of other time frames");
                        iVar.f42489c = R.drawable.ic_chart_time_frame;
                        Unit unit = Unit.f23355a;
                        zi.i iVar2 = new zi.i("Chart", "Choose from a range of bars, candles, area chart and switch easily between various charts");
                        iVar2.f42489c = R.drawable.ic_chart_indicator;
                        zi.i iVar3 = new zi.i("Fullscreen", "Expand and access the chart on fullscreen view");
                        iVar3.f42489c = R.drawable.ic_chart_full_screen;
                        zi.i iVar4 = new zi.i("Indicators", "Build and customize strategies using a range of indicators such as MACD, pivot points, Bollinger bands and much more. <b><i>Accessible only for expert and influencer plans</i></b>");
                        iVar4.f42489c = R.drawable.ic_chart_indicator;
                        iVar4.f42490d = true;
                        zi.i iVar5 = new zi.i("Long Press", "Tap and long press to view the gridlines to view the OHLC data in the candlestick view");
                        iVar5.f42489c = R.drawable.ic_chart_long_press;
                        e0Var2.postValue(new kj.j(new zi.k("Price-Volume Chart", y.c(iVar, iVar2, iVar3, iVar4, iVar5))));
                        return;
                    case 1:
                        int i13 = g.f8170h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        ((StockChartViewModel) this$0.r()).F.postValue(new kj.j(new zi.k("PE Chart", y.c(new zi.i(HttpUrl.FRAGMENT_ENCODE_SET, "• Price to Earnings(PE) ratio is the company’s current share price relative to it’s earning per share(EPS)"), new zi.i(HttpUrl.FRAGMENT_ENCODE_SET, "• PE chart plots the Price-Earnings ratio of the stock against a specific time interval (hours, days etc.)"), new zi.i(HttpUrl.FRAGMENT_ENCODE_SET, "• Toggle across various tabs seamlessly for the weekly/monthly/yearly performance of the stock’s PE")))));
                        return;
                    default:
                        int i14 = g.f8170h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        ((StockChartViewModel) this$0.r()).F.postValue(new kj.j(new zi.k("PB Chart", y.c(new zi.i(HttpUrl.FRAGMENT_ENCODE_SET, "• Price to Book (PB) ratio is the company’s current share price relative to it’s book value per share(BVPS)"), new zi.i(HttpUrl.FRAGMENT_ENCODE_SET, "• PB chart plots the Price-Book ratio of the stock against a specific time interval (hours, days etc.)"), new zi.i(HttpUrl.FRAGMENT_ENCODE_SET, "• Toggle across various tabs seamlessly for the weekly/monthly/yearly performance of the stock’s PB")))));
                        return;
                }
            }
        });
        final int i11 = 1;
        ((sn) q()).F.setOnClickListener(new View.OnClickListener(this) { // from class: cj.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f8164b;

            {
                this.f8164b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i112 = i11;
                g this$0 = this.f8164b;
                switch (i112) {
                    case 0:
                        int i12 = g.f8170h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        e0 e0Var2 = ((StockChartViewModel) this$0.r()).F;
                        zi.i iVar = new zi.i("Time frames", "Select a 5 min / 30 min or daily chart or choose from a bunch of other time frames");
                        iVar.f42489c = R.drawable.ic_chart_time_frame;
                        Unit unit = Unit.f23355a;
                        zi.i iVar2 = new zi.i("Chart", "Choose from a range of bars, candles, area chart and switch easily between various charts");
                        iVar2.f42489c = R.drawable.ic_chart_indicator;
                        zi.i iVar3 = new zi.i("Fullscreen", "Expand and access the chart on fullscreen view");
                        iVar3.f42489c = R.drawable.ic_chart_full_screen;
                        zi.i iVar4 = new zi.i("Indicators", "Build and customize strategies using a range of indicators such as MACD, pivot points, Bollinger bands and much more. <b><i>Accessible only for expert and influencer plans</i></b>");
                        iVar4.f42489c = R.drawable.ic_chart_indicator;
                        iVar4.f42490d = true;
                        zi.i iVar5 = new zi.i("Long Press", "Tap and long press to view the gridlines to view the OHLC data in the candlestick view");
                        iVar5.f42489c = R.drawable.ic_chart_long_press;
                        e0Var2.postValue(new kj.j(new zi.k("Price-Volume Chart", y.c(iVar, iVar2, iVar3, iVar4, iVar5))));
                        return;
                    case 1:
                        int i13 = g.f8170h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        ((StockChartViewModel) this$0.r()).F.postValue(new kj.j(new zi.k("PE Chart", y.c(new zi.i(HttpUrl.FRAGMENT_ENCODE_SET, "• Price to Earnings(PE) ratio is the company’s current share price relative to it’s earning per share(EPS)"), new zi.i(HttpUrl.FRAGMENT_ENCODE_SET, "• PE chart plots the Price-Earnings ratio of the stock against a specific time interval (hours, days etc.)"), new zi.i(HttpUrl.FRAGMENT_ENCODE_SET, "• Toggle across various tabs seamlessly for the weekly/monthly/yearly performance of the stock’s PE")))));
                        return;
                    default:
                        int i14 = g.f8170h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        ((StockChartViewModel) this$0.r()).F.postValue(new kj.j(new zi.k("PB Chart", y.c(new zi.i(HttpUrl.FRAGMENT_ENCODE_SET, "• Price to Book (PB) ratio is the company’s current share price relative to it’s book value per share(BVPS)"), new zi.i(HttpUrl.FRAGMENT_ENCODE_SET, "• PB chart plots the Price-Book ratio of the stock against a specific time interval (hours, days etc.)"), new zi.i(HttpUrl.FRAGMENT_ENCODE_SET, "• Toggle across various tabs seamlessly for the weekly/monthly/yearly performance of the stock’s PB")))));
                        return;
                }
            }
        });
        final int i12 = 2;
        ((sn) q()).A.setOnClickListener(new View.OnClickListener(this) { // from class: cj.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f8164b;

            {
                this.f8164b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i112 = i12;
                g this$0 = this.f8164b;
                switch (i112) {
                    case 0:
                        int i122 = g.f8170h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        e0 e0Var2 = ((StockChartViewModel) this$0.r()).F;
                        zi.i iVar = new zi.i("Time frames", "Select a 5 min / 30 min or daily chart or choose from a bunch of other time frames");
                        iVar.f42489c = R.drawable.ic_chart_time_frame;
                        Unit unit = Unit.f23355a;
                        zi.i iVar2 = new zi.i("Chart", "Choose from a range of bars, candles, area chart and switch easily between various charts");
                        iVar2.f42489c = R.drawable.ic_chart_indicator;
                        zi.i iVar3 = new zi.i("Fullscreen", "Expand and access the chart on fullscreen view");
                        iVar3.f42489c = R.drawable.ic_chart_full_screen;
                        zi.i iVar4 = new zi.i("Indicators", "Build and customize strategies using a range of indicators such as MACD, pivot points, Bollinger bands and much more. <b><i>Accessible only for expert and influencer plans</i></b>");
                        iVar4.f42489c = R.drawable.ic_chart_indicator;
                        iVar4.f42490d = true;
                        zi.i iVar5 = new zi.i("Long Press", "Tap and long press to view the gridlines to view the OHLC data in the candlestick view");
                        iVar5.f42489c = R.drawable.ic_chart_long_press;
                        e0Var2.postValue(new kj.j(new zi.k("Price-Volume Chart", y.c(iVar, iVar2, iVar3, iVar4, iVar5))));
                        return;
                    case 1:
                        int i13 = g.f8170h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        ((StockChartViewModel) this$0.r()).F.postValue(new kj.j(new zi.k("PE Chart", y.c(new zi.i(HttpUrl.FRAGMENT_ENCODE_SET, "• Price to Earnings(PE) ratio is the company’s current share price relative to it’s earning per share(EPS)"), new zi.i(HttpUrl.FRAGMENT_ENCODE_SET, "• PE chart plots the Price-Earnings ratio of the stock against a specific time interval (hours, days etc.)"), new zi.i(HttpUrl.FRAGMENT_ENCODE_SET, "• Toggle across various tabs seamlessly for the weekly/monthly/yearly performance of the stock’s PE")))));
                        return;
                    default:
                        int i14 = g.f8170h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        ((StockChartViewModel) this$0.r()).F.postValue(new kj.j(new zi.k("PB Chart", y.c(new zi.i(HttpUrl.FRAGMENT_ENCODE_SET, "• Price to Book (PB) ratio is the company’s current share price relative to it’s book value per share(BVPS)"), new zi.i(HttpUrl.FRAGMENT_ENCODE_SET, "• PB chart plots the Price-Book ratio of the stock against a specific time interval (hours, days etc.)"), new zi.i(HttpUrl.FRAGMENT_ENCODE_SET, "• Toggle across various tabs seamlessly for the weekly/monthly/yearly performance of the stock’s PB")))));
                        return;
                }
            }
        });
        ((sn) q()).E.setOnTouchListener(new View.OnTouchListener(this) { // from class: cj.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f8162b;

            {
                this.f8162b = this;
            }

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                int i112 = i11;
                g this$0 = this.f8162b;
                switch (i112) {
                    case 0:
                        int i122 = g.f8170h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (motionEvent.getAction() == 0) {
                            g0 parentFragment = this$0.getParentFragment();
                            Intrinsics.d(parentFragment, "null cannot be cast to non-null type com.assetgro.stockgro.ui.stock.detail.StockDetailFragment");
                            ((StockDetailFragment) parentFragment).I(false);
                            ((sn) this$0.q()).K.setScrollingEnabled(false);
                        } else if (motionEvent.getAction() == 1) {
                            g0 parentFragment2 = this$0.getParentFragment();
                            Intrinsics.d(parentFragment2, "null cannot be cast to non-null type com.assetgro.stockgro.ui.stock.detail.StockDetailFragment");
                            ((StockDetailFragment) parentFragment2).I(true);
                            ((sn) this$0.q()).K.setScrollingEnabled(true);
                        }
                        return false;
                    case 1:
                        int i13 = g.f8170h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (motionEvent.getAction() == 0) {
                            g0 parentFragment3 = this$0.getParentFragment();
                            Intrinsics.d(parentFragment3, "null cannot be cast to non-null type com.assetgro.stockgro.ui.stock.detail.StockDetailFragment");
                            ((StockDetailFragment) parentFragment3).I(false);
                            ((sn) this$0.q()).K.setScrollingEnabled(false);
                        } else if (motionEvent.getAction() == 1) {
                            g0 parentFragment4 = this$0.getParentFragment();
                            Intrinsics.d(parentFragment4, "null cannot be cast to non-null type com.assetgro.stockgro.ui.stock.detail.StockDetailFragment");
                            ((StockDetailFragment) parentFragment4).I(true);
                            ((sn) this$0.q()).K.setScrollingEnabled(true);
                        }
                        return false;
                    default:
                        int i14 = g.f8170h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (motionEvent.getAction() == 0) {
                            g0 parentFragment5 = this$0.getParentFragment();
                            Intrinsics.d(parentFragment5, "null cannot be cast to non-null type com.assetgro.stockgro.ui.stock.detail.StockDetailFragment");
                            ((StockDetailFragment) parentFragment5).I(false);
                            ((sn) this$0.q()).K.setScrollingEnabled(false);
                        } else if (motionEvent.getAction() == 1) {
                            g0 parentFragment6 = this$0.getParentFragment();
                            Intrinsics.d(parentFragment6, "null cannot be cast to non-null type com.assetgro.stockgro.ui.stock.detail.StockDetailFragment");
                            ((StockDetailFragment) parentFragment6).I(true);
                            ((sn) this$0.q()).K.setScrollingEnabled(true);
                        }
                        return false;
                }
            }
        });
        ((sn) q()).f6111y.setOnTouchListener(new View.OnTouchListener(this) { // from class: cj.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f8162b;

            {
                this.f8162b = this;
            }

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                int i112 = i12;
                g this$0 = this.f8162b;
                switch (i112) {
                    case 0:
                        int i122 = g.f8170h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (motionEvent.getAction() == 0) {
                            g0 parentFragment = this$0.getParentFragment();
                            Intrinsics.d(parentFragment, "null cannot be cast to non-null type com.assetgro.stockgro.ui.stock.detail.StockDetailFragment");
                            ((StockDetailFragment) parentFragment).I(false);
                            ((sn) this$0.q()).K.setScrollingEnabled(false);
                        } else if (motionEvent.getAction() == 1) {
                            g0 parentFragment2 = this$0.getParentFragment();
                            Intrinsics.d(parentFragment2, "null cannot be cast to non-null type com.assetgro.stockgro.ui.stock.detail.StockDetailFragment");
                            ((StockDetailFragment) parentFragment2).I(true);
                            ((sn) this$0.q()).K.setScrollingEnabled(true);
                        }
                        return false;
                    case 1:
                        int i13 = g.f8170h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (motionEvent.getAction() == 0) {
                            g0 parentFragment3 = this$0.getParentFragment();
                            Intrinsics.d(parentFragment3, "null cannot be cast to non-null type com.assetgro.stockgro.ui.stock.detail.StockDetailFragment");
                            ((StockDetailFragment) parentFragment3).I(false);
                            ((sn) this$0.q()).K.setScrollingEnabled(false);
                        } else if (motionEvent.getAction() == 1) {
                            g0 parentFragment4 = this$0.getParentFragment();
                            Intrinsics.d(parentFragment4, "null cannot be cast to non-null type com.assetgro.stockgro.ui.stock.detail.StockDetailFragment");
                            ((StockDetailFragment) parentFragment4).I(true);
                            ((sn) this$0.q()).K.setScrollingEnabled(true);
                        }
                        return false;
                    default:
                        int i14 = g.f8170h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (motionEvent.getAction() == 0) {
                            g0 parentFragment5 = this$0.getParentFragment();
                            Intrinsics.d(parentFragment5, "null cannot be cast to non-null type com.assetgro.stockgro.ui.stock.detail.StockDetailFragment");
                            ((StockDetailFragment) parentFragment5).I(false);
                            ((sn) this$0.q()).K.setScrollingEnabled(false);
                        } else if (motionEvent.getAction() == 1) {
                            g0 parentFragment6 = this$0.getParentFragment();
                            Intrinsics.d(parentFragment6, "null cannot be cast to non-null type com.assetgro.stockgro.ui.stock.detail.StockDetailFragment");
                            ((StockDetailFragment) parentFragment6).I(true);
                            ((sn) this$0.q()).K.setScrollingEnabled(true);
                        }
                        return false;
                }
            }
        });
        ((sn) q()).G.a(new f(this, 0));
        ((sn) q()).B.a(new f(this, 1));
    }

    @Override // gd.m
    public final void w(da.f fragmentComponent) {
        Intrinsics.checkNotNullParameter(fragmentComponent, "fragmentComponent");
        da.b bVar = fragmentComponent.f14279b;
        kq.e k10 = bVar.k();
        ct.a c10 = bVar.c();
        StockRepository stockRepository = bVar.l();
        yk.g.i(stockRepository);
        UserRepository userRepository = bVar.m();
        yk.g.i(userRepository);
        n0 n0Var = fragmentComponent.f14278a;
        com.google.android.gms.internal.p002firebaseauthapi.a.s(n0Var, k10, "schedulerProvider", c10, "compositeDisposable");
        Intrinsics.checkNotNullParameter(stockRepository, "stockRepository");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        ca.c factory = new ca.c(a0.a(StockChartViewModel.class), new ea.a(k10, c10, stockRepository, userRepository, 6));
        gd.m mVar = n0Var.f15238a;
        h1 e10 = com.google.android.gms.internal.p002firebaseauthapi.a.e(mVar, "owner", factory, "factory");
        y4.c defaultCreationExtras = com.google.android.gms.internal.p002firebaseauthapi.a.o(mVar, "owner", e10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h10 = com.google.android.gms.internal.p002firebaseauthapi.a.h(e10, factory, defaultCreationExtras, StockChartViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(StockChartViewModel.class, "<this>", StockChartViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            StockChartViewModel stockChartViewModel = (StockChartViewModel) h10.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            yk.g.j(stockChartViewModel);
            this.f17284b = stockChartViewModel;
            FirebaseAnalytics d10 = bVar.d();
            yk.g.i(d10);
            this.f17285c = d10;
            Analytics o10 = bVar.o();
            yk.g.i(o10);
            this.f17286d = o10;
            ls.n0 h11 = bVar.h();
            yk.g.i(h11);
            this.f17287e = h11;
            return;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
    }
}
