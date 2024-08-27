package ba;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.assetgro.stockgro.ui.profile.statistics.UserStatisticsViewModel;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes.dex */
public abstract class wp extends m4.m {
    public final MaterialTextView A;
    public final MaterialTextView B;
    public final MaterialTextView C;
    public final MaterialTextView D;
    public final ImageView E;
    public final MaterialTextView F;
    public final MaterialTextView G;
    public final ConstraintLayout H;
    public UserStatisticsViewModel I;

    /* renamed from: s, reason: collision with root package name */
    public final MaterialButton f6560s;

    /* renamed from: t, reason: collision with root package name */
    public final View f6561t;

    /* renamed from: u, reason: collision with root package name */
    public final View f6562u;

    /* renamed from: v, reason: collision with root package name */
    public final ViewPager2 f6563v;

    /* renamed from: w, reason: collision with root package name */
    public final LinearLayout f6564w;

    /* renamed from: x, reason: collision with root package name */
    public final TextView f6565x;

    /* renamed from: y, reason: collision with root package name */
    public final SwipeRefreshLayout f6566y;

    /* renamed from: z, reason: collision with root package name */
    public final TabLayout f6567z;

    public wp(Object obj, View view, MaterialButton materialButton, View view2, View view3, ViewPager2 viewPager2, LinearLayout linearLayout, TextView textView, SwipeRefreshLayout swipeRefreshLayout, TabLayout tabLayout, MaterialTextView materialTextView, MaterialTextView materialTextView2, MaterialTextView materialTextView3, MaterialTextView materialTextView4, ImageView imageView, MaterialTextView materialTextView5, MaterialTextView materialTextView6, ConstraintLayout constraintLayout) {
        super(obj, view, 2);
        this.f6560s = materialButton;
        this.f6561t = view2;
        this.f6562u = view3;
        this.f6563v = viewPager2;
        this.f6564w = linearLayout;
        this.f6565x = textView;
        this.f6566y = swipeRefreshLayout;
        this.f6567z = tabLayout;
        this.A = materialTextView;
        this.B = materialTextView2;
        this.C = materialTextView3;
        this.D = materialTextView4;
        this.E = imageView;
        this.F = materialTextView5;
        this.G = materialTextView6;
        this.H = constraintLayout;
    }
}
