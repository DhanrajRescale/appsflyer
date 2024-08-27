package m0;

import ut.t;

/* loaded from: classes.dex */
public final class f1 {

    /* renamed from: a, reason: collision with root package name */
    public final long f26147a;

    /* renamed from: b, reason: collision with root package name */
    public final long f26148b;

    /* renamed from: c, reason: collision with root package name */
    public final long f26149c;

    /* renamed from: d, reason: collision with root package name */
    public final long f26150d;

    public f1(long j10, long j11, long j12, long j13) {
        this.f26147a = j10;
        this.f26148b = j11;
        this.f26149c = j12;
        this.f26150d = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f1.class != obj.getClass()) {
            return false;
        }
        f1 f1Var = (f1) obj;
        if (n1.t.d(this.f26147a, f1Var.f26147a) && n1.t.d(this.f26148b, f1Var.f26148b) && n1.t.d(this.f26149c, f1Var.f26149c) && n1.t.d(this.f26150d, f1Var.f26150d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10 = n1.t.f28178j;
        t.Companion companion = ut.t.INSTANCE;
        return Long.hashCode(this.f26150d) + v.e.c(this.f26149c, v.e.c(this.f26148b, Long.hashCode(this.f26147a) * 31, 31), 31);
    }
}
