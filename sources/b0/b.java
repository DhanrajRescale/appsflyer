package b0;

/* loaded from: classes.dex */
public final class b extends g1.n implements c2.c0 {

    /* renamed from: n, reason: collision with root package name */
    public a2.a f2822n;

    /* renamed from: o, reason: collision with root package name */
    public float f2823o;

    /* renamed from: p, reason: collision with root package name */
    public float f2824p;

    @Override // c2.c0
    public final a2.n0 a(a2.o0 o0Var, a2.l0 l0Var, long j10) {
        long a10;
        int i10;
        int h10;
        int i11;
        int i12;
        int max;
        int i13;
        a2.n0 n0;
        a2.a aVar = this.f2822n;
        float f10 = this.f2823o;
        float f11 = this.f2824p;
        boolean z10 = aVar instanceof a2.p;
        if (z10) {
            a10 = w2.a.a(j10, 0, 0, 0, 0, 11);
        } else {
            a10 = w2.a.a(j10, 0, 0, 0, 0, 14);
        }
        a2.a1 E = l0Var.E(a10);
        int f12 = E.f(aVar);
        if (f12 == Integer.MIN_VALUE) {
            f12 = 0;
        }
        if (z10) {
            i10 = E.f30b;
        } else {
            i10 = E.f29a;
        }
        if (z10) {
            h10 = w2.a.g(j10);
        } else {
            h10 = w2.a.h(j10);
        }
        if (!w2.e.a(f10, Float.NaN)) {
            i11 = o0Var.m0(f10);
        } else {
            i11 = 0;
        }
        int i14 = h10 - i10;
        int f13 = kotlin.ranges.d.f(i11 - f12, 0, i14);
        if (!w2.e.a(f11, Float.NaN)) {
            i12 = o0Var.m0(f11);
        } else {
            i12 = 0;
        }
        int f14 = kotlin.ranges.d.f((i12 - i10) + f12, 0, i14 - f13);
        if (z10) {
            max = E.f29a;
        } else {
            max = Math.max(E.f29a + f13 + f14, w2.a.j(j10));
        }
        int i15 = max;
        if (z10) {
            i13 = Math.max(E.f30b + f13 + f14, w2.a.i(j10));
        } else {
            i13 = E.f30b;
        }
        int i16 = i13;
        n0 = o0Var.n0(i15, i16, vt.p0.d(), new a(aVar, f10, f13, i15, f14, E, i16));
        return n0;
    }
}
