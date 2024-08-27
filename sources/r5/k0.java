package r5;

/* loaded from: classes.dex */
public final class k0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f33204a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f33205b;

    public k0(int i10, boolean z10) {
        this.f33204a = i10;
        this.f33205b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k0.class != obj.getClass()) {
            return false;
        }
        k0 k0Var = (k0) obj;
        if (this.f33204a == k0Var.f33204a && this.f33205b == k0Var.f33205b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f33204a * 31) + (this.f33205b ? 1 : 0);
    }
}
