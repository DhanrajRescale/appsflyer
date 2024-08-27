package y;

import kotlin.Unit;

/* loaded from: classes.dex */
public final class m1 implements w0, n0 {

    /* renamed from: a, reason: collision with root package name */
    public j2 f40858a;

    /* renamed from: b, reason: collision with root package name */
    public q1 f40859b;

    @Override // y.w0
    public final Object a(u0 u0Var, i iVar) {
        Object b10 = this.f40858a.f40796a.b(x.s1.f39718b, new l1(this, u0Var, null), iVar);
        if (b10 == zt.a.f42823a) {
            return b10;
        }
        return Unit.f23355a;
    }

    @Override // y.n0
    public final void b(float f10) {
        q1 q1Var = this.f40859b;
        j2 j2Var = this.f40858a;
        j2Var.a(q1Var, j2Var.d(f10), 1);
    }
}
