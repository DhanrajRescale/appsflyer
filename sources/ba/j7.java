package ba;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* loaded from: classes.dex */
public abstract class j7 extends m4.m {

    /* renamed from: s, reason: collision with root package name */
    public final SwipeRefreshLayout f5111s;

    /* renamed from: t, reason: collision with root package name */
    public final LinearLayout f5112t;

    /* renamed from: u, reason: collision with root package name */
    public final ProgressBar f5113u;

    /* renamed from: v, reason: collision with root package name */
    public final RecyclerView f5114v;

    public j7(Object obj, View view, SwipeRefreshLayout swipeRefreshLayout, LinearLayout linearLayout, ProgressBar progressBar, RecyclerView recyclerView) {
        super(obj, view, 0);
        this.f5111s = swipeRefreshLayout;
        this.f5112t = linearLayout;
        this.f5113u = progressBar;
        this.f5114v = recyclerView;
    }
}
