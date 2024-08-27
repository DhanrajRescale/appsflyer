package b7;

/* loaded from: classes.dex */
public final class o implements j {

    /* renamed from: l, reason: collision with root package name */
    public static final float[] f3919l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    /* renamed from: a, reason: collision with root package name */
    public final j0 f3920a;

    /* renamed from: b, reason: collision with root package name */
    public final e5.p f3921b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean[] f3922c = new boolean[4];

    /* renamed from: d, reason: collision with root package name */
    public final m f3923d;

    /* renamed from: e, reason: collision with root package name */
    public final w f3924e;

    /* renamed from: f, reason: collision with root package name */
    public n f3925f;

    /* renamed from: g, reason: collision with root package name */
    public long f3926g;

    /* renamed from: h, reason: collision with root package name */
    public String f3927h;

    /* renamed from: i, reason: collision with root package name */
    public z5.b0 f3928i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f3929j;

    /* renamed from: k, reason: collision with root package name */
    public long f3930k;

    /* JADX WARN: Type inference failed for: r3v3, types: [b7.m, java.lang.Object] */
    public o(j0 j0Var) {
        this.f3920a = j0Var;
        ?? obj = new Object();
        obj.f3910e = new byte[128];
        this.f3923d = obj;
        this.f3930k = -9223372036854775807L;
        this.f3924e = new w(178);
        this.f3921b = new e5.p();
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0139  */
    @Override // b7.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(e5.p r26) {
        /*
            Method dump skipped, instructions count: 663
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: b7.o.b(e5.p):void");
    }

    @Override // b7.j
    public final void d() {
        f5.g.a(this.f3922c);
        m mVar = this.f3923d;
        mVar.f3906a = false;
        mVar.f3908c = 0;
        mVar.f3907b = 0;
        n nVar = this.f3925f;
        if (nVar != null) {
            nVar.f3912b = false;
            nVar.f3913c = false;
            nVar.f3914d = false;
            nVar.f3915e = -1;
        }
        w wVar = this.f3924e;
        if (wVar != null) {
            wVar.f();
        }
        this.f3926g = 0L;
        this.f3930k = -9223372036854775807L;
    }

    @Override // b7.j
    public final void e() {
    }

    @Override // b7.j
    public final void f(int i10, long j10) {
        if (j10 != -9223372036854775807L) {
            this.f3930k = j10;
        }
    }

    @Override // b7.j
    public final void g(z5.r rVar, h0 h0Var) {
        h0Var.a();
        h0Var.b();
        this.f3927h = h0Var.f3873e;
        h0Var.b();
        z5.b0 f10 = rVar.f(h0Var.f3872d, 2);
        this.f3928i = f10;
        this.f3925f = new n(f10);
        j0 j0Var = this.f3920a;
        if (j0Var != null) {
            j0Var.b(rVar, h0Var);
        }
    }
}
