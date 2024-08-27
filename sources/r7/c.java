package r7;

import android.animation.Animator;

/* loaded from: classes.dex */
public final class c implements Animator.AnimatorListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f33410a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f33411b;

    public c(e eVar, d dVar) {
        this.f33411b = eVar;
        this.f33410a = dVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        e eVar = this.f33411b;
        d dVar = this.f33410a;
        eVar.a(1.0f, dVar, true);
        dVar.f33422k = dVar.f33416e;
        dVar.f33423l = dVar.f33417f;
        dVar.f33424m = dVar.f33418g;
        dVar.a((dVar.f33421j + 1) % dVar.f33420i.length);
        if (eVar.f33441f) {
            eVar.f33441f = false;
            animator.cancel();
            animator.setDuration(1332L);
            animator.start();
            if (dVar.f33425n) {
                dVar.f33425n = false;
                return;
            }
            return;
        }
        eVar.f33440e += 1.0f;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f33411b.f33440e = s0.g.f34069a;
    }
}
