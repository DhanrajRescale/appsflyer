package y1;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public long f41050a;

    /* renamed from: b, reason: collision with root package name */
    public float f41051b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f41050a == aVar.f41050a && Float.compare(this.f41051b, aVar.f41051b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f41051b) + (Long.hashCode(this.f41050a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DataPointAtTime(time=");
        sb2.append(this.f41050a);
        sb2.append(", dataPoint=");
        return nn.d.l(sb2, this.f41051b, ')');
    }
}
