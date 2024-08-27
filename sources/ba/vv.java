package ba;

import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes.dex */
public abstract class vv extends m4.m {

    /* renamed from: s, reason: collision with root package name */
    public final CheckBox f6480s;

    /* renamed from: t, reason: collision with root package name */
    public final TextView f6481t;

    /* renamed from: u, reason: collision with root package name */
    public final CheckBox f6482u;

    /* renamed from: v, reason: collision with root package name */
    public final ConstraintLayout f6483v;

    public vv(Object obj, View view, CheckBox checkBox, TextView textView, CheckBox checkBox2, ConstraintLayout constraintLayout) {
        super(obj, view, 0);
        this.f6480s = checkBox;
        this.f6481t = textView;
        this.f6482u = checkBox2;
        this.f6483v = constraintLayout;
    }
}
