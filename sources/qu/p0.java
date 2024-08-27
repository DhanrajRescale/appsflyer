package qu;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import ut.l;

/* loaded from: classes2.dex */
public abstract class p0 extends xu.i {

    /* renamed from: c, reason: collision with root package name */
    public int f32251c;

    public p0(int i10) {
        super(0L, xu.k.f40598g);
        this.f32251c = i10;
    }

    public abstract void b(Object obj, CancellationException cancellationException);

    public abstract yt.a c();

    public Throwable d(Object obj) {
        t tVar;
        if (obj instanceof t) {
            tVar = (t) obj;
        } else {
            tVar = null;
        }
        if (tVar == null) {
            return null;
        }
        return tVar.f32267a;
    }

    public Object f(Object obj) {
        return obj;
    }

    public final void g(Throwable th2, Throwable th3) {
        if (th2 == null && th3 == null) {
            return;
        }
        if (th2 != null && th3 != null) {
            ut.c.a(th2, th3);
        }
        if (th2 == null) {
            th2 = th3;
        }
        Intrinsics.c(th2);
        el.l.k0(c().getContext(), new Error("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th2));
    }

    public abstract Object h();

    @Override // java.lang.Runnable
    public final void run() {
        Object a10;
        q2 q2Var;
        o1 o1Var;
        Object a11;
        de.d dVar = this.f40590b;
        try {
            yt.a c10 = c();
            Intrinsics.d(c10, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            vu.h hVar = (vu.h) c10;
            yt.a aVar = hVar.f38375e;
            Object obj = hVar.f38377g;
            CoroutineContext context = aVar.getContext();
            Object c11 = vu.f0.c(context, obj);
            if (c11 != vu.f0.f38366a) {
                q2Var = yk.g.d0(aVar, context, c11);
            } else {
                q2Var = null;
            }
            try {
                CoroutineContext context2 = aVar.getContext();
                Object h10 = h();
                Throwable d10 = d(h10);
                if (d10 == null && q0.a(this.f32251c)) {
                    o1Var = (o1) context2.g(c0.f32192b);
                } else {
                    o1Var = null;
                }
                if (o1Var != null && !o1Var.b()) {
                    CancellationException v10 = o1Var.v();
                    b(h10, v10);
                    l.Companion companion = ut.l.INSTANCE;
                    aVar.resumeWith(ut.n.a(v10));
                } else if (d10 != null) {
                    l.Companion companion2 = ut.l.INSTANCE;
                    aVar.resumeWith(ut.n.a(d10));
                } else {
                    l.Companion companion3 = ut.l.INSTANCE;
                    aVar.resumeWith(f(h10));
                }
                Unit unit = Unit.f23355a;
                if (q2Var == null || q2Var.n0()) {
                    vu.f0.a(context, c11);
                }
                try {
                    dVar.getClass();
                    a11 = Unit.f23355a;
                } catch (Throwable th2) {
                    l.Companion companion4 = ut.l.INSTANCE;
                    a11 = ut.n.a(th2);
                }
                g(null, ut.l.a(a11));
            } catch (Throwable th3) {
                if (q2Var == null || q2Var.n0()) {
                    vu.f0.a(context, c11);
                }
                throw th3;
            }
        } catch (Throwable th4) {
            try {
                l.Companion companion5 = ut.l.INSTANCE;
                dVar.getClass();
                a10 = Unit.f23355a;
            } catch (Throwable th5) {
                l.Companion companion6 = ut.l.INSTANCE;
                a10 = ut.n.a(th5);
            }
            g(th4, ut.l.a(a10));
        }
    }
}
