package cp;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* loaded from: classes2.dex */
public final class b extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f13033a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f13034b;

    public b(boolean z10, View view) {
        this.f13033a = z10;
        this.f13034b = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (!this.f13033a) {
            this.f13034b.setVisibility(4);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        if (this.f13033a) {
            this.f13034b.setVisibility(0);
        }
    }
}
