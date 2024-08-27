package wo;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.view.ViewPropertyAnimator;
import com.google.android.material.snackbar.SnackbarContentLayout;

/* loaded from: classes2.dex */
public final class c extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39357a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f39358b;

    public /* synthetic */ c(k kVar, int i10) {
        this.f39357a = i10;
        this.f39358b = kVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i10 = this.f39357a;
        k kVar = this.f39358b;
        switch (i10) {
            case 0:
                kVar.d();
                return;
            default:
                kVar.d();
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f39357a) {
            case 0:
                k kVar = this.f39358b;
                l lVar = kVar.f39391j;
                int i10 = kVar.f39384c;
                int i11 = kVar.f39382a;
                int i12 = i10 - i11;
                SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) lVar;
                snackbarContentLayout.f11432a.setAlpha(s0.g.f34069a);
                long j10 = i11;
                ViewPropertyAnimator duration = snackbarContentLayout.f11432a.animate().alpha(1.0f).setDuration(j10);
                TimeInterpolator timeInterpolator = snackbarContentLayout.f11434c;
                long j11 = i12;
                duration.setInterpolator(timeInterpolator).setStartDelay(j11).start();
                if (snackbarContentLayout.f11433b.getVisibility() == 0) {
                    snackbarContentLayout.f11433b.setAlpha(s0.g.f34069a);
                    snackbarContentLayout.f11433b.animate().alpha(1.0f).setDuration(j10).setInterpolator(timeInterpolator).setStartDelay(j11).start();
                    return;
                }
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
