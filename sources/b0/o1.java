package b0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class o1 {

    /* renamed from: a, reason: collision with root package name */
    public static final l1 f2968a = new l1(1, n.f2935a, null, 0, new d0(g1.a.f16388j));

    public static final l1 a(h hVar, g1.f fVar, t0.n nVar, int i10) {
        boolean z10;
        l1 l1Var;
        t0.r rVar = (t0.r) nVar;
        rVar.b0(-837807694);
        if (Intrinsics.a(hVar, n.f2935a) && Intrinsics.a(fVar, g1.a.f16388j)) {
            l1Var = f2968a;
        } else {
            rVar.b0(495204900);
            boolean z11 = true;
            if ((((i10 & 14) ^ 6) > 4 && rVar.h(hVar)) || (i10 & 6) == 4) {
                z10 = true;
            } else {
                z10 = false;
            }
            if ((((i10 & 112) ^ 48) <= 32 || !rVar.h(fVar)) && (i10 & 48) != 32) {
                z11 = false;
            }
            boolean z12 = z10 | z11;
            Object Q = rVar.Q();
            if (z12 || Q == t0.m.f35080a) {
                Q = new l1(1, hVar, null, hVar.a(), new d0(fVar));
                rVar.k0(Q);
            }
            l1Var = (l1) Q;
            rVar.s(false);
        }
        rVar.s(false);
        return l1Var;
    }
}
