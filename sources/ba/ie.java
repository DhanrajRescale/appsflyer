package ba;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;

/* loaded from: classes.dex */
public abstract class ie extends m4.m {

    /* renamed from: s, reason: collision with root package name */
    public final TextView f5030s;

    /* renamed from: t, reason: collision with root package name */
    public final MaterialButton f5031t;

    /* renamed from: u, reason: collision with root package name */
    public final MaterialButton f5032u;

    /* renamed from: v, reason: collision with root package name */
    public final MaterialButton f5033v;

    /* renamed from: w, reason: collision with root package name */
    public final ImageView f5034w;

    /* renamed from: x, reason: collision with root package name */
    public final ConstraintLayout f5035x;

    public ie(Object obj, View view, TextView textView, MaterialButton materialButton, MaterialButton materialButton2, MaterialButton materialButton3, ImageView imageView, ConstraintLayout constraintLayout) {
        super(obj, view, 0);
        this.f5030s = textView;
        this.f5031t = materialButton;
        this.f5032u = materialButton2;
        this.f5033v = materialButton3;
        this.f5034w = imageView;
        this.f5035x = constraintLayout;
    }
}
