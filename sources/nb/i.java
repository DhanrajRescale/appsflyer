package nb;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class i extends bl.j {

    /* renamed from: b, reason: collision with root package name */
    public final List f28582b;

    public i(List categories) {
        Intrinsics.checkNotNullParameter(categories, "categories");
        this.f28582b = categories;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof i) {
            return Intrinsics.a(this.f28582b, ((i) obj).f28582b);
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.f28582b.hashCode() * 31);
    }

    public final String toString() {
        return "Data(categories=" + this.f28582b + ", isRefreshCall=true)";
    }
}
