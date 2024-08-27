package t0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class m2 {

    /* renamed from: a, reason: collision with root package name */
    public final n f35084a;

    public /* synthetic */ m2(n nVar) {
        this.f35084a = nVar;
    }

    public static final /* synthetic */ m2 a(n nVar) {
        return new m2(nVar);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof m2)) {
            return false;
        }
        if (!Intrinsics.a(this.f35084a, ((m2) obj).f35084a)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f35084a.hashCode();
    }

    public final String toString() {
        return "SkippableUpdater(composer=" + this.f35084a + ')';
    }
}
