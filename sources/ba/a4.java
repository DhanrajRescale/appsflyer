package ba;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import me.relex.circleindicator.CircleIndicator;

/* loaded from: classes.dex */
public abstract class a4 extends m4.m {

    /* renamed from: s, reason: collision with root package name */
    public final ImageView f4161s;

    /* renamed from: t, reason: collision with root package name */
    public final ImageView f4162t;

    /* renamed from: u, reason: collision with root package name */
    public final LinearLayout f4163u;

    /* renamed from: v, reason: collision with root package name */
    public final CircleIndicator f4164v;

    /* renamed from: w, reason: collision with root package name */
    public final ViewPager f4165w;

    /* renamed from: x, reason: collision with root package name */
    public final TextView f4166x;

    public a4(Object obj, View view, ImageView imageView, ImageView imageView2, LinearLayout linearLayout, CircleIndicator circleIndicator, ViewPager viewPager, TextView textView) {
        super(obj, view, 0);
        this.f4161s = imageView;
        this.f4162t = imageView2;
        this.f4163u = linearLayout;
        this.f4164v = circleIndicator;
        this.f4165w = viewPager;
        this.f4166x = textView;
    }
}
