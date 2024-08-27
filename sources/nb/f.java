package nb;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class f extends h {

    /* renamed from: a, reason: collision with root package name */
    public final String f28577a;

    /* renamed from: b, reason: collision with root package name */
    public final String f28578b;

    public f(String feedType, String str) {
        Intrinsics.checkNotNullParameter(feedType, "feedType");
        this.f28577a = feedType;
        this.f28578b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Intrinsics.a(this.f28577a, fVar.f28577a) && Intrinsics.a(this.f28578b, fVar.f28578b);
    }

    public final int hashCode() {
        int hashCode = this.f28577a.hashCode() * 31;
        String str = this.f28578b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ShowFeedStream(feedType=");
        sb2.append(this.f28577a);
        sb2.append(", entityId=");
        return nn.d.o(sb2, this.f28578b, ")");
    }
}
