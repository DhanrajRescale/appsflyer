package sb;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class g extends m {

    /* renamed from: a, reason: collision with root package name */
    public final String f34476a;

    public g(String postId) {
        Intrinsics.checkNotNullParameter(postId, "postId");
        this.f34476a = postId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && Intrinsics.a(this.f34476a, ((g) obj).f34476a);
    }

    public final int hashCode() {
        return this.f34476a.hashCode();
    }

    public final String toString() {
        return nn.d.o(new StringBuilder("PostRemovedFromSaved(postId="), this.f34476a, ")");
    }
}
