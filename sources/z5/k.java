package z5;

/* loaded from: classes.dex */
public class k implements y {

    /* renamed from: a, reason: collision with root package name */
    public final long f42096a;

    /* renamed from: b, reason: collision with root package name */
    public final long f42097b;

    /* renamed from: c, reason: collision with root package name */
    public final int f42098c;

    /* renamed from: d, reason: collision with root package name */
    public final long f42099d;

    /* renamed from: e, reason: collision with root package name */
    public final int f42100e;

    /* renamed from: f, reason: collision with root package name */
    public final long f42101f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f42102g;

    public k(int i10, int i11, long j10, long j11, boolean z10) {
        this.f42096a = j10;
        this.f42097b = j11;
        this.f42098c = i11 == -1 ? 1 : i11;
        this.f42100e = i10;
        this.f42102g = z10;
        if (j10 == -1) {
            this.f42099d = -1L;
            this.f42101f = -9223372036854775807L;
        } else {
            long j12 = j10 - j11;
            this.f42099d = j12;
            this.f42101f = (Math.max(0L, j12) * 8000000) / i10;
        }
    }

    @Override // z5.y
    public final boolean c() {
        return this.f42099d != -1 || this.f42102g;
    }

    @Override // z5.y
    public final x h(long j10) {
        long j11 = this.f42099d;
        long j12 = this.f42097b;
        if (j11 == -1 && !this.f42102g) {
            z zVar = new z(0L, j12);
            return new x(zVar, zVar);
        }
        int i10 = this.f42100e;
        long j13 = this.f42098c;
        long j14 = (((i10 * j10) / 8000000) / j13) * j13;
        if (j11 != -1) {
            j14 = Math.min(j14, j11 - j13);
        }
        long max = Math.max(j14, 0L) + j12;
        long max2 = (Math.max(0L, max - j12) * 8000000) / i10;
        z zVar2 = new z(max2, max);
        if (j11 != -1 && max2 < j10) {
            long j15 = max + j13;
            if (j15 < this.f42096a) {
                return new x(zVar2, new z((Math.max(0L, j15 - j12) * 8000000) / i10, j15));
            }
        }
        return new x(zVar2, zVar2);
    }

    @Override // z5.y
    public final long i() {
        return this.f42101f;
    }
}
