package m0;

import ut.t;

/* loaded from: classes.dex */
public final class r1 {

    /* renamed from: a, reason: collision with root package name */
    public final long f26712a;

    /* renamed from: b, reason: collision with root package name */
    public final long f26713b;

    /* renamed from: c, reason: collision with root package name */
    public final long f26714c;

    /* renamed from: d, reason: collision with root package name */
    public final long f26715d;

    /* renamed from: e, reason: collision with root package name */
    public final long f26716e;

    /* renamed from: f, reason: collision with root package name */
    public final long f26717f;

    /* renamed from: g, reason: collision with root package name */
    public final long f26718g;

    /* renamed from: h, reason: collision with root package name */
    public final long f26719h;

    public r1(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17) {
        this.f26712a = j10;
        this.f26713b = j11;
        this.f26714c = j12;
        this.f26715d = j13;
        this.f26716e = j14;
        this.f26717f = j15;
        this.f26718g = j16;
        this.f26719h = j17;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r1.class != obj.getClass()) {
            return false;
        }
        r1 r1Var = (r1) obj;
        if (n1.t.d(this.f26712a, r1Var.f26712a) && n1.t.d(this.f26713b, r1Var.f26713b) && n1.t.d(this.f26714c, r1Var.f26714c) && n1.t.d(this.f26715d, r1Var.f26715d) && n1.t.d(this.f26716e, r1Var.f26716e) && n1.t.d(this.f26717f, r1Var.f26717f) && n1.t.d(this.f26718g, r1Var.f26718g) && n1.t.d(this.f26719h, r1Var.f26719h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10 = n1.t.f28178j;
        t.Companion companion = ut.t.INSTANCE;
        return Long.hashCode(this.f26719h) + v.e.c(this.f26718g, v.e.c(this.f26717f, v.e.c(this.f26716e, v.e.c(this.f26715d, v.e.c(this.f26714c, v.e.c(this.f26713b, Long.hashCode(this.f26712a) * 31, 31), 31), 31), 31), 31), 31);
    }
}
