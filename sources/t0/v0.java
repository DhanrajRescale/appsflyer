package t0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class v0 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f35218a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f35219b;

    public v0(Integer num, Object obj) {
        this.f35218a = num;
        this.f35219b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj;
        return Intrinsics.a(this.f35218a, v0Var.f35218a) && Intrinsics.a(this.f35219b, v0Var.f35219b);
    }

    public final int hashCode() {
        int i10;
        Object obj = this.f35218a;
        int i11 = 0;
        if (obj instanceof Enum) {
            i10 = ((Enum) obj).ordinal();
        } else if (obj != null) {
            i10 = obj.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = i10 * 31;
        Object obj2 = this.f35219b;
        if (obj2 instanceof Enum) {
            i11 = ((Enum) obj2).ordinal();
        } else if (obj2 != null) {
            i11 = obj2.hashCode();
        }
        return i11 + i12;
    }

    public final String toString() {
        return "JoinedKey(left=" + this.f35218a + ", right=" + this.f35219b + ')';
    }
}
