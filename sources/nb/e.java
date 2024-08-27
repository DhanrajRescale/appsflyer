package nb;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class e extends h {

    /* renamed from: a, reason: collision with root package name */
    public final String f28576a;

    public e(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f28576a = message;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && Intrinsics.a(this.f28576a, ((e) obj).f28576a);
    }

    public final int hashCode() {
        return this.f28576a.hashCode();
    }

    public final String toString() {
        return nn.d.o(new StringBuilder("ShowErrorMessage(message="), this.f28576a, ")");
    }
}
