package id;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class k extends zq.f {

    /* renamed from: e, reason: collision with root package name */
    public final z9.i f19864e;

    public k(z9.h message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f19864e = message;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k) && Intrinsics.a(this.f19864e, ((k) obj).f19864e);
    }

    public final int hashCode() {
        return this.f19864e.hashCode();
    }

    public final String toString() {
        return "ErrorState(message=" + this.f19864e + ")";
    }
}
