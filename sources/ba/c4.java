package ba;

import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* loaded from: classes.dex */
public abstract class c4 extends m4.m {

    /* renamed from: s, reason: collision with root package name */
    public final RecyclerView f4336s;

    /* renamed from: t, reason: collision with root package name */
    public final SwipeRefreshLayout f4337t;

    /* renamed from: u, reason: collision with root package name */
    public final Toolbar f4338u;

    public c4(Object obj, View view, RecyclerView recyclerView, SwipeRefreshLayout swipeRefreshLayout, Toolbar toolbar) {
        super(obj, view, 0);
        this.f4336s = recyclerView;
        this.f4337t = swipeRefreshLayout;
        this.f4338u = toolbar;
    }
}
