package ba;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public abstract class aw extends m4.m {

    /* renamed from: s, reason: collision with root package name */
    public final LinearLayout f4234s;

    /* renamed from: t, reason: collision with root package name */
    public final TextView f4235t;

    /* renamed from: u, reason: collision with root package name */
    public final RecyclerView f4236u;

    public aw(View view, LinearLayout linearLayout, TextView textView, RecyclerView recyclerView, Object obj) {
        super(obj, view, 0);
        this.f4234s = linearLayout;
        this.f4235t = textView;
        this.f4236u = recyclerView;
    }
}
