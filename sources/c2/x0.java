package c2;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class x0 {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.compose.ui.node.a f7873a;

    /* renamed from: c, reason: collision with root package name */
    public boolean f7875c;

    /* renamed from: h, reason: collision with root package name */
    public w2.a f7880h;

    /* renamed from: b, reason: collision with root package name */
    public final r f7874b = new r();

    /* renamed from: d, reason: collision with root package name */
    public final o1 f7876d = new o1();

    /* renamed from: e, reason: collision with root package name */
    public final v0.h f7877e = new v0.h(new q1[16]);

    /* renamed from: f, reason: collision with root package name */
    public final long f7878f = 1;

    /* renamed from: g, reason: collision with root package name */
    public final v0.h f7879g = new v0.h(new w0[16]);

    public x0(androidx.compose.ui.node.a aVar) {
        this.f7873a = aVar;
    }

    public static boolean f(androidx.compose.ui.node.a aVar) {
        if (aVar.f1423x.f7816d && g(aVar)) {
            return true;
        }
        return false;
    }

    public static boolean g(androidx.compose.ui.node.a aVar) {
        n0 n0Var = aVar.f1423x.f7827o;
        if (n0Var.f7783k == 1 || n0Var.f7792t.f()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x002e, code lost:
    
        if (r4 < r7) goto L9;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(boolean r7) {
        /*
            r6 = this;
            c2.o1 r0 = r6.f7876d
            r1 = 1
            if (r7 == 0) goto L11
            v0.h r7 = r0.f7805a
            r7.g()
            androidx.compose.ui.node.a r2 = r6.f7873a
            r7.b(r2)
            r2.E = r1
        L11:
            c2.n1 r7 = c2.n1.f7799a
            v0.h r2 = r0.f7805a
            java.lang.Object[] r3 = r2.f37653a
            int r4 = r2.f37655c
            java.lang.String r5 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r5)
            java.lang.String r5 = "comparator"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r5)
            r5 = 0
            java.util.Arrays.sort(r3, r5, r4, r7)
            int r7 = r2.f37655c
            androidx.compose.ui.node.a[] r3 = r0.f7806b
            if (r3 == 0) goto L30
            int r4 = r3.length
            if (r4 >= r7) goto L38
        L30:
            r3 = 16
            int r3 = java.lang.Math.max(r3, r7)
            androidx.compose.ui.node.a[] r3 = new androidx.compose.ui.node.a[r3]
        L38:
            r4 = 0
            r0.f7806b = r4
        L3b:
            if (r5 >= r7) goto L46
            java.lang.Object[] r4 = r2.f37653a
            r4 = r4[r5]
            r3[r5] = r4
            int r5 = r5 + 1
            goto L3b
        L46:
            r2.g()
            int r7 = r7 - r1
        L4a:
            r1 = -1
            if (r1 >= r7) goto L5c
            r1 = r3[r7]
            kotlin.jvm.internal.Intrinsics.c(r1)
            boolean r2 = r1.E
            if (r2 == 0) goto L59
            c2.o1.a(r1)
        L59:
            int r7 = r7 + (-1)
            goto L4a
        L5c:
            r0.f7806b = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c2.x0.a(boolean):void");
    }

    public final boolean b(androidx.compose.ui.node.a aVar, w2.a aVar2) {
        w2.a aVar3;
        boolean E0;
        androidx.compose.ui.node.a aVar4 = aVar.f1402c;
        if (aVar4 == null) {
            return false;
        }
        q0 q0Var = aVar.f1423x;
        if (aVar2 != null) {
            if (aVar4 != null) {
                m0 m0Var = q0Var.f7828p;
                Intrinsics.c(m0Var);
                E0 = m0Var.E0(aVar2.f38776a);
            }
            E0 = false;
        } else {
            m0 m0Var2 = q0Var.f7828p;
            if (m0Var2 != null) {
                aVar3 = m0Var2.f7765m;
            } else {
                aVar3 = null;
            }
            if (aVar3 != null && aVar4 != null) {
                Intrinsics.c(m0Var2);
                E0 = m0Var2.E0(aVar3.f38776a);
            }
            E0 = false;
        }
        androidx.compose.ui.node.a q10 = aVar.q();
        if (E0 && q10 != null) {
            if (q10.f1402c == null) {
                q(q10, false);
            } else if (aVar.p() == 1) {
                o(q10, false);
            } else if (aVar.p() == 2) {
                n(q10, false);
            }
        }
        return E0;
    }

    public final boolean c(androidx.compose.ui.node.a aVar, w2.a aVar2) {
        boolean L;
        if (aVar2 != null) {
            L = aVar.K(aVar2);
        } else {
            L = androidx.compose.ui.node.a.L(aVar);
        }
        androidx.compose.ui.node.a q10 = aVar.q();
        if (L && q10 != null) {
            int i10 = aVar.f1423x.f7827o.f7783k;
            if (i10 == 1) {
                q(q10, false);
            } else if (i10 == 2) {
                p(q10, false);
            }
        }
        return L;
    }

    public final void d(androidx.compose.ui.node.a aVar, boolean z10) {
        q qVar;
        boolean z11;
        r rVar = this.f7874b;
        if (z10) {
            qVar = rVar.f7831a;
        } else {
            qVar = rVar.f7832b;
        }
        if (qVar.f7812c.isEmpty()) {
            return;
        }
        if (this.f7875c) {
            if (z10) {
                z11 = aVar.f1423x.f7819g;
            } else {
                z11 = aVar.f1423x.f7816d;
            }
            if (!z11) {
                e(aVar, z10);
                return;
            } else {
                t0.t.A0("node not yet measured");
                throw null;
            }
        }
        t0.t.C0("forceMeasureTheSubtree should be executed during the measureAndLayout pass");
        throw null;
    }

    public final void e(androidx.compose.ui.node.a aVar, boolean z10) {
        boolean z11;
        m0 m0Var;
        r0 r0Var;
        boolean z12;
        boolean z13;
        v0.h u10 = aVar.u();
        int i10 = u10.f37655c;
        r rVar = this.f7874b;
        if (i10 > 0) {
            Object[] objArr = u10.f37653a;
            int i11 = 0;
            do {
                androidx.compose.ui.node.a aVar2 = (androidx.compose.ui.node.a) objArr[i11];
                if ((!z10 && g(aVar2)) || (z10 && (aVar2.p() == 1 || ((m0Var = aVar2.f1423x.f7828p) != null && (r0Var = m0Var.f7769q) != null && r0Var.f())))) {
                    boolean v10 = g.v(aVar2);
                    q0 q0Var = aVar2.f1423x;
                    if (v10 && !z10) {
                        if (q0Var.f7819g && rVar.f7831a.b(aVar2)) {
                            k(aVar2, true, false);
                        } else {
                            d(aVar2, true);
                        }
                    }
                    if (z10) {
                        z12 = q0Var.f7819g;
                    } else {
                        z12 = q0Var.f7816d;
                    }
                    if (z12) {
                        boolean b10 = rVar.f7831a.b(aVar2);
                        if (!z10 ? b10 || rVar.f7832b.b(aVar2) : b10) {
                            k(aVar2, z10, false);
                        }
                    }
                    if (z10) {
                        z13 = q0Var.f7819g;
                    } else {
                        z13 = q0Var.f7816d;
                    }
                    if (!z13) {
                        e(aVar2, z10);
                    }
                }
                i11++;
            } while (i11 < i10);
        }
        q0 q0Var2 = aVar.f1423x;
        if (z10) {
            z11 = q0Var2.f7819g;
        } else {
            z11 = q0Var2.f7816d;
        }
        if (z11) {
            boolean b11 = rVar.f7831a.b(aVar);
            if (z10) {
                if (!b11) {
                    return;
                }
            } else if (!b11 && !rVar.f7832b.b(aVar)) {
                return;
            }
            k(aVar, z10, false);
        }
    }

    public final boolean h(d2.x xVar) {
        boolean z10;
        androidx.compose.ui.node.a aVar;
        r rVar = this.f7874b;
        androidx.compose.ui.node.a aVar2 = this.f7873a;
        if (aVar2.C()) {
            if (aVar2.D()) {
                if (!this.f7875c) {
                    int i10 = 0;
                    byte b10 = 0;
                    if (this.f7880h != null) {
                        this.f7875c = true;
                        try {
                            if (rVar.b()) {
                                z10 = false;
                                while (true) {
                                    boolean b11 = rVar.b();
                                    q qVar = rVar.f7831a;
                                    if (!b11) {
                                        break;
                                    }
                                    boolean z11 = !qVar.f7812c.isEmpty();
                                    if (z11) {
                                        aVar = (androidx.compose.ui.node.a) qVar.f7812c.first();
                                    } else {
                                        qVar = rVar.f7832b;
                                        aVar = (androidx.compose.ui.node.a) qVar.f7812c.first();
                                    }
                                    qVar.c(aVar);
                                    boolean k10 = k(aVar, z11, true);
                                    if (aVar == aVar2 && k10) {
                                        z10 = true;
                                    }
                                }
                                if (xVar != null) {
                                    xVar.mo2invoke();
                                }
                            } else {
                                z10 = false;
                            }
                        } finally {
                            this.f7875c = false;
                        }
                    } else {
                        z10 = false;
                    }
                    v0.h hVar = this.f7877e;
                    int i11 = hVar.f37655c;
                    if (i11 > 0) {
                        Object[] objArr = hVar.f37653a;
                        do {
                            ((androidx.compose.ui.node.a) ((q1) objArr[i10])).I();
                            i10++;
                        } while (i10 < i11);
                    }
                    hVar.g();
                    return z10;
                }
                t0.t.A0("performMeasureAndLayout called during measure layout");
                throw null;
            }
            t0.t.A0("performMeasureAndLayout called with unplaced root");
            throw null;
        }
        t0.t.A0("performMeasureAndLayout called with unattached root");
        throw null;
    }

    public final void i(androidx.compose.ui.node.a aVar, long j10) {
        if (aVar.F) {
            return;
        }
        androidx.compose.ui.node.a aVar2 = this.f7873a;
        if (!Intrinsics.a(aVar, aVar2)) {
            if (aVar2.C()) {
                if (aVar2.D()) {
                    if (!this.f7875c) {
                        int i10 = 0;
                        if (this.f7880h != null) {
                            this.f7875c = true;
                            try {
                                r rVar = this.f7874b;
                                rVar.f7831a.c(aVar);
                                rVar.f7832b.c(aVar);
                                boolean b10 = b(aVar, new w2.a(j10));
                                c(aVar, new w2.a(j10));
                                q0 q0Var = aVar.f1423x;
                                if ((b10 || q0Var.f7820h) && Intrinsics.a(aVar.E(), Boolean.TRUE)) {
                                    aVar.F();
                                }
                                if (q0Var.f7817e && aVar.D()) {
                                    aVar.O();
                                    this.f7876d.f7805a.b(aVar);
                                    aVar.E = true;
                                }
                                this.f7875c = false;
                            } catch (Throwable th2) {
                                this.f7875c = false;
                                throw th2;
                            }
                        }
                        v0.h hVar = this.f7877e;
                        int i11 = hVar.f37655c;
                        if (i11 > 0) {
                            Object[] objArr = hVar.f37653a;
                            do {
                                ((androidx.compose.ui.node.a) ((q1) objArr[i10])).I();
                                i10++;
                            } while (i10 < i11);
                        }
                        hVar.g();
                        return;
                    }
                    t0.t.A0("performMeasureAndLayout called during measure layout");
                    throw null;
                }
                t0.t.A0("performMeasureAndLayout called with unplaced root");
                throw null;
            }
            t0.t.A0("performMeasureAndLayout called with unattached root");
            throw null;
        }
        t0.t.A0("measureAndLayout called on root");
        throw null;
    }

    public final void j() {
        r rVar = this.f7874b;
        if (rVar.b()) {
            androidx.compose.ui.node.a aVar = this.f7873a;
            if (aVar.C()) {
                if (aVar.D()) {
                    if (!this.f7875c) {
                        if (this.f7880h != null) {
                            this.f7875c = true;
                            try {
                                if (!rVar.f7831a.f7812c.isEmpty()) {
                                    if (aVar.f1402c != null) {
                                        m(aVar, true);
                                    } else {
                                        l(aVar);
                                    }
                                }
                                m(aVar, false);
                                this.f7875c = false;
                                return;
                            } catch (Throwable th2) {
                                this.f7875c = false;
                                throw th2;
                            }
                        }
                        return;
                    }
                    t0.t.A0("performMeasureAndLayout called during measure layout");
                    throw null;
                }
                t0.t.A0("performMeasureAndLayout called with unplaced root");
                throw null;
            }
            t0.t.A0("performMeasureAndLayout called with unattached root");
            throw null;
        }
    }

    public final boolean k(androidx.compose.ui.node.a aVar, boolean z10, boolean z11) {
        w2.a aVar2;
        boolean z12;
        boolean c10;
        a2.z0 placementScope;
        x xVar;
        androidx.compose.ui.node.a q10;
        m0 m0Var;
        r0 r0Var;
        m0 m0Var2;
        r0 r0Var2;
        int i10 = 0;
        if (aVar.F) {
            return false;
        }
        boolean D = aVar.D();
        q0 q0Var = aVar.f1423x;
        if (!D && !q0Var.f7827o.f7791s && !f(aVar) && !Intrinsics.a(aVar.E(), Boolean.TRUE) && ((!q0Var.f7819g || (aVar.p() != 1 && ((m0Var2 = q0Var.f7828p) == null || (r0Var2 = m0Var2.f7769q) == null || !r0Var2.f()))) && !q0Var.f7827o.f7792t.f() && ((m0Var = q0Var.f7828p) == null || (r0Var = m0Var.f7769q) == null || !r0Var.f()))) {
            return false;
        }
        boolean z13 = q0Var.f7819g;
        androidx.compose.ui.node.a aVar3 = this.f7873a;
        if (!z13 && !q0Var.f7816d) {
            c10 = false;
            z12 = false;
        } else {
            if (aVar == aVar3) {
                aVar2 = this.f7880h;
                Intrinsics.c(aVar2);
            } else {
                aVar2 = null;
            }
            if (q0Var.f7819g && z10) {
                z12 = b(aVar, aVar2);
            } else {
                z12 = false;
            }
            c10 = c(aVar, aVar2);
        }
        if (z11) {
            if ((z12 || q0Var.f7820h) && Intrinsics.a(aVar.E(), Boolean.TRUE) && z10) {
                aVar.F();
            }
            if (q0Var.f7817e && (aVar == aVar3 || ((q10 = aVar.q()) != null && q10.D() && q0Var.f7827o.f7791s))) {
                if (aVar == aVar3) {
                    if (aVar.G == 3) {
                        aVar.e();
                    }
                    androidx.compose.ui.node.a q11 = aVar.q();
                    if (q11 == null || (xVar = q11.f1422w.f7655b) == null || (placementScope = xVar.f7853h) == null) {
                        placementScope = ((d2.a0) k0.a(aVar)).getPlacementScope();
                    }
                    a2.z0.g(placementScope, q0Var.f7827o, 0, 0);
                } else {
                    aVar.O();
                }
                this.f7876d.f7805a.b(aVar);
                aVar.E = true;
            }
        }
        v0.h hVar = this.f7879g;
        if (hVar.l()) {
            int i11 = hVar.f37655c;
            if (i11 > 0) {
                Object[] objArr = hVar.f37653a;
                do {
                    w0 w0Var = (w0) objArr[i10];
                    if (w0Var.f7870a.C()) {
                        boolean z14 = w0Var.f7871b;
                        boolean z15 = w0Var.f7872c;
                        androidx.compose.ui.node.a aVar4 = w0Var.f7870a;
                        if (!z14) {
                            q(aVar4, z15);
                        } else {
                            o(aVar4, z15);
                        }
                    }
                    i10++;
                } while (i10 < i11);
            }
            hVar.g();
        }
        return c10;
    }

    public final void l(androidx.compose.ui.node.a aVar) {
        v0.h u10 = aVar.u();
        int i10 = u10.f37655c;
        if (i10 > 0) {
            Object[] objArr = u10.f37653a;
            int i11 = 0;
            do {
                androidx.compose.ui.node.a aVar2 = (androidx.compose.ui.node.a) objArr[i11];
                if (g(aVar2)) {
                    if (g.v(aVar2)) {
                        m(aVar2, true);
                    } else {
                        l(aVar2);
                    }
                }
                i11++;
            } while (i11 < i10);
        }
    }

    public final void m(androidx.compose.ui.node.a aVar, boolean z10) {
        w2.a aVar2;
        if (aVar == this.f7873a) {
            aVar2 = this.f7880h;
            Intrinsics.c(aVar2);
        } else {
            aVar2 = null;
        }
        if (z10) {
            b(aVar, aVar2);
        } else {
            c(aVar, aVar2);
        }
    }

    public final boolean n(androidx.compose.ui.node.a aVar, boolean z10) {
        int e10 = w.k.e(aVar.f1423x.f7815c);
        if (e10 != 0) {
            if (e10 != 1) {
                if (e10 != 2) {
                    if (e10 != 3) {
                        if (e10 != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                }
            }
            return false;
        }
        q0 q0Var = aVar.f1423x;
        if ((!q0Var.f7819g && !q0Var.f7820h) || z10) {
            q0Var.f7820h = true;
            q0Var.f7821i = true;
            q0Var.f7817e = true;
            q0Var.f7818f = true;
            if (!aVar.F) {
                androidx.compose.ui.node.a q10 = aVar.q();
                boolean a10 = Intrinsics.a(aVar.E(), Boolean.TRUE);
                r rVar = this.f7874b;
                if (a10 && ((q10 == null || !q10.f1423x.f7819g) && (q10 == null || !q10.f1423x.f7820h))) {
                    rVar.a(aVar, true);
                } else if (aVar.D() && ((q10 == null || !q10.f1423x.f7817e) && (q10 == null || !q10.f1423x.f7816d))) {
                    rVar.a(aVar, false);
                }
                if (!this.f7875c) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean o(androidx.compose.ui.node.a aVar, boolean z10) {
        androidx.compose.ui.node.a q10;
        androidx.compose.ui.node.a q11;
        m0 m0Var;
        r0 r0Var;
        if (aVar.f1402c != null) {
            q0 q0Var = aVar.f1423x;
            int e10 = w.k.e(q0Var.f7815c);
            if (e10 != 0) {
                if (e10 != 1) {
                    if (e10 != 2 && e10 != 3) {
                        if (e10 == 4) {
                            if (!q0Var.f7819g || z10) {
                                q0Var.f7819g = true;
                                q0Var.f7816d = true;
                                if (!aVar.F) {
                                    boolean a10 = Intrinsics.a(aVar.E(), Boolean.TRUE);
                                    r rVar = this.f7874b;
                                    if ((!a10 && (!q0Var.f7819g || (aVar.p() != 1 && ((m0Var = q0Var.f7828p) == null || (r0Var = m0Var.f7769q) == null || !r0Var.f())))) || ((q10 = aVar.q()) != null && q10.f1423x.f7819g)) {
                                        if ((aVar.D() || f(aVar)) && ((q11 = aVar.q()) == null || !q11.f1423x.f7816d)) {
                                            rVar.a(aVar, false);
                                        }
                                    } else {
                                        rVar.a(aVar, true);
                                    }
                                    if (!this.f7875c) {
                                        return true;
                                    }
                                }
                            }
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                }
                return false;
            }
            this.f7879g.b(new w0(aVar, true, z10));
            return false;
        }
        t0.t.C0("Error: requestLookaheadRemeasure cannot be called on a node outside LookaheadScope");
        throw null;
    }

    public final boolean p(androidx.compose.ui.node.a aVar, boolean z10) {
        androidx.compose.ui.node.a q10;
        int e10 = w.k.e(aVar.f1423x.f7815c);
        if (e10 == 0 || e10 == 1 || e10 == 2 || e10 == 3) {
            return false;
        }
        if (e10 == 4) {
            q0 q0Var = aVar.f1423x;
            if (!z10 && aVar.D() == q0Var.f7827o.f7791s && (q0Var.f7816d || q0Var.f7817e)) {
                return false;
            }
            q0Var.f7817e = true;
            q0Var.f7818f = true;
            if (aVar.F) {
                return false;
            }
            if (q0Var.f7827o.f7791s && (((q10 = aVar.q()) == null || !q10.f1423x.f7817e) && (q10 == null || !q10.f1423x.f7816d))) {
                this.f7874b.a(aVar, false);
            }
            if (this.f7875c) {
                return false;
            }
            return true;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final boolean q(androidx.compose.ui.node.a aVar, boolean z10) {
        androidx.compose.ui.node.a q10;
        int e10 = w.k.e(aVar.f1423x.f7815c);
        if (e10 == 0 || e10 == 1) {
            return false;
        }
        if (e10 != 2 && e10 != 3) {
            if (e10 == 4) {
                q0 q0Var = aVar.f1423x;
                if (q0Var.f7816d && !z10) {
                    return false;
                }
                q0Var.f7816d = true;
                if (aVar.F) {
                    return false;
                }
                if ((aVar.D() || f(aVar)) && ((q10 = aVar.q()) == null || !q10.f1423x.f7816d)) {
                    this.f7874b.a(aVar, false);
                }
                if (this.f7875c) {
                    return false;
                }
                return true;
            }
            throw new NoWhenBranchMatchedException();
        }
        this.f7879g.b(new w0(aVar, false, z10));
        return false;
    }

    public final void r(long j10) {
        w2.a aVar = this.f7880h;
        if (aVar == null || !w2.a.b(aVar.f38776a, j10)) {
            boolean z10 = true;
            if (!this.f7875c) {
                this.f7880h = new w2.a(j10);
                androidx.compose.ui.node.a aVar2 = this.f7873a;
                androidx.compose.ui.node.a aVar3 = aVar2.f1402c;
                q0 q0Var = aVar2.f1423x;
                if (aVar3 != null) {
                    q0Var.f7819g = true;
                }
                q0Var.f7816d = true;
                if (aVar3 == null) {
                    z10 = false;
                }
                this.f7874b.a(aVar2, z10);
                return;
            }
            t0.t.A0("updateRootConstraints called while measuring");
            throw null;
        }
    }
}
