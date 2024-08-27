package ba;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.assetgro.stockgro.ui.stock.v2.presentation.analysis.StockAnalysisItemViewModel;
import com.assetgro.stockgro.widget.MarketSlider;

/* loaded from: classes.dex */
public abstract class tc extends m4.m {
    public static final /* synthetic */ int G = 0;
    public final ImageView A;
    public final TextView B;
    public final NestedScrollView C;
    public final ImageView D;
    public final TextView E;
    public StockAnalysisItemViewModel F;

    /* renamed from: s, reason: collision with root package name */
    public final ImageView f6183s;

    /* renamed from: t, reason: collision with root package name */
    public final TextView f6184t;

    /* renamed from: u, reason: collision with root package name */
    public final TextView f6185u;

    /* renamed from: v, reason: collision with root package name */
    public final TextView f6186v;

    /* renamed from: w, reason: collision with root package name */
    public final TextView f6187w;

    /* renamed from: x, reason: collision with root package name */
    public final MarketSlider f6188x;

    /* renamed from: y, reason: collision with root package name */
    public final MarketSlider f6189y;

    /* renamed from: z, reason: collision with root package name */
    public final MarketSlider f6190z;

    public tc(Object obj, View view, ImageView imageView, TextView textView, TextView textView2, TextView textView3, TextView textView4, MarketSlider marketSlider, MarketSlider marketSlider2, MarketSlider marketSlider3, ImageView imageView2, TextView textView5, NestedScrollView nestedScrollView, ImageView imageView3, TextView textView6) {
        super(obj, view, 5);
        this.f6183s = imageView;
        this.f6184t = textView;
        this.f6185u = textView2;
        this.f6186v = textView3;
        this.f6187w = textView4;
        this.f6188x = marketSlider;
        this.f6189y = marketSlider2;
        this.f6190z = marketSlider3;
        this.A = imageView2;
        this.B = textView5;
        this.C = nestedScrollView;
        this.D = imageView3;
        this.E = textView6;
    }
}
