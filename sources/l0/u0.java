package l0;

import i0.q1;

/* loaded from: classes.dex */
public final class u0 implements m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v0 f23832a;

    public u0(v0 v0Var) {
        this.f23832a = v0Var;
    }

    @Override // l0.m
    public final boolean a(long j10, t tVar) {
        q1 q1Var;
        v0 v0Var = this.f23832a;
        if (v0Var.k().f30522a.f20699a.length() == 0 || (q1Var = v0Var.f23839d) == null || q1Var.d() == null) {
            return false;
        }
        v0.c(v0Var, v0Var.k(), j10, false, false, tVar, false);
        return true;
    }

    @Override // l0.m
    public final boolean b(long j10, i5.w wVar) {
        q1 q1Var;
        v0 v0Var = this.f23832a;
        if (v0Var.k().f30522a.f20699a.length() == 0 || (q1Var = v0Var.f23839d) == null || q1Var.d() == null) {
            return false;
        }
        l1.o oVar = v0Var.f23844i;
        if (oVar != null) {
            oVar.a(l1.h.f23896e);
        }
        v0Var.f23846k = j10;
        v0Var.f23851p = -1;
        v0Var.h(true);
        v0.c(v0Var, v0Var.k(), v0Var.f23846k, true, false, wVar, false);
        return true;
    }

    @Override // l0.m
    public final void c() {
    }
}
