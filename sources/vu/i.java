package vu;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import qu.b1;
import qu.k2;
import qu.o1;
import qu.q2;

/* loaded from: classes2.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final kp.g f38381a = new kp.g("UNDEFINED", 1);

    /* renamed from: b, reason: collision with root package name */
    public static final kp.g f38382b = new kp.g("REUSABLE_CLAIMED", 1);

    public static final void a(yt.a aVar, Object obj, Function1 function1) {
        Object tVar;
        q2 q2Var;
        if (aVar instanceof h) {
            h hVar = (h) aVar;
            Throwable a10 = ut.l.a(obj);
            if (a10 == null) {
                if (function1 != null) {
                    tVar = new qu.u(function1, obj);
                } else {
                    tVar = obj;
                }
            } else {
                tVar = new qu.t(a10, false);
            }
            qu.b0 b0Var = hVar.f38374d;
            yt.a aVar2 = hVar.f38375e;
            aVar2.getContext();
            if (b0Var.d0()) {
                hVar.f38376f = tVar;
                hVar.f32251c = 1;
                hVar.f38374d.b0(aVar2.getContext(), hVar);
                return;
            }
            b1 a11 = k2.a();
            if (a11.j0()) {
                hVar.f38376f = tVar;
                hVar.f32251c = 1;
                a11.g0(hVar);
                return;
            }
            a11.i0(true);
            try {
                o1 o1Var = (o1) aVar2.getContext().g(qu.c0.f32192b);
                if (o1Var != null && !o1Var.b()) {
                    CancellationException v10 = o1Var.v();
                    hVar.b(tVar, v10);
                    hVar.resumeWith(ut.n.a(v10));
                } else {
                    Object obj2 = hVar.f38377g;
                    CoroutineContext context = aVar2.getContext();
                    Object c10 = f0.c(context, obj2);
                    if (c10 != f0.f38366a) {
                        q2Var = yk.g.d0(aVar2, context, c10);
                    } else {
                        q2Var = null;
                    }
                    try {
                        aVar2.resumeWith(obj);
                        Unit unit = Unit.f23355a;
                    } finally {
                        if (q2Var == null || q2Var.n0()) {
                            f0.a(context, c10);
                        }
                    }
                }
                do {
                } while (a11.l0());
            } finally {
                try {
                    return;
                } finally {
                }
            }
            return;
        }
        aVar.resumeWith(obj);
    }
}
