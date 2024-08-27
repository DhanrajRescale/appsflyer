package hv;

import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.Serializable;
import org.threeten.bp.DateTimeException;

/* loaded from: classes2.dex */
public final class l extends kv.b implements lv.j, lv.l, Comparable, Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f18744c = 0;
    private static final long serialVersionUID = 7264499704384272492L;

    /* renamed from: a, reason: collision with root package name */
    public final h f18745a;

    /* renamed from: b, reason: collision with root package name */
    public final r f18746b;

    static {
        h hVar = h.f18728e;
        r rVar = r.f18763h;
        hVar.getClass();
        new l(hVar, rVar);
        h hVar2 = h.f18729f;
        r rVar2 = r.f18762g;
        hVar2.getClass();
        new l(hVar2, rVar2);
    }

    public l(h hVar, r rVar) {
        el.l.D0(hVar, "time");
        this.f18745a = hVar;
        el.l.D0(rVar, "offset");
        this.f18746b = rVar;
    }

    public static l l(lv.k kVar) {
        if (kVar instanceof l) {
            return (l) kVar;
        }
        try {
            return new l(h.n(kVar), r.r(kVar));
        } catch (DateTimeException unused) {
            throw new RuntimeException("Unable to obtain OffsetTime from TemporalAccessor: " + kVar + ", type " + kVar.getClass().getName());
        }
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new n((byte) 66, this);
    }

    @Override // lv.j
    public final lv.j a(long j10, lv.b bVar) {
        if (j10 == Long.MIN_VALUE) {
            return c(Long.MAX_VALUE, bVar).c(1L, bVar);
        }
        return c(-j10, bVar);
    }

    @Override // kv.b, lv.k
    public final Object b(lv.o oVar) {
        if (oVar == lv.n.f25448c) {
            return lv.b.NANOS;
        }
        if (oVar != lv.n.f25450e && oVar != lv.n.f25449d) {
            if (oVar == lv.n.f25452g) {
                return this.f18745a;
            }
            if (oVar != lv.n.f25447b && oVar != lv.n.f25451f && oVar != lv.n.f25446a) {
                return super.b(oVar);
            }
            return null;
        }
        return this.f18746b;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        l lVar = (l) obj;
        boolean equals = this.f18746b.equals(lVar.f18746b);
        h hVar = this.f18745a;
        h hVar2 = lVar.f18745a;
        if (equals) {
            return hVar.compareTo(hVar2);
        }
        int C = el.l.C(n(), lVar.n());
        if (C == 0) {
            return hVar.compareTo(hVar2);
        }
        return C;
    }

    @Override // lv.j
    public final lv.j d(long j10, lv.m mVar) {
        if (mVar instanceof lv.a) {
            lv.a aVar = lv.a.OFFSET_SECONDS;
            h hVar = this.f18745a;
            if (mVar == aVar) {
                lv.a aVar2 = (lv.a) mVar;
                return o(hVar, r.u(aVar2.f25425b.a(j10, aVar2)));
            }
            return o(hVar.d(j10, mVar), this.f18746b);
        }
        return (l) mVar.g(this, j10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // lv.j
    public final lv.j e(f fVar) {
        if (fVar instanceof h) {
            return o((h) fVar, this.f18746b);
        }
        if (fVar instanceof r) {
            return o(this.f18745a, (r) fVar);
        }
        if (fVar instanceof l) {
            return (l) fVar;
        }
        return (l) fVar.h(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (this.f18745a.equals(lVar.f18745a) && this.f18746b.equals(lVar.f18746b)) {
            return true;
        }
        return false;
    }

    @Override // lv.k
    public final long f(lv.m mVar) {
        if (mVar instanceof lv.a) {
            if (mVar == lv.a.OFFSET_SECONDS) {
                return this.f18746b.f18764b;
            }
            return this.f18745a.f(mVar);
        }
        return mVar.e(this);
    }

    @Override // lv.j
    public final long g(lv.j jVar, lv.p pVar) {
        l l10 = l(jVar);
        if (pVar instanceof lv.b) {
            long n10 = l10.n() - n();
            switch ((lv.b) pVar) {
                case NANOS:
                    return n10;
                case MICROS:
                    return n10 / 1000;
                case MILLIS:
                    return n10 / 1000000;
                case SECONDS:
                    return n10 / 1000000000;
                case MINUTES:
                    return n10 / 60000000000L;
                case HOURS:
                    return n10 / 3600000000000L;
                case HALF_DAYS:
                    return n10 / 43200000000000L;
                default:
                    throw new RuntimeException("Unsupported unit: " + pVar);
            }
        }
        return pVar.b(this, l10);
    }

    @Override // lv.l
    public final lv.j h(lv.j jVar) {
        return jVar.d(this.f18745a.w(), lv.a.NANO_OF_DAY).d(this.f18746b.f18764b, lv.a.OFFSET_SECONDS);
    }

    public final int hashCode() {
        return this.f18745a.hashCode() ^ this.f18746b.f18764b;
    }

    @Override // lv.k
    public final boolean i(lv.m mVar) {
        if (mVar instanceof lv.a) {
            if (mVar.f() || mVar == lv.a.OFFSET_SECONDS) {
                return true;
            }
            return false;
        }
        if (mVar != null && mVar.c(this)) {
            return true;
        }
        return false;
    }

    @Override // kv.b, lv.k
    public final lv.q j(lv.m mVar) {
        if (mVar instanceof lv.a) {
            if (mVar == lv.a.OFFSET_SECONDS) {
                return mVar.d();
            }
            return this.f18745a.j(mVar);
        }
        return mVar.b(this);
    }

    @Override // kv.b, lv.k
    public final int k(lv.m mVar) {
        return super.k(mVar);
    }

    @Override // lv.j
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public final l c(long j10, lv.p pVar) {
        if (pVar instanceof lv.b) {
            return o(this.f18745a.c(j10, pVar), this.f18746b);
        }
        return (l) pVar.c(this, j10);
    }

    public final long n() {
        return this.f18745a.w() - (this.f18746b.f18764b * 1000000000);
    }

    public final l o(h hVar, r rVar) {
        if (this.f18745a == hVar && this.f18746b.equals(rVar)) {
            return this;
        }
        return new l(hVar, rVar);
    }

    public final String toString() {
        return this.f18745a.toString() + this.f18746b.f18765c;
    }
}
