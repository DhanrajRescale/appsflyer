package b7;

/* loaded from: classes.dex */
public final class e implements z5.p {

    /* renamed from: d, reason: collision with root package name */
    public final e5.p f3802d;

    /* renamed from: e, reason: collision with root package name */
    public final b5.m f3803e;

    /* renamed from: f, reason: collision with root package name */
    public z5.r f3804f;

    /* renamed from: g, reason: collision with root package name */
    public long f3805g;

    /* renamed from: j, reason: collision with root package name */
    public boolean f3808j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f3809k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f3810l;

    /* renamed from: a, reason: collision with root package name */
    public final int f3799a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final f f3800b = new f(true, null);

    /* renamed from: c, reason: collision with root package name */
    public final e5.p f3801c = new e5.p(2048);

    /* renamed from: i, reason: collision with root package name */
    public int f3807i = -1;

    /* renamed from: h, reason: collision with root package name */
    public long f3806h = -1;

    public e() {
        e5.p pVar = new e5.p(10);
        this.f3802d = pVar;
        this.f3803e = new b5.m(pVar.f15036a, 1, (Object) null);
    }

    public final int a(z5.q qVar) {
        int i10 = 0;
        while (true) {
            e5.p pVar = this.f3802d;
            qVar.n(pVar.f15036a, 0, 10);
            pVar.F(0);
            if (pVar.w() != 4801587) {
                break;
            }
            pVar.G(3);
            int t10 = pVar.t();
            i10 += t10 + 10;
            qVar.d(t10);
        }
        qVar.i();
        qVar.d(i10);
        if (this.f3806h == -1) {
            this.f3806h = i10;
        }
        return i10;
    }

    @Override // z5.p
    public final void d(z5.r rVar) {
        this.f3804f = rVar;
        this.f3800b.g(rVar, new h0(0, 1));
        rVar.c();
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x0086, code lost:
    
        r19.f3808j = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x008f, code lost:
    
        throw androidx.media3.common.ParserException.a("Malformed ADTS stream", null);
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0111 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b1  */
    @Override // z5.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int e(z5.q r20, mj.b r21) {
        /*
            Method dump skipped, instructions count: 303
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: b7.e.e(z5.q, mj.b):int");
    }

    @Override // z5.p
    public final void f(long j10, long j11) {
        this.f3809k = false;
        this.f3800b.d();
        this.f3805g = j11;
    }

    @Override // z5.p
    public final boolean g(z5.q qVar) {
        int a10 = a(qVar);
        int i10 = a10;
        int i11 = 0;
        int i12 = 0;
        do {
            e5.p pVar = this.f3802d;
            z5.l lVar = (z5.l) qVar;
            lVar.b(pVar.f15036a, 0, 2, false);
            pVar.F(0);
            if ((pVar.z() & 65526) == 65520) {
                i11++;
                if (i11 >= 4 && i12 > 188) {
                    return true;
                }
                lVar.b(pVar.f15036a, 0, 4, false);
                b5.m mVar = this.f3803e;
                mVar.p(14);
                int i13 = mVar.i(13);
                if (i13 <= 6) {
                    i10++;
                    lVar.f42108f = 0;
                    lVar.k(i10, false);
                } else {
                    lVar.k(i13 - 6, false);
                    i12 += i13;
                }
            } else {
                i10++;
                lVar.f42108f = 0;
                lVar.k(i10, false);
            }
            i11 = 0;
            i12 = 0;
        } while (i10 - a10 < 8192);
        return false;
    }

    @Override // z5.p
    public final void release() {
    }
}
