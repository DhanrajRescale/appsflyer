package ba;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.material.button.MaterialButton;

/* loaded from: classes.dex */
public abstract class d9 extends m4.m {

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f4460w = 0;

    /* renamed from: s, reason: collision with root package name */
    public final MaterialButton f4461s;

    /* renamed from: t, reason: collision with root package name */
    public final TextView f4462t;

    /* renamed from: u, reason: collision with root package name */
    public final TextView f4463u;

    /* renamed from: v, reason: collision with root package name */
    public final ImageView f4464v;

    public d9(View view, ImageView imageView, TextView textView, TextView textView2, MaterialButton materialButton, Object obj) {
        super(obj, view, 0);
        this.f4461s = materialButton;
        this.f4462t = textView;
        this.f4463u = textView2;
        this.f4464v = imageView;
    }
}
