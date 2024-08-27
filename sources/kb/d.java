package kb;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class d extends yk.g {

    /* renamed from: b, reason: collision with root package name */
    public final List f23034b;

    public d(List comments) {
        Intrinsics.checkNotNullParameter(comments, "comments");
        this.f23034b = comments;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && Intrinsics.a(this.f23034b, ((d) obj).f23034b);
    }

    public final int hashCode() {
        return this.f23034b.hashCode();
    }

    public final String toString() {
        return a3.a.l(new StringBuilder("Data(comments="), this.f23034b, ")");
    }
}
