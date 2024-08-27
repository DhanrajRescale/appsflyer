package ba;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.button.MaterialButton;

/* loaded from: classes.dex */
public abstract class a1 extends m4.m {

    /* renamed from: s, reason: collision with root package name */
    public final ImageView f4148s;

    /* renamed from: t, reason: collision with root package name */
    public final MaterialButton f4149t;

    /* renamed from: u, reason: collision with root package name */
    public final TextView f4150u;

    /* renamed from: v, reason: collision with root package name */
    public final Toolbar f4151v;

    /* renamed from: w, reason: collision with root package name */
    public final TextView f4152w;

    public a1(Object obj, View view, ImageView imageView, MaterialButton materialButton, TextView textView, Toolbar toolbar, TextView textView2) {
        super(obj, view, 0);
        this.f4148s = imageView;
        this.f4149t = materialButton;
        this.f4150u = textView;
        this.f4151v = toolbar;
        this.f4152w = textView2;
    }
}
