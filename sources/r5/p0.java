package r5;

import android.net.Uri;
import android.os.Looper;

/* loaded from: classes.dex */
public final class p0 extends a {

    /* renamed from: h, reason: collision with root package name */
    public final b5.k0 f33260h;

    /* renamed from: i, reason: collision with root package name */
    public final b5.f0 f33261i;

    /* renamed from: j, reason: collision with root package name */
    public final g5.e f33262j;

    /* renamed from: k, reason: collision with root package name */
    public final b3.t f33263k;

    /* renamed from: l, reason: collision with root package name */
    public final n5.p f33264l;

    /* renamed from: m, reason: collision with root package name */
    public final kq.e f33265m;

    /* renamed from: n, reason: collision with root package name */
    public final int f33266n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f33267o;

    /* renamed from: p, reason: collision with root package name */
    public long f33268p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f33269q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f33270r;

    /* renamed from: s, reason: collision with root package name */
    public g5.u f33271s;

    public p0(b5.k0 k0Var, g5.e eVar, b3.t tVar, n5.p pVar, kq.e eVar2, int i10) {
        b5.f0 f0Var = k0Var.f3390b;
        f0Var.getClass();
        this.f33261i = f0Var;
        this.f33260h = k0Var;
        this.f33262j = eVar;
        this.f33263k = tVar;
        this.f33264l = pVar;
        this.f33265m = eVar2;
        this.f33266n = i10;
        this.f33267o = true;
        this.f33268p = -9223372036854775807L;
    }

    @Override // r5.a
    public final u b(w wVar, v5.e eVar, long j10) {
        g5.f a10 = this.f33262j.a();
        g5.u uVar = this.f33271s;
        if (uVar != null) {
            a10.m(uVar);
        }
        b5.f0 f0Var = this.f33261i;
        Uri uri = f0Var.f3289a;
        yk.j.I0(this.f33081g);
        return new m0(uri, a10, new h.c((z5.s) this.f33263k.f3152b), this.f33264l, new n5.l(this.f33078d.f28316c, 0, wVar), this.f33265m, a(wVar), this, eVar, f0Var.f3294f, this.f33266n);
    }

    @Override // r5.a
    public final b5.k0 h() {
        return this.f33260h;
    }

    @Override // r5.a
    public final void j() {
    }

    @Override // r5.a
    public final void l(g5.u uVar) {
        this.f33271s = uVar;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        j5.d0 d0Var = this.f33081g;
        yk.j.I0(d0Var);
        n5.p pVar = this.f33264l;
        pVar.c(myLooper, d0Var);
        pVar.a();
        s();
    }

    @Override // r5.a
    public final void n(u uVar) {
        m0 m0Var = (m0) uVar;
        if (m0Var.f33238v) {
            for (u0 u0Var : m0Var.f33235s) {
                u0Var.i();
                n5.i iVar = u0Var.f33308h;
                if (iVar != null) {
                    iVar.c(u0Var.f33305e);
                    u0Var.f33308h = null;
                    u0Var.f33307g = null;
                }
            }
        }
        m0Var.f33227k.d(m0Var);
        m0Var.f33232p.removeCallbacksAndMessages(null);
        m0Var.f33233q = null;
        m0Var.Y = true;
    }

    @Override // r5.a
    public final void p() {
        this.f33264l.release();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [r5.n0] */
    /* JADX WARN: Type inference failed for: r7v0, types: [r5.a, r5.p0] */
    public final void s() {
        z0 z0Var = new z0(this.f33268p, this.f33269q, this.f33270r, this.f33260h);
        if (this.f33267o) {
            z0Var = new n0(this, z0Var);
        }
        m(z0Var);
    }

    public final void t(boolean z10, boolean z11, long j10) {
        if (j10 == -9223372036854775807L) {
            j10 = this.f33268p;
        }
        if (!this.f33267o && this.f33268p == j10 && this.f33269q == z10 && this.f33270r == z11) {
            return;
        }
        this.f33268p = j10;
        this.f33269q = z10;
        this.f33270r = z11;
        this.f33267o = false;
        s();
    }
}
