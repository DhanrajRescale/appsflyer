package z2;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f41942a = true;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f41943b = true;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f41944c = true;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        if (this.f41942a == oVar.f41942a && this.f41943b == oVar.f41943b && this.f41944c == oVar.f41944c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + v.e.d(this.f41944c, (v.f41977a.hashCode() + v.e.d(this.f41943b, Boolean.hashCode(this.f41942a) * 31, 31)) * 31, 31);
    }
}
