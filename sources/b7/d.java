package b7;

/* loaded from: classes.dex */
public final class d implements j {

    /* renamed from: a, reason: collision with root package name */
    public final b5.m f3778a;

    /* renamed from: b, reason: collision with root package name */
    public final e5.p f3779b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3780c;

    /* renamed from: d, reason: collision with root package name */
    public String f3781d;

    /* renamed from: e, reason: collision with root package name */
    public z5.b0 f3782e;

    /* renamed from: f, reason: collision with root package name */
    public int f3783f;

    /* renamed from: g, reason: collision with root package name */
    public int f3784g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f3785h;

    /* renamed from: i, reason: collision with root package name */
    public long f3786i;

    /* renamed from: j, reason: collision with root package name */
    public b5.v f3787j;

    /* renamed from: k, reason: collision with root package name */
    public int f3788k;

    /* renamed from: l, reason: collision with root package name */
    public long f3789l;

    public d(String str) {
        b5.m mVar = new b5.m(new byte[16], 1, (Object) null);
        this.f3778a = mVar;
        this.f3779b = new e5.p(mVar.f3433b);
        this.f3783f = 0;
        this.f3784g = 0;
        this.f3785h = false;
        this.f3789l = -9223372036854775807L;
        this.f3780c = str;
    }

    @Override // b7.j
    public final void b(e5.p pVar) {
        boolean z10;
        boolean z11;
        boolean z12;
        yk.j.I0(this.f3782e);
        while (pVar.a() > 0) {
            int i10 = this.f3783f;
            e5.p pVar2 = this.f3779b;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        int min = Math.min(pVar.a(), this.f3788k - this.f3784g);
                        this.f3782e.c(min, pVar);
                        int i11 = this.f3784g + min;
                        this.f3784g = i11;
                        int i12 = this.f3788k;
                        if (i11 == i12) {
                            long j10 = this.f3789l;
                            if (j10 != -9223372036854775807L) {
                                this.f3782e.b(j10, 1, i12, 0, null);
                                this.f3789l += this.f3786i;
                            }
                            this.f3783f = 0;
                        }
                    }
                } else {
                    byte[] bArr = pVar2.f15036a;
                    int min2 = Math.min(pVar.a(), 16 - this.f3784g);
                    pVar.e(bArr, this.f3784g, min2);
                    int i13 = this.f3784g + min2;
                    this.f3784g = i13;
                    if (i13 == 16) {
                        b5.m mVar = this.f3778a;
                        mVar.p(0);
                        b5.f e10 = z5.a.e(mVar);
                        b5.v vVar = this.f3787j;
                        if (vVar == null || e10.f3278c != vVar.f3665y || e10.f3277b != vVar.f3666z || !"audio/ac4".equals(vVar.f3652l)) {
                            b5.u uVar = new b5.u();
                            uVar.f3590a = this.f3781d;
                            uVar.f3600k = "audio/ac4";
                            uVar.f3613x = e10.f3278c;
                            uVar.f3614y = e10.f3277b;
                            uVar.f3592c = this.f3780c;
                            b5.v vVar2 = new b5.v(uVar);
                            this.f3787j = vVar2;
                            this.f3782e.e(vVar2);
                        }
                        this.f3788k = e10.f3279d;
                        this.f3786i = (e10.f3280e * 1000000) / this.f3787j.f3666z;
                        pVar2.F(0);
                        this.f3782e.c(16, pVar2);
                        this.f3783f = 2;
                    }
                }
            } else {
                while (pVar.a() > 0) {
                    if (!this.f3785h) {
                        if (pVar.u() == 172) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        this.f3785h = z10;
                    } else {
                        int u10 = pVar.u();
                        if (u10 == 172) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        this.f3785h = z11;
                        int i14 = 65;
                        if (u10 == 64 || u10 == 65) {
                            if (u10 == 65) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            this.f3783f = 1;
                            byte[] bArr2 = pVar2.f15036a;
                            bArr2[0] = -84;
                            if (!z12) {
                                i14 = 64;
                            }
                            bArr2[1] = (byte) i14;
                            this.f3784g = 2;
                        }
                    }
                }
            }
        }
    }

    @Override // b7.j
    public final void d() {
        this.f3783f = 0;
        this.f3784g = 0;
        this.f3785h = false;
        this.f3789l = -9223372036854775807L;
    }

    @Override // b7.j
    public final void e() {
    }

    @Override // b7.j
    public final void f(int i10, long j10) {
        if (j10 != -9223372036854775807L) {
            this.f3789l = j10;
        }
    }

    @Override // b7.j
    public final void g(z5.r rVar, h0 h0Var) {
        h0Var.a();
        h0Var.b();
        this.f3781d = h0Var.f3873e;
        h0Var.b();
        this.f3782e = rVar.f(h0Var.f3872d, 1);
    }
}
