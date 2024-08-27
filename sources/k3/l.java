package k3;

/* loaded from: classes.dex */
public final class l extends q {

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f22013k = new int[2];

    public static void m(int[] iArr, int i10, int i11, int i12, int i13, float f10, int i14) {
        int i15 = i11 - i10;
        int i16 = i13 - i12;
        if (i14 != -1) {
            if (i14 != 0) {
                if (i14 == 1) {
                    iArr[0] = i15;
                    iArr[1] = (int) ((i15 * f10) + 0.5f);
                    return;
                }
                return;
            }
            iArr[0] = (int) ((i16 * f10) + 0.5f);
            iArr[1] = i16;
            return;
        }
        int i17 = (int) ((i16 * f10) + 0.5f);
        int i18 = (int) ((i15 / f10) + 0.5f);
        if (i17 <= i15) {
            iArr[0] = i17;
            iArr[1] = i16;
        } else if (i18 <= i16) {
            iArr[0] = i15;
            iArr[1] = i18;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x0244, code lost:
    
        if (r3 != 1) goto L128;
     */
    @Override // k3.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(k3.e r24) {
        /*
            Method dump skipped, instructions count: 907
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k3.l.a(k3.e):void");
    }

    @Override // k3.q
    public final void d() {
        j3.d dVar;
        j3.d dVar2;
        int i10;
        j3.d dVar3;
        j3.d dVar4;
        int i11;
        j3.d dVar5 = this.f22030b;
        boolean z10 = dVar5.f20848a;
        h hVar = this.f22033e;
        if (z10) {
            hVar.d(dVar5.s());
        }
        boolean z11 = hVar.f22008j;
        g gVar = this.f22037i;
        g gVar2 = this.f22036h;
        if (!z11) {
            j3.d dVar6 = this.f22030b;
            int i12 = dVar6.f20882r0[0];
            this.f22032d = i12;
            if (i12 != 3) {
                if (i12 == 4 && (dVar4 = dVar6.V) != null && ((i11 = dVar4.f20882r0[0]) == 1 || i11 == 4)) {
                    int s7 = (dVar4.s() - this.f22030b.K.e()) - this.f22030b.M.e();
                    q.b(gVar2, dVar4.f20854d.f22036h, this.f22030b.K.e());
                    q.b(gVar, dVar4.f20854d.f22037i, -this.f22030b.M.e());
                    hVar.d(s7);
                    return;
                }
                if (i12 == 1) {
                    hVar.d(dVar6.s());
                }
            }
        } else if (this.f22032d == 4 && (dVar2 = (dVar = this.f22030b).V) != null && ((i10 = dVar2.f20882r0[0]) == 1 || i10 == 4)) {
            q.b(gVar2, dVar2.f20854d.f22036h, dVar.K.e());
            q.b(gVar, dVar2.f20854d.f22037i, -this.f22030b.M.e());
            return;
        }
        if (hVar.f22008j) {
            j3.d dVar7 = this.f22030b;
            if (dVar7.f20848a) {
                j3.c[] cVarArr = dVar7.S;
                j3.c cVar = cVarArr[0];
                j3.c cVar2 = cVar.f20844f;
                if (cVar2 != null && cVarArr[1].f20844f != null) {
                    if (dVar7.z()) {
                        gVar2.f22004f = this.f22030b.S[0].e();
                        gVar.f22004f = -this.f22030b.S[1].e();
                        return;
                    }
                    g h10 = q.h(this.f22030b.S[0]);
                    if (h10 != null) {
                        q.b(gVar2, h10, this.f22030b.S[0].e());
                    }
                    g h11 = q.h(this.f22030b.S[1]);
                    if (h11 != null) {
                        q.b(gVar, h11, -this.f22030b.S[1].e());
                    }
                    gVar2.f22000b = true;
                    gVar.f22000b = true;
                    return;
                }
                if (cVar2 != null) {
                    g h12 = q.h(cVar);
                    if (h12 != null) {
                        q.b(gVar2, h12, this.f22030b.S[0].e());
                        q.b(gVar, gVar2, hVar.f22005g);
                        return;
                    }
                    return;
                }
                j3.c cVar3 = cVarArr[1];
                if (cVar3.f20844f != null) {
                    g h13 = q.h(cVar3);
                    if (h13 != null) {
                        q.b(gVar, h13, -this.f22030b.S[1].e());
                        q.b(gVar2, gVar, -hVar.f22005g);
                        return;
                    }
                    return;
                }
                if (!(dVar7 instanceof j3.i) && dVar7.V != null && dVar7.k(7).f20844f == null) {
                    j3.d dVar8 = this.f22030b;
                    q.b(gVar2, dVar8.V.f20854d.f22036h, dVar8.t());
                    q.b(gVar, gVar2, hVar.f22005g);
                    return;
                }
                return;
            }
        }
        if (this.f22032d == 3) {
            j3.d dVar9 = this.f22030b;
            int i13 = dVar9.f20884t;
            if (i13 != 2) {
                if (i13 == 3) {
                    if (dVar9.f20885u == 3) {
                        gVar2.f21999a = this;
                        gVar.f21999a = this;
                        n nVar = dVar9.f20856e;
                        nVar.f22036h.f21999a = this;
                        nVar.f22037i.f21999a = this;
                        hVar.f21999a = this;
                        if (dVar9.A()) {
                            hVar.f22010l.add(this.f22030b.f20856e.f22033e);
                            this.f22030b.f20856e.f22033e.f22009k.add(hVar);
                            n nVar2 = this.f22030b.f20856e;
                            nVar2.f22033e.f21999a = this;
                            hVar.f22010l.add(nVar2.f22036h);
                            hVar.f22010l.add(this.f22030b.f20856e.f22037i);
                            this.f22030b.f20856e.f22036h.f22009k.add(hVar);
                            this.f22030b.f20856e.f22037i.f22009k.add(hVar);
                        } else if (this.f22030b.z()) {
                            this.f22030b.f20856e.f22033e.f22010l.add(hVar);
                            hVar.f22009k.add(this.f22030b.f20856e.f22033e);
                        } else {
                            this.f22030b.f20856e.f22033e.f22010l.add(hVar);
                        }
                    } else {
                        h hVar2 = dVar9.f20856e.f22033e;
                        hVar.f22010l.add(hVar2);
                        hVar2.f22009k.add(hVar);
                        this.f22030b.f20856e.f22036h.f22009k.add(hVar);
                        this.f22030b.f20856e.f22037i.f22009k.add(hVar);
                        hVar.f22000b = true;
                        hVar.f22009k.add(gVar2);
                        hVar.f22009k.add(gVar);
                        gVar2.f22010l.add(hVar);
                        gVar.f22010l.add(hVar);
                    }
                }
            } else {
                j3.d dVar10 = dVar9.V;
                if (dVar10 != null) {
                    h hVar3 = dVar10.f20856e.f22033e;
                    hVar.f22010l.add(hVar3);
                    hVar3.f22009k.add(hVar);
                    hVar.f22000b = true;
                    hVar.f22009k.add(gVar2);
                    hVar.f22009k.add(gVar);
                }
            }
        }
        j3.d dVar11 = this.f22030b;
        j3.c[] cVarArr2 = dVar11.S;
        j3.c cVar4 = cVarArr2[0];
        j3.c cVar5 = cVar4.f20844f;
        if (cVar5 != null && cVarArr2[1].f20844f != null) {
            if (dVar11.z()) {
                gVar2.f22004f = this.f22030b.S[0].e();
                gVar.f22004f = -this.f22030b.S[1].e();
                return;
            }
            g h14 = q.h(this.f22030b.S[0]);
            g h15 = q.h(this.f22030b.S[1]);
            if (h14 != null) {
                h14.b(this);
            }
            if (h15 != null) {
                h15.b(this);
            }
            this.f22038j = 4;
            return;
        }
        if (cVar5 != null) {
            g h16 = q.h(cVar4);
            if (h16 != null) {
                q.b(gVar2, h16, this.f22030b.S[0].e());
                c(gVar, gVar2, 1, hVar);
                return;
            }
            return;
        }
        j3.c cVar6 = cVarArr2[1];
        if (cVar6.f20844f != null) {
            g h17 = q.h(cVar6);
            if (h17 != null) {
                q.b(gVar, h17, -this.f22030b.S[1].e());
                c(gVar2, gVar, -1, hVar);
                return;
            }
            return;
        }
        if (!(dVar11 instanceof j3.i) && (dVar3 = dVar11.V) != null) {
            q.b(gVar2, dVar3.f20854d.f22036h, dVar11.t());
            c(gVar, gVar2, 1, hVar);
        }
    }

    @Override // k3.q
    public final void e() {
        g gVar = this.f22036h;
        if (gVar.f22008j) {
            this.f22030b.f20849a0 = gVar.f22005g;
        }
    }

    @Override // k3.q
    public final void f() {
        this.f22031c = null;
        this.f22036h.c();
        this.f22037i.c();
        this.f22033e.c();
        this.f22035g = false;
    }

    @Override // k3.q
    public final boolean k() {
        if (this.f22032d != 3 || this.f22030b.f20884t == 0) {
            return true;
        }
        return false;
    }

    public final void n() {
        this.f22035g = false;
        g gVar = this.f22036h;
        gVar.c();
        gVar.f22008j = false;
        g gVar2 = this.f22037i;
        gVar2.c();
        gVar2.f22008j = false;
        this.f22033e.f22008j = false;
    }

    public final String toString() {
        return "HorizontalRun " + this.f22030b.f20867j0;
    }
}
