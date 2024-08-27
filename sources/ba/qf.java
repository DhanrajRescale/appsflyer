package ba;

import android.view.View;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.tabs.TabLayout;

/* loaded from: classes.dex */
public abstract class qf extends m4.m {

    /* renamed from: s, reason: collision with root package name */
    public final ViewPager2 f5855s;

    /* renamed from: t, reason: collision with root package name */
    public final CollapsingToolbarLayout f5856t;

    /* renamed from: u, reason: collision with root package name */
    public final TabLayout f5857u;

    public qf(Object obj, View view, ViewPager2 viewPager2, CollapsingToolbarLayout collapsingToolbarLayout, TabLayout tabLayout) {
        super(obj, view, 0);
        this.f5855s = viewPager2;
        this.f5856t = collapsingToolbarLayout;
        this.f5857u = tabLayout;
    }
}
