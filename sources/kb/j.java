package kb;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class j extends yk.g {

    /* renamed from: b, reason: collision with root package name */
    public final String f23041b;

    public j(String str) {
        this.f23041b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && Intrinsics.a(this.f23041b, ((j) obj).f23041b);
    }

    public final int hashCode() {
        String str = this.f23041b;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return nn.d.o(new StringBuilder("ShowErrorMessage(errorMessage="), this.f23041b, ")");
    }
}
