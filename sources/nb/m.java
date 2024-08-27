package nb;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class m extends bl.j {

    /* renamed from: b, reason: collision with root package name */
    public final String f28585b;

    /* renamed from: c, reason: collision with root package name */
    public final String f28586c;

    public m(String feedType, String str) {
        Intrinsics.checkNotNullParameter(feedType, "feedType");
        this.f28585b = feedType;
        this.f28586c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return Intrinsics.a(this.f28585b, mVar.f28585b) && Intrinsics.a(this.f28586c, mVar.f28586c);
    }

    public final int hashCode() {
        int hashCode = this.f28585b.hashCode() * 31;
        String str = this.f28586c;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ShowFeedStream(feedType=");
        sb2.append(this.f28585b);
        sb2.append(", entityId=");
        return nn.d.o(sb2, this.f28586c, ")");
    }
}
