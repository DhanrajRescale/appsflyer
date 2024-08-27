package ba;

import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.assetgro.stockgro.widget.TouchDetectableScrollView;

/* loaded from: classes.dex */
public abstract class i extends m4.m {

    /* renamed from: s, reason: collision with root package name */
    public final TouchDetectableScrollView f4988s;

    /* renamed from: t, reason: collision with root package name */
    public final RecyclerView f4989t;

    /* renamed from: u, reason: collision with root package name */
    public final LinearLayout f4990u;

    /* renamed from: v, reason: collision with root package name */
    public final LinearLayout f4991v;

    /* renamed from: w, reason: collision with root package name */
    public final SwipeRefreshLayout f4992w;

    /* renamed from: x, reason: collision with root package name */
    public final Toolbar f4993x;

    public i(Object obj, View view, TouchDetectableScrollView touchDetectableScrollView, RecyclerView recyclerView, LinearLayout linearLayout, LinearLayout linearLayout2, SwipeRefreshLayout swipeRefreshLayout, Toolbar toolbar) {
        super(obj, view, 0);
        this.f4988s = touchDetectableScrollView;
        this.f4989t = recyclerView;
        this.f4990u = linearLayout;
        this.f4991v = linearLayout2;
        this.f4992w = swipeRefreshLayout;
        this.f4993x = toolbar;
    }
}
