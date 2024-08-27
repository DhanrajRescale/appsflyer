package b5;

/* loaded from: classes.dex */
public final class x0 {

    /* renamed from: a, reason: collision with root package name */
    public final t f3678a;

    public x0(t tVar) {
        this.f3678a = tVar;
    }

    public final boolean a(int... iArr) {
        t tVar = this.f3678a;
        tVar.getClass();
        for (int i10 : iArr) {
            if (tVar.f3586a.get(i10)) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x0)) {
            return false;
        }
        return this.f3678a.equals(((x0) obj).f3678a);
    }

    public final int hashCode() {
        return this.f3678a.hashCode();
    }
}
