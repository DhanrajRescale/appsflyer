package ij;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f20086a;

    /* renamed from: b, reason: collision with root package name */
    public final int f20087b;

    public /* synthetic */ p() {
        this(-1, true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.f20086a == pVar.f20086a && this.f20087b == pVar.f20087b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f20087b) + (Boolean.hashCode(this.f20086a) * 31);
    }

    public final String toString() {
        return "ValidationResult(isValid=" + this.f20086a + ", errorReason=" + this.f20087b + ")";
    }

    public p(int i10, boolean z10) {
        this.f20086a = z10;
        this.f20087b = i10;
    }
}
