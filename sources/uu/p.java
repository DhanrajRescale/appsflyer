package uu;

import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import qu.f0;
import qu.g0;

/* loaded from: classes2.dex */
public final class p extends f {

    /* renamed from: d, reason: collision with root package name */
    public final Iterable f37459d;

    public p(Iterable iterable, CoroutineContext coroutineContext, int i10, su.a aVar) {
        super(coroutineContext, i10, aVar);
        this.f37459d = iterable;
    }

    @Override // uu.f
    public final Object h(su.n nVar, yt.a aVar) {
        a0 a0Var = new a0(nVar);
        Iterator it = this.f37459d.iterator();
        while (it.hasNext()) {
            yk.g.H(nVar, null, null, new o((tu.f) it.next(), a0Var, null), 3);
        }
        return Unit.f23355a;
    }

    @Override // uu.f
    public final f i(CoroutineContext coroutineContext, int i10, su.a aVar) {
        return new p(this.f37459d, coroutineContext, i10, aVar);
    }

    @Override // uu.f
    public final su.o k(f0 f0Var) {
        Function2 eVar = new e(this, null);
        su.a aVar = su.a.f34776a;
        g0 g0Var = g0.f32205a;
        su.m mVar = new su.m(yk.g.J(f0Var, this.f37431a), hl.f.a(this.f37432b, aVar, 4));
        mVar.m0(g0Var, mVar, eVar);
        return mVar;
    }
}
