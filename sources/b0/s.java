package b0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    public static final v f2992a = new v(g1.a.f16379a, false);

    /* renamed from: b, reason: collision with root package name */
    public static final r f2993b = r.f2982a;

    public static final void a(g1.o oVar, t0.n nVar, int i10) {
        int i11;
        int i12;
        t0.r rVar = (t0.r) nVar;
        rVar.c0(-211209833);
        if ((i10 & 6) == 0) {
            if (rVar.h(oVar)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i11 = i12 | i10;
        } else {
            i11 = i10;
        }
        int i13 = 1;
        if ((i11 & 3) == 2 && rVar.G()) {
            rVar.V();
        } else {
            rVar.b0(544976794);
            int i14 = rVar.P;
            g1.o h02 = t0.t.h0(rVar, oVar);
            t0.r1 o10 = rVar.o();
            c2.l.M.getClass();
            c2.j jVar = c2.k.f7746b;
            rVar.b0(1405779621);
            if (rVar.f35166a instanceof t0.f) {
                rVar.e0();
                if (rVar.O) {
                    rVar.n(new x.f1(jVar, 1));
                } else {
                    rVar.n0();
                }
                t0.t.v0(rVar, f2993b, c2.k.f7749e);
                t0.t.v0(rVar, o10, c2.k.f7748d);
                t0.t.v0(rVar, h02, c2.k.f7747c);
                c2.i iVar = c2.k.f7750f;
                if (rVar.O || !Intrinsics.a(rVar.Q(), Integer.valueOf(i14))) {
                    nn.d.s(i14, rVar, i14, iVar);
                }
                v.e.x(rVar, true, false, false);
            } else {
                al.d.v0();
                throw null;
            }
        }
        t0.x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new w.p0(i10, i13, oVar);
        }
    }

    public static final void b(a2.z0 z0Var, a2.a1 a1Var, a2.l0 l0Var, w2.k kVar, int i10, int i11, g1.d dVar) {
        p pVar;
        g1.d dVar2;
        Object a10 = l0Var.a();
        if (a10 instanceof p) {
            pVar = (p) a10;
        } else {
            pVar = null;
        }
        if (pVar != null && (dVar2 = pVar.f2969n) != null) {
            dVar = dVar2;
        }
        long a11 = ((g1.g) dVar).a(hl.f.k(a1Var.f29a, a1Var.f30b), hl.f.k(i10, i11), kVar);
        z0Var.getClass();
        a2.z0.e(a1Var, a11, s0.g.f34069a);
    }

    public static final v c(g1.d dVar, boolean z10, t0.n nVar, int i10) {
        boolean z11;
        v vVar;
        t0.r rVar = (t0.r) nVar;
        rVar.b0(56522820);
        if (Intrinsics.a(dVar, g1.a.f16379a) && !z10) {
            vVar = f2992a;
        } else {
            rVar.b0(2076429406);
            boolean z12 = true;
            if ((((i10 & 14) ^ 6) > 4 && rVar.h(dVar)) || (i10 & 6) == 4) {
                z11 = true;
            } else {
                z11 = false;
            }
            if ((((i10 & 112) ^ 48) <= 32 || !rVar.i(z10)) && (i10 & 48) != 32) {
                z12 = false;
            }
            boolean z13 = z11 | z12;
            Object Q = rVar.Q();
            if (z13 || Q == t0.m.f35080a) {
                Q = new v(dVar, z10);
                rVar.k0(Q);
            }
            vVar = (v) Q;
            rVar.s(false);
        }
        rVar.s(false);
        return vVar;
    }
}
