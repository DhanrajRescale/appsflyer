package b1;

import iu.k;
import kotlin.jvm.internal.Intrinsics;
import t0.m;
import t0.n;
import t0.r;
import t0.w1;
import t0.x1;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f3079a = new Object();

    public static final int a(int i10, int i11) {
        return i10 << (((i11 % 10) * 3) + 1);
    }

    public static final c b(n nVar, int i10, k kVar) {
        c cVar;
        r rVar = (r) nVar;
        rVar.Z(Integer.rotateLeft(i10, 1), f3079a);
        Object Q = rVar.Q();
        if (Q == m.f35080a) {
            cVar = new c(kVar, true, i10);
            rVar.k0(cVar);
        } else {
            Intrinsics.d(Q, "null cannot be cast to non-null type androidx.compose.runtime.internal.ComposableLambdaImpl");
            cVar = (c) Q;
            cVar.i(kVar);
        }
        rVar.s(false);
        return cVar;
    }

    public static final c c(int i10, k kVar, n nVar) {
        r rVar = (r) nVar;
        Object g10 = v.e.g(rVar, -1573003438, -1046413819);
        if (g10 == m.f35080a) {
            g10 = new c(kVar, true, i10);
            rVar.k0(g10);
        }
        c cVar = (c) g10;
        rVar.s(false);
        cVar.i(kVar);
        rVar.s(false);
        return cVar;
    }

    public static final boolean d(w1 w1Var, x1 x1Var) {
        if (w1Var != null) {
            if (w1Var instanceof x1) {
                x1 x1Var2 = (x1) w1Var;
                if (!x1Var2.a() || Intrinsics.a(w1Var, x1Var) || Intrinsics.a(x1Var2.f35244c, x1Var.f35244c)) {
                }
            }
            return false;
        }
        return true;
    }
}
