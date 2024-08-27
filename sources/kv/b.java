package kv;

import da.e;
import lv.k;
import lv.m;
import lv.n;
import lv.o;
import lv.q;

/* loaded from: classes2.dex */
public abstract class b implements k {
    @Override // lv.k
    public Object b(o oVar) {
        if (oVar != n.f25446a && oVar != n.f25447b && oVar != n.f25448c) {
            return oVar.h(this);
        }
        return null;
    }

    @Override // lv.k
    public q j(m mVar) {
        if (mVar instanceof lv.a) {
            if (i(mVar)) {
                return mVar.d();
            }
            throw new RuntimeException(e.n("Unsupported field: ", mVar));
        }
        return mVar.b(this);
    }

    @Override // lv.k
    public int k(m mVar) {
        return j(mVar).a(f(mVar), mVar);
    }
}
