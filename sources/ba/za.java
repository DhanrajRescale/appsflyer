package ba;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.assetgro.stockgro.feature_market.presentation.fno.option.MarketOptionListItemViewModel;
import com.assetgro.stockgro.widget.StockChangeInfoView;

/* loaded from: classes.dex */
public abstract class za extends m4.m {

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ int f6824z = 0;

    /* renamed from: s, reason: collision with root package name */
    public final StockChangeInfoView f6825s;

    /* renamed from: t, reason: collision with root package name */
    public final TextView f6826t;

    /* renamed from: u, reason: collision with root package name */
    public final ImageView f6827u;

    /* renamed from: v, reason: collision with root package name */
    public final TextView f6828v;

    /* renamed from: w, reason: collision with root package name */
    public final TextView f6829w;

    /* renamed from: x, reason: collision with root package name */
    public final TextView f6830x;

    /* renamed from: y, reason: collision with root package name */
    public MarketOptionListItemViewModel f6831y;

    public za(Object obj, View view, StockChangeInfoView stockChangeInfoView, TextView textView, ImageView imageView, TextView textView2, TextView textView3, TextView textView4) {
        super(obj, view, 1);
        this.f6825s = stockChangeInfoView;
        this.f6826t = textView;
        this.f6827u = imageView;
        this.f6828v = textView2;
        this.f6829w = textView3;
        this.f6830x = textView4;
    }
}
