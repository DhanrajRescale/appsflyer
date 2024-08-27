package su;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class h extends i {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f34816a;

    public h(Throwable th2) {
        this.f34816a = th2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            if (Intrinsics.a(this.f34816a, ((h) obj).f34816a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Throwable th2 = this.f34816a;
        if (th2 != null) {
            return th2.hashCode();
        }
        return 0;
    }

    @Override // su.i
    public final String toString() {
        return "Closed(" + this.f34816a + ')';
    }
}
