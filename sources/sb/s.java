package sb;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class s extends yk.o {

    /* renamed from: d, reason: collision with root package name */
    public final String f34538d;

    public s(String str) {
        this.f34538d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s) && Intrinsics.a(this.f34538d, ((s) obj).f34538d);
    }

    public final int hashCode() {
        String str = this.f34538d;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return nn.d.o(new StringBuilder("ShowErrorMessage(errorMessage="), this.f34538d, ")");
    }
}
