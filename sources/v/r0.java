package v;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class r0 {

    /* renamed from: a, reason: collision with root package name */
    public final Function1 f37604a;

    /* renamed from: b, reason: collision with root package name */
    public final w.f0 f37605b;

    public r0(w.f0 f0Var, c0 c0Var) {
        this.f37604a = c0Var;
        this.f37605b = f0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        return Intrinsics.a(this.f37604a, r0Var.f37604a) && Intrinsics.a(this.f37605b, r0Var.f37605b);
    }

    public final int hashCode() {
        return this.f37605b.hashCode() + (this.f37604a.hashCode() * 31);
    }

    public final String toString() {
        return "Slide(slideOffset=" + this.f37604a + ", animationSpec=" + this.f37605b + ')';
    }
}
