package ba;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.assetgro.stockgro.widget.TouchDetectableScrollView;

/* loaded from: classes.dex */
public abstract class gv extends m4.m {
    public final RecyclerView A;
    public final LinearLayout B;
    public final LinearLayout C;
    public final RecyclerView D;
    public final TouchDetectableScrollView E;
    public final TextView F;
    public final TextView G;
    public final TextView H;

    /* renamed from: s, reason: collision with root package name */
    public final TextView f4869s;

    /* renamed from: t, reason: collision with root package name */
    public final TextView f4870t;

    /* renamed from: u, reason: collision with root package name */
    public final TextView f4871u;

    /* renamed from: v, reason: collision with root package name */
    public final TextView f4872v;

    /* renamed from: w, reason: collision with root package name */
    public final TextView f4873w;

    /* renamed from: x, reason: collision with root package name */
    public final LinearLayout f4874x;

    /* renamed from: y, reason: collision with root package name */
    public final LinearLayout f4875y;

    /* renamed from: z, reason: collision with root package name */
    public final LinearLayout f4876z;

    public gv(Object obj, View view, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, RecyclerView recyclerView, LinearLayout linearLayout4, LinearLayout linearLayout5, RecyclerView recyclerView2, TouchDetectableScrollView touchDetectableScrollView, TextView textView6, TextView textView7, TextView textView8) {
        super(obj, view, 0);
        this.f4869s = textView;
        this.f4870t = textView2;
        this.f4871u = textView3;
        this.f4872v = textView4;
        this.f4873w = textView5;
        this.f4874x = linearLayout;
        this.f4875y = linearLayout2;
        this.f4876z = linearLayout3;
        this.A = recyclerView;
        this.B = linearLayout4;
        this.C = linearLayout5;
        this.D = recyclerView2;
        this.E = touchDetectableScrollView;
        this.F = textView6;
        this.G = textView7;
        this.H = textView8;
    }
}
