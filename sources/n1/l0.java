package n1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class l0 extends o0 {

    /* renamed from: a, reason: collision with root package name */
    public final p0 f28152a;

    public l0(p0 p0Var) {
        this.f28152a = p0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0)) {
            return false;
        }
        if (Intrinsics.a(this.f28152a, ((l0) obj).f28152a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f28152a.hashCode();
    }
}
