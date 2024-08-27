package kj;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final k f23223a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f23224b;

    public h(k kVar, Object obj) {
        this.f23223a = kVar;
        this.f23224b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f23223a == hVar.f23223a && Intrinsics.a(this.f23224b, hVar.f23224b);
    }

    public final int hashCode() {
        int hashCode = this.f23223a.hashCode() * 31;
        Object obj = this.f23224b;
        return hashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return "Resource(status=" + this.f23223a + ", data=" + this.f23224b + ")";
    }
}
