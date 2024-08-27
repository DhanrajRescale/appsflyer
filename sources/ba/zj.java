package ba;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* loaded from: classes.dex */
public abstract class zj extends m4.m {

    /* renamed from: s, reason: collision with root package name */
    public final RecyclerView f6854s;

    /* renamed from: t, reason: collision with root package name */
    public final SwipeRefreshLayout f6855t;

    public zj(Object obj, View view, RecyclerView recyclerView, SwipeRefreshLayout swipeRefreshLayout) {
        super(obj, view, 1);
        this.f6854s = recyclerView;
        this.f6855t = swipeRefreshLayout;
    }
}
