package k7;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class z extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22648a = 1;

    /* renamed from: b, reason: collision with root package name */
    public boolean f22649b = false;

    /* renamed from: c, reason: collision with root package name */
    public final Object f22650c;

    public z(View view) {
        this.f22650c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.f22648a) {
            case 0:
                this.f22649b = true;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i10 = this.f22648a;
        Object obj = this.f22650c;
        switch (i10) {
            case 0:
                if (this.f22649b) {
                    this.f22649b = false;
                    return;
                }
                b0 b0Var = (b0) obj;
                if (((Float) b0Var.f22304z.getAnimatedValue()).floatValue() == s0.g.f34069a) {
                    b0Var.A = 0;
                    b0Var.m(0);
                    return;
                } else {
                    b0Var.A = 2;
                    b0Var.f22297s.invalidate();
                    return;
                }
            default:
                View view = (View) obj;
                t7.y.f35540a.u(view, 1.0f);
                if (this.f22649b) {
                    view.setLayerType(0, null);
                    return;
                }
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f22648a) {
            case 1:
                View view = (View) this.f22650c;
                WeakHashMap weakHashMap = d4.n1.f13788a;
                if (d4.v0.h(view) && view.getLayerType() == 0) {
                    this.f22649b = true;
                    view.setLayerType(2, null);
                    return;
                }
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public z(b0 b0Var) {
        this.f22650c = b0Var;
    }
}
