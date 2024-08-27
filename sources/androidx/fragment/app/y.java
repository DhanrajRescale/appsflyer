package androidx.fragment.app;

import android.view.View;

/* loaded from: classes.dex */
public final class y implements androidx.lifecycle.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g0 f1857a;

    public y(g0 g0Var) {
        this.f1857a = g0Var;
    }

    @Override // androidx.lifecycle.r
    public final void c(androidx.lifecycle.t tVar, androidx.lifecycle.m mVar) {
        View view;
        if (mVar == androidx.lifecycle.m.ON_STOP && (view = this.f1857a.mView) != null) {
            view.cancelPendingInputEvents();
        }
    }
}
