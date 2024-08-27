package ba;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.material.card.MaterialCardView;

/* loaded from: classes.dex */
public abstract class ft extends m4.m {

    /* renamed from: s, reason: collision with root package name */
    public final MaterialCardView f4742s;

    /* renamed from: t, reason: collision with root package name */
    public final ImageView f4743t;

    /* renamed from: u, reason: collision with root package name */
    public final TextView f4744u;

    /* renamed from: v, reason: collision with root package name */
    public String f4745v;

    public ft(Object obj, View view, MaterialCardView materialCardView, ImageView imageView, TextView textView) {
        super(obj, view, 0);
        this.f4742s = materialCardView;
        this.f4743t = imageView;
        this.f4744u = textView;
    }
}
