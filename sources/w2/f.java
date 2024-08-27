package w2;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: b, reason: collision with root package name */
    public static final long f38784b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f38785c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final long f38786a;

    static {
        float f10 = 0;
        f38784b = hl.f.f(f10, f10);
        hl.f.f(Float.NaN, Float.NaN);
    }

    public /* synthetic */ f(long j10) {
        this.f38786a = j10;
    }

    public static final float a(long j10) {
        boolean z10;
        if (j10 != 9205357640488583168L) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return Float.intBitsToFloat((int) (j10 >> 32));
        }
        yk.j.B1("DpOffset is unspecified");
        throw null;
    }

    public static final float b(long j10) {
        boolean z10;
        if (j10 != 9205357640488583168L) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return Float.intBitsToFloat((int) (j10 & 4294967295L));
        }
        yk.j.B1("DpOffset is unspecified");
        throw null;
    }

    public static String c(long j10) {
        if (j10 != 9205357640488583168L) {
            return "(" + ((Object) e.b(a(j10))) + ", " + ((Object) e.b(b(j10))) + ')';
        }
        return "DpOffset.Unspecified";
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        if (this.f38786a != ((f) obj).f38786a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Long.hashCode(this.f38786a);
    }

    public final String toString() {
        return c(this.f38786a);
    }
}
