package b5;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class n implements k {

    /* renamed from: f, reason: collision with root package name */
    public static final n f3489f = new n(1, null, 2, 3);

    /* renamed from: g, reason: collision with root package name */
    public static final String f3490g;

    /* renamed from: h, reason: collision with root package name */
    public static final String f3491h;

    /* renamed from: i, reason: collision with root package name */
    public static final String f3492i;

    /* renamed from: j, reason: collision with root package name */
    public static final String f3493j;

    /* renamed from: k, reason: collision with root package name */
    public static final i5.w f3494k;

    /* renamed from: a, reason: collision with root package name */
    public final int f3495a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3496b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3497c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f3498d;

    /* renamed from: e, reason: collision with root package name */
    public int f3499e;

    static {
        int i10 = e5.x.f15050a;
        f3490g = Integer.toString(0, 36);
        f3491h = Integer.toString(1, 36);
        f3492i = Integer.toString(2, 36);
        f3493j = Integer.toString(3, 36);
        f3494k = new i5.w(15);
    }

    public n(int i10, byte[] bArr, int i11, int i12) {
        this.f3495a = i10;
        this.f3496b = i11;
        this.f3497c = i12;
        this.f3498d = bArr;
    }

    public static String a(int i10) {
        return i10 != -1 ? i10 != 10 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 6 ? i10 != 7 ? "Undefined color transfer" : "HLG" : "ST2084 PQ" : "SDR SMPTE 170M" : "sRGB" : "Linear" : "Gamma 2.2" : "Unset color transfer";
    }

    public static int b(int i10) {
        if (i10 == 1) {
            return 1;
        }
        if (i10 != 9) {
            return (i10 == 4 || i10 == 5 || i10 == 6 || i10 == 7) ? 2 : -1;
        }
        return 6;
    }

    public static int c(int i10) {
        if (i10 == 1) {
            return 3;
        }
        if (i10 == 4) {
            return 10;
        }
        if (i10 == 13) {
            return 2;
        }
        if (i10 == 16) {
            return 6;
        }
        if (i10 != 18) {
            return (i10 == 6 || i10 == 7) ? 3 : -1;
        }
        return 7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n.class != obj.getClass()) {
            return false;
        }
        n nVar = (n) obj;
        if (this.f3495a == nVar.f3495a && this.f3496b == nVar.f3496b && this.f3497c == nVar.f3497c && Arrays.equals(this.f3498d, nVar.f3498d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (this.f3499e == 0) {
            this.f3499e = Arrays.hashCode(this.f3498d) + ((((((527 + this.f3495a) * 31) + this.f3496b) * 31) + this.f3497c) * 31);
        }
        return this.f3499e;
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb2 = new StringBuilder("ColorInfo(");
        boolean z10 = true;
        int i10 = this.f3495a;
        if (i10 != -1) {
            if (i10 != 6) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        str = "Undefined color space";
                    } else {
                        str = "BT601";
                    }
                } else {
                    str = "BT709";
                }
            } else {
                str = "BT2020";
            }
        } else {
            str = "Unset color space";
        }
        sb2.append(str);
        sb2.append(", ");
        int i11 = this.f3496b;
        if (i11 != -1) {
            if (i11 != 1) {
                if (i11 != 2) {
                    str2 = "Undefined color range";
                } else {
                    str2 = "Limited range";
                }
            } else {
                str2 = "Full range";
            }
        } else {
            str2 = "Unset color range";
        }
        sb2.append(str2);
        sb2.append(", ");
        sb2.append(a(this.f3497c));
        sb2.append(", ");
        if (this.f3498d == null) {
            z10 = false;
        }
        return da.e.o(sb2, z10, ")");
    }
}
