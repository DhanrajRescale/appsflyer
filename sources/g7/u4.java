package g7;

/* loaded from: classes.dex */
public final class u4 extends w4 {

    /* renamed from: e, reason: collision with root package name */
    public final int f17091e;

    /* renamed from: f, reason: collision with root package name */
    public final int f17092f;

    public u4(int i10, int i11, int i12, int i13, int i14, int i15) {
        super(i12, i13, i14, i15);
        this.f17091e = i10;
        this.f17092f = i11;
    }

    @Override // g7.w4
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u4)) {
            return false;
        }
        u4 u4Var = (u4) obj;
        if (this.f17091e == u4Var.f17091e && this.f17092f == u4Var.f17092f) {
            if (this.f17112a == u4Var.f17112a) {
                if (this.f17113b == u4Var.f17113b) {
                    if (this.f17114c == u4Var.f17114c) {
                        if (this.f17115d == u4Var.f17115d) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // g7.w4
    public final int hashCode() {
        return Integer.hashCode(this.f17092f) + Integer.hashCode(this.f17091e) + super.hashCode();
    }

    public final String toString() {
        return kotlin.text.l.c("ViewportHint.Access(\n            |    pageOffset=" + this.f17091e + ",\n            |    indexInPage=" + this.f17092f + ",\n            |    presentedItemsBefore=" + this.f17112a + ",\n            |    presentedItemsAfter=" + this.f17113b + ",\n            |    originalPageOffsetFirst=" + this.f17114c + ",\n            |    originalPageOffsetLast=" + this.f17115d + ",\n            |)");
    }
}
