package ba;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes.dex */
public abstract class e5 extends m4.m {

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f4572v = 0;

    /* renamed from: s, reason: collision with root package name */
    public final ConstraintLayout f4573s;

    /* renamed from: t, reason: collision with root package name */
    public final ImageView f4574t;

    /* renamed from: u, reason: collision with root package name */
    public final TextView f4575u;

    public e5(View view, ImageView imageView, TextView textView, ConstraintLayout constraintLayout, Object obj) {
        super(obj, view, 0);
        this.f4573s = constraintLayout;
        this.f4574t = imageView;
        this.f4575u = textView;
    }
}
