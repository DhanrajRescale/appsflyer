package ko;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;

/* loaded from: classes2.dex */
public abstract class j extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public boolean f23323a;

    /* renamed from: b, reason: collision with root package name */
    public float f23324b;

    /* renamed from: c, reason: collision with root package name */
    public float f23325c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k f23326d;

    public j(m mVar) {
        this.f23326d = mVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        float f10 = (int) this.f23325c;
        to.h hVar = this.f23326d.f23329b;
        if (hVar != null) {
            hVar.m(f10);
        }
        this.f23323a = false;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f10;
        float f11;
        float f12;
        boolean z10 = this.f23323a;
        k kVar = this.f23326d;
        if (!z10) {
            to.h hVar = kVar.f23329b;
            float f13 = s0.g.f34069a;
            if (hVar == null) {
                f10 = 0.0f;
            } else {
                f10 = hVar.f36253a.f36244n;
            }
            this.f23324b = f10;
            i iVar = (i) this;
            int i10 = iVar.f23321e;
            k kVar2 = iVar.f23322f;
            switch (i10) {
                case 0:
                    break;
                case 1:
                    f11 = kVar2.f23335h;
                    f12 = kVar2.f23336i;
                    f13 = f11 + f12;
                    break;
                case 2:
                    f11 = kVar2.f23335h;
                    f12 = kVar2.f23337j;
                    f13 = f11 + f12;
                    break;
                default:
                    f13 = kVar2.f23335h;
                    break;
            }
            this.f23325c = f13;
            this.f23323a = true;
        }
        float f14 = this.f23324b;
        float animatedFraction = (int) ((valueAnimator.getAnimatedFraction() * (this.f23325c - f14)) + f14);
        to.h hVar2 = kVar.f23329b;
        if (hVar2 != null) {
            hVar2.m(animatedFraction);
        }
    }
}
