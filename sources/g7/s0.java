package g7;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class s0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f17040a;

    /* renamed from: b, reason: collision with root package name */
    public final w4 f17041b;

    public s0(int i10, w4 hint) {
        Intrinsics.checkNotNullParameter(hint, "hint");
        this.f17040a = i10;
        this.f17041b = hint;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj;
        return this.f17040a == s0Var.f17040a && Intrinsics.a(this.f17041b, s0Var.f17041b);
    }

    public final int hashCode() {
        return this.f17041b.hashCode() + (Integer.hashCode(this.f17040a) * 31);
    }

    public final String toString() {
        return "GenerationalViewportHint(generationId=" + this.f17040a + ", hint=" + this.f17041b + ')';
    }
}
