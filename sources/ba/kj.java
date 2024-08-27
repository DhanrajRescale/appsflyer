package ba;

import android.view.View;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.material.button.MaterialButton;

/* loaded from: classes.dex */
public abstract class kj extends m4.m {

    /* renamed from: s, reason: collision with root package name */
    public final MaterialButton f5254s;

    /* renamed from: t, reason: collision with root package name */
    public final ur f5255t;

    /* renamed from: u, reason: collision with root package name */
    public final SwipeRefreshLayout f5256u;

    public kj(Object obj, View view, MaterialButton materialButton, ur urVar, SwipeRefreshLayout swipeRefreshLayout) {
        super(obj, view, 1);
        this.f5254s = materialButton;
        this.f5255t = urVar;
        this.f5256u = swipeRefreshLayout;
    }
}
