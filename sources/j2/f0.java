package j2;

import d2.w0;

/* loaded from: classes.dex */
public final class f0 {

    /* renamed from: b, reason: collision with root package name */
    public static final long f20710b = w0.b(0, 0);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f20711c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final long f20712a;

    public /* synthetic */ f0(long j10) {
        this.f20712a = j10;
    }

    public static final boolean a(long j10, long j11) {
        return j10 == j11;
    }

    public static final boolean b(long j10) {
        return ((int) (j10 >> 32)) == ((int) (j10 & 4294967295L));
    }

    public static final int c(long j10) {
        return d(j10) - e(j10);
    }

    public static final int d(long j10) {
        int i10 = (int) (j10 >> 32);
        int i11 = (int) (j10 & 4294967295L);
        return i10 > i11 ? i10 : i11;
    }

    public static final int e(long j10) {
        int i10 = (int) (j10 >> 32);
        int i11 = (int) (j10 & 4294967295L);
        return i10 > i11 ? i11 : i10;
    }

    public static final boolean f(long j10) {
        return ((int) (j10 >> 32)) > ((int) (j10 & 4294967295L));
    }

    public static String g(long j10) {
        StringBuilder sb2 = new StringBuilder("TextRange(");
        sb2.append((int) (j10 >> 32));
        sb2.append(", ");
        return a3.a.i(sb2, (int) (j10 & 4294967295L), ')');
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f0)) {
            return false;
        }
        if (this.f20712a != ((f0) obj).f20712a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Long.hashCode(this.f20712a);
    }

    public final String toString() {
        return g(this.f20712a);
    }
}
