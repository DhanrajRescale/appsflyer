package sb;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class e extends m {

    /* renamed from: a, reason: collision with root package name */
    public final String f34465a;

    public e(String groupId) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        this.f34465a = groupId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && Intrinsics.a(this.f34465a, ((e) obj).f34465a);
    }

    public final int hashCode() {
        return this.f34465a.hashCode();
    }

    public final String toString() {
        return nn.d.o(new StringBuilder("GroupJoined(groupId="), this.f34465a, ")");
    }
}
