package nb;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class g extends h {

    /* renamed from: a, reason: collision with root package name */
    public final String f28579a;

    /* renamed from: b, reason: collision with root package name */
    public final String f28580b;

    /* renamed from: c, reason: collision with root package name */
    public final String f28581c;

    public g(String postId, String groupId, String feedType) {
        Intrinsics.checkNotNullParameter(postId, "postId");
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(feedType, "feedType");
        this.f28579a = postId;
        this.f28580b = groupId;
        this.f28581c = feedType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Intrinsics.a(this.f28579a, gVar.f28579a) && Intrinsics.a(this.f28580b, gVar.f28580b) && Intrinsics.a(this.f28581c, gVar.f28581c);
    }

    public final int hashCode() {
        return this.f28581c.hashCode() + jr.h.g(this.f28580b, this.f28579a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ShowPostDetails(postId=");
        sb2.append(this.f28579a);
        sb2.append(", groupId=");
        sb2.append(this.f28580b);
        sb2.append(", feedType=");
        return nn.d.o(sb2, this.f28581c, ")");
    }
}
