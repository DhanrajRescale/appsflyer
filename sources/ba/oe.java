package ba;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* loaded from: classes.dex */
public abstract class oe extends m4.m {

    /* renamed from: s, reason: collision with root package name */
    public final ConstraintLayout f5656s;

    /* renamed from: t, reason: collision with root package name */
    public final ConstraintLayout f5657t;

    /* renamed from: u, reason: collision with root package name */
    public final RecyclerView f5658u;

    /* renamed from: v, reason: collision with root package name */
    public final SwipeRefreshLayout f5659v;

    public oe(Object obj, View view, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, RecyclerView recyclerView, SwipeRefreshLayout swipeRefreshLayout) {
        super(obj, view, 0);
        this.f5656s = constraintLayout;
        this.f5657t = constraintLayout2;
        this.f5658u = recyclerView;
        this.f5659v = swipeRefreshLayout;
    }
}
