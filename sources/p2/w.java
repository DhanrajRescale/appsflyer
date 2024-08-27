package p2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public String f30607a;

    /* renamed from: b, reason: collision with root package name */
    public m f30608b;

    /* renamed from: c, reason: collision with root package name */
    public int f30609c;

    /* renamed from: d, reason: collision with root package name */
    public int f30610d;

    public final int a() {
        m mVar = this.f30608b;
        if (mVar == null) {
            return this.f30607a.length();
        }
        return (mVar.f30589b - mVar.c()) + (this.f30607a.length() - (this.f30610d - this.f30609c));
    }

    public final void b(int i10, int i11, String str) {
        if (i10 <= i11) {
            if (i10 >= 0) {
                m mVar = this.f30608b;
                if (mVar == null) {
                    int max = Math.max(255, str.length() + 128);
                    char[] cArr = new char[max];
                    int min = Math.min(i10, 64);
                    int min2 = Math.min(this.f30607a.length() - i11, 64);
                    String str2 = this.f30607a;
                    int i12 = i10 - min;
                    Intrinsics.d(str2, "null cannot be cast to non-null type java.lang.String");
                    str2.getChars(i12, i10, cArr, 0);
                    String str3 = this.f30607a;
                    int i13 = max - min2;
                    int i14 = min2 + i11;
                    Intrinsics.d(str3, "null cannot be cast to non-null type java.lang.String");
                    str3.getChars(i11, i14, cArr, i13);
                    str.getChars(0, str.length(), cArr, min);
                    this.f30608b = new m(cArr, str.length() + min, i13);
                    this.f30609c = i12;
                    this.f30610d = i14;
                    return;
                }
                int i15 = this.f30609c;
                int i16 = i10 - i15;
                int i17 = i11 - i15;
                if (i16 >= 0 && i17 <= mVar.f30589b - mVar.c()) {
                    int length = str.length() - (i17 - i16);
                    if (length > mVar.c()) {
                        int c10 = length - mVar.c();
                        int i18 = mVar.f30589b;
                        do {
                            i18 *= 2;
                        } while (i18 - mVar.f30589b < c10);
                        char[] cArr2 = new char[i18];
                        vt.t.e((char[]) mVar.f30592e, cArr2, 0, 0, mVar.f30590c);
                        int i19 = mVar.f30589b;
                        int i20 = mVar.f30591d;
                        int i21 = i19 - i20;
                        int i22 = i18 - i21;
                        vt.t.e((char[]) mVar.f30592e, cArr2, i22, i20, i21 + i20);
                        mVar.f30592e = cArr2;
                        mVar.f30589b = i18;
                        mVar.f30591d = i22;
                    }
                    int i23 = mVar.f30590c;
                    if (i16 < i23 && i17 <= i23) {
                        int i24 = i23 - i17;
                        char[] cArr3 = (char[]) mVar.f30592e;
                        vt.t.e(cArr3, cArr3, mVar.f30591d - i24, i17, i23);
                        mVar.f30590c = i16;
                        mVar.f30591d -= i24;
                    } else if (i16 < i23 && i17 >= i23) {
                        mVar.f30591d = mVar.c() + i17;
                        mVar.f30590c = i16;
                    } else {
                        int c11 = mVar.c() + i16;
                        int c12 = mVar.c() + i17;
                        int i25 = mVar.f30591d;
                        char[] cArr4 = (char[]) mVar.f30592e;
                        vt.t.e(cArr4, cArr4, mVar.f30590c, i25, c11);
                        mVar.f30590c += c11 - i25;
                        mVar.f30591d = c12;
                    }
                    str.getChars(0, str.length(), (char[]) mVar.f30592e, mVar.f30590c);
                    mVar.f30590c = str.length() + mVar.f30590c;
                    return;
                }
                this.f30607a = toString();
                this.f30608b = null;
                this.f30609c = -1;
                this.f30610d = -1;
                b(i10, i11, str);
                return;
            }
            throw new IllegalArgumentException(jr.h.n("start must be non-negative, but was ", i10).toString());
        }
        throw new IllegalArgumentException(da.e.m("start index must be less than or equal to end index: ", i10, " > ", i11).toString());
    }

    public final String toString() {
        m mVar = this.f30608b;
        if (mVar == null) {
            return this.f30607a;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) this.f30607a, 0, this.f30609c);
        sb2.append((char[]) mVar.f30592e, 0, mVar.f30590c);
        char[] cArr = (char[]) mVar.f30592e;
        int i10 = mVar.f30591d;
        sb2.append(cArr, i10, mVar.f30589b - i10);
        String str = this.f30607a;
        sb2.append((CharSequence) str, this.f30610d, str.length());
        return sb2.toString();
    }
}
