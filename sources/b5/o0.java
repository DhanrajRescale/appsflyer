package b5;

/* loaded from: classes.dex */
public class o0 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f3556a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3557b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3558c;

    /* renamed from: d, reason: collision with root package name */
    public final long f3559d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3560e;

    public o0(Object obj) {
        this(-1L, obj);
    }

    public final boolean a() {
        return this.f3557b != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj;
        if (this.f3556a.equals(o0Var.f3556a) && this.f3557b == o0Var.f3557b && this.f3558c == o0Var.f3558c && this.f3559d == o0Var.f3559d && this.f3560e == o0Var.f3560e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.f3556a.hashCode() + 527) * 31) + this.f3557b) * 31) + this.f3558c) * 31) + ((int) this.f3559d)) * 31) + this.f3560e;
    }

    public o0(long j10, Object obj) {
        this(-1, -1, -1, j10, obj);
    }

    public o0(o0 o0Var) {
        this.f3556a = o0Var.f3556a;
        this.f3557b = o0Var.f3557b;
        this.f3558c = o0Var.f3558c;
        this.f3559d = o0Var.f3559d;
        this.f3560e = o0Var.f3560e;
    }

    public o0(int i10, int i11, int i12, long j10, Object obj) {
        this.f3556a = obj;
        this.f3557b = i10;
        this.f3558c = i11;
        this.f3559d = j10;
        this.f3560e = i12;
    }
}
