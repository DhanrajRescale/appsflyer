package i5;

/* loaded from: classes.dex */
public final class j implements n0 {

    /* renamed from: a, reason: collision with root package name */
    public final v5.e f19508a;

    /* renamed from: b, reason: collision with root package name */
    public final long f19509b;

    /* renamed from: c, reason: collision with root package name */
    public final long f19510c;

    /* renamed from: d, reason: collision with root package name */
    public final long f19511d;

    /* renamed from: e, reason: collision with root package name */
    public final long f19512e;

    /* renamed from: f, reason: collision with root package name */
    public final int f19513f;

    /* renamed from: g, reason: collision with root package name */
    public final long f19514g;

    /* renamed from: h, reason: collision with root package name */
    public int f19515h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f19516i;

    public j() {
        v5.e eVar = new v5.e();
        a("bufferForPlaybackMs", 2500, 0, "0");
        a("bufferForPlaybackAfterRebufferMs", 5000, 0, "0");
        a("minBufferMs", 50000, 2500, "bufferForPlaybackMs");
        a("minBufferMs", 50000, 5000, "bufferForPlaybackAfterRebufferMs");
        a("maxBufferMs", 50000, 50000, "minBufferMs");
        a("backBufferDurationMs", 0, 0, "0");
        this.f19508a = eVar;
        long j10 = 50000;
        this.f19509b = e5.x.F(j10);
        this.f19510c = e5.x.F(j10);
        this.f19511d = e5.x.F(2500);
        this.f19512e = e5.x.F(5000);
        this.f19513f = -1;
        this.f19515h = 13107200;
        this.f19514g = e5.x.F(0);
    }

    public static void a(String str, int i10, int i11, String str2) {
        boolean z10;
        if (i10 >= i11) {
            z10 = true;
        } else {
            z10 = false;
        }
        yk.j.F0(z10, str + " cannot be less than " + str2);
    }

    public final void b(boolean z10) {
        boolean z11;
        int i10 = this.f19513f;
        if (i10 == -1) {
            i10 = 13107200;
        }
        this.f19515h = i10;
        this.f19516i = false;
        if (z10) {
            v5.e eVar = this.f19508a;
            synchronized (eVar) {
                if (eVar.f37705a) {
                    synchronized (eVar) {
                        if (eVar.f37707c > 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        eVar.f37707c = 0;
                        if (z11) {
                            eVar.a();
                        }
                    }
                }
            }
        }
    }

    public final boolean c(long j10, float f10) {
        int i10;
        boolean z10;
        v5.e eVar = this.f19508a;
        synchronized (eVar) {
            i10 = eVar.f37708d * eVar.f37706b;
        }
        if (i10 >= this.f19515h) {
            z10 = true;
        } else {
            z10 = false;
        }
        long j11 = this.f19510c;
        long j12 = this.f19509b;
        if (f10 > 1.0f) {
            j12 = Math.min(e5.x.r(j12, f10), j11);
        }
        if (j10 < Math.max(j12, 500000L)) {
            boolean z11 = !z10;
            this.f19516i = z11;
            if (!z11 && j10 < 500000) {
                e5.m.f("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j10 >= j11 || z10) {
            this.f19516i = false;
        }
        return this.f19516i;
    }
}
