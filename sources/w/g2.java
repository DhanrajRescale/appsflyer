package w;

/* loaded from: classes.dex */
public final class g2 implements a2 {

    /* renamed from: a, reason: collision with root package name */
    public final c2 f38501a;

    /* renamed from: b, reason: collision with root package name */
    public final int f38502b;

    /* renamed from: c, reason: collision with root package name */
    public final long f38503c;

    /* renamed from: d, reason: collision with root package name */
    public final long f38504d;

    public g2(c2 c2Var, int i10, long j10) {
        this.f38501a = c2Var;
        this.f38502b = i10;
        this.f38503c = (c2Var.i() + c2Var.g()) * 1000000;
        this.f38504d = j10 * 1000000;
    }

    @Override // w.a2
    public final boolean a() {
        return true;
    }

    public final long b(long j10) {
        long j11 = j10 + this.f38504d;
        if (j11 <= 0) {
            return 0L;
        }
        long j12 = this.f38503c;
        long j13 = j11 / j12;
        if (this.f38502b != 1 && j13 % 2 != 0) {
            return ((j13 + 1) * j12) - j11;
        }
        return j11 - (j13 * j12);
    }

    @Override // w.a2
    public final long c(t tVar, t tVar2, t tVar3) {
        return Long.MAX_VALUE;
    }

    @Override // w.a2
    public final t e(long j10, t tVar, t tVar2, t tVar3) {
        return this.f38501a.e(b(j10), tVar, tVar2, h(j10, tVar, tVar3, tVar2));
    }

    @Override // w.a2
    public final t f(long j10, t tVar, t tVar2, t tVar3) {
        return this.f38501a.f(b(j10), tVar, tVar2, h(j10, tVar, tVar3, tVar2));
    }

    public final t h(long j10, t tVar, t tVar2, t tVar3) {
        long j11 = this.f38504d;
        long j12 = j10 + j11;
        long j13 = this.f38503c;
        if (j12 > j13) {
            return this.f38501a.f(j13 - j11, tVar, tVar3, tVar2);
        }
        return tVar2;
    }
}
