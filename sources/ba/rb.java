package ba;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;

/* loaded from: classes.dex */
public abstract class rb extends m4.m {

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f5951x = 0;

    /* renamed from: s, reason: collision with root package name */
    public final CardView f5952s;

    /* renamed from: t, reason: collision with root package name */
    public final RelativeLayout f5953t;

    /* renamed from: u, reason: collision with root package name */
    public final TextView f5954u;

    /* renamed from: v, reason: collision with root package name */
    public final TextView f5955v;

    /* renamed from: w, reason: collision with root package name */
    public final TextView f5956w;

    public rb(Object obj, View view, CardView cardView, RelativeLayout relativeLayout, TextView textView, TextView textView2, TextView textView3) {
        super(obj, view, 0);
        this.f5952s = cardView;
        this.f5953t = relativeLayout;
        this.f5954u = textView;
        this.f5955v = textView2;
        this.f5956w = textView3;
    }
}
