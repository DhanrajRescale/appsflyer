package sb;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class t extends yk.o {

    /* renamed from: d, reason: collision with root package name */
    public final String f34539d;

    public t(String groupId) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        this.f34539d = groupId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t) && Intrinsics.a(this.f34539d, ((t) obj).f34539d);
    }

    public final int hashCode() {
        return this.f34539d.hashCode();
    }

    public final String toString() {
        return nn.d.o(new StringBuilder("ShowJoinAndFollow(groupId="), this.f34539d, ")");
    }
}
