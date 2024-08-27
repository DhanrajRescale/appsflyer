package ba;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* loaded from: classes.dex */
public abstract class qe extends m4.m {

    /* renamed from: s, reason: collision with root package name */
    public final ConstraintLayout f5852s;

    /* renamed from: t, reason: collision with root package name */
    public final RecyclerView f5853t;

    /* renamed from: u, reason: collision with root package name */
    public final SwipeRefreshLayout f5854u;

    public qe(Object obj, View view, ConstraintLayout constraintLayout, RecyclerView recyclerView, SwipeRefreshLayout swipeRefreshLayout) {
        super(obj, view, 0);
        this.f5852s = constraintLayout;
        this.f5853t = recyclerView;
        this.f5854u = swipeRefreshLayout;
    }
}
