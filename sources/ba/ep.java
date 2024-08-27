package ba;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.button.MaterialButton;

/* loaded from: classes.dex */
public abstract class ep extends m4.m {

    /* renamed from: s, reason: collision with root package name */
    public final MaterialButton f4634s;

    /* renamed from: t, reason: collision with root package name */
    public final TextView f4635t;

    /* renamed from: u, reason: collision with root package name */
    public final TextView f4636u;

    /* renamed from: v, reason: collision with root package name */
    public final Toolbar f4637v;

    public ep(Object obj, View view, MaterialButton materialButton, TextView textView, TextView textView2, Toolbar toolbar) {
        super(obj, view, 0);
        this.f4634s = materialButton;
        this.f4635t = textView;
        this.f4636u = textView2;
        this.f4637v = toolbar;
    }
}
