package e5;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: c, reason: collision with root package name */
    public static final q f15039c = new q(-1, -1);

    /* renamed from: a, reason: collision with root package name */
    public final int f15040a;

    /* renamed from: b, reason: collision with root package name */
    public final int f15041b;

    static {
        new q(0, 0);
    }

    public q(int i10, int i11) {
        boolean z10;
        if ((i10 != -1 && i10 < 0) || (i11 != -1 && i11 < 0)) {
            z10 = false;
        } else {
            z10 = true;
        }
        yk.j.E0(z10);
        this.f15040a = i10;
        this.f15041b = i11;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        if (this.f15040a != qVar.f15040a || this.f15041b != qVar.f15041b) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i10 = this.f15040a;
        return ((i10 >>> 16) | (i10 << 16)) ^ this.f15041b;
    }

    public final String toString() {
        return this.f15040a + "x" + this.f15041b;
    }
}
