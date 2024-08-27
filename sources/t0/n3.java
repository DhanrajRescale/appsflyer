package t0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class n3 implements l3 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f35099a;

    public n3(Object obj) {
        this.f35099a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n3) && Intrinsics.a(this.f35099a, ((n3) obj).f35099a);
    }

    @Override // t0.l3
    public final Object getValue() {
        return this.f35099a;
    }

    public final int hashCode() {
        Object obj = this.f35099a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "StaticValueHolder(value=" + this.f35099a + ')';
    }
}
