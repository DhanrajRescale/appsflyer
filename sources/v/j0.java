package v;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    public final float f37537a;

    /* renamed from: b, reason: collision with root package name */
    public final w.f0 f37538b;

    public j0(float f10, w.f0 f0Var) {
        this.f37537a = f10;
        this.f37538b = f0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        return Float.compare(this.f37537a, j0Var.f37537a) == 0 && Intrinsics.a(this.f37538b, j0Var.f37538b);
    }

    public final int hashCode() {
        return this.f37538b.hashCode() + (Float.hashCode(this.f37537a) * 31);
    }

    public final String toString() {
        return "Fade(alpha=" + this.f37537a + ", animationSpec=" + this.f37538b + ')';
    }
}
