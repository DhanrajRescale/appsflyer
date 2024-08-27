package k0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final j2.e f21853a;

    /* renamed from: b, reason: collision with root package name */
    public j2.e f21854b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f21855c = false;

    /* renamed from: d, reason: collision with root package name */
    public d f21856d = null;

    public f(j2.e eVar, j2.e eVar2) {
        this.f21853a = eVar;
        this.f21854b = eVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Intrinsics.a(this.f21853a, fVar.f21853a) && Intrinsics.a(this.f21854b, fVar.f21854b) && this.f21855c == fVar.f21855c && Intrinsics.a(this.f21856d, fVar.f21856d);
    }

    public final int hashCode() {
        int hashCode;
        int d10 = v.e.d(this.f21855c, (this.f21854b.hashCode() + (this.f21853a.hashCode() * 31)) * 31, 31);
        d dVar = this.f21856d;
        if (dVar == null) {
            hashCode = 0;
        } else {
            hashCode = dVar.hashCode();
        }
        return d10 + hashCode;
    }

    public final String toString() {
        return "TextSubstitutionValue(original=" + ((Object) this.f21853a) + ", substitution=" + ((Object) this.f21854b) + ", isShowingSubstitution=" + this.f21855c + ", layoutCache=" + this.f21856d + ')';
    }
}
