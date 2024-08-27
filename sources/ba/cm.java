package ba;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.ui.platform.ComposeView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.assetgro.stockgro.widget.WrapContentViewPager;
import me.relex.circleindicator.CircleIndicator;

/* loaded from: classes.dex */
public abstract class cm extends m4.m {
    public final CircleIndicator A;
    public final TextView B;
    public final TextView C;
    public final SwipeRefreshLayout D;
    public final Toolbar E;

    /* renamed from: s, reason: collision with root package name */
    public final ComposeView f4385s;

    /* renamed from: t, reason: collision with root package name */
    public final WrapContentViewPager f4386t;

    /* renamed from: u, reason: collision with root package name */
    public final LinearLayout f4387u;

    /* renamed from: v, reason: collision with root package name */
    public final CircleIndicator f4388v;

    /* renamed from: w, reason: collision with root package name */
    public final TextView f4389w;

    /* renamed from: x, reason: collision with root package name */
    public final TextView f4390x;

    /* renamed from: y, reason: collision with root package name */
    public final WrapContentViewPager f4391y;

    /* renamed from: z, reason: collision with root package name */
    public final LinearLayout f4392z;

    public cm(Object obj, View view, ComposeView composeView, WrapContentViewPager wrapContentViewPager, LinearLayout linearLayout, CircleIndicator circleIndicator, TextView textView, TextView textView2, WrapContentViewPager wrapContentViewPager2, LinearLayout linearLayout2, CircleIndicator circleIndicator2, TextView textView3, TextView textView4, SwipeRefreshLayout swipeRefreshLayout, Toolbar toolbar) {
        super(obj, view, 0);
        this.f4385s = composeView;
        this.f4386t = wrapContentViewPager;
        this.f4387u = linearLayout;
        this.f4388v = circleIndicator;
        this.f4389w = textView;
        this.f4390x = textView2;
        this.f4391y = wrapContentViewPager2;
        this.f4392z = linearLayout2;
        this.A = circleIndicator2;
        this.B = textView3;
        this.C = textView4;
        this.D = swipeRefreshLayout;
        this.E = toolbar;
    }
}
