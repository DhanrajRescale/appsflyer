package j3;

import com.airbnb.deeplinkdispatch.UrlTreeKt;

/* loaded from: classes.dex */
public final class a extends j {

    /* renamed from: u0, reason: collision with root package name */
    public int f20818u0 = 0;

    /* renamed from: v0, reason: collision with root package name */
    public boolean f20819v0 = true;

    /* renamed from: w0, reason: collision with root package name */
    public int f20820w0 = 0;

    /* renamed from: x0, reason: collision with root package name */
    public boolean f20821x0 = false;

    @Override // j3.d
    public final boolean C() {
        return this.f20821x0;
    }

    @Override // j3.d
    public final boolean D() {
        return this.f20821x0;
    }

    public final boolean Y() {
        int i10;
        int i11;
        int i12;
        boolean z10 = true;
        int i13 = 0;
        while (true) {
            i10 = this.f20927t0;
            if (i13 >= i10) {
                break;
            }
            d dVar = this.f20926s0[i13];
            if ((this.f20819v0 || dVar.e()) && ((((i11 = this.f20818u0) == 0 || i11 == 1) && !dVar.C()) || (((i12 = this.f20818u0) == 2 || i12 == 3) && !dVar.D()))) {
                z10 = false;
            }
            i13++;
        }
        if (!z10 || i10 <= 0) {
            return false;
        }
        int i14 = 0;
        boolean z11 = false;
        for (int i15 = 0; i15 < this.f20927t0; i15++) {
            d dVar2 = this.f20926s0[i15];
            if (this.f20819v0 || dVar2.e()) {
                if (!z11) {
                    int i16 = this.f20818u0;
                    if (i16 == 0) {
                        i14 = dVar2.k(2).d();
                    } else if (i16 == 1) {
                        i14 = dVar2.k(4).d();
                    } else if (i16 == 2) {
                        i14 = dVar2.k(3).d();
                    } else if (i16 == 3) {
                        i14 = dVar2.k(5).d();
                    }
                    z11 = true;
                }
                int i17 = this.f20818u0;
                if (i17 == 0) {
                    i14 = Math.min(i14, dVar2.k(2).d());
                } else if (i17 == 1) {
                    i14 = Math.max(i14, dVar2.k(4).d());
                } else if (i17 == 2) {
                    i14 = Math.min(i14, dVar2.k(3).d());
                } else if (i17 == 3) {
                    i14 = Math.max(i14, dVar2.k(5).d());
                }
            }
        }
        int i18 = i14 + this.f20820w0;
        int i19 = this.f20818u0;
        if (i19 != 0 && i19 != 1) {
            N(i18, i18);
        } else {
            M(i18, i18);
        }
        this.f20821x0 = true;
        return true;
    }

    public final int Z() {
        int i10 = this.f20818u0;
        if (i10 == 0 || i10 == 1) {
            return 0;
        }
        return (i10 == 2 || i10 == 3) ? 1 : -1;
    }

    @Override // j3.d
    public final void d(c3.d dVar, boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        int i10;
        int i11;
        int i12;
        int i13;
        c[] cVarArr = this.S;
        c cVar = this.K;
        cVarArr[0] = cVar;
        c cVar2 = this.L;
        int i14 = 2;
        cVarArr[2] = cVar2;
        c cVar3 = this.M;
        cVarArr[1] = cVar3;
        c cVar4 = this.N;
        cVarArr[3] = cVar4;
        for (c cVar5 : cVarArr) {
            cVar5.f20847i = dVar.k(cVar5);
        }
        int i15 = this.f20818u0;
        if (i15 >= 0 && i15 < 4) {
            c cVar6 = cVarArr[i15];
            if (!this.f20821x0) {
                Y();
            }
            if (this.f20821x0) {
                this.f20821x0 = false;
                int i16 = this.f20818u0;
                if (i16 != 0 && i16 != 1) {
                    if (i16 == 2 || i16 == 3) {
                        dVar.d(cVar2.f20847i, this.f20851b0);
                        dVar.d(cVar4.f20847i, this.f20851b0);
                        return;
                    }
                    return;
                }
                dVar.d(cVar.f20847i, this.f20849a0);
                dVar.d(cVar3.f20847i, this.f20849a0);
                return;
            }
            for (int i17 = 0; i17 < this.f20927t0; i17++) {
                d dVar2 = this.f20926s0[i17];
                if ((this.f20819v0 || dVar2.e()) && ((((i13 = this.f20818u0) == 0 || i13 == 1) && dVar2.f20882r0[0] == 3 && dVar2.K.f20844f != null && dVar2.M.f20844f != null) || ((i13 == 2 || i13 == 3) && dVar2.f20882r0[1] == 3 && dVar2.L.f20844f != null && dVar2.N.f20844f != null))) {
                    z11 = true;
                    break;
                }
            }
            z11 = false;
            if (!cVar.g() && !cVar3.g()) {
                z12 = false;
            } else {
                z12 = true;
            }
            if (!cVar2.g() && !cVar4.g()) {
                z13 = false;
            } else {
                z13 = true;
            }
            if (!z11 && (((i12 = this.f20818u0) == 0 && z12) || ((i12 == 2 && z13) || ((i12 == 1 && z12) || (i12 == 3 && z13))))) {
                i10 = 5;
            } else {
                i10 = 4;
            }
            int i18 = 0;
            while (i18 < this.f20927t0) {
                d dVar3 = this.f20926s0[i18];
                if (this.f20819v0 || dVar3.e()) {
                    c3.g k10 = dVar.k(dVar3.S[this.f20818u0]);
                    int i19 = this.f20818u0;
                    c cVar7 = dVar3.S[i19];
                    cVar7.f20847i = k10;
                    c cVar8 = cVar7.f20844f;
                    if (cVar8 != null && cVar8.f20842d == this) {
                        i11 = cVar7.f20845g;
                    } else {
                        i11 = 0;
                    }
                    if (i19 != 0 && i19 != i14) {
                        c3.g gVar = cVar6.f20847i;
                        int i20 = this.f20820w0 + i11;
                        c3.c l10 = dVar.l();
                        c3.g m10 = dVar.m();
                        m10.f7931d = 0;
                        l10.b(gVar, k10, m10, i20);
                        dVar.c(l10);
                    } else {
                        c3.g gVar2 = cVar6.f20847i;
                        int i21 = this.f20820w0 - i11;
                        c3.c l11 = dVar.l();
                        c3.g m11 = dVar.m();
                        m11.f7931d = 0;
                        l11.c(gVar2, k10, m11, i21);
                        dVar.c(l11);
                    }
                    dVar.e(cVar6.f20847i, k10, this.f20820w0 + i11, i10);
                }
                i18++;
                i14 = 2;
            }
            int i22 = this.f20818u0;
            if (i22 == 0) {
                dVar.e(cVar3.f20847i, cVar.f20847i, 0, 8);
                dVar.e(cVar.f20847i, this.V.M.f20847i, 0, 4);
                dVar.e(cVar.f20847i, this.V.K.f20847i, 0, 0);
                return;
            }
            if (i22 == 1) {
                dVar.e(cVar.f20847i, cVar3.f20847i, 0, 8);
                dVar.e(cVar.f20847i, this.V.K.f20847i, 0, 4);
                dVar.e(cVar.f20847i, this.V.M.f20847i, 0, 0);
            } else if (i22 == 2) {
                dVar.e(cVar4.f20847i, cVar2.f20847i, 0, 8);
                dVar.e(cVar2.f20847i, this.V.N.f20847i, 0, 4);
                dVar.e(cVar2.f20847i, this.V.L.f20847i, 0, 0);
            } else if (i22 == 3) {
                dVar.e(cVar2.f20847i, cVar4.f20847i, 0, 8);
                dVar.e(cVar2.f20847i, this.V.L.f20847i, 0, 4);
                dVar.e(cVar2.f20847i, this.V.N.f20847i, 0, 0);
            }
        }
    }

    @Override // j3.d
    public final boolean e() {
        return true;
    }

    @Override // j3.d
    public final String toString() {
        String o10 = nn.d.o(new StringBuilder("[Barrier] "), this.f20867j0, " {");
        for (int i10 = 0; i10 < this.f20927t0; i10++) {
            d dVar = this.f20926s0[i10];
            if (i10 > 0) {
                o10 = jr.h.r(o10, ", ");
            }
            StringBuilder p10 = da.e.p(o10);
            p10.append(dVar.f20867j0);
            o10 = p10.toString();
        }
        return jr.h.r(o10, UrlTreeKt.componentParamSuffix);
    }
}
