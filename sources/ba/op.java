package ba;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;

/* loaded from: classes.dex */
public abstract class op extends m4.m {

    /* renamed from: s, reason: collision with root package name */
    public final MaterialButton f5676s;

    /* renamed from: t, reason: collision with root package name */
    public final RecyclerView f5677t;

    /* renamed from: u, reason: collision with root package name */
    public final TextView f5678u;

    /* renamed from: v, reason: collision with root package name */
    public final RecyclerView f5679v;

    /* renamed from: w, reason: collision with root package name */
    public final Toolbar f5680w;

    /* renamed from: x, reason: collision with root package name */
    public final TextView f5681x;

    public op(Object obj, View view, MaterialButton materialButton, RecyclerView recyclerView, TextView textView, RecyclerView recyclerView2, Toolbar toolbar, TextView textView2) {
        super(obj, view, 0);
        this.f5676s = materialButton;
        this.f5677t = recyclerView;
        this.f5678u = textView;
        this.f5679v = recyclerView2;
        this.f5680w = toolbar;
        this.f5681x = textView2;
    }
}
