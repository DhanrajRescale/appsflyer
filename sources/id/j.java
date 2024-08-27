package id;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class j extends zq.f {

    /* renamed from: e, reason: collision with root package name */
    public final List f19863e;

    public j(List chats) {
        Intrinsics.checkNotNullParameter(chats, "chats");
        this.f19863e = chats;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && Intrinsics.a(this.f19863e, ((j) obj).f19863e);
    }

    public final int hashCode() {
        return this.f19863e.hashCode();
    }

    public final String toString() {
        return a3.a.l(new StringBuilder("Data(chats="), this.f19863e, ")");
    }
}
