package ko;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* loaded from: classes2.dex */
public final class d extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public boolean f23300a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f23301b = false;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ wn.e f23302c = null;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k f23303d;

    public d(k kVar) {
        this.f23303d = kVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f23300a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i10;
        k kVar = this.f23303d;
        kVar.f23345r = 0;
        kVar.f23339l = null;
        if (!this.f23300a) {
            boolean z10 = this.f23301b;
            if (z10) {
                i10 = 8;
            } else {
                i10 = 4;
            }
            kVar.f23346s.a(i10, z10);
            wn.e eVar = this.f23302c;
            if (eVar != null) {
                a3.a.u(eVar.f39327b);
                throw null;
            }
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        k kVar = this.f23303d;
        kVar.f23346s.a(0, this.f23301b);
        kVar.f23345r = 1;
        kVar.f23339l = animator;
        this.f23300a = false;
    }
}
