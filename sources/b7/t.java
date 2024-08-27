package b7;

/* loaded from: classes.dex */
public final class t implements j {

    /* renamed from: a, reason: collision with root package name */
    public final tr.e f3993a;

    /* renamed from: b, reason: collision with root package name */
    public String f3994b;

    /* renamed from: c, reason: collision with root package name */
    public z5.b0 f3995c;

    /* renamed from: d, reason: collision with root package name */
    public s f3996d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3997e;

    /* renamed from: l, reason: collision with root package name */
    public long f4004l;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f3998f = new boolean[3];

    /* renamed from: g, reason: collision with root package name */
    public final w f3999g = new w(32);

    /* renamed from: h, reason: collision with root package name */
    public final w f4000h = new w(33);

    /* renamed from: i, reason: collision with root package name */
    public final w f4001i = new w(34);

    /* renamed from: j, reason: collision with root package name */
    public final w f4002j = new w(39);

    /* renamed from: k, reason: collision with root package name */
    public final w f4003k = new w(40);

    /* renamed from: m, reason: collision with root package name */
    public long f4005m = -9223372036854775807L;

    /* renamed from: n, reason: collision with root package name */
    public final e5.p f4006n = new e5.p();

    public t(tr.e eVar) {
        this.f3993a = eVar;
    }

    public final void a(byte[] bArr, int i10, int i11) {
        boolean z10;
        s sVar = this.f3996d;
        if (sVar.f3985f) {
            int i12 = sVar.f3983d;
            int i13 = (i10 + 2) - i12;
            if (i13 < i11) {
                if ((bArr[i13] & 128) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                sVar.f3986g = z10;
                sVar.f3985f = false;
            } else {
                sVar.f3983d = (i11 - i10) + i12;
            }
        }
        if (!this.f3997e) {
            this.f3999g.a(bArr, i10, i11);
            this.f4000h.a(bArr, i10, i11);
            this.f4001i.a(bArr, i10, i11);
        }
        this.f4002j.a(bArr, i10, i11);
        this.f4003k.a(bArr, i10, i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0248 A[SYNTHETIC] */
    @Override // b7.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(e5.p r34) {
        /*
            Method dump skipped, instructions count: 605
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: b7.t.b(e5.p):void");
    }

    @Override // b7.j
    public final void d() {
        this.f4004l = 0L;
        this.f4005m = -9223372036854775807L;
        f5.g.a(this.f3998f);
        this.f3999g.f();
        this.f4000h.f();
        this.f4001i.f();
        this.f4002j.f();
        this.f4003k.f();
        s sVar = this.f3996d;
        if (sVar != null) {
            sVar.f3985f = false;
            sVar.f3986g = false;
            sVar.f3987h = false;
            sVar.f3988i = false;
            sVar.f3989j = false;
        }
    }

    @Override // b7.j
    public final void e() {
    }

    @Override // b7.j
    public final void f(int i10, long j10) {
        if (j10 != -9223372036854775807L) {
            this.f4005m = j10;
        }
    }

    @Override // b7.j
    public final void g(z5.r rVar, h0 h0Var) {
        h0Var.a();
        h0Var.b();
        this.f3994b = h0Var.f3873e;
        h0Var.b();
        z5.b0 f10 = rVar.f(h0Var.f3872d, 2);
        this.f3995c = f10;
        this.f3996d = new s(f10);
        this.f3993a.p(rVar, h0Var);
    }
}
