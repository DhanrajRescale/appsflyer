package i0;

import t0.l3;

/* loaded from: classes.dex */
public final class c1 extends iu.k implements hu.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18810a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f18811b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j2.g0 f18812c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(int i10, int i11, j2.g0 g0Var) {
        super(3);
        this.f18810a = i10;
        this.f18811b = i11;
        this.f18812c = g0Var;
    }

    @Override // hu.c
    public final Object b(Object obj, Object obj2, Object obj3) {
        int i10;
        int i11;
        Integer valueOf;
        float f10;
        ((Number) obj3).intValue();
        t0.r rVar = (t0.r) ((t0.n) obj2);
        rVar.b0(408240218);
        int i12 = this.f18810a;
        int i13 = this.f18811b;
        l1.D(i12, i13);
        g1.l lVar = g1.l.f16404b;
        if (i12 == 1 && i13 == Integer.MAX_VALUE) {
            rVar.s(false);
            return lVar;
        }
        w2.b bVar = (w2.b) rVar.m(d2.s1.f13620e);
        o2.r rVar2 = (o2.r) rVar.m(d2.s1.f13623h);
        w2.k kVar = (w2.k) rVar.m(d2.s1.f13626k);
        rVar.b0(-1448520213);
        j2.g0 g0Var = this.f18812c;
        boolean h10 = rVar.h(g0Var) | rVar.h(kVar);
        Object Q = rVar.Q();
        to.e eVar = t0.m.f35080a;
        if (h10 || Q == eVar) {
            Q = hl.f.M0(g0Var, kVar);
            rVar.k0(Q);
        }
        j2.g0 g0Var2 = (j2.g0) Q;
        rVar.s(false);
        rVar.b0(-1448520096);
        boolean h11 = rVar.h(rVar2) | rVar.h(g0Var2);
        Object Q2 = rVar.Q();
        if (h11 || Q2 == eVar) {
            j2.b0 b0Var = g0Var2.f20722a;
            o2.s sVar = b0Var.f20664f;
            o2.d0 d0Var = b0Var.f20661c;
            if (d0Var == null) {
                d0Var = o2.d0.f29464f;
            }
            o2.z zVar = b0Var.f20662d;
            if (zVar != null) {
                i10 = zVar.f29542a;
            } else {
                i10 = 0;
            }
            o2.a0 a0Var = b0Var.f20663e;
            if (a0Var != null) {
                i11 = a0Var.f29453a;
            } else {
                i11 = 1;
            }
            Q2 = ((o2.t) rVar2).b(sVar, d0Var, i10, i11);
            rVar.k0(Q2);
        }
        l3 l3Var = (l3) Q2;
        rVar.s(false);
        Object value = l3Var.getValue();
        rVar.b0(-1448519756);
        boolean h12 = rVar.h(value) | rVar.h(bVar) | rVar.h(rVar2) | rVar.h(g0Var) | rVar.h(kVar);
        Object Q3 = rVar.Q();
        if (h12 || Q3 == eVar) {
            Q3 = Integer.valueOf((int) (e2.a(g0Var2, bVar, rVar2, e2.f18851a, 1) & 4294967295L));
            rVar.k0(Q3);
        }
        int intValue = ((Number) Q3).intValue();
        rVar.s(false);
        Object value2 = l3Var.getValue();
        rVar.b0(-1448519358);
        boolean h13 = rVar.h(value2) | rVar.h(bVar) | rVar.h(rVar2) | rVar.h(g0Var) | rVar.h(kVar);
        Object Q4 = rVar.Q();
        if (h13 || Q4 == eVar) {
            StringBuilder sb2 = new StringBuilder();
            String str = e2.f18851a;
            sb2.append(str);
            sb2.append('\n');
            sb2.append(str);
            Q4 = Integer.valueOf((int) (e2.a(g0Var2, bVar, rVar2, sb2.toString(), 2) & 4294967295L));
            rVar.k0(Q4);
        }
        int intValue2 = ((Number) Q4).intValue();
        rVar.s(false);
        int i14 = intValue2 - intValue;
        Integer num = null;
        if (i12 == 1) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(((i12 - 1) * i14) + intValue);
        }
        if (i13 != Integer.MAX_VALUE) {
            num = Integer.valueOf(((i13 - 1) * i14) + intValue);
        }
        float f11 = Float.NaN;
        if (valueOf != null) {
            f10 = bVar.N(valueOf.intValue());
        } else {
            f10 = Float.NaN;
        }
        if (num != null) {
            f11 = bVar.N(num.intValue());
        }
        g1.o h14 = androidx.compose.foundation.layout.d.h(lVar, f10, f11);
        rVar.s(false);
        return h14;
    }
}
