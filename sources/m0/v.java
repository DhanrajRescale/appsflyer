package m0;

import kotlin.Unit;

/* loaded from: classes.dex */
public final class v implements y.w0 {

    /* renamed from: a, reason: collision with root package name */
    public final u f26916a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y f26917b;

    public v(y yVar) {
        this.f26917b = yVar;
        this.f26916a = new u(yVar, 0);
    }

    @Override // y.w0
    public final Object a(y.u0 u0Var, y.i iVar) {
        Object b10 = this.f26917b.b(x.s1.f39718b, new t(this, u0Var, null, 0), iVar);
        if (b10 == zt.a.f42823a) {
            return b10;
        }
        return Unit.f23355a;
    }
}
