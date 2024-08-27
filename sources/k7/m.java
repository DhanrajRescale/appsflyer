package k7;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* loaded from: classes.dex */
public final class m extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y1 f22477a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f22478b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f22479c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f22480d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f22481e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ q f22482f;

    public m(q qVar, y1 y1Var, int i10, View view, int i11, ViewPropertyAnimator viewPropertyAnimator) {
        this.f22482f = qVar;
        this.f22477a = y1Var;
        this.f22478b = i10;
        this.f22479c = view;
        this.f22480d = i11;
        this.f22481e = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i10 = this.f22478b;
        View view = this.f22479c;
        if (i10 != 0) {
            view.setTranslationX(s0.g.f34069a);
        }
        if (this.f22480d != 0) {
            view.setTranslationY(s0.g.f34069a);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f22481e.setListener(null);
        q qVar = this.f22482f;
        y1 y1Var = this.f22477a;
        qVar.c(y1Var);
        qVar.f22551p.remove(y1Var);
        qVar.i();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f22482f.getClass();
    }
}
