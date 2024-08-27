package r0;

import kotlin.Unit;

/* loaded from: classes.dex */
public final class q implements y.w0 {

    /* renamed from: a, reason: collision with root package name */
    public final m0.u f32673a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f32674b;

    public q(t tVar) {
        this.f32674b = tVar;
        this.f32673a = new m0.u(tVar, 1);
    }

    @Override // y.w0
    public final Object a(y.u0 u0Var, y.i iVar) {
        Object b10 = this.f32674b.b(x.s1.f39718b, new m0.t(this, u0Var, null, 1), iVar);
        if (b10 == zt.a.f42823a) {
            return b10;
        }
        return Unit.f23355a;
    }
}
