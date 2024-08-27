package w2;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final int f38794a;

    /* renamed from: b, reason: collision with root package name */
    public final int f38795b;

    /* renamed from: c, reason: collision with root package name */
    public final int f38796c;

    /* renamed from: d, reason: collision with root package name */
    public final int f38797d;

    public i(int i10, int i11, int i12, int i13) {
        this.f38794a = i10;
        this.f38795b = i11;
        this.f38796c = i12;
        this.f38797d = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f38794a == iVar.f38794a && this.f38795b == iVar.f38795b && this.f38796c == iVar.f38796c && this.f38797d == iVar.f38797d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f38797d) + da.e.f(this.f38796c, da.e.f(this.f38795b, Integer.hashCode(this.f38794a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IntRect.fromLTRB(");
        sb2.append(this.f38794a);
        sb2.append(", ");
        sb2.append(this.f38795b);
        sb2.append(", ");
        sb2.append(this.f38796c);
        sb2.append(", ");
        return a3.a.i(sb2, this.f38797d, ')');
    }
}
