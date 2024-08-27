package k7;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* loaded from: classes.dex */
public final class n extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22487a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f22488b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f22489c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ View f22490d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q f22491e;

    public /* synthetic */ n(q qVar, o oVar, ViewPropertyAnimator viewPropertyAnimator, View view, int i10) {
        this.f22487a = i10;
        this.f22491e = qVar;
        this.f22488b = oVar;
        this.f22489c = viewPropertyAnimator;
        this.f22490d = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i10 = this.f22487a;
        q qVar = this.f22491e;
        o oVar = this.f22488b;
        View view = this.f22490d;
        ViewPropertyAnimator viewPropertyAnimator = this.f22489c;
        switch (i10) {
            case 0:
                viewPropertyAnimator.setListener(null);
                view.setAlpha(1.0f);
                view.setTranslationX(s0.g.f34069a);
                view.setTranslationY(s0.g.f34069a);
                qVar.c(oVar.f22504a);
                qVar.f22553r.remove(oVar.f22504a);
                qVar.i();
                return;
            default:
                viewPropertyAnimator.setListener(null);
                view.setAlpha(1.0f);
                view.setTranslationX(s0.g.f34069a);
                view.setTranslationY(s0.g.f34069a);
                qVar.c(oVar.f22505b);
                qVar.f22553r.remove(oVar.f22505b);
                qVar.i();
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        int i10 = this.f22487a;
        q qVar = this.f22491e;
        o oVar = this.f22488b;
        switch (i10) {
            case 0:
                y1 y1Var = oVar.f22504a;
                qVar.getClass();
                return;
            default:
                y1 y1Var2 = oVar.f22505b;
                qVar.getClass();
                return;
        }
    }
}
