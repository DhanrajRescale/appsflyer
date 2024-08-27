package ba;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public abstract class r8 extends m4.m {

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f5936v = 0;

    /* renamed from: s, reason: collision with root package name */
    public final ImageView f5937s;

    /* renamed from: t, reason: collision with root package name */
    public final TextView f5938t;

    /* renamed from: u, reason: collision with root package name */
    public final RecyclerView f5939u;

    public r8(Object obj, View view, ImageView imageView, TextView textView, RecyclerView recyclerView) {
        super(obj, view, 0);
        this.f5937s = imageView;
        this.f5938t = textView;
        this.f5939u = recyclerView;
    }
}
