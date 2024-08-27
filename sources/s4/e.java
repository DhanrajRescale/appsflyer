package s4;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final long f34198a;

    /* renamed from: b, reason: collision with root package name */
    public final long f34199b;

    public e(long j10, long j11) {
        if (j11 == 0) {
            this.f34198a = 0L;
            this.f34199b = 1L;
        } else {
            this.f34198a = j10;
            this.f34199b = j11;
        }
    }

    public final String toString() {
        return this.f34198a + "/" + this.f34199b;
    }
}
