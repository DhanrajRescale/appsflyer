package oo;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* loaded from: classes2.dex */
public final class r extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30230a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f30231b;

    public /* synthetic */ r(s sVar, int i10) {
        this.f30230a = i10;
        this.f30231b = sVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30230a) {
            case 1:
                super.onAnimationEnd(animator);
                s sVar = this.f30231b;
                sVar.c();
                u7.c cVar = sVar.f30242k;
                if (cVar != null) {
                    cVar.a((o) sVar.f23559a);
                    return;
                }
                return;
            default:
                super.onAnimationEnd(animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        switch (this.f30230a) {
            case 0:
                super.onAnimationRepeat(animator);
                s sVar = this.f30231b;
                sVar.f30239h = (sVar.f30239h + 1) % sVar.f30238g.f30169c.length;
                sVar.f30240i = true;
                return;
            default:
                super.onAnimationRepeat(animator);
                return;
        }
    }
}
