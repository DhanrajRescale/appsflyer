package d7;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* loaded from: classes.dex */
public final class c0 extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13968a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f13969b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d0 f13970c;

    public /* synthetic */ c0(d0 d0Var, x xVar, int i10) {
        this.f13968a = i10;
        this.f13970c = d0Var;
        this.f13969b = xVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i10 = this.f13968a;
        x xVar = this.f13969b;
        d0 d0Var = this.f13970c;
        switch (i10) {
            case 0:
                d0Var.j(1);
                if (d0Var.B) {
                    xVar.post(d0Var.f13996s);
                    d0Var.B = false;
                    return;
                }
                return;
            case 1:
                d0Var.j(2);
                if (d0Var.B) {
                    xVar.post(d0Var.f13996s);
                    d0Var.B = false;
                    return;
                }
                return;
            default:
                d0Var.j(2);
                if (d0Var.B) {
                    xVar.post(d0Var.f13996s);
                    d0Var.B = false;
                    return;
                }
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        int i10 = this.f13968a;
        d0 d0Var = this.f13970c;
        switch (i10) {
            case 0:
                d0Var.j(3);
                return;
            case 1:
                d0Var.j(3);
                return;
            default:
                d0Var.j(3);
                return;
        }
    }
}
