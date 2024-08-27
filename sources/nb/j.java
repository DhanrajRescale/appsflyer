package nb;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class j extends bl.j {
    public j() {
        b progressBarType = b.f28564a;
        Intrinsics.checkNotNullParameter(progressBarType, "progressBarType");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        b bVar = b.f28564a;
        ((j) obj).getClass();
        return true;
    }

    public final int hashCode() {
        return b.f28564a.hashCode();
    }

    public final String toString() {
        return "Initial(progressBarType=" + b.f28564a + ")";
    }
}
