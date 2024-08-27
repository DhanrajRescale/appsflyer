package j3;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class g extends l {

    /* renamed from: c1, reason: collision with root package name */
    public d[] f20918c1;
    public int F0 = -1;
    public int G0 = -1;
    public int H0 = -1;
    public int I0 = -1;
    public int J0 = -1;
    public int K0 = -1;
    public float L0 = 0.5f;
    public float M0 = 0.5f;
    public float N0 = 0.5f;
    public float O0 = 0.5f;
    public float P0 = 0.5f;
    public float Q0 = 0.5f;
    public int R0 = 0;
    public int S0 = 0;
    public int T0 = 2;
    public int U0 = 2;
    public int V0 = 0;
    public int W0 = -1;
    public int X0 = 0;
    public final ArrayList Y0 = new ArrayList();
    public d[] Z0 = null;

    /* renamed from: a1, reason: collision with root package name */
    public d[] f20916a1 = null;

    /* renamed from: b1, reason: collision with root package name */
    public int[] f20917b1 = null;

    /* renamed from: d1, reason: collision with root package name */
    public int f20919d1 = 0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:80:0x076f  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0785  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x07a4  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x07a6  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0788  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0775  */
    @Override // j3.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void Y(int r40, int r41, int r42, int r43) {
        /*
            Method dump skipped, instructions count: 1962
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j3.g.Y(int, int, int, int):void");
    }

    public final int a0(int i10, d dVar) {
        if (dVar == null) {
            return 0;
        }
        int[] iArr = dVar.f20882r0;
        if (iArr[1] == 3) {
            int i11 = dVar.f20885u;
            if (i11 == 0) {
                return 0;
            }
            if (i11 == 2) {
                int i12 = (int) (dVar.B * i10);
                if (i12 != dVar.m()) {
                    dVar.f20860g = true;
                    Z(dVar, iArr[0], dVar.s(), 1, i12);
                }
                return i12;
            }
            if (i11 == 1) {
                return dVar.m();
            }
            if (i11 == 3) {
                return (int) ((dVar.s() * dVar.Y) + 0.5f);
            }
        }
        return dVar.m();
    }

    public final int b0(int i10, d dVar) {
        if (dVar == null) {
            return 0;
        }
        int[] iArr = dVar.f20882r0;
        if (iArr[0] == 3) {
            int i11 = dVar.f20884t;
            if (i11 == 0) {
                return 0;
            }
            if (i11 == 2) {
                int i12 = (int) (dVar.f20889y * i10);
                if (i12 != dVar.s()) {
                    dVar.f20860g = true;
                    Z(dVar, 1, i12, iArr[1], dVar.m());
                }
                return i12;
            }
            if (i11 == 1) {
                return dVar.s();
            }
            if (i11 == 3) {
                return (int) ((dVar.m() * dVar.Y) + 0.5f);
            }
        }
        return dVar.s();
    }

    @Override // j3.d
    public final void d(c3.d dVar, boolean z10) {
        boolean z11;
        boolean z12;
        d dVar2;
        float f10;
        int i10;
        boolean z13;
        super.d(dVar, z10);
        d dVar3 = this.V;
        if (dVar3 != null && ((e) dVar3).f20895x0) {
            z11 = true;
        } else {
            z11 = false;
        }
        int i11 = this.V0;
        ArrayList arrayList = this.Y0;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        int size = arrayList.size();
                        for (int i12 = 0; i12 < size; i12++) {
                            f fVar = (f) arrayList.get(i12);
                            if (i12 == size - 1) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            fVar.b(i12, z11, z13);
                        }
                    }
                } else if (this.f20917b1 != null && this.f20916a1 != null && this.Z0 != null) {
                    for (int i13 = 0; i13 < this.f20919d1; i13++) {
                        this.f20918c1[i13].F();
                    }
                    int[] iArr = this.f20917b1;
                    int i14 = iArr[0];
                    int i15 = iArr[1];
                    float f11 = this.L0;
                    d dVar4 = null;
                    int i16 = 0;
                    while (i16 < i14) {
                        if (z11) {
                            i10 = (i14 - i16) - 1;
                            f10 = 1.0f - this.L0;
                        } else {
                            f10 = f11;
                            i10 = i16;
                        }
                        d dVar5 = this.f20916a1[i10];
                        if (dVar5 != null && dVar5.f20865i0 != 8) {
                            c cVar = dVar5.K;
                            if (i16 == 0) {
                                dVar5.h(cVar, this.K, this.f20933y0);
                                dVar5.f20869k0 = this.F0;
                                dVar5.f20859f0 = f10;
                            }
                            if (i16 == i14 - 1) {
                                dVar5.h(dVar5.M, this.M, this.f20934z0);
                            }
                            if (i16 > 0 && dVar4 != null) {
                                int i17 = this.R0;
                                c cVar2 = dVar4.M;
                                dVar5.h(cVar, cVar2, i17);
                                dVar4.h(cVar2, cVar, 0);
                            }
                            dVar4 = dVar5;
                        }
                        i16++;
                        f11 = f10;
                    }
                    for (int i18 = 0; i18 < i15; i18++) {
                        d dVar6 = this.Z0[i18];
                        if (dVar6 != null && dVar6.f20865i0 != 8) {
                            c cVar3 = dVar6.L;
                            if (i18 == 0) {
                                dVar6.h(cVar3, this.L, this.f20929u0);
                                dVar6.f20871l0 = this.G0;
                                dVar6.f20861g0 = this.M0;
                            }
                            if (i18 == i15 - 1) {
                                dVar6.h(dVar6.N, this.N, this.f20930v0);
                            }
                            if (i18 > 0 && dVar4 != null) {
                                int i19 = this.S0;
                                c cVar4 = dVar4.N;
                                dVar6.h(cVar3, cVar4, i19);
                                dVar4.h(cVar4, cVar3, 0);
                            }
                            dVar4 = dVar6;
                        }
                    }
                    for (int i20 = 0; i20 < i14; i20++) {
                        for (int i21 = 0; i21 < i15; i21++) {
                            int i22 = (i21 * i14) + i20;
                            if (this.X0 == 1) {
                                i22 = (i20 * i15) + i21;
                            }
                            d[] dVarArr = this.f20918c1;
                            if (i22 < dVarArr.length && (dVar2 = dVarArr[i22]) != null && dVar2.f20865i0 != 8) {
                                d dVar7 = this.f20916a1[i20];
                                d dVar8 = this.Z0[i21];
                                if (dVar2 != dVar7) {
                                    dVar2.h(dVar2.K, dVar7.K, 0);
                                    dVar2.h(dVar2.M, dVar7.M, 0);
                                }
                                if (dVar2 != dVar8) {
                                    dVar2.h(dVar2.L, dVar8.L, 0);
                                    dVar2.h(dVar2.N, dVar8.N, 0);
                                }
                            }
                        }
                    }
                }
            } else {
                int size2 = arrayList.size();
                for (int i23 = 0; i23 < size2; i23++) {
                    f fVar2 = (f) arrayList.get(i23);
                    if (i23 == size2 - 1) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    fVar2.b(i23, z11, z12);
                }
            }
        } else if (arrayList.size() > 0) {
            ((f) arrayList.get(0)).b(0, z11, true);
        }
        this.A0 = false;
    }
}
