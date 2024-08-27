package androidx.compose.animation;

import g1.d;
import g1.l;
import g1.o;
import hl.f;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import s0.g;
import t0.g1;
import t0.m;
import t0.n;
import t0.n1;
import t0.o3;
import t0.r;
import v.a0;
import v.c0;
import v.h0;
import v.i0;
import v.j0;
import v.r0;
import v.t;
import v.u0;
import v.z;
import w.e;
import w.f0;
import w.f1;
import w.l2;
import w.o1;
import w.u1;
import w.x1;
import w.y1;
import w.z1;
import w2.h;
import w2.j;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final f1 f1168a;

    /* renamed from: b, reason: collision with root package name */
    public static final f1 f1169b;

    /* renamed from: c, reason: collision with root package name */
    public static final f1 f1170c;

    static {
        y1 y1Var = z1.f38739a;
        f1168a = e.v(400.0f, null, 5);
        int i10 = h.f38792c;
        Map map = l2.f38595a;
        f1169b = e.v(400.0f, new h(f.j(1, 1)), 1);
        f1170c = e.v(400.0f, new j(f.k(1, 1)), 1);
    }

    public static final o a(u1 u1Var, h0 h0Var, i0 i0Var, n nVar, int i10) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        o1 o1Var;
        o1 o1Var2;
        o1 o1Var3;
        t tVar;
        boolean z14;
        boolean z15;
        o1 o1Var4;
        boolean z16;
        boolean z17;
        boolean z18;
        r rVar = (r) nVar;
        rVar.b0(914000546);
        int i11 = i10 & 14;
        int i12 = (i10 & 112) | i11;
        rVar.b0(21614502);
        rVar.b0(1472945283);
        if ((((i12 & 14) ^ 6) > 4 && rVar.h(u1Var)) || (i12 & 6) == 4) {
            z10 = true;
        } else {
            z10 = false;
        }
        Object Q = rVar.Q();
        to.e eVar = m.f35080a;
        o3 o3Var = o3.f35116a;
        if (z10 || Q == eVar) {
            Q = t0.t.n0(h0Var, o3Var);
            rVar.k0(Q);
        }
        g1 g1Var = (g1) Q;
        rVar.s(false);
        Object c10 = u1Var.c();
        n1 n1Var = u1Var.f38689c;
        Object value = n1Var.getValue();
        z zVar = z.f37637b;
        if (c10 == value && u1Var.c() == zVar) {
            if (u1Var.f()) {
                g1Var.setValue(h0Var);
            } else {
                g1Var.setValue(h0.f37526b);
            }
        } else if (n1Var.getValue() == zVar) {
            g1Var.setValue(((h0) g1Var.getValue()).b(h0Var));
        }
        h0 h0Var2 = (h0) g1Var.getValue();
        rVar.s(false);
        int i13 = ((i10 >> 3) & 112) | i11;
        rVar.b0(-1363864804);
        rVar.b0(-1476179322);
        if ((((i13 & 14) ^ 6) > 4 && rVar.h(u1Var)) || (i13 & 6) == 4) {
            z11 = true;
        } else {
            z11 = false;
        }
        Object Q2 = rVar.Q();
        if (z11 || Q2 == eVar) {
            Q2 = t0.t.n0(i0Var, o3Var);
            rVar.k0(Q2);
        }
        g1 g1Var2 = (g1) Q2;
        rVar.s(false);
        if (u1Var.c() == n1Var.getValue() && u1Var.c() == zVar) {
            if (u1Var.f()) {
                g1Var2.setValue(i0Var);
            } else {
                g1Var2.setValue(i0.f37530b);
            }
        } else if (n1Var.getValue() != zVar) {
            g1Var2.setValue(((i0) g1Var2.getValue()).b(i0Var));
        }
        i0 i0Var2 = (i0) g1Var2.getValue();
        rVar.s(false);
        u0 u0Var = h0Var2.f37527a;
        if (u0Var.f37622b == null && i0Var2.f37532a.f37622b == null) {
            z12 = false;
        } else {
            z12 = true;
        }
        if (u0Var.f37623c == null && i0Var2.f37532a.f37623c == null) {
            z13 = false;
        } else {
            z13 = true;
        }
        rVar.b0(1657242209);
        if (z12) {
            int i14 = h.f38792c;
            y1 y1Var = z1.f38745g;
            rVar.b0(1657242294);
            Object Q3 = rVar.Q();
            if (Q3 == eVar) {
                Q3 = "Built-in slide";
                rVar.k0("Built-in slide");
            }
            rVar.s(false);
            o1Var = e.n(u1Var, y1Var, (String) Q3, rVar, i11 | 384);
        } else {
            o1Var = null;
        }
        rVar.s(false);
        rVar.b0(1657242379);
        if (z13) {
            y1 y1Var2 = z1.f38746h;
            rVar.b0(1657242467);
            Object Q4 = rVar.Q();
            if (Q4 == eVar) {
                Q4 = "Built-in shrink/expand";
                rVar.k0("Built-in shrink/expand");
            }
            rVar.s(false);
            o1Var2 = e.n(u1Var, y1Var2, (String) Q4, rVar, i11 | 384);
        } else {
            o1Var2 = null;
        }
        rVar.s(false);
        rVar.b0(1657242547);
        if (z13) {
            int i15 = h.f38792c;
            y1 y1Var3 = z1.f38745g;
            rVar.b0(1657242662);
            Object Q5 = rVar.Q();
            if (Q5 == eVar) {
                Q5 = "Built-in InterruptionHandlingOffset";
                rVar.k0("Built-in InterruptionHandlingOffset");
            }
            rVar.s(false);
            o1Var3 = e.n(u1Var, y1Var3, (String) Q5, rVar, i11 | 384);
        } else {
            o1Var3 = null;
        }
        rVar.s(false);
        u0 u0Var2 = h0Var2.f37527a;
        t tVar2 = u0Var2.f37623c;
        if ((tVar2 != null && !tVar2.f37611d) || (((tVar = i0Var2.f37532a.f37623c) != null && !tVar.f37611d) || !z13)) {
            z14 = true;
        } else {
            z14 = false;
        }
        int i16 = (i10 & 7168) | i11;
        rVar.b0(642253525);
        if (u0Var2.f37621a == null && i0Var2.f37532a.f37621a == null) {
            z15 = false;
        } else {
            z15 = true;
        }
        i0Var2.f37532a.getClass();
        rVar.b0(-1158245383);
        if (z15) {
            y1 y1Var4 = z1.f38739a;
            rVar.b0(-1158245266);
            Object Q6 = rVar.Q();
            if (Q6 == eVar) {
                Q6 = "Built-in alpha";
                rVar.k0("Built-in alpha");
            }
            rVar.s(false);
            o1Var4 = e.n(u1Var, y1Var4, (String) Q6, rVar, (i16 & 14) | 384);
        } else {
            o1Var4 = null;
        }
        rVar.s(false);
        rVar.b0(-1158245186);
        rVar.s(false);
        rVar.b0(-1158244979);
        rVar.s(false);
        rVar.b0(-1158244780);
        boolean j10 = rVar.j(o1Var4);
        if ((((i16 & 112) ^ 48) > 32 && rVar.h(h0Var2)) || (i16 & 48) == 32) {
            z16 = true;
        } else {
            z16 = false;
        }
        boolean z19 = z16 | j10;
        if ((((i16 & 896) ^ 384) > 256 && rVar.h(i0Var2)) || (i16 & 384) == 256) {
            z17 = true;
        } else {
            z17 = false;
        }
        boolean j11 = z19 | z17 | rVar.j(null);
        if ((((i16 & 14) ^ 6) > 4 && rVar.h(u1Var)) || (i16 & 6) == 4) {
            z18 = true;
        } else {
            z18 = false;
        }
        boolean j12 = z18 | j11 | rVar.j(null);
        Object Q7 = rVar.Q();
        if (j12 || Q7 == eVar) {
            Q7 = new a0(o1Var4, u1Var, h0Var2, i0Var2);
            rVar.k0(Q7);
        }
        rVar.s(false);
        rVar.s(false);
        o g10 = androidx.compose.ui.graphics.a.r(l.f16404b, g.f34069a, g.f34069a, g.f34069a, g.f34069a, g.f34069a, null, !z14, 126975).g(new EnterExitTransitionElement(u1Var, o1Var2, o1Var3, o1Var, h0Var2, i0Var2, (a0) Q7));
        rVar.s(false);
        return g10;
    }

    public static final h0 b(f0 f0Var, d dVar, Function1 function1, boolean z10) {
        return new h0(new u0(null, null, new t(f0Var, dVar, function1, z10), false, null, 59));
    }

    public static h0 c(x1 x1Var, int i10) {
        f0 f0Var = x1Var;
        if ((i10 & 1) != 0) {
            f0Var = e.v(400.0f, null, 5);
        }
        return new h0(new u0(new j0(g.f34069a, f0Var), null, null, false, null, 62));
    }

    public static i0 d() {
        return new i0(new u0(new j0(g.f34069a, e.v(400.0f, null, 5)), null, null, false, null, 62));
    }

    public static final i0 e(f0 f0Var, d dVar, Function1 function1, boolean z10) {
        return new i0(new u0(null, null, new t(f0Var, dVar, function1, z10), false, null, 59));
    }

    public static final i0 f(f1 f1Var, Function1 function1) {
        return new i0(new u0(null, new r0(f1Var, new c0(6, function1)), null, false, null, 61));
    }
}
