package bq;

/* loaded from: classes2.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final p f7258a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f7259b;

    public i(p pVar, boolean z10) {
        this.f7258a = pVar;
        this.f7259b = z10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (!iVar.f7258a.equals(this.f7258a) || iVar.f7259b != this.f7259b) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f7258a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f7259b).hashCode();
    }
}
