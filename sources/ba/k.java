package ba;

import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* loaded from: classes.dex */
public abstract class k extends m4.m {

    /* renamed from: s, reason: collision with root package name */
    public final RecyclerView f5187s;

    /* renamed from: t, reason: collision with root package name */
    public final LinearLayout f5188t;

    /* renamed from: u, reason: collision with root package name */
    public final SwipeRefreshLayout f5189u;

    /* renamed from: v, reason: collision with root package name */
    public final Toolbar f5190v;

    public k(View view, LinearLayout linearLayout, Toolbar toolbar, RecyclerView recyclerView, SwipeRefreshLayout swipeRefreshLayout, Object obj) {
        super(obj, view, 0);
        this.f5187s = recyclerView;
        this.f5188t = linearLayout;
        this.f5189u = swipeRefreshLayout;
        this.f5190v = toolbar;
    }
}
