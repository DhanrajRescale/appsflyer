package hv;

import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.List;
import org.threeten.bp.DateTimeException;

/* loaded from: classes2.dex */
public final class t extends iv.d implements Serializable {
    private static final long serialVersionUID = -6260982410461394882L;

    /* renamed from: a, reason: collision with root package name */
    public final g f18769a;

    /* renamed from: b, reason: collision with root package name */
    public final r f18770b;

    /* renamed from: c, reason: collision with root package name */
    public final q f18771c;

    public t(g gVar, q qVar, r rVar) {
        this.f18769a = gVar;
        this.f18770b = rVar;
        this.f18771c = qVar;
    }

    public static t n(long j10, int i10, q qVar) {
        r a10 = qVar.n().a(e.o(j10, i10));
        return new t(g.u(j10, i10, a10), qVar, a10);
    }

    public static t o(lv.k kVar) {
        if (kVar instanceof t) {
            return (t) kVar;
        }
        try {
            q l10 = q.l(kVar);
            lv.a aVar = lv.a.INSTANT_SECONDS;
            if (kVar.i(aVar)) {
                try {
                    return n(kVar.f(aVar), kVar.k(lv.a.NANO_OF_SECOND), l10);
                } catch (DateTimeException unused) {
                }
            }
            return q(g.p(kVar), l10, null);
        } catch (DateTimeException unused2) {
            throw new RuntimeException("Unable to obtain ZonedDateTime from TemporalAccessor: " + kVar + ", type " + kVar.getClass().getName());
        }
    }

    public static t p(e eVar, q qVar) {
        el.l.D0(eVar, "instant");
        el.l.D0(qVar, "zone");
        return n(eVar.f18717a, eVar.f18718b, qVar);
    }

    public static t q(g gVar, q qVar, r rVar) {
        el.l.D0(gVar, "localDateTime");
        el.l.D0(qVar, "zone");
        if (qVar instanceof r) {
            return new t(gVar, qVar, (r) qVar);
        }
        mv.h n10 = qVar.n();
        List c10 = n10.c(gVar);
        if (c10.size() == 1) {
            rVar = (r) c10.get(0);
        } else if (c10.size() == 0) {
            mv.e b10 = n10.b(gVar);
            gVar = gVar.y(d.b(0, b10.f28093c.f18764b - b10.f28092b.f18764b).f18714a);
            rVar = b10.f28093c;
        } else if (rVar == null || !c10.contains(rVar)) {
            Object obj = c10.get(0);
            el.l.D0(obj, "offset");
            rVar = (r) obj;
        }
        return new t(gVar, qVar, rVar);
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new n((byte) 6, this);
    }

    @Override // lv.j
    public final lv.j a(long j10, lv.b bVar) {
        if (j10 == Long.MIN_VALUE) {
            return c(Long.MAX_VALUE, bVar).c(1L, bVar);
        }
        return c(-j10, bVar);
    }

    @Override // iv.d, kv.b, lv.k
    public final Object b(lv.o oVar) {
        if (oVar == lv.n.f25451f) {
            return this.f18769a.f18726a;
        }
        return super.b(oVar);
    }

    @Override // lv.j
    public final lv.j d(long j10, lv.m mVar) {
        if (mVar instanceof lv.a) {
            lv.a aVar = (lv.a) mVar;
            int ordinal = aVar.ordinal();
            q qVar = this.f18771c;
            g gVar = this.f18769a;
            if (ordinal != 28) {
                if (ordinal != 29) {
                    return u(gVar.d(j10, mVar));
                }
                r u10 = r.u(aVar.f25425b.a(j10, aVar));
                if (!u10.equals(this.f18770b) && qVar.n().f(gVar, u10)) {
                    return new t(gVar, qVar, u10);
                }
                return this;
            }
            return n(j10, gVar.f18727b.f18734d, qVar);
        }
        return (t) mVar.g(this, j10);
    }

    @Override // lv.j
    public final lv.j e(f fVar) {
        return u(g.t(fVar, this.f18769a.f18727b));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        if (this.f18769a.equals(tVar.f18769a) && this.f18770b.equals(tVar.f18770b) && this.f18771c.equals(tVar.f18771c)) {
            return true;
        }
        return false;
    }

    @Override // lv.k
    public final long f(lv.m mVar) {
        if (mVar instanceof lv.a) {
            int ordinal = ((lv.a) mVar).ordinal();
            if (ordinal != 28) {
                if (ordinal != 29) {
                    return this.f18769a.f(mVar);
                }
                return this.f18770b.f18764b;
            }
            return m();
        }
        return mVar.e(this);
    }

    @Override // lv.j
    public final long g(lv.j jVar, lv.p pVar) {
        t o10 = o(jVar);
        if (pVar instanceof lv.b) {
            o10.getClass();
            q qVar = this.f18771c;
            el.l.D0(qVar, "zone");
            if (!o10.f18771c.equals(qVar)) {
                r rVar = o10.f18770b;
                g gVar = o10.f18769a;
                o10 = n(gVar.l(rVar), gVar.f18727b.f18734d, qVar);
            }
            boolean a10 = pVar.a();
            g gVar2 = this.f18769a;
            g gVar3 = o10.f18769a;
            if (a10) {
                return gVar2.g(gVar3, pVar);
            }
            return new k(gVar2, this.f18770b).g(new k(gVar3, o10.f18770b), pVar);
        }
        return pVar.b(this, o10);
    }

    public final int hashCode() {
        return (this.f18769a.hashCode() ^ this.f18770b.f18764b) ^ Integer.rotateLeft(this.f18771c.hashCode(), 3);
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
                return this.f18769a.j(mVar);
            }
            return mVar.d();
        }
        return mVar.b(this);
    }

    @Override // iv.d, kv.b, lv.k
    public final int k(lv.m mVar) {
        if (mVar instanceof lv.a) {
            int ordinal = ((lv.a) mVar).ordinal();
            if (ordinal != 28) {
                if (ordinal != 29) {
                    return this.f18769a.k(mVar);
                }
                return this.f18770b.f18764b;
            }
            throw new RuntimeException(da.e.n("Field too large for an int: ", mVar));
        }
        return super.k(mVar);
    }

    @Override // lv.j
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public final t c(long j10, lv.p pVar) {
        if (pVar instanceof lv.b) {
            boolean a10 = pVar.a();
            g gVar = this.f18769a;
            if (a10) {
                return u(gVar.c(j10, pVar));
            }
            return t(gVar.c(j10, pVar));
        }
        return (t) pVar.c(this, j10);
    }

    public final t s(long j10) {
        g gVar = this.f18769a;
        return u(gVar.B(gVar.f18726a.E(j10), gVar.f18727b));
    }

    public final t t(g gVar) {
        el.l.D0(gVar, "localDateTime");
        r rVar = this.f18770b;
        el.l.D0(rVar, "offset");
        q qVar = this.f18771c;
        el.l.D0(qVar, "zone");
        return n(gVar.l(rVar), gVar.f18727b.f18734d, qVar);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f18769a.toString());
        r rVar = this.f18770b;
        sb2.append(rVar.f18765c);
        String sb3 = sb2.toString();
        q qVar = this.f18771c;
        if (rVar != qVar) {
            return sb3 + '[' + qVar.toString() + ']';
        }
        return sb3;
    }

    public final t u(g gVar) {
        return q(gVar, this.f18771c, this.f18770b);
    }
}
