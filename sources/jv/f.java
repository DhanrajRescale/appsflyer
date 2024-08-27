package jv;

import java.math.BigDecimal;
import java.math.RoundingMode;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public final class f implements e {

    /* renamed from: a, reason: collision with root package name */
    public final lv.m f21682a;

    /* renamed from: b, reason: collision with root package name */
    public final int f21683b;

    /* renamed from: c, reason: collision with root package name */
    public final int f21684c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f21685d;

    public f(lv.a aVar, int i10, int i11, boolean z10) {
        el.l.D0(aVar, "field");
        lv.q qVar = aVar.f25425b;
        if (qVar.f25453a == qVar.f25454b && qVar.f25455c == qVar.f25456d) {
            if (i10 >= 0 && i10 <= 9) {
                if (i11 >= 1 && i11 <= 9) {
                    if (i11 >= i10) {
                        this.f21682a = aVar;
                        this.f21683b = i10;
                        this.f21684c = i11;
                        this.f21685d = z10;
                        return;
                    }
                    throw new IllegalArgumentException(da.e.m("Maximum width must exceed or equal the minimum width but ", i11, " < ", i10));
                }
                throw new IllegalArgumentException(jr.h.n("Maximum width must be from 1 to 9 inclusive but was ", i11));
            }
            throw new IllegalArgumentException(jr.h.n("Minimum width must be from 0 to 9 inclusive but was ", i10));
        }
        throw new IllegalArgumentException("Field must have a fixed set of values: " + aVar);
    }

    @Override // jv.e
    public final boolean a(e5.o oVar, StringBuilder sb2) {
        lv.m mVar = this.f21682a;
        Long e10 = oVar.e(mVar);
        if (e10 == null) {
            return false;
        }
        v vVar = (v) oVar.f15032e;
        long longValue = e10.longValue();
        lv.q d10 = mVar.d();
        d10.b(longValue, mVar);
        BigDecimal valueOf = BigDecimal.valueOf(d10.f25453a);
        BigDecimal add = BigDecimal.valueOf(d10.f25456d).subtract(valueOf).add(BigDecimal.ONE);
        BigDecimal subtract = BigDecimal.valueOf(longValue).subtract(valueOf);
        RoundingMode roundingMode = RoundingMode.FLOOR;
        BigDecimal divide = subtract.divide(add, 9, roundingMode);
        BigDecimal bigDecimal = BigDecimal.ZERO;
        if (divide.compareTo(bigDecimal) != 0) {
            bigDecimal = divide.stripTrailingZeros();
        }
        int scale = bigDecimal.scale();
        boolean z10 = this.f21685d;
        int i10 = this.f21683b;
        if (scale == 0) {
            if (i10 > 0) {
                if (z10) {
                    vVar.getClass();
                    sb2.append('.');
                }
                for (int i11 = 0; i11 < i10; i11++) {
                    vVar.getClass();
                    sb2.append('0');
                }
                return true;
            }
            return true;
        }
        String substring = bigDecimal.setScale(Math.min(Math.max(bigDecimal.scale(), i10), this.f21684c), roundingMode).toPlainString().substring(2);
        vVar.getClass();
        if (z10) {
            sb2.append('.');
        }
        sb2.append(substring);
        return true;
    }

    public final String toString() {
        String str;
        if (this.f21685d) {
            str = ",DecimalPoint";
        } else {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        return "Fraction(" + this.f21682a + "," + this.f21683b + "," + this.f21684c + str + ")";
    }
}
