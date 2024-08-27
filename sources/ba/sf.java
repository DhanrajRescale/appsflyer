package ba;

import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.assetgro.stockgro.feature_arena.widget.PrepZoneWhatsNewWidget;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.tabs.TabLayout;

/* loaded from: classes.dex */
public abstract class sf extends m4.m {

    /* renamed from: s, reason: collision with root package name */
    public final MaterialButton f6076s;

    /* renamed from: t, reason: collision with root package name */
    public final CollapsingToolbarLayout f6077t;

    /* renamed from: u, reason: collision with root package name */
    public final LinearLayout f6078u;

    /* renamed from: v, reason: collision with root package name */
    public final RecyclerView f6079v;

    /* renamed from: w, reason: collision with root package name */
    public final TabLayout f6080w;

    /* renamed from: x, reason: collision with root package name */
    public final SwipeRefreshLayout f6081x;

    /* renamed from: y, reason: collision with root package name */
    public final PrepZoneWhatsNewWidget f6082y;

    public sf(Object obj, View view, MaterialButton materialButton, CollapsingToolbarLayout collapsingToolbarLayout, LinearLayout linearLayout, RecyclerView recyclerView, TabLayout tabLayout, SwipeRefreshLayout swipeRefreshLayout, PrepZoneWhatsNewWidget prepZoneWhatsNewWidget) {
        super(obj, view, 0);
        this.f6076s = materialButton;
        this.f6077t = collapsingToolbarLayout;
        this.f6078u = linearLayout;
        this.f6079v = recyclerView;
        this.f6080w = tabLayout;
        this.f6081x = swipeRefreshLayout;
        this.f6082y = prepZoneWhatsNewWidget;
    }
}
