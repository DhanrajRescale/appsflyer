package ba;

import android.view.View;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.bottomnavigation.BottomNavigationView;

/* loaded from: classes.dex */
public abstract class pj extends m4.m {

    /* renamed from: s, reason: collision with root package name */
    public final AppBarLayout f5771s;

    /* renamed from: t, reason: collision with root package name */
    public final BottomNavigationView f5772t;

    /* renamed from: u, reason: collision with root package name */
    public final CollapsingToolbarLayout f5773u;

    /* renamed from: v, reason: collision with root package name */
    public final Toolbar f5774v;

    public pj(Object obj, View view, AppBarLayout appBarLayout, BottomNavigationView bottomNavigationView, CollapsingToolbarLayout collapsingToolbarLayout, Toolbar toolbar) {
        super(obj, view, 0);
        this.f5771s = appBarLayout;
        this.f5772t = bottomNavigationView;
        this.f5773u = collapsingToolbarLayout;
        this.f5774v = toolbar;
    }
}
