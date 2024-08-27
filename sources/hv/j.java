package hv;

import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.Locale;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public final class j extends kv.b implements lv.l, Comparable, Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f18738c = 0;
    private static final long serialVersionUID = -939150713474957432L;

    /* renamed from: a, reason: collision with root package name */
    public final int f18739a;

    /* renamed from: b, reason: collision with root package name */
    public final int f18740b;

    static {
        jv.r rVar = new jv.r();
        rVar.d("--");
        rVar.l(lv.a.MONTH_OF_YEAR, 2);
        rVar.c('-');
        rVar.l(lv.a.DAY_OF_MONTH, 2);
        rVar.p(Locale.getDefault());
    }

    public j(int i10, int i11) {
        this.f18739a = i10;
        this.f18740b = i11;
    }

    public static j l(int i10, int i11) {
        i p10 = i.p(i10);
        el.l.D0(p10, "month");
        lv.a.DAY_OF_MONTH.h(i11);
        if (i11 <= p10.o()) {
            return new j(p10.m(), i11);
        }
        StringBuilder n10 = a3.a.n("Illegal value for DayOfMonth field, value ", i11, " is not valid for month ");
        n10.append(p10.name());
        throw new RuntimeException(n10.toString());
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new n((byte) 64, this);
    }

    @Override // kv.b, lv.k
    public final Object b(lv.o oVar) {
        if (oVar == lv.n.f25447b) {
            return iv.f.f20561a;
        }
        return super.b(oVar);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        j jVar = (j) obj;
        int i10 = this.f18739a - jVar.f18739a;
        if (i10 == 0) {
            return this.f18740b - jVar.f18740b;
        }
        return i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (this.f18739a == jVar.f18739a && this.f18740b == jVar.f18740b) {
            return true;
        }
        return false;
    }

    @Override // lv.k
    public final long f(lv.m mVar) {
        int i10;
        if (mVar instanceof lv.a) {
            int ordinal = ((lv.a) mVar).ordinal();
            if (ordinal != 18) {
                if (ordinal == 23) {
                    i10 = this.f18739a;
                } else {
                    throw new RuntimeException(da.e.n("Unsupported field: ", mVar));
                }
            } else {
                i10 = this.f18740b;
            }
            return i10;
        }
        return mVar.e(this);
    }

    @Override // lv.l
    public final lv.j h(lv.j jVar) {
        if (iv.e.a(jVar).equals(iv.f.f20561a)) {
            lv.j d10 = jVar.d(this.f18739a, lv.a.MONTH_OF_YEAR);
            lv.a aVar = lv.a.DAY_OF_MONTH;
            return d10.d(Math.min(d10.j(aVar).f25456d, this.f18740b), aVar);
        }
        throw new RuntimeException("Adjustment only supported on ISO date-time");
    }

    public final int hashCode() {
        return (this.f18739a << 6) + this.f18740b;
    }

    @Override // lv.k
    public final boolean i(lv.m mVar) {
        if (mVar instanceof lv.a) {
            if (mVar == lv.a.MONTH_OF_YEAR || mVar == lv.a.DAY_OF_MONTH) {
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
        int i10;
        if (mVar == lv.a.MONTH_OF_YEAR) {
            return mVar.d();
        }
        if (mVar == lv.a.DAY_OF_MONTH) {
            int ordinal = i.p(this.f18739a).ordinal();
            if (ordinal != 1) {
                if (ordinal != 3 && ordinal != 5 && ordinal != 8 && ordinal != 10) {
                    i10 = 31;
                } else {
                    i10 = 30;
                }
            } else {
                i10 = 28;
            }
            return lv.q.e(1L, i10, i.p(r8).o());
        }
        return super.j(mVar);
    }

    @Override // kv.b, lv.k
    public final int k(lv.m mVar) {
        return j(mVar).a(f(mVar), mVar);
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb2 = new StringBuilder(10);
        sb2.append("--");
        int i10 = this.f18739a;
        if (i10 < 10) {
            str = "0";
        } else {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        sb2.append(str);
        sb2.append(i10);
        int i11 = this.f18740b;
        if (i11 < 10) {
            str2 = "-0";
        } else {
            str2 = "-";
        }
        sb2.append(str2);
        sb2.append(i11);
        return sb2.toString();
    }
}
