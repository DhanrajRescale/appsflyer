package b7;

/* loaded from: classes.dex */
public final class v implements j {

    /* renamed from: a, reason: collision with root package name */
    public final e5.p f4028a;

    /* renamed from: b, reason: collision with root package name */
    public final z5.b f4029b;

    /* renamed from: c, reason: collision with root package name */
    public final String f4030c;

    /* renamed from: d, reason: collision with root package name */
    public z5.b0 f4031d;

    /* renamed from: e, reason: collision with root package name */
    public String f4032e;

    /* renamed from: f, reason: collision with root package name */
    public int f4033f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f4034g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f4035h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f4036i;

    /* renamed from: j, reason: collision with root package name */
    public long f4037j;

    /* renamed from: k, reason: collision with root package name */
    public int f4038k;

    /* renamed from: l, reason: collision with root package name */
    public long f4039l;

    /* JADX WARN: Type inference failed for: r0v1, types: [z5.b, java.lang.Object] */
    public v(String str) {
        e5.p pVar = new e5.p(4);
        this.f4028a = pVar;
        pVar.f15036a[0] = -1;
        this.f4029b = new Object();
        this.f4039l = -9223372036854775807L;
        this.f4030c = str;
    }

    @Override // b7.j
    public final void b(e5.p pVar) {
        boolean z10;
        boolean z11;
        yk.j.I0(this.f4031d);
        while (pVar.a() > 0) {
            int i10 = this.f4033f;
            e5.p pVar2 = this.f4028a;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        int min = Math.min(pVar.a(), this.f4038k - this.f4034g);
                        this.f4031d.c(min, pVar);
                        int i11 = this.f4034g + min;
                        this.f4034g = i11;
                        int i12 = this.f4038k;
                        if (i11 >= i12) {
                            long j10 = this.f4039l;
                            if (j10 != -9223372036854775807L) {
                                this.f4031d.b(j10, 1, i12, 0, null);
                                this.f4039l += this.f4037j;
                            }
                            this.f4034g = 0;
                            this.f4033f = 0;
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                } else {
                    int min2 = Math.min(pVar.a(), 4 - this.f4034g);
                    pVar.e(pVar2.f15036a, this.f4034g, min2);
                    int i13 = this.f4034g + min2;
                    this.f4034g = i13;
                    if (i13 >= 4) {
                        pVar2.F(0);
                        int g10 = pVar2.g();
                        z5.b bVar = this.f4029b;
                        if (!bVar.a(g10)) {
                            this.f4034g = 0;
                            this.f4033f = 1;
                        } else {
                            this.f4038k = bVar.f42039c;
                            if (!this.f4035h) {
                                int i14 = bVar.f42040d;
                                this.f4037j = (bVar.f42043g * 1000000) / i14;
                                b5.u uVar = new b5.u();
                                uVar.f3590a = this.f4032e;
                                uVar.f3600k = bVar.f42038b;
                                uVar.f3601l = 4096;
                                uVar.f3613x = bVar.f42041e;
                                uVar.f3614y = i14;
                                uVar.f3592c = this.f4030c;
                                this.f4031d.e(new b5.v(uVar));
                                this.f4035h = true;
                            }
                            pVar2.F(0);
                            this.f4031d.c(4, pVar2);
                            this.f4033f = 2;
                        }
                    }
                }
            } else {
                byte[] bArr = pVar.f15036a;
                int i15 = pVar.f15037b;
                int i16 = pVar.f15038c;
                while (true) {
                    if (i15 < i16) {
                        byte b10 = bArr[i15];
                        if ((b10 & 255) == 255) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (this.f4036i && (b10 & 224) == 224) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        this.f4036i = z10;
                        if (z11) {
                            pVar.F(i15 + 1);
                            this.f4036i = false;
                            pVar2.f15036a[1] = bArr[i15];
                            this.f4034g = 2;
                            this.f4033f = 1;
                            break;
                        }
                        i15++;
                    } else {
                        pVar.F(i16);
                        break;
                    }
                }
            }
        }
    }

    @Override // b7.j
    public final void d() {
        this.f4033f = 0;
        this.f4034g = 0;
        this.f4036i = false;
        this.f4039l = -9223372036854775807L;
    }

    @Override // b7.j
    public final void e() {
    }

    @Override // b7.j
    public final void f(int i10, long j10) {
        if (j10 != -9223372036854775807L) {
            this.f4039l = j10;
        }
    }

    @Override // b7.j
    public final void g(z5.r rVar, h0 h0Var) {
        h0Var.a();
        h0Var.b();
        this.f4032e = h0Var.f3873e;
        h0Var.b();
        this.f4031d = rVar.f(h0Var.f3872d, 1);
    }
}
