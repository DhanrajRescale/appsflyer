package x;

import kotlin.Unit;

/* loaded from: classes.dex */
public final class x1 implements k1, a2 {

    /* renamed from: a, reason: collision with root package name */
    public static final x1 f39775a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final x1 f39776b = new Object();

    @Override // x.a2
    public long a(long j10, int i10, p2 p2Var) {
        return ((m1.c) p2Var.invoke(new m1.c(j10))).f27237a;
    }

    @Override // x.a2
    public g1.o b() {
        return g1.l.f16404b;
    }

    @Override // x.k1
    public void c(p1.e eVar) {
        ((c2.j0) eVar).a();
    }

    @Override // x.a2
    public Object d(long j10, y.i2 i2Var, yt.a aVar) {
        Object invoke = i2Var.invoke(new w2.o(j10), aVar);
        if (invoke == zt.a.f42823a) {
            return invoke;
        }
        return Unit.f23355a;
    }

    @Override // x.a2
    public boolean e() {
        return false;
    }
}
