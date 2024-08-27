package sb;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class h extends m {

    /* renamed from: a, reason: collision with root package name */
    public final String f34484a;

    public h(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f34484a = message;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && Intrinsics.a(this.f34484a, ((h) obj).f34484a);
    }

    public final int hashCode() {
        return this.f34484a.hashCode();
    }

    public final String toString() {
        return nn.d.o(new StringBuilder("ShowErrorMessage(message="), this.f34484a, ")");
    }
}
