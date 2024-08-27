package u5;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final long f36742a;

    /* renamed from: b, reason: collision with root package name */
    public final long f36743b;

    public a(long j10, long j11) {
        this.f36742a = j10;
        this.f36743b = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f36742a == aVar.f36742a && this.f36743b == aVar.f36743b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f36742a) * 31) + ((int) this.f36743b);
    }
}
