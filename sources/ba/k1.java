package ba;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* loaded from: classes.dex */
public abstract class k1 extends m4.m {

    /* renamed from: s, reason: collision with root package name */
    public final wr f5192s;

    /* renamed from: t, reason: collision with root package name */
    public final TextView f5193t;

    /* renamed from: u, reason: collision with root package name */
    public final RecyclerView f5194u;

    /* renamed from: v, reason: collision with root package name */
    public final SwipeRefreshLayout f5195v;

    /* renamed from: w, reason: collision with root package name */
    public final Toolbar f5196w;

    /* renamed from: x, reason: collision with root package name */
    public final ImageView f5197x;

    /* renamed from: y, reason: collision with root package name */
    public final TextView f5198y;

    public k1(Object obj, View view, wr wrVar, TextView textView, RecyclerView recyclerView, SwipeRefreshLayout swipeRefreshLayout, Toolbar toolbar, ImageView imageView, TextView textView2) {
        super(obj, view, 1);
        this.f5192s = wrVar;
        this.f5193t = textView;
        this.f5194u = recyclerView;
        this.f5195v = swipeRefreshLayout;
        this.f5196w = toolbar;
        this.f5197x = imageView;
        this.f5198y = textView2;
    }
}
