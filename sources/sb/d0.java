package sb;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class d0 extends yk.o {

    /* renamed from: d, reason: collision with root package name */
    public final String f34464d;

    public d0(String str) {
        this.f34464d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d0) && Intrinsics.a(this.f34464d, ((d0) obj).f34464d);
    }

    public final int hashCode() {
        String str = this.f34464d;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return nn.d.o(new StringBuilder("UpdateToolbarTitle(title="), this.f34464d, ")");
    }
}
