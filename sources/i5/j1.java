package i5;

/* loaded from: classes.dex */
public final class j1 {

    /* renamed from: c, reason: collision with root package name */
    public static final j1 f19524c;

    /* renamed from: a, reason: collision with root package name */
    public final long f19525a;

    /* renamed from: b, reason: collision with root package name */
    public final long f19526b;

    static {
        j1 j1Var = new j1(0L, 0L);
        new j1(Long.MAX_VALUE, Long.MAX_VALUE);
        new j1(Long.MAX_VALUE, 0L);
        new j1(0L, Long.MAX_VALUE);
        f19524c = j1Var;
    }

    public j1(long j10, long j11) {
        boolean z10;
        if (j10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        yk.j.E0(z10);
        yk.j.E0(j11 >= 0);
        this.f19525a = j10;
        this.f19526b = j11;
    }

    public final long a(long j10, long j11, long j12) {
        boolean z10;
        long j13 = this.f19525a;
        long j14 = this.f19526b;
        if (j13 == 0 && j14 == 0) {
            return j10;
        }
        int i10 = e5.x.f15050a;
        long j15 = j10 - j13;
        if (((j13 ^ j10) & (j10 ^ j15)) < 0) {
            j15 = Long.MIN_VALUE;
        }
        long j16 = j10 + j14;
        if (((j14 ^ j16) & (j10 ^ j16)) < 0) {
            j16 = Long.MAX_VALUE;
        }
        boolean z11 = false;
        if (j15 <= j11 && j11 <= j16) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (j15 <= j12 && j12 <= j16) {
            z11 = true;
        }
        if (z10 && z11) {
            if (Math.abs(j11 - j10) <= Math.abs(j12 - j10)) {
                return j11;
            }
            return j12;
        }
        if (z10) {
            return j11;
        }
        if (z11) {
            return j12;
        }
        return j15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j1.class != obj.getClass()) {
            return false;
        }
        j1 j1Var = (j1) obj;
        if (this.f19525a == j1Var.f19525a && this.f19526b == j1Var.f19526b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f19525a) * 31) + ((int) this.f19526b);
    }
}
