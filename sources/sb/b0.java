package sb;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b0 extends yk.o {

    /* renamed from: d, reason: collision with root package name */
    public final hb.u f34436d;

    public b0(hb.u feedElement) {
        Intrinsics.checkNotNullParameter(feedElement, "feedElement");
        this.f34436d = feedElement;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b0) && Intrinsics.a(this.f34436d, ((b0) obj).f34436d);
    }

    public final int hashCode() {
        return this.f34436d.f18230a.hashCode();
    }

    public final String toString() {
        return "UpdateItem(feedElement=" + this.f34436d + ")";
    }
}
