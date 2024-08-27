package kb;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class e extends yk.g {

    /* renamed from: b, reason: collision with root package name */
    public final String f23035b;

    public e(String commentId) {
        Intrinsics.checkNotNullParameter(commentId, "commentId");
        this.f23035b = commentId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && Intrinsics.a(this.f23035b, ((e) obj).f23035b);
    }

    public final int hashCode() {
        return this.f23035b.hashCode();
    }

    public final String toString() {
        return nn.d.o(new StringBuilder("DeleteComment(commentId="), this.f23035b, ")");
    }
}
