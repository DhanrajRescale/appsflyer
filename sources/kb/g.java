package kb;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class g extends yk.g {

    /* renamed from: b, reason: collision with root package name */
    public final String f23038b;

    public g(String commentId) {
        Intrinsics.checkNotNullParameter(commentId, "commentId");
        this.f23038b = commentId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && Intrinsics.a(this.f23038b, ((g) obj).f23038b);
    }

    public final int hashCode() {
        return this.f23038b.hashCode();
    }

    public final String toString() {
        return nn.d.o(new StringBuilder("LikeComment(commentId="), this.f23038b, ")");
    }
}
