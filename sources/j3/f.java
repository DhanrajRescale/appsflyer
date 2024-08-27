package j3;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public int f20898a;

    /* renamed from: d, reason: collision with root package name */
    public c f20901d;

    /* renamed from: e, reason: collision with root package name */
    public c f20902e;

    /* renamed from: f, reason: collision with root package name */
    public c f20903f;

    /* renamed from: g, reason: collision with root package name */
    public c f20904g;

    /* renamed from: h, reason: collision with root package name */
    public int f20905h;

    /* renamed from: i, reason: collision with root package name */
    public int f20906i;

    /* renamed from: j, reason: collision with root package name */
    public int f20907j;

    /* renamed from: k, reason: collision with root package name */
    public int f20908k;

    /* renamed from: q, reason: collision with root package name */
    public int f20914q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ g f20915r;

    /* renamed from: b, reason: collision with root package name */
    public d f20899b = null;

    /* renamed from: c, reason: collision with root package name */
    public int f20900c = 0;

    /* renamed from: l, reason: collision with root package name */
    public int f20909l = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f20910m = 0;

    /* renamed from: n, reason: collision with root package name */
    public int f20911n = 0;

    /* renamed from: o, reason: collision with root package name */
    public int f20912o = 0;

    /* renamed from: p, reason: collision with root package name */
    public int f20913p = 0;

    public f(g gVar, int i10, c cVar, c cVar2, c cVar3, c cVar4, int i11) {
        this.f20915r = gVar;
        this.f20905h = 0;
        this.f20906i = 0;
        this.f20907j = 0;
        this.f20908k = 0;
        this.f20914q = 0;
        this.f20898a = i10;
        this.f20901d = cVar;
        this.f20902e = cVar2;
        this.f20903f = cVar3;
        this.f20904g = cVar4;
        this.f20905h = gVar.f20933y0;
        this.f20906i = gVar.f20929u0;
        this.f20907j = gVar.f20934z0;
        this.f20908k = gVar.f20930v0;
        this.f20914q = i11;
    }

    public final void a(d dVar) {
        int i10 = this.f20898a;
        int i11 = 0;
        g gVar = this.f20915r;
        if (i10 == 0) {
            int b02 = gVar.b0(this.f20914q, dVar);
            if (dVar.f20882r0[0] == 3) {
                this.f20913p++;
                b02 = 0;
            }
            int i12 = gVar.R0;
            if (dVar.f20865i0 != 8) {
                i11 = i12;
            }
            this.f20909l = b02 + i11 + this.f20909l;
            int a02 = gVar.a0(this.f20914q, dVar);
            if (this.f20899b == null || this.f20900c < a02) {
                this.f20899b = dVar;
                this.f20900c = a02;
                this.f20910m = a02;
            }
        } else {
            int b03 = gVar.b0(this.f20914q, dVar);
            int a03 = gVar.a0(this.f20914q, dVar);
            if (dVar.f20882r0[1] == 3) {
                this.f20913p++;
                a03 = 0;
            }
            int i13 = gVar.S0;
            if (dVar.f20865i0 != 8) {
                i11 = i13;
            }
            this.f20910m = a03 + i11 + this.f20910m;
            if (this.f20899b == null || this.f20900c < b03) {
                this.f20899b = dVar;
                this.f20900c = b03;
                this.f20909l = b03;
            }
        }
        this.f20912o++;
    }

    public final void b(int i10, boolean z10, boolean z11) {
        g gVar;
        boolean z12;
        int i11;
        int i12;
        int i13;
        d dVar;
        int i14;
        int i15;
        char c10;
        int i16;
        float f10;
        float f11;
        int i17;
        float f12;
        float f13;
        int i18;
        int i19;
        int i20;
        int i21 = this.f20912o;
        int i22 = 0;
        while (true) {
            gVar = this.f20915r;
            if (i22 >= i21 || (i20 = this.f20911n + i22) >= gVar.f20919d1) {
                break;
            }
            d dVar2 = gVar.f20918c1[i20];
            if (dVar2 != null) {
                dVar2.F();
            }
            i22++;
        }
        if (i21 != 0 && this.f20899b != null) {
            if (z11 && i10 == 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            int i23 = -1;
            int i24 = -1;
            for (int i25 = 0; i25 < i21; i25++) {
                if (z10) {
                    i19 = (i21 - 1) - i25;
                } else {
                    i19 = i25;
                }
                int i26 = this.f20911n + i19;
                if (i26 >= gVar.f20919d1) {
                    break;
                }
                d dVar3 = gVar.f20918c1[i26];
                if (dVar3 != null && dVar3.f20865i0 == 0) {
                    if (i23 == -1) {
                        i23 = i25;
                    }
                    i24 = i25;
                }
            }
            if (this.f20898a == 0) {
                d dVar4 = this.f20899b;
                dVar4.f20871l0 = gVar.G0;
                int i27 = this.f20906i;
                if (i10 > 0) {
                    i27 += gVar.S0;
                }
                c cVar = this.f20902e;
                c cVar2 = dVar4.L;
                cVar2.a(cVar, i27);
                c cVar3 = dVar4.N;
                if (z11) {
                    cVar3.a(this.f20904g, this.f20908k);
                }
                if (i10 > 0) {
                    this.f20902e.f20842d.N.a(cVar2, 0);
                }
                if (gVar.U0 == 3 && !dVar4.G) {
                    for (int i28 = 0; i28 < i21; i28++) {
                        if (z10) {
                            i18 = (i21 - 1) - i28;
                        } else {
                            i18 = i28;
                        }
                        int i29 = this.f20911n + i18;
                        if (i29 >= gVar.f20919d1) {
                            break;
                        }
                        dVar = gVar.f20918c1[i29];
                        if (dVar.G) {
                            break;
                        }
                    }
                }
                dVar = dVar4;
                int i30 = 0;
                d dVar5 = null;
                while (i30 < i21) {
                    if (z10) {
                        i14 = (i21 - 1) - i30;
                    } else {
                        i14 = i30;
                    }
                    int i31 = this.f20911n + i14;
                    if (i31 < gVar.f20919d1) {
                        d dVar6 = gVar.f20918c1[i31];
                        if (dVar6 == null) {
                            i15 = i21;
                            c10 = 3;
                        } else {
                            c cVar4 = dVar6.K;
                            if (i30 == 0) {
                                dVar6.h(cVar4, this.f20901d, this.f20905h);
                            }
                            if (i14 == 0) {
                                int i32 = gVar.F0;
                                if (z10) {
                                    i16 = i32;
                                    f10 = 1.0f - gVar.L0;
                                } else {
                                    i16 = i32;
                                    f10 = gVar.L0;
                                }
                                if (this.f20911n == 0) {
                                    int i33 = gVar.H0;
                                    f11 = f10;
                                    if (i33 != -1) {
                                        if (z10) {
                                            f13 = 1.0f - gVar.N0;
                                        } else {
                                            f13 = gVar.N0;
                                        }
                                        f12 = f13;
                                        i17 = i33;
                                        dVar6.f20869k0 = i17;
                                        dVar6.f20859f0 = f12;
                                    }
                                } else {
                                    f11 = f10;
                                }
                                if (z11 && (i17 = gVar.J0) != -1) {
                                    if (z10) {
                                        f12 = 1.0f - gVar.P0;
                                    } else {
                                        f12 = gVar.P0;
                                    }
                                } else {
                                    i17 = i16;
                                    f12 = f11;
                                }
                                dVar6.f20869k0 = i17;
                                dVar6.f20859f0 = f12;
                            }
                            if (i30 == i21 - 1) {
                                i15 = i21;
                                dVar6.h(dVar6.M, this.f20903f, this.f20907j);
                            } else {
                                i15 = i21;
                            }
                            if (dVar5 != null) {
                                int i34 = gVar.R0;
                                c cVar5 = dVar5.M;
                                cVar4.a(cVar5, i34);
                                if (i30 == i23) {
                                    int i35 = this.f20905h;
                                    if (cVar4.h()) {
                                        cVar4.f20846h = i35;
                                    }
                                }
                                cVar5.a(cVar4, 0);
                                if (i30 == i24 + 1) {
                                    int i36 = this.f20907j;
                                    if (cVar5.h()) {
                                        cVar5.f20846h = i36;
                                    }
                                }
                            }
                            if (dVar6 != dVar4) {
                                int i37 = gVar.U0;
                                c10 = 3;
                                if (i37 == 3 && dVar.G && dVar6 != dVar && dVar6.G) {
                                    dVar6.O.a(dVar.O, 0);
                                } else {
                                    c cVar6 = dVar6.L;
                                    if (i37 != 0) {
                                        c cVar7 = dVar6.N;
                                        if (i37 != 1) {
                                            if (z12) {
                                                cVar6.a(this.f20902e, this.f20906i);
                                                cVar7.a(this.f20904g, this.f20908k);
                                            } else {
                                                cVar6.a(cVar2, 0);
                                                cVar7.a(cVar3, 0);
                                            }
                                        } else {
                                            cVar7.a(cVar3, 0);
                                        }
                                    } else {
                                        cVar6.a(cVar2, 0);
                                    }
                                }
                            } else {
                                c10 = 3;
                            }
                            dVar5 = dVar6;
                        }
                        i30++;
                        i21 = i15;
                    } else {
                        return;
                    }
                }
                return;
            }
            d dVar7 = this.f20899b;
            dVar7.f20869k0 = gVar.F0;
            int i38 = this.f20905h;
            if (i10 > 0) {
                i38 += gVar.R0;
            }
            c cVar8 = dVar7.K;
            c cVar9 = dVar7.M;
            if (z10) {
                cVar9.a(this.f20903f, i38);
                if (z11) {
                    cVar8.a(this.f20901d, this.f20907j);
                }
                if (i10 > 0) {
                    this.f20903f.f20842d.K.a(cVar9, 0);
                }
            } else {
                cVar8.a(this.f20901d, i38);
                if (z11) {
                    cVar9.a(this.f20903f, this.f20907j);
                }
                if (i10 > 0) {
                    this.f20901d.f20842d.M.a(cVar8, 0);
                }
            }
            d dVar8 = null;
            for (int i39 = 0; i39 < i21; i39++) {
                int i40 = this.f20911n + i39;
                if (i40 < gVar.f20919d1) {
                    d dVar9 = gVar.f20918c1[i40];
                    if (dVar9 != null) {
                        c cVar10 = dVar9.L;
                        if (i39 == 0) {
                            dVar9.h(cVar10, this.f20902e, this.f20906i);
                            int i41 = gVar.G0;
                            float f14 = gVar.M0;
                            if (this.f20911n == 0) {
                                i13 = gVar.I0;
                                i11 = i41;
                                i12 = -1;
                                if (i13 != -1) {
                                    f14 = gVar.O0;
                                    dVar9.f20871l0 = i13;
                                    dVar9.f20861g0 = f14;
                                }
                            } else {
                                i11 = i41;
                                i12 = -1;
                            }
                            if (z11 && (i13 = gVar.K0) != i12) {
                                f14 = gVar.Q0;
                            } else {
                                i13 = i11;
                            }
                            dVar9.f20871l0 = i13;
                            dVar9.f20861g0 = f14;
                        }
                        if (i39 == i21 - 1) {
                            dVar9.h(dVar9.N, this.f20904g, this.f20908k);
                        }
                        if (dVar8 != null) {
                            int i42 = gVar.S0;
                            c cVar11 = dVar8.N;
                            cVar10.a(cVar11, i42);
                            if (i39 == i23) {
                                int i43 = this.f20906i;
                                if (cVar10.h()) {
                                    cVar10.f20846h = i43;
                                }
                            }
                            cVar11.a(cVar10, 0);
                            if (i39 == i24 + 1) {
                                int i44 = this.f20908k;
                                if (cVar11.h()) {
                                    cVar11.f20846h = i44;
                                }
                            }
                        }
                        if (dVar9 != dVar7) {
                            c cVar12 = dVar9.M;
                            c cVar13 = dVar9.K;
                            if (z10) {
                                int i45 = gVar.T0;
                                if (i45 != 0) {
                                    if (i45 != 1) {
                                        if (i45 == 2) {
                                            cVar13.a(cVar8, 0);
                                            cVar12.a(cVar9, 0);
                                        }
                                    } else {
                                        cVar13.a(cVar8, 0);
                                    }
                                } else {
                                    cVar12.a(cVar9, 0);
                                }
                            } else {
                                int i46 = gVar.T0;
                                if (i46 != 0) {
                                    if (i46 != 1) {
                                        if (i46 == 2) {
                                            if (z12) {
                                                cVar13.a(this.f20901d, this.f20905h);
                                                cVar12.a(this.f20903f, this.f20907j);
                                            } else {
                                                cVar13.a(cVar8, 0);
                                                cVar12.a(cVar9, 0);
                                            }
                                        }
                                    } else {
                                        cVar12.a(cVar9, 0);
                                    }
                                } else {
                                    cVar13.a(cVar8, 0);
                                }
                                dVar8 = dVar9;
                            }
                        }
                        dVar8 = dVar9;
                    }
                } else {
                    return;
                }
            }
        }
    }

    public final int c() {
        if (this.f20898a == 1) {
            return this.f20910m - this.f20915r.S0;
        }
        return this.f20910m;
    }

    public final int d() {
        if (this.f20898a == 0) {
            return this.f20909l - this.f20915r.R0;
        }
        return this.f20909l;
    }

    public final void e(int i10) {
        g gVar;
        int i11;
        int i12 = this.f20913p;
        if (i12 == 0) {
            return;
        }
        int i13 = this.f20912o;
        int i14 = i10 / i12;
        int i15 = 0;
        while (true) {
            gVar = this.f20915r;
            if (i15 >= i13 || (i11 = this.f20911n + i15) >= gVar.f20919d1) {
                break;
            }
            d dVar = gVar.f20918c1[i11];
            if (this.f20898a == 0) {
                if (dVar != null) {
                    int[] iArr = dVar.f20882r0;
                    if (iArr[0] == 3 && dVar.f20884t == 0) {
                        gVar.Z(dVar, 1, i14, iArr[1], dVar.m());
                    }
                }
            } else if (dVar != null) {
                int[] iArr2 = dVar.f20882r0;
                if (iArr2[1] == 3 && dVar.f20885u == 0) {
                    gVar.Z(dVar, iArr2[0], dVar.s(), 1, i14);
                }
            }
            i15++;
        }
        this.f20909l = 0;
        this.f20910m = 0;
        this.f20899b = null;
        this.f20900c = 0;
        int i16 = this.f20912o;
        for (int i17 = 0; i17 < i16; i17++) {
            int i18 = this.f20911n + i17;
            if (i18 < gVar.f20919d1) {
                d dVar2 = gVar.f20918c1[i18];
                if (this.f20898a == 0) {
                    int s7 = dVar2.s();
                    int i19 = gVar.R0;
                    if (dVar2.f20865i0 == 8) {
                        i19 = 0;
                    }
                    this.f20909l = s7 + i19 + this.f20909l;
                    int a02 = gVar.a0(this.f20914q, dVar2);
                    if (this.f20899b == null || this.f20900c < a02) {
                        this.f20899b = dVar2;
                        this.f20900c = a02;
                        this.f20910m = a02;
                    }
                } else {
                    int b02 = gVar.b0(this.f20914q, dVar2);
                    int a03 = gVar.a0(this.f20914q, dVar2);
                    int i20 = gVar.S0;
                    if (dVar2.f20865i0 == 8) {
                        i20 = 0;
                    }
                    this.f20910m = a03 + i20 + this.f20910m;
                    if (this.f20899b == null || this.f20900c < b02) {
                        this.f20899b = dVar2;
                        this.f20900c = b02;
                        this.f20909l = b02;
                    }
                }
            } else {
                return;
            }
        }
    }

    public final void f(int i10, c cVar, c cVar2, c cVar3, c cVar4, int i11, int i12, int i13, int i14, int i15) {
        this.f20898a = i10;
        this.f20901d = cVar;
        this.f20902e = cVar2;
        this.f20903f = cVar3;
        this.f20904g = cVar4;
        this.f20905h = i11;
        this.f20906i = i12;
        this.f20907j = i13;
        this.f20908k = i14;
        this.f20914q = i15;
    }
}
