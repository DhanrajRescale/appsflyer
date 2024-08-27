package hv;

import com.google.android.gms.auth.api.credentials.CredentialsApi;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.Locale;
import org.threeten.bp.DateTimeException;

/* loaded from: classes2.dex */
public final class o extends kv.b implements lv.j, lv.l, Comparable, Serializable {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f18753b = 0;
    private static final long serialVersionUID = -23038383694477807L;

    /* renamed from: a, reason: collision with root package name */
    public final int f18754a;

    static {
        jv.r rVar = new jv.r();
        rVar.m(lv.a.YEAR, 4, 10, 5);
        rVar.p(Locale.getDefault());
    }

    public o(int i10) {
        this.f18754a = i10;
    }

    public static o l(lv.k kVar) {
        if (kVar instanceof o) {
            return (o) kVar;
        }
        try {
            if (!iv.f.f20561a.equals(iv.e.a(kVar))) {
                kVar = f.p(kVar);
            }
            return n(kVar.k(lv.a.YEAR));
        } catch (DateTimeException unused) {
            throw new RuntimeException("Unable to obtain Year from TemporalAccessor: " + kVar + ", type " + kVar.getClass().getName());
        }
    }

    public static boolean m(long j10) {
        if ((3 & j10) == 0 && (j10 % 100 != 0 || j10 % 400 == 0)) {
            return true;
        }
        return false;
    }

    public static o n(int i10) {
        lv.a.YEAR.h(i10);
        return new o(i10);
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new n((byte) 67, this);
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
            return lv.b.YEARS;
        }
        if (oVar != lv.n.f25451f && oVar != lv.n.f25452g && oVar != lv.n.f25449d && oVar != lv.n.f25446a && oVar != lv.n.f25450e) {
            return super.b(oVar);
        }
        return null;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f18754a - ((o) obj).f18754a;
    }

    @Override // lv.j
    public final lv.j e(f fVar) {
        return (o) fVar.h(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        if (this.f18754a == ((o) obj).f18754a) {
            return true;
        }
        return false;
    }

    @Override // lv.k
    public final long f(lv.m mVar) {
        if (mVar instanceof lv.a) {
            int ordinal = ((lv.a) mVar).ordinal();
            int i10 = this.f18754a;
            int i11 = 1;
            switch (ordinal) {
                case 25:
                    if (i10 < 1) {
                        i10 = 1 - i10;
                    }
                    return i10;
                case 26:
                    return i10;
                case 27:
                    if (i10 < 1) {
                        i11 = 0;
                    }
                    return i11;
                default:
                    throw new RuntimeException(da.e.n("Unsupported field: ", mVar));
            }
        }
        return mVar.e(this);
    }

    @Override // lv.j
    public final long g(lv.j jVar, lv.p pVar) {
        o l10 = l(jVar);
        if (pVar instanceof lv.b) {
            long j10 = l10.f18754a - this.f18754a;
            switch (((lv.b) pVar).ordinal()) {
                case 10:
                    return j10;
                case 11:
                    return j10 / 10;
                case 12:
                    return j10 / 100;
                case 13:
                    return j10 / 1000;
                case 14:
                    lv.a aVar = lv.a.ERA;
                    return l10.f(aVar) - f(aVar);
                default:
                    throw new RuntimeException("Unsupported unit: " + pVar);
            }
        }
        return pVar.b(this, l10);
    }

    @Override // lv.l
    public final lv.j h(lv.j jVar) {
        if (iv.e.a(jVar).equals(iv.f.f20561a)) {
            return jVar.d(this.f18754a, lv.a.YEAR);
        }
        throw new RuntimeException("Adjustment only supported on ISO date-time");
    }

    public final int hashCode() {
        return this.f18754a;
    }

    @Override // lv.k
    public final boolean i(lv.m mVar) {
        if (mVar instanceof lv.a) {
            if (mVar == lv.a.YEAR || mVar == lv.a.YEAR_OF_ERA || mVar == lv.a.ERA) {
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
        long j10;
        if (mVar == lv.a.YEAR_OF_ERA) {
            if (this.f18754a <= 0) {
                j10 = 1000000000;
            } else {
                j10 = 999999999;
            }
            return lv.q.d(1L, j10);
        }
        return super.j(mVar);
    }

    @Override // kv.b, lv.k
    public final int k(lv.m mVar) {
        return j(mVar).a(f(mVar), mVar);
    }

    @Override // lv.j
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public final o c(long j10, lv.p pVar) {
        if (pVar instanceof lv.b) {
            switch (((lv.b) pVar).ordinal()) {
                case 10:
                    return p(j10);
                case 11:
                    return p(el.l.G0(10, j10));
                case 12:
                    return p(el.l.G0(100, j10));
                case 13:
                    return p(el.l.G0(CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT, j10));
                case 14:
                    lv.a aVar = lv.a.ERA;
                    return d(el.l.F0(f(aVar), j10), aVar);
                default:
                    throw new RuntimeException("Unsupported unit: " + pVar);
            }
        }
        return (o) pVar.c(this, j10);
    }

    public final o p(long j10) {
        if (j10 == 0) {
            return this;
        }
        lv.a aVar = lv.a.YEAR;
        return n(aVar.f25425b.a(this.f18754a + j10, aVar));
    }

    @Override // lv.j
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public final o d(long j10, lv.m mVar) {
        if (mVar instanceof lv.a) {
            lv.a aVar = (lv.a) mVar;
            aVar.h(j10);
            int ordinal = aVar.ordinal();
            int i10 = this.f18754a;
            switch (ordinal) {
                case 25:
                    if (i10 < 1) {
                        j10 = 1 - j10;
                    }
                    return n((int) j10);
                case 26:
                    return n((int) j10);
                case 27:
                    if (f(lv.a.ERA) == j10) {
                        return this;
                    }
                    return n(1 - i10);
                default:
                    throw new RuntimeException(da.e.n("Unsupported field: ", mVar));
            }
        }
        return (o) mVar.g(this, j10);
    }

    public final String toString() {
        return Integer.toString(this.f18754a);
    }
}
