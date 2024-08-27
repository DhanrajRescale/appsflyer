package ba;

import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* loaded from: classes.dex */
public abstract class s2 extends m4.m {

    /* renamed from: s, reason: collision with root package name */
    public final LinearLayout f6034s;

    /* renamed from: t, reason: collision with root package name */
    public final RecyclerView f6035t;

    /* renamed from: u, reason: collision with root package name */
    public final SwipeRefreshLayout f6036u;

    /* renamed from: v, reason: collision with root package name */
    public final Toolbar f6037v;

    public s2(View view, LinearLayout linearLayout, Toolbar toolbar, RecyclerView recyclerView, SwipeRefreshLayout swipeRefreshLayout, Object obj) {
        super(obj, view, 0);
        this.f6034s = linearLayout;
        this.f6035t = recyclerView;
        this.f6036u = swipeRefreshLayout;
        this.f6037v = toolbar;
    }
}
