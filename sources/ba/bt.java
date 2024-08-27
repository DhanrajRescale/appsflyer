package ba;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.progressindicator.CircularProgressIndicator;

/* loaded from: classes.dex */
public abstract class bt extends m4.m {

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f4316v = 0;

    /* renamed from: s, reason: collision with root package name */
    public final CircularProgressIndicator f4317s;

    /* renamed from: t, reason: collision with root package name */
    public final ConstraintLayout f4318t;

    /* renamed from: u, reason: collision with root package name */
    public final TextView f4319u;

    public bt(Object obj, View view, CircularProgressIndicator circularProgressIndicator, ConstraintLayout constraintLayout, TextView textView) {
        super(obj, view, 0);
        this.f4317s = circularProgressIndicator;
        this.f4318t = constraintLayout;
        this.f4319u = textView;
    }
}
