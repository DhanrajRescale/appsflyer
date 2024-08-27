package ba;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager2.widget.ViewPager2;
import com.assetgro.stockgro.ui.portfolio.detail.PortfolioDetailViewModel;
import com.assetgro.stockgro.widget.PortfolioCollapsedHeaderView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.tabs.TabLayout;

/* loaded from: classes.dex */
public abstract class b3 extends m4.m {
    public final View A;
    public PortfolioDetailViewModel B;

    /* renamed from: s, reason: collision with root package name */
    public final MaterialButton f4246s;

    /* renamed from: t, reason: collision with root package name */
    public final tv f4247t;

    /* renamed from: u, reason: collision with root package name */
    public final ImageView f4248u;

    /* renamed from: v, reason: collision with root package name */
    public final PortfolioCollapsedHeaderView f4249v;

    /* renamed from: w, reason: collision with root package name */
    public final TabLayout f4250w;

    /* renamed from: x, reason: collision with root package name */
    public final RelativeLayout f4251x;

    /* renamed from: y, reason: collision with root package name */
    public final Toolbar f4252y;

    /* renamed from: z, reason: collision with root package name */
    public final ViewPager2 f4253z;

    public b3(Object obj, View view, MaterialButton materialButton, tv tvVar, ImageView imageView, PortfolioCollapsedHeaderView portfolioCollapsedHeaderView, TabLayout tabLayout, RelativeLayout relativeLayout, Toolbar toolbar, ViewPager2 viewPager2, View view2) {
        super(obj, view, 2);
        this.f4246s = materialButton;
        this.f4247t = tvVar;
        this.f4248u = imageView;
        this.f4249v = portfolioCollapsedHeaderView;
        this.f4250w = tabLayout;
        this.f4251x = relativeLayout;
        this.f4252y = toolbar;
        this.f4253z = viewPager2;
        this.A = view2;
    }
}
