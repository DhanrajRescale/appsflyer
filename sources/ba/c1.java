package ba;

import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public abstract class c1 extends m4.m {

    /* renamed from: s, reason: collision with root package name */
    public final RecyclerView f4333s;

    /* renamed from: t, reason: collision with root package name */
    public final Toolbar f4334t;

    public c1(View view, Toolbar toolbar, RecyclerView recyclerView, Object obj) {
        super(obj, view, 0);
        this.f4333s = recyclerView;
        this.f4334t = toolbar;
    }
}
