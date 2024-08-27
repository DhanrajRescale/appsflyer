package sb;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class q extends yk.o {

    /* renamed from: d, reason: collision with root package name */
    public final hb.u f34536d;

    public q(hb.u feedStreamElement) {
        Intrinsics.checkNotNullParameter(feedStreamElement, "feedStreamElement");
        this.f34536d = feedStreamElement;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q) && Intrinsics.a(this.f34536d, ((q) obj).f34536d);
    }

    public final int hashCode() {
        return this.f34536d.f18230a.hashCode();
    }

    public final String toString() {
        return "RemoveSavedPost(feedStreamElement=" + this.f34536d + ")";
    }
}
