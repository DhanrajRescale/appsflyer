package w2;

import com.google.android.gms.common.api.Api;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final long f38776a;

    public /* synthetic */ a(long j10) {
        this.f38776a = j10;
    }

    public static long a(long j10, int i10, int i11, int i12, int i13, int i14) {
        boolean z10;
        if ((i14 & 1) != 0) {
            i10 = j(j10);
        }
        if ((i14 & 2) != 0) {
            i11 = h(j10);
        }
        if ((i14 & 4) != 0) {
            i12 = i(j10);
        }
        if ((i14 & 8) != 0) {
            i13 = g(j10);
        }
        boolean z11 = true;
        if (i12 >= 0 && i10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (i11 < i10) {
                z11 = false;
            }
            if (z11) {
                if (i13 >= i12) {
                    return hl.f.Q(i10, i11, i12, i13);
                }
                yk.j.A1("maxHeight(" + i13 + ") must be >= minHeight(" + i12 + ')');
                throw null;
            }
            yk.j.A1("maxWidth(" + i11 + ") must be >= minWidth(" + i10 + ')');
            throw null;
        }
        yk.j.A1("minHeight(" + i12 + ") and minWidth(" + i10 + ") must be >= 0");
        throw null;
    }

    public static final boolean b(long j10, long j11) {
        return j10 == j11;
    }

    public static final boolean c(long j10) {
        int i10 = (int) (3 & j10);
        int i11 = (((i10 & 2) >> 1) * 3) + ((i10 & 1) << 1);
        return (((int) (j10 >> (i11 + 46))) & ((1 << (18 - i11)) - 1)) != 0;
    }

    public static final boolean d(long j10) {
        int i10 = (int) (3 & j10);
        return (((int) (j10 >> 33)) & ((1 << (((((i10 & 2) >> 1) * 3) + ((i10 & 1) << 1)) + 13)) - 1)) != 0;
    }

    public static final boolean e(long j10) {
        int i10 = (int) (3 & j10);
        int i11 = (((i10 & 2) >> 1) * 3) + ((i10 & 1) << 1);
        int i12 = (1 << (18 - i11)) - 1;
        int i13 = ((int) (j10 >> (i11 + 15))) & i12;
        int i14 = ((int) (j10 >> (i11 + 46))) & i12;
        return i13 == (i14 == 0 ? Api.BaseClientBuilder.API_PRIORITY_OTHER : i14 - 1);
    }

    public static final boolean f(long j10) {
        int i10 = (int) (3 & j10);
        int i11 = (1 << (((((i10 & 2) >> 1) * 3) + ((i10 & 1) << 1)) + 13)) - 1;
        int i12 = ((int) (j10 >> 2)) & i11;
        int i13 = ((int) (j10 >> 33)) & i11;
        return i12 == (i13 == 0 ? Api.BaseClientBuilder.API_PRIORITY_OTHER : i13 - 1);
    }

    public static final int g(long j10) {
        int i10 = (int) (3 & j10);
        int i11 = (((i10 & 2) >> 1) * 3) + ((i10 & 1) << 1);
        int i12 = ((int) (j10 >> (i11 + 46))) & ((1 << (18 - i11)) - 1);
        return i12 == 0 ? Api.BaseClientBuilder.API_PRIORITY_OTHER : i12 - 1;
    }

    public static final int h(long j10) {
        int i10 = (int) (3 & j10);
        int i11 = ((int) (j10 >> 33)) & ((1 << (((((i10 & 2) >> 1) * 3) + ((i10 & 1) << 1)) + 13)) - 1);
        return i11 == 0 ? Api.BaseClientBuilder.API_PRIORITY_OTHER : i11 - 1;
    }

    public static final int i(long j10) {
        int i10 = (int) (3 & j10);
        int i11 = (((i10 & 2) >> 1) * 3) + ((i10 & 1) << 1);
        return ((int) (j10 >> (i11 + 15))) & ((1 << (18 - i11)) - 1);
    }

    public static final int j(long j10) {
        int i10 = (int) (3 & j10);
        return ((int) (j10 >> 2)) & ((1 << (((((i10 & 2) >> 1) * 3) + ((i10 & 1) << 1)) + 13)) - 1);
    }

    public static String k(long j10) {
        String valueOf;
        int h10 = h(j10);
        String str = "Infinity";
        if (h10 == Integer.MAX_VALUE) {
            valueOf = "Infinity";
        } else {
            valueOf = String.valueOf(h10);
        }
        int g10 = g(j10);
        if (g10 != Integer.MAX_VALUE) {
            str = String.valueOf(g10);
        }
        StringBuilder sb2 = new StringBuilder("Constraints(minWidth = ");
        sb2.append(j(j10));
        sb2.append(", maxWidth = ");
        sb2.append(valueOf);
        sb2.append(", minHeight = ");
        sb2.append(i(j10));
        sb2.append(", maxHeight = ");
        return nn.d.n(sb2, str, ')');
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        if (this.f38776a != ((a) obj).f38776a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Long.hashCode(this.f38776a);
    }

    public final String toString() {
        return k(this.f38776a);
    }
}
