package ba;

import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes.dex */
public abstract class c0 extends m4.m {

    /* renamed from: s, reason: collision with root package name */
    public final ViewPager2 f4328s;

    /* renamed from: t, reason: collision with root package name */
    public final ConstraintLayout f4329t;

    /* renamed from: u, reason: collision with root package name */
    public final TabLayout f4330u;

    /* renamed from: v, reason: collision with root package name */
    public final MaterialTextView f4331v;

    /* renamed from: w, reason: collision with root package name */
    public final Toolbar f4332w;

    public c0(Object obj, View view, ViewPager2 viewPager2, ConstraintLayout constraintLayout, TabLayout tabLayout, MaterialTextView materialTextView, Toolbar toolbar) {
        super(obj, view, 0);
        this.f4328s = viewPager2;
        this.f4329t = constraintLayout;
        this.f4330u = tabLayout;
        this.f4331v = materialTextView;
        this.f4332w = toolbar;
    }
}
