package ba;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import com.google.android.material.button.MaterialButton;

/* loaded from: classes.dex */
public abstract class sr extends m4.m {
    public static final /* synthetic */ int D = 0;
    public final LinearLayout A;
    public final MaterialButton B;
    public final MaterialButton C;

    /* renamed from: s, reason: collision with root package name */
    public final TextView f6118s;

    /* renamed from: t, reason: collision with root package name */
    public final Group f6119t;

    /* renamed from: u, reason: collision with root package name */
    public final TextView f6120u;

    /* renamed from: v, reason: collision with root package name */
    public final ImageView f6121v;

    /* renamed from: w, reason: collision with root package name */
    public final TextView f6122w;

    /* renamed from: x, reason: collision with root package name */
    public final EditText f6123x;

    /* renamed from: y, reason: collision with root package name */
    public final TextView f6124y;

    /* renamed from: z, reason: collision with root package name */
    public final Spinner f6125z;

    public sr(Object obj, View view, TextView textView, Group group, TextView textView2, ImageView imageView, TextView textView3, EditText editText, TextView textView4, Spinner spinner, LinearLayout linearLayout, MaterialButton materialButton, MaterialButton materialButton2) {
        super(obj, view, 0);
        this.f6118s = textView;
        this.f6119t = group;
        this.f6120u = textView2;
        this.f6121v = imageView;
        this.f6122w = textView3;
        this.f6123x = editText;
        this.f6124y = textView4;
        this.f6125z = spinner;
        this.A = linearLayout;
        this.B = materialButton;
        this.C = materialButton2;
    }
}
