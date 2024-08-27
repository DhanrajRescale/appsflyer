package ba;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public abstract class q0 extends m4.m {

    /* renamed from: s, reason: collision with root package name */
    public final FrameLayout f5813s;

    /* renamed from: t, reason: collision with root package name */
    public final RecyclerView f5814t;

    /* renamed from: u, reason: collision with root package name */
    public final ImageView f5815u;

    /* renamed from: v, reason: collision with root package name */
    public final ImageView f5816v;

    /* renamed from: w, reason: collision with root package name */
    public final Toolbar f5817w;

    /* renamed from: x, reason: collision with root package name */
    public final Toolbar f5818x;

    /* renamed from: y, reason: collision with root package name */
    public final TextView f5819y;

    public q0(Object obj, View view, FrameLayout frameLayout, RecyclerView recyclerView, ImageView imageView, ImageView imageView2, Toolbar toolbar, Toolbar toolbar2, TextView textView) {
        super(obj, view, 0);
        this.f5813s = frameLayout;
        this.f5814t = recyclerView;
        this.f5815u = imageView;
        this.f5816v = imageView2;
        this.f5817w = toolbar;
        this.f5818x = toolbar2;
        this.f5819y = textView;
    }
}
