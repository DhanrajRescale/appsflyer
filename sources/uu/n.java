package uu;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes2.dex */
public final class n extends h {

    /* renamed from: e, reason: collision with root package name */
    public final hu.c f37455e;

    public n(hu.c cVar, tu.f fVar, CoroutineContext coroutineContext, int i10, su.a aVar) {
        super(i10, coroutineContext, aVar, fVar);
        this.f37455e = cVar;
    }

    @Override // uu.f
    public final f i(CoroutineContext coroutineContext, int i10, su.a aVar) {
        return new n(this.f37455e, this.f37437d, coroutineContext, i10, aVar);
    }

    @Override // uu.h
    public final Object l(tu.g gVar, yt.a aVar) {
        Object P = hl.f.P(new m(this, gVar, null), aVar);
        if (P == zt.a.f42823a) {
            return P;
        }
        return Unit.f23355a;
    }
}
