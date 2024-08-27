package ba;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/* loaded from: classes.dex */
public abstract class ui extends m4.m {

    /* renamed from: s, reason: collision with root package name */
    public final ImageView f6323s;

    /* renamed from: t, reason: collision with root package name */
    public final TextView f6324t;

    public ui(View view, ImageView imageView, TextView textView, Object obj) {
        super(obj, view, 0);
        this.f6323s = imageView;
        this.f6324t = textView;
    }
}
