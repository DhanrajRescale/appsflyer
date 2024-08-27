package z9;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class g extends i {

    /* renamed from: a, reason: collision with root package name */
    public final String f42203a;

    public g(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f42203a = value;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && Intrinsics.a(this.f42203a, ((g) obj).f42203a);
    }

    public final int hashCode() {
        return this.f42203a.hashCode();
    }

    public final String toString() {
        return nn.d.o(new StringBuilder("DynamicString(value="), this.f42203a, ")");
    }
}
