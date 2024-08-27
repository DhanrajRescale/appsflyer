package ba;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public abstract class v3 extends m4.m {
    public final TextView A;
    public final Toolbar B;

    /* renamed from: s, reason: collision with root package name */
    public final LinearLayout f6372s;

    /* renamed from: t, reason: collision with root package name */
    public final gv f6373t;

    /* renamed from: u, reason: collision with root package name */
    public final LinearLayout f6374u;

    /* renamed from: v, reason: collision with root package name */
    public final TextView f6375v;

    /* renamed from: w, reason: collision with root package name */
    public final ProgressBar f6376w;

    /* renamed from: x, reason: collision with root package name */
    public final ConstraintLayout f6377x;

    /* renamed from: y, reason: collision with root package name */
    public final RecyclerView f6378y;

    /* renamed from: z, reason: collision with root package name */
    public final ConstraintLayout f6379z;

    public v3(Object obj, View view, LinearLayout linearLayout, gv gvVar, LinearLayout linearLayout2, TextView textView, ProgressBar progressBar, ConstraintLayout constraintLayout, RecyclerView recyclerView, ConstraintLayout constraintLayout2, TextView textView2, Toolbar toolbar) {
        super(obj, view, 1);
        this.f6372s = linearLayout;
        this.f6373t = gvVar;
        this.f6374u = linearLayout2;
        this.f6375v = textView;
        this.f6376w = progressBar;
        this.f6377x = constraintLayout;
        this.f6378y = recyclerView;
        this.f6379z = constraintLayout2;
        this.A = textView2;
        this.B = toolbar;
    }
}
