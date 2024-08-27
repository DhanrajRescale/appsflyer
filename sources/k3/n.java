package k3;

/* loaded from: classes.dex */
public final class n extends q {

    /* renamed from: k, reason: collision with root package name */
    public g f22016k;

    /* renamed from: l, reason: collision with root package name */
    public a f22017l;

    @Override // k3.e
    public final void a(e eVar) {
        float f10;
        float f11;
        float f12;
        int i10;
        if (w.k.e(this.f22038j) != 3) {
            h hVar = this.f22033e;
            if (hVar.f22001c && !hVar.f22008j && this.f22032d == 3) {
                j3.d dVar = this.f22030b;
                int i11 = dVar.f20885u;
                if (i11 != 2) {
                    if (i11 == 3) {
                        h hVar2 = dVar.f20854d.f22033e;
                        if (hVar2.f22008j) {
                            int i12 = dVar.Z;
                            if (i12 != -1) {
                                if (i12 != 0) {
                                    if (i12 != 1) {
                                        i10 = 0;
                                        hVar.d(i10);
                                    } else {
                                        f10 = hVar2.f22005g;
                                        f11 = dVar.Y;
                                    }
                                } else {
                                    f12 = hVar2.f22005g * dVar.Y;
                                    i10 = (int) (f12 + 0.5f);
                                    hVar.d(i10);
                                }
                            } else {
                                f10 = hVar2.f22005g;
                                f11 = dVar.Y;
                            }
                            f12 = f10 / f11;
                            i10 = (int) (f12 + 0.5f);
                            hVar.d(i10);
                        }
                    }
                } else {
                    j3.d dVar2 = dVar.V;
                    if (dVar2 != null) {
                        if (dVar2.f20856e.f22033e.f22008j) {
                            hVar.d((int) ((r5.f22005g * dVar.B) + 0.5f));
                        }
                    }
                }
            }
            g gVar = this.f22036h;
            if (gVar.f22001c) {
                g gVar2 = this.f22037i;
                if (gVar2.f22001c) {
                    if (gVar.f22008j && gVar2.f22008j && hVar.f22008j) {
                        return;
                    }
                    if (!hVar.f22008j && this.f22032d == 3) {
                        j3.d dVar3 = this.f22030b;
                        if (dVar3.f20884t == 0 && !dVar3.A()) {
                            g gVar3 = (g) gVar.f22010l.get(0);
                            g gVar4 = (g) gVar2.f22010l.get(0);
                            int i13 = gVar3.f22005g + gVar.f22004f;
                            int i14 = gVar4.f22005g + gVar2.f22004f;
                            gVar.d(i13);
                            gVar2.d(i14);
                            hVar.d(i14 - i13);
                            return;
                        }
                    }
                    if (!hVar.f22008j && this.f22032d == 3 && this.f22029a == 1 && gVar.f22010l.size() > 0 && gVar2.f22010l.size() > 0) {
                        g gVar5 = (g) gVar.f22010l.get(0);
                        int i15 = (((g) gVar2.f22010l.get(0)).f22005g + gVar2.f22004f) - (gVar5.f22005g + gVar.f22004f);
                        int i16 = hVar.f22011m;
                        if (i15 < i16) {
                            hVar.d(i15);
                        } else {
                            hVar.d(i16);
                        }
                    }
                    if (hVar.f22008j && gVar.f22010l.size() > 0 && gVar2.f22010l.size() > 0) {
                        g gVar6 = (g) gVar.f22010l.get(0);
                        g gVar7 = (g) gVar2.f22010l.get(0);
                        int i17 = gVar6.f22005g;
                        int i18 = gVar.f22004f + i17;
                        int i19 = gVar7.f22005g;
                        int i20 = gVar2.f22004f + i19;
                        float f13 = this.f22030b.f20861g0;
                        if (gVar6 == gVar7) {
                            f13 = 0.5f;
                        } else {
                            i17 = i18;
                            i19 = i20;
                        }
                        gVar.d((int) ((((i19 - i17) - hVar.f22005g) * f13) + i17 + 0.5f));
                        gVar2.d(gVar.f22005g + hVar.f22005g);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        j3.d dVar4 = this.f22030b;
        l(dVar4.L, dVar4.N, 1);
    }

    /* JADX WARN: Type inference failed for: r0v124, types: [k3.h, k3.a] */
    @Override // k3.q
    public final void d() {
        j3.d dVar;
        j3.d dVar2;
        j3.d dVar3;
        j3.d dVar4;
        j3.d dVar5 = this.f22030b;
        boolean z10 = dVar5.f20848a;
        h hVar = this.f22033e;
        if (z10) {
            hVar.d(dVar5.m());
        }
        boolean z11 = hVar.f22008j;
        g gVar = this.f22037i;
        g gVar2 = this.f22036h;
        if (!z11) {
            j3.d dVar6 = this.f22030b;
            this.f22032d = dVar6.f20882r0[1];
            if (dVar6.G) {
                this.f22017l = new h(this);
            }
            int i10 = this.f22032d;
            if (i10 != 3) {
                if (i10 == 4 && (dVar4 = this.f22030b.V) != null && dVar4.f20882r0[1] == 1) {
                    int m10 = (dVar4.m() - this.f22030b.L.e()) - this.f22030b.N.e();
                    q.b(gVar2, dVar4.f20856e.f22036h, this.f22030b.L.e());
                    q.b(gVar, dVar4.f20856e.f22037i, -this.f22030b.N.e());
                    hVar.d(m10);
                    return;
                }
                if (i10 == 1) {
                    hVar.d(this.f22030b.m());
                }
            }
        } else if (this.f22032d == 4 && (dVar2 = (dVar = this.f22030b).V) != null && dVar2.f20882r0[1] == 1) {
            q.b(gVar2, dVar2.f20856e.f22036h, dVar.L.e());
            q.b(gVar, dVar2.f20856e.f22037i, -this.f22030b.N.e());
            return;
        }
        boolean z12 = hVar.f22008j;
        g gVar3 = this.f22016k;
        if (z12) {
            j3.d dVar7 = this.f22030b;
            if (dVar7.f20848a) {
                j3.c[] cVarArr = dVar7.S;
                j3.c cVar = cVarArr[2];
                j3.c cVar2 = cVar.f20844f;
                if (cVar2 != null && cVarArr[3].f20844f != null) {
                    if (dVar7.A()) {
                        gVar2.f22004f = this.f22030b.S[2].e();
                        gVar.f22004f = -this.f22030b.S[3].e();
                    } else {
                        g h10 = q.h(this.f22030b.S[2]);
                        if (h10 != null) {
                            q.b(gVar2, h10, this.f22030b.S[2].e());
                        }
                        g h11 = q.h(this.f22030b.S[3]);
                        if (h11 != null) {
                            q.b(gVar, h11, -this.f22030b.S[3].e());
                        }
                        gVar2.f22000b = true;
                        gVar.f22000b = true;
                    }
                    j3.d dVar8 = this.f22030b;
                    if (dVar8.G) {
                        q.b(gVar3, gVar2, dVar8.f20853c0);
                        return;
                    }
                    return;
                }
                if (cVar2 != null) {
                    g h12 = q.h(cVar);
                    if (h12 != null) {
                        q.b(gVar2, h12, this.f22030b.S[2].e());
                        q.b(gVar, gVar2, hVar.f22005g);
                        j3.d dVar9 = this.f22030b;
                        if (dVar9.G) {
                            q.b(gVar3, gVar2, dVar9.f20853c0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                j3.c cVar3 = cVarArr[3];
                if (cVar3.f20844f != null) {
                    g h13 = q.h(cVar3);
                    if (h13 != null) {
                        q.b(gVar, h13, -this.f22030b.S[3].e());
                        q.b(gVar2, gVar, -hVar.f22005g);
                    }
                    j3.d dVar10 = this.f22030b;
                    if (dVar10.G) {
                        q.b(gVar3, gVar2, dVar10.f20853c0);
                        return;
                    }
                    return;
                }
                j3.c cVar4 = cVarArr[4];
                if (cVar4.f20844f != null) {
                    g h14 = q.h(cVar4);
                    if (h14 != null) {
                        q.b(gVar3, h14, 0);
                        q.b(gVar2, gVar3, -this.f22030b.f20853c0);
                        q.b(gVar, gVar2, hVar.f22005g);
                        return;
                    }
                    return;
                }
                if (!(dVar7 instanceof j3.i) && dVar7.V != null && dVar7.k(7).f20844f == null) {
                    j3.d dVar11 = this.f22030b;
                    q.b(gVar2, dVar11.V.f20856e.f22036h, dVar11.u());
                    q.b(gVar, gVar2, hVar.f22005g);
                    j3.d dVar12 = this.f22030b;
                    if (dVar12.G) {
                        q.b(gVar3, gVar2, dVar12.f20853c0);
                        return;
                    }
                    return;
                }
                return;
            }
        }
        if (!z12 && this.f22032d == 3) {
            j3.d dVar13 = this.f22030b;
            int i11 = dVar13.f20885u;
            if (i11 != 2) {
                if (i11 == 3 && !dVar13.A()) {
                    j3.d dVar14 = this.f22030b;
                    if (dVar14.f20884t != 3) {
                        h hVar2 = dVar14.f20854d.f22033e;
                        hVar.f22010l.add(hVar2);
                        hVar2.f22009k.add(hVar);
                        hVar.f22000b = true;
                        hVar.f22009k.add(gVar2);
                        hVar.f22009k.add(gVar);
                    }
                }
            } else {
                j3.d dVar15 = dVar13.V;
                if (dVar15 != null) {
                    h hVar3 = dVar15.f20856e.f22033e;
                    hVar.f22010l.add(hVar3);
                    hVar3.f22009k.add(hVar);
                    hVar.f22000b = true;
                    hVar.f22009k.add(gVar2);
                    hVar.f22009k.add(gVar);
                }
            }
        } else {
            hVar.b(this);
        }
        j3.d dVar16 = this.f22030b;
        j3.c[] cVarArr2 = dVar16.S;
        j3.c cVar5 = cVarArr2[2];
        j3.c cVar6 = cVar5.f20844f;
        if (cVar6 != null && cVarArr2[3].f20844f != null) {
            if (dVar16.A()) {
                gVar2.f22004f = this.f22030b.S[2].e();
                gVar.f22004f = -this.f22030b.S[3].e();
            } else {
                g h15 = q.h(this.f22030b.S[2]);
                g h16 = q.h(this.f22030b.S[3]);
                if (h15 != null) {
                    h15.b(this);
                }
                if (h16 != null) {
                    h16.b(this);
                }
                this.f22038j = 4;
            }
            if (this.f22030b.G) {
                c(gVar3, gVar2, 1, this.f22017l);
            }
        } else if (cVar6 != null) {
            g h17 = q.h(cVar5);
            if (h17 != null) {
                q.b(gVar2, h17, this.f22030b.S[2].e());
                c(gVar, gVar2, 1, hVar);
                if (this.f22030b.G) {
                    c(gVar3, gVar2, 1, this.f22017l);
                }
                if (this.f22032d == 3) {
                    j3.d dVar17 = this.f22030b;
                    if (dVar17.Y > s0.g.f34069a) {
                        l lVar = dVar17.f20854d;
                        if (lVar.f22032d == 3) {
                            lVar.f22033e.f22009k.add(hVar);
                            hVar.f22010l.add(this.f22030b.f20854d.f22033e);
                            hVar.f21999a = this;
                        }
                    }
                }
            }
        } else {
            j3.c cVar7 = cVarArr2[3];
            if (cVar7.f20844f != null) {
                g h18 = q.h(cVar7);
                if (h18 != null) {
                    q.b(gVar, h18, -this.f22030b.S[3].e());
                    c(gVar2, gVar, -1, hVar);
                    if (this.f22030b.G) {
                        c(gVar3, gVar2, 1, this.f22017l);
                    }
                }
            } else {
                j3.c cVar8 = cVarArr2[4];
                if (cVar8.f20844f != null) {
                    g h19 = q.h(cVar8);
                    if (h19 != null) {
                        q.b(gVar3, h19, 0);
                        c(gVar2, gVar3, -1, this.f22017l);
                        c(gVar, gVar2, 1, hVar);
                    }
                } else if (!(dVar16 instanceof j3.i) && (dVar3 = dVar16.V) != null) {
                    q.b(gVar2, dVar3.f20856e.f22036h, dVar16.u());
                    c(gVar, gVar2, 1, hVar);
                    if (this.f22030b.G) {
                        c(gVar3, gVar2, 1, this.f22017l);
                    }
                    if (this.f22032d == 3) {
                        j3.d dVar18 = this.f22030b;
                        if (dVar18.Y > s0.g.f34069a) {
                            l lVar2 = dVar18.f20854d;
                            if (lVar2.f22032d == 3) {
                                lVar2.f22033e.f22009k.add(hVar);
                                hVar.f22010l.add(this.f22030b.f20854d.f22033e);
                                hVar.f21999a = this;
                            }
                        }
                    }
                }
            }
        }
        if (hVar.f22010l.size() == 0) {
            hVar.f22001c = true;
        }
    }

    @Override // k3.q
    public final void e() {
        g gVar = this.f22036h;
        if (gVar.f22008j) {
            this.f22030b.f20851b0 = gVar.f22005g;
        }
    }

    @Override // k3.q
    public final void f() {
        this.f22031c = null;
        this.f22036h.c();
        this.f22037i.c();
        this.f22016k.c();
        this.f22033e.c();
        this.f22035g = false;
    }

    @Override // k3.q
    public final boolean k() {
        if (this.f22032d != 3 || this.f22030b.f20885u == 0) {
            return true;
        }
        return false;
    }

    public final void m() {
        this.f22035g = false;
        g gVar = this.f22036h;
        gVar.c();
        gVar.f22008j = false;
        g gVar2 = this.f22037i;
        gVar2.c();
        gVar2.f22008j = false;
        g gVar3 = this.f22016k;
        gVar3.c();
        gVar3.f22008j = false;
        this.f22033e.f22008j = false;
    }

    public final String toString() {
        return "VerticalRun " + this.f22030b.f20867j0;
    }
}
