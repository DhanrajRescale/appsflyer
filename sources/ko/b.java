package ko;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* loaded from: classes2.dex */
public final class b extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f23297a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f23298b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f23299c;

    public b(boolean z10, View view, View view2) {
        this.f23297a = z10;
        this.f23298b = view;
        this.f23299c = view2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        super.onAnimationCancel(animator);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (!this.f23297a) {
            ((View) this.f23298b).setVisibility(4);
            View view = (View) this.f23299c;
            view.setAlpha(1.0f);
            view.setVisibility(0);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        if (this.f23297a) {
            ((View) this.f23298b).setVisibility(0);
            View view = (View) this.f23299c;
            view.setAlpha(s0.g.f34069a);
            view.setVisibility(4);
        }
    }
}
