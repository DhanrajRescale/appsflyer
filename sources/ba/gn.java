package ba;

import android.view.View;
import android.widget.LinearLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* loaded from: classes.dex */
public abstract class gn extends m4.m {

    /* renamed from: s, reason: collision with root package name */
    public final RecyclerView f4830s;

    /* renamed from: t, reason: collision with root package name */
    public final LinearLayout f4831t;

    /* renamed from: u, reason: collision with root package name */
    public final NestedScrollView f4832u;

    /* renamed from: v, reason: collision with root package name */
    public final SwipeRefreshLayout f4833v;

    public gn(Object obj, View view, RecyclerView recyclerView, LinearLayout linearLayout, NestedScrollView nestedScrollView, SwipeRefreshLayout swipeRefreshLayout) {
        super(obj, view, 0);
        this.f4830s = recyclerView;
        this.f4831t = linearLayout;
        this.f4832u = nestedScrollView;
        this.f4833v = swipeRefreshLayout;
    }
}
