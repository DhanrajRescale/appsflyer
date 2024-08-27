package i0;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class o2 extends iu.k implements hu.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q2 f19093a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f19094b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a0.l f19095c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2(q2 q2Var, boolean z10, a0.l lVar) {
        super(3);
        this.f19093a = q2Var;
        this.f19094b = z10;
        this.f19095c = lVar;
    }

    @Override // hu.c
    public final Object b(Object obj, Object obj2, Object obj3) {
        boolean z10;
        boolean z11;
        boolean z12;
        ((Number) obj3).intValue();
        t0.r rVar = (t0.r) ((t0.n) obj2);
        rVar.b0(805428266);
        if (rVar.m(d2.s1.f13626k) == w2.k.f38800b) {
            z10 = true;
        } else {
            z10 = false;
        }
        q2 q2Var = this.f19093a;
        if (((y.g1) q2Var.f19161e.getValue()) != y.g1.f40723a && z10) {
            z11 = false;
        } else {
            z11 = true;
        }
        rVar.b0(994171971);
        boolean h10 = rVar.h(q2Var);
        Object Q = rVar.Q();
        Object obj4 = t0.m.f35080a;
        if (h10 || Q == obj4) {
            Q = new t.g0(q2Var, 15);
            rVar.k0(Q);
        }
        rVar.s(false);
        rVar.b0(-180460798);
        t0.g1 r02 = t0.t.r0((Function1) Q, rVar);
        rVar.b0(-624380846);
        Object Q2 = rVar.Q();
        if (Q2 == obj4) {
            Object yVar = new y.y(new v.x(r02, 1));
            rVar.k0(yVar);
            Q2 = yVar;
        }
        y.d2 d2Var = (y.d2) Q2;
        rVar.s(false);
        rVar.s(false);
        rVar.b0(994172511);
        boolean h11 = rVar.h(d2Var) | rVar.h(q2Var);
        Object Q3 = rVar.Q();
        if (h11 || Q3 == obj4) {
            Q3 = new n2(d2Var, q2Var);
            rVar.k0(Q3);
        }
        n2 n2Var = (n2) Q3;
        rVar.s(false);
        g1.l lVar = g1.l.f16404b;
        y.g1 g1Var = (y.g1) q2Var.f19161e.getValue();
        if (this.f19094b && q2Var.f19158b.i() != s0.g.f34069a) {
            z12 = true;
        } else {
            z12 = false;
        }
        a0.l lVar2 = this.f19095c;
        y.o0 o0Var = androidx.compose.foundation.gestures.a.f1238a;
        y.o.f40871a.getClass();
        g1.o b10 = androidx.compose.foundation.gestures.a.b(lVar, n2Var, g1Var, null, z12, z11, null, lVar2, y.n.f40865c);
        rVar.s(false);
        return b10;
    }
}
