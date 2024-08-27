package ba;

import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.assetgro.stockgro.widget.ChatToolbar;
import com.assetgro.stockgro.widget.PrepZoneHeaderView;
import com.google.android.material.tabs.TabLayout;

/* loaded from: classes.dex */
public abstract class m1 extends m4.m {

    /* renamed from: s, reason: collision with root package name */
    public final ChatToolbar f5416s;

    /* renamed from: t, reason: collision with root package name */
    public final PrepZoneHeaderView f5417t;

    /* renamed from: u, reason: collision with root package name */
    public final tv f5418u;

    /* renamed from: v, reason: collision with root package name */
    public final ConstraintLayout f5419v;

    /* renamed from: w, reason: collision with root package name */
    public final TabLayout f5420w;

    /* renamed from: x, reason: collision with root package name */
    public final Toolbar f5421x;

    /* renamed from: y, reason: collision with root package name */
    public final ViewPager2 f5422y;

    /* renamed from: z, reason: collision with root package name */
    public final View f5423z;

    public m1(Object obj, View view, ChatToolbar chatToolbar, PrepZoneHeaderView prepZoneHeaderView, tv tvVar, ConstraintLayout constraintLayout, TabLayout tabLayout, Toolbar toolbar, ViewPager2 viewPager2, View view2) {
        super(obj, view, 1);
        this.f5416s = chatToolbar;
        this.f5417t = prepZoneHeaderView;
        this.f5418u = tvVar;
        this.f5419v = constraintLayout;
        this.f5420w = tabLayout;
        this.f5421x = toolbar;
        this.f5422y = viewPager2;
        this.f5423z = view2;
    }
}
