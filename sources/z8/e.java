package z8;

import kotlin.jvm.internal.Intrinsics;
import n8.l;

/* loaded from: classes.dex */
public final class e implements h {

    /* renamed from: b, reason: collision with root package name */
    public final g f42182b = g.f42186c;

    @Override // z8.h
    public final Object d(l lVar) {
        return this.f42182b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            if (Intrinsics.a(this.f42182b, ((e) obj).f42182b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f42182b.hashCode();
    }
}
