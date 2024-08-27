package c2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class v1 implements s1 {

    /* renamed from: a, reason: collision with root package name */
    public final a2.n0 f7866a;

    /* renamed from: b, reason: collision with root package name */
    public final u0 f7867b;

    public v1(a2.n0 n0Var, u0 u0Var) {
        this.f7866a = n0Var;
        this.f7867b = u0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v1)) {
            return false;
        }
        v1 v1Var = (v1) obj;
        return Intrinsics.a(this.f7866a, v1Var.f7866a) && Intrinsics.a(this.f7867b, v1Var.f7867b);
    }

    public final int hashCode() {
        return this.f7867b.hashCode() + (this.f7866a.hashCode() * 31);
    }

    @Override // c2.s1
    public final boolean r() {
        return this.f7867b.B0().m();
    }

    public final String toString() {
        return "PlaceableResult(result=" + this.f7866a + ", placeable=" + this.f7867b + ')';
    }
}
