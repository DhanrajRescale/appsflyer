package wo;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.view.ViewPropertyAnimator;
import com.google.android.material.snackbar.SnackbarContentLayout;

/* loaded from: classes2.dex */
public final class a extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39353a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f39354b;

    public /* synthetic */ a(k kVar, int i10, int i11) {
        this.f39353a = i11;
        this.f39354b = kVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i10 = this.f39353a;
        k kVar = this.f39354b;
        switch (i10) {
            case 0:
                kVar.c();
                return;
            default:
                kVar.c();
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f39353a) {
            case 1:
                k kVar = this.f39354b;
                SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) kVar.f39391j;
                snackbarContentLayout.f11432a.setAlpha(1.0f);
                ViewPropertyAnimator alpha = snackbarContentLayout.f11432a.animate().alpha(s0.g.f34069a);
                long j10 = kVar.f39383b;
                ViewPropertyAnimator duration = alpha.setDuration(j10);
                TimeInterpolator timeInterpolator = snackbarContentLayout.f11434c;
                long j11 = 0;
                duration.setInterpolator(timeInterpolator).setStartDelay(j11).start();
                if (snackbarContentLayout.f11433b.getVisibility() == 0) {
                    snackbarContentLayout.f11433b.setAlpha(1.0f);
                    snackbarContentLayout.f11433b.animate().alpha(s0.g.f34069a).setDuration(j10).setInterpolator(timeInterpolator).setStartDelay(j11).start();
                    return;
                }
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
