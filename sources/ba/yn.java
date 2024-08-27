package ba;

import android.view.View;
import android.widget.ProgressBar;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager2.widget.ViewPager2;
import com.assetgro.stockgro.widget.MarketAssetToolbarView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.tabs.TabLayout;

/* loaded from: classes.dex */
public abstract class yn extends m4.m {

    /* renamed from: s, reason: collision with root package name */
    public final MaterialButton f6754s;

    /* renamed from: t, reason: collision with root package name */
    public final ProgressBar f6755t;

    /* renamed from: u, reason: collision with root package name */
    public final MaterialButton f6756u;

    /* renamed from: v, reason: collision with root package name */
    public final ViewPager2 f6757v;

    /* renamed from: w, reason: collision with root package name */
    public final MarketAssetToolbarView f6758w;

    /* renamed from: x, reason: collision with root package name */
    public final TabLayout f6759x;

    /* renamed from: y, reason: collision with root package name */
    public final Toolbar f6760y;

    public yn(Object obj, View view, MaterialButton materialButton, ProgressBar progressBar, MaterialButton materialButton2, ViewPager2 viewPager2, MarketAssetToolbarView marketAssetToolbarView, TabLayout tabLayout, Toolbar toolbar) {
        super(obj, view, 0);
        this.f6754s = materialButton;
        this.f6755t = progressBar;
        this.f6756u = materialButton2;
        this.f6757v = viewPager2;
        this.f6758w = marketAssetToolbarView;
        this.f6759x = tabLayout;
        this.f6760y = toolbar;
    }
}
