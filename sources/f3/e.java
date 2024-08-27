package f3;

/* loaded from: classes.dex */
public final class e extends c {

    /* renamed from: e, reason: collision with root package name */
    public float f15914e;

    public e(float f10) {
        super(null);
        this.f15914e = f10;
    }

    @Override // f3.c
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        float g10 = g();
        float g11 = ((e) obj).g();
        if ((Float.isNaN(g10) && Float.isNaN(g11)) || g10 == g11) {
            return true;
        }
        return false;
    }

    @Override // f3.c
    public final float g() {
        char[] cArr;
        if (Float.isNaN(this.f15914e) && (cArr = this.f15910a) != null && cArr.length >= 1) {
            this.f15914e = Float.parseFloat(e());
        }
        return this.f15914e;
    }

    @Override // f3.c
    public final int h() {
        char[] cArr;
        if (Float.isNaN(this.f15914e) && (cArr = this.f15910a) != null && cArr.length >= 1) {
            this.f15914e = Integer.parseInt(e());
        }
        return (int) this.f15914e;
    }

    @Override // f3.c
    public final int hashCode() {
        int i10;
        int hashCode = super.hashCode() * 31;
        float f10 = this.f15914e;
        if (f10 != s0.g.f34069a) {
            i10 = Float.floatToIntBits(f10);
        } else {
            i10 = 0;
        }
        return hashCode + i10;
    }
}
