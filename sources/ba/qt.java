package ba;

import android.view.View;
import android.widget.TextView;
import androidx.cardview.widget.CardView;

/* loaded from: classes.dex */
public abstract class qt extends m4.m {

    /* renamed from: s, reason: collision with root package name */
    public final CardView f5897s;

    /* renamed from: t, reason: collision with root package name */
    public final TextView f5898t;

    /* renamed from: u, reason: collision with root package name */
    public String f5899u;

    public qt(View view, TextView textView, CardView cardView, Object obj) {
        super(obj, view, 0);
        this.f5897s = cardView;
        this.f5898t = textView;
    }

    public abstract void r(String str);
}
