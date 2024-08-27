package qu;

import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CompletionHandlerException;
import ut.l;

/* loaded from: classes2.dex */
public abstract class a extends x1 implements yt.a, f0 {

    /* renamed from: c, reason: collision with root package name */
    public final CoroutineContext f32177c;

    public a(CoroutineContext coroutineContext, boolean z10) {
        super(z10);
        V((o1) coroutineContext.g(c0.f32192b));
        this.f32177c = coroutineContext.l(this);
    }

    @Override // qu.x1
    public final String B() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    @Override // qu.f0
    public final CoroutineContext H() {
        return this.f32177c;
    }

    @Override // qu.x1
    public final void T(CompletionHandlerException completionHandlerException) {
        el.l.k0(this.f32177c, completionHandlerException);
    }

    @Override // qu.x1, qu.o1
    public boolean b() {
        return super.b();
    }

    @Override // qu.x1
    public String b0() {
        return super.b0();
    }

    @Override // qu.x1
    public final void e0(Object obj) {
        boolean z10;
        if (obj instanceof t) {
            t tVar = (t) obj;
            Throwable th2 = tVar.f32267a;
            tVar.getClass();
            if (t.f32266b.get(tVar) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            k0(th2, z10);
            return;
        }
        l0(obj);
    }

    @Override // yt.a
    public final CoroutineContext getContext() {
        return this.f32177c;
    }

    public void k0(Throwable th2, boolean z10) {
    }

    public void l0(Object obj) {
    }

    public final void m0(g0 g0Var, a aVar, Function2 function2) {
        Object invoke;
        int ordinal = g0Var.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        Intrinsics.checkNotNullParameter(this, "completion");
                        try {
                            CoroutineContext coroutineContext = this.f32177c;
                            Object c10 = vu.f0.c(coroutineContext, null);
                            try {
                                if (!(function2 instanceof au.a)) {
                                    invoke = zt.f.c(aVar, this, function2);
                                } else {
                                    zq.f.z(2, function2);
                                    invoke = function2.invoke(aVar, this);
                                }
                                vu.f0.a(coroutineContext, c10);
                                if (invoke != zt.a.f42823a) {
                                    l.Companion companion = ut.l.INSTANCE;
                                    resumeWith(invoke);
                                    return;
                                }
                                return;
                            } catch (Throwable th2) {
                                vu.f0.a(coroutineContext, c10);
                                throw th2;
                            }
                        } catch (Throwable th3) {
                            l.Companion companion2 = ut.l.INSTANCE;
                            resumeWith(ut.n.a(th3));
                            return;
                        }
                    }
                    throw new NoWhenBranchMatchedException();
                }
                Intrinsics.checkNotNullParameter(function2, "<this>");
                Intrinsics.checkNotNullParameter(this, "completion");
                yt.a b10 = zt.f.b(zt.f.a(aVar, this, function2));
                l.Companion companion3 = ut.l.INSTANCE;
                b10.resumeWith(Unit.f23355a);
                return;
            }
            return;
        }
        wu.a.a(function2, aVar, this);
    }

    @Override // yt.a
    public final void resumeWith(Object obj) {
        Throwable a10 = ut.l.a(obj);
        if (a10 != null) {
            obj = new t(a10, false);
        }
        Object a02 = a0(obj);
        if (a02 == y1.f32302b) {
            return;
        }
        t(a02);
    }
}
