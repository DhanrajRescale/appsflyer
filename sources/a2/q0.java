package a2;

/* loaded from: classes.dex */
public final class q0 implements l0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f108a;

    /* renamed from: b, reason: collision with root package name */
    public final q f109b;

    /* renamed from: c, reason: collision with root package name */
    public final Enum f110c;

    /* renamed from: d, reason: collision with root package name */
    public final Enum f111d;

    public /* synthetic */ q0(q qVar, Enum r22, Enum r32, int i10) {
        this.f108a = i10;
        this.f109b = qVar;
        this.f110c = r22;
        this.f111d = r32;
    }

    @Override // a2.q
    public final int D(int i10) {
        int i11 = this.f108a;
        q qVar = this.f109b;
        switch (i11) {
            case 0:
                return qVar.D(i10);
            default:
                return qVar.D(i10);
        }
    }

    @Override // a2.l0
    public final a1 E(long j10) {
        int W;
        int z10;
        int W2;
        int z11;
        int i10 = this.f108a;
        q qVar = this.f109b;
        Enum r22 = this.f110c;
        int i11 = 32767;
        Enum r42 = this.f111d;
        switch (i10) {
            case 0:
                s0 s0Var = (s0) r42;
                s0 s0Var2 = s0.f119a;
                r0 r0Var = r0.f113b;
                if (s0Var == s0Var2) {
                    if (((r0) r22) == r0Var) {
                        z10 = qVar.D(w2.a.g(j10));
                    } else {
                        z10 = qVar.z(w2.a.g(j10));
                    }
                    if (w2.a.c(j10)) {
                        i11 = w2.a.g(j10);
                    }
                    return new o(z10, i11, 1);
                }
                if (((r0) r22) == r0Var) {
                    W = qVar.e(w2.a.h(j10));
                } else {
                    W = qVar.W(w2.a.h(j10));
                }
                if (w2.a.d(j10)) {
                    i11 = w2.a.h(j10);
                }
                return new o(i11, W, 1);
            default:
                c2.k1 k1Var = (c2.k1) r42;
                c2.k1 k1Var2 = c2.k1.f7752a;
                c2.j1 j1Var = c2.j1.f7743b;
                if (k1Var == k1Var2) {
                    if (((c2.j1) r22) == j1Var) {
                        z11 = qVar.D(w2.a.g(j10));
                    } else {
                        z11 = qVar.z(w2.a.g(j10));
                    }
                    if (w2.a.c(j10)) {
                        i11 = w2.a.g(j10);
                    }
                    return new o(z11, i11, 2);
                }
                if (((c2.j1) r22) == j1Var) {
                    W2 = qVar.e(w2.a.h(j10));
                } else {
                    W2 = qVar.W(w2.a.h(j10));
                }
                if (w2.a.d(j10)) {
                    i11 = w2.a.h(j10);
                }
                return new o(i11, W2, 2);
        }
    }

    @Override // a2.q
    public final int W(int i10) {
        int i11 = this.f108a;
        q qVar = this.f109b;
        switch (i11) {
            case 0:
                return qVar.W(i10);
            default:
                return qVar.W(i10);
        }
    }

    @Override // a2.q
    public final Object a() {
        int i10 = this.f108a;
        q qVar = this.f109b;
        switch (i10) {
            case 0:
                return qVar.a();
            default:
                return qVar.a();
        }
    }

    @Override // a2.q
    public final int e(int i10) {
        int i11 = this.f108a;
        q qVar = this.f109b;
        switch (i11) {
            case 0:
                return qVar.e(i10);
            default:
                return qVar.e(i10);
        }
    }

    @Override // a2.q
    public final int z(int i10) {
        int i11 = this.f108a;
        q qVar = this.f109b;
        switch (i11) {
            case 0:
                return qVar.z(i10);
            default:
                return qVar.z(i10);
        }
    }
}
