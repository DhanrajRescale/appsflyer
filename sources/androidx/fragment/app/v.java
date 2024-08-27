package androidx.fragment.app;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class v extends d0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g0 f1844a;

    public v(g0 g0Var) {
        this.f1844a = g0Var;
    }

    @Override // androidx.fragment.app.d0
    public final void a() {
        Bundle bundle;
        g0 g0Var = this.f1844a;
        g0Var.mSavedStateRegistryController.a();
        androidx.lifecycle.u0.d(g0Var);
        Bundle bundle2 = g0Var.mSavedFragmentState;
        if (bundle2 != null) {
            bundle = bundle2.getBundle("registryState");
        } else {
            bundle = null;
        }
        g0Var.mSavedStateRegistryController.b(bundle);
    }
}
