package g7;

/* loaded from: classes.dex */
public final class i3 extends kp.j {

    /* renamed from: e, reason: collision with root package name */
    public final int f16832e;

    /* renamed from: f, reason: collision with root package name */
    public final int f16833f;

    /* renamed from: g, reason: collision with root package name */
    public final int f16834g;

    public i3(int i10, int i11, int i12) {
        this.f16832e = i10;
        this.f16833f = i11;
        this.f16834g = i12;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i3) {
            i3 i3Var = (i3) obj;
            if (this.f16832e == i3Var.f16832e && this.f16833f == i3Var.f16833f && this.f16834g == i3Var.f16834g) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f16834g) + Integer.hashCode(this.f16833f) + Integer.hashCode(this.f16832e);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PagingDataEvent.DropPrepend dropped ");
        int i10 = this.f16832e;
        jr.h.v(sb2, i10, " items (\n                    |   dropCount: ", i10, "\n                    |   newPlaceholdersBefore: ");
        sb2.append(this.f16833f);
        sb2.append("\n                    |   oldPlaceholdersBefore: ");
        sb2.append(this.f16834g);
        sb2.append("\n                    |)\n                    |");
        return kotlin.text.l.c(sb2.toString());
    }
}
