package ba;

import android.view.View;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.material.card.MaterialCardView;

/* loaded from: classes.dex */
public abstract class mm extends m4.m {

    /* renamed from: s, reason: collision with root package name */
    public final Spinner f5482s;

    /* renamed from: t, reason: collision with root package name */
    public final TextView f5483t;

    /* renamed from: u, reason: collision with root package name */
    public final RecyclerView f5484u;

    /* renamed from: v, reason: collision with root package name */
    public final MaterialCardView f5485v;

    /* renamed from: w, reason: collision with root package name */
    public final ImageView f5486w;

    /* renamed from: x, reason: collision with root package name */
    public final SwipeRefreshLayout f5487x;

    public mm(Object obj, View view, Spinner spinner, TextView textView, RecyclerView recyclerView, MaterialCardView materialCardView, ImageView imageView, SwipeRefreshLayout swipeRefreshLayout) {
        super(obj, view, 0);
        this.f5482s = spinner;
        this.f5483t = textView;
        this.f5484u = recyclerView;
        this.f5485v = materialCardView;
        this.f5486w = imageView;
        this.f5487x = swipeRefreshLayout;
    }
}
