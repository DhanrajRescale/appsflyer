package ba;

import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;

/* loaded from: classes.dex */
public abstract class e4 extends m4.m {

    /* renamed from: s, reason: collision with root package name */
    public final ViewPager2 f4567s;

    /* renamed from: t, reason: collision with root package name */
    public final RecyclerView f4568t;

    /* renamed from: u, reason: collision with root package name */
    public final TabLayout f4569u;

    /* renamed from: v, reason: collision with root package name */
    public final SwipeRefreshLayout f4570v;

    /* renamed from: w, reason: collision with root package name */
    public final Toolbar f4571w;

    public e4(Object obj, View view, ViewPager2 viewPager2, RecyclerView recyclerView, TabLayout tabLayout, SwipeRefreshLayout swipeRefreshLayout, Toolbar toolbar) {
        super(obj, view, 0);
        this.f4567s = viewPager2;
        this.f4568t = recyclerView;
        this.f4569u = tabLayout;
        this.f4570v = swipeRefreshLayout;
        this.f4571w = toolbar;
    }
}
