package v;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class o0 {

    /* renamed from: a, reason: collision with root package name */
    public final w.d f37583a;

    /* renamed from: b, reason: collision with root package name */
    public long f37584b;

    public o0(w.d dVar, long j10) {
        this.f37583a = dVar;
        this.f37584b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj;
        return Intrinsics.a(this.f37583a, o0Var.f37583a) && w2.j.a(this.f37584b, o0Var.f37584b);
    }

    public final int hashCode() {
        return Long.hashCode(this.f37584b) + (this.f37583a.hashCode() * 31);
    }

    public final String toString() {
        return "AnimData(anim=" + this.f37583a + ", startSize=" + ((Object) w2.j.b(this.f37584b)) + ')';
    }
}
