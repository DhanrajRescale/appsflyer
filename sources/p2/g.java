package p2;

/* loaded from: classes.dex */
public final class g implements i {

    /* renamed from: a, reason: collision with root package name */
    public final int f30557a;

    /* renamed from: b, reason: collision with root package name */
    public final int f30558b;

    public g(int i10, int i11) {
        this.f30557a = i10;
        this.f30558b = i11;
        if (i10 >= 0 && i11 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i10 + " and " + i11 + " respectively.").toString());
    }

    @Override // p2.i
    public final void a(k kVar) {
        int i10 = kVar.f30584c;
        int i11 = this.f30558b;
        int i12 = i10 + i11;
        int i13 = (i10 ^ i12) & (i11 ^ i12);
        w wVar = kVar.f30582a;
        if (i13 < 0) {
            i12 = wVar.a();
        }
        kVar.a(kVar.f30584c, Math.min(i12, wVar.a()));
        int i14 = kVar.f30583b;
        int i15 = this.f30557a;
        int i16 = i14 - i15;
        if (((i14 ^ i16) & (i15 ^ i14)) < 0) {
            i16 = 0;
        }
        kVar.a(Math.max(0, i16), kVar.f30583b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (this.f30557a == gVar.f30557a && this.f30558b == gVar.f30558b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f30557a * 31) + this.f30558b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DeleteSurroundingTextCommand(lengthBeforeCursor=");
        sb2.append(this.f30557a);
        sb2.append(", lengthAfterCursor=");
        return a3.a.i(sb2, this.f30558b, ')');
    }
}
