package u2;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: c, reason: collision with root package name */
    public static final p f36695c = new p(yk.j.e1(0), yk.j.e1(0));

    /* renamed from: a, reason: collision with root package name */
    public final long f36696a;

    /* renamed from: b, reason: collision with root package name */
    public final long f36697b;

    public p(long j10, long j11) {
        this.f36696a = j10;
        this.f36697b = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        if (w2.m.a(this.f36696a, pVar.f36696a) && w2.m.a(this.f36697b, pVar.f36697b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        w2.n[] nVarArr = w2.m.f38803b;
        return Long.hashCode(this.f36697b) + (Long.hashCode(this.f36696a) * 31);
    }

    public final String toString() {
        return "TextIndent(firstLine=" + ((Object) w2.m.d(this.f36696a)) + ", restLine=" + ((Object) w2.m.d(this.f36697b)) + ')';
    }
}
