package ba;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;

/* loaded from: classes.dex */
public abstract class s0 extends m4.m {
    public final Toolbar A;

    /* renamed from: s, reason: collision with root package name */
    public final ConstraintLayout f6025s;

    /* renamed from: t, reason: collision with root package name */
    public final EditText f6026t;

    /* renamed from: u, reason: collision with root package name */
    public final TextView f6027u;

    /* renamed from: v, reason: collision with root package name */
    public final EditText f6028v;

    /* renamed from: w, reason: collision with root package name */
    public final TextView f6029w;

    /* renamed from: x, reason: collision with root package name */
    public final xu f6030x;

    /* renamed from: y, reason: collision with root package name */
    public final EditText f6031y;

    /* renamed from: z, reason: collision with root package name */
    public final MaterialButton f6032z;

    public s0(Object obj, View view, ConstraintLayout constraintLayout, EditText editText, TextView textView, EditText editText2, TextView textView2, xu xuVar, EditText editText3, MaterialButton materialButton, Toolbar toolbar) {
        super(obj, view, 1);
        this.f6025s = constraintLayout;
        this.f6026t = editText;
        this.f6027u = textView;
        this.f6028v = editText2;
        this.f6029w = textView2;
        this.f6030x = xuVar;
        this.f6031y = editText3;
        this.f6032z = materialButton;
        this.A = toolbar;
    }
}
