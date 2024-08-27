package zi;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final List f42471a;

    public e(ArrayList sections) {
        Intrinsics.checkNotNullParameter(sections, "sections");
        this.f42471a = sections;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && Intrinsics.a(this.f42471a, ((e) obj).f42471a);
    }

    public final int hashCode() {
        return this.f42471a.hashCode();
    }

    public final String toString() {
        return a3.a.l(new StringBuilder("MarketOverview(sections="), this.f42471a, ")");
    }
}
