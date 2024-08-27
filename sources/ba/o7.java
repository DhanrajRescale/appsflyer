package ba;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public abstract class o7 extends m4.m {

    /* renamed from: s, reason: collision with root package name */
    public final View f5648s;

    public o7(View view, TextView textView, Object obj) {
        super(obj, view, 0);
        this.f5648s = textView;
    }

    public o7(Object obj, View view, ConstraintLayout constraintLayout) {
        super(obj, view, 0);
        this.f5648s = constraintLayout;
    }

    public o7(Object obj, View view, RecyclerView recyclerView) {
        super(obj, view, 0);
        this.f5648s = recyclerView;
    }
}
