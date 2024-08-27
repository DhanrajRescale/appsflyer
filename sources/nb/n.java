package nb;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class n extends bl.j {

    /* renamed from: b, reason: collision with root package name */
    public final String f28587b;

    /* renamed from: c, reason: collision with root package name */
    public final String f28588c;

    public n(String postId, String groupId) {
        Intrinsics.checkNotNullParameter(postId, "postId");
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter("FEED_STREAM_POST_DETAILS", "feedType");
        this.f28587b = postId;
        this.f28588c = groupId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return Intrinsics.a(this.f28587b, nVar.f28587b) && Intrinsics.a(this.f28588c, nVar.f28588c) && Intrinsics.a("FEED_STREAM_POST_DETAILS", "FEED_STREAM_POST_DETAILS");
    }

    public final int hashCode() {
        return ((this.f28588c.hashCode() + (this.f28587b.hashCode() * 31)) * 31) - 738829375;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ShowPostDetails(postId=");
        sb2.append(this.f28587b);
        sb2.append(", groupId=");
        return nn.d.o(sb2, this.f28588c, ", feedType=FEED_STREAM_POST_DETAILS)");
    }
}
