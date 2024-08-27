package w;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class u0 extends t0 {

    /* renamed from: c, reason: collision with root package name */
    public e f38686c;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj;
        if (Intrinsics.a(u0Var.f38680a, this.f38680a) && Intrinsics.a(u0Var.f38681b, this.f38681b) && Intrinsics.a(u0Var.f38686c, this.f38686c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        Object obj = this.f38680a;
        if (obj != null) {
            i10 = obj.hashCode();
        } else {
            i10 = 0;
        }
        return this.f38681b.hashCode() + ((this.f38686c.hashCode() + (i10 * 31)) * 31);
    }
}
