package ba;

import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.tabs.TabLayout;

/* loaded from: classes.dex */
public abstract class p3 extends m4.m {

    /* renamed from: s, reason: collision with root package name */
    public final MaterialCardView f5714s;

    /* renamed from: t, reason: collision with root package name */
    public final TabLayout f5715t;

    /* renamed from: u, reason: collision with root package name */
    public final Toolbar f5716u;

    /* renamed from: v, reason: collision with root package name */
    public final ViewPager2 f5717v;

    public p3(Object obj, View view, MaterialCardView materialCardView, TabLayout tabLayout, Toolbar toolbar, ViewPager2 viewPager2) {
        super(obj, view, 0);
        this.f5714s = materialCardView;
        this.f5715t = tabLayout;
        this.f5716u = toolbar;
        this.f5717v = viewPager2;
    }
}
