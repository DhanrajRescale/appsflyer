package ba;

import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;

/* loaded from: classes.dex */
public abstract class h3 extends m4.m {

    /* renamed from: s, reason: collision with root package name */
    public final TabLayout f4887s;

    /* renamed from: t, reason: collision with root package name */
    public final Toolbar f4888t;

    /* renamed from: u, reason: collision with root package name */
    public final ViewPager2 f4889u;

    public h3(Object obj, View view, TabLayout tabLayout, Toolbar toolbar, ViewPager2 viewPager2) {
        super(obj, view, 0);
        this.f4887s = tabLayout;
        this.f4888t = toolbar;
        this.f4889u = viewPager2;
    }
}
