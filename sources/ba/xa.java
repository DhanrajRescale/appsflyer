package ba;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public abstract class xa extends m4.m {

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ int f6637u = 0;

    /* renamed from: s, reason: collision with root package name */
    public final RecyclerView f6638s;

    /* renamed from: t, reason: collision with root package name */
    public final TextView f6639t;

    public xa(View view, TextView textView, RecyclerView recyclerView, Object obj) {
        super(obj, view, 0);
        this.f6638s = recyclerView;
        this.f6639t = textView;
    }
}
