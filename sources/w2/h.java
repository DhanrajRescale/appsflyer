package w2;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: b, reason: collision with root package name */
    public static final long f38791b = hl.f.j(0, 0);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f38792c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final long f38793a;

    public /* synthetic */ h(long j10) {
        this.f38793a = j10;
    }

    public static final boolean a(long j10, long j11) {
        return j10 == j11;
    }

    public static String b(long j10) {
        StringBuilder sb2 = new StringBuilder("(");
        sb2.append((int) (j10 >> 32));
        sb2.append(", ");
        return a3.a.i(sb2, (int) (j10 & 4294967295L), ')');
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        if (this.f38793a != ((h) obj).f38793a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Long.hashCode(this.f38793a);
    }

    public final String toString() {
        return b(this.f38793a);
    }
}
