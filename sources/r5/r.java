package r5;

import b5.g1;
import b5.h1;
import b5.i1;

/* loaded from: classes.dex */
public final class r extends f1 {

    /* renamed from: l, reason: collision with root package name */
    public final boolean f33277l;

    /* renamed from: m, reason: collision with root package name */
    public final h1 f33278m;

    /* renamed from: n, reason: collision with root package name */
    public final g1 f33279n;

    /* renamed from: o, reason: collision with root package name */
    public p f33280o;

    /* renamed from: p, reason: collision with root package name */
    public o f33281p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f33282q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f33283r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f33284s;

    public r(a aVar, boolean z10) {
        super(aVar);
        boolean z11;
        if (z10 && aVar.i()) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f33277l = z11;
        this.f33278m = new h1();
        this.f33279n = new g1();
        i1 g10 = aVar.g();
        if (g10 != null) {
            this.f33280o = new p(g10, null, null);
            this.f33284s = true;
        } else {
            this.f33280o = new p(new q(aVar.h()), h1.f3323r, p.f33257e);
        }
    }

    @Override // r5.a
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public final o b(w wVar, v5.e eVar, long j10) {
        boolean z10;
        o oVar = new o(wVar, eVar, j10);
        if (oVar.f33248d == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        yk.j.H0(z10);
        a aVar = this.f33161k;
        oVar.f33248d = aVar;
        if (this.f33283r) {
            Object obj = this.f33280o.f33259d;
            Object obj2 = wVar.f3556a;
            if (obj != null && obj2.equals(p.f33257e)) {
                obj2 = this.f33280o.f33259d;
            }
            oVar.c(wVar.b(obj2));
        } else {
            this.f33281p = oVar;
            if (!this.f33282q) {
                this.f33282q = true;
                w(null, aVar);
            }
        }
        return oVar;
    }

    public final void B(long j10) {
        o oVar = this.f33281p;
        int b10 = this.f33280o.b(oVar.f33245a.f3556a);
        if (b10 == -1) {
            return;
        }
        p pVar = this.f33280o;
        g1 g1Var = this.f33279n;
        pVar.g(b10, g1Var, false);
        long j11 = g1Var.f3319d;
        if (j11 != -9223372036854775807L && j10 >= j11) {
            j10 = Math.max(0L, j11 - 1);
        }
        oVar.f33251g = j10;
    }

    @Override // r5.h, r5.a
    public final void j() {
    }

    @Override // r5.a
    public final void n(u uVar) {
        ((o) uVar).d();
        if (uVar == this.f33281p) {
            this.f33281p = null;
        }
    }

    @Override // r5.h, r5.a
    public final void p() {
        this.f33283r = false;
        this.f33282q = false;
        super.p();
    }

    @Override // r5.f1
    public final w x(w wVar) {
        Object obj = wVar.f3556a;
        Object obj2 = this.f33280o.f33259d;
        if (obj2 != null && obj2.equals(obj)) {
            obj = p.f33257e;
        }
        return wVar.b(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00c9  */
    @Override // r5.f1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void y(b5.i1 r15) {
        /*
            Method dump skipped, instructions count: 210
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: r5.r.y(b5.i1):void");
    }

    @Override // r5.f1
    public final void z() {
        if (!this.f33277l) {
            this.f33282q = true;
            w(null, this.f33161k);
        }
    }
}
