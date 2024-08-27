package b0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class y {

    /* renamed from: a, reason: collision with root package name */
    public static final l1 f3039a = new l1(2, null, n.f2937c, 0, new c0(g1.a.f16391m));

    public static final l1 a(j jVar, g1.e eVar, t0.n nVar, int i10) {
        boolean z10;
        l1 l1Var;
        t0.r rVar = (t0.r) nVar;
        rVar.b0(1089876336);
        if (Intrinsics.a(jVar, n.f2937c) && Intrinsics.a(eVar, g1.a.f16391m)) {
            l1Var = f3039a;
        } else {
            rVar.b0(1466279790);
            boolean z11 = true;
            if ((((i10 & 14) ^ 6) > 4 && rVar.h(jVar)) || (i10 & 6) == 4) {
                z10 = true;
            } else {
                z10 = false;
            }
            if ((((i10 & 112) ^ 48) <= 32 || !rVar.h(eVar)) && (i10 & 48) != 32) {
                z11 = false;
            }
            boolean z12 = z10 | z11;
            Object Q = rVar.Q();
            if (z12 || Q == t0.m.f35080a) {
                Q = new l1(2, null, jVar, jVar.a(), new c0(eVar));
                rVar.k0(Q);
            }
            l1Var = (l1) Q;
            rVar.s(false);
        }
        rVar.s(false);
        return l1Var;
    }
}
