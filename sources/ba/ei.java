package ba;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.button.MaterialButton;
import me.relex.circleindicator.CircleIndicator3;

/* loaded from: classes.dex */
public abstract class ei extends m4.m {

    /* renamed from: s, reason: collision with root package name */
    public final MaterialButton f4617s;

    /* renamed from: t, reason: collision with root package name */
    public final ViewPager2 f4618t;

    /* renamed from: u, reason: collision with root package name */
    public final ConstraintLayout f4619u;

    /* renamed from: v, reason: collision with root package name */
    public final TextView f4620v;

    /* renamed from: w, reason: collision with root package name */
    public final LinearLayout f4621w;

    /* renamed from: x, reason: collision with root package name */
    public final CircleIndicator3 f4622x;

    public ei(Object obj, View view, MaterialButton materialButton, ViewPager2 viewPager2, ConstraintLayout constraintLayout, TextView textView, LinearLayout linearLayout, CircleIndicator3 circleIndicator3) {
        super(obj, view, 0);
        this.f4617s = materialButton;
        this.f4618t = viewPager2;
        this.f4619u = constraintLayout;
        this.f4620v = textView;
        this.f4621w = linearLayout;
        this.f4622x = circleIndicator3;
    }
}
