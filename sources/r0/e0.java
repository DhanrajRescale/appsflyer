package r0;

import ut.t;

/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f32379a;

    /* renamed from: b, reason: collision with root package name */
    public final long f32380b;

    /* renamed from: c, reason: collision with root package name */
    public final long f32381c;

    /* renamed from: d, reason: collision with root package name */
    public final long f32382d;

    public e0(long j10, long j11, long j12, long j13) {
        this.f32379a = j10;
        this.f32380b = j11;
        this.f32381c = j12;
        this.f32382d = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        if (n1.t.d(this.f32379a, e0Var.f32379a) && n1.t.d(this.f32380b, e0Var.f32380b) && n1.t.d(this.f32381c, e0Var.f32381c) && n1.t.d(this.f32382d, e0Var.f32382d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10 = n1.t.f28178j;
        t.Companion companion = ut.t.INSTANCE;
        return Long.hashCode(this.f32382d) + v.e.c(this.f32381c, v.e.c(this.f32380b, Long.hashCode(this.f32379a) * 31, 31), 31);
    }
}
