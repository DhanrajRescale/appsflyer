package ba;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.assetgro.stockgro.feature_market.presentation.market.search.adapter.AdvancedSearchOptionsItemViewModel;
import com.assetgro.stockgro.widget.StockChangeInfoView;

/* loaded from: classes.dex */
public abstract class b7 extends m4.m {

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ int f4261z = 0;

    /* renamed from: s, reason: collision with root package name */
    public final StockChangeInfoView f4262s;

    /* renamed from: t, reason: collision with root package name */
    public final TextView f4263t;

    /* renamed from: u, reason: collision with root package name */
    public final ImageView f4264u;

    /* renamed from: v, reason: collision with root package name */
    public final TextView f4265v;

    /* renamed from: w, reason: collision with root package name */
    public final TextView f4266w;

    /* renamed from: x, reason: collision with root package name */
    public final TextView f4267x;

    /* renamed from: y, reason: collision with root package name */
    public AdvancedSearchOptionsItemViewModel f4268y;

    public b7(Object obj, View view, StockChangeInfoView stockChangeInfoView, TextView textView, ImageView imageView, TextView textView2, TextView textView3, TextView textView4) {
        super(obj, view, 1);
        this.f4262s = stockChangeInfoView;
        this.f4263t = textView;
        this.f4264u = imageView;
        this.f4265v = textView2;
        this.f4266w = textView3;
        this.f4267x = textView4;
    }
}
