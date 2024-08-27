package ba;

import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.assetgro.stockgro.widget.ArrowSlider;
import com.google.android.material.card.MaterialCardView;

/* loaded from: classes.dex */
public abstract class ue extends m4.m {

    /* renamed from: s, reason: collision with root package name */
    public final ArrowSlider f6287s;

    /* renamed from: t, reason: collision with root package name */
    public final ImageView f6288t;

    /* renamed from: u, reason: collision with root package name */
    public final MaterialCardView f6289u;

    /* renamed from: v, reason: collision with root package name */
    public final RecyclerView f6290v;

    /* renamed from: w, reason: collision with root package name */
    public final SwipeRefreshLayout f6291w;

    public ue(Object obj, View view, ArrowSlider arrowSlider, ImageView imageView, MaterialCardView materialCardView, RecyclerView recyclerView, SwipeRefreshLayout swipeRefreshLayout) {
        super(obj, view, 0);
        this.f6287s = arrowSlider;
        this.f6288t = imageView;
        this.f6289u = materialCardView;
        this.f6290v = recyclerView;
        this.f6291w = swipeRefreshLayout;
    }
}
