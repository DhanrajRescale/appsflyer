package t0;

import java.util.ArrayList;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class r implements n {
    public int A;
    public boolean B;
    public final q C;
    public final l9.c D;
    public boolean E;
    public n2 F;
    public o2 G;
    public q2 H;
    public boolean I;
    public r1 J;
    public u0.a K;
    public final u0.b L;
    public d M;
    public u0.c N;
    public boolean O;
    public int P;

    /* renamed from: a, reason: collision with root package name */
    public final f f35166a;

    /* renamed from: b, reason: collision with root package name */
    public final v f35167b;

    /* renamed from: c, reason: collision with root package name */
    public final o2 f35168c;

    /* renamed from: d, reason: collision with root package name */
    public final Set f35169d;

    /* renamed from: e, reason: collision with root package name */
    public final u0.a f35170e;

    /* renamed from: f, reason: collision with root package name */
    public final u0.a f35171f;

    /* renamed from: g, reason: collision with root package name */
    public final e0 f35172g;

    /* renamed from: i, reason: collision with root package name */
    public q1 f35174i;

    /* renamed from: j, reason: collision with root package name */
    public int f35175j;

    /* renamed from: k, reason: collision with root package name */
    public int f35176k;

    /* renamed from: l, reason: collision with root package name */
    public int f35177l;

    /* renamed from: n, reason: collision with root package name */
    public int[] f35179n;

    /* renamed from: o, reason: collision with root package name */
    public t.r f35180o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f35181p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f35182q;

    /* renamed from: u, reason: collision with root package name */
    public v0.d f35186u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f35187v;

    /* renamed from: x, reason: collision with root package name */
    public boolean f35189x;

    /* renamed from: z, reason: collision with root package name */
    public int f35191z;

    /* renamed from: h, reason: collision with root package name */
    public final l9.c f35173h = new l9.c();

    /* renamed from: m, reason: collision with root package name */
    public final t0 f35178m = new t0();

    /* renamed from: r, reason: collision with root package name */
    public final ArrayList f35183r = new ArrayList();

    /* renamed from: s, reason: collision with root package name */
    public final t0 f35184s = new t0();

    /* renamed from: t, reason: collision with root package name */
    public r1 f35185t = b1.g.f3082g;

    /* renamed from: w, reason: collision with root package name */
    public final t0 f35188w = new t0();

    /* renamed from: y, reason: collision with root package name */
    public int f35190y = -1;

    public r(c2.e2 e2Var, v vVar, o2 o2Var, t.c0 c0Var, u0.a aVar, u0.a aVar2, e0 e0Var) {
        boolean z10;
        this.f35166a = e2Var;
        this.f35167b = vVar;
        this.f35168c = o2Var;
        this.f35169d = c0Var;
        this.f35170e = aVar;
        this.f35171f = aVar2;
        this.f35172g = e0Var;
        if (!vVar.e() && !vVar.c()) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.B = z10;
        this.C = new q(this, 0);
        this.D = new l9.c();
        n2 g10 = o2Var.g();
        g10.c();
        this.F = g10;
        o2 o2Var2 = new o2();
        if (vVar.e()) {
            o2Var2.e();
        }
        if (vVar.c()) {
            o2Var2.f35115j = new t.t();
        }
        this.G = o2Var2;
        q2 h10 = o2Var2.h();
        h10.e(true);
        this.H = h10;
        this.L = new u0.b(this, aVar);
        n2 g11 = this.G.g();
        try {
            d a10 = g11.a(0);
            g11.c();
            this.M = a10;
            this.N = new u0.c();
        } catch (Throwable th2) {
            g11.c();
            throw th2;
        }
    }

    public static final int S(r rVar, int i10, boolean z10, int i11) {
        boolean z11;
        boolean z12;
        int i12;
        o oVar;
        n2 n2Var = rVar.F;
        int[] iArr = n2Var.f35086b;
        int i13 = i10 * 5;
        if ((iArr[i13 + 1] & 134217728) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            int i14 = iArr[i13];
            Object j10 = n2Var.j(iArr, i10);
            if (i14 == 206 && Intrinsics.a(j10, t.f35205e)) {
                Object g10 = n2Var.g(i10, 0);
                if (g10 instanceof o) {
                    oVar = (o) g10;
                } else {
                    oVar = null;
                }
                if (oVar != null) {
                    for (r rVar2 : oVar.f35100a.f35121e) {
                        rVar2.R();
                        rVar.f35167b.n(rVar2.f35172g);
                    }
                }
                return dp.b.J0(iArr, i10);
            }
            if (dp.b.G0(iArr, i10)) {
                return 1;
            }
            return dp.b.J0(iArr, i10);
        }
        if (dp.b.B0(iArr, i10)) {
            int i15 = iArr[i13 + 3] + i10;
            int i16 = 0;
            for (int i17 = i10 + 1; i17 < i15; i17 += iArr[(i17 * 5) + 3]) {
                boolean G0 = dp.b.G0(iArr, i17);
                u0.b bVar = rVar.L;
                if (G0) {
                    bVar.g();
                    bVar.f36612h.f24251a.add(n2Var.i(i17));
                }
                if (!G0 && !z10) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                if (G0) {
                    i12 = 0;
                } else {
                    i12 = i11 + i16;
                }
                i16 += S(rVar, i17, z12, i12);
                if (G0) {
                    bVar.g();
                    bVar.e();
                }
            }
            if (dp.b.G0(iArr, i10)) {
                return 1;
            }
            return i16;
        }
        if (dp.b.G0(iArr, i10)) {
            return 1;
        }
        return dp.b.J0(iArr, i10);
    }

    public static final void b(r rVar, r1 r1Var, Object obj) {
        boolean z10;
        Object obj2 = null;
        rVar.Z(126665345, null);
        rVar.I();
        rVar.l0(obj);
        int i10 = rVar.P;
        try {
            rVar.P = 126665345;
            if (rVar.O) {
                q2.t(rVar.H);
            }
            if (rVar.O || Intrinsics.a(rVar.F.e(), r1Var)) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10) {
                rVar.O(r1Var);
            }
            rVar.W(t.f35203c, 202, 0, r1Var);
            rVar.J = null;
            boolean z11 = rVar.f35187v;
            rVar.f35187v = z10;
            y.q0 q0Var = new y.q0(7, obj2, obj);
            Object obj3 = b1.d.f3079a;
            dp.b.s1(rVar, new b1.c(q0Var, true, 316014703));
            rVar.f35187v = z11;
            rVar.s(false);
            rVar.J = null;
            rVar.P = i10;
            rVar.s(false);
        } catch (Throwable th2) {
            rVar.s(false);
            rVar.J = null;
            rVar.P = i10;
            rVar.s(false);
            throw th2;
        }
    }

    public final void A() {
        o2 o2Var = new o2();
        if (this.B) {
            o2Var.e();
        }
        if (this.f35167b.c()) {
            o2Var.f35115j = new t.t();
        }
        this.G = o2Var;
        q2 h10 = o2Var.h();
        h10.e(true);
        this.H = h10;
    }

    public final f B() {
        return this.f35166a;
    }

    public final r1 C() {
        return o();
    }

    public final x1 D() {
        if (this.f35191z == 0) {
            l9.c cVar = this.D;
            if (!cVar.f24251a.isEmpty()) {
                return (x1) jr.h.l(cVar.f24251a, 1);
            }
        }
        return null;
    }

    public final boolean E() {
        x1 D;
        if (G() && !this.f35187v && ((D = D()) == null || (D.f35242a & 4) == 0)) {
            return false;
        }
        return true;
    }

    public final boolean F() {
        return this.O;
    }

    public final boolean G() {
        x1 D;
        if (!this.O && !this.f35189x && !this.f35187v && (D = D()) != null && (D.f35242a & 8) == 0) {
            return true;
        }
        return false;
    }

    public final void H(ArrayList arrayList) {
        u0.a aVar = this.f35171f;
        u0.b bVar = this.L;
        u0.a aVar2 = bVar.f36606b;
        try {
            bVar.f36606b = aVar;
            aVar.getClass();
            aVar.f36603b.g0(u0.z.f36663c);
            if (arrayList.size() <= 0) {
                u0.a aVar3 = bVar.f36606b;
                aVar3.getClass();
                aVar3.f36603b.g0(u0.n.f36651c);
                bVar.f36610f = 0;
                return;
            }
            Pair pair = (Pair) arrayList.get(0);
            c1 c1Var = (c1) pair.f23353a;
            c1Var.getClass();
            c1Var.getClass();
            throw null;
        } finally {
            bVar.f36606b = aVar2;
        }
    }

    public final Object I() {
        boolean z10 = this.O;
        to.e eVar = m.f35080a;
        if (z10) {
            if (!(!this.f35182q)) {
                t.F("A call to createNode(), emitNode() or useNode() expected");
                throw null;
            }
            return eVar;
        }
        Object h10 = this.F.h();
        if (!this.f35189x || (h10 instanceof o)) {
            return h10;
        }
        return eVar;
    }

    public final int J(int i10) {
        int K0 = dp.b.K0(this.F.f35086b, i10) + 1;
        int i11 = 0;
        while (K0 < i10) {
            if (!dp.b.F0(this.F.f35086b, K0)) {
                i11++;
            }
            K0 += dp.b.D0(this.F.f35086b, K0);
        }
        return i11;
    }

    public final boolean K(v0.a aVar) {
        u0.a aVar2 = this.f35170e;
        if (aVar2.f36603b.d0()) {
            if (aVar.f37642c <= 0 && !(!this.f35183r.isEmpty())) {
                return false;
            }
            q(aVar, null);
            return aVar2.f36603b.e0();
        }
        t.F("Expected applyChanges() to have been called");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0074, code lost:
    
        if (r0 == null) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object L(t0.e0 r15, t0.e0 r16, java.lang.Integer r17, java.util.List r18, kotlin.jvm.functions.Function0 r19) {
        /*
            r14 = this;
            r1 = r14
            r0 = r16
            boolean r2 = r1.E
            int r3 = r1.f35175j
            r4 = 1
            r1.E = r4     // Catch: java.lang.Throwable -> L3b
            r4 = 0
            r1.f35175j = r4     // Catch: java.lang.Throwable -> L3b
            int r5 = r18.size()     // Catch: java.lang.Throwable -> L3b
            r6 = r4
        L12:
            r7 = 0
            if (r6 >= r5) goto L43
            r8 = r18
            java.lang.Object r9 = r8.get(r6)     // Catch: java.lang.Throwable -> L3b
            kotlin.Pair r9 = (kotlin.Pair) r9     // Catch: java.lang.Throwable -> L3b
            java.lang.Object r10 = r9.f23353a     // Catch: java.lang.Throwable -> L3b
            t0.x1 r10 = (t0.x1) r10     // Catch: java.lang.Throwable -> L3b
            java.lang.Object r9 = r9.f23354b     // Catch: java.lang.Throwable -> L3b
            v0.c r9 = (v0.c) r9     // Catch: java.lang.Throwable -> L3b
            if (r9 == 0) goto L3d
            java.lang.Object[] r7 = r9.f37645b     // Catch: java.lang.Throwable -> L3b
            int r9 = r9.f37644a     // Catch: java.lang.Throwable -> L3b
            r11 = r4
        L2c:
            if (r11 >= r9) goto L40
            r12 = r7[r11]     // Catch: java.lang.Throwable -> L3b
            java.lang.String r13 = "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet"
            kotlin.jvm.internal.Intrinsics.d(r12, r13)     // Catch: java.lang.Throwable -> L3b
            r14.g0(r10, r12)     // Catch: java.lang.Throwable -> L3b
            int r11 = r11 + 1
            goto L2c
        L3b:
            r0 = move-exception
            goto L7f
        L3d:
            r14.g0(r10, r7)     // Catch: java.lang.Throwable -> L3b
        L40:
            int r6 = r6 + 1
            goto L12
        L43:
            if (r15 == 0) goto L76
            if (r17 == 0) goto L4c
            int r5 = r17.intValue()     // Catch: java.lang.Throwable -> L3b
            goto L4d
        L4c:
            r5 = -1
        L4d:
            r6 = r15
            t0.y r6 = (t0.y) r6     // Catch: java.lang.Throwable -> L3b
            if (r0 == 0) goto L70
            boolean r8 = kotlin.jvm.internal.Intrinsics.a(r0, r6)     // Catch: java.lang.Throwable -> L3b
            if (r8 != 0) goto L70
            if (r5 < 0) goto L70
            t0.y r0 = (t0.y) r0     // Catch: java.lang.Throwable -> L3b
            r6.f35264o = r0     // Catch: java.lang.Throwable -> L3b
            r6.f35265p = r5     // Catch: java.lang.Throwable -> L3b
            java.lang.Object r0 = r19.mo2invoke()     // Catch: java.lang.Throwable -> L69
            r6.f35264o = r7     // Catch: java.lang.Throwable -> L3b
            r6.f35265p = r4     // Catch: java.lang.Throwable -> L3b
            goto L74
        L69:
            r0 = move-exception
            r5 = r0
            r6.f35264o = r7     // Catch: java.lang.Throwable -> L3b
            r6.f35265p = r4     // Catch: java.lang.Throwable -> L3b
            throw r5     // Catch: java.lang.Throwable -> L3b
        L70:
            java.lang.Object r0 = r19.mo2invoke()     // Catch: java.lang.Throwable -> L3b
        L74:
            if (r0 != 0) goto L7a
        L76:
            java.lang.Object r0 = r19.mo2invoke()     // Catch: java.lang.Throwable -> L3b
        L7a:
            r1.E = r2
            r1.f35175j = r3
            return r0
        L7f:
            r1.E = r2
            r1.f35175j = r3
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: t0.r.L(t0.e0, t0.e0, java.lang.Integer, java.util.List, kotlin.jvm.functions.Function0):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0037, code lost:
    
        if (r10.f35215b < r3) goto L11;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0278 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void M() {
        /*
            Method dump skipped, instructions count: 691
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t0.r.M():void");
    }

    public final void N() {
        int i10;
        S(this, this.F.f35091g, false, 0);
        u0.b bVar = this.L;
        bVar.g();
        bVar.h(false);
        r rVar = bVar.f36605a;
        n2 n2Var = rVar.F;
        if (n2Var.f35087c > 0) {
            int i11 = n2Var.f35093i;
            t0 t0Var = bVar.f36608d;
            int i12 = t0Var.f35210b;
            if (i12 > 0) {
                i10 = t0Var.f35209a[i12 - 1];
            } else {
                i10 = -2;
            }
            if (i10 != i11) {
                if (!bVar.f36607c && bVar.f36609e) {
                    bVar.h(false);
                    u0.a aVar = bVar.f36606b;
                    aVar.getClass();
                    aVar.f36603b.g0(u0.p.f36653c);
                    bVar.f36607c = true;
                }
                if (i11 > 0) {
                    d a10 = n2Var.a(i11);
                    t0Var.b(i11);
                    bVar.h(false);
                    u0.a aVar2 = bVar.f36606b;
                    aVar2.getClass();
                    u0.o oVar = u0.o.f36652c;
                    u0.l0 l0Var = aVar2.f36603b;
                    l0Var.h0(oVar);
                    t.x0(l0Var, 0, a10);
                    int i13 = l0Var.f36648h;
                    int i14 = oVar.f36634a;
                    int a02 = u0.l0.a0(l0Var, i14);
                    int i15 = oVar.f36635b;
                    if (i13 == a02 && l0Var.f36649i == u0.l0.a0(l0Var, i15)) {
                        bVar.f36607c = true;
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        int i16 = 0;
                        for (int i17 = 0; i17 < i14; i17++) {
                            if (((1 << i17) & l0Var.f36648h) != 0) {
                                if (i16 > 0) {
                                    sb2.append(", ");
                                }
                                sb2.append(oVar.b(i17));
                                i16++;
                            }
                        }
                        String sb3 = sb2.toString();
                        StringBuilder p10 = nn.d.p(sb3, "StringBuilder().apply(builderAction).toString()");
                        int i18 = 0;
                        for (int i19 = 0; i19 < i15; i19++) {
                            if (((1 << i19) & l0Var.f36649i) != 0) {
                                if (i16 > 0) {
                                    p10.append(", ");
                                }
                                p10.append(oVar.c(i19));
                                i18++;
                            }
                        }
                        String sb4 = p10.toString();
                        Intrinsics.checkNotNullExpressionValue(sb4, "StringBuilder().apply(builderAction).toString()");
                        StringBuilder sb5 = new StringBuilder("Error while pushing ");
                        sb5.append(oVar);
                        sb5.append(". Not all arguments were provided. Missing ");
                        nn.d.w(sb5, i16, " int arguments (", sb3, ") and ");
                        nn.d.x(sb5, i18, " object arguments (", sb4, ").");
                        throw null;
                    }
                }
            }
        }
        u0.a aVar3 = bVar.f36606b;
        aVar3.getClass();
        aVar3.f36603b.g0(u0.x.f36661c);
        int i20 = bVar.f36610f;
        n2 n2Var2 = rVar.F;
        bVar.f36610f = dp.b.D0(n2Var2.f35086b, n2Var2.f35091g) + i20;
    }

    public final void O(r1 r1Var) {
        v0.d dVar = this.f35186u;
        if (dVar == null) {
            dVar = new v0.d();
            this.f35186u = dVar;
        }
        dVar.f37646a.put(this.F.f35091g, r1Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x008a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void P(int r8, int r9, int r10) {
        /*
            r7 = this;
            t0.n2 r0 = r7.F
            if (r8 != r9) goto L7
        L4:
            r10 = r8
            goto L79
        L7:
            if (r8 == r10) goto L79
            if (r9 != r10) goto Ld
            goto L79
        Ld:
            int[] r1 = r0.f35086b
            int r1 = dp.b.K0(r1, r8)
            if (r1 != r9) goto L18
            r10 = r9
            goto L79
        L18:
            int[] r1 = r0.f35086b
            int r2 = dp.b.K0(r1, r9)
            if (r2 != r8) goto L21
            goto L4
        L21:
            int r2 = r8 * 5
            int r2 = r2 + 2
            r2 = r1[r2]
            int r3 = r9 * 5
            int r3 = r3 + 2
            r3 = r1[r3]
            if (r2 != r3) goto L31
            r10 = r2
            goto L79
        L31:
            r2 = 0
            r3 = r8
            r4 = r2
        L34:
            if (r3 <= 0) goto L3f
            if (r3 == r10) goto L3f
            int r3 = dp.b.K0(r1, r3)
            int r4 = r4 + 1
            goto L34
        L3f:
            r3 = r9
            r5 = r2
        L41:
            if (r3 <= 0) goto L4c
            if (r3 == r10) goto L4c
            int r3 = dp.b.K0(r1, r3)
            int r5 = r5 + 1
            goto L41
        L4c:
            int r10 = r4 - r5
            r6 = r8
            r3 = r2
        L50:
            if (r3 >= r10) goto L5b
            int r6 = r6 * 5
            int r6 = r6 + 2
            r6 = r1[r6]
            int r3 = r3 + 1
            goto L50
        L5b:
            int r5 = r5 - r4
            r10 = r9
        L5d:
            if (r2 >= r5) goto L68
            int r10 = r10 * 5
            int r10 = r10 + 2
            r10 = r1[r10]
            int r2 = r2 + 1
            goto L5d
        L68:
            r2 = r10
            r10 = r6
        L6a:
            if (r10 == r2) goto L79
            int r10 = r10 * 5
            int r10 = r10 + 2
            r10 = r1[r10]
            int r2 = r2 * 5
            int r2 = r2 + 2
            r2 = r1[r2]
            goto L6a
        L79:
            if (r8 <= 0) goto L91
            if (r8 == r10) goto L91
            int[] r1 = r0.f35086b
            boolean r1 = dp.b.G0(r1, r8)
            if (r1 == 0) goto L8a
            u0.b r1 = r7.L
            r1.e()
        L8a:
            int[] r1 = r0.f35086b
            int r8 = dp.b.K0(r1, r8)
            goto L79
        L91:
            r7.r(r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t0.r.P(int, int, int):void");
    }

    public final Object Q() {
        boolean z10 = this.O;
        to.e eVar = m.f35080a;
        if (z10) {
            if (!(!this.f35182q)) {
                t.F("A call to createNode(), emitNode() or useNode() expected");
                throw null;
            }
            return eVar;
        }
        Object h10 = this.F.h();
        if (!this.f35189x || (h10 instanceof o)) {
            if (h10 instanceof i2) {
                return ((i2) h10).f35056a;
            }
            return h10;
        }
        return eVar;
    }

    public final void R() {
        u0.b bVar = this.L;
        o2 o2Var = this.f35168c;
        if (o2Var.f35107b > 0 && dp.b.B0(o2Var.f35106a, 0)) {
            u0.a aVar = new u0.a();
            this.K = aVar;
            n2 g10 = o2Var.g();
            try {
                this.F = g10;
                u0.a aVar2 = bVar.f36606b;
                try {
                    bVar.f36606b = aVar;
                    S(this, 0, false, 0);
                    bVar.g();
                    bVar.f();
                    if (bVar.f36607c) {
                        u0.a aVar3 = bVar.f36606b;
                        aVar3.getClass();
                        aVar3.f36603b.g0(u0.b0.f36617c);
                        if (bVar.f36607c) {
                            bVar.h(false);
                            bVar.h(false);
                            u0.a aVar4 = bVar.f36606b;
                            aVar4.getClass();
                            aVar4.f36603b.g0(u0.m.f36650c);
                            bVar.f36607c = false;
                        }
                    }
                    bVar.f36606b = aVar2;
                    Unit unit = Unit.f23355a;
                } catch (Throwable th2) {
                    bVar.f36606b = aVar2;
                    throw th2;
                }
            } finally {
                g10.c();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void T() {
        /*
            r12 = this;
            java.util.ArrayList r0 = r12.f35183r
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L15
            int r0 = r12.f35176k
            t0.n2 r1 = r12.F
            int r1 = r1.l()
            int r1 = r1 + r0
            r12.f35176k = r1
            goto Ldf
        L15:
            t0.n2 r0 = r12.F
            int r1 = r0.f()
            int r2 = r0.f35091g
            int r3 = r0.f35092h
            r4 = 0
            int[] r5 = r0.f35086b
            if (r2 >= r3) goto L29
            java.lang.Object r2 = r0.j(r5, r2)
            goto L2a
        L29:
            r2 = r4
        L2a:
            java.lang.Object r3 = r0.e()
            int r6 = r12.f35177l
            to.e r7 = t0.m.f35080a
            r8 = 207(0xcf, float:2.9E-43)
            r9 = 3
            if (r2 != 0) goto L63
            if (r3 == 0) goto L54
            if (r1 != r8) goto L54
            boolean r10 = kotlin.jvm.internal.Intrinsics.a(r3, r7)
            if (r10 != 0) goto L54
            int r10 = r3.hashCode()
            int r11 = r12.P
            int r11 = java.lang.Integer.rotateLeft(r11, r9)
            r10 = r10 ^ r11
            int r10 = java.lang.Integer.rotateLeft(r10, r9)
            r10 = r10 ^ r6
            r12.P = r10
            goto L7f
        L54:
            int r10 = r12.P
            int r10 = java.lang.Integer.rotateLeft(r10, r9)
            r10 = r10 ^ r1
            int r10 = java.lang.Integer.rotateLeft(r10, r9)
            r10 = r10 ^ r6
        L60:
            r12.P = r10
            goto L7f
        L63:
            boolean r10 = r2 instanceof java.lang.Enum
            if (r10 == 0) goto L7a
            r10 = r2
            java.lang.Enum r10 = (java.lang.Enum) r10
            int r10 = r10.ordinal()
        L6e:
            int r11 = r12.P
            int r11 = java.lang.Integer.rotateLeft(r11, r9)
            r10 = r10 ^ r11
            int r10 = java.lang.Integer.rotateLeft(r10, r9)
            goto L60
        L7a:
            int r10 = r2.hashCode()
            goto L6e
        L7f:
            int r10 = r0.f35091g
            boolean r5 = dp.b.G0(r5, r10)
            r12.a0(r4, r5)
            r12.M()
            r0.d()
            if (r2 != 0) goto Lc4
            if (r3 == 0) goto Lb1
            if (r1 != r8) goto Lb1
            boolean r0 = kotlin.jvm.internal.Intrinsics.a(r3, r7)
            if (r0 != 0) goto Lb1
            int r0 = r3.hashCode()
            int r1 = r12.P
            r1 = r1 ^ r6
            int r1 = java.lang.Integer.rotateRight(r1, r9)
            int r0 = java.lang.Integer.hashCode(r0)
            r0 = r0 ^ r1
            int r0 = java.lang.Integer.rotateRight(r0, r9)
            r12.P = r0
            goto Ldf
        Lb1:
            int r0 = r12.P
            r0 = r0 ^ r6
            int r0 = java.lang.Integer.rotateRight(r0, r9)
            int r1 = java.lang.Integer.hashCode(r1)
            r0 = r0 ^ r1
        Lbd:
            int r0 = java.lang.Integer.rotateRight(r0, r9)
            r12.P = r0
            goto Ldf
        Lc4:
            boolean r0 = r2 instanceof java.lang.Enum
            if (r0 == 0) goto Lda
            java.lang.Enum r2 = (java.lang.Enum) r2
            int r0 = r2.ordinal()
        Lce:
            int r1 = r12.P
            int r1 = java.lang.Integer.rotateRight(r1, r9)
            int r0 = java.lang.Integer.hashCode(r0)
            r0 = r0 ^ r1
            goto Lbd
        Lda:
            int r0 = r2.hashCode()
            goto Lce
        Ldf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t0.r.T():void");
    }

    public final void U() {
        int i10;
        n2 n2Var = this.F;
        int i11 = n2Var.f35093i;
        if (i11 >= 0) {
            i10 = dp.b.J0(n2Var.f35086b, i11);
        } else {
            i10 = 0;
        }
        this.f35176k = i10;
        this.F.m();
    }

    public final void V() {
        if (this.f35176k == 0) {
            x1 D = D();
            if (D != null) {
                D.f35242a |= 16;
            }
            if (this.f35183r.isEmpty()) {
                U();
                return;
            } else {
                M();
                return;
            }
        }
        t.F("No nodes can be emitted before calling skipAndEndGroup");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void W(java.lang.Object r20, int r21, int r22, java.lang.Object r23) {
        /*
            Method dump skipped, instructions count: 1059
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t0.r.W(java.lang.Object, int, int, java.lang.Object):void");
    }

    public final void X() {
        W(null, -127, 0, null);
    }

    public final void Y(int i10, j1 j1Var) {
        W(j1Var, i10, 0, null);
    }

    public final void Z(int i10, Object obj) {
        W(obj, i10, 0, null);
    }

    public final void a() {
        k();
        this.f35173h.f24251a.clear();
        this.f35178m.f35210b = 0;
        this.f35184s.f35210b = 0;
        this.f35188w.f35210b = 0;
        this.f35186u = null;
        u0.c cVar = this.N;
        cVar.f36619c.b0();
        cVar.f36618b.b0();
        this.P = 0;
        this.f35191z = 0;
        this.f35182q = false;
        this.O = false;
        this.f35189x = false;
        this.E = false;
        this.f35190y = -1;
        n2 n2Var = this.F;
        if (!n2Var.f35090f) {
            n2Var.c();
        }
        if (!this.H.f35164v) {
            A();
        }
    }

    public final void a0(Object obj, boolean z10) {
        if (z10) {
            n2 n2Var = this.F;
            if (n2Var.f35095k <= 0) {
                if (dp.b.G0(n2Var.f35086b, n2Var.f35091g)) {
                    n2Var.n();
                    return;
                } else {
                    al.d.e1("Expected a node group");
                    throw null;
                }
            }
            return;
        }
        if (obj != null && this.F.e() != obj) {
            u0.b bVar = this.L;
            bVar.getClass();
            bVar.h(false);
            u0.a aVar = bVar.f36606b;
            aVar.getClass();
            u0.e0 e0Var = u0.e0.f36624c;
            u0.l0 l0Var = aVar.f36603b;
            l0Var.h0(e0Var);
            t.x0(l0Var, 0, obj);
            int i10 = l0Var.f36648h;
            int i11 = e0Var.f36634a;
            int a02 = u0.l0.a0(l0Var, i11);
            int i12 = e0Var.f36635b;
            if (i10 != a02 || l0Var.f36649i != u0.l0.a0(l0Var, i12)) {
                StringBuilder sb2 = new StringBuilder();
                int i13 = 0;
                for (int i14 = 0; i14 < i11; i14++) {
                    if (((1 << i14) & l0Var.f36648h) != 0) {
                        if (i13 > 0) {
                            sb2.append(", ");
                        }
                        sb2.append(e0Var.b(i14));
                        i13++;
                    }
                }
                String sb3 = sb2.toString();
                StringBuilder p10 = nn.d.p(sb3, "StringBuilder().apply(builderAction).toString()");
                int i15 = 0;
                for (int i16 = 0; i16 < i12; i16++) {
                    if (((1 << i16) & l0Var.f36649i) != 0) {
                        if (i13 > 0) {
                            p10.append(", ");
                        }
                        p10.append(e0Var.c(i16));
                        i15++;
                    }
                }
                String sb4 = p10.toString();
                Intrinsics.checkNotNullExpressionValue(sb4, "StringBuilder().apply(builderAction).toString()");
                StringBuilder sb5 = new StringBuilder("Error while pushing ");
                sb5.append(e0Var);
                sb5.append(". Not all arguments were provided. Missing ");
                nn.d.w(sb5, i13, " int arguments (", sb3, ") and ");
                nn.d.x(sb5, i15, " object arguments (", sb4, ").");
                throw null;
            }
        }
        this.F.n();
    }

    public final void b0(int i10) {
        W(null, i10, 0, null);
    }

    public final void c(Object obj, Function2 function2) {
        int i10 = 0;
        if (this.O) {
            u0.c cVar = this.N;
            cVar.getClass();
            u0.f0 f0Var = u0.f0.f36626c;
            u0.l0 l0Var = cVar.f36618b;
            l0Var.h0(f0Var);
            t.x0(l0Var, 0, obj);
            Intrinsics.d(function2, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
            zq.f.z(2, function2);
            t.x0(l0Var, 1, function2);
            int i11 = l0Var.f36648h;
            int i12 = f0Var.f36634a;
            int a02 = u0.l0.a0(l0Var, i12);
            int i13 = f0Var.f36635b;
            if (i11 != a02 || l0Var.f36649i != u0.l0.a0(l0Var, i13)) {
                StringBuilder sb2 = new StringBuilder();
                int i14 = 0;
                while (i14 < i12) {
                    int i15 = i12;
                    if (((1 << i14) & l0Var.f36648h) != 0) {
                        if (i10 > 0) {
                            sb2.append(", ");
                        }
                        sb2.append(f0Var.b(i14));
                        i10++;
                    }
                    i14++;
                    i12 = i15;
                }
                String sb3 = sb2.toString();
                StringBuilder p10 = nn.d.p(sb3, "StringBuilder().apply(builderAction).toString()");
                int i16 = 0;
                int i17 = 0;
                while (i17 < i13) {
                    int i18 = i13;
                    if (((1 << i17) & l0Var.f36649i) != 0) {
                        if (i10 > 0) {
                            p10.append(", ");
                        }
                        p10.append(f0Var.c(i17));
                        i16++;
                    }
                    i17++;
                    i13 = i18;
                }
                String sb4 = p10.toString();
                Intrinsics.checkNotNullExpressionValue(sb4, "StringBuilder().apply(builderAction).toString()");
                StringBuilder sb5 = new StringBuilder("Error while pushing ");
                sb5.append(f0Var);
                sb5.append(". Not all arguments were provided. Missing ");
                nn.d.w(sb5, i10, " int arguments (", sb3, ") and ");
                nn.d.x(sb5, i16, " object arguments (", sb4, ").");
                throw null;
            }
            return;
        }
        u0.b bVar = this.L;
        bVar.f();
        u0.a aVar = bVar.f36606b;
        aVar.getClass();
        u0.f0 f0Var2 = u0.f0.f36626c;
        u0.l0 l0Var2 = aVar.f36603b;
        l0Var2.h0(f0Var2);
        int i19 = 0;
        t.x0(l0Var2, 0, obj);
        Intrinsics.d(function2, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
        zq.f.z(2, function2);
        t.x0(l0Var2, 1, function2);
        int i20 = l0Var2.f36648h;
        int i21 = f0Var2.f36634a;
        int a03 = u0.l0.a0(l0Var2, i21);
        int i22 = f0Var2.f36635b;
        if (i20 == a03 && l0Var2.f36649i == u0.l0.a0(l0Var2, i22)) {
            return;
        }
        StringBuilder sb6 = new StringBuilder();
        for (int i23 = 0; i23 < i21; i23++) {
            if (((1 << i23) & l0Var2.f36648h) != 0) {
                if (i19 > 0) {
                    sb6.append(", ");
                }
                sb6.append(f0Var2.b(i23));
                i19++;
            }
        }
        String sb7 = sb6.toString();
        StringBuilder p11 = nn.d.p(sb7, "StringBuilder().apply(builderAction).toString()");
        int i24 = 0;
        int i25 = 0;
        while (i24 < i22) {
            int i26 = i22;
            if (((1 << i24) & l0Var2.f36649i) != 0) {
                if (i19 > 0) {
                    p11.append(", ");
                }
                p11.append(f0Var2.c(i24));
                i25++;
            }
            i24++;
            i22 = i26;
        }
        String sb8 = p11.toString();
        Intrinsics.checkNotNullExpressionValue(sb8, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb9 = new StringBuilder("Error while pushing ");
        sb9.append(f0Var2);
        sb9.append(". Not all arguments were provided. Missing ");
        nn.d.w(sb9, i19, " int arguments (", sb7, ") and ");
        nn.d.x(sb9, i25, " object arguments (", sb8, ").");
        throw null;
    }

    public final r c0(int i10) {
        x1 x1Var;
        u0 u0Var = null;
        boolean z10 = false;
        W(null, i10, 0, null);
        boolean z11 = this.O;
        l9.c cVar = this.D;
        e0 e0Var = this.f35172g;
        if (z11) {
            Intrinsics.d(e0Var, "null cannot be cast to non-null type androidx.compose.runtime.CompositionImpl");
            x1 x1Var2 = new x1((y) e0Var);
            cVar.f24251a.add(x1Var2);
            l0(x1Var2);
            x1Var2.f35246e = this.A;
            x1Var2.f35242a &= -17;
        } else {
            ArrayList arrayList = this.f35183r;
            int S = t.S(this.F.f35093i, arrayList);
            if (S >= 0) {
                u0Var = (u0) arrayList.remove(S);
            }
            Object h10 = this.F.h();
            if (Intrinsics.a(h10, m.f35080a)) {
                Intrinsics.d(e0Var, "null cannot be cast to non-null type androidx.compose.runtime.CompositionImpl");
                x1Var = new x1((y) e0Var);
                l0(x1Var);
            } else {
                Intrinsics.d(h10, "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl");
                x1Var = (x1) h10;
            }
            if (u0Var == null) {
                int i11 = x1Var.f35242a;
                if ((i11 & 64) != 0) {
                    z10 = true;
                }
                if (z10) {
                    x1Var.f35242a = i11 & (-65);
                }
                if (!z10) {
                    x1Var.f35242a &= -9;
                    cVar.f24251a.add(x1Var);
                    x1Var.f35246e = this.A;
                    x1Var.f35242a &= -17;
                }
            }
            x1Var.f35242a |= 8;
            cVar.f24251a.add(x1Var);
            x1Var.f35246e = this.A;
            x1Var.f35242a &= -17;
        }
        return this;
    }

    public final boolean d(double d10) {
        Object I = I();
        if ((I instanceof Double) && d10 == ((Number) I).doubleValue()) {
            return false;
        }
        l0(Double.valueOf(d10));
        return true;
    }

    public final void d0(Object obj) {
        if (!this.O && this.F.f() == 207 && !Intrinsics.a(this.F.e(), obj) && this.f35190y < 0) {
            this.f35190y = this.F.f35091g;
            this.f35189x = true;
        }
        W(null, 207, 0, obj);
    }

    public final boolean e(float f10) {
        Object I = I();
        if ((I instanceof Float) && f10 == ((Number) I).floatValue()) {
            return false;
        }
        l0(Float.valueOf(f10));
        return true;
    }

    public final void e0() {
        W(null, 125, 2, null);
        this.f35182q = true;
    }

    public final boolean f(int i10) {
        Object I = I();
        if ((I instanceof Integer) && i10 == ((Number) I).intValue()) {
            return false;
        }
        l0(Integer.valueOf(i10));
        return true;
    }

    public final void f0() {
        this.f35177l = 0;
        o2 o2Var = this.f35168c;
        this.F = o2Var.g();
        W(null, 100, 0, null);
        v vVar = this.f35167b;
        vVar.o();
        this.f35185t = vVar.f();
        this.f35188w.b(this.f35187v ? 1 : 0);
        this.f35187v = h(this.f35185t);
        this.J = null;
        if (!this.f35181p) {
            this.f35181p = vVar.d();
        }
        if (!this.B) {
            this.B = vVar.e();
        }
        Set set = (Set) al.d.L0(this.f35185t, f1.b.f15905a);
        if (set != null) {
            set.add(o2Var);
            vVar.l(set);
        }
        W(null, vVar.g(), 0, null);
    }

    public final boolean g(long j10) {
        Object I = I();
        if ((I instanceof Long) && j10 == ((Number) I).longValue()) {
            return false;
        }
        l0(Long.valueOf(j10));
        return true;
    }

    public final boolean g0(x1 x1Var, Object obj) {
        d dVar = x1Var.f35244c;
        if (dVar == null) {
            return false;
        }
        int b10 = this.F.f35085a.b(dVar);
        if (!this.E || b10 < this.F.f35091g) {
            return false;
        }
        ArrayList arrayList = this.f35183r;
        int S = t.S(b10, arrayList);
        v0.c cVar = null;
        if (S < 0) {
            int i10 = -(S + 1);
            if (obj != null) {
                cVar = new v0.c();
                cVar.add(obj);
            }
            arrayList.add(i10, new u0(x1Var, b10, cVar));
        } else if (obj == null) {
            ((u0) arrayList.get(S)).f35216c = null;
        } else {
            v0.c cVar2 = ((u0) arrayList.get(S)).f35216c;
            if (cVar2 != null) {
                cVar2.add(obj);
            }
        }
        return true;
    }

    public final boolean h(Object obj) {
        if (!Intrinsics.a(I(), obj)) {
            l0(obj);
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x009c, code lost:
    
        r15 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00ac, code lost:
    
        if (((r3 & ((~r3) << 6)) & (-9187201950435737472L)) == 0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ae, code lost:
    
        r3 = r15.b(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b6, code lost:
    
        if (r15.f34896f != 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00c9, code lost:
    
        if (((r15.f34891a[r3 >> 3] >> ((r3 & 7) << 3)) & 255) != 254) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00cc, code lost:
    
        r3 = r15.f34894d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ce, code lost:
    
        if (r3 <= 8) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d0, code lost:
    
        r4 = r15.f34895e;
        r6 = ut.t.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00e7, code lost:
    
        if (java.lang.Long.compare((r4 * 32) ^ Long.MIN_VALUE, (r3 * 25) ^ Long.MIN_VALUE) > 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00e9, code lost:
    
        r15.g(t.f0.b(r15.f34894d));
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00fc, code lost:
    
        r3 = r15.b(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00f3, code lost:
    
        r15.g(t.f0.b(r15.f34894d));
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0100, code lost:
    
        r15.f34895e++;
        r4 = r15.f34896f;
        r5 = r15.f34891a;
        r6 = r3 >> 3;
        r13 = r5[r6];
        r7 = (r3 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x011a, code lost:
    
        if (((r13 >> r7) & 255) != 128) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x011d, code lost:
    
        r16 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x011f, code lost:
    
        r15.f34896f = r4 - r16;
        r5[r6] = ((~(255 << r7)) & r13) | (r11 << r7);
        r0 = r15.f34894d;
        r1 = ((r3 - 7) & r0) + (r0 & 7);
        r0 = r1 >> 3;
        r1 = (r1 & 7) << 3;
        r5[r0] = (r5[r0] & (~(255 << r1))) | (r11 << r1);
        r0 = ~r3;
     */
    /* JADX WARN: Type inference failed for: r4v14, types: [t.r, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h0(int r24, int r25) {
        /*
            Method dump skipped, instructions count: 378
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t0.r.h0(int, int):void");
    }

    public final boolean i(boolean z10) {
        Object I = I();
        if ((I instanceof Boolean) && z10 == ((Boolean) I).booleanValue()) {
            return false;
        }
        l0(Boolean.valueOf(z10));
        return true;
    }

    public final void i0(int i10, int i11) {
        int m02 = m0(i10);
        if (m02 != i11) {
            int i12 = i11 - m02;
            l9.c cVar = this.f35173h;
            int size = cVar.f24251a.size() - 1;
            while (i10 != -1) {
                int m03 = m0(i10) + i12;
                h0(i10, m03);
                int i13 = size;
                while (true) {
                    if (-1 < i13) {
                        q1 q1Var = (q1) cVar.f24251a.get(i13);
                        if (q1Var != null && q1Var.b(i10, m03)) {
                            size = i13 - 1;
                            break;
                        }
                        i13--;
                    } else {
                        break;
                    }
                }
                if (i10 < 0) {
                    i10 = this.F.f35093i;
                } else if (!dp.b.G0(this.F.f35086b, i10)) {
                    i10 = dp.b.K0(this.F.f35086b, i10);
                } else {
                    return;
                }
            }
        }
    }

    public final boolean j(Object obj) {
        if (I() != obj) {
            l0(obj);
            return true;
        }
        return false;
    }

    public final b1.g j0(r1 r1Var, b1.g gVar) {
        b1.g gVar2 = (b1.g) r1Var;
        gVar2.getClass();
        b1.f fVar = new b1.f(gVar2);
        fVar.putAll(gVar);
        b1.g g10 = fVar.g();
        Y(204, t.f35204d);
        I();
        l0(g10);
        I();
        l0(gVar);
        s(false);
        return g10;
    }

    public final void k() {
        this.f35174i = null;
        this.f35175j = 0;
        this.f35176k = 0;
        this.P = 0;
        this.f35182q = false;
        u0.b bVar = this.L;
        bVar.f36607c = false;
        bVar.f36608d.f35210b = 0;
        bVar.f36610f = 0;
        this.D.f24251a.clear();
        this.f35179n = null;
        this.f35180o = null;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [t0.i2, java.lang.Object] */
    public final void k0(Object obj) {
        int i10;
        q2 q2Var;
        if (obj instanceof h2) {
            d dVar = null;
            if (this.O) {
                u0.a aVar = this.L.f36606b;
                aVar.getClass();
                u0.w wVar = u0.w.f36660c;
                u0.l0 l0Var = aVar.f36603b;
                l0Var.h0(wVar);
                t.x0(l0Var, 0, (h2) obj);
                int i11 = l0Var.f36648h;
                int i12 = wVar.f36634a;
                int a02 = u0.l0.a0(l0Var, i12);
                int i13 = wVar.f36635b;
                if (i11 != a02 || l0Var.f36649i != u0.l0.a0(l0Var, i13)) {
                    StringBuilder sb2 = new StringBuilder();
                    int i14 = 0;
                    for (int i15 = 0; i15 < i12; i15++) {
                        if (((1 << i15) & l0Var.f36648h) != 0) {
                            if (i14 > 0) {
                                sb2.append(", ");
                            }
                            sb2.append(wVar.b(i15));
                            i14++;
                        }
                    }
                    String sb3 = sb2.toString();
                    StringBuilder p10 = nn.d.p(sb3, "StringBuilder().apply(builderAction).toString()");
                    int i16 = 0;
                    for (int i17 = 0; i17 < i13; i17++) {
                        if (((1 << i17) & l0Var.f36649i) != 0) {
                            if (i14 > 0) {
                                p10.append(", ");
                            }
                            p10.append(wVar.c(i17));
                            i16++;
                        }
                    }
                    String sb4 = p10.toString();
                    Intrinsics.checkNotNullExpressionValue(sb4, "StringBuilder().apply(builderAction).toString()");
                    StringBuilder sb5 = new StringBuilder("Error while pushing ");
                    sb5.append(wVar);
                    sb5.append(". Not all arguments were provided. Missing ");
                    nn.d.w(sb5, i14, " int arguments (", sb3, ") and ");
                    nn.d.x(sb5, i16, " object arguments (", sb4, ").");
                    throw null;
                }
            }
            this.f35169d.add(obj);
            h2 h2Var = (h2) obj;
            if (this.O) {
                q2 q2Var2 = this.H;
                int i18 = q2Var2.f35161s;
                if (i18 > q2Var2.f35163u + 1) {
                    int i19 = i18 - 1;
                    int y10 = q2Var2.y(q2Var2.f35144b, i19);
                    while (true) {
                        i10 = i19;
                        i19 = y10;
                        q2Var = this.H;
                        if (i19 == q2Var.f35163u || i19 < 0) {
                            break;
                        } else {
                            y10 = q2Var.y(q2Var.f35144b, i19);
                        }
                    }
                    dVar = q2Var.b(i10);
                }
            } else {
                n2 n2Var = this.F;
                int i20 = n2Var.f35091g;
                if (i20 > n2Var.f35093i + 1) {
                    dVar = n2Var.a(i20 - 1);
                }
            }
            ?? obj2 = new Object();
            obj2.f35056a = h2Var;
            obj2.f35057b = dVar;
            obj = obj2;
        }
        l0(obj);
    }

    public final int l(int i10, int i11, int i12, int i13) {
        int i14;
        Object b10;
        if (i10 != i12) {
            n2 n2Var = this.F;
            boolean F0 = dp.b.F0(n2Var.f35086b, i10);
            int[] iArr = n2Var.f35086b;
            if (F0) {
                Object j10 = n2Var.j(iArr, i10);
                if (j10 != null) {
                    if (j10 instanceof Enum) {
                        i14 = ((Enum) j10).ordinal();
                    } else {
                        i14 = j10.hashCode();
                    }
                } else {
                    i14 = 0;
                }
            } else {
                int i15 = iArr[i10 * 5];
                if (i15 == 207 && (b10 = n2Var.b(iArr, i10)) != null && !Intrinsics.a(b10, m.f35080a)) {
                    i15 = b10.hashCode();
                }
                i14 = i15;
            }
            if (i14 == 126665345) {
                return i14;
            }
            int K0 = dp.b.K0(this.F.f35086b, i10);
            if (K0 != i12) {
                i13 = l(K0, J(K0), i12, i13);
            }
            if (dp.b.F0(this.F.f35086b, i10)) {
                i11 = 0;
            }
            return Integer.rotateLeft(Integer.rotateLeft(i13, 3) ^ i14, 3) ^ i11;
        }
        return i13;
    }

    public final void l0(Object obj) {
        int i10;
        int i11;
        if (this.O) {
            this.H.M(obj);
            return;
        }
        n2 n2Var = this.F;
        boolean z10 = n2Var.f35098n;
        int i12 = 1;
        u0.b bVar = this.L;
        if (z10) {
            int L0 = (n2Var.f35096l - dp.b.L0(n2Var.f35086b, n2Var.f35093i)) - 1;
            if (bVar.f36605a.F.f35093i - bVar.f36610f < 0) {
                n2 n2Var2 = this.F;
                d a10 = n2Var2.a(n2Var2.f35093i);
                u0.a aVar = bVar.f36606b;
                u0.d0 d0Var = u0.d0.f36622c;
                u0.l0 l0Var = aVar.f36603b;
                l0Var.h0(d0Var);
                t.x0(l0Var, 0, obj);
                t.x0(l0Var, 1, a10);
                t.w0(l0Var, 0, L0);
                if (l0Var.f36648h != u0.l0.a0(l0Var, 1) || l0Var.f36649i != u0.l0.a0(l0Var, 2)) {
                    StringBuilder sb2 = new StringBuilder();
                    if ((l0Var.f36648h & 1) != 0) {
                        sb2.append(d0Var.b(0));
                        i11 = 1;
                    } else {
                        i11 = 0;
                    }
                    String sb3 = sb2.toString();
                    StringBuilder p10 = nn.d.p(sb3, "StringBuilder().apply(builderAction).toString()");
                    int i13 = 0;
                    int i14 = 0;
                    for (int i15 = 2; i13 < i15; i15 = 2) {
                        if (((1 << i13) & l0Var.f36649i) != 0) {
                            if (i11 > 0) {
                                p10.append(", ");
                            }
                            p10.append(d0Var.c(i13));
                            i14++;
                        }
                        i13++;
                    }
                    String sb4 = p10.toString();
                    Intrinsics.checkNotNullExpressionValue(sb4, "StringBuilder().apply(builderAction).toString()");
                    StringBuilder sb5 = new StringBuilder("Error while pushing ");
                    sb5.append(d0Var);
                    sb5.append(". Not all arguments were provided. Missing ");
                    nn.d.w(sb5, i11, " int arguments (", sb3, ") and ");
                    nn.d.x(sb5, i14, " object arguments (", sb4, ").");
                    throw null;
                }
                return;
            }
            bVar.h(true);
            u0.a aVar2 = bVar.f36606b;
            u0.g0 g0Var = u0.g0.f36628c;
            u0.l0 l0Var2 = aVar2.f36603b;
            l0Var2.h0(g0Var);
            t.x0(l0Var2, 0, obj);
            t.w0(l0Var2, 0, L0);
            if (l0Var2.f36648h != u0.l0.a0(l0Var2, 1) || l0Var2.f36649i != u0.l0.a0(l0Var2, 1)) {
                StringBuilder sb6 = new StringBuilder();
                if ((l0Var2.f36648h & 1) != 0) {
                    sb6.append(g0Var.b(0));
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                String sb7 = sb6.toString();
                StringBuilder p11 = nn.d.p(sb7, "StringBuilder().apply(builderAction).toString()");
                if ((l0Var2.f36649i & 1) != 0) {
                    if (i10 > 0) {
                        p11.append(", ");
                    }
                    p11.append(g0Var.c(0));
                } else {
                    i12 = 0;
                }
                String sb8 = p11.toString();
                Intrinsics.checkNotNullExpressionValue(sb8, "StringBuilder().apply(builderAction).toString()");
                StringBuilder sb9 = new StringBuilder("Error while pushing ");
                sb9.append(g0Var);
                sb9.append(". Not all arguments were provided. Missing ");
                nn.d.w(sb9, i10, " int arguments (", sb7, ") and ");
                nn.d.x(sb9, i12, " object arguments (", sb8, ").");
                throw null;
            }
            return;
        }
        d a11 = n2Var.a(n2Var.f35093i);
        u0.a aVar3 = bVar.f36606b;
        aVar3.getClass();
        u0.e eVar = u0.e.f36623c;
        u0.l0 l0Var3 = aVar3.f36603b;
        l0Var3.h0(eVar);
        int i16 = 0;
        t.x0(l0Var3, 0, a11);
        t.x0(l0Var3, 1, obj);
        int i17 = l0Var3.f36648h;
        int i18 = eVar.f36634a;
        int a02 = u0.l0.a0(l0Var3, i18);
        int i19 = eVar.f36635b;
        if (i17 == a02 && l0Var3.f36649i == u0.l0.a0(l0Var3, i19)) {
            return;
        }
        StringBuilder sb10 = new StringBuilder();
        int i20 = 0;
        while (i20 < i18) {
            if (((i12 << i20) & l0Var3.f36648h) != 0) {
                if (i16 > 0) {
                    sb10.append(", ");
                }
                sb10.append(eVar.b(i20));
                i16++;
            }
            i20++;
            i12 = 1;
        }
        String sb11 = sb10.toString();
        StringBuilder p12 = nn.d.p(sb11, "StringBuilder().apply(builderAction).toString()");
        int i21 = 0;
        int i22 = 0;
        while (i21 < i19) {
            int i23 = i19;
            if (((1 << i21) & l0Var3.f36649i) != 0) {
                if (i16 > 0) {
                    p12.append(", ");
                }
                p12.append(eVar.c(i21));
                i22++;
            }
            i21++;
            i19 = i23;
        }
        String sb12 = p12.toString();
        Intrinsics.checkNotNullExpressionValue(sb12, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb13 = new StringBuilder("Error while pushing ");
        sb13.append(eVar);
        sb13.append(". Not all arguments were provided. Missing ");
        nn.d.w(sb13, i16, " int arguments (", sb11, ") and ");
        nn.d.x(sb13, i22, " object arguments (", sb12, ").");
        throw null;
    }

    public final Object m(u1 u1Var) {
        return al.d.L0(o(), u1Var);
    }

    public final int m0(int i10) {
        int i11;
        if (i10 < 0) {
            t.r rVar = this.f35180o;
            if (rVar == null || rVar.c(i10) < 0) {
                return 0;
            }
            return rVar.d(i10);
        }
        int[] iArr = this.f35179n;
        if (iArr != null && (i11 = iArr[i10]) >= 0) {
            return i11;
        }
        return dp.b.J0(this.F.f35086b, i10);
    }

    public final void n(Function0 function0) {
        boolean z10;
        int i10;
        int i11;
        int i12;
        if (this.f35182q) {
            this.f35182q = false;
            if (this.O) {
                t0 t0Var = this.f35178m;
                int i13 = t0Var.f35209a[t0Var.f35210b - 1];
                q2 q2Var = this.H;
                d b10 = q2Var.b(q2Var.f35163u);
                this.f35176k++;
                u0.c cVar = this.N;
                u0.q qVar = u0.q.f36654c;
                u0.l0 l0Var = cVar.f36618b;
                l0Var.h0(qVar);
                t.x0(l0Var, 0, function0);
                t.w0(l0Var, 0, i13);
                t.x0(l0Var, 1, b10);
                if (l0Var.f36648h == u0.l0.a0(l0Var, 1) && l0Var.f36649i == u0.l0.a0(l0Var, 2)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    StringBuilder sb2 = new StringBuilder();
                    if ((l0Var.f36648h & 1) != 0) {
                        sb2.append(qVar.b(0));
                        i12 = 1;
                    } else {
                        i12 = 0;
                    }
                    String sb3 = sb2.toString();
                    StringBuilder p10 = nn.d.p(sb3, "StringBuilder().apply(builderAction).toString()");
                    int i14 = 0;
                    for (int i15 = 0; i15 < 2; i15++) {
                        if (((1 << i15) & l0Var.f36649i) != 0) {
                            if (i12 > 0) {
                                p10.append(", ");
                            }
                            p10.append(qVar.c(i15));
                            i14++;
                        }
                    }
                    String sb4 = p10.toString();
                    Intrinsics.checkNotNullExpressionValue(sb4, "StringBuilder().apply(builderAction).toString()");
                    StringBuilder sb5 = new StringBuilder("Error while pushing ");
                    sb5.append(qVar);
                    sb5.append(". Not all arguments were provided. Missing ");
                    nn.d.w(sb5, i12, " int arguments (", sb3, ") and ");
                    nn.d.x(sb5, i14, " object arguments (", sb4, ").");
                    throw null;
                }
                u0.v vVar = u0.v.f36659c;
                u0.l0 l0Var2 = cVar.f36619c;
                l0Var2.h0(vVar);
                t.w0(l0Var2, 0, i13);
                t.x0(l0Var2, 0, b10);
                if (l0Var2.f36648h == u0.l0.a0(l0Var2, 1) && l0Var2.f36649i == u0.l0.a0(l0Var2, 1)) {
                    return;
                }
                StringBuilder sb6 = new StringBuilder();
                if ((l0Var2.f36648h & 1) != 0) {
                    sb6.append(vVar.b(0));
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                String sb7 = sb6.toString();
                StringBuilder p11 = nn.d.p(sb7, "StringBuilder().apply(builderAction).toString()");
                if ((l0Var2.f36649i & 1) != 0) {
                    if (i10 > 0) {
                        p11.append(", ");
                    }
                    p11.append(vVar.c(0));
                    i11 = 1;
                } else {
                    i11 = 0;
                }
                String sb8 = p11.toString();
                Intrinsics.checkNotNullExpressionValue(sb8, "StringBuilder().apply(builderAction).toString()");
                StringBuilder sb9 = new StringBuilder("Error while pushing ");
                sb9.append(vVar);
                sb9.append(". Not all arguments were provided. Missing ");
                nn.d.w(sb9, i10, " int arguments (", sb7, ") and ");
                nn.d.x(sb9, i11, " object arguments (", sb8, ").");
                throw null;
            }
            t.F("createNode() can only be called when inserting");
            throw null;
        }
        t.F("A call to createNode(), emitNode() or useNode() expected was not expected");
        throw null;
    }

    public final void n0() {
        boolean z10;
        if (this.f35182q) {
            this.f35182q = false;
            if (!this.O) {
                n2 n2Var = this.F;
                Object i10 = n2Var.i(n2Var.f35093i);
                u0.b bVar = this.L;
                bVar.f36612h.f24251a.add(i10);
                if (this.f35189x && ((z10 = i10 instanceof l))) {
                    bVar.f();
                    u0.a aVar = bVar.f36606b;
                    aVar.getClass();
                    if (z10) {
                        aVar.f36603b.g0(u0.i0.f36632c);
                        return;
                    }
                    return;
                }
                return;
            }
            t.F("useNode() called while inserting");
            throw null;
        }
        t.F("A call to createNode(), emitNode() or useNode() expected was not expected");
        throw null;
    }

    public final r1 o() {
        r1 r1Var;
        r1 r1Var2;
        Object obj;
        Object obj2;
        r1 r1Var3 = this.J;
        if (r1Var3 != null) {
            return r1Var3;
        }
        int i10 = this.F.f35093i;
        boolean z10 = this.O;
        j1 j1Var = t.f35203c;
        if (z10 && this.I) {
            int i11 = this.H.f35163u;
            while (i11 > 0) {
                q2 q2Var = this.H;
                if (q2Var.f35144b[q2Var.o(i11) * 5] == 202) {
                    q2 q2Var2 = this.H;
                    int o10 = q2Var2.o(i11);
                    if (dp.b.F0(q2Var2.f35144b, o10)) {
                        Object[] objArr = q2Var2.f35145c;
                        int[] iArr = q2Var2.f35144b;
                        int i12 = o10 * 5;
                        obj = objArr[dp.b.X0(iArr[i12 + 1] >> 30) + iArr[i12 + 4]];
                    } else {
                        obj = null;
                    }
                    if (Intrinsics.a(obj, j1Var)) {
                        q2 q2Var3 = this.H;
                        int o11 = q2Var3.o(i11);
                        if (dp.b.E0(q2Var3.f35144b, o11)) {
                            Object[] objArr2 = q2Var3.f35145c;
                            int[] iArr2 = q2Var3.f35144b;
                            obj2 = objArr2[dp.b.X0(iArr2[(o11 * 5) + 1] >> 29) + q2Var3.f(iArr2, o11)];
                        } else {
                            obj2 = m.f35080a;
                        }
                        Intrinsics.d(obj2, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
                        r1 r1Var4 = (r1) obj2;
                        this.J = r1Var4;
                        return r1Var4;
                    }
                }
                q2 q2Var4 = this.H;
                i11 = q2Var4.y(q2Var4.f35144b, i11);
            }
        }
        if (this.F.f35087c > 0) {
            while (i10 > 0) {
                n2 n2Var = this.F;
                int[] iArr3 = n2Var.f35086b;
                if (iArr3[i10 * 5] == 202 && Intrinsics.a(n2Var.j(iArr3, i10), j1Var)) {
                    v0.d dVar = this.f35186u;
                    if (dVar != null && (r1Var2 = (r1) dVar.f37646a.get(i10)) != null) {
                        r1Var = r1Var2;
                    } else {
                        n2 n2Var2 = this.F;
                        Object b10 = n2Var2.b(n2Var2.f35086b, i10);
                        Intrinsics.d(b10, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
                        r1Var = (r1) b10;
                    }
                    this.J = r1Var;
                    return r1Var;
                }
                i10 = dp.b.K0(this.F.f35086b, i10);
            }
        }
        r1 r1Var5 = this.f35185t;
        this.J = r1Var5;
        return r1Var5;
    }

    public final void p(boolean z10) {
        boolean z11;
        if (this.f35176k == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            if (!this.O) {
                if (!z10) {
                    U();
                    return;
                }
                n2 n2Var = this.F;
                int i10 = n2Var.f35091g;
                int i11 = n2Var.f35092h;
                u0.b bVar = this.L;
                bVar.getClass();
                bVar.h(false);
                u0.a aVar = bVar.f36606b;
                aVar.getClass();
                aVar.f36603b.g0(u0.i.f36631c);
                t.u(i10, i11, this.f35183r);
                this.F.m();
                return;
            }
            return;
        }
        t.F("No nodes can be emitted before calling dactivateToEndGroup");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0049, code lost:
    
        vt.c0.l(r4, t0.t.f35206f);
        r9.f35175j = 0;
        r9.E = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0052, code lost:
    
        f0();
        r10 = I();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0059, code lost:
    
        if (r10 == r11) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005b, code lost:
    
        if (r11 == null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005d, code lost:
    
        l0(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0063, code lost:
    
        r0 = r9.C;
        r3 = t0.t.M();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0069, code lost:
    
        r3.b(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006c, code lost:
    
        r0 = t0.t.f35201a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0070, code lost:
    
        if (r11 == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0072, code lost:
    
        Y(200, r0);
        dp.b.s1(r9, r11);
        s(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x009f, code lost:
    
        r3.n(r3.f37655c - 1);
        y();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a8, code lost:
    
        r9.E = false;
        r4.clear();
        t0.t.u0(r9.H.f35164v);
        A();
        r10 = kotlin.Unit.f23355a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00bc, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0080, code lost:
    
        if (r9.f35187v == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0082, code lost:
    
        if (r10 == null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x008a, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.a(r10, t0.m.f35080a) != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x008c, code lost:
    
        Y(200, r0);
        zq.f.z(2, r10);
        dp.b.s1(r9, (kotlin.jvm.functions.Function2) r10);
        s(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x009c, code lost:
    
        T();
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x007c, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00bd, code lost:
    
        r3.n(r3.f37655c - 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c3, code lost:
    
        throw r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0061, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c4, code lost:
    
        r9.E = false;
        r4.clear();
        a();
        t0.t.u0(r9.H.f35164v);
        A();
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d6, code lost:
    
        throw r10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void q(v0.a r10, b1.c r11) {
        /*
            Method dump skipped, instructions count: 225
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t0.r.q(v0.a, b1.c):void");
    }

    public final void r(int i10, int i11) {
        if (i10 > 0 && i10 != i11) {
            r(dp.b.K0(this.F.f35086b, i10), i11);
            if (dp.b.G0(this.F.f35086b, i10)) {
                this.L.f36612h.f24251a.add(this.F.i(i10));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:128:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x04f8  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0523  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x071c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void s(boolean r29) {
        /*
            Method dump skipped, instructions count: 2387
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t0.r.s(boolean):void");
    }

    public final void t() {
        s(false);
        x1 D = D();
        if (D != null) {
            int i10 = D.f35242a;
            if ((i10 & 1) != 0) {
                D.f35242a = i10 | 2;
            }
        }
    }

    public final void u() {
        s(true);
    }

    public final void v() {
        s(false);
    }

    public final x1 w() {
        x1 x1Var;
        x1 x1Var2;
        d a10;
        x.p2 p2Var;
        l9.c cVar = this.D;
        if (!cVar.f24251a.isEmpty()) {
            ArrayList arrayList = cVar.f24251a;
            x1Var = (x1) arrayList.remove(arrayList.size() - 1);
        } else {
            x1Var = null;
        }
        if (x1Var != null) {
            x1Var.f35242a &= -9;
        }
        if (x1Var != null) {
            int i10 = this.A;
            t.y yVar = x1Var.f35247f;
            if (yVar != null && (x1Var.f35242a & 16) == 0) {
                Object[] objArr = yVar.f34926b;
                int[] iArr = yVar.f34927c;
                long[] jArr = yVar.f34925a;
                int i11 = 2;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i12 = 0;
                    loop0: while (true) {
                        long j10 = jArr[i12];
                        if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i13 = 8 - ((~(i12 - length)) >>> 31);
                            for (int i14 = 0; i14 < i13; i14++) {
                                if ((j10 & 255) < 128) {
                                    int i15 = (i12 << 3) + i14;
                                    Object obj = objArr[i15];
                                    if (iArr[i15] != i10) {
                                        p2Var = new x.p2(x1Var, i10, yVar, i11);
                                        break loop0;
                                    }
                                }
                                j10 >>= 8;
                            }
                            if (i13 != 8) {
                                break;
                            }
                        }
                        if (i12 == length) {
                            break;
                        }
                        i12++;
                    }
                }
            }
            p2Var = null;
            if (p2Var != null) {
                u0.a aVar = this.L.f36606b;
                aVar.getClass();
                u0.l lVar = u0.l.f36641c;
                u0.l0 l0Var = aVar.f36603b;
                l0Var.h0(lVar);
                t.x0(l0Var, 0, p2Var);
                t.x0(l0Var, 1, this.f35172g);
                int i16 = l0Var.f36648h;
                int i17 = lVar.f36634a;
                int a02 = u0.l0.a0(l0Var, i17);
                int i18 = lVar.f36635b;
                if (i16 != a02 || l0Var.f36649i != u0.l0.a0(l0Var, i18)) {
                    StringBuilder sb2 = new StringBuilder();
                    int i19 = 0;
                    for (int i20 = 0; i20 < i17; i20++) {
                        if ((l0Var.f36648h & (1 << i20)) != 0) {
                            if (i19 > 0) {
                                sb2.append(", ");
                            }
                            sb2.append(lVar.b(i20));
                            i19++;
                        }
                    }
                    String sb3 = sb2.toString();
                    StringBuilder p10 = nn.d.p(sb3, "StringBuilder().apply(builderAction).toString()");
                    int i21 = 0;
                    for (int i22 = 0; i22 < i18; i22++) {
                        if ((l0Var.f36649i & (1 << i22)) != 0) {
                            if (i19 > 0) {
                                p10.append(", ");
                            }
                            p10.append(lVar.c(i22));
                            i21++;
                        }
                    }
                    String sb4 = p10.toString();
                    Intrinsics.checkNotNullExpressionValue(sb4, "StringBuilder().apply(builderAction).toString()");
                    StringBuilder sb5 = new StringBuilder("Error while pushing ");
                    sb5.append(lVar);
                    sb5.append(". Not all arguments were provided. Missing ");
                    nn.d.w(sb5, i19, " int arguments (", sb3, ") and ");
                    nn.d.x(sb5, i21, " object arguments (", sb4, ").");
                    throw null;
                }
            }
        }
        if (x1Var != null) {
            int i23 = x1Var.f35242a;
            if ((i23 & 16) == 0 && ((i23 & 1) != 0 || this.f35181p)) {
                if (x1Var.f35244c == null) {
                    if (this.O) {
                        q2 q2Var = this.H;
                        a10 = q2Var.b(q2Var.f35163u);
                    } else {
                        n2 n2Var = this.F;
                        a10 = n2Var.a(n2Var.f35093i);
                    }
                    x1Var.f35244c = a10;
                }
                x1Var.f35242a &= -5;
                x1Var2 = x1Var;
                s(false);
                return x1Var2;
            }
        }
        x1Var2 = null;
        s(false);
        return x1Var2;
    }

    public final void x() {
        if (this.f35189x && this.F.f35093i == this.f35190y) {
            this.f35190y = -1;
            this.f35189x = false;
        }
        s(false);
    }

    public final void y() {
        boolean z10 = false;
        s(false);
        this.f35167b.b();
        s(false);
        u0.b bVar = this.L;
        if (bVar.f36607c) {
            bVar.h(false);
            bVar.h(false);
            u0.a aVar = bVar.f36606b;
            aVar.getClass();
            aVar.f36603b.g0(u0.m.f36650c);
            bVar.f36607c = false;
        }
        bVar.f();
        if (bVar.f36608d.f35210b == 0) {
            z10 = true;
        }
        if (z10) {
            if (this.f35173h.f24251a.isEmpty()) {
                k();
                this.F.c();
                return;
            } else {
                t.F("Start/end imbalance");
                throw null;
            }
        }
        t.F("Missed recording an endGroup()");
        throw null;
    }

    public final void z(boolean z10, q1 q1Var) {
        this.f35173h.f24251a.add(this.f35174i);
        this.f35174i = q1Var;
        int i10 = this.f35176k;
        t0 t0Var = this.f35178m;
        t0Var.b(i10);
        t0Var.b(this.f35177l);
        t0Var.b(this.f35175j);
        if (z10) {
            this.f35175j = 0;
        }
        this.f35176k = 0;
        this.f35177l = 0;
    }
}
