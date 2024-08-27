package zi;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f42466a;

    public c(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f42466a = message;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && Intrinsics.a(this.f42466a, ((c) obj).f42466a);
    }

    public final int hashCode() {
        return this.f42466a.hashCode();
    }

    public final String toString() {
        return nn.d.o(new StringBuilder("EmptyData(message="), this.f42466a, ")");
    }
}
