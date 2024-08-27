package androidx.fragment.app;

import android.view.View;

/* loaded from: classes.dex */
public final class s extends l0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l0 f1824a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f1825b;

    public s(t tVar, l0 l0Var) {
        this.f1825b = tVar;
        this.f1824a = l0Var;
    }

    @Override // androidx.fragment.app.l0
    public final View b(int i10) {
        l0 l0Var = this.f1824a;
        if (l0Var.c()) {
            return l0Var.b(i10);
        }
        return this.f1825b.onFindViewById(i10);
    }

    @Override // androidx.fragment.app.l0
    public final boolean c() {
        if (!this.f1824a.c() && !this.f1825b.onHasView()) {
            return false;
        }
        return true;
    }
}
