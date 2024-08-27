package sb;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class r extends yk.o {

    /* renamed from: d, reason: collision with root package name */
    public final hb.v f34537d;

    public r(hb.v filter) {
        Intrinsics.checkNotNullParameter(filter, "filter");
        this.f34537d = filter;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r) && Intrinsics.a(this.f34537d, ((r) obj).f34537d);
    }

    public final int hashCode() {
        return this.f34537d.hashCode();
    }

    public final String toString() {
        return "SelectFilter(filter=" + this.f34537d + ")";
    }
}
