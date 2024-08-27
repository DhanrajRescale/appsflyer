package z5;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final long f42074a;

    /* renamed from: b, reason: collision with root package name */
    public final long f42075b;

    /* renamed from: c, reason: collision with root package name */
    public final long f42076c;

    /* renamed from: d, reason: collision with root package name */
    public long f42077d;

    /* renamed from: e, reason: collision with root package name */
    public long f42078e;

    /* renamed from: f, reason: collision with root package name */
    public long f42079f;

    /* renamed from: g, reason: collision with root package name */
    public long f42080g;

    /* renamed from: h, reason: collision with root package name */
    public long f42081h;

    public e(long j10, long j11, long j12, long j13, long j14, long j15, long j16) {
        this.f42074a = j10;
        this.f42075b = j11;
        this.f42077d = j12;
        this.f42078e = j13;
        this.f42079f = j14;
        this.f42080g = j15;
        this.f42076c = j16;
        this.f42081h = a(j11, j12, j13, j14, j15, j16);
    }

    public static long a(long j10, long j11, long j12, long j13, long j14, long j15) {
        if (j13 + 1 < j14 && j11 + 1 < j12) {
            long j16 = ((float) (j10 - j11)) * (((float) (j14 - j13)) / ((float) (j12 - j11)));
            return e5.x.j(((j16 + j13) - j15) - (j16 / 20), j13, j14 - 1);
        }
        return j13;
    }
}
