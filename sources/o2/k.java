package o2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final q f29498a;

    public k(q qVar) {
        this.f29498a = qVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof k) {
            return Intrinsics.a(this.f29498a, ((k) obj).f29498a) && Intrinsics.a(null, null);
        }
        return false;
    }

    public final int hashCode() {
        return this.f29498a.hashCode() * 31;
    }

    public final String toString() {
        return "Key(font=" + this.f29498a + ", loaderKey=null)";
    }
}
