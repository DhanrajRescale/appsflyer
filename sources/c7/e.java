package c7;

import e5.x;
import k3.o;
import z5.y;
import z5.z;

/* loaded from: classes.dex */
public final class e implements y {

    /* renamed from: a, reason: collision with root package name */
    public final o f8044a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8045b;

    /* renamed from: c, reason: collision with root package name */
    public final long f8046c;

    /* renamed from: d, reason: collision with root package name */
    public final long f8047d;

    /* renamed from: e, reason: collision with root package name */
    public final long f8048e;

    public e(o oVar, int i10, long j10, long j11) {
        this.f8044a = oVar;
        this.f8045b = i10;
        this.f8046c = j10;
        long j12 = (j11 - j10) / oVar.f22020c;
        this.f8047d = j12;
        this.f8048e = x.L(j12 * i10, 1000000L, oVar.f22019b);
    }

    @Override // z5.y
    public final boolean c() {
        return true;
    }

    @Override // z5.y
    public final z5.x h(long j10) {
        o oVar = this.f8044a;
        int i10 = this.f8045b;
        long j11 = (oVar.f22019b * j10) / (i10 * 1000000);
        long j12 = this.f8047d - 1;
        long j13 = x.j(j11, 0L, j12);
        long j14 = this.f8046c;
        long L = x.L(j13 * i10, 1000000L, oVar.f22019b);
        z zVar = new z(L, (oVar.f22020c * j13) + j14);
        if (L < j10 && j13 != j12) {
            long j15 = j13 + 1;
            return new z5.x(zVar, new z(x.L(j15 * i10, 1000000L, oVar.f22019b), (oVar.f22020c * j15) + j14));
        }
        return new z5.x(zVar, zVar);
    }

    @Override // z5.y
    public final long i() {
        return this.f8048e;
    }
}
