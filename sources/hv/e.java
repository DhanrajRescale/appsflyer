package hv;

import com.google.android.gms.auth.api.credentials.CredentialsApi;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.Serializable;
import okhttp3.internal.http2.Http2Connection;
import org.threeten.bp.DateTimeException;

/* loaded from: classes2.dex */
public final class e extends kv.b implements lv.j, lv.l, Comparable, Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final e f18716c = new e(0, 0);
    private static final long serialVersionUID = -665713676816604388L;

    /* renamed from: a, reason: collision with root package name */
    public final long f18717a;

    /* renamed from: b, reason: collision with root package name */
    public final int f18718b;

    static {
        o(-31557014167219200L, 0L);
        o(31556889864403199L, 999999999L);
    }

    public e(int i10, long j10) {
        this.f18717a = j10;
        this.f18718b = i10;
    }

    public static e l(int i10, long j10) {
        if ((i10 | j10) == 0) {
            return f18716c;
        }
        if (j10 >= -31557014167219200L && j10 <= 31556889864403199L) {
            return new e(i10, j10);
        }
        throw new RuntimeException("Instant exceeds minimum or maximum instant");
    }

    public static e m(lv.k kVar) {
        try {
            return o(kVar.f(lv.a.INSTANT_SECONDS), kVar.k(lv.a.NANO_OF_SECOND));
        } catch (DateTimeException e10) {
            throw new RuntimeException("Unable to obtain Instant from TemporalAccessor: " + kVar + ", type " + kVar.getClass().getName(), e10);
        }
    }

    public static e n(long j10) {
        return l(el.l.Y(CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT, j10) * 1000000, el.l.W(j10, 1000L));
    }

    public static e o(long j10, long j11) {
        return l(el.l.Y(Http2Connection.DEGRADED_PONG_TIMEOUT_NS, j11), el.l.F0(j10, el.l.W(j11, 1000000000L)));
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new n((byte) 2, this);
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
        if (oVar != lv.n.f25451f && oVar != lv.n.f25452g && oVar != lv.n.f25447b && oVar != lv.n.f25446a && oVar != lv.n.f25449d && oVar != lv.n.f25450e) {
            return oVar.h(this);
        }
        return null;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        e eVar = (e) obj;
        int C = el.l.C(this.f18717a, eVar.f18717a);
        if (C == 0) {
            return this.f18718b - eVar.f18718b;
        }
        return C;
    }

    @Override // lv.j
    public final lv.j d(long j10, lv.m mVar) {
        if (mVar instanceof lv.a) {
            lv.a aVar = (lv.a) mVar;
            aVar.h(j10);
            int ordinal = aVar.ordinal();
            int i10 = this.f18718b;
            long j11 = this.f18717a;
            if (ordinal != 0) {
                if (ordinal != 2) {
                    if (ordinal != 4) {
                        if (ordinal == 28) {
                            if (j10 != j11) {
                                return l(i10, j10);
                            }
                        } else {
                            throw new RuntimeException(da.e.n("Unsupported field: ", mVar));
                        }
                    } else {
                        int i11 = ((int) j10) * 1000000;
                        if (i11 != i10) {
                            return l(i11, j11);
                        }
                    }
                } else {
                    int i12 = ((int) j10) * CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT;
                    if (i12 != i10) {
                        return l(i12, j11);
                    }
                }
            } else if (j10 != i10) {
                return l((int) j10, j11);
            }
            return this;
        }
        return (e) mVar.g(this, j10);
    }

    @Override // lv.j
    public final lv.j e(f fVar) {
        return (e) fVar.h(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f18717a == eVar.f18717a && this.f18718b == eVar.f18718b) {
            return true;
        }
        return false;
    }

    @Override // lv.k
    public final long f(lv.m mVar) {
        int i10;
        if (mVar instanceof lv.a) {
            int ordinal = ((lv.a) mVar).ordinal();
            int i11 = this.f18718b;
            if (ordinal != 0) {
                if (ordinal != 2) {
                    if (ordinal != 4) {
                        if (ordinal == 28) {
                            return this.f18717a;
                        }
                        throw new RuntimeException(da.e.n("Unsupported field: ", mVar));
                    }
                    i10 = i11 / 1000000;
                } else {
                    i10 = i11 / CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT;
                }
                return i10;
            }
            return i11;
        }
        return mVar.e(this);
    }

    @Override // lv.j
    public final long g(lv.j jVar, lv.p pVar) {
        e m10 = m(jVar);
        if (pVar instanceof lv.b) {
            int ordinal = ((lv.b) pVar).ordinal();
            int i10 = this.f18718b;
            long j10 = this.f18717a;
            switch (ordinal) {
                case 0:
                    return el.l.F0(el.l.G0(Http2Connection.DEGRADED_PONG_TIMEOUT_NS, el.l.I0(m10.f18717a, j10)), m10.f18718b - i10);
                case 1:
                    return el.l.F0(el.l.G0(Http2Connection.DEGRADED_PONG_TIMEOUT_NS, el.l.I0(m10.f18717a, j10)), m10.f18718b - i10) / 1000;
                case 2:
                    return el.l.I0(m10.s(), s());
                case 3:
                    return r(m10);
                case 4:
                    return r(m10) / 60;
                case 5:
                    return r(m10) / 3600;
                case 6:
                    return r(m10) / 43200;
                case 7:
                    return r(m10) / 86400;
                default:
                    throw new RuntimeException("Unsupported unit: " + pVar);
            }
        }
        return pVar.b(this, m10);
    }

    @Override // lv.l
    public final lv.j h(lv.j jVar) {
        return jVar.d(this.f18717a, lv.a.INSTANT_SECONDS).d(this.f18718b, lv.a.NANO_OF_SECOND);
    }

    public final int hashCode() {
        long j10 = this.f18717a;
        return (this.f18718b * 51) + ((int) (j10 ^ (j10 >>> 32)));
    }

    @Override // lv.k
    public final boolean i(lv.m mVar) {
        if (mVar instanceof lv.a) {
            if (mVar == lv.a.INSTANT_SECONDS || mVar == lv.a.NANO_OF_SECOND || mVar == lv.a.MICRO_OF_SECOND || mVar == lv.a.MILLI_OF_SECOND) {
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
        return super.j(mVar);
    }

    @Override // kv.b, lv.k
    public final int k(lv.m mVar) {
        if (mVar instanceof lv.a) {
            int ordinal = ((lv.a) mVar).ordinal();
            int i10 = this.f18718b;
            if (ordinal != 0) {
                if (ordinal != 2) {
                    if (ordinal == 4) {
                        return i10 / 1000000;
                    }
                    throw new RuntimeException(da.e.n("Unsupported field: ", mVar));
                }
                return i10 / CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT;
            }
            return i10;
        }
        return super.j(mVar).a(mVar.e(this), mVar);
    }

    public final e p(long j10, long j11) {
        if ((j10 | j11) == 0) {
            return this;
        }
        return o(el.l.F0(el.l.F0(this.f18717a, j10), j11 / 1000000000), this.f18718b + (j11 % 1000000000));
    }

    @Override // lv.j
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public final e c(long j10, lv.p pVar) {
        if (pVar instanceof lv.b) {
            switch ((lv.b) pVar) {
                case NANOS:
                    return p(0L, j10);
                case MICROS:
                    return p(j10 / 1000000, (j10 % 1000000) * 1000);
                case MILLIS:
                    return p(j10 / 1000, (j10 % 1000) * 1000000);
                case SECONDS:
                    return p(j10, 0L);
                case MINUTES:
                    return p(el.l.G0(60, j10), 0L);
                case HOURS:
                    return p(el.l.G0(3600, j10), 0L);
                case HALF_DAYS:
                    return p(el.l.G0(43200, j10), 0L);
                case DAYS:
                    return p(el.l.G0(86400, j10), 0L);
                default:
                    throw new RuntimeException("Unsupported unit: " + pVar);
            }
        }
        return (e) pVar.c(this, j10);
    }

    public final long r(e eVar) {
        long I0 = el.l.I0(eVar.f18717a, this.f18717a);
        long j10 = eVar.f18718b - this.f18718b;
        if (I0 > 0 && j10 < 0) {
            return I0 - 1;
        }
        if (I0 < 0 && j10 > 0) {
            return I0 + 1;
        }
        return I0;
    }

    public final long s() {
        long j10 = this.f18717a;
        int i10 = this.f18718b;
        if (j10 >= 0) {
            return el.l.F0(el.l.H0(j10, 1000L), i10 / 1000000);
        }
        return el.l.I0(el.l.H0(j10 + 1, 1000L), 1000 - (i10 / 1000000));
    }

    public final String toString() {
        return jv.a.f21670h.a(this);
    }
}
