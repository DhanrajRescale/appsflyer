package ba;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.assetgro.stockgro.widget.StockHoldingsPieChartView;

/* loaded from: classes.dex */
public abstract class up extends m4.m {

    /* renamed from: s, reason: collision with root package name */
    public final CardView f6339s;

    /* renamed from: t, reason: collision with root package name */
    public final LinearLayout f6340t;

    /* renamed from: u, reason: collision with root package name */
    public final LinearLayout f6341u;

    /* renamed from: v, reason: collision with root package name */
    public final LinearLayout f6342v;

    /* renamed from: w, reason: collision with root package name */
    public final TextView f6343w;

    /* renamed from: x, reason: collision with root package name */
    public final RecyclerView f6344x;

    /* renamed from: y, reason: collision with root package name */
    public final StockHoldingsPieChartView f6345y;

    public up(Object obj, View view, CardView cardView, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, TextView textView, RecyclerView recyclerView, StockHoldingsPieChartView stockHoldingsPieChartView) {
        super(obj, view, 0);
        this.f6339s = cardView;
        this.f6340t = linearLayout;
        this.f6341u = linearLayout2;
        this.f6342v = linearLayout3;
        this.f6343w = textView;
        this.f6344x = recyclerView;
        this.f6345y = stockHoldingsPieChartView;
    }
}
