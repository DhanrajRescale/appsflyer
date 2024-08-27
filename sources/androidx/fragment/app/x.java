package androidx.fragment.app;

import android.view.View;

/* loaded from: classes.dex */
public final class x extends l0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g0 f1856a;

    public x(g0 g0Var) {
        this.f1856a = g0Var;
    }

    @Override // androidx.fragment.app.l0
    public final View b(int i10) {
        g0 g0Var = this.f1856a;
        View view = g0Var.mView;
        if (view != null) {
            return view.findViewById(i10);
        }
        throw new IllegalStateException(a3.a.e("Fragment ", g0Var, " does not have a view"));
    }

    @Override // androidx.fragment.app.l0
    public final boolean c() {
        if (this.f1856a.mView != null) {
            return true;
        }
        return false;
    }
}
