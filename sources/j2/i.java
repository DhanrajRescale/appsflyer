package j2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class i extends k {

    /* renamed from: a, reason: collision with root package name */
    public final String f20726a;

    public i(String str) {
        this.f20726a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        return Intrinsics.a(this.f20726a, ((i) obj).f20726a);
    }

    public final int hashCode() {
        return this.f20726a.hashCode();
    }

    public final String toString() {
        return nn.d.n(new StringBuilder("LinkAnnotation.Clickable(tag="), this.f20726a, ')');
    }
}
