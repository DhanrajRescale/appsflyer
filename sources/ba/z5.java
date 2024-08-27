package ba;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/* loaded from: classes.dex */
public abstract class z5 extends m4.m {

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f6805w = 0;

    /* renamed from: s, reason: collision with root package name */
    public final ImageView f6806s;

    /* renamed from: t, reason: collision with root package name */
    public final TextView f6807t;

    /* renamed from: u, reason: collision with root package name */
    public final LinearLayout f6808u;

    /* renamed from: v, reason: collision with root package name */
    public zi.k f6809v;

    public z5(Object obj, View view, ImageView imageView, TextView textView, LinearLayout linearLayout) {
        super(obj, view, 0);
        this.f6806s = imageView;
        this.f6807t = textView;
        this.f6808u = linearLayout;
    }
}
