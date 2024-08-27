package d4;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* loaded from: classes.dex */
public final class z1 extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13870a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f13871b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f13872c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f13873d;

    public /* synthetic */ z1(int i10, Object obj, Object obj2, Object obj3) {
        this.f13870a = i10;
        this.f13873d = obj;
        this.f13872c = obj2;
        this.f13871b = obj3;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.f13870a) {
            case 0:
                ((c2) this.f13872c).a((View) this.f13871b);
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i10 = this.f13870a;
        Object obj = this.f13872c;
        switch (i10) {
            case 0:
                ((c2) obj).c();
                return;
            default:
                p2 p2Var = (p2) obj;
                p2Var.f13805a.d(1.0f);
                k2.e((View) this.f13871b, p2Var);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f13870a) {
            case 0:
                ((c2) this.f13872c).b();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
