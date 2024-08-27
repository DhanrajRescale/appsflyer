package k7;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* loaded from: classes.dex */
public final class l extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22463a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y1 f22464b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f22465c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f22466d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q f22467e;

    public l(q qVar, y1 y1Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f22467e = qVar;
        this.f22464b = y1Var;
        this.f22466d = viewPropertyAnimator;
        this.f22465c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.f22463a) {
            case 1:
                this.f22465c.setAlpha(1.0f);
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i10 = this.f22463a;
        y1 y1Var = this.f22464b;
        q qVar = this.f22467e;
        ViewPropertyAnimator viewPropertyAnimator = this.f22466d;
        switch (i10) {
            case 0:
                viewPropertyAnimator.setListener(null);
                this.f22465c.setAlpha(1.0f);
                qVar.c(y1Var);
                qVar.f22552q.remove(y1Var);
                qVar.i();
                return;
            default:
                viewPropertyAnimator.setListener(null);
                qVar.c(y1Var);
                qVar.f22550o.remove(y1Var);
                qVar.i();
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        int i10 = this.f22463a;
        q qVar = this.f22467e;
        switch (i10) {
            case 0:
                qVar.getClass();
                return;
            default:
                qVar.getClass();
                return;
        }
    }

    public l(q qVar, y1 y1Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f22467e = qVar;
        this.f22464b = y1Var;
        this.f22465c = view;
        this.f22466d = viewPropertyAnimator;
    }
}
