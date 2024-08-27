package r0;

/* loaded from: classes.dex */
public final class g2 extends iu.k implements hu.c {

    /* renamed from: a, reason: collision with root package name */
    public static final g2 f32417a = new iu.k(3);

    @Override // hu.c
    public final Object b(Object obj, Object obj2, Object obj3) {
        a2.n0 n0;
        a2.o0 o0Var = (a2.o0) obj;
        long j10 = ((w2.a) obj3).f38776a;
        int m02 = o0Var.m0(h2.f32431a);
        int i10 = m02 * 2;
        a2.a1 E = ((a2.l0) obj2).E(hl.f.F0(0, i10, j10));
        n0 = o0Var.n0(E.f29a, E.f30b - i10, vt.p0.d(), new x.q(E, m02, 3));
        return n0;
    }
}
