package uu;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import qu.b2;

/* loaded from: classes2.dex */
public final class i extends h {
    public i(tu.f fVar, b2 b2Var, int i10, su.a aVar, int i11) {
        super((i11 & 4) != 0 ? -3 : i10, (i11 & 2) != 0 ? kotlin.coroutines.k.f23369a : b2Var, (i11 & 8) != 0 ? su.a.f34776a : aVar, fVar);
    }

    @Override // uu.f
    public final f i(CoroutineContext coroutineContext, int i10, su.a aVar) {
        return new h(i10, coroutineContext, aVar, this.f37437d);
    }

    @Override // uu.f
    public final tu.f j() {
        return this.f37437d;
    }

    @Override // uu.h
    public final Object l(tu.g gVar, yt.a aVar) {
        Object c10 = this.f37437d.c(gVar, aVar);
        if (c10 == zt.a.f42823a) {
            return c10;
        }
        return Unit.f23355a;
    }
}
