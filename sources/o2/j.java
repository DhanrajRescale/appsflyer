package o2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final Object f29497a;

    public final boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        if (!Intrinsics.a(this.f29497a, ((j) obj).f29497a)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Object obj = this.f29497a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "AsyncTypefaceResult(result=" + this.f29497a + ')';
    }
}
