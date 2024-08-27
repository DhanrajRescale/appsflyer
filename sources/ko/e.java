package ko;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* loaded from: classes2.dex */
public final class e extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f23304a = false;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ wn.e f23305b = null;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f23306c;

    public e(k kVar) {
        this.f23306c = kVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        k kVar = this.f23306c;
        kVar.f23345r = 0;
        kVar.f23339l = null;
        wn.e eVar = this.f23305b;
        if (eVar == null) {
            return;
        }
        a3.a.u(eVar.f39327b);
        throw null;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        k kVar = this.f23306c;
        kVar.f23346s.a(0, this.f23304a);
        kVar.f23345r = 2;
        kVar.f23339l = animator;
    }
}
