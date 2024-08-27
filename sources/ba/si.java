package ba;

import android.view.View;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.button.MaterialButton;
import me.relex.circleindicator.CircleIndicator;

/* loaded from: classes.dex */
public abstract class si extends m4.m {

    /* renamed from: s, reason: collision with root package name */
    public final TextView f6088s;

    /* renamed from: t, reason: collision with root package name */
    public final ViewPager f6089t;

    /* renamed from: u, reason: collision with root package name */
    public final TextView f6090u;

    /* renamed from: v, reason: collision with root package name */
    public final CircleIndicator f6091v;

    /* renamed from: w, reason: collision with root package name */
    public final MaterialButton f6092w;

    public si(Object obj, View view, TextView textView, ViewPager viewPager, TextView textView2, CircleIndicator circleIndicator, MaterialButton materialButton) {
        super(obj, view, 0);
        this.f6088s = textView;
        this.f6089t = viewPager;
        this.f6090u = textView2;
        this.f6091v = circleIndicator;
        this.f6092w = materialButton;
    }
}
