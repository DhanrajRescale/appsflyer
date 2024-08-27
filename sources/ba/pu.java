package ba;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.cardview.widget.CardView;

/* loaded from: classes.dex */
public abstract class pu extends m4.m {

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f5806v = 0;

    /* renamed from: s, reason: collision with root package name */
    public final LinearLayout f5807s;

    /* renamed from: t, reason: collision with root package name */
    public final CardView f5808t;

    /* renamed from: u, reason: collision with root package name */
    public final ImageView f5809u;

    public pu(Object obj, View view, LinearLayout linearLayout, CardView cardView, ImageView imageView) {
        super(obj, view, 0);
        this.f5807s = linearLayout;
        this.f5808t = cardView;
        this.f5809u = imageView;
    }
}
