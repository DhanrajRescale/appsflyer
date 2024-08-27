package ba;

import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.tabs.TabLayout;

/* loaded from: classes.dex */
public abstract class of extends m4.m {

    /* renamed from: s, reason: collision with root package name */
    public final AppBarLayout f5660s;

    /* renamed from: t, reason: collision with root package name */
    public final ViewPager2 f5661t;

    /* renamed from: u, reason: collision with root package name */
    public final CollapsingToolbarLayout f5662u;

    /* renamed from: v, reason: collision with root package name */
    public final TabLayout f5663v;

    /* renamed from: w, reason: collision with root package name */
    public final Toolbar f5664w;

    public of(Object obj, View view, AppBarLayout appBarLayout, ViewPager2 viewPager2, CollapsingToolbarLayout collapsingToolbarLayout, TabLayout tabLayout, Toolbar toolbar) {
        super(obj, view, 0);
        this.f5660s = appBarLayout;
        this.f5661t = viewPager2;
        this.f5662u = collapsingToolbarLayout;
        this.f5663v = tabLayout;
        this.f5664w = toolbar;
    }
}
