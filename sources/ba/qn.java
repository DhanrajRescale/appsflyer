package ba;

import android.view.View;
import androidx.viewpager2.widget.ViewPager2;
import com.assetgro.stockgro.ui.stock.v2.presentation.analysis.StockAnalysisViewModel;
import com.google.android.material.tabs.TabLayout;

/* loaded from: classes.dex */
public abstract class qn extends m4.m {

    /* renamed from: s, reason: collision with root package name */
    public final TabLayout f5880s;

    /* renamed from: t, reason: collision with root package name */
    public final ViewPager2 f5881t;

    /* renamed from: u, reason: collision with root package name */
    public StockAnalysisViewModel f5882u;

    public qn(Object obj, View view, TabLayout tabLayout, ViewPager2 viewPager2) {
        super(obj, view, 1);
        this.f5880s = tabLayout;
        this.f5881t = viewPager2;
    }
}
