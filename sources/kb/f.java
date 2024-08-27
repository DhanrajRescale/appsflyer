package kb;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class f extends yk.g {

    /* renamed from: b, reason: collision with root package name */
    public final int f23036b;

    /* renamed from: c, reason: collision with root package name */
    public final String f23037c;

    public f(int i10, String postId) {
        Intrinsics.checkNotNullParameter(postId, "postId");
        this.f23036b = i10;
        this.f23037c = postId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f23036b == fVar.f23036b && Intrinsics.a(this.f23037c, fVar.f23037c);
    }

    public final int hashCode() {
        return this.f23037c.hashCode() + (Integer.hashCode(this.f23036b) * 31);
    }

    public final String toString() {
        return "Initial(commentCount=" + this.f23036b + ", postId=" + this.f23037c + ")";
    }
}
