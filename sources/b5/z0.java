package b5;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class z0 implements k {

    /* renamed from: a, reason: collision with root package name */
    public final Object f3696a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3697b;

    /* renamed from: c, reason: collision with root package name */
    public final k0 f3698c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f3699d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3700e;

    /* renamed from: f, reason: collision with root package name */
    public final long f3701f;

    /* renamed from: g, reason: collision with root package name */
    public final long f3702g;

    /* renamed from: h, reason: collision with root package name */
    public final int f3703h;

    /* renamed from: i, reason: collision with root package name */
    public final int f3704i;

    static {
        int i10 = e5.x.f15050a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
    }

    public z0(Object obj, int i10, k0 k0Var, Object obj2, int i11, long j10, long j11, int i12, int i13) {
        this.f3696a = obj;
        this.f3697b = i10;
        this.f3698c = k0Var;
        this.f3699d = obj2;
        this.f3700e = i11;
        this.f3701f = j10;
        this.f3702g = j11;
        this.f3703h = i12;
        this.f3704i = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || z0.class != obj.getClass()) {
            return false;
        }
        z0 z0Var = (z0) obj;
        if (this.f3697b == z0Var.f3697b && this.f3700e == z0Var.f3700e && this.f3701f == z0Var.f3701f && this.f3702g == z0Var.f3702g && this.f3703h == z0Var.f3703h && this.f3704i == z0Var.f3704i && pn.e.g(this.f3696a, z0Var.f3696a) && pn.e.g(this.f3699d, z0Var.f3699d) && pn.e.g(this.f3698c, z0Var.f3698c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f3696a, Integer.valueOf(this.f3697b), this.f3698c, this.f3699d, Integer.valueOf(this.f3700e), Long.valueOf(this.f3701f), Long.valueOf(this.f3702g), Integer.valueOf(this.f3703h), Integer.valueOf(this.f3704i)});
    }
}
