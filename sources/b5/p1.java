package b5;

/* loaded from: classes.dex */
public final class p1 implements k {

    /* renamed from: e, reason: collision with root package name */
    public static final p1 f3567e = new p1(1.0f, 0, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f3568a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3569b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3570c;

    /* renamed from: d, reason: collision with root package name */
    public final float f3571d;

    static {
        int i10 = e5.x.f15050a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
    }

    public p1(float f10, int i10, int i11, int i12) {
        this.f3568a = i10;
        this.f3569b = i11;
        this.f3570c = i12;
        this.f3571d = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p1)) {
            return false;
        }
        p1 p1Var = (p1) obj;
        if (this.f3568a == p1Var.f3568a && this.f3569b == p1Var.f3569b && this.f3570c == p1Var.f3570c && this.f3571d == p1Var.f3571d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f3571d) + ((((((217 + this.f3568a) * 31) + this.f3569b) * 31) + this.f3570c) * 31);
    }
}
