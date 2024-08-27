package ba;

import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes.dex */
public abstract class n8 extends m4.m {

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f5528w = 0;

    /* renamed from: s, reason: collision with root package name */
    public final CheckBox f5529s;

    /* renamed from: t, reason: collision with root package name */
    public final ConstraintLayout f5530t;

    /* renamed from: u, reason: collision with root package name */
    public final TextView f5531u;

    /* renamed from: v, reason: collision with root package name */
    public final EditText f5532v;

    public n8(Object obj, View view, CheckBox checkBox, ConstraintLayout constraintLayout, TextView textView, EditText editText) {
        super(obj, view, 0);
        this.f5529s = checkBox;
        this.f5530t = constraintLayout;
        this.f5531u = textView;
        this.f5532v = editText;
    }
}
