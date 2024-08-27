package com.google.android.material.behavior;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.assetgro.stockgro.prod.R;
import java.util.Iterator;
import java.util.LinkedHashSet;
import m.d;
import o3.b;
import vn.a;

/* loaded from: classes2.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends b {

    /* renamed from: b, reason: collision with root package name */
    public int f11152b;

    /* renamed from: c, reason: collision with root package name */
    public int f11153c;

    /* renamed from: d, reason: collision with root package name */
    public TimeInterpolator f11154d;

    /* renamed from: e, reason: collision with root package name */
    public TimeInterpolator f11155e;

    /* renamed from: h, reason: collision with root package name */
    public ViewPropertyAnimator f11158h;

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f11151a = new LinkedHashSet();

    /* renamed from: f, reason: collision with root package name */
    public int f11156f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f11157g = 2;

    public HideBottomViewOnScrollBehavior() {
    }

    @Override // o3.b
    public boolean h(CoordinatorLayout coordinatorLayout, View view, int i10) {
        this.f11156f = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        this.f11152b = dp.b.E1(view.getContext(), R.attr.motionDurationLong2, 225);
        this.f11153c = dp.b.E1(view.getContext(), R.attr.motionDurationMedium4, 175);
        this.f11154d = dp.b.F1(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, a.f38183d);
        this.f11155e = dp.b.F1(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, a.f38182c);
        return false;
    }

    @Override // o3.b
    public final void l(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int[] iArr) {
        LinkedHashSet linkedHashSet = this.f11151a;
        if (i10 > 0) {
            if (this.f11157g != 1) {
                ViewPropertyAnimator viewPropertyAnimator = this.f11158h;
                if (viewPropertyAnimator != null) {
                    viewPropertyAnimator.cancel();
                    view.clearAnimation();
                }
                this.f11157g = 1;
                Iterator it = linkedHashSet.iterator();
                if (!it.hasNext()) {
                    this.f11158h = view.animate().translationY(this.f11156f).setInterpolator(this.f11155e).setDuration(this.f11153c).setListener(new d(this, 3));
                    return;
                }
                a3.a.u(it.next());
                throw null;
            }
            return;
        }
        if (i10 < 0 && this.f11157g != 2) {
            ViewPropertyAnimator viewPropertyAnimator2 = this.f11158h;
            if (viewPropertyAnimator2 != null) {
                viewPropertyAnimator2.cancel();
                view.clearAnimation();
            }
            this.f11157g = 2;
            Iterator it2 = linkedHashSet.iterator();
            if (!it2.hasNext()) {
                this.f11158h = view.animate().translationY(0).setInterpolator(this.f11154d).setDuration(this.f11152b).setListener(new d(this, 3));
                return;
            }
            a3.a.u(it2.next());
            throw null;
        }
    }

    @Override // o3.b
    public boolean p(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11) {
        return i10 == 2;
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
    }
}
