package j2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f20727a;

    public i0(String str) {
        this.f20727a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return false;
        }
        if (Intrinsics.a(this.f20727a, ((i0) obj).f20727a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f20727a.hashCode();
    }

    public final String toString() {
        return nn.d.n(new StringBuilder("UrlAnnotation(url="), this.f20727a, ')');
    }
}
