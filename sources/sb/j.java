package sb;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class j extends m {

    /* renamed from: a, reason: collision with root package name */
    public final String f34498a;

    public j(String shareTemplate) {
        Intrinsics.checkNotNullParameter(shareTemplate, "shareTemplate");
        this.f34498a = shareTemplate;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && Intrinsics.a(this.f34498a, ((j) obj).f34498a);
    }

    public final int hashCode() {
        return this.f34498a.hashCode();
    }

    public final String toString() {
        return nn.d.o(new StringBuilder("ShowShareFilter(shareTemplate="), this.f34498a, ")");
    }
}
