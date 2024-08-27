package z8;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: c, reason: collision with root package name */
    public static final g f42186c;

    /* renamed from: a, reason: collision with root package name */
    public final al.d f42187a;

    /* renamed from: b, reason: collision with root package name */
    public final al.d f42188b;

    static {
        b bVar = b.f42176b;
        f42186c = new g(bVar, bVar);
    }

    public g(al.d dVar, al.d dVar2) {
        this.f42187a = dVar;
        this.f42188b = dVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Intrinsics.a(this.f42187a, gVar.f42187a) && Intrinsics.a(this.f42188b, gVar.f42188b);
    }

    public final int hashCode() {
        return this.f42188b.hashCode() + (this.f42187a.hashCode() * 31);
    }

    public final String toString() {
        return "Size(width=" + this.f42187a + ", height=" + this.f42188b + ')';
    }
}
