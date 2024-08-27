package ba;

import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public abstract class j4 extends m4.m {

    /* renamed from: s, reason: collision with root package name */
    public final Toolbar f5106s;

    /* renamed from: t, reason: collision with root package name */
    public final RecyclerView f5107t;

    public j4(View view, Toolbar toolbar, RecyclerView recyclerView, Object obj) {
        super(obj, view, 0);
        this.f5106s = toolbar;
        this.f5107t = recyclerView;
    }
}
