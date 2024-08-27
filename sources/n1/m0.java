package n1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class m0 extends o0 {

    /* renamed from: a, reason: collision with root package name */
    public final m1.d f28155a;

    public m0(m1.d dVar) {
        this.f28155a = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0)) {
            return false;
        }
        if (Intrinsics.a(this.f28155a, ((m0) obj).f28155a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f28155a.hashCode();
    }
}
