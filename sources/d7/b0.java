package d7;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class b0 extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13960a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d0 f13961b;

    public /* synthetic */ b0(d0 d0Var, int i10) {
        this.f13960a = i10;
        this.f13961b = d0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i10 = this.f13960a;
        d0 d0Var = this.f13961b;
        switch (i10) {
            case 0:
                View view = d0Var.f13979b;
                if (view != null) {
                    view.setVisibility(4);
                }
                ViewGroup viewGroup = d0Var.f13980c;
                if (viewGroup != null) {
                    viewGroup.setVisibility(4);
                }
                ViewGroup viewGroup2 = d0Var.f13982e;
                if (viewGroup2 != null) {
                    viewGroup2.setVisibility(4);
                    return;
                }
                return;
            case 1:
            default:
                super.onAnimationEnd(animator);
                return;
            case 2:
                d0Var.j(0);
                return;
            case 3:
                d0Var.j(0);
                return;
            case 4:
                ViewGroup viewGroup3 = d0Var.f13983f;
                if (viewGroup3 != null) {
                    viewGroup3.setVisibility(4);
                    return;
                }
                return;
            case 5:
                ViewGroup viewGroup4 = d0Var.f13985h;
                if (viewGroup4 != null) {
                    viewGroup4.setVisibility(4);
                    return;
                }
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        int i10 = this.f13960a;
        int i11 = 4;
        d0 d0Var = this.f13961b;
        switch (i10) {
            case 0:
                View view = d0Var.f13987j;
                if ((view instanceof f) && !d0Var.A) {
                    f fVar = (f) view;
                    ValueAnimator valueAnimator = fVar.E;
                    if (valueAnimator.isStarted()) {
                        valueAnimator.cancel();
                    }
                    valueAnimator.setFloatValues(fVar.F, s0.g.f34069a);
                    valueAnimator.setDuration(250L);
                    valueAnimator.start();
                    return;
                }
                return;
            case 1:
                View view2 = d0Var.f13979b;
                if (view2 != null) {
                    view2.setVisibility(0);
                }
                ViewGroup viewGroup = d0Var.f13980c;
                if (viewGroup != null) {
                    viewGroup.setVisibility(0);
                }
                ViewGroup viewGroup2 = d0Var.f13982e;
                if (viewGroup2 != null) {
                    if (d0Var.A) {
                        i11 = 0;
                    }
                    viewGroup2.setVisibility(i11);
                }
                View view3 = d0Var.f13987j;
                if ((view3 instanceof f) && !d0Var.A) {
                    f fVar2 = (f) view3;
                    ValueAnimator valueAnimator2 = fVar2.E;
                    if (valueAnimator2.isStarted()) {
                        valueAnimator2.cancel();
                    }
                    fVar2.G = false;
                    valueAnimator2.setFloatValues(fVar2.F, 1.0f);
                    valueAnimator2.setDuration(250L);
                    valueAnimator2.start();
                    return;
                }
                return;
            case 2:
                d0Var.j(4);
                return;
            case 3:
                d0Var.j(4);
                return;
            case 4:
                ViewGroup viewGroup3 = d0Var.f13985h;
                if (viewGroup3 != null) {
                    viewGroup3.setVisibility(0);
                    ViewGroup viewGroup4 = d0Var.f13985h;
                    viewGroup4.setTranslationX(viewGroup4.getWidth());
                    viewGroup4.scrollTo(viewGroup4.getWidth(), 0);
                    return;
                }
                return;
            default:
                ViewGroup viewGroup5 = d0Var.f13983f;
                if (viewGroup5 != null) {
                    viewGroup5.setVisibility(0);
                    return;
                }
                return;
        }
    }
}
