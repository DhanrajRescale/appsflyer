package ba;

import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* loaded from: classes.dex */
public abstract class rj extends m4.m {

    /* renamed from: s, reason: collision with root package name */
    public final ComposeView f5974s;

    /* renamed from: t, reason: collision with root package name */
    public final RecyclerView f5975t;

    /* renamed from: u, reason: collision with root package name */
    public final SwipeRefreshLayout f5976u;

    public rj(Object obj, View view, ComposeView composeView, RecyclerView recyclerView, SwipeRefreshLayout swipeRefreshLayout) {
        super(obj, view, 0);
        this.f5974s = composeView;
        this.f5975t = recyclerView;
        this.f5976u = swipeRefreshLayout;
    }
}
