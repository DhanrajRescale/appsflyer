package p2;

/* loaded from: classes.dex */
public final class z implements i {

    /* renamed from: a, reason: collision with root package name */
    public final int f30619a;

    /* renamed from: b, reason: collision with root package name */
    public final int f30620b;

    public z(int i10, int i11) {
        this.f30619a = i10;
        this.f30620b = i11;
    }

    @Override // p2.i
    public final void a(k kVar) {
        if (kVar.f30585d != -1) {
            kVar.f30585d = -1;
            kVar.f30586e = -1;
        }
        w wVar = kVar.f30582a;
        int f10 = kotlin.ranges.d.f(this.f30619a, 0, wVar.a());
        int f11 = kotlin.ranges.d.f(this.f30620b, 0, wVar.a());
        if (f10 != f11) {
            if (f10 < f11) {
                kVar.e(f10, f11);
            } else {
                kVar.e(f11, f10);
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        if (this.f30619a == zVar.f30619a && this.f30620b == zVar.f30620b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f30619a * 31) + this.f30620b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SetComposingRegionCommand(start=");
        sb2.append(this.f30619a);
        sb2.append(", end=");
        return a3.a.i(sb2, this.f30620b, ')');
    }
}
