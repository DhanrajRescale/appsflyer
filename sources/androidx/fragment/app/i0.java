package androidx.fragment.app;

import android.view.View;
import android.view.Window;

/* loaded from: classes.dex */
public final class i0 extends n0 implements r3.n, r3.o, q3.w0, q3.x0, androidx.lifecycle.i1, androidx.activity.y, e.i, o7.f, h1, d4.r {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j0 f1717e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(j0 j0Var) {
        super(j0Var);
        this.f1717e = j0Var;
    }

    @Override // androidx.fragment.app.h1
    public final void a(d1 d1Var, g0 g0Var) {
        this.f1717e.onAttachFragment(g0Var);
    }

    @Override // d4.r
    public final void addMenuProvider(d4.x xVar) {
        this.f1717e.addMenuProvider(xVar);
    }

    @Override // r3.n
    public final void addOnConfigurationChangedListener(c4.a aVar) {
        this.f1717e.addOnConfigurationChangedListener(aVar);
    }

    @Override // q3.w0
    public final void addOnMultiWindowModeChangedListener(c4.a aVar) {
        this.f1717e.addOnMultiWindowModeChangedListener(aVar);
    }

    @Override // q3.x0
    public final void addOnPictureInPictureModeChangedListener(c4.a aVar) {
        this.f1717e.addOnPictureInPictureModeChangedListener(aVar);
    }

    @Override // r3.o
    public final void addOnTrimMemoryListener(c4.a aVar) {
        this.f1717e.addOnTrimMemoryListener(aVar);
    }

    @Override // androidx.fragment.app.l0
    public final View b(int i10) {
        return this.f1717e.findViewById(i10);
    }

    @Override // androidx.fragment.app.l0
    public final boolean c() {
        Window window = this.f1717e.getWindow();
        if (window != null && window.peekDecorView() != null) {
            return true;
        }
        return false;
    }

    @Override // e.i
    public final e.h getActivityResultRegistry() {
        return this.f1717e.getActivityResultRegistry();
    }

    @Override // androidx.lifecycle.t
    public final androidx.lifecycle.o getLifecycle() {
        return this.f1717e.mFragmentLifecycleRegistry;
    }

    @Override // androidx.activity.y
    public final androidx.activity.w getOnBackPressedDispatcher() {
        return this.f1717e.getOnBackPressedDispatcher();
    }

    @Override // o7.f
    public final o7.d getSavedStateRegistry() {
        return this.f1717e.getSavedStateRegistry();
    }

    @Override // androidx.lifecycle.i1
    public final androidx.lifecycle.h1 getViewModelStore() {
        return this.f1717e.getViewModelStore();
    }

    @Override // d4.r
    public final void removeMenuProvider(d4.x xVar) {
        this.f1717e.removeMenuProvider(xVar);
    }

    @Override // r3.n
    public final void removeOnConfigurationChangedListener(c4.a aVar) {
        this.f1717e.removeOnConfigurationChangedListener(aVar);
    }

    @Override // q3.w0
    public final void removeOnMultiWindowModeChangedListener(c4.a aVar) {
        this.f1717e.removeOnMultiWindowModeChangedListener(aVar);
    }

    @Override // q3.x0
    public final void removeOnPictureInPictureModeChangedListener(c4.a aVar) {
        this.f1717e.removeOnPictureInPictureModeChangedListener(aVar);
    }

    @Override // r3.o
    public final void removeOnTrimMemoryListener(c4.a aVar) {
        this.f1717e.removeOnTrimMemoryListener(aVar);
    }
}
