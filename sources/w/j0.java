package w;

/* loaded from: classes.dex */
public final class j0 implements g0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f38557a;

    /* renamed from: b, reason: collision with root package name */
    public final int f38558b;

    /* renamed from: c, reason: collision with root package name */
    public final d0 f38559c;

    /* renamed from: d, reason: collision with root package name */
    public final long f38560d;

    /* renamed from: e, reason: collision with root package name */
    public final long f38561e;

    public j0(int i10, int i11, d0 d0Var) {
        this.f38557a = i10;
        this.f38558b = i11;
        this.f38559c = d0Var;
        this.f38560d = i10 * 1000000;
        this.f38561e = i11 * 1000000;
    }

    @Override // w.g0
    public final float b(long j10, float f10, float f11, float f12) {
        long g10 = kotlin.ranges.d.g(j10 - this.f38561e, 0L, this.f38560d);
        if (g10 < 0) {
            return s0.g.f34069a;
        }
        if (g10 == 0) {
            return f12;
        }
        return (e(g10, f10, f11, f12) - e(g10 - 1000000, f10, f11, f12)) * 1000.0f;
    }

    @Override // w.g0
    public final long c(float f10, float f11, float f12) {
        return (this.f38558b + this.f38557a) * 1000000;
    }

    @Override // w.g0
    public final float e(long j10, float f10, float f11, float f12) {
        float f13;
        long g10 = kotlin.ranges.d.g(j10 - this.f38561e, 0L, this.f38560d);
        float f14 = 1.0f;
        if (this.f38557a == 0) {
            f13 = 1.0f;
        } else {
            f13 = ((float) g10) / ((float) this.f38560d);
        }
        if (f13 < s0.g.f34069a) {
            f13 = 0.0f;
        }
        if (f13 <= 1.0f) {
            f14 = f13;
        }
        float b10 = this.f38559c.b(f14);
        y1 y1Var = z1.f38739a;
        return (f11 * b10) + ((1 - b10) * f10);
    }
}
