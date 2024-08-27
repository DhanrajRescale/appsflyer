package ba;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.assetgro.stockgro.widget.StockHoldingsPieChartView;
import com.google.android.material.tabs.TabLayout;

/* loaded from: classes.dex */
public abstract class du extends m4.m {
    public final RecyclerView A;

    /* renamed from: s, reason: collision with root package name */
    public final ImageView f4524s;

    /* renamed from: t, reason: collision with root package name */
    public final ImageView f4525t;

    /* renamed from: u, reason: collision with root package name */
    public final ViewPager2 f4526u;

    /* renamed from: v, reason: collision with root package name */
    public final LinearLayout f4527v;

    /* renamed from: w, reason: collision with root package name */
    public final LinearLayout f4528w;

    /* renamed from: x, reason: collision with root package name */
    public final RecyclerView f4529x;

    /* renamed from: y, reason: collision with root package name */
    public final TabLayout f4530y;

    /* renamed from: z, reason: collision with root package name */
    public final StockHoldingsPieChartView f4531z;

    public du(Object obj, View view, ImageView imageView, ImageView imageView2, ViewPager2 viewPager2, LinearLayout linearLayout, LinearLayout linearLayout2, RecyclerView recyclerView, TabLayout tabLayout, StockHoldingsPieChartView stockHoldingsPieChartView, RecyclerView recyclerView2) {
        super(obj, view, 0);
        this.f4524s = imageView;
        this.f4525t = imageView2;
        this.f4526u = viewPager2;
        this.f4527v = linearLayout;
        this.f4528w = linearLayout2;
        this.f4529x = recyclerView;
        this.f4530y = tabLayout;
        this.f4531z = stockHoldingsPieChartView;
        this.A = recyclerView2;
    }
}
