package p6;

import e5.x;
import z5.z;

/* loaded from: classes.dex */
public final class b implements f {

    /* renamed from: a, reason: collision with root package name */
    public final long f30683a;

    /* renamed from: b, reason: collision with root package name */
    public final eb.f f30684b;

    /* renamed from: c, reason: collision with root package name */
    public final eb.f f30685c;

    /* renamed from: d, reason: collision with root package name */
    public long f30686d;

    public b(long j10, long j11, long j12) {
        this.f30686d = j10;
        this.f30683a = j12;
        eb.f fVar = new eb.f(1);
        this.f30684b = fVar;
        eb.f fVar2 = new eb.f(1);
        this.f30685c = fVar2;
        fVar.h(0L);
        fVar2.h(j11);
    }

    @Override // p6.f
    public final long a() {
        return this.f30683a;
    }

    @Override // p6.f
    public final long b(long j10) {
        return this.f30684b.s(x.c(this.f30685c, j10));
    }

    @Override // z5.y
    public final boolean c() {
        return true;
    }

    public final boolean d(long j10) {
        eb.f fVar = this.f30684b;
        if (j10 - fVar.s(fVar.f15308a - 1) < 100000) {
            return true;
        }
        return false;
    }

    @Override // z5.y
    public final z5.x h(long j10) {
        eb.f fVar = this.f30684b;
        int c10 = x.c(fVar, j10);
        long s7 = fVar.s(c10);
        eb.f fVar2 = this.f30685c;
        z zVar = new z(s7, fVar2.s(c10));
        if (s7 != j10 && c10 != fVar.f15308a - 1) {
            int i10 = c10 + 1;
            return new z5.x(zVar, new z(fVar.s(i10), fVar2.s(i10)));
        }
        return new z5.x(zVar, zVar);
    }

    @Override // z5.y
    public final long i() {
        return this.f30686d;
    }
}
