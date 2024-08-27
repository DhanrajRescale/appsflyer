package hv;

import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.Serializable;
import org.threeten.bp.DateTimeException;

/* loaded from: classes2.dex */
public final class k extends kv.a implements lv.l, Comparable, Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f18741c = 0;
    private static final long serialVersionUID = 2287754244819255394L;

    /* renamed from: a, reason: collision with root package name */
    public final g f18742a;

    /* renamed from: b, reason: collision with root package name */
    public final r f18743b;

    static {
        g gVar = g.f18724c;
        r rVar = r.f18763h;
        gVar.getClass();
        new k(gVar, rVar);
        g gVar2 = g.f18725d;
        r rVar2 = r.f18762g;
        gVar2.getClass();
        new k(gVar2, rVar2);
    }

    public k(g gVar, r rVar) {
        el.l.D0(gVar, "dateTime");
        this.f18742a = gVar;
        el.l.D0(rVar, "offset");
        this.f18743b = rVar;
    }

    public static k l(lv.k kVar) {
        if (kVar instanceof k) {
            return (k) kVar;
        }
        try {
            r r10 = r.r(kVar);
            try {
                return new k(g.p(kVar), r10);
            } catch (DateTimeException unused) {
                return m(e.m(kVar), r10);
            }
        } catch (DateTimeException unused2) {
            throw new RuntimeException("Unable to obtain OffsetDateTime from TemporalAccessor: " + kVar + ", type " + kVar.getClass().getName());
        }
    }

    public static k m(e eVar, r rVar) {
        el.l.D0(eVar, "instant");
        el.l.D0(rVar, "zone");
        mv.g gVar = new mv.g(rVar);
        long j10 = eVar.f18717a;
        int i10 = eVar.f18718b;
        r rVar2 = gVar.f28103a;
        return new k(g.u(j10, i10, rVar2), rVar2);
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new n((byte) 69, this);
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
        if (oVar == lv.n.f25447b) {
            return iv.f.f20561a;
        }
        if (oVar == lv.n.f25448c) {
            return lv.b.NANOS;
        }
        if (oVar != lv.n.f25450e && oVar != lv.n.f25449d) {
            gt.c cVar = lv.n.f25451f;
            g gVar = this.f18742a;
            if (oVar == cVar) {
                return gVar.f18726a;
            }
            if (oVar == lv.n.f25452g) {
                return gVar.f18727b;
            }
            if (oVar == lv.n.f25446a) {
                return null;
            }
            return super.b(oVar);
        }
        return this.f18743b;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        k kVar = (k) obj;
        r rVar = kVar.f18743b;
        r rVar2 = this.f18743b;
        boolean equals = rVar2.equals(rVar);
        g gVar = kVar.f18742a;
        g gVar2 = this.f18742a;
        if (equals) {
            return gVar2.compareTo(gVar);
        }
        int C = el.l.C(gVar2.l(rVar2), gVar.l(kVar.f18743b));
        if (C == 0) {
            int i10 = gVar2.f18727b.f18734d - gVar.f18727b.f18734d;
            if (i10 == 0) {
                return gVar2.compareTo(gVar);
            }
            return i10;
        }
        return C;
    }

    @Override // lv.j
    public final lv.j d(long j10, lv.m mVar) {
        if (mVar instanceof lv.a) {
            lv.a aVar = (lv.a) mVar;
            int ordinal = aVar.ordinal();
            g gVar = this.f18742a;
            r rVar = this.f18743b;
            if (ordinal != 28) {
                if (ordinal != 29) {
                    return o(gVar.d(j10, mVar), rVar);
                }
                return o(gVar, r.u(aVar.f25425b.a(j10, aVar)));
            }
            return m(e.o(j10, gVar.f18727b.f18734d), rVar);
        }
        return (k) mVar.g(this, j10);
    }

    @Override // lv.j
    public final lv.j e(f fVar) {
        g gVar = this.f18742a;
        return o(gVar.B(fVar, gVar.f18727b), this.f18743b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (this.f18742a.equals(kVar.f18742a) && this.f18743b.equals(kVar.f18743b)) {
            return true;
        }
        return false;
    }

    @Override // lv.k
    public final long f(lv.m mVar) {
        if (mVar instanceof lv.a) {
            int ordinal = ((lv.a) mVar).ordinal();
            r rVar = this.f18743b;
            g gVar = this.f18742a;
            if (ordinal != 28) {
                if (ordinal != 29) {
                    return gVar.f(mVar);
                }
                return rVar.f18764b;
            }
            return gVar.l(rVar);
        }
        return mVar.e(this);
    }

    @Override // lv.j
    public final long g(lv.j jVar, lv.p pVar) {
        k l10 = l(jVar);
        if (pVar instanceof lv.b) {
            r rVar = l10.f18743b;
            r rVar2 = this.f18743b;
            if (!rVar2.equals(rVar)) {
                l10 = new k(l10.f18742a.y(rVar2.f18764b - rVar.f18764b), rVar2);
            }
            return this.f18742a.g(l10.f18742a, pVar);
        }
        return pVar.b(this, l10);
    }

    @Override // lv.l
    public final lv.j h(lv.j jVar) {
        lv.a aVar = lv.a.EPOCH_DAY;
        g gVar = this.f18742a;
        return jVar.d(gVar.f18726a.l(), aVar).d(gVar.f18727b.w(), lv.a.NANO_OF_DAY).d(this.f18743b.f18764b, lv.a.OFFSET_SECONDS);
    }

    public final int hashCode() {
        return this.f18742a.hashCode() ^ this.f18743b.f18764b;
    }

    @Override // lv.k
    public final boolean i(lv.m mVar) {
        if (!(mVar instanceof lv.a) && (mVar == null || !mVar.c(this))) {
            return false;
        }
        return true;
    }

    @Override // kv.b, lv.k
    public final lv.q j(lv.m mVar) {
        if (mVar instanceof lv.a) {
            if (mVar != lv.a.INSTANT_SECONDS && mVar != lv.a.OFFSET_SECONDS) {
                return this.f18742a.j(mVar);
            }
            return mVar.d();
        }
        return mVar.b(this);
    }

    @Override // kv.b, lv.k
    public final int k(lv.m mVar) {
        if (mVar instanceof lv.a) {
            int ordinal = ((lv.a) mVar).ordinal();
            if (ordinal != 28) {
                if (ordinal != 29) {
                    return this.f18742a.k(mVar);
                }
                return this.f18743b.f18764b;
            }
            throw new RuntimeException(da.e.n("Field too large for an int: ", mVar));
        }
        return super.k(mVar);
    }

    @Override // lv.j
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public final k c(long j10, lv.p pVar) {
        if (pVar instanceof lv.b) {
            return o(this.f18742a.c(j10, pVar), this.f18743b);
        }
        return (k) pVar.c(this, j10);
    }

    public final k o(g gVar, r rVar) {
        if (this.f18742a == gVar && this.f18743b.equals(rVar)) {
            return this;
        }
        return new k(gVar, rVar);
    }

    public final String toString() {
        return this.f18742a.toString() + this.f18743b.f18765c;
    }
}
