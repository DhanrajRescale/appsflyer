package ba;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/* loaded from: classes.dex */
public abstract class kv extends m4.m {

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f5296w = 0;

    /* renamed from: s, reason: collision with root package name */
    public final TextView f5297s;

    /* renamed from: t, reason: collision with root package name */
    public final TextView f5298t;

    /* renamed from: u, reason: collision with root package name */
    public final ImageView f5299u;

    /* renamed from: v, reason: collision with root package name */
    public final View f5300v;

    public kv(View view, View view2, ImageView imageView, TextView textView, TextView textView2, Object obj) {
        super(obj, view, 0);
        this.f5297s = textView;
        this.f5298t = textView2;
        this.f5299u = imageView;
        this.f5300v = view2;
    }
}
