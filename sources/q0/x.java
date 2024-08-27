package q0;

import t0.g1;
import w.x1;

/* loaded from: classes.dex */
public abstract class x {

    /* renamed from: a, reason: collision with root package name */
    public static final x1 f31552a = new x1(15, w.e0.f38472c, 2);

    public static final f a(boolean z10, float f10, long j10, t0.n nVar, int i10, int i11) {
        boolean z11;
        t0.r rVar = (t0.r) nVar;
        rVar.b0(1635163520);
        boolean z12 = true;
        if ((i11 & 1) != 0) {
            z10 = true;
        }
        if ((i11 & 2) != 0) {
            f10 = Float.NaN;
        }
        if ((i11 & 4) != 0) {
            j10 = n1.t.f28177i;
        }
        g1 r02 = t0.t.r0(new n1.t(j10), rVar);
        rVar.b0(-1508280550);
        if ((((i10 & 14) ^ 6) > 4 && rVar.i(z10)) || (i10 & 6) == 4) {
            z11 = true;
        } else {
            z11 = false;
        }
        if ((((i10 & 112) ^ 48) <= 32 || !rVar.e(f10)) && (i10 & 48) != 32) {
            z12 = false;
        }
        boolean z13 = z11 | z12;
        Object Q = rVar.Q();
        if (z13 || Q == t0.m.f35080a) {
            Q = new h(z10, f10, r02);
            rVar.k0(Q);
        }
        f fVar = (f) Q;
        rVar.s(false);
        rVar.s(false);
        return fVar;
    }
}
