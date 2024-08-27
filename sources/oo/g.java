package oo;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* loaded from: classes2.dex */
public final class g extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30177a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f30178b;

    public /* synthetic */ g(h hVar, int i10) {
        this.f30177a = i10;
        this.f30178b = hVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30177a) {
            case 1:
                super.onAnimationEnd(animator);
                h hVar = this.f30178b;
                hVar.c();
                u7.c cVar = hVar.f30191k;
                if (cVar != null) {
                    cVar.a((o) hVar.f23559a);
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
        switch (this.f30177a) {
            case 0:
                super.onAnimationRepeat(animator);
                h hVar = this.f30178b;
                hVar.f30188h = (hVar.f30188h + 4) % hVar.f30187g.f30169c.length;
                return;
            default:
                super.onAnimationRepeat(animator);
                return;
        }
    }
}
