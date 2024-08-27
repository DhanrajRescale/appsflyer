package ba;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/* loaded from: classes.dex */
public abstract class iv extends m4.m {

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f5088w = 0;

    /* renamed from: s, reason: collision with root package name */
    public final TextView f5089s;

    /* renamed from: t, reason: collision with root package name */
    public final TextView f5090t;

    /* renamed from: u, reason: collision with root package name */
    public final ImageView f5091u;

    /* renamed from: v, reason: collision with root package name */
    public final View f5092v;

    public iv(View view, View view2, ImageView imageView, TextView textView, TextView textView2, Object obj) {
        super(obj, view, 0);
        this.f5089s = textView;
        this.f5090t = textView2;
        this.f5091u = imageView;
        this.f5092v = view2;
    }
}
