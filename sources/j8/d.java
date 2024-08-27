package j8;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f21055a;

    /* renamed from: b, reason: collision with root package name */
    public final Long f21056b;

    public d(String str, long j10) {
        this.f21055a = str;
        this.f21056b = Long.valueOf(j10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (!this.f21055a.equals(dVar.f21055a)) {
            return false;
        }
        Long l10 = dVar.f21056b;
        Long l11 = this.f21056b;
        if (l11 != null) {
            return l11.equals(l10);
        }
        if (l10 == null) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f21055a.hashCode() * 31;
        Long l10 = this.f21056b;
        if (l10 != null) {
            i10 = l10.hashCode();
        } else {
            i10 = 0;
        }
        return hashCode + i10;
    }
}
