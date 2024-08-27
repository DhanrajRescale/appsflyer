package ba;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;

/* loaded from: classes.dex */
public abstract class dl extends m4.m {

    /* renamed from: s, reason: collision with root package name */
    public final MaterialButton f4502s;

    /* renamed from: t, reason: collision with root package name */
    public final LinearLayout f4503t;

    /* renamed from: u, reason: collision with root package name */
    public final TextView f4504u;

    /* renamed from: v, reason: collision with root package name */
    public final RecyclerView f4505v;

    public dl(Object obj, View view, MaterialButton materialButton, LinearLayout linearLayout, TextView textView, RecyclerView recyclerView) {
        super(obj, view, 0);
        this.f4502s = materialButton;
        this.f4503t = linearLayout;
        this.f4504u = textView;
        this.f4505v = recyclerView;
    }
}
