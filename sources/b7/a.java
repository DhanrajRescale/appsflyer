package b7;

/* loaded from: classes.dex */
public final class a implements z5.p {

    /* renamed from: a, reason: collision with root package name */
    public final b f3743a = new b(null);

    /* renamed from: b, reason: collision with root package name */
    public final e5.p f3744b = new e5.p(2786);

    /* renamed from: c, reason: collision with root package name */
    public boolean f3745c;

    @Override // z5.p
    public final void d(z5.r rVar) {
        this.f3743a.g(rVar, new h0(0, 1));
        rVar.c();
        rVar.d(new z5.t(-9223372036854775807L));
    }

    @Override // z5.p
    public final int e(z5.q qVar, mj.b bVar) {
        e5.p pVar = this.f3744b;
        int read = qVar.read(pVar.f15036a, 0, 2786);
        if (read == -1) {
            return -1;
        }
        pVar.F(0);
        pVar.E(read);
        boolean z10 = this.f3745c;
        b bVar2 = this.f3743a;
        if (!z10) {
            bVar2.f(4, 0L);
            this.f3745c = true;
        }
        bVar2.b(pVar);
        return 0;
    }

    @Override // z5.p
    public final void f(long j10, long j11) {
        this.f3745c = false;
        this.f3743a.d();
    }

    @Override // z5.p
    public final boolean g(z5.q qVar) {
        z5.l lVar;
        int a10;
        e5.p pVar = new e5.p(10);
        int i10 = 0;
        while (true) {
            lVar = (z5.l) qVar;
            lVar.b(pVar.f15036a, 0, 10, false);
            pVar.F(0);
            if (pVar.w() != 4801587) {
                break;
            }
            pVar.G(3);
            int t10 = pVar.t();
            i10 += t10 + 10;
            lVar.k(t10, false);
        }
        lVar.f42108f = 0;
        lVar.k(i10, false);
        int i11 = 0;
        int i12 = i10;
        while (true) {
            lVar.b(pVar.f15036a, 0, 6, false);
            pVar.F(0);
            if (pVar.z() != 2935) {
                lVar.f42108f = 0;
                i12++;
                if (i12 - i10 >= 8192) {
                    return false;
                }
                lVar.k(i12, false);
                i11 = 0;
            } else {
                i11++;
                if (i11 >= 4) {
                    return true;
                }
                byte[] bArr = pVar.f15036a;
                if (bArr.length < 6) {
                    a10 = -1;
                } else if (((bArr[5] & 248) >> 3) > 10) {
                    a10 = ((((bArr[2] & 7) << 8) | (bArr[3] & 255)) + 1) * 2;
                } else {
                    byte b10 = bArr[4];
                    a10 = z5.a.a((b10 & 192) >> 6, b10 & 63);
                }
                if (a10 == -1) {
                    return false;
                }
                lVar.k(a10 - 6, false);
            }
        }
    }

    @Override // z5.p
    public final void release() {
    }
}
