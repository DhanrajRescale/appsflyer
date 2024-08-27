package hv;

import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.Serializable;
import org.threeten.bp.DateTimeException;

/* loaded from: classes2.dex */
public final class g extends iv.b implements Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final g f18724c = t(f.f18719d, h.f18728e);

    /* renamed from: d, reason: collision with root package name */
    public static final g f18725d = t(f.f18720e, h.f18729f);
    private static final long serialVersionUID = 6207766400415563566L;

    /* renamed from: a, reason: collision with root package name */
    public final f f18726a;

    /* renamed from: b, reason: collision with root package name */
    public final h f18727b;

    public g(f fVar, h hVar) {
        this.f18726a = fVar;
        this.f18727b = hVar;
    }

    public static g p(lv.k kVar) {
        if (kVar instanceof g) {
            return (g) kVar;
        }
        if (kVar instanceof t) {
            return ((t) kVar).f18769a;
        }
        try {
            return new g(f.p(kVar), h.n(kVar));
        } catch (DateTimeException unused) {
            throw new RuntimeException("Unable to obtain LocalDateTime from TemporalAccessor: " + kVar + ", type " + kVar.getClass().getName());
        }
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public static g s() {
        a aVar = new a(q.p());
        e n10 = e.n(System.currentTimeMillis());
        return u(n10.f18717a, n10.f18718b, aVar.f18706a.n().a(n10));
    }

    public static g t(f fVar, h hVar) {
        el.l.D0(fVar, "date");
        el.l.D0(hVar, "time");
        return new g(fVar, hVar);
    }

    public static g u(long j10, int i10, r rVar) {
        el.l.D0(rVar, "offset");
        long j11 = j10 + rVar.f18764b;
        long W = el.l.W(j11, 86400L);
        int Y = el.l.Y(86400, j11);
        f B = f.B(W);
        long j12 = Y;
        h hVar = h.f18728e;
        lv.a.SECOND_OF_DAY.h(j12);
        lv.a.NANO_OF_SECOND.h(i10);
        int i11 = (int) (j12 / 3600);
        long j13 = j12 - (i11 * 3600);
        return new g(B, h.m(i11, (int) (j13 / 60), (int) (j13 - (r7 * 60)), i10));
    }

    public static g v(e eVar, q qVar) {
        el.l.D0(eVar, "instant");
        el.l.D0(qVar, "zone");
        return u(eVar.f18717a, eVar.f18718b, qVar.n().a(eVar));
    }

    private Object writeReplace() {
        return new n((byte) 4, this);
    }

    @Override // lv.j
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public final g d(long j10, lv.m mVar) {
        if (mVar instanceof lv.a) {
            boolean f10 = mVar.f();
            h hVar = this.f18727b;
            f fVar = this.f18726a;
            if (f10) {
                return B(fVar, hVar.d(j10, mVar));
            }
            return B(fVar.d(j10, mVar), hVar);
        }
        return (g) mVar.g(this, j10);
    }

    public final g B(f fVar, h hVar) {
        if (this.f18726a == fVar && this.f18727b == hVar) {
            return this;
        }
        return new g(fVar, hVar);
    }

    @Override // lv.j
    public final lv.j a(long j10, lv.b bVar) {
        if (j10 == Long.MIN_VALUE) {
            return c(Long.MAX_VALUE, bVar).c(1L, bVar);
        }
        return c(-j10, bVar);
    }

    @Override // iv.b, kv.b, lv.k
    public final Object b(lv.o oVar) {
        if (oVar == lv.n.f25451f) {
            return this.f18726a;
        }
        return super.b(oVar);
    }

    @Override // lv.j
    public final lv.j e(f fVar) {
        return B(fVar, this.f18727b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (this.f18726a.equals(gVar.f18726a) && this.f18727b.equals(gVar.f18727b)) {
            return true;
        }
        return false;
    }

    @Override // lv.k
    public final long f(lv.m mVar) {
        if (mVar instanceof lv.a) {
            if (mVar.f()) {
                return this.f18727b.f(mVar);
            }
            return this.f18726a.f(mVar);
        }
        return mVar.e(this);
    }

    @Override // lv.j
    public final long g(lv.j jVar, lv.p pVar) {
        g p10 = p(jVar);
        if (pVar instanceof lv.b) {
            lv.b bVar = (lv.b) pVar;
            int compareTo = bVar.compareTo(lv.b.DAYS);
            h hVar = this.f18727b;
            f fVar = this.f18726a;
            if (compareTo < 0) {
                f fVar2 = p10.f18726a;
                fVar.getClass();
                long l10 = fVar2.l() - fVar.l();
                long w10 = p10.f18727b.w() - hVar.w();
                if (l10 > 0 && w10 < 0) {
                    l10--;
                    w10 += 86400000000000L;
                } else if (l10 < 0 && w10 > 0) {
                    l10++;
                    w10 -= 86400000000000L;
                }
                switch (bVar) {
                    case NANOS:
                        return el.l.F0(el.l.H0(l10, 86400000000000L), w10);
                    case MICROS:
                        return el.l.F0(el.l.H0(l10, 86400000000L), w10 / 1000);
                    case MILLIS:
                        return el.l.F0(el.l.H0(l10, 86400000L), w10 / 1000000);
                    case SECONDS:
                        return el.l.F0(el.l.G0(86400, l10), w10 / 1000000000);
                    case MINUTES:
                        return el.l.F0(el.l.G0(1440, l10), w10 / 60000000000L);
                    case HOURS:
                        return el.l.F0(el.l.G0(24, l10), w10 / 3600000000000L);
                    case HALF_DAYS:
                        return el.l.F0(el.l.G0(2, l10), w10 / 43200000000000L);
                    default:
                        throw new RuntimeException("Unsupported unit: " + pVar);
                }
            }
            f fVar3 = p10.f18726a;
            boolean t10 = fVar3.t(fVar);
            h hVar2 = p10.f18727b;
            if (t10 && hVar2.compareTo(hVar) < 0) {
                fVar3 = fVar3.y(1L);
            } else if (fVar3.u(fVar) && hVar2.compareTo(hVar) > 0) {
                fVar3 = fVar3.D(1L);
            }
            return fVar.g(fVar3, pVar);
        }
        return pVar.b(this, p10);
    }

    @Override // lv.l
    public final lv.j h(lv.j jVar) {
        return jVar.d(this.f18726a.l(), lv.a.EPOCH_DAY).d(this.f18727b.w(), lv.a.NANO_OF_DAY);
    }

    public final int hashCode() {
        return this.f18726a.hashCode() ^ this.f18727b.hashCode();
    }

    @Override // lv.k
    public final boolean i(lv.m mVar) {
        if (mVar instanceof lv.a) {
            if (mVar.a() || mVar.f()) {
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
            if (mVar.f()) {
                return this.f18727b.j(mVar);
            }
            return this.f18726a.j(mVar);
        }
        return mVar.b(this);
    }

    @Override // kv.b, lv.k
    public final int k(lv.m mVar) {
        if (mVar instanceof lv.a) {
            if (mVar.f()) {
                return this.f18727b.k(mVar);
            }
            return this.f18726a.k(mVar);
        }
        return super.k(mVar);
    }

    @Override // java.lang.Comparable
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public final int compareTo(iv.b bVar) {
        if (bVar instanceof g) {
            return n((g) bVar);
        }
        g gVar = (g) bVar;
        f fVar = gVar.f18726a;
        f fVar2 = this.f18726a;
        int compareTo = fVar2.compareTo(fVar);
        if (compareTo == 0) {
            int compareTo2 = this.f18727b.compareTo(gVar.f18727b);
            if (compareTo2 == 0) {
                fVar2.getClass();
                iv.f fVar3 = iv.f.f20561a;
                bVar.getClass();
                ((g) bVar).f18726a.getClass();
                fVar3.getClass();
                fVar3.getClass();
                return 0;
            }
            return compareTo2;
        }
        return compareTo;
    }

    public final int n(g gVar) {
        int n10 = this.f18726a.n(gVar.f18726a);
        if (n10 == 0) {
            return this.f18727b.compareTo(gVar.f18727b);
        }
        return n10;
    }

    public final String o(jv.a aVar) {
        return aVar.a(this);
    }

    public final boolean q(g gVar) {
        if (gVar instanceof g) {
            if (n(gVar) <= 0) {
                return false;
            }
            return true;
        }
        long l10 = this.f18726a.l();
        long l11 = gVar.f18726a.l();
        if (l10 <= l11 && (l10 != l11 || this.f18727b.w() <= gVar.f18727b.w())) {
            return false;
        }
        return true;
    }

    public final boolean r(g gVar) {
        if (gVar instanceof g) {
            if (n(gVar) >= 0) {
                return false;
            }
            return true;
        }
        long l10 = this.f18726a.l();
        long l11 = gVar.f18726a.l();
        if (l10 >= l11 && (l10 != l11 || this.f18727b.w() >= gVar.f18727b.w())) {
            return false;
        }
        return true;
    }

    public final String toString() {
        return this.f18726a.toString() + 'T' + this.f18727b.toString();
    }

    @Override // lv.j
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public final g c(long j10, lv.p pVar) {
        if (pVar instanceof lv.b) {
            switch ((lv.b) pVar) {
                case NANOS:
                    return z(this.f18726a, 0L, 0L, 0L, j10);
                case MICROS:
                    g x10 = x(j10 / 86400000000L);
                    return x10.z(x10.f18726a, 0L, 0L, 0L, (j10 % 86400000000L) * 1000);
                case MILLIS:
                    g x11 = x(j10 / 86400000);
                    return x11.z(x11.f18726a, 0L, 0L, 0L, (j10 % 86400000) * 1000000);
                case SECONDS:
                    return y(j10);
                case MINUTES:
                    return z(this.f18726a, 0L, j10, 0L, 0L);
                case HOURS:
                    return z(this.f18726a, j10, 0L, 0L, 0L);
                case HALF_DAYS:
                    g x12 = x(j10 / 256);
                    return x12.z(x12.f18726a, (j10 % 256) * 12, 0L, 0L, 0L);
                default:
                    return B(this.f18726a.c(j10, pVar), this.f18727b);
            }
        }
        return (g) pVar.c(this, j10);
    }

    public final g x(long j10) {
        return B(this.f18726a.D(j10), this.f18727b);
    }

    public final g y(long j10) {
        return z(this.f18726a, 0L, 0L, j10, 0L);
    }

    public final g z(f fVar, long j10, long j11, long j12, long j13) {
        long j14 = j10 | j11 | j12 | j13;
        h hVar = this.f18727b;
        if (j14 == 0) {
            return B(fVar, hVar);
        }
        long j15 = j10 / 24;
        long j16 = j15 + (j11 / 1440) + (j12 / 86400) + (j13 / 86400000000000L);
        long j17 = 1;
        long j18 = ((j10 % 24) * 3600000000000L) + ((j11 % 1440) * 60000000000L) + ((j12 % 86400) * 1000000000) + (j13 % 86400000000000L);
        long w10 = hVar.w();
        long j19 = (j18 * j17) + w10;
        long W = el.l.W(j19, 86400000000000L) + (j16 * j17);
        long j20 = ((j19 % 86400000000000L) + 86400000000000L) % 86400000000000L;
        if (j20 != w10) {
            hVar = h.p(j20);
        }
        return B(fVar.D(W), hVar);
    }
}
