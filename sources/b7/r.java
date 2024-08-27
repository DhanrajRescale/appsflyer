package b7;

/* loaded from: classes.dex */
public final class r implements j {

    /* renamed from: a, reason: collision with root package name */
    public final tr.e f3965a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f3966b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f3967c;

    /* renamed from: g, reason: collision with root package name */
    public long f3971g;

    /* renamed from: i, reason: collision with root package name */
    public String f3973i;

    /* renamed from: j, reason: collision with root package name */
    public z5.b0 f3974j;

    /* renamed from: k, reason: collision with root package name */
    public q f3975k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f3976l;

    /* renamed from: n, reason: collision with root package name */
    public boolean f3978n;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f3972h = new boolean[3];

    /* renamed from: d, reason: collision with root package name */
    public final w f3968d = new w(7);

    /* renamed from: e, reason: collision with root package name */
    public final w f3969e = new w(8);

    /* renamed from: f, reason: collision with root package name */
    public final w f3970f = new w(6);

    /* renamed from: m, reason: collision with root package name */
    public long f3977m = -9223372036854775807L;

    /* renamed from: o, reason: collision with root package name */
    public final e5.p f3979o = new e5.p();

    public r(tr.e eVar, boolean z10, boolean z11) {
        this.f3965a = eVar;
        this.f3966b = z10;
        this.f3967c = z11;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0102  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(byte[] r18, int r19, int r20) {
        /*
            Method dump skipped, instructions count: 399
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: b7.r.a(byte[], int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0209, code lost:
    
        if (r5.f3944n != r6.f3944n) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x021a, code lost:
    
        if (r5.f3946p != r6.f3946p) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0228, code lost:
    
        if (r5.f3942l != r6.f3942l) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x02bc, code lost:
    
        if (r4 != 1) goto L123;
     */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0283 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02dc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02bf  */
    @Override // b7.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(e5.p r29) {
        /*
            Method dump skipped, instructions count: 740
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: b7.r.b(e5.p):void");
    }

    @Override // b7.j
    public final void d() {
        this.f3971g = 0L;
        this.f3978n = false;
        this.f3977m = -9223372036854775807L;
        f5.g.a(this.f3972h);
        this.f3968d.f();
        this.f3969e.f();
        this.f3970f.f();
        q qVar = this.f3975k;
        if (qVar != null) {
            qVar.f3957k = false;
            qVar.f3961o = false;
            p pVar = qVar.f3960n;
            pVar.f3932b = false;
            pVar.f3931a = false;
        }
    }

    @Override // b7.j
    public final void e() {
    }

    @Override // b7.j
    public final void f(int i10, long j10) {
        if (j10 != -9223372036854775807L) {
            this.f3977m = j10;
        }
        this.f3978n = ((i10 & 2) != 0) | this.f3978n;
    }

    @Override // b7.j
    public final void g(z5.r rVar, h0 h0Var) {
        h0Var.a();
        h0Var.b();
        this.f3973i = h0Var.f3873e;
        h0Var.b();
        z5.b0 f10 = rVar.f(h0Var.f3872d, 2);
        this.f3974j = f10;
        this.f3975k = new q(f10, this.f3966b, this.f3967c);
        this.f3965a.p(rVar, h0Var);
    }
}
