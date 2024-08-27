package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class l extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n f1747a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f1748b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f1749c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f2 f1750d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i f1751e;

    public l(n nVar, View view, boolean z10, f2 f2Var, i iVar) {
        this.f1747a = nVar;
        this.f1748b = view;
        this.f1749c = z10;
        this.f1750d = f2Var;
        this.f1751e = iVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator anim) {
        Intrinsics.checkNotNullParameter(anim, "anim");
        ViewGroup viewGroup = this.f1747a.f1769a;
        View viewToAnimate = this.f1748b;
        viewGroup.endViewTransition(viewToAnimate);
        boolean z10 = this.f1749c;
        f2 f2Var = this.f1750d;
        if (z10) {
            e2 e2Var = f2Var.f1696a;
            Intrinsics.checkNotNullExpressionValue(viewToAnimate, "viewToAnimate");
            e2Var.a(viewToAnimate);
        }
        this.f1751e.a();
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Animator from operation " + f2Var + " has ended.");
        }
    }
}
