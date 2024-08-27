package h7;

import g7.a1;
import g7.x0;
import g7.z0;
import kotlin.coroutines.k;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import t0.m;
import t0.n;
import t0.r;
import t0.t;

/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final a1 f18037a;

    static {
        z0 z0Var = new z0(false);
        f18037a = new a1(x0.f17118b, z0Var, z0Var);
    }

    public static final b a(tu.f fVar, n nVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        r rVar = (r) nVar;
        rVar.b0(388053246);
        k kVar = k.f23369a;
        rVar.b0(1046463091);
        boolean h10 = rVar.h(fVar);
        Object Q = rVar.Q();
        to.e eVar = m.f35080a;
        if (h10 || Q == eVar) {
            Q = new b(fVar);
            rVar.k0(Q);
        }
        b bVar = (b) Q;
        rVar.s(false);
        rVar.b0(1046463169);
        boolean j10 = rVar.j(kVar) | rVar.j(bVar);
        Object Q2 = rVar.Q();
        if (j10 || Q2 == eVar) {
            Q2 = new d(kVar, bVar, null);
            rVar.k0(Q2);
        }
        rVar.s(false);
        t.e(bVar, (Function2) Q2, rVar);
        rVar.b0(1046463438);
        boolean j11 = rVar.j(kVar) | rVar.j(bVar);
        Object Q3 = rVar.Q();
        if (j11 || Q3 == eVar) {
            Q3 = new f(kVar, bVar, null);
            rVar.k0(Q3);
        }
        rVar.s(false);
        t.e(bVar, (Function2) Q3, rVar);
        rVar.s(false);
        return bVar;
    }
}
