package j2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class j extends k {

    /* renamed from: a, reason: collision with root package name */
    public final String f20728a;

    public j(String str) {
        this.f20728a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        return Intrinsics.a(this.f20728a, ((j) obj).f20728a);
    }

    public final int hashCode() {
        return this.f20728a.hashCode();
    }

    public final String toString() {
        return nn.d.n(new StringBuilder("LinkAnnotation.Url(url="), this.f20728a, ')');
    }
}
