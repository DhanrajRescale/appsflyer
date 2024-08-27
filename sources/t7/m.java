package t7;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* loaded from: classes.dex */
public final class m extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f35493a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f35494b;

    public /* synthetic */ m(Object obj, t.f fVar) {
        this.f35494b = obj;
        this.f35493a = fVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ((t.f) this.f35493a).remove(animator);
        ((p) this.f35494b).f35515m.remove(animator);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        ((p) this.f35494b).f35515m.add(animator);
    }
}
