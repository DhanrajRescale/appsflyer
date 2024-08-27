package zi;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final String f42522a;

    /* renamed from: b, reason: collision with root package name */
    public final String f42523b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f42524c;

    public r(String title, String id2, boolean z10) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(id2, "id");
        this.f42522a = title;
        this.f42523b = id2;
        this.f42524c = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return Intrinsics.a(this.f42522a, rVar.f42522a) && Intrinsics.a(this.f42523b, rVar.f42523b) && this.f42524c == rVar.f42524c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f42524c) + jr.h.g(this.f42523b, this.f42522a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StockIntervalConfig(title=");
        sb2.append(this.f42522a);
        sb2.append(", id=");
        sb2.append(this.f42523b);
        sb2.append(", isDefault=");
        return da.e.o(sb2, this.f42524c, ")");
    }
}
