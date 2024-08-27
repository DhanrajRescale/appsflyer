package sb;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class c0 extends yk.o {

    /* renamed from: d, reason: collision with root package name */
    public final List f34442d;

    public c0(ArrayList feedElements) {
        Intrinsics.checkNotNullParameter(feedElements, "feedElements");
        this.f34442d = feedElements;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c0) && Intrinsics.a(this.f34442d, ((c0) obj).f34442d);
    }

    public final int hashCode() {
        return this.f34442d.hashCode();
    }

    public final String toString() {
        return a3.a.l(new StringBuilder("UpdateItems(feedElements="), this.f34442d, ")");
    }
}
