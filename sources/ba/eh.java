package ba;

import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes.dex */
public abstract class eh extends m4.m {

    /* renamed from: s, reason: collision with root package name */
    public final View f4614s;

    /* renamed from: t, reason: collision with root package name */
    public final Object f4615t;

    /* renamed from: u, reason: collision with root package name */
    public final Object f4616u;

    public eh(Object obj, View view, AppCompatSeekBar appCompatSeekBar, ImageButton imageButton, TextView textView) {
        super(obj, view, 0);
        this.f4614s = appCompatSeekBar;
        this.f4615t = imageButton;
        this.f4616u = textView;
    }

    public eh(Object obj, View view, ConstraintLayout constraintLayout, ot otVar, tt ttVar) {
        super(obj, view, 2);
        this.f4614s = constraintLayout;
        this.f4615t = otVar;
        this.f4616u = ttVar;
    }
}
