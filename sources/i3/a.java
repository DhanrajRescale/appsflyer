package i3;

import j3.c;
import j3.d;
import j3.e;
import j3.l;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class a extends l {
    public e F0;
    public d[] G0;
    public boolean H0;
    public int I0;
    public int J0;
    public int K0;
    public int L0;
    public float M0;
    public float N0;
    public String O0;
    public String P0;
    public String Q0;
    public String R0;
    public int S0;
    public int T0;
    public boolean[][] U0;
    public HashSet V0;
    public int[][] W0;
    public int[] X0;
    public int[][] Y0;
    public int Z0;

    /* renamed from: a1, reason: collision with root package name */
    public boolean f19332a1;

    /* renamed from: b1, reason: collision with root package name */
    public boolean f19333b1;

    public static void a0(d dVar) {
        dVar.f20873m0[1] = -1.0f;
        dVar.L.j();
        dVar.N.j();
        dVar.O.j();
    }

    public static float[] j0(int i10, String str) {
        float[] fArr = null;
        if (str != null && !str.trim().isEmpty()) {
            String[] split = str.split(",");
            if (split.length != i10) {
                return null;
            }
            fArr = new float[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                fArr[i11] = Float.parseFloat(split[i11].trim());
            }
        }
        return fArr;
    }

    @Override // j3.l
    public final void Y(int i10, int i11, int i12, int i13) {
        int[][] i02;
        this.F0 = (e) this.V;
        if (this.I0 >= 1 && this.K0 >= 1) {
            int[] iArr = this.X0;
            if (iArr != null) {
                for (int i14 : iArr) {
                    if (i14 != 0) {
                        if (i14 == 1) {
                            this.f19332a1 = true;
                        }
                    } else {
                        this.f19333b1 = true;
                    }
                }
            }
            this.T0 = 0;
            String str = this.R0;
            if (str != null && !str.trim().isEmpty() && (i02 = i0(this.R0, false)) != null) {
                e0(i02);
            }
            String str2 = this.Q0;
            if (str2 != null && !str2.trim().isEmpty()) {
                this.Y0 = i0(this.Q0, true);
            }
            int max = Math.max(this.I0, this.K0);
            d[] dVarArr = this.G0;
            if (dVarArr == null) {
                this.G0 = new d[max];
                int i15 = 0;
                while (true) {
                    d[] dVarArr2 = this.G0;
                    if (i15 >= dVarArr2.length) {
                        break;
                    }
                    d dVar = new d();
                    int[] iArr2 = dVar.f20882r0;
                    iArr2[0] = 3;
                    iArr2[1] = 3;
                    dVar.f20870l = String.valueOf(dVar.hashCode());
                    dVarArr2[i15] = dVar;
                    i15++;
                }
            } else if (max != dVarArr.length) {
                d[] dVarArr3 = new d[max];
                for (int i16 = 0; i16 < max; i16++) {
                    d[] dVarArr4 = this.G0;
                    if (i16 < dVarArr4.length) {
                        dVarArr3[i16] = dVarArr4[i16];
                    } else {
                        d dVar2 = new d();
                        int[] iArr3 = dVar2.f20882r0;
                        iArr3[0] = 3;
                        iArr3[1] = 3;
                        dVar2.f20870l = String.valueOf(dVar2.hashCode());
                        dVarArr3[i16] = dVar2;
                    }
                }
                while (true) {
                    d[] dVarArr5 = this.G0;
                    if (max >= dVarArr5.length) {
                        break;
                    }
                    d dVar3 = dVarArr5[max];
                    this.F0.f20935s0.remove(dVar3);
                    dVar3.E();
                    max++;
                }
                this.G0 = dVarArr3;
            }
            int[][] iArr4 = this.Y0;
            if (iArr4 != null) {
                f0(iArr4);
            }
        }
        e eVar = this.F0;
        d[] dVarArr6 = this.G0;
        eVar.getClass();
        for (d dVar4 : dVarArr6) {
            eVar.W(dVar4);
        }
    }

    public final void b0(d dVar, int i10, int i11, int i12, int i13) {
        dVar.K.a(this.G0[i11].K, 0);
        dVar.L.a(this.G0[i10].L, 0);
        dVar.M.a(this.G0[(i11 + i13) - 1].M, 0);
        dVar.N.a(this.G0[(i10 + i12) - 1].N, 0);
    }

    public final int c0(int i10) {
        if (this.S0 == 1) {
            return i10 / this.I0;
        }
        return i10 % this.K0;
    }

    @Override // j3.d
    public final void d(c3.d dVar, boolean z10) {
        int i10;
        int i11;
        int[][] iArr;
        int i12;
        super.d(dVar, z10);
        int max = Math.max(this.I0, this.K0);
        d dVar2 = this.G0[0];
        float[] j02 = j0(this.I0, this.O0);
        int i13 = this.I0;
        c cVar = this.N;
        c cVar2 = this.L;
        if (i13 == 1) {
            a0(dVar2);
            dVar2.L.a(cVar2, 0);
            dVar2.N.a(cVar, 0);
        } else {
            int i14 = 0;
            while (true) {
                i10 = this.I0;
                if (i14 >= i10) {
                    break;
                }
                d dVar3 = this.G0[i14];
                a0(dVar3);
                if (j02 != null) {
                    dVar3.f20873m0[1] = j02[i14];
                }
                c cVar3 = dVar3.L;
                if (i14 > 0) {
                    cVar3.a(this.G0[i14 - 1].N, 0);
                } else {
                    cVar3.a(cVar2, 0);
                }
                int i15 = this.I0 - 1;
                c cVar4 = dVar3.N;
                if (i14 < i15) {
                    cVar4.a(this.G0[i14 + 1].L, 0);
                } else {
                    cVar4.a(cVar, 0);
                }
                if (i14 > 0) {
                    cVar3.f20845g = (int) this.N0;
                }
                i14++;
            }
            while (i10 < max) {
                d dVar4 = this.G0[i10];
                a0(dVar4);
                dVar4.L.a(cVar2, 0);
                dVar4.N.a(cVar, 0);
                i10++;
            }
        }
        int max2 = Math.max(this.I0, this.K0);
        d dVar5 = this.G0[0];
        float[] j03 = j0(this.K0, this.P0);
        int i16 = this.K0;
        c cVar5 = this.M;
        c cVar6 = this.K;
        if (i16 == 1) {
            dVar5.f20873m0[0] = -1.0f;
            dVar5.K.j();
            dVar5.M.j();
            dVar5.K.a(cVar6, 0);
            dVar5.M.a(cVar5, 0);
        } else {
            int i17 = 0;
            while (true) {
                i11 = this.K0;
                if (i17 >= i11) {
                    break;
                }
                d dVar6 = this.G0[i17];
                dVar6.f20873m0[0] = -1.0f;
                dVar6.K.j();
                dVar6.M.j();
                if (j03 != null) {
                    dVar6.f20873m0[0] = j03[i17];
                }
                c cVar7 = dVar6.K;
                if (i17 > 0) {
                    cVar7.a(this.G0[i17 - 1].M, 0);
                } else {
                    cVar7.a(cVar6, 0);
                }
                int i18 = this.K0 - 1;
                c cVar8 = dVar6.M;
                if (i17 < i18) {
                    cVar8.a(this.G0[i17 + 1].K, 0);
                } else {
                    cVar8.a(cVar5, 0);
                }
                if (i17 > 0) {
                    cVar7.f20845g = (int) this.M0;
                }
                i17++;
            }
            while (i11 < max2) {
                d dVar7 = this.G0[i11];
                dVar7.f20873m0[0] = -1.0f;
                dVar7.K.j();
                dVar7.M.j();
                dVar7.K.a(cVar6, 0);
                dVar7.M.a(cVar5, 0);
                i11++;
            }
        }
        for (int i19 = 0; i19 < this.f20927t0; i19++) {
            if (!this.V0.contains(this.f20926s0[i19].f20870l)) {
                boolean z11 = false;
                int i20 = 0;
                while (true) {
                    if (z11) {
                        break;
                    }
                    i20 = this.T0;
                    if (i20 >= this.I0 * this.K0) {
                        i20 = -1;
                        break;
                    }
                    int d02 = d0(i20);
                    int c02 = c0(this.T0);
                    boolean[] zArr = this.U0[d02];
                    if (zArr[c02]) {
                        zArr[c02] = false;
                        z11 = true;
                    }
                    this.T0++;
                }
                int d03 = d0(i20);
                int c03 = c0(i20);
                if (i20 != -1) {
                    if (this.f19332a1 && (iArr = this.Y0) != null && (i12 = this.Z0) < iArr.length) {
                        int[] iArr2 = iArr[i12];
                        if (iArr2[0] == i20) {
                            this.U0[d03][c03] = true;
                            if (h0(d03, c03, iArr2[1], iArr2[2])) {
                                d dVar8 = this.f20926s0[i19];
                                int[] iArr3 = this.Y0[this.Z0];
                                b0(dVar8, d03, c03, iArr3[1], iArr3[2]);
                                this.Z0++;
                            }
                        }
                    }
                    b0(this.f20926s0[i19], d03, c03, 1, 1);
                } else {
                    return;
                }
            }
        }
    }

    public final int d0(int i10) {
        if (this.S0 == 1) {
            return i10 % this.I0;
        }
        return i10 / this.K0;
    }

    public final void e0(int[][] iArr) {
        for (int[] iArr2 : iArr) {
            if (!h0(d0(iArr2[0]), c0(iArr2[0]), iArr2[1], iArr2[2])) {
                return;
            }
        }
    }

    public final void f0(int[][] iArr) {
        if (this.f19332a1) {
            return;
        }
        for (int i10 = 0; i10 < iArr.length; i10++) {
            int d02 = d0(iArr[i10][0]);
            int c02 = c0(iArr[i10][0]);
            int[] iArr2 = iArr[i10];
            if (!h0(d02, c02, iArr2[1], iArr2[2])) {
                return;
            }
            d dVar = this.f20926s0[i10];
            int[] iArr3 = iArr[i10];
            b0(dVar, d02, c02, iArr3[1], iArr3[2]);
            this.V0.add(this.f20926s0[i10].f20870l);
        }
    }

    public final void g0() {
        boolean[][] zArr = (boolean[][]) Array.newInstance((Class<?>) Boolean.TYPE, this.I0, this.K0);
        this.U0 = zArr;
        for (boolean[] zArr2 : zArr) {
            Arrays.fill(zArr2, true);
        }
        int i10 = this.f20927t0;
        if (i10 > 0) {
            int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i10, 4);
            this.W0 = iArr;
            for (int[] iArr2 : iArr) {
                Arrays.fill(iArr2, -1);
            }
        }
    }

    public final boolean h0(int i10, int i11, int i12, int i13) {
        for (int i14 = i10; i14 < i10 + i12; i14++) {
            for (int i15 = i11; i15 < i11 + i13; i15++) {
                boolean[][] zArr = this.U0;
                if (i14 < zArr.length && i15 < zArr[0].length) {
                    boolean[] zArr2 = zArr[i14];
                    if (zArr2[i15]) {
                        zArr2[i15] = false;
                    }
                }
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00e8, code lost:
    
        if (r11.H0 != false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00ea, code lost:
    
        r13 = r11.K0 + r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00ed, code lost:
    
        if (r13 <= 50) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00f2, code lost:
    
        if (r11.L0 != r13) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00f5, code lost:
    
        r11.L0 = r13;
        k0();
        g0();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int[][] i0(java.lang.String r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i3.a.i0(java.lang.String, boolean):int[][]");
    }

    public final void k0() {
        int i10;
        int i11 = this.J0;
        if (i11 != 0 && (i10 = this.L0) != 0) {
            this.I0 = i11;
            this.K0 = i10;
            return;
        }
        int i12 = this.L0;
        if (i12 > 0) {
            this.K0 = i12;
            this.I0 = ((this.f20927t0 + i12) - 1) / i12;
        } else if (i11 > 0) {
            this.I0 = i11;
            this.K0 = ((this.f20927t0 + i11) - 1) / i11;
        } else {
            int sqrt = (int) (Math.sqrt(this.f20927t0) + 1.5d);
            this.I0 = sqrt;
            this.K0 = ((this.f20927t0 + sqrt) - 1) / sqrt;
        }
    }
}
