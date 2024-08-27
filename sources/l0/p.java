package l0;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final u2.h f23800a;

    /* renamed from: b, reason: collision with root package name */
    public final int f23801b;

    /* renamed from: c, reason: collision with root package name */
    public final long f23802c;

    public p(u2.h hVar, int i10, long j10) {
        this.f23800a = hVar;
        this.f23801b = i10;
        this.f23802c = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.f23800a == pVar.f23800a && this.f23801b == pVar.f23801b && this.f23802c == pVar.f23802c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f23802c) + da.e.f(this.f23801b, this.f23800a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "AnchorInfo(direction=" + this.f23800a + ", offset=" + this.f23801b + ", selectableId=" + this.f23802c + ')';
    }
}
