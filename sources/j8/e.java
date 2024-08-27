package j8;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f21057a;

    /* renamed from: b, reason: collision with root package name */
    public final int f21058b;

    public e(String str, int i10) {
        this.f21057a = str;
        this.f21058b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f21058b != eVar.f21058b) {
            return false;
        }
        return this.f21057a.equals(eVar.f21057a);
    }

    public final int hashCode() {
        return (this.f21057a.hashCode() * 31) + this.f21058b;
    }
}
