package q2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final e f31578a;

    public c(a aVar) {
        this.f31578a = aVar;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof c)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return Intrinsics.a(((a) this.f31578a).f31574a.toLanguageTag(), ((a) ((c) obj).f31578a).f31574a.toLanguageTag());
    }

    public final int hashCode() {
        return ((a) this.f31578a).f31574a.toLanguageTag().hashCode();
    }

    public final String toString() {
        return ((a) this.f31578a).f31574a.toLanguageTag();
    }
}
