package b7;

/* loaded from: classes.dex */
public final class x implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final j f4046a;

    /* renamed from: b, reason: collision with root package name */
    public final b5.m f4047b = new b5.m(new byte[10], 1, (Object) null);

    /* renamed from: c, reason: collision with root package name */
    public int f4048c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f4049d;

    /* renamed from: e, reason: collision with root package name */
    public e5.u f4050e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f4051f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f4052g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f4053h;

    /* renamed from: i, reason: collision with root package name */
    public int f4054i;

    /* renamed from: j, reason: collision with root package name */
    public int f4055j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f4056k;

    /* renamed from: l, reason: collision with root package name */
    public long f4057l;

    public x(j jVar) {
        this.f4046a = jVar;
    }

    @Override // b7.i0
    public final void a(int i10, e5.p pVar) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        yk.j.I0(this.f4050e);
        int i16 = i10 & 1;
        j jVar = this.f4046a;
        int i17 = -1;
        int i18 = 3;
        int i19 = 2;
        if (i16 != 0) {
            int i20 = this.f4048c;
            if (i20 != 0 && i20 != 1) {
                if (i20 != 2) {
                    if (i20 == 3) {
                        if (this.f4055j != -1) {
                            e5.m.f("PesReader", "Unexpected start indicator: expected " + this.f4055j + " more bytes");
                        }
                        jVar.e();
                    } else {
                        throw new IllegalStateException();
                    }
                } else {
                    e5.m.f("PesReader", "Unexpected start indicator reading extended header");
                }
            }
            this.f4048c = 1;
            this.f4049d = 0;
        }
        int i21 = i10;
        while (pVar.a() > 0) {
            int i22 = this.f4048c;
            if (i22 != 0) {
                b5.m mVar = this.f4047b;
                if (i22 != 1) {
                    if (i22 != i19) {
                        if (i22 == i18) {
                            int a10 = pVar.a();
                            int i23 = this.f4055j;
                            if (i23 == i17) {
                                i15 = 0;
                            } else {
                                i15 = a10 - i23;
                            }
                            if (i15 > 0) {
                                a10 -= i15;
                                pVar.E(pVar.f15037b + a10);
                            }
                            jVar.b(pVar);
                            int i24 = this.f4055j;
                            if (i24 != i17) {
                                int i25 = i24 - a10;
                                this.f4055j = i25;
                                if (i25 == 0) {
                                    jVar.e();
                                    this.f4048c = 1;
                                    this.f4049d = 0;
                                }
                            }
                            i11 = i19;
                            int i26 = i18;
                            i12 = i17;
                            i13 = i26;
                        } else {
                            throw new IllegalStateException();
                        }
                    } else if (b(Math.min(10, this.f4054i), pVar, mVar.f3433b) && b(this.f4054i, pVar, null)) {
                        mVar.p(0);
                        this.f4057l = -9223372036854775807L;
                        int i27 = 4;
                        if (this.f4051f) {
                            mVar.s(4);
                            mVar.s(1);
                            mVar.s(1);
                            long i28 = (mVar.i(15) << 15) | (mVar.i(i18) << 30) | mVar.i(15);
                            mVar.s(1);
                            if (!this.f4053h && this.f4052g) {
                                mVar.s(4);
                                mVar.s(1);
                                mVar.s(1);
                                mVar.s(1);
                                this.f4050e.b((mVar.i(3) << 30) | (mVar.i(15) << 15) | mVar.i(15));
                                this.f4053h = true;
                            }
                            this.f4057l = this.f4050e.b(i28);
                        }
                        if (!this.f4056k) {
                            i27 = 0;
                        }
                        i21 |= i27;
                        jVar.f(i21, this.f4057l);
                        this.f4048c = 3;
                        this.f4049d = 0;
                        i18 = 3;
                        i17 = -1;
                        i19 = 2;
                    } else {
                        i13 = i18;
                        i11 = i19;
                        i12 = -1;
                    }
                } else {
                    i13 = i18;
                    if (b(9, pVar, mVar.f3433b)) {
                        mVar.p(0);
                        int i29 = mVar.i(24);
                        if (i29 != 1) {
                            nn.d.u("Unexpected start code prefix: ", i29, "PesReader");
                            this.f4055j = -1;
                            i14 = 0;
                            i12 = -1;
                            i11 = 2;
                        } else {
                            mVar.s(8);
                            int i30 = mVar.i(16);
                            mVar.s(5);
                            this.f4056k = mVar.h();
                            i11 = 2;
                            mVar.s(2);
                            this.f4051f = mVar.h();
                            this.f4052g = mVar.h();
                            mVar.s(6);
                            int i31 = mVar.i(8);
                            this.f4054i = i31;
                            if (i30 == 0) {
                                this.f4055j = -1;
                                i12 = -1;
                            } else {
                                int i32 = (i30 - 3) - i31;
                                this.f4055j = i32;
                                if (i32 < 0) {
                                    e5.m.f("PesReader", "Found negative packet payload size: " + this.f4055j);
                                    i12 = -1;
                                    this.f4055j = -1;
                                } else {
                                    i12 = -1;
                                }
                            }
                            i14 = 2;
                        }
                        this.f4048c = i14;
                        this.f4049d = 0;
                    } else {
                        i12 = -1;
                        i11 = 2;
                    }
                }
            } else {
                i11 = i19;
                int i33 = i18;
                i12 = i17;
                i13 = i33;
                pVar.G(pVar.a());
            }
            i19 = i11;
            int i34 = i12;
            i18 = i13;
            i17 = i34;
        }
    }

    public final boolean b(int i10, e5.p pVar, byte[] bArr) {
        int min = Math.min(pVar.a(), i10 - this.f4049d);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            pVar.G(min);
        } else {
            pVar.e(bArr, this.f4049d, min);
        }
        int i11 = this.f4049d + min;
        this.f4049d = i11;
        if (i11 == i10) {
            return true;
        }
        return false;
    }

    @Override // b7.i0
    public final void c(e5.u uVar, z5.r rVar, h0 h0Var) {
        this.f4050e = uVar;
        this.f4046a.g(rVar, h0Var);
    }

    @Override // b7.i0
    public final void d() {
        this.f4048c = 0;
        this.f4049d = 0;
        this.f4053h = false;
        this.f4046a.d();
    }
}
