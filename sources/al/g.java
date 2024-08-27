package al;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final n f645a;

    /* renamed from: b, reason: collision with root package name */
    public final o f646b;

    public g(n section, o oVar) {
        Intrinsics.checkNotNullParameter(section, "section");
        this.f645a = section;
        this.f646b = oVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f645a == gVar.f645a && this.f646b == gVar.f646b;
    }

    public final int hashCode() {
        int hashCode = this.f645a.hashCode() * 31;
        o oVar = this.f646b;
        return hashCode + (oVar == null ? 0 : oVar.hashCode());
    }

    public final String toString() {
        return "SectionFieldMapping(section=" + this.f645a + ", field=" + this.f646b + ')';
    }
}
