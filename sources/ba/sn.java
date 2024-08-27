package ba;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.assetgro.stockgro.ui.stock.v2.presentation.chart.StockChartViewModel;
import com.assetgro.stockgro.widget.DisablePossibleNestedScrollView;
import com.assetgro.stockgro.widget.NestedScrollWebView;
import com.github.mikephil.charting.charts.LineChart;
import com.google.android.material.tabs.TabLayout;

/* loaded from: classes.dex */
public abstract class sn extends m4.m {
    public final ImageView A;
    public final TabLayout B;
    public final ConstraintLayout C;
    public final TextView D;
    public final LineChart E;
    public final ImageView F;
    public final TabLayout G;
    public final ConstraintLayout H;
    public final TextView I;
    public final ImageView J;
    public final DisablePossibleNestedScrollView K;
    public final SwipeRefreshLayout L;
    public final NestedScrollWebView M;
    public StockChartViewModel N;

    /* renamed from: s, reason: collision with root package name */
    public final TextView f6105s;

    /* renamed from: t, reason: collision with root package name */
    public final TextView f6106t;

    /* renamed from: u, reason: collision with root package name */
    public final TextView f6107u;

    /* renamed from: v, reason: collision with root package name */
    public final TextView f6108v;

    /* renamed from: w, reason: collision with root package name */
    public final TextView f6109w;

    /* renamed from: x, reason: collision with root package name */
    public final TextView f6110x;

    /* renamed from: y, reason: collision with root package name */
    public final LineChart f6111y;

    /* renamed from: z, reason: collision with root package name */
    public final Group f6112z;

    public sn(Object obj, View view, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, LineChart lineChart, Group group, ImageView imageView, TabLayout tabLayout, ConstraintLayout constraintLayout, TextView textView7, LineChart lineChart2, ImageView imageView2, TabLayout tabLayout2, ConstraintLayout constraintLayout2, TextView textView8, ImageView imageView3, DisablePossibleNestedScrollView disablePossibleNestedScrollView, SwipeRefreshLayout swipeRefreshLayout, NestedScrollWebView nestedScrollWebView) {
        super(obj, view, 5);
        this.f6105s = textView;
        this.f6106t = textView2;
        this.f6107u = textView3;
        this.f6108v = textView4;
        this.f6109w = textView5;
        this.f6110x = textView6;
        this.f6111y = lineChart;
        this.f6112z = group;
        this.A = imageView;
        this.B = tabLayout;
        this.C = constraintLayout;
        this.D = textView7;
        this.E = lineChart2;
        this.F = imageView2;
        this.G = tabLayout2;
        this.H = constraintLayout2;
        this.I = textView8;
        this.J = imageView3;
        this.K = disablePossibleNestedScrollView;
        this.L = swipeRefreshLayout;
        this.M = nestedScrollWebView;
    }
}
