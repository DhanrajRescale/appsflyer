package m0;

/* loaded from: classes.dex */
public abstract class n5 {

    /* renamed from: a, reason: collision with root package name */
    public static final t0.m3 f26534a = new t0.a0(w0.f26998i);

    /* renamed from: b, reason: collision with root package name */
    public static final t0.p0 f26535b = new t0.p0(t0.o3.f35116a, w0.f26997h);

    /* renamed from: c, reason: collision with root package name */
    public static final o5 f26536c;

    /* renamed from: d, reason: collision with root package name */
    public static final o5 f26537d;

    /* renamed from: e, reason: collision with root package name */
    public static final q0.i f26538e;

    /* renamed from: f, reason: collision with root package name */
    public static final q0.i f26539f;

    /* renamed from: g, reason: collision with root package name */
    public static final q0.i f26540g;

    /* JADX WARN: Type inference failed for: r1v0, types: [t0.m3, t0.a0] */
    static {
        long j10 = n1.t.f28177i;
        f26536c = new o5(true, Float.NaN, j10);
        f26537d = new o5(false, Float.NaN, j10);
        f26538e = new q0.i(0.16f, 0.24f, 0.08f, 0.24f);
        f26539f = new q0.i(0.08f, 0.12f, 0.04f, 0.12f);
        f26540g = new q0.i(0.08f, 0.12f, 0.04f, 0.1f);
    }

    public static final o5 a(boolean z10, float f10, long j10) {
        if (w2.e.a(f10, Float.NaN) && n1.t.d(j10, n1.t.f28177i)) {
            if (z10) {
                return f26536c;
            }
            return f26537d;
        }
        return new o5(z10, f10, j10);
    }

    public static o5 b(long j10) {
        return a(true, Float.NaN, j10);
    }

    public static final x.j1 c(boolean z10, float f10, long j10, t0.n nVar, int i10, int i11) {
        x.j1 a10;
        t0.r rVar = (t0.r) nVar;
        rVar.b0(-58830494);
        if ((i11 & 1) != 0) {
            z10 = true;
        }
        if ((i11 & 2) != 0) {
            f10 = Float.NaN;
        }
        if ((i11 & 4) != 0) {
            j10 = n1.t.f28177i;
        }
        if (((Boolean) rVar.m(f26534a)).booleanValue()) {
            a10 = q0.x.a(z10, f10, j10, rVar, (i10 & 896) | (i10 & 14) | (i10 & 112), 0);
        } else {
            a10 = a(z10, f10, j10);
        }
        rVar.s(false);
        return a10;
    }
}
