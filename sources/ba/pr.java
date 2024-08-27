package ba;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public abstract class pr extends m4.m {

    /* renamed from: s, reason: collision with root package name */
    public final RecyclerView f5799s;

    /* renamed from: t, reason: collision with root package name */
    public final LinearLayout f5800t;

    /* renamed from: u, reason: collision with root package name */
    public final TextView f5801u;

    public pr(View view, LinearLayout linearLayout, TextView textView, RecyclerView recyclerView, Object obj) {
        super(obj, view, 0);
        this.f5799s = recyclerView;
        this.f5800t = linearLayout;
        this.f5801u = textView;
    }
}
