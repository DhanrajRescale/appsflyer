package iv;

import el.l;
import hv.g;
import hv.t;
import lv.m;
import lv.n;
import lv.o;

/* loaded from: classes2.dex */
public abstract class d extends kv.a implements Comparable {
    @Override // kv.b, lv.k
    public Object b(o oVar) {
        if (oVar != n.f25446a && oVar != n.f25449d) {
            if (oVar == n.f25447b) {
                ((t) this).f18769a.f18726a.getClass();
                return f.f20561a;
            }
            if (oVar == n.f25448c) {
                return lv.b.NANOS;
            }
            if (oVar == n.f25450e) {
                return ((t) this).f18770b;
            }
            if (oVar == n.f25451f) {
                return hv.f.B(((t) this).f18769a.f18726a.l());
            }
            if (oVar == n.f25452g) {
                return ((t) this).f18769a.f18727b;
            }
            return super.b(oVar);
        }
        return ((t) this).f18771c;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        d dVar = (d) obj;
        int C = l.C(m(), dVar.m());
        if (C == 0) {
            t tVar = (t) this;
            g gVar = tVar.f18769a;
            int i10 = gVar.f18727b.f18734d;
            t tVar2 = (t) dVar;
            g gVar2 = tVar2.f18769a;
            int i11 = i10 - gVar2.f18727b.f18734d;
            if (i11 == 0 && (i11 = gVar.compareTo(gVar2)) == 0) {
                int compareTo = tVar.f18771c.m().compareTo(tVar2.f18771c.m());
                if (compareTo == 0) {
                    gVar.f18726a.getClass();
                    f fVar = f.f20561a;
                    gVar2.f18726a.getClass();
                    fVar.getClass();
                    return 0;
                }
                return compareTo;
            }
            return i11;
        }
        return C;
    }

    @Override // kv.b, lv.k
    public int k(m mVar) {
        if (mVar instanceof lv.a) {
            int ordinal = ((lv.a) mVar).ordinal();
            if (ordinal != 28) {
                if (ordinal != 29) {
                    return ((t) this).f18769a.k(mVar);
                }
                return ((t) this).f18770b.f18764b;
            }
            throw new RuntimeException(da.e.n("Field too large for an int: ", mVar));
        }
        return super.k(mVar);
    }

    public final boolean l(t tVar) {
        long m10 = m();
        long m11 = tVar.m();
        if (m10 <= m11 && (m10 != m11 || ((t) this).f18769a.f18727b.f18734d <= tVar.f18769a.f18727b.f18734d)) {
            return false;
        }
        return true;
    }

    public final long m() {
        return ((((t) this).f18769a.f18726a.l() * 86400) + r1.f18727b.x()) - r0.f18770b.f18764b;
    }
}
