package iv;

import hv.g;
import hv.r;
import lv.l;
import lv.n;
import lv.o;

/* loaded from: classes2.dex */
public abstract class b extends kv.a implements l, Comparable {
    @Override // kv.b, lv.k
    public Object b(o oVar) {
        if (oVar == n.f25447b) {
            ((g) this).f18726a.getClass();
            return f.f20561a;
        }
        if (oVar == n.f25448c) {
            return lv.b.NANOS;
        }
        if (oVar == n.f25451f) {
            return hv.f.B(((g) this).f18726a.l());
        }
        if (oVar == n.f25452g) {
            return ((g) this).f18727b;
        }
        if (oVar != n.f25449d && oVar != n.f25446a && oVar != n.f25450e) {
            return super.b(oVar);
        }
        return null;
    }

    public final long l(r rVar) {
        el.l.D0(rVar, "offset");
        return ((((g) this).f18726a.l() * 86400) + r0.f18727b.x()) - rVar.f18764b;
    }
}
