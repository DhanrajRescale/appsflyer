package k0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final String f21872a;

    /* renamed from: b, reason: collision with root package name */
    public String f21873b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f21874c = false;

    /* renamed from: d, reason: collision with root package name */
    public e f21875d = null;

    public i(String str, String str2) {
        this.f21872a = str;
        this.f21873b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return Intrinsics.a(this.f21872a, iVar.f21872a) && Intrinsics.a(this.f21873b, iVar.f21873b) && this.f21874c == iVar.f21874c && Intrinsics.a(this.f21875d, iVar.f21875d);
    }

    public final int hashCode() {
        int hashCode;
        int d10 = v.e.d(this.f21874c, jr.h.g(this.f21873b, this.f21872a.hashCode() * 31, 31), 31);
        e eVar = this.f21875d;
        if (eVar == null) {
            hashCode = 0;
        } else {
            hashCode = eVar.hashCode();
        }
        return d10 + hashCode;
    }

    public final String toString() {
        return "TextSubstitutionValue(original=" + this.f21872a + ", substitution=" + this.f21873b + ", isShowingSubstitution=" + this.f21874c + ", layoutCache=" + this.f21875d + ')';
    }
}
