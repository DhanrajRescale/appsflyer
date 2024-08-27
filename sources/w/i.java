package w;

import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import t0.l3;
import t0.o3;

/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final f1 f38521a = e.v(s0.g.f34069a, null, 7);

    static {
        Map map = l2.f38595a;
        int i10 = m1.f.f27253d;
        t0.t.j(0.5f, 0.5f);
        int i11 = m1.c.f27236e;
        t0.t.g(0.5f, 0.5f);
        int i12 = w2.h.f38792c;
        hl.f.j(1, 1);
    }

    public static final l3 a(float f10, x1 x1Var, t0.n nVar, int i10) {
        t0.r rVar = (t0.r) nVar;
        rVar.b0(-1407150062);
        int i11 = (i10 & 14) | ((i10 << 3) & 896);
        int i12 = i10 << 6;
        l3 c10 = c(new w2.e(f10), z1.f38741c, x1Var, null, "DpAnimation", null, rVar, i11 | (57344 & i12) | (i12 & 458752), 8);
        rVar.s(false);
        return c10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [w.f1] */
    public static final l3 b(float f10, x1 x1Var, String str, t0.n nVar, int i10, int i11) {
        float f11;
        n nVar2;
        boolean z10;
        t0.r rVar = (t0.r) nVar;
        rVar.b0(668842840);
        int i12 = i11 & 2;
        ?? r12 = f38521a;
        if (i12 != 0) {
            x1Var = r12;
        }
        if ((i11 & 4) != 0) {
            f11 = 0.01f;
        } else {
            f11 = 0.0f;
        }
        if ((i11 & 8) != 0) {
            str = "FloatAnimation";
        }
        String str2 = str;
        rVar.b0(841393662);
        if (x1Var == r12) {
            rVar.b0(841393716);
            if ((((i10 & 896) ^ 384) > 256 && rVar.e(f11)) || (i10 & 384) == 256) {
                z10 = true;
            } else {
                z10 = false;
            }
            Object Q = rVar.Q();
            if (z10 || Q == t0.m.f35080a) {
                Q = e.v(s0.g.f34069a, Float.valueOf(f11), 3);
                rVar.k0(Q);
            }
            rVar.s(false);
            nVar2 = (f1) Q;
        } else {
            nVar2 = x1Var;
        }
        rVar.s(false);
        int i13 = i10 << 3;
        l3 c10 = c(Float.valueOf(f10), z1.f38739a, nVar2, Float.valueOf(f11), str2, null, rVar, (i10 & 14) | (i13 & 7168) | (57344 & i13) | (i13 & 458752), 0);
        rVar.s(false);
        return c10;
    }

    public static final l3 c(Object obj, y1 y1Var, n nVar, Float f10, String str, Function1 function1, t0.n nVar2, int i10, int i11) {
        n nVar3;
        Float f11;
        Function1 function12;
        boolean z10;
        t0.r rVar = (t0.r) nVar2;
        rVar.b0(-1994373980);
        int i12 = i11 & 4;
        to.e eVar = t0.m.f35080a;
        if (i12 != 0) {
            rVar.b0(1824614948);
            Object Q = rVar.Q();
            if (Q == eVar) {
                Q = e.v(s0.g.f34069a, null, 7);
                rVar.k0(Q);
            }
            nVar3 = (f1) Q;
            rVar.s(false);
        } else {
            nVar3 = nVar;
        }
        if ((i11 & 8) != 0) {
            f11 = null;
        } else {
            f11 = f10;
        }
        if ((i11 & 32) != 0) {
            function12 = null;
        } else {
            function12 = function1;
        }
        rVar.b0(1824615130);
        Object Q2 = rVar.Q();
        if (Q2 == eVar) {
            Q2 = t0.t.n0(null, o3.f35116a);
            rVar.k0(Q2);
        }
        t0.g1 g1Var = (t0.g1) Q2;
        Object h10 = v.e.h(rVar, false, 1824615196);
        if (h10 == eVar) {
            h10 = new d(obj, y1Var, f11);
            rVar.k0(h10);
        }
        d dVar = (d) h10;
        rVar.s(false);
        t0.g1 r02 = t0.t.r0(function12, rVar);
        if (f11 != null && (nVar3 instanceof f1)) {
            f1 f1Var = (f1) nVar3;
            if (!Intrinsics.a(f1Var.f38488c, f11)) {
                nVar3 = new f1(f1Var.f38486a, f1Var.f38487b, f11);
            }
        }
        t0.g1 r03 = t0.t.r0(nVar3, rVar);
        rVar.b0(1824615731);
        Object Q3 = rVar.Q();
        if (Q3 == eVar) {
            Q3 = hl.f.a(-1, null, 6);
            rVar.k0(Q3);
        }
        su.g gVar = (su.g) Q3;
        rVar.s(false);
        rVar.b0(1824615789);
        boolean j10 = rVar.j(gVar);
        if ((((i10 & 14) ^ 6) > 4 && rVar.j(obj)) || (i10 & 6) == 4) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z11 = j10 | z10;
        Object Q4 = rVar.Q();
        if (z11 || Q4 == eVar) {
            Q4 = new f(gVar, obj);
            rVar.k0(Q4);
        }
        rVar.s(false);
        t0.t.i((Function0) Q4, rVar);
        rVar.b0(1824615862);
        boolean j11 = rVar.j(gVar) | rVar.j(dVar) | rVar.h(r03) | rVar.h(r02);
        Object Q5 = rVar.Q();
        if (j11 || Q5 == eVar) {
            Q5 = new h(gVar, dVar, r03, r02, null);
            rVar.k0(Q5);
        }
        rVar.s(false);
        t0.t.e(gVar, (Function2) Q5, rVar);
        l3 l3Var = (l3) g1Var.getValue();
        if (l3Var == null) {
            l3Var = dVar.f38453c;
        }
        rVar.s(false);
        return l3Var;
    }
}
