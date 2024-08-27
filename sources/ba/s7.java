package ba;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public abstract class s7 extends m4.m {

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f6048w = 0;

    /* renamed from: s, reason: collision with root package name */
    public final LinearLayout f6049s;

    /* renamed from: t, reason: collision with root package name */
    public final RecyclerView f6050t;

    /* renamed from: u, reason: collision with root package name */
    public final TextView f6051u;

    /* renamed from: v, reason: collision with root package name */
    public final TextView f6052v;

    public s7(Object obj, View view, LinearLayout linearLayout, RecyclerView recyclerView, TextView textView, TextView textView2) {
        super(obj, view, 0);
        this.f6049s = linearLayout;
        this.f6050t = recyclerView;
        this.f6051u = textView;
        this.f6052v = textView2;
    }
}
