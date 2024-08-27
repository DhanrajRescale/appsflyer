package ba;

import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.assetgro.stockgro.widget.TouchDetectableScrollView;

/* loaded from: classes.dex */
public abstract class o0 extends m4.m {

    /* renamed from: s, reason: collision with root package name */
    public final TouchDetectableScrollView f5630s;

    /* renamed from: t, reason: collision with root package name */
    public final RecyclerView f5631t;

    /* renamed from: u, reason: collision with root package name */
    public final SwipeRefreshLayout f5632u;

    /* renamed from: v, reason: collision with root package name */
    public final Toolbar f5633v;

    public o0(Object obj, View view, TouchDetectableScrollView touchDetectableScrollView, RecyclerView recyclerView, SwipeRefreshLayout swipeRefreshLayout, Toolbar toolbar) {
        super(obj, view, 0);
        this.f5630s = touchDetectableScrollView;
        this.f5631t = recyclerView;
        this.f5632u = swipeRefreshLayout;
        this.f5633v = toolbar;
    }
}
