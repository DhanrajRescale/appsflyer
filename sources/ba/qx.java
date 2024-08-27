package ba;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;

/* loaded from: classes.dex */
public abstract class qx extends m4.m {
    public static final /* synthetic */ int B = 0;
    public final EditText A;

    /* renamed from: s, reason: collision with root package name */
    public final ConstraintLayout f5912s;

    /* renamed from: t, reason: collision with root package name */
    public final ImageView f5913t;

    /* renamed from: u, reason: collision with root package name */
    public final ImageView f5914u;

    /* renamed from: v, reason: collision with root package name */
    public final TextView f5915v;

    /* renamed from: w, reason: collision with root package name */
    public final Group f5916w;

    /* renamed from: x, reason: collision with root package name */
    public final TextView f5917x;

    /* renamed from: y, reason: collision with root package name */
    public final ImageView f5918y;

    /* renamed from: z, reason: collision with root package name */
    public final TextView f5919z;

    public qx(Object obj, View view, ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, TextView textView, Group group, TextView textView2, ImageView imageView3, TextView textView3, EditText editText) {
        super(obj, view, 0);
        this.f5912s = constraintLayout;
        this.f5913t = imageView;
        this.f5914u = imageView2;
        this.f5915v = textView;
        this.f5916w = group;
        this.f5917x = textView2;
        this.f5918y = imageView3;
        this.f5919z = textView3;
        this.A = editText;
    }
}
