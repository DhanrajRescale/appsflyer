package m0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class f3 {

    /* renamed from: a, reason: collision with root package name */
    public final hu.c f26164a;

    public f3(b1.c cVar) {
        this.f26164a = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f3)) {
            return false;
        }
        f3 f3Var = (f3) obj;
        f3Var.getClass();
        return Intrinsics.a(null, null) && Intrinsics.a(this.f26164a, f3Var.f26164a);
    }

    public final int hashCode() {
        return this.f26164a.hashCode();
    }

    public final String toString() {
        return "FadeInFadeOutAnimationItem(key=null, transition=" + this.f26164a + ')';
    }
}
