package b3;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final Object f3117a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3118b;

    /* renamed from: c, reason: collision with root package name */
    public final r f3119c;

    public g(Object obj, int i10, r rVar) {
        this.f3117a = obj;
        this.f3118b = i10;
        this.f3119c = rVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Intrinsics.a(this.f3117a, gVar.f3117a) && this.f3118b == gVar.f3118b && Intrinsics.a(this.f3119c, gVar.f3119c);
    }

    public final int hashCode() {
        return this.f3119c.hashCode() + da.e.f(this.f3118b, this.f3117a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "HorizontalAnchor(id=" + this.f3117a + ", index=" + this.f3118b + ", reference=" + this.f3119c + ')';
    }
}
