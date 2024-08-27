package j3;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class h extends d {

    /* renamed from: s0, reason: collision with root package name */
    public float f20920s0 = -1.0f;

    /* renamed from: t0, reason: collision with root package name */
    public int f20921t0 = -1;

    /* renamed from: u0, reason: collision with root package name */
    public int f20922u0 = -1;

    /* renamed from: v0, reason: collision with root package name */
    public c f20923v0 = this.L;

    /* renamed from: w0, reason: collision with root package name */
    public int f20924w0 = 0;

    /* renamed from: x0, reason: collision with root package name */
    public boolean f20925x0;

    public h() {
        this.T.clear();
        this.T.add(this.f20923v0);
        int length = this.S.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.S[i10] = this.f20923v0;
        }
    }

    @Override // j3.d
    public final boolean C() {
        return this.f20925x0;
    }

    @Override // j3.d
    public final boolean D() {
        return this.f20925x0;
    }

    @Override // j3.d
    public final void V(c3.d dVar, boolean z10) {
        if (this.V == null) {
            return;
        }
        c cVar = this.f20923v0;
        dVar.getClass();
        int n10 = c3.d.n(cVar);
        if (this.f20924w0 == 1) {
            this.f20849a0 = n10;
            this.f20851b0 = 0;
            O(this.V.m());
            T(0);
            return;
        }
        this.f20849a0 = 0;
        this.f20851b0 = n10;
        T(this.V.s());
        O(0);
    }

    public final void W(int i10) {
        this.f20923v0.l(i10);
        this.f20925x0 = true;
    }

    public final void X(int i10) {
        if (this.f20924w0 == i10) {
            return;
        }
        this.f20924w0 = i10;
        ArrayList arrayList = this.T;
        arrayList.clear();
        if (this.f20924w0 == 1) {
            this.f20923v0 = this.K;
        } else {
            this.f20923v0 = this.L;
        }
        arrayList.add(this.f20923v0);
        c[] cVarArr = this.S;
        int length = cVarArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            cVarArr[i11] = this.f20923v0;
        }
    }

    @Override // j3.d
    public final void d(c3.d dVar, boolean z10) {
        boolean z11;
        e eVar = (e) this.V;
        if (eVar == null) {
            return;
        }
        Object k10 = eVar.k(2);
        Object k11 = eVar.k(4);
        d dVar2 = this.V;
        boolean z12 = true;
        if (dVar2 != null && dVar2.f20882r0[0] == 2) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.f20924w0 == 0) {
            k10 = eVar.k(3);
            k11 = eVar.k(5);
            d dVar3 = this.V;
            if (dVar3 == null || dVar3.f20882r0[1] != 2) {
                z12 = false;
            }
            z11 = z12;
        }
        if (this.f20925x0) {
            c cVar = this.f20923v0;
            if (cVar.f20841c) {
                c3.g k12 = dVar.k(cVar);
                dVar.d(k12, this.f20923v0.d());
                if (this.f20921t0 != -1) {
                    if (z11) {
                        dVar.f(dVar.k(k11), k12, 0, 5);
                    }
                } else if (this.f20922u0 != -1 && z11) {
                    c3.g k13 = dVar.k(k11);
                    dVar.f(k12, dVar.k(k10), 0, 5);
                    dVar.f(k13, k12, 0, 5);
                }
                this.f20925x0 = false;
                return;
            }
        }
        if (this.f20921t0 != -1) {
            c3.g k14 = dVar.k(this.f20923v0);
            dVar.e(k14, dVar.k(k10), this.f20921t0, 8);
            if (z11) {
                dVar.f(dVar.k(k11), k14, 0, 5);
                return;
            }
            return;
        }
        if (this.f20922u0 != -1) {
            c3.g k15 = dVar.k(this.f20923v0);
            c3.g k16 = dVar.k(k11);
            dVar.e(k15, k16, -this.f20922u0, 8);
            if (z11) {
                dVar.f(k15, dVar.k(k10), 0, 5);
                dVar.f(k16, k15, 0, 5);
                return;
            }
            return;
        }
        if (this.f20920s0 != -1.0f) {
            c3.g k17 = dVar.k(this.f20923v0);
            c3.g k18 = dVar.k(k11);
            float f10 = this.f20920s0;
            c3.c l10 = dVar.l();
            l10.f7902d.a(k17, -1.0f);
            l10.f7902d.a(k18, f10);
            dVar.c(l10);
        }
    }

    @Override // j3.d
    public final boolean e() {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x000e, code lost:
    
        if (r4 != 4) goto L21;
     */
    @Override // j3.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final j3.c k(int r4) {
        /*
            r3 = this;
            r0 = 0
            if (r4 == 0) goto L20
            r1 = 1
            int r4 = r4 - r1
            if (r4 == r1) goto L18
            r2 = 2
            if (r4 == r2) goto L11
            r2 = 3
            if (r4 == r2) goto L18
            r1 = 4
            if (r4 == r1) goto L11
            goto L1f
        L11:
            int r4 = r3.f20924w0
            if (r4 != 0) goto L1f
            j3.c r4 = r3.f20923v0
            return r4
        L18:
            int r4 = r3.f20924w0
            if (r4 != r1) goto L1f
            j3.c r4 = r3.f20923v0
            return r4
        L1f:
            return r0
        L20:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j3.h.k(int):j3.c");
    }
}
