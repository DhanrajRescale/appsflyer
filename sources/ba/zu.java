package ba;

import android.view.View;
import android.widget.ProgressBar;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public abstract class zu extends m4.m {

    /* renamed from: s, reason: collision with root package name */
    public final RecyclerView f6890s;

    /* renamed from: t, reason: collision with root package name */
    public final ProgressBar f6891t;

    public zu(View view, ProgressBar progressBar, RecyclerView recyclerView, Object obj) {
        super(obj, view, 0);
        this.f6890s = recyclerView;
        this.f6891t = progressBar;
    }
}
