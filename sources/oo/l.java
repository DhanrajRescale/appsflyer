package oo;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class l extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30202a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f30203b;

    public /* synthetic */ l(m mVar, int i10) {
        this.f30202a = i10;
        this.f30203b = mVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30202a) {
            case 1:
                super.onAnimationEnd(animator);
                m mVar = this.f30203b;
                m.a(mVar);
                ArrayList arrayList = mVar.f30210f;
                if (arrayList != null && !mVar.f30211g) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((u7.c) it.next()).a(mVar);
                    }
                    return;
                }
                return;
            default:
                super.onAnimationEnd(animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f30202a) {
            case 0:
                super.onAnimationStart(animator);
                m mVar = this.f30203b;
                ArrayList arrayList = mVar.f30210f;
                if (arrayList != null && !mVar.f30211g) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((u7.c) it.next()).b(mVar);
                    }
                    return;
                }
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
