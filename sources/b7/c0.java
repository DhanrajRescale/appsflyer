package b7;

/* loaded from: classes.dex */
public final class c0 implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final b0 f3772a;

    /* renamed from: b, reason: collision with root package name */
    public final e5.p f3773b = new e5.p(32);

    /* renamed from: c, reason: collision with root package name */
    public int f3774c;

    /* renamed from: d, reason: collision with root package name */
    public int f3775d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3776e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3777f;

    public c0(b0 b0Var) {
        this.f3772a = b0Var;
    }

    @Override // b7.i0
    public final void a(int i10, e5.p pVar) {
        boolean z10;
        int i11;
        boolean z11;
        if ((i10 & 1) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            i11 = pVar.f15037b + pVar.u();
        } else {
            i11 = -1;
        }
        if (this.f3777f) {
            if (!z10) {
                return;
            }
            this.f3777f = false;
            pVar.F(i11);
            this.f3775d = 0;
        }
        while (pVar.a() > 0) {
            int i12 = this.f3775d;
            e5.p pVar2 = this.f3773b;
            if (i12 < 3) {
                if (i12 == 0) {
                    int u10 = pVar.u();
                    pVar.F(pVar.f15037b - 1);
                    if (u10 == 255) {
                        this.f3777f = true;
                        return;
                    }
                }
                int min = Math.min(pVar.a(), 3 - this.f3775d);
                pVar.e(pVar2.f15036a, this.f3775d, min);
                int i13 = this.f3775d + min;
                this.f3775d = i13;
                if (i13 == 3) {
                    pVar2.F(0);
                    pVar2.E(3);
                    pVar2.G(1);
                    int u11 = pVar2.u();
                    int u12 = pVar2.u();
                    if ((u11 & 128) != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    this.f3776e = z11;
                    int i14 = (((u11 & 15) << 8) | u12) + 3;
                    this.f3774c = i14;
                    byte[] bArr = pVar2.f15036a;
                    if (bArr.length < i14) {
                        pVar2.b(Math.min(4098, Math.max(i14, bArr.length * 2)));
                    }
                }
            } else {
                int min2 = Math.min(pVar.a(), this.f3774c - this.f3775d);
                pVar.e(pVar2.f15036a, this.f3775d, min2);
                int i15 = this.f3775d + min2;
                this.f3775d = i15;
                int i16 = this.f3774c;
                if (i15 != i16) {
                    continue;
                } else {
                    if (this.f3776e) {
                        if (e5.x.k(0, pVar2.f15036a, i16, -1) != 0) {
                            this.f3777f = true;
                            return;
                        }
                        pVar2.E(this.f3774c - 4);
                    } else {
                        pVar2.E(i16);
                    }
                    pVar2.F(0);
                    this.f3772a.b(pVar2);
                    this.f3775d = 0;
                }
            }
        }
    }

    @Override // b7.i0
    public final void c(e5.u uVar, z5.r rVar, h0 h0Var) {
        this.f3772a.c(uVar, rVar, h0Var);
        this.f3777f = true;
    }

    @Override // b7.i0
    public final void d() {
        this.f3777f = true;
    }
}
