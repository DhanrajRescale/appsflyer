package hv;

import com.google.android.gms.auth.api.credentials.CredentialsApi;
import com.google.android.gms.search.SearchAuth;
import java.io.DataInput;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class f extends iv.a implements Serializable {

    /* renamed from: d, reason: collision with root package name */
    public static final f f18719d = A(-999999999, 1, 1);

    /* renamed from: e, reason: collision with root package name */
    public static final f f18720e = A(999999999, 12, 31);
    private static final long serialVersionUID = 2942565459149668126L;

    /* renamed from: a, reason: collision with root package name */
    public final int f18721a;

    /* renamed from: b, reason: collision with root package name */
    public final short f18722b;

    /* renamed from: c, reason: collision with root package name */
    public final short f18723c;

    public f(int i10, int i11, int i12) {
        this.f18721a = i10;
        this.f18722b = (short) i11;
        this.f18723c = (short) i12;
    }

    public static f A(int i10, int i11, int i12) {
        lv.a.YEAR.h(i10);
        lv.a.MONTH_OF_YEAR.h(i11);
        lv.a.DAY_OF_MONTH.h(i12);
        return o(i10, i.p(i11), i12);
    }

    public static f B(long j10) {
        long j11;
        lv.a.EPOCH_DAY.h(j10);
        long j12 = 719468 + j10;
        if (j12 < 0) {
            long j13 = ((j10 + 719469) / 146097) - 1;
            j11 = j13 * 400;
            j12 += (-j13) * 146097;
        } else {
            j11 = 0;
        }
        long j14 = ((j12 * 400) + 591) / 146097;
        long j15 = j12 - ((j14 / 400) + (((j14 / 4) + (j14 * 365)) - (j14 / 100)));
        if (j15 < 0) {
            j14--;
            j15 = j12 - ((j14 / 400) + (((j14 / 4) + (365 * j14)) - (j14 / 100)));
        }
        int i10 = (int) j15;
        int i11 = ((i10 * 5) + 2) / 153;
        int i12 = ((i11 + 2) % 12) + 1;
        int i13 = (i10 - (((i11 * 306) + 5) / 10)) + 1;
        long j16 = j14 + j11 + (i11 / 10);
        lv.a aVar = lv.a.YEAR;
        return new f(aVar.f25425b.a(j16, aVar), i12, i13);
    }

    public static f G(DataInput dataInput) {
        return A(dataInput.readInt(), dataInput.readByte(), dataInput.readByte());
    }

    public static f H(int i10, int i11, int i12) {
        int i13;
        if (i11 != 2) {
            if (i11 == 4 || i11 == 6 || i11 == 9 || i11 == 11) {
                i12 = Math.min(i12, 30);
            }
        } else {
            iv.f.f20561a.getClass();
            if (iv.f.b(i10)) {
                i13 = 29;
            } else {
                i13 = 28;
            }
            i12 = Math.min(i12, i13);
        }
        return A(i10, i11, i12);
    }

    public static f o(int i10, i iVar, int i11) {
        if (i11 > 28) {
            iv.f.f20561a.getClass();
            if (i11 > iVar.n(iv.f.b(i10))) {
                if (i11 == 29) {
                    throw new RuntimeException(jr.h.o("Invalid date 'February 29' as '", i10, "' is not a leap year"));
                }
                throw new RuntimeException("Invalid date '" + iVar.name() + " " + i11 + "'");
            }
        }
        return new f(i10, iVar.m(), i11);
    }

    public static f p(lv.k kVar) {
        f fVar = (f) kVar.b(lv.n.f25451f);
        if (fVar != null) {
            return fVar;
        }
        throw new RuntimeException("Unable to obtain LocalDate from TemporalAccessor: " + kVar + ", type " + kVar.getClass().getName());
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new n((byte) 3, this);
    }

    @Override // lv.j
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public final f c(long j10, lv.p pVar) {
        if (pVar instanceof lv.b) {
            switch (((lv.b) pVar).ordinal()) {
                case 7:
                    return D(j10);
                case 8:
                    return D(el.l.G0(7, j10));
                case 9:
                    return E(j10);
                case 10:
                    return F(j10);
                case 11:
                    return F(el.l.G0(10, j10));
                case 12:
                    return F(el.l.G0(100, j10));
                case 13:
                    return F(el.l.G0(CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT, j10));
                case 14:
                    lv.a aVar = lv.a.ERA;
                    return d(el.l.F0(f(aVar), j10), aVar);
                default:
                    throw new RuntimeException("Unsupported unit: " + pVar);
            }
        }
        return (f) pVar.c(this, j10);
    }

    public final f D(long j10) {
        if (j10 == 0) {
            return this;
        }
        return B(el.l.F0(l(), j10));
    }

    public final f E(long j10) {
        if (j10 == 0) {
            return this;
        }
        long j11 = (this.f18721a * 12) + (this.f18722b - 1) + j10;
        lv.a aVar = lv.a.YEAR;
        return H(aVar.f25425b.a(el.l.W(j11, 12L), aVar), el.l.Y(12, j11) + 1, this.f18723c);
    }

    public final f F(long j10) {
        if (j10 == 0) {
            return this;
        }
        lv.a aVar = lv.a.YEAR;
        return H(aVar.f25425b.a(this.f18721a + j10, aVar), this.f18722b, this.f18723c);
    }

    @Override // lv.j
    /* renamed from: I, reason: merged with bridge method [inline-methods] */
    public final f d(long j10, lv.m mVar) {
        if (mVar instanceof lv.a) {
            lv.a aVar = (lv.a) mVar;
            aVar.h(j10);
            int ordinal = aVar.ordinal();
            short s7 = this.f18723c;
            short s10 = this.f18722b;
            int i10 = this.f18721a;
            switch (ordinal) {
                case 15:
                    return D(j10 - r().l());
                case 16:
                    return D(j10 - f(lv.a.ALIGNED_DAY_OF_WEEK_IN_MONTH));
                case 17:
                    return D(j10 - f(lv.a.ALIGNED_DAY_OF_WEEK_IN_YEAR));
                case 18:
                    int i11 = (int) j10;
                    if (s7 == i11) {
                        return this;
                    }
                    return A(i10, s10, i11);
                case 19:
                    return K((int) j10);
                case 20:
                    return B(j10);
                case 21:
                    return D(el.l.G0(7, j10 - f(lv.a.ALIGNED_WEEK_OF_MONTH)));
                case 22:
                    return D(el.l.G0(7, j10 - f(lv.a.ALIGNED_WEEK_OF_YEAR)));
                case 23:
                    int i12 = (int) j10;
                    if (s10 == i12) {
                        return this;
                    }
                    lv.a.MONTH_OF_YEAR.h(i12);
                    return H(i10, i12, s7);
                case 24:
                    return E(j10 - f(lv.a.PROLEPTIC_MONTH));
                case 25:
                    if (i10 < 1) {
                        j10 = 1 - j10;
                    }
                    return L((int) j10);
                case 26:
                    return L((int) j10);
                case 27:
                    if (f(lv.a.ERA) == j10) {
                        return this;
                    }
                    return L(1 - i10);
                default:
                    throw new RuntimeException(da.e.n("Unsupported field: ", mVar));
            }
        }
        return (f) mVar.g(this, j10);
    }

    @Override // lv.j
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public final f e(lv.l lVar) {
        if (lVar instanceof f) {
            return (f) lVar;
        }
        return (f) lVar.h(this);
    }

    public final f K(int i10) {
        if (s() == i10) {
            return this;
        }
        lv.a aVar = lv.a.YEAR;
        int i11 = this.f18721a;
        long j10 = i11;
        aVar.h(j10);
        lv.a.DAY_OF_YEAR.h(i10);
        iv.f.f20561a.getClass();
        boolean b10 = iv.f.b(j10);
        if (i10 == 366 && !b10) {
            throw new RuntimeException(jr.h.o("Invalid date 'DayOfYear 366' as '", i11, "' is not a leap year"));
        }
        i p10 = i.p(((i10 - 1) / 31) + 1);
        if (i10 > (p10.n(b10) + p10.l(b10)) - 1) {
            p10 = i.f18736b[((((int) 1) + 12) + p10.ordinal()) % 12];
        }
        return o(i11, p10, (i10 - p10.l(b10)) + 1);
    }

    public final f L(int i10) {
        if (this.f18721a == i10) {
            return this;
        }
        lv.a.YEAR.h(i10);
        return H(i10, this.f18722b, this.f18723c);
    }

    @Override // iv.a, kv.b, lv.k
    public final Object b(lv.o oVar) {
        if (oVar == lv.n.f25451f) {
            return this;
        }
        return super.b(oVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof f) && n((f) obj) == 0) {
            return true;
        }
        return false;
    }

    @Override // lv.k
    public final long f(lv.m mVar) {
        if (mVar instanceof lv.a) {
            if (mVar == lv.a.EPOCH_DAY) {
                return l();
            }
            if (mVar == lv.a.PROLEPTIC_MONTH) {
                return (this.f18721a * 12) + (this.f18722b - 1);
            }
            return q(mVar);
        }
        return mVar.e(this);
    }

    @Override // lv.j
    public final long g(lv.j jVar, lv.p pVar) {
        f p10 = p(jVar);
        if (pVar instanceof lv.b) {
            switch (((lv.b) pVar).ordinal()) {
                case 7:
                    return p10.l() - l();
                case 8:
                    return (p10.l() - l()) / 7;
                case 9:
                    return z(p10);
                case 10:
                    return z(p10) / 12;
                case 11:
                    return z(p10) / 120;
                case 12:
                    return z(p10) / 1200;
                case 13:
                    return z(p10) / 12000;
                case 14:
                    lv.a aVar = lv.a.ERA;
                    return p10.f(aVar) - f(aVar);
                default:
                    throw new RuntimeException("Unsupported unit: " + pVar);
            }
        }
        return pVar.b(this, p10);
    }

    @Override // lv.l
    public final lv.j h(lv.j jVar) {
        return jVar.d(l(), lv.a.EPOCH_DAY);
    }

    public final int hashCode() {
        int i10 = this.f18721a;
        return (((i10 << 11) + (this.f18722b << 6)) + this.f18723c) ^ (i10 & (-2048));
    }

    @Override // iv.a, lv.k
    public final boolean i(lv.m mVar) {
        if (mVar instanceof lv.a) {
            return mVar.a();
        }
        if (mVar != null && mVar.c(this)) {
            return true;
        }
        return false;
    }

    @Override // kv.b, lv.k
    public final lv.q j(lv.m mVar) {
        int i10;
        int i11;
        long j10;
        long j11;
        if (mVar instanceof lv.a) {
            lv.a aVar = (lv.a) mVar;
            if (aVar.a()) {
                int ordinal = aVar.ordinal();
                short s7 = this.f18722b;
                if (ordinal != 18) {
                    if (ordinal != 19) {
                        if (ordinal != 21) {
                            if (ordinal != 25) {
                                return mVar.d();
                            }
                            if (this.f18721a <= 0) {
                                j11 = 1000000000;
                            } else {
                                j11 = 999999999;
                            }
                            return lv.q.d(1L, j11);
                        }
                        if (i.p(s7) == i.f18735a && !w()) {
                            j10 = 4;
                        } else {
                            j10 = 5;
                        }
                        return lv.q.d(1L, j10);
                    }
                    if (w()) {
                        i11 = 366;
                    } else {
                        i11 = 365;
                    }
                    return lv.q.d(1L, i11);
                }
                if (s7 != 2) {
                    if (s7 != 4 && s7 != 6 && s7 != 9 && s7 != 11) {
                        i10 = 31;
                    } else {
                        i10 = 30;
                    }
                } else if (w()) {
                    i10 = 29;
                } else {
                    i10 = 28;
                }
                return lv.q.d(1L, i10);
            }
            throw new RuntimeException(da.e.n("Unsupported field: ", mVar));
        }
        return mVar.b(this);
    }

    @Override // kv.b, lv.k
    public final int k(lv.m mVar) {
        if (mVar instanceof lv.a) {
            return q(mVar);
        }
        return super.k(mVar);
    }

    @Override // iv.a
    public final long l() {
        long j10;
        long j11 = this.f18721a;
        long j12 = this.f18722b;
        long j13 = 365 * j11;
        if (j11 >= 0) {
            j10 = ((j11 + 399) / 400) + (((3 + j11) / 4) - ((99 + j11) / 100)) + j13;
        } else {
            j10 = j13 - ((j11 / (-400)) + ((j11 / (-4)) - (j11 / (-100))));
        }
        long j14 = (((367 * j12) - 362) / 12) + j10 + (this.f18723c - 1);
        if (j12 > 2) {
            long j15 = j14 - 1;
            if (!w()) {
                j14 -= 2;
            } else {
                j14 = j15;
            }
        }
        return j14 - 719528;
    }

    @Override // java.lang.Comparable
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public final int compareTo(iv.a aVar) {
        if (aVar instanceof f) {
            return n((f) aVar);
        }
        int C = el.l.C(l(), aVar.l());
        if (C == 0) {
            iv.f.f20561a.getClass();
            return 0;
        }
        return C;
    }

    public final int n(f fVar) {
        int i10 = this.f18721a - fVar.f18721a;
        if (i10 == 0) {
            int i11 = this.f18722b - fVar.f18722b;
            if (i11 == 0) {
                return this.f18723c - fVar.f18723c;
            }
            return i11;
        }
        return i10;
    }

    public final int q(lv.m mVar) {
        int i10;
        int ordinal = ((lv.a) mVar).ordinal();
        short s7 = this.f18723c;
        int i11 = this.f18721a;
        switch (ordinal) {
            case 15:
                return r().l();
            case 16:
                i10 = (s7 - 1) % 7;
                break;
            case 17:
                return ((s() - 1) % 7) + 1;
            case 18:
                return s7;
            case 19:
                return s();
            case 20:
                throw new RuntimeException(da.e.n("Field too large for an int: ", mVar));
            case 21:
                i10 = (s7 - 1) / 7;
                break;
            case 22:
                return ((s() - 1) / 7) + 1;
            case 23:
                return this.f18722b;
            case 24:
                throw new RuntimeException(da.e.n("Field too large for an int: ", mVar));
            case 25:
                if (i11 < 1) {
                    return 1 - i11;
                }
                return i11;
            case 26:
                return i11;
            case 27:
                if (i11 >= 1) {
                    return 1;
                }
                return 0;
            default:
                throw new RuntimeException(da.e.n("Unsupported field: ", mVar));
        }
        return i10 + 1;
    }

    public final c r() {
        return c.m(el.l.Y(7, l() + 3) + 1);
    }

    public final int s() {
        return (i.p(this.f18722b).l(w()) + this.f18723c) - 1;
    }

    public final boolean t(f fVar) {
        if (fVar instanceof f) {
            if (n(fVar) <= 0) {
                return false;
            }
            return true;
        }
        if (l() <= fVar.l()) {
            return false;
        }
        return true;
    }

    public final String toString() {
        String str;
        int i10 = this.f18721a;
        int abs = Math.abs(i10);
        StringBuilder sb2 = new StringBuilder(10);
        if (abs < 1000) {
            if (i10 < 0) {
                sb2.append(i10 - 10000);
                sb2.deleteCharAt(1);
            } else {
                sb2.append(i10 + SearchAuth.StatusCodes.AUTH_DISABLED);
                sb2.deleteCharAt(0);
            }
        } else {
            if (i10 > 9999) {
                sb2.append('+');
            }
            sb2.append(i10);
        }
        String str2 = "-";
        short s7 = this.f18722b;
        if (s7 >= 10) {
            str = "-";
        } else {
            str = "-0";
        }
        sb2.append(str);
        sb2.append((int) s7);
        short s10 = this.f18723c;
        if (s10 < 10) {
            str2 = "-0";
        }
        sb2.append(str2);
        sb2.append((int) s10);
        return sb2.toString();
    }

    public final boolean u(f fVar) {
        if (fVar instanceof f) {
            if (n(fVar) >= 0) {
                return false;
            }
            return true;
        }
        if (l() >= fVar.l()) {
            return false;
        }
        return true;
    }

    public final boolean v(f fVar) {
        if (fVar instanceof f) {
            if (n(fVar) != 0) {
                return false;
            }
            return true;
        }
        if (l() != fVar.l()) {
            return false;
        }
        return true;
    }

    public final boolean w() {
        iv.f fVar = iv.f.f20561a;
        long j10 = this.f18721a;
        fVar.getClass();
        return iv.f.b(j10);
    }

    @Override // lv.j
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public final f a(long j10, lv.b bVar) {
        if (j10 == Long.MIN_VALUE) {
            return c(Long.MAX_VALUE, bVar).c(1L, bVar);
        }
        return c(-j10, bVar);
    }

    public final f y(long j10) {
        if (j10 == Long.MIN_VALUE) {
            return D(Long.MAX_VALUE).D(1L);
        }
        return D(-j10);
    }

    public final long z(f fVar) {
        return (((((fVar.f18721a * 12) + (fVar.f18722b - 1)) * 32) + fVar.f18723c) - ((((this.f18721a * 12) + (this.f18722b - 1)) * 32) + this.f18723c)) / 32;
    }
}
