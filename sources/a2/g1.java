package a2;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import t0.r1;
import t0.x1;

/* loaded from: classes.dex */
public abstract class g1 {

    /* renamed from: a, reason: collision with root package name */
    public static final p1.l f65a = new p1.l(4);

    public static final void a(j1 j1Var, g1.o oVar, Function2 function2, t0.n nVar, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        t0.r rVar = (t0.r) nVar;
        rVar.c0(-511989831);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            if (rVar.j(j1Var)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i13 | i10;
        } else {
            i12 = i10;
        }
        int i16 = i11 & 2;
        if (i16 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            if (rVar.h(oVar)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            if (rVar.j(function2)) {
                i15 = 256;
            } else {
                i15 = 128;
            }
            i12 |= i15;
        }
        if ((i12 & 147) == 146 && rVar.G()) {
            rVar.V();
        } else {
            if (i16 != 0) {
                oVar = g1.l.f16404b;
            }
            int i17 = rVar.P;
            t0.p M0 = al.d.M0(rVar);
            g1.o h02 = t0.t.h0(rVar, oVar);
            r1 o10 = rVar.o();
            c2.j jVar = c2.j.f7738c;
            rVar.b0(1405779621);
            if (rVar.f35166a instanceof t0.f) {
                rVar.e0();
                if (rVar.O) {
                    rVar.n(new x.f1(jVar, 5));
                } else {
                    rVar.n0();
                }
                t0.t.v0(rVar, j1Var, j1Var.f93c);
                t0.t.v0(rVar, M0, j1Var.f94d);
                t0.t.v0(rVar, function2, j1Var.f95e);
                c2.l.M.getClass();
                t0.t.v0(rVar, o10, c2.k.f7748d);
                t0.t.v0(rVar, h02, c2.k.f7747c);
                c2.i iVar = c2.k.f7750f;
                if (rVar.O || !Intrinsics.a(rVar.Q(), Integer.valueOf(i17))) {
                    nn.d.s(i17, rVar, i17, iVar);
                }
                rVar.s(true);
                rVar.s(false);
                if (!rVar.G()) {
                    rVar.b0(-607848572);
                    boolean j10 = rVar.j(j1Var);
                    Object Q = rVar.Q();
                    if (j10 || Q == t0.m.f35080a) {
                        Q = new x.a(j1Var, 26);
                        rVar.k0(Q);
                    }
                    rVar.s(false);
                    t0.t.i((Function0) Q, rVar);
                }
            } else {
                al.d.v0();
                throw null;
            }
        }
        g1.o oVar2 = oVar;
        x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new d0.t(i10, i11, 6, j1Var, oVar2, function2);
        }
    }

    public static final void b(g1.o oVar, Function2 function2, t0.n nVar, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        g1.o oVar2;
        g1.o oVar3;
        t0.r rVar = (t0.r) nVar;
        rVar.c0(-1298353104);
        int i15 = i11 & 1;
        if (i15 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            if (rVar.h(oVar)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i13 | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            if (rVar.j(function2)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        if ((i12 & 19) == 18 && rVar.G()) {
            rVar.V();
            oVar3 = oVar;
        } else {
            if (i15 != 0) {
                oVar2 = g1.l.f16404b;
            } else {
                oVar2 = oVar;
            }
            rVar.b0(-607850781);
            Object Q = rVar.Q();
            if (Q == t0.m.f35080a) {
                Q = new j1(k.f102g);
                rVar.k0(Q);
            }
            rVar.s(false);
            int i16 = i12 << 3;
            a((j1) Q, oVar2, function2, rVar, (i16 & 112) | (i16 & 896), 0);
            oVar3 = oVar2;
        }
        x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new l0.p0(oVar3, function2, i10, i11, 1);
        }
    }

    public static final boolean c(int i10, int i11) {
        return i10 == i11;
    }
}
