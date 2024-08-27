package ba;

import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager2.widget.ViewPager2;
import com.assetgro.stockgro.widget.PrepZoneHeaderView;
import com.google.android.material.tabs.TabLayout;

/* loaded from: classes.dex */
public abstract class i1 extends m4.m {

    /* renamed from: s, reason: collision with root package name */
    public final PrepZoneHeaderView f5002s;

    /* renamed from: t, reason: collision with root package name */
    public final TabLayout f5003t;

    /* renamed from: u, reason: collision with root package name */
    public final Toolbar f5004u;

    /* renamed from: v, reason: collision with root package name */
    public final ViewPager2 f5005v;

    public i1(Object obj, View view, PrepZoneHeaderView prepZoneHeaderView, TabLayout tabLayout, Toolbar toolbar, ViewPager2 viewPager2) {
        super(obj, view, 0);
        this.f5002s = prepZoneHeaderView;
        this.f5003t = tabLayout;
        this.f5004u = toolbar;
        this.f5005v = viewPager2;
    }
}
