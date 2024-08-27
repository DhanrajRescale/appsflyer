package ba;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes.dex */
public abstract class a2 extends m4.m {

    /* renamed from: s, reason: collision with root package name */
    public final LinearLayout f4153s;

    /* renamed from: t, reason: collision with root package name */
    public final is f4154t;

    /* renamed from: u, reason: collision with root package name */
    public final LinearLayout f4155u;

    /* renamed from: v, reason: collision with root package name */
    public final ConstraintLayout f4156v;

    /* renamed from: w, reason: collision with root package name */
    public final TextView f4157w;

    /* renamed from: x, reason: collision with root package name */
    public final Toolbar f4158x;

    public a2(Object obj, View view, LinearLayout linearLayout, is isVar, LinearLayout linearLayout2, ConstraintLayout constraintLayout, TextView textView, Toolbar toolbar) {
        super(obj, view, 1);
        this.f4153s = linearLayout;
        this.f4154t = isVar;
        this.f4155u = linearLayout2;
        this.f4156v = constraintLayout;
        this.f4157w = textView;
        this.f4158x = toolbar;
    }
}
