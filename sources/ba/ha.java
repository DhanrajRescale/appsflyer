package ba;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public abstract class ha extends m4.m {

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ int f4918u = 0;

    /* renamed from: s, reason: collision with root package name */
    public final TextView f4919s;

    /* renamed from: t, reason: collision with root package name */
    public final RecyclerView f4920t;

    public ha(View view, TextView textView, RecyclerView recyclerView, Object obj) {
        super(obj, view, 0);
        this.f4919s = textView;
        this.f4920t = recyclerView;
    }
}
