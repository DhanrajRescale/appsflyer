package r5;

import i5.j1;

/* loaded from: classes.dex */
public final class d0 implements u, t {

    /* renamed from: a, reason: collision with root package name */
    public final u f33120a;

    /* renamed from: b, reason: collision with root package name */
    public final long f33121b;

    /* renamed from: c, reason: collision with root package name */
    public t f33122c;

    public d0(u uVar, long j10) {
        this.f33120a = uVar;
        this.f33121b = j10;
    }

    @Override // r5.u
    public final void A(t tVar, long j10) {
        this.f33122c = tVar;
        this.f33120a.A(this, j10 - this.f33121b);
    }

    @Override // r5.u
    public final e1 D() {
        return this.f33120a.D();
    }

    @Override // r5.x0
    public final long G() {
        long G = this.f33120a.G();
        if (G == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return this.f33121b + G;
    }

    @Override // r5.x0
    public final void J(long j10) {
        this.f33120a.J(j10 - this.f33121b);
    }

    @Override // r5.t
    public final void a(u uVar) {
        t tVar = this.f33122c;
        tVar.getClass();
        tVar.a(this);
    }

    @Override // r5.w0
    public final void b(x0 x0Var) {
        t tVar = this.f33122c;
        tVar.getClass();
        tVar.b(this);
    }

    @Override // r5.u
    public final long g(long j10, j1 j1Var) {
        long j11 = this.f33121b;
        return this.f33120a.g(j10 - j11, j1Var) + j11;
    }

    @Override // r5.x0
    public final long i() {
        long i10 = this.f33120a.i();
        if (i10 == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return this.f33121b + i10;
    }

    @Override // r5.u
    public final long o(u5.s[] sVarArr, boolean[] zArr, v0[] v0VarArr, boolean[] zArr2, long j10) {
        v0[] v0VarArr2 = new v0[v0VarArr.length];
        int i10 = 0;
        while (true) {
            v0 v0Var = null;
            if (i10 >= v0VarArr.length) {
                break;
            }
            e0 e0Var = (e0) v0VarArr[i10];
            if (e0Var != null) {
                v0Var = e0Var.f33143a;
            }
            v0VarArr2[i10] = v0Var;
            i10++;
        }
        u uVar = this.f33120a;
        long j11 = this.f33121b;
        long o10 = uVar.o(sVarArr, zArr, v0VarArr2, zArr2, j10 - j11);
        for (int i11 = 0; i11 < v0VarArr.length; i11++) {
            v0 v0Var2 = v0VarArr2[i11];
            if (v0Var2 == null) {
                v0VarArr[i11] = null;
            } else {
                v0 v0Var3 = v0VarArr[i11];
                if (v0Var3 == null || ((e0) v0Var3).f33143a != v0Var2) {
                    v0VarArr[i11] = new e0(v0Var2, j11);
                }
            }
        }
        return o10 + j11;
    }

    @Override // r5.u
    public final void p() {
        this.f33120a.p();
    }

    @Override // r5.u
    public final long q(long j10) {
        long j11 = this.f33121b;
        return this.f33120a.q(j10 - j11) + j11;
    }

    @Override // r5.u
    public final void r(long j10) {
        this.f33120a.r(j10 - this.f33121b);
    }

    @Override // r5.x0
    public final boolean s(long j10) {
        return this.f33120a.s(j10 - this.f33121b);
    }

    @Override // r5.x0
    public final boolean u() {
        return this.f33120a.u();
    }

    @Override // r5.u
    public final long w() {
        long w10 = this.f33120a.w();
        if (w10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return this.f33121b + w10;
    }
}
