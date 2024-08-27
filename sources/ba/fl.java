package ba;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.assetgro.stockgro.ui.subscription.MySubscriptionViewModel;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;

/* loaded from: classes.dex */
public abstract class fl extends m4.m {
    public final MaterialCardView A;
    public final TextView B;
    public final TextView C;
    public final MaterialButton D;
    public final LinearLayoutCompat E;
    public final RecyclerView F;
    public final TextView G;
    public final TextView H;
    public final TextView I;
    public final Toolbar J;
    public final TextView K;
    public final ImageView L;
    public final View M;
    public MySubscriptionViewModel N;

    /* renamed from: s, reason: collision with root package name */
    public final TextView f4717s;

    /* renamed from: t, reason: collision with root package name */
    public final TextView f4718t;

    /* renamed from: u, reason: collision with root package name */
    public final TextView f4719u;

    /* renamed from: v, reason: collision with root package name */
    public final TextView f4720v;

    /* renamed from: w, reason: collision with root package name */
    public final TextView f4721w;

    /* renamed from: x, reason: collision with root package name */
    public final SwipeRefreshLayout f4722x;

    /* renamed from: y, reason: collision with root package name */
    public final ConstraintLayout f4723y;

    /* renamed from: z, reason: collision with root package name */
    public final TextView f4724z;

    public fl(Object obj, View view, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, SwipeRefreshLayout swipeRefreshLayout, ConstraintLayout constraintLayout, TextView textView6, MaterialCardView materialCardView, TextView textView7, TextView textView8, MaterialButton materialButton, LinearLayoutCompat linearLayoutCompat, RecyclerView recyclerView, TextView textView9, TextView textView10, TextView textView11, Toolbar toolbar, TextView textView12, ImageView imageView, View view2) {
        super(obj, view, 3);
        this.f4717s = textView;
        this.f4718t = textView2;
        this.f4719u = textView3;
        this.f4720v = textView4;
        this.f4721w = textView5;
        this.f4722x = swipeRefreshLayout;
        this.f4723y = constraintLayout;
        this.f4724z = textView6;
        this.A = materialCardView;
        this.B = textView7;
        this.C = textView8;
        this.D = materialButton;
        this.E = linearLayoutCompat;
        this.F = recyclerView;
        this.G = textView9;
        this.H = textView10;
        this.I = textView11;
        this.J = toolbar;
        this.K = textView12;
        this.L = imageView;
        this.M = view2;
    }
}
