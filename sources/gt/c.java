package gt;

import hv.f;
import hv.i;
import hv.l;
import hv.q;
import hv.r;
import lv.k;
import lv.n;
import lv.o;
import lv.p;
import org.threeten.bp.DateTimeException;

/* loaded from: classes2.dex */
public final class c implements et.d, et.e, o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17567a;

    public /* synthetic */ c(int i10) {
        this.f17567a = i10;
    }

    @Override // et.d
    public final Object apply(Object obj) {
        return obj;
    }

    @Override // et.e
    public final boolean d(Object obj) {
        return true;
    }

    @Override // lv.o
    public final Object h(k kVar) {
        de.d dVar = n.f25446a;
        int i10 = this.f17567a;
        switch (i10) {
            case 7:
                switch (i10) {
                    case 7:
                        return f.p(kVar);
                    default:
                        lv.a aVar = lv.a.EPOCH_DAY;
                        if (!kVar.i(aVar)) {
                            return null;
                        }
                        return f.B(kVar.f(aVar));
                }
            case 8:
                i iVar = i.f18735a;
                if (kVar instanceof i) {
                    return (i) kVar;
                }
                try {
                    if (!iv.f.f20561a.equals(iv.e.a(kVar))) {
                        kVar = f.p(kVar);
                    }
                    return i.p(kVar.k(lv.a.MONTH_OF_YEAR));
                } catch (DateTimeException e10) {
                    throw new RuntimeException("Unable to obtain Month from TemporalAccessor: " + kVar + ", type " + kVar.getClass().getName(), e10);
                }
            case 9:
                return l.l(kVar);
            case 10:
                switch (i10) {
                    case 10:
                        return q.l(kVar);
                    default:
                        q qVar = (q) kVar.b(dVar);
                        if (qVar == null || (qVar instanceof r)) {
                            return null;
                        }
                        return qVar;
                }
            case 11:
                return iv.e.a(kVar);
            case 12:
                switch (i10) {
                    case 10:
                        return q.l(kVar);
                    default:
                        q qVar2 = (q) kVar.b(dVar);
                        if (qVar2 == null || (qVar2 instanceof r)) {
                            return null;
                        }
                        return qVar2;
                }
            case 13:
                return (p) kVar.b(this);
            default:
                switch (i10) {
                    case 7:
                        return f.p(kVar);
                    default:
                        lv.a aVar2 = lv.a.EPOCH_DAY;
                        if (!kVar.i(aVar2)) {
                            return null;
                        }
                        return f.B(kVar.f(aVar2));
                }
        }
    }

    public final String toString() {
        switch (this.f17567a) {
            case 0:
                return "IdentityFunction";
            default:
                return super.toString();
        }
    }
}
