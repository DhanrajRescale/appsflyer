package nb;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class l extends bl.j {

    /* renamed from: b, reason: collision with root package name */
    public final String f28584b;

    public l(String str) {
        this.f28584b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l) && Intrinsics.a(this.f28584b, ((l) obj).f28584b);
    }

    public final int hashCode() {
        String str = this.f28584b;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return nn.d.o(new StringBuilder("ShowErrorMessage(errorMessage="), this.f28584b, ")");
    }
}
