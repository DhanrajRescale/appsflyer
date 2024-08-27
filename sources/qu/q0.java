package qu;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import ut.l;

/* loaded from: classes2.dex */
public abstract class q0 {
    public static final boolean a(int i10) {
        return i10 == 1 || i10 == 2;
    }

    public static final void b(p0 p0Var, yt.a aVar, boolean z10) {
        Object f10;
        q2 q2Var;
        boolean n0;
        Object h10 = p0Var.h();
        Throwable d10 = p0Var.d(h10);
        if (d10 != null) {
            l.Companion companion = ut.l.INSTANCE;
            f10 = ut.n.a(d10);
        } else {
            l.Companion companion2 = ut.l.INSTANCE;
            f10 = p0Var.f(h10);
        }
        if (z10) {
            Intrinsics.d(aVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
            vu.h hVar = (vu.h) aVar;
            yt.a aVar2 = hVar.f38375e;
            CoroutineContext context = aVar2.getContext();
            Object c10 = vu.f0.c(context, hVar.f38377g);
            if (c10 != vu.f0.f38366a) {
                q2Var = yk.g.d0(aVar2, context, c10);
            } else {
                q2Var = null;
            }
            try {
                aVar2.resumeWith(f10);
                Unit unit = Unit.f23355a;
                if (q2Var != null) {
                    if (!n0) {
                        return;
                    }
                }
                return;
            } finally {
                if (q2Var == null || q2Var.n0()) {
                    vu.f0.a(context, c10);
                }
            }
        }
        aVar.resumeWith(f10);
    }
}
