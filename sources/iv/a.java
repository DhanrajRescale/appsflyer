package iv;

import lv.l;
import lv.m;
import lv.n;
import lv.o;

/* loaded from: classes2.dex */
public abstract class a extends kv.a implements l, Comparable {
    @Override // kv.b, lv.k
    public Object b(o oVar) {
        if (oVar == n.f25447b) {
            return f.f20561a;
        }
        if (oVar == n.f25448c) {
            return lv.b.DAYS;
        }
        if (oVar == n.f25451f) {
            return hv.f.B(l());
        }
        if (oVar != n.f25452g && oVar != n.f25449d && oVar != n.f25446a && oVar != n.f25450e) {
            return super.b(oVar);
        }
        return null;
    }

    @Override // lv.k
    public abstract boolean i(m mVar);

    public abstract long l();
}
