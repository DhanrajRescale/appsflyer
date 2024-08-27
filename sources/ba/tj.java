package ba;

import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* loaded from: classes.dex */
public abstract class tj extends m4.m {

    /* renamed from: s, reason: collision with root package name */
    public final RecyclerView f6198s;

    /* renamed from: t, reason: collision with root package name */
    public final SwipeRefreshLayout f6199t;

    /* renamed from: u, reason: collision with root package name */
    public final Toolbar f6200u;

    public tj(Object obj, View view, RecyclerView recyclerView, SwipeRefreshLayout swipeRefreshLayout, Toolbar toolbar) {
        super(obj, view, 0);
        this.f6198s = recyclerView;
        this.f6199t = swipeRefreshLayout;
        this.f6200u = toolbar;
    }
}
