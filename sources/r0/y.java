package r0;

import ut.t;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final long f32810a;

    /* renamed from: b, reason: collision with root package name */
    public final long f32811b;

    /* renamed from: c, reason: collision with root package name */
    public final long f32812c;

    /* renamed from: d, reason: collision with root package name */
    public final long f32813d;

    public y(long j10, long j11, long j12, long j13) {
        this.f32810a = j10;
        this.f32811b = j11;
        this.f32812c = j12;
        this.f32813d = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        if (n1.t.d(this.f32810a, yVar.f32810a) && n1.t.d(this.f32811b, yVar.f32811b) && n1.t.d(this.f32812c, yVar.f32812c) && n1.t.d(this.f32813d, yVar.f32813d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10 = n1.t.f28178j;
        t.Companion companion = ut.t.INSTANCE;
        return Long.hashCode(this.f32813d) + v.e.c(this.f32812c, v.e.c(this.f32811b, Long.hashCode(this.f32810a) * 31, 31), 31);
    }
}
