package r0;

import ut.t;

/* loaded from: classes.dex */
public final class z0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f32824a;

    /* renamed from: b, reason: collision with root package name */
    public final long f32825b;

    /* renamed from: c, reason: collision with root package name */
    public final long f32826c;

    /* renamed from: d, reason: collision with root package name */
    public final long f32827d;

    public z0(long j10, long j11, long j12, long j13) {
        this.f32824a = j10;
        this.f32825b = j11;
        this.f32826c = j12;
        this.f32827d = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof z0)) {
            return false;
        }
        z0 z0Var = (z0) obj;
        if (n1.t.d(this.f32824a, z0Var.f32824a) && n1.t.d(this.f32825b, z0Var.f32825b) && n1.t.d(this.f32826c, z0Var.f32826c) && n1.t.d(this.f32827d, z0Var.f32827d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10 = n1.t.f28178j;
        t.Companion companion = ut.t.INSTANCE;
        return Long.hashCode(this.f32827d) + v.e.c(this.f32826c, v.e.c(this.f32825b, Long.hashCode(this.f32824a) * 31, 31), 31);
    }
}
