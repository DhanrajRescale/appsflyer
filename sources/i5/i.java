package i5;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final long f19489a;

    /* renamed from: b, reason: collision with root package name */
    public final long f19490b;

    /* renamed from: c, reason: collision with root package name */
    public final float f19491c;

    /* renamed from: d, reason: collision with root package name */
    public long f19492d = -9223372036854775807L;

    /* renamed from: e, reason: collision with root package name */
    public long f19493e = -9223372036854775807L;

    /* renamed from: g, reason: collision with root package name */
    public long f19495g = -9223372036854775807L;

    /* renamed from: h, reason: collision with root package name */
    public long f19496h = -9223372036854775807L;

    /* renamed from: k, reason: collision with root package name */
    public float f19499k = 0.97f;

    /* renamed from: j, reason: collision with root package name */
    public float f19498j = 1.03f;

    /* renamed from: l, reason: collision with root package name */
    public float f19500l = 1.0f;

    /* renamed from: m, reason: collision with root package name */
    public long f19501m = -9223372036854775807L;

    /* renamed from: f, reason: collision with root package name */
    public long f19494f = -9223372036854775807L;

    /* renamed from: i, reason: collision with root package name */
    public long f19497i = -9223372036854775807L;

    /* renamed from: n, reason: collision with root package name */
    public long f19502n = -9223372036854775807L;

    /* renamed from: o, reason: collision with root package name */
    public long f19503o = -9223372036854775807L;

    public i(long j10, long j11, float f10) {
        this.f19489a = j10;
        this.f19490b = j11;
        this.f19491c = f10;
    }

    public final void a() {
        long j10 = this.f19492d;
        if (j10 != -9223372036854775807L) {
            long j11 = this.f19493e;
            if (j11 != -9223372036854775807L) {
                j10 = j11;
            }
            long j12 = this.f19495g;
            if (j12 != -9223372036854775807L && j10 < j12) {
                j10 = j12;
            }
            long j13 = this.f19496h;
            if (j13 != -9223372036854775807L && j10 > j13) {
                j10 = j13;
            }
        } else {
            j10 = -9223372036854775807L;
        }
        if (this.f19494f == j10) {
            return;
        }
        this.f19494f = j10;
        this.f19497i = j10;
        this.f19502n = -9223372036854775807L;
        this.f19503o = -9223372036854775807L;
        this.f19501m = -9223372036854775807L;
    }
}
