package androidx.compose.ui.layout;

import a2.f1;
import a2.l0;
import a2.m0;
import a2.u;
import a2.w;
import a2.w0;
import a2.x;
import c2.i;
import c2.i1;
import c2.j;
import c2.k;
import c2.v0;
import g1.l;
import g1.o;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import m1.c;
import nn.d;
import s0.g;
import t0.f;
import t0.n;
import t0.p3;
import t0.r;
import t0.r1;
import t0.t;
import t0.x1;

/* loaded from: classes.dex */
public abstract class a {
    public static final void a(o oVar, Function2 function2, m0 m0Var, n nVar, int i10, int i11) {
        o oVar2;
        int i12;
        int i13;
        int i14;
        int i15;
        o oVar3;
        o oVar4;
        r rVar = (r) nVar;
        rVar.c0(1949933075);
        int i16 = i11 & 1;
        if (i16 != 0) {
            i12 = i10 | 6;
            oVar2 = oVar;
        } else if ((i10 & 6) == 0) {
            oVar2 = oVar;
            if (rVar.h(oVar)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i13 | i10;
        } else {
            oVar2 = oVar;
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
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            if (rVar.h(m0Var)) {
                i15 = 256;
            } else {
                i15 = 128;
            }
            i12 |= i15;
        }
        if ((i12 & 147) == 146 && rVar.G()) {
            rVar.V();
            oVar4 = oVar2;
        } else {
            if (i16 != 0) {
                oVar3 = l.f16404b;
            } else {
                oVar3 = oVar2;
            }
            int i17 = rVar.P;
            o h02 = t.h0(rVar, oVar3);
            r1 o10 = rVar.o();
            j jVar = j.f7738c;
            int i18 = ((i12 << 3) & 896) | 6;
            rVar.b0(-692256719);
            if (rVar.f35166a instanceof f) {
                rVar.e0();
                if (rVar.O) {
                    rVar.n(jVar);
                } else {
                    rVar.n0();
                }
                c2.l.M.getClass();
                t.v0(rVar, m0Var, k.f7749e);
                t.v0(rVar, o10, k.f7748d);
                x xVar = x.f128b;
                int i19 = 0;
                if (rVar.O) {
                    rVar.c(Unit.f23355a, new p3(i19, xVar));
                }
                t.v0(rVar, h02, k.f7747c);
                i iVar = k.f7750f;
                if (rVar.O || !Intrinsics.a(rVar.Q(), Integer.valueOf(i17))) {
                    d.s(i17, rVar, i17, iVar);
                }
                com.google.android.gms.internal.p002firebaseauthapi.a.p((i18 >> 6) & 14, function2, rVar, true, false);
                oVar4 = oVar3;
            } else {
                al.d.v0();
                throw null;
            }
        }
        x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new d0.t(i10, i11, 5, oVar4, function2, m0Var);
        }
    }

    public static final long b(float f10, float f11) {
        long floatToRawIntBits = (Float.floatToRawIntBits(f11) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32);
        int i10 = f1.f62b;
        return floatToRawIntBits;
    }

    public static final m1.d c(c2.x xVar) {
        u G = xVar.G();
        if (G != null) {
            return ((i1) G).i(xVar, true);
        }
        long j10 = xVar.f31c;
        return new m1.d(g.f34069a, g.f34069a, (int) (j10 >> 32), (int) (j10 & 4294967295L));
    }

    public static final m1.d d(u uVar) {
        u e10 = e(uVar);
        float q10 = (int) (e10.q() >> 32);
        float q11 = (int) (e10.q() & 4294967295L);
        m1.d i10 = e(uVar).i(uVar, true);
        float f10 = i10.f27239a;
        float f11 = g.f34069a;
        if (f10 < g.f34069a) {
            f10 = 0.0f;
        }
        if (f10 > q10) {
            f10 = q10;
        }
        float f12 = i10.f27240b;
        if (f12 < g.f34069a) {
            f12 = 0.0f;
        }
        if (f12 > q11) {
            f12 = q11;
        }
        float f13 = i10.f27241c;
        if (f13 < g.f34069a) {
            f13 = 0.0f;
        }
        if (f13 <= q10) {
            q10 = f13;
        }
        float f14 = i10.f27242d;
        if (f14 >= g.f34069a) {
            f11 = f14;
        }
        if (f11 <= q11) {
            q11 = f11;
        }
        if (f10 == q10 || f12 == q11) {
            return m1.d.f27238e;
        }
        long g10 = e10.g(t.g(f10, f12));
        long g11 = e10.g(t.g(q10, f12));
        long g12 = e10.g(t.g(q10, q11));
        long g13 = e10.g(t.g(f10, q11));
        float d10 = c.d(g10);
        float d11 = c.d(g11);
        float d12 = c.d(g13);
        float d13 = c.d(g12);
        float min = Math.min(d10, Math.min(d11, Math.min(d12, d13)));
        float max = Math.max(d10, Math.max(d11, Math.max(d12, d13)));
        float e11 = c.e(g10);
        float e12 = c.e(g11);
        float e13 = c.e(g13);
        float e14 = c.e(g12);
        return new m1.d(min, Math.min(e11, Math.min(e12, Math.min(e13, e14))), max, Math.max(e11, Math.max(e12, Math.max(e13, e14))));
    }

    public static final u e(u uVar) {
        u uVar2;
        i1 i1Var;
        u G = uVar.G();
        while (true) {
            u uVar3 = G;
            uVar2 = uVar;
            uVar = uVar3;
            if (uVar == null) {
                break;
            }
            G = uVar.G();
        }
        if (uVar2 instanceof i1) {
            i1Var = (i1) uVar2;
        } else {
            i1Var = null;
        }
        if (i1Var == null) {
            return uVar2;
        }
        i1 i1Var2 = i1Var.f7723m;
        while (true) {
            i1 i1Var3 = i1Var2;
            i1 i1Var4 = i1Var;
            i1Var = i1Var3;
            if (i1Var != null) {
                i1Var2 = i1Var.f7723m;
            } else {
                return i1Var4;
            }
        }
    }

    public static final Object f(l0 l0Var) {
        w wVar;
        Object a10 = l0Var.a();
        if (a10 instanceof w) {
            wVar = (w) a10;
        } else {
            wVar = null;
        }
        if (wVar == null) {
            return null;
        }
        return wVar.q();
    }

    public static final v0 g(v0 v0Var) {
        androidx.compose.ui.node.a aVar;
        androidx.compose.ui.node.a aVar2 = v0Var.f7860k.f7721k;
        while (true) {
            androidx.compose.ui.node.a q10 = aVar2.q();
            androidx.compose.ui.node.a aVar3 = null;
            if (q10 != null) {
                aVar = q10.f1402c;
            } else {
                aVar = null;
            }
            if (aVar != null) {
                androidx.compose.ui.node.a q11 = aVar2.q();
                if (q11 != null) {
                    aVar3 = q11.f1402c;
                }
                Intrinsics.c(aVar3);
                androidx.compose.ui.node.a q12 = aVar2.q();
                Intrinsics.c(q12);
                aVar2 = q12.f1402c;
                Intrinsics.c(aVar2);
            } else {
                v0 U0 = aVar2.f1422w.f7656c.U0();
                Intrinsics.c(U0);
                return U0;
            }
        }
    }

    public static final o h(o oVar, hu.c cVar) {
        return oVar.g(new LayoutElement(cVar));
    }

    public static final o i(String str) {
        return new LayoutIdElement(str);
    }

    public static final b1.c j(o oVar) {
        v.g gVar = new v.g(oVar, 7);
        Object obj = b1.d.f3079a;
        return new b1.c(gVar, true, -1586257396);
    }

    public static final o k(o oVar, Function1 function1) {
        return oVar.g(new OnGloballyPositionedElement(function1));
    }

    public static final o l(o oVar, Function1 function1) {
        return oVar.g(new w0(function1));
    }

    public static final long m(u uVar) {
        int i10 = c.f27236e;
        return uVar.M(c.f27233b);
    }

    public static final long n(long j10, long j11) {
        return t.j(f1.a(j11) * m1.f.e(j10), f1.b(j11) * m1.f.c(j10));
    }
}
