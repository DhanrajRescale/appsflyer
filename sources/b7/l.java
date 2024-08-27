package b7;

/* loaded from: classes.dex */
public final class l implements j {

    /* renamed from: q, reason: collision with root package name */
    public static final double[] f3888q = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* renamed from: a, reason: collision with root package name */
    public String f3889a;

    /* renamed from: b, reason: collision with root package name */
    public z5.b0 f3890b;

    /* renamed from: c, reason: collision with root package name */
    public final j0 f3891c;

    /* renamed from: d, reason: collision with root package name */
    public final e5.p f3892d;

    /* renamed from: e, reason: collision with root package name */
    public final w f3893e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f3894f = new boolean[4];

    /* renamed from: g, reason: collision with root package name */
    public final k f3895g;

    /* renamed from: h, reason: collision with root package name */
    public long f3896h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f3897i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f3898j;

    /* renamed from: k, reason: collision with root package name */
    public long f3899k;

    /* renamed from: l, reason: collision with root package name */
    public long f3900l;

    /* renamed from: m, reason: collision with root package name */
    public long f3901m;

    /* renamed from: n, reason: collision with root package name */
    public long f3902n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f3903o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f3904p;

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, b7.k] */
    public l(j0 j0Var) {
        this.f3891c = j0Var;
        ?? obj = new Object();
        obj.f3887d = new byte[128];
        this.f3895g = obj;
        if (j0Var != null) {
            this.f3893e = new w(178);
            this.f3892d = new e5.p();
        } else {
            this.f3893e = null;
            this.f3892d = null;
        }
        this.f3900l = -9223372036854775807L;
        this.f3902n = -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01e0  */
    @Override // b7.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(e5.p r21) {
        /*
            Method dump skipped, instructions count: 514
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: b7.l.b(e5.p):void");
    }

    @Override // b7.j
    public final void d() {
        f5.g.a(this.f3894f);
        k kVar = this.f3895g;
        kVar.f3884a = false;
        kVar.f3885b = 0;
        kVar.f3886c = 0;
        w wVar = this.f3893e;
        if (wVar != null) {
            wVar.f();
        }
        this.f3896h = 0L;
        this.f3897i = false;
        this.f3900l = -9223372036854775807L;
        this.f3902n = -9223372036854775807L;
    }

    @Override // b7.j
    public final void e() {
    }

    @Override // b7.j
    public final void f(int i10, long j10) {
        this.f3900l = j10;
    }

    @Override // b7.j
    public final void g(z5.r rVar, h0 h0Var) {
        h0Var.a();
        h0Var.b();
        this.f3889a = h0Var.f3873e;
        h0Var.b();
        this.f3890b = rVar.f(h0Var.f3872d, 2);
        j0 j0Var = this.f3891c;
        if (j0Var != null) {
            j0Var.b(rVar, h0Var);
        }
    }
}
