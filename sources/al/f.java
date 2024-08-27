package al;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final n f643a;

    /* renamed from: b, reason: collision with root package name */
    public final l f644b;

    public f(n nVar, l field) {
        Intrinsics.checkNotNullParameter(field, "field");
        this.f643a = nVar;
        this.f644b = field;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f643a == fVar.f643a && this.f644b == fVar.f644b;
    }

    public final int hashCode() {
        n nVar = this.f643a;
        return this.f644b.hashCode() + ((nVar == null ? 0 : nVar.hashCode()) * 31);
    }

    public final String toString() {
        return "SectionCustomEventFieldMapping(section=" + this.f643a + ", field=" + this.f644b + ')';
    }
}
