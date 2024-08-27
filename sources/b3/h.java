package b3;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final Object f3120a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3121b;

    /* renamed from: c, reason: collision with root package name */
    public final r f3122c;

    public h(Object obj, int i10, r rVar) {
        this.f3120a = obj;
        this.f3121b = i10;
        this.f3122c = rVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return Intrinsics.a(this.f3120a, hVar.f3120a) && this.f3121b == hVar.f3121b && Intrinsics.a(this.f3122c, hVar.f3122c);
    }

    public final int hashCode() {
        return this.f3122c.hashCode() + da.e.f(this.f3121b, this.f3120a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "VerticalAnchor(id=" + this.f3120a + ", index=" + this.f3121b + ", reference=" + this.f3122c + ')';
    }
}
