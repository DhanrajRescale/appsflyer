package ba;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* loaded from: classes.dex */
public abstract class xj extends m4.m {

    /* renamed from: s, reason: collision with root package name */
    public final ComposeView f6660s;

    /* renamed from: t, reason: collision with root package name */
    public final LinearLayout f6661t;

    /* renamed from: u, reason: collision with root package name */
    public final TextView f6662u;

    /* renamed from: v, reason: collision with root package name */
    public final RecyclerView f6663v;

    /* renamed from: w, reason: collision with root package name */
    public final SwipeRefreshLayout f6664w;

    public xj(Object obj, View view, ComposeView composeView, LinearLayout linearLayout, TextView textView, RecyclerView recyclerView, SwipeRefreshLayout swipeRefreshLayout) {
        super(obj, view, 0);
        this.f6660s = composeView;
        this.f6661t = linearLayout;
        this.f6662u = textView;
        this.f6663v = recyclerView;
        this.f6664w = swipeRefreshLayout;
    }
}
