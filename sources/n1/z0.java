package n1;

import ut.t;

/* loaded from: classes.dex */
public final class z0 extends p {

    /* renamed from: a, reason: collision with root package name */
    public final long f28221a;

    public z0(long j10) {
        this.f28221a = j10;
    }

    @Override // n1.p
    public final void a(float f10, long j10, f fVar) {
        fVar.d(1.0f);
        long j11 = this.f28221a;
        if (f10 != 1.0f) {
            j11 = t.c(j11, t.e(j11) * f10);
        }
        fVar.f(j11);
        if (fVar.f28132c != null) {
            fVar.j(null);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z0)) {
            return false;
        }
        if (t.d(this.f28221a, ((z0) obj).f28221a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10 = t.f28178j;
        t.Companion companion = ut.t.INSTANCE;
        return Long.hashCode(this.f28221a);
    }

    public final String toString() {
        return "SolidColor(value=" + ((Object) t.j(this.f28221a)) + ')';
    }
}
