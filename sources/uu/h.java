package uu;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import vu.f0;

/* loaded from: classes2.dex */
public abstract class h extends f {

    /* renamed from: d, reason: collision with root package name */
    public final tu.f f37437d;

    public h(int i10, CoroutineContext coroutineContext, su.a aVar, tu.f fVar) {
        super(coroutineContext, i10, aVar);
        this.f37437d = fVar;
    }

    @Override // uu.f, tu.f
    public final Object c(tu.g gVar, yt.a aVar) {
        CoroutineContext u10;
        if (this.f37432b == -3) {
            CoroutineContext context = aVar.getContext();
            Boolean bool = Boolean.FALSE;
            qu.y yVar = qu.y.f32298a;
            CoroutineContext coroutineContext = this.f37431a;
            if (!((Boolean) coroutineContext.R(bool, yVar)).booleanValue()) {
                u10 = context.l(coroutineContext);
            } else {
                u10 = yk.g.u(context, coroutineContext, false);
            }
            if (Intrinsics.a(u10, context)) {
                Object l10 = l(gVar, aVar);
                if (l10 != zt.a.f42823a) {
                    return Unit.f23355a;
                }
                return l10;
            }
            yt.b bVar = kotlin.coroutines.f.O;
            if (Intrinsics.a(u10.g(bVar), context.g(bVar))) {
                CoroutineContext context2 = aVar.getContext();
                if (!(gVar instanceof a0) && !(gVar instanceof t)) {
                    gVar = new v.j(gVar, context2);
                }
                Object X0 = el.l.X0(u10, gVar, f0.b(u10), new g(this, null), aVar);
                if (X0 != zt.a.f42823a) {
                    return Unit.f23355a;
                }
                return X0;
            }
        }
        Object c10 = super.c(gVar, aVar);
        if (c10 != zt.a.f42823a) {
            return Unit.f23355a;
        }
        return c10;
    }

    @Override // uu.f
    public final Object h(su.n nVar, yt.a aVar) {
        Object l10 = l(new a0(nVar), aVar);
        if (l10 != zt.a.f42823a) {
            return Unit.f23355a;
        }
        return l10;
    }

    public abstract Object l(tu.g gVar, yt.a aVar);

    @Override // uu.f
    public final String toString() {
        return this.f37437d + " -> " + super.toString();
    }
}
