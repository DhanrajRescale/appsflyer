package m5;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final long f27581a;

    /* renamed from: b, reason: collision with root package name */
    public final long f27582b;

    public q(long j10, long j11) {
        this.f27581a = j10;
        this.f27582b = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q.class != obj.getClass()) {
            return false;
        }
        q qVar = (q) obj;
        if (this.f27581a == qVar.f27581a && this.f27582b == qVar.f27582b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f27581a) * 31) + ((int) this.f27582b);
    }
}
