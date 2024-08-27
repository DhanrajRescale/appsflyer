package ba;

import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public abstract class qp extends m4.m {

    /* renamed from: s, reason: collision with root package name */
    public final NestedScrollView f5885s;

    /* renamed from: t, reason: collision with root package name */
    public final LinearLayout f5886t;

    /* renamed from: u, reason: collision with root package name */
    public final RecyclerView f5887u;

    /* renamed from: v, reason: collision with root package name */
    public final Toolbar f5888v;

    public qp(Object obj, View view, NestedScrollView nestedScrollView, LinearLayout linearLayout, RecyclerView recyclerView, Toolbar toolbar) {
        super(obj, view, 0);
        this.f5885s = nestedScrollView;
        this.f5886t = linearLayout;
        this.f5887u = recyclerView;
        this.f5888v = toolbar;
    }
}
