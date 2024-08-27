package z5;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: c, reason: collision with root package name */
    public static final z f42140c = new z(0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final long f42141a;

    /* renamed from: b, reason: collision with root package name */
    public final long f42142b;

    public z(long j10, long j11) {
        this.f42141a = j10;
        this.f42142b = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || z.class != obj.getClass()) {
            return false;
        }
        z zVar = (z) obj;
        if (this.f42141a == zVar.f42141a && this.f42142b == zVar.f42142b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f42141a) * 31) + ((int) this.f42142b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("[timeUs=");
        sb2.append(this.f42141a);
        sb2.append(", position=");
        return a3.a.j(sb2, this.f42142b, "]");
    }
}
