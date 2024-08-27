package zo;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* loaded from: classes2.dex */
public final class b extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42582a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f42583b;

    public /* synthetic */ b(c cVar, int i10) {
        this.f42582a = i10;
        this.f42583b = cVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f42582a) {
            case 1:
                this.f42583b.f42638b.g(false);
                return;
            default:
                super.onAnimationEnd(animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f42582a) {
            case 0:
                this.f42583b.f42638b.g(true);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
