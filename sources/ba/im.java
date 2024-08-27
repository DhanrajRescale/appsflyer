package ba;

import android.view.View;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.material.card.MaterialCardView;

/* loaded from: classes.dex */
public abstract class im extends m4.m {

    /* renamed from: s, reason: collision with root package name */
    public final Spinner f5059s;

    /* renamed from: t, reason: collision with root package name */
    public final RecyclerView f5060t;

    /* renamed from: u, reason: collision with root package name */
    public final TextView f5061u;

    /* renamed from: v, reason: collision with root package name */
    public final MaterialCardView f5062v;

    /* renamed from: w, reason: collision with root package name */
    public final ImageView f5063w;

    /* renamed from: x, reason: collision with root package name */
    public final SwipeRefreshLayout f5064x;

    public im(Object obj, View view, Spinner spinner, RecyclerView recyclerView, TextView textView, MaterialCardView materialCardView, ImageView imageView, SwipeRefreshLayout swipeRefreshLayout) {
        super(obj, view, 0);
        this.f5059s = spinner;
        this.f5060t = recyclerView;
        this.f5061u = textView;
        this.f5062v = materialCardView;
        this.f5063w = imageView;
        this.f5064x = swipeRefreshLayout;
    }
}
