package w2;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: b, reason: collision with root package name */
    public static final long f38787b;

    /* renamed from: c, reason: collision with root package name */
    public static final long f38788c = hl.f.g(Float.NaN, Float.NaN);

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f38789d = 0;

    /* renamed from: a, reason: collision with root package name */
    public final long f38790a;

    static {
        float f10 = 0;
        f38787b = hl.f.g(f10, f10);
    }

    public static final float a(long j10) {
        boolean z10;
        if (j10 != 9205357640488583168L) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return Float.intBitsToFloat((int) (j10 & 4294967295L));
        }
        yk.j.B1("DpSize is unspecified");
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
            return Float.intBitsToFloat((int) (j10 >> 32));
        }
        yk.j.B1("DpSize is unspecified");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        if (this.f38790a != ((g) obj).f38790a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Long.hashCode(this.f38790a);
    }

    public final String toString() {
        long j10 = this.f38790a;
        if (j10 != 9205357640488583168L) {
            return ((Object) e.b(b(j10))) + " x " + ((Object) e.b(a(j10)));
        }
        return "DpSize.Unspecified";
    }
}
