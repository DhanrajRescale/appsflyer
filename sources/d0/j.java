package d0;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final int f13169a;

    /* renamed from: b, reason: collision with root package name */
    public final int f13170b;

    public j(int i10, int i11) {
        this.f13169a = i10;
        this.f13170b = i11;
        if (i10 >= 0) {
            if (i11 >= i10) {
                return;
            } else {
                throw new IllegalArgumentException("end index greater than start".toString());
            }
        }
        throw new IllegalArgumentException("negative start index".toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f13169a == jVar.f13169a && this.f13170b == jVar.f13170b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f13170b) + (Integer.hashCode(this.f13169a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Interval(start=");
        sb2.append(this.f13169a);
        sb2.append(", end=");
        return a3.a.i(sb2, this.f13170b, ')');
    }
}
