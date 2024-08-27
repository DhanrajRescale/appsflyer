package kb;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class i extends yk.g {

    /* renamed from: b, reason: collision with root package name */
    public final String f23040b;

    public i(String commentId) {
        Intrinsics.checkNotNullParameter(commentId, "commentId");
        this.f23040b = commentId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && Intrinsics.a(this.f23040b, ((i) obj).f23040b);
    }

    public final int hashCode() {
        return this.f23040b.hashCode();
    }

    public final String toString() {
        return nn.d.o(new StringBuilder("ReportComment(commentId="), this.f23040b, ")");
    }
}
