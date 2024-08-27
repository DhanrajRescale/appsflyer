package g7;

/* loaded from: classes.dex */
public final class h3 extends kp.j {

    /* renamed from: e, reason: collision with root package name */
    public final int f16811e;

    /* renamed from: f, reason: collision with root package name */
    public final int f16812f;

    /* renamed from: g, reason: collision with root package name */
    public final int f16813g;

    /* renamed from: h, reason: collision with root package name */
    public final int f16814h;

    public h3(int i10, int i11, int i12, int i13) {
        this.f16811e = i10;
        this.f16812f = i11;
        this.f16813g = i12;
        this.f16814h = i13;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h3) {
            h3 h3Var = (h3) obj;
            if (this.f16811e == h3Var.f16811e && this.f16812f == h3Var.f16812f && this.f16813g == h3Var.f16813g && this.f16814h == h3Var.f16814h) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f16814h) + Integer.hashCode(this.f16813g) + Integer.hashCode(this.f16812f) + Integer.hashCode(this.f16811e);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PagingDataEvent.DropAppend dropped ");
        int i10 = this.f16812f;
        sb2.append(i10);
        sb2.append(" items (\n                    |   startIndex: ");
        jr.h.v(sb2, this.f16811e, "\n                    |   dropCount: ", i10, "\n                    |   newPlaceholdersBefore: ");
        sb2.append(this.f16813g);
        sb2.append("\n                    |   oldPlaceholdersBefore: ");
        sb2.append(this.f16814h);
        sb2.append("\n                    |)\n                    |");
        return kotlin.text.l.c(sb2.toString());
    }
}
