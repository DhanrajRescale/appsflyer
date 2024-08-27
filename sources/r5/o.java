package r5;

import i5.j1;

/* loaded from: classes.dex */
public final class o implements u, t {

    /* renamed from: a, reason: collision with root package name */
    public final w f33245a;

    /* renamed from: b, reason: collision with root package name */
    public final long f33246b;

    /* renamed from: c, reason: collision with root package name */
    public final v5.e f33247c;

    /* renamed from: d, reason: collision with root package name */
    public a f33248d;

    /* renamed from: e, reason: collision with root package name */
    public u f33249e;

    /* renamed from: f, reason: collision with root package name */
    public t f33250f;

    /* renamed from: g, reason: collision with root package name */
    public long f33251g = -9223372036854775807L;

    public o(w wVar, v5.e eVar, long j10) {
        this.f33245a = wVar;
        this.f33247c = eVar;
        this.f33246b = j10;
    }

    @Override // r5.u
    public final void A(t tVar, long j10) {
        this.f33250f = tVar;
        u uVar = this.f33249e;
        if (uVar != null) {
            long j11 = this.f33251g;
            if (j11 == -9223372036854775807L) {
                j11 = this.f33246b;
            }
            uVar.A(this, j11);
        }
    }

    @Override // r5.u
    public final e1 D() {
        u uVar = this.f33249e;
        int i10 = e5.x.f15050a;
        return uVar.D();
    }

    @Override // r5.x0
    public final long G() {
        u uVar = this.f33249e;
        int i10 = e5.x.f15050a;
        return uVar.G();
    }

    @Override // r5.x0
    public final void J(long j10) {
        u uVar = this.f33249e;
        int i10 = e5.x.f15050a;
        uVar.J(j10);
    }

    @Override // r5.t
    public final void a(u uVar) {
        t tVar = this.f33250f;
        int i10 = e5.x.f15050a;
        tVar.a(this);
    }

    @Override // r5.w0
    public final void b(x0 x0Var) {
        t tVar = this.f33250f;
        int i10 = e5.x.f15050a;
        tVar.b(this);
    }

    public final void c(w wVar) {
        long j10 = this.f33251g;
        if (j10 == -9223372036854775807L) {
            j10 = this.f33246b;
        }
        a aVar = this.f33248d;
        aVar.getClass();
        u b10 = aVar.b(wVar, this.f33247c, j10);
        this.f33249e = b10;
        if (this.f33250f != null) {
            b10.A(this, j10);
        }
    }

    public final void d() {
        if (this.f33249e != null) {
            a aVar = this.f33248d;
            aVar.getClass();
            aVar.n(this.f33249e);
        }
    }

    @Override // r5.u
    public final long g(long j10, j1 j1Var) {
        u uVar = this.f33249e;
        int i10 = e5.x.f15050a;
        return uVar.g(j10, j1Var);
    }

    @Override // r5.x0
    public final long i() {
        u uVar = this.f33249e;
        int i10 = e5.x.f15050a;
        return uVar.i();
    }

    @Override // r5.u
    public final long o(u5.s[] sVarArr, boolean[] zArr, v0[] v0VarArr, boolean[] zArr2, long j10) {
        long j11;
        long j12 = this.f33251g;
        if (j12 != -9223372036854775807L && j10 == this.f33246b) {
            this.f33251g = -9223372036854775807L;
            j11 = j12;
        } else {
            j11 = j10;
        }
        u uVar = this.f33249e;
        int i10 = e5.x.f15050a;
        return uVar.o(sVarArr, zArr, v0VarArr, zArr2, j11);
    }

    @Override // r5.u
    public final void p() {
        u uVar = this.f33249e;
        if (uVar != null) {
            uVar.p();
            return;
        }
        a aVar = this.f33248d;
        if (aVar != null) {
            aVar.j();
        }
    }

    @Override // r5.u
    public final long q(long j10) {
        u uVar = this.f33249e;
        int i10 = e5.x.f15050a;
        return uVar.q(j10);
    }

    @Override // r5.u
    public final void r(long j10) {
        u uVar = this.f33249e;
        int i10 = e5.x.f15050a;
        uVar.r(j10);
    }

    @Override // r5.x0
    public final boolean s(long j10) {
        u uVar = this.f33249e;
        if (uVar != null && uVar.s(j10)) {
            return true;
        }
        return false;
    }

    @Override // r5.x0
    public final boolean u() {
        u uVar = this.f33249e;
        if (uVar != null && uVar.u()) {
            return true;
        }
        return false;
    }

    @Override // r5.u
    public final long w() {
        u uVar = this.f33249e;
        int i10 = e5.x.f15050a;
        return uVar.w();
    }
}
