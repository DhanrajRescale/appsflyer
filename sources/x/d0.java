package x;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public final float f39525a;

    /* renamed from: b, reason: collision with root package name */
    public final n1.p f39526b;

    public d0(float f10, n1.z0 z0Var) {
        this.f39525a = f10;
        this.f39526b = z0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        if (w2.e.a(this.f39525a, d0Var.f39525a) && Intrinsics.a(this.f39526b, d0Var.f39526b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f39526b.hashCode() + (Float.hashCode(this.f39525a) * 31);
    }

    public final String toString() {
        return "BorderStroke(width=" + ((Object) w2.e.b(this.f39525a)) + ", brush=" + this.f39526b + ')';
    }
}
