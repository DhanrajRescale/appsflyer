package t0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class j1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f35067a;

    public j1(String str) {
        this.f35067a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j1) && Intrinsics.a(this.f35067a, ((j1) obj).f35067a);
    }

    public final int hashCode() {
        return this.f35067a.hashCode();
    }

    public final String toString() {
        return nn.d.n(new StringBuilder("OpaqueKey(key="), this.f35067a, ')');
    }
}
