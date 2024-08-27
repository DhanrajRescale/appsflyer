package p1;

import kotlin.jvm.internal.Intrinsics;
import n1.r;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public w2.b f30494a;

    /* renamed from: b, reason: collision with root package name */
    public w2.k f30495b;

    /* renamed from: c, reason: collision with root package name */
    public r f30496c;

    /* renamed from: d, reason: collision with root package name */
    public long f30497d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.a(this.f30494a, aVar.f30494a) && this.f30495b == aVar.f30495b && Intrinsics.a(this.f30496c, aVar.f30496c) && m1.f.b(this.f30497d, aVar.f30497d);
    }

    public final int hashCode() {
        int hashCode = (this.f30496c.hashCode() + ((this.f30495b.hashCode() + (this.f30494a.hashCode() * 31)) * 31)) * 31;
        long j10 = this.f30497d;
        int i10 = m1.f.f27253d;
        return Long.hashCode(j10) + hashCode;
    }

    public final String toString() {
        return "DrawParams(density=" + this.f30494a + ", layoutDirection=" + this.f30495b + ", canvas=" + this.f30496c + ", size=" + ((Object) m1.f.g(this.f30497d)) + ')';
    }
}
