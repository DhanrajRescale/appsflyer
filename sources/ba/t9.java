package ba;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public abstract class t9 extends m4.m {

    /* renamed from: s, reason: collision with root package name */
    public final View f6170s;

    /* renamed from: t, reason: collision with root package name */
    public final View f6171t;

    /* renamed from: u, reason: collision with root package name */
    public final View f6172u;

    public /* synthetic */ t9(View view, View view2, TextView textView, TextView textView2, Object obj) {
        super(obj, view, 0);
        this.f6170s = textView;
        this.f6172u = view2;
        this.f6171t = textView2;
    }

    public /* synthetic */ t9(Object obj, View view, View view2, View view3, TextView textView) {
        super(obj, view, 0);
        this.f6171t = view2;
        this.f6172u = view3;
        this.f6170s = textView;
    }

    public t9(Object obj, View view, LinearLayout linearLayout, LinearLayout linearLayout2, RecyclerView recyclerView) {
        super(obj, view, 0);
        this.f6170s = linearLayout;
        this.f6171t = linearLayout2;
        this.f6172u = recyclerView;
    }

    public t9(View view, ImageView imageView, TextView textView, CardView cardView, Object obj) {
        super(obj, view, 0);
        this.f6171t = imageView;
        this.f6170s = textView;
        this.f6172u = cardView;
    }

    public t9(Object obj, View view, LinearLayout linearLayout, TextView textView) {
        super(obj, view, 0);
        this.f6171t = linearLayout;
        this.f6170s = textView;
    }
}
