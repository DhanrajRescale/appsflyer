package ba;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.material.card.MaterialCardView;

/* loaded from: classes.dex */
public abstract class kt extends m4.m {

    /* renamed from: s, reason: collision with root package name */
    public final MaterialCardView f5290s;

    /* renamed from: t, reason: collision with root package name */
    public final ImageView f5291t;

    /* renamed from: u, reason: collision with root package name */
    public final TextView f5292u;

    public kt(Object obj, View view, MaterialCardView materialCardView, ImageView imageView, TextView textView) {
        super(obj, view, 0);
        this.f5290s = materialCardView;
        this.f5291t = imageView;
        this.f5292u = textView;
    }
}
