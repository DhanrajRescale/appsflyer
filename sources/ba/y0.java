package ba;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager2.widget.ViewPager2;

/* loaded from: classes.dex */
public abstract class y0 extends m4.m {

    /* renamed from: s, reason: collision with root package name */
    public final ViewPager2 f6701s;

    /* renamed from: t, reason: collision with root package name */
    public final TextView f6702t;

    /* renamed from: u, reason: collision with root package name */
    public final Toolbar f6703u;

    public y0(Object obj, View view, ViewPager2 viewPager2, TextView textView, Toolbar toolbar) {
        super(obj, view, 0);
        this.f6701s = viewPager2;
        this.f6702t = textView;
        this.f6703u = toolbar;
    }
}
