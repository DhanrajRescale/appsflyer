package vr;

import android.animation.Animator;
import android.graphics.Matrix;
import com.jsibbold.zoomage.ZoomageView;

/* loaded from: classes2.dex */
public final class c implements Animator.AnimatorListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Matrix f38288a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ZoomageView f38289b;

    public c(ZoomageView zoomageView, Matrix matrix) {
        this.f38289b = zoomageView;
        this.f38288a = matrix;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final /* bridge */ /* synthetic */ void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f38289b.setImageMatrix(this.f38288a);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final /* bridge */ /* synthetic */ void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final /* bridge */ /* synthetic */ void onAnimationStart(Animator animator) {
    }
}
