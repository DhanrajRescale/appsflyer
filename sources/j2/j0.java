package j2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class j0 extends h0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f20729a;

    public j0(String str) {
        this.f20729a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        if (Intrinsics.a(this.f20729a, ((j0) obj).f20729a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f20729a.hashCode();
    }

    public final String toString() {
        return nn.d.n(new StringBuilder("VerbatimTtsAnnotation(verbatim="), this.f20729a, ')');
    }
}
