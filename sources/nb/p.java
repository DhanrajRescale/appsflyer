package nb;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class p extends bl.j {

    /* renamed from: b, reason: collision with root package name */
    public final List f28591b;

    public p(ArrayList categories) {
        Intrinsics.checkNotNullParameter(categories, "categories");
        this.f28591b = categories;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p) && Intrinsics.a(this.f28591b, ((p) obj).f28591b);
    }

    public final int hashCode() {
        return this.f28591b.hashCode();
    }

    public final String toString() {
        return a3.a.l(new StringBuilder("UpdateCategories(categories="), this.f28591b, ")");
    }
}
