package ba;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.assetgro.stockgro.feature_market.presentation.market.search.adapter.AdvancedSearchStocksItemViewModel;
import com.assetgro.stockgro.widget.StockChangeInfoView;

/* loaded from: classes.dex */
public abstract class d7 extends m4.m {

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f4451y = 0;

    /* renamed from: s, reason: collision with root package name */
    public final StockChangeInfoView f4452s;

    /* renamed from: t, reason: collision with root package name */
    public final TextView f4453t;

    /* renamed from: u, reason: collision with root package name */
    public final ImageView f4454u;

    /* renamed from: v, reason: collision with root package name */
    public final TextView f4455v;

    /* renamed from: w, reason: collision with root package name */
    public final TextView f4456w;

    /* renamed from: x, reason: collision with root package name */
    public AdvancedSearchStocksItemViewModel f4457x;

    public d7(Object obj, View view, StockChangeInfoView stockChangeInfoView, TextView textView, ImageView imageView, TextView textView2, TextView textView3) {
        super(obj, view, 1);
        this.f4452s = stockChangeInfoView;
        this.f4453t = textView;
        this.f4454u = imageView;
        this.f4455v = textView2;
        this.f4456w = textView3;
    }
}
