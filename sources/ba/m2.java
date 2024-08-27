package ba;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public abstract class m2 extends m4.m {
    public final TextView A;
    public final TextView B;
    public final ImageView C;
    public final TextView D;
    public final NestedScrollView E;
    public final Toolbar F;

    /* renamed from: s, reason: collision with root package name */
    public final c8 f5424s;

    /* renamed from: t, reason: collision with root package name */
    public final FrameLayout f5425t;

    /* renamed from: u, reason: collision with root package name */
    public final ImageView f5426u;

    /* renamed from: v, reason: collision with root package name */
    public final ConstraintLayout f5427v;

    /* renamed from: w, reason: collision with root package name */
    public final LinearLayout f5428w;

    /* renamed from: x, reason: collision with root package name */
    public final ev f5429x;

    /* renamed from: y, reason: collision with root package name */
    public final RecyclerView f5430y;

    /* renamed from: z, reason: collision with root package name */
    public final ConstraintLayout f5431z;

    public m2(Object obj, View view, c8 c8Var, FrameLayout frameLayout, ImageView imageView, ConstraintLayout constraintLayout, LinearLayout linearLayout, ev evVar, RecyclerView recyclerView, ConstraintLayout constraintLayout2, TextView textView, TextView textView2, ImageView imageView2, TextView textView3, NestedScrollView nestedScrollView, Toolbar toolbar) {
        super(obj, view, 2);
        this.f5424s = c8Var;
        this.f5425t = frameLayout;
        this.f5426u = imageView;
        this.f5427v = constraintLayout;
        this.f5428w = linearLayout;
        this.f5429x = evVar;
        this.f5430y = recyclerView;
        this.f5431z = constraintLayout2;
        this.A = textView;
        this.B = textView2;
        this.C = imageView2;
        this.D = textView3;
        this.E = nestedScrollView;
        this.F = toolbar;
    }
}
