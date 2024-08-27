package ba;

import android.view.View;
import android.widget.ImageView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.assetgro.stockgro.widget.ArrowSlider;
import com.google.android.material.card.MaterialCardView;

/* loaded from: classes.dex */
public abstract class dk extends m4.m {

    /* renamed from: s, reason: collision with root package name */
    public final ComposeView f4495s;

    /* renamed from: t, reason: collision with root package name */
    public final ArrowSlider f4496t;

    /* renamed from: u, reason: collision with root package name */
    public final ImageView f4497u;

    /* renamed from: v, reason: collision with root package name */
    public final MaterialCardView f4498v;

    /* renamed from: w, reason: collision with root package name */
    public final ConstraintLayout f4499w;

    /* renamed from: x, reason: collision with root package name */
    public final RecyclerView f4500x;

    /* renamed from: y, reason: collision with root package name */
    public final SwipeRefreshLayout f4501y;

    public dk(Object obj, View view, ComposeView composeView, ArrowSlider arrowSlider, ImageView imageView, MaterialCardView materialCardView, ConstraintLayout constraintLayout, RecyclerView recyclerView, SwipeRefreshLayout swipeRefreshLayout) {
        super(obj, view, 0);
        this.f4495s = composeView;
        this.f4496t = arrowSlider;
        this.f4497u = imageView;
        this.f4498v = materialCardView;
        this.f4499w = constraintLayout;
        this.f4500x = recyclerView;
        this.f4501y = swipeRefreshLayout;
    }
}
