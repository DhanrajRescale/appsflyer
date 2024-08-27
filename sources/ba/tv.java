package ba;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

/* loaded from: classes.dex */
public abstract class tv extends m4.m {

    /* renamed from: s, reason: collision with root package name */
    public final TextView f6235s;

    /* renamed from: t, reason: collision with root package name */
    public final LinearLayout f6236t;

    /* renamed from: u, reason: collision with root package name */
    public final RelativeLayout f6237u;

    /* renamed from: v, reason: collision with root package name */
    public final ImageView f6238v;

    /* renamed from: w, reason: collision with root package name */
    public final TextView f6239w;

    public tv(Object obj, View view, TextView textView, LinearLayout linearLayout, RelativeLayout relativeLayout, ImageView imageView, TextView textView2) {
        super(obj, view, 0);
        this.f6235s = textView;
        this.f6236t = linearLayout;
        this.f6237u = relativeLayout;
        this.f6238v = imageView;
        this.f6239w = textView2;
    }
}
