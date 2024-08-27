package sb;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class y extends yk.o {

    /* renamed from: d, reason: collision with root package name */
    public final String f34544d;

    public y(String inviteTemplate) {
        Intrinsics.checkNotNullParameter(inviteTemplate, "inviteTemplate");
        this.f34544d = inviteTemplate;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y) && Intrinsics.a(this.f34544d, ((y) obj).f34544d);
    }

    public final int hashCode() {
        return this.f34544d.hashCode();
    }

    public final String toString() {
        return nn.d.o(new StringBuilder("ShowShareFilter(inviteTemplate="), this.f34544d, ")");
    }
}
