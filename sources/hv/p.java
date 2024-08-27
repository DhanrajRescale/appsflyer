package hv;

import com.google.android.gms.auth.api.credentials.CredentialsApi;
import com.google.android.gms.search.SearchAuth;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.Locale;
import org.threeten.bp.DateTimeException;

/* loaded from: classes2.dex */
public final class p extends kv.b implements lv.j, lv.l, Comparable, Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f18755c = 0;
    private static final long serialVersionUID = 4183400860270640070L;

    /* renamed from: a, reason: collision with root package name */
    public final int f18756a;

    /* renamed from: b, reason: collision with root package name */
    public final int f18757b;

    static {
        jv.r rVar = new jv.r();
        rVar.m(lv.a.YEAR, 4, 10, 5);
        rVar.c('-');
        rVar.l(lv.a.MONTH_OF_YEAR, 2);
        rVar.p(Locale.getDefault());
    }

    public p(int i10, int i11) {
        this.f18756a = i10;
        this.f18757b = i11;
    }

    public static p l(lv.k kVar) {
        if (kVar instanceof p) {
            return (p) kVar;
        }
        try {
            if (!iv.f.f20561a.equals(iv.e.a(kVar))) {
                kVar = f.p(kVar);
            }
            lv.a aVar = lv.a.YEAR;
            int k10 = kVar.k(aVar);
            lv.a aVar2 = lv.a.MONTH_OF_YEAR;
            int k11 = kVar.k(aVar2);
            aVar.h(k10);
            aVar2.h(k11);
            return new p(k10, k11);
        } catch (DateTimeException unused) {
            throw new RuntimeException("Unable to obtain YearMonth from TemporalAccessor: " + kVar + ", type " + kVar.getClass().getName());
        }
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new n((byte) 68, this);
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
            return lv.b.MONTHS;
        }
        if (oVar != lv.n.f25451f && oVar != lv.n.f25452g && oVar != lv.n.f25449d && oVar != lv.n.f25446a && oVar != lv.n.f25450e) {
            return super.b(oVar);
        }
        return null;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        p pVar = (p) obj;
        int i10 = this.f18756a - pVar.f18756a;
        if (i10 == 0) {
            return this.f18757b - pVar.f18757b;
        }
        return i10;
    }

    @Override // lv.j
    public final lv.j e(f fVar) {
        return (p) fVar.h(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        if (this.f18756a == pVar.f18756a && this.f18757b == pVar.f18757b) {
            return true;
        }
        return false;
    }

    @Override // lv.k
    public final long f(lv.m mVar) {
        if (mVar instanceof lv.a) {
            int ordinal = ((lv.a) mVar).ordinal();
            int i10 = this.f18756a;
            int i11 = 1;
            switch (ordinal) {
                case 23:
                    return this.f18757b;
                case 24:
                    return m();
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
        p l10 = l(jVar);
        if (pVar instanceof lv.b) {
            long m10 = l10.m() - m();
            switch (((lv.b) pVar).ordinal()) {
                case 9:
                    return m10;
                case 10:
                    return m10 / 12;
                case 11:
                    return m10 / 120;
                case 12:
                    return m10 / 1200;
                case 13:
                    return m10 / 12000;
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
            return jVar.d(m(), lv.a.PROLEPTIC_MONTH);
        }
        throw new RuntimeException("Adjustment only supported on ISO date-time");
    }

    public final int hashCode() {
        return (this.f18757b << 27) ^ this.f18756a;
    }

    @Override // lv.k
    public final boolean i(lv.m mVar) {
        if (mVar instanceof lv.a) {
            if (mVar == lv.a.YEAR || mVar == lv.a.MONTH_OF_YEAR || mVar == lv.a.PROLEPTIC_MONTH || mVar == lv.a.YEAR_OF_ERA || mVar == lv.a.ERA) {
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
            if (this.f18756a <= 0) {
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

    public final long m() {
        return (this.f18756a * 12) + (this.f18757b - 1);
    }

    @Override // lv.j
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public final p c(long j10, lv.p pVar) {
        if (pVar instanceof lv.b) {
            switch (((lv.b) pVar).ordinal()) {
                case 9:
                    return o(j10);
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
        return (p) pVar.c(this, j10);
    }

    public final p o(long j10) {
        if (j10 == 0) {
            return this;
        }
        long j11 = (this.f18756a * 12) + (this.f18757b - 1) + j10;
        lv.a aVar = lv.a.YEAR;
        return q(aVar.f25425b.a(el.l.W(j11, 12L), aVar), el.l.Y(12, j11) + 1);
    }

    public final p p(long j10) {
        if (j10 == 0) {
            return this;
        }
        lv.a aVar = lv.a.YEAR;
        return q(aVar.f25425b.a(this.f18756a + j10, aVar), this.f18757b);
    }

    public final p q(int i10, int i11) {
        if (this.f18756a == i10 && this.f18757b == i11) {
            return this;
        }
        return new p(i10, i11);
    }

    @Override // lv.j
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public final p d(long j10, lv.m mVar) {
        if (mVar instanceof lv.a) {
            lv.a aVar = (lv.a) mVar;
            aVar.h(j10);
            int ordinal = aVar.ordinal();
            int i10 = this.f18757b;
            int i11 = this.f18756a;
            switch (ordinal) {
                case 23:
                    int i12 = (int) j10;
                    lv.a.MONTH_OF_YEAR.h(i12);
                    return q(i11, i12);
                case 24:
                    return o(j10 - f(lv.a.PROLEPTIC_MONTH));
                case 25:
                    if (i11 < 1) {
                        j10 = 1 - j10;
                    }
                    int i13 = (int) j10;
                    lv.a.YEAR.h(i13);
                    return q(i13, i10);
                case 26:
                    int i14 = (int) j10;
                    lv.a.YEAR.h(i14);
                    return q(i14, i10);
                case 27:
                    if (f(lv.a.ERA) == j10) {
                        return this;
                    }
                    int i15 = 1 - i11;
                    lv.a.YEAR.h(i15);
                    return q(i15, i10);
                default:
                    throw new RuntimeException(da.e.n("Unsupported field: ", mVar));
            }
        }
        return (p) mVar.g(this, j10);
    }

    public final String toString() {
        String str;
        int i10 = this.f18756a;
        int abs = Math.abs(i10);
        StringBuilder sb2 = new StringBuilder(9);
        if (abs < 1000) {
            if (i10 < 0) {
                sb2.append(i10 - 10000);
                sb2.deleteCharAt(1);
            } else {
                sb2.append(i10 + SearchAuth.StatusCodes.AUTH_DISABLED);
                sb2.deleteCharAt(0);
            }
        } else {
            sb2.append(i10);
        }
        int i11 = this.f18757b;
        if (i11 < 10) {
            str = "-0";
        } else {
            str = "-";
        }
        sb2.append(str);
        sb2.append(i11);
        return sb2.toString();
    }
}
