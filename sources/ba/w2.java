package ba;

import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;

/* loaded from: classes.dex */
public abstract class w2 extends m4.m {

    /* renamed from: s, reason: collision with root package name */
    public final CardView f6501s;

    /* renamed from: t, reason: collision with root package name */
    public final LinearLayout f6502t;

    /* renamed from: u, reason: collision with root package name */
    public final Toolbar f6503u;

    public w2(Object obj, View view, CardView cardView, LinearLayout linearLayout, Toolbar toolbar) {
        super(obj, view, 0);
        this.f6501s = cardView;
        this.f6502t = linearLayout;
        this.f6503u = toolbar;
    }
}
