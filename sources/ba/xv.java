package ba;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;

/* loaded from: classes.dex */
public abstract class xv extends m4.m {

    /* renamed from: s, reason: collision with root package name */
    public final ConstraintLayout f6689s;

    /* renamed from: t, reason: collision with root package name */
    public final MaterialButton f6690t;

    /* renamed from: u, reason: collision with root package name */
    public final TextView f6691u;

    /* renamed from: v, reason: collision with root package name */
    public final TextView f6692v;

    public xv(Object obj, View view, ConstraintLayout constraintLayout, MaterialButton materialButton, TextView textView, TextView textView2) {
        super(obj, view, 0);
        this.f6689s = constraintLayout;
        this.f6690t = materialButton;
        this.f6691u = textView;
        this.f6692v = textView2;
    }
}
