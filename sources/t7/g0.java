package t7;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class g0 extends AnimatorListenerAdapter implements o {

    /* renamed from: a, reason: collision with root package name */
    public final View f35468a;

    /* renamed from: b, reason: collision with root package name */
    public final int f35469b;

    /* renamed from: c, reason: collision with root package name */
    public final ViewGroup f35470c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f35472e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f35473f = false;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f35471d = true;

    public g0(View view, int i10) {
        this.f35468a = view;
        this.f35469b = i10;
        this.f35470c = (ViewGroup) view.getParent();
        f(true);
    }

    @Override // t7.o
    public final void a() {
        f(false);
    }

    @Override // t7.o
    public final void b() {
    }

    @Override // t7.o
    public final void c(p pVar) {
        if (!this.f35473f) {
            y.f35540a.r(this.f35468a, this.f35469b);
            ViewGroup viewGroup = this.f35470c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        f(false);
        pVar.w(this);
    }

    @Override // t7.o
    public final void d() {
        f(true);
    }

    @Override // t7.o
    public final void e(p pVar) {
    }

    public final void f(boolean z10) {
        ViewGroup viewGroup;
        if (this.f35471d && this.f35472e != z10 && (viewGroup = this.f35470c) != null) {
            this.f35472e = z10;
            zq.f.j0(viewGroup, z10);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f35473f = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (!this.f35473f) {
            y.f35540a.r(this.f35468a, this.f35469b);
            ViewGroup viewGroup = this.f35470c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        f(false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        if (!this.f35473f) {
            y.f35540a.r(this.f35468a, this.f35469b);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        if (!this.f35473f) {
            y.f35540a.r(this.f35468a, 0);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
