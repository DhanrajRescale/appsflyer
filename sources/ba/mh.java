package ba;

import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import com.assetgro.stockgro.feature_market.presentation.fno.details.OptionDetailViewModel;
import com.assetgro.stockgro.widget.MarketAssetToolbarView;
import com.assetgro.stockgro.widget.ScrollableRulerViewStopOnLine;
import com.assetgro.stockgro.widget.StockChangeInfoView;
import com.github.mikephil.charting.charts.LineChart;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.chip.ChipGroup;

/* loaded from: classes.dex */
public abstract class mh extends m4.m {
    public final SwitchCompat A;
    public final StockChangeInfoView B;
    public final TextView C;
    public final ChipGroup D;
    public final MarketAssetToolbarView E;
    public final TextView F;
    public final LineChart G;
    public final ChipGroup H;
    public final ProgressBar I;
    public final TextView J;
    public final TextView K;
    public final ImageView L;
    public final NestedScrollView M;
    public final TextView N;
    public final ConstraintLayout O;
    public final TextView P;
    public final TextView Q;
    public final ConstraintLayout R;
    public final TextView S;
    public final ScrollableRulerViewStopOnLine T;
    public final ImageView U;
    public final TextView V;
    public final TextView W;
    public final Toolbar X;
    public OptionDetailViewModel Y;

    /* renamed from: s, reason: collision with root package name */
    public final MaterialButton f5470s;

    /* renamed from: t, reason: collision with root package name */
    public final TextView f5471t;

    /* renamed from: u, reason: collision with root package name */
    public final TextView f5472u;

    /* renamed from: v, reason: collision with root package name */
    public final TextView f5473v;

    /* renamed from: w, reason: collision with root package name */
    public final LineChart f5474w;

    /* renamed from: x, reason: collision with root package name */
    public final ConstraintLayout f5475x;

    /* renamed from: y, reason: collision with root package name */
    public final TextView f5476y;

    /* renamed from: z, reason: collision with root package name */
    public final TextView f5477z;

    public mh(Object obj, View view, MaterialButton materialButton, TextView textView, TextView textView2, TextView textView3, LineChart lineChart, ConstraintLayout constraintLayout, TextView textView4, TextView textView5, SwitchCompat switchCompat, StockChangeInfoView stockChangeInfoView, TextView textView6, ChipGroup chipGroup, MarketAssetToolbarView marketAssetToolbarView, TextView textView7, LineChart lineChart2, ChipGroup chipGroup2, ProgressBar progressBar, TextView textView8, TextView textView9, ImageView imageView, NestedScrollView nestedScrollView, TextView textView10, ConstraintLayout constraintLayout2, TextView textView11, TextView textView12, ConstraintLayout constraintLayout3, TextView textView13, ScrollableRulerViewStopOnLine scrollableRulerViewStopOnLine, ImageView imageView2, TextView textView14, TextView textView15, Toolbar toolbar) {
        super(obj, view, 8);
        this.f5470s = materialButton;
        this.f5471t = textView;
        this.f5472u = textView2;
        this.f5473v = textView3;
        this.f5474w = lineChart;
        this.f5475x = constraintLayout;
        this.f5476y = textView4;
        this.f5477z = textView5;
        this.A = switchCompat;
        this.B = stockChangeInfoView;
        this.C = textView6;
        this.D = chipGroup;
        this.E = marketAssetToolbarView;
        this.F = textView7;
        this.G = lineChart2;
        this.H = chipGroup2;
        this.I = progressBar;
        this.J = textView8;
        this.K = textView9;
        this.L = imageView;
        this.M = nestedScrollView;
        this.N = textView10;
        this.O = constraintLayout2;
        this.P = textView11;
        this.Q = textView12;
        this.R = constraintLayout3;
        this.S = textView13;
        this.T = scrollableRulerViewStopOnLine;
        this.U = imageView2;
        this.V = textView14;
        this.W = textView15;
        this.X = toolbar;
    }
}
