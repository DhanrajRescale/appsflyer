package c2;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final e f7700a = new Object();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [c2.n, c2.c2, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v0, types: [x1.m] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13, types: [g1.n] */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [g1.n] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [v0.h] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [v0.h] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public static final void A(c2 c2Var, x1.m mVar) {
        b1 b1Var;
        g1.n nVar = ((g1.n) c2Var).f16405a;
        if (nVar.f16417m) {
            g1.n nVar2 = nVar.f16409e;
            androidx.compose.ui.node.a y10 = y(c2Var);
            while (y10 != null) {
                if ((y10.f1422w.f7658e.f16408d & 262144) != 0) {
                    while (nVar2 != null) {
                        if ((nVar2.f16407c & 262144) != 0) {
                            o oVar = nVar2;
                            ?? r52 = 0;
                            while (oVar != 0) {
                                if (oVar instanceof c2) {
                                    c2 c2Var2 = (c2) oVar;
                                    if (Intrinsics.a(c2Var.j(), c2Var2.j()) && t0.t.w(c2Var, c2Var2) && !((Boolean) mVar.invoke(c2Var2)).booleanValue()) {
                                        return;
                                    }
                                } else if ((oVar.f16407c & 262144) != 0 && (oVar instanceof o)) {
                                    g1.n nVar3 = oVar.f7801o;
                                    int i10 = 0;
                                    oVar = oVar;
                                    r52 = r52;
                                    while (nVar3 != null) {
                                        if ((nVar3.f16407c & 262144) != 0) {
                                            i10++;
                                            r52 = r52;
                                            if (i10 == 1) {
                                                oVar = nVar3;
                                            } else {
                                                if (r52 == 0) {
                                                    r52 = new v0.h(new g1.n[16]);
                                                }
                                                if (oVar != 0) {
                                                    r52.b(oVar);
                                                    oVar = 0;
                                                }
                                                r52.b(nVar3);
                                            }
                                        }
                                        nVar3 = nVar3.f16410f;
                                        oVar = oVar;
                                        r52 = r52;
                                    }
                                    if (i10 == 1) {
                                    }
                                }
                                oVar = f(r52);
                            }
                        }
                        nVar2 = nVar2.f16409e;
                    }
                }
                y10 = y10.q();
                if (y10 != null && (b1Var = y10.f1422w) != null) {
                    nVar2 = b1Var.f7657d;
                } else {
                    nVar2 = null;
                }
            }
            return;
        }
        throw new IllegalStateException("visitAncestors called on an unattached node".toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x001d, code lost:
    
        continue;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15, types: [g1.n] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21, types: [g1.n] */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v7, types: [g1.n] */
    /* JADX WARN: Type inference failed for: r0v8, types: [g1.n] */
    /* JADX WARN: Type inference failed for: r0v9, types: [g1.n] */
    /* JADX WARN: Type inference failed for: r10v0, types: [c2.c2, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v0, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [v0.h] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [v0.h] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void B(c2.c2 r10, kotlin.jvm.functions.Function1 r11) {
        /*
            r0 = r10
            g1.n r0 = (g1.n) r0
            g1.n r0 = r0.f16405a
            boolean r1 = r0.f16417m
            if (r1 == 0) goto La7
            v0.h r1 = new v0.h
            r2 = 16
            g1.n[] r3 = new g1.n[r2]
            r1.<init>(r3)
            g1.n r3 = r0.f16410f
            if (r3 != 0) goto L1a
            b(r1, r0)
            goto L1d
        L1a:
            r1.b(r3)
        L1d:
            boolean r0 = r1.l()
            if (r0 == 0) goto La6
            int r0 = r1.f37655c
            r3 = 1
            int r0 = r0 - r3
            java.lang.Object r0 = r1.n(r0)
            g1.n r0 = (g1.n) r0
            int r4 = r0.f16408d
            r5 = 262144(0x40000, float:3.67342E-40)
            r4 = r4 & r5
            if (r4 != 0) goto L38
            b(r1, r0)
            goto L1d
        L38:
            if (r0 == 0) goto L1d
            int r4 = r0.f16407c
            r4 = r4 & r5
            if (r4 == 0) goto La3
            r4 = 0
            r6 = r4
        L41:
            if (r0 == 0) goto L1d
            boolean r7 = r0 instanceof c2.c2
            if (r7 == 0) goto L6a
            c2.c2 r0 = (c2.c2) r0
            java.lang.Object r7 = r10.j()
            java.lang.Object r8 = r0.j()
            boolean r7 = kotlin.jvm.internal.Intrinsics.a(r7, r8)
            if (r7 == 0) goto L9e
            boolean r7 = t0.t.w(r10, r0)
            if (r7 == 0) goto L9e
            java.lang.Object r0 = r11.invoke(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L9e
            return
        L6a:
            int r7 = r0.f16407c
            r7 = r7 & r5
            if (r7 == 0) goto L9e
            boolean r7 = r0 instanceof c2.o
            if (r7 == 0) goto L9e
            r7 = r0
            c2.o r7 = (c2.o) r7
            g1.n r7 = r7.f7801o
            r8 = 0
        L79:
            if (r7 == 0) goto L9b
            int r9 = r7.f16407c
            r9 = r9 & r5
            if (r9 == 0) goto L98
            int r8 = r8 + 1
            if (r8 != r3) goto L86
            r0 = r7
            goto L98
        L86:
            if (r6 != 0) goto L8f
            v0.h r6 = new v0.h
            g1.n[] r9 = new g1.n[r2]
            r6.<init>(r9)
        L8f:
            if (r0 == 0) goto L95
            r6.b(r0)
            r0 = r4
        L95:
            r6.b(r7)
        L98:
            g1.n r7 = r7.f16410f
            goto L79
        L9b:
            if (r8 != r3) goto L9e
            goto L41
        L9e:
            g1.n r0 = f(r6)
            goto L41
        La3:
            g1.n r0 = r0.f16410f
            goto L38
        La6:
            return
        La7:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "visitChildren called on an unattached node"
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: c2.g.B(c2.c2, kotlin.jvm.functions.Function1):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [c2.c2, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v0, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r7v10, types: [g1.n] */
    /* JADX WARN: Type inference failed for: r7v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [g1.n] */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [v0.h] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [v0.h] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public static final void C(c2 c2Var, Function1 function1) {
        b2 b2Var;
        g1.n nVar = ((g1.n) c2Var).f16405a;
        if (nVar.f16417m) {
            v0.h hVar = new v0.h(new g1.n[16]);
            g1.n nVar2 = nVar.f16410f;
            if (nVar2 == null) {
                b(hVar, nVar);
            } else {
                hVar.b(nVar2);
            }
            while (hVar.l()) {
                g1.n nVar3 = (g1.n) hVar.n(hVar.f37655c - 1);
                if ((nVar3.f16408d & 262144) != 0) {
                    for (g1.n nVar4 = nVar3; nVar4 != null; nVar4 = nVar4.f16410f) {
                        if ((nVar4.f16407c & 262144) != 0) {
                            ?? r82 = 0;
                            o oVar = nVar4;
                            while (oVar != 0) {
                                if (oVar instanceof c2) {
                                    c2 c2Var2 = (c2) oVar;
                                    if (Intrinsics.a(c2Var.j(), c2Var2.j()) && t0.t.w(c2Var, c2Var2)) {
                                        b2Var = (b2) function1.invoke(c2Var2);
                                    } else {
                                        b2Var = b2.f7662a;
                                    }
                                    if (b2Var == b2.f7664c) {
                                        return;
                                    }
                                    if (b2Var == b2.f7663b) {
                                        break;
                                    }
                                } else if ((oVar.f16407c & 262144) != 0 && (oVar instanceof o)) {
                                    g1.n nVar5 = oVar.f7801o;
                                    int i10 = 0;
                                    oVar = oVar;
                                    r82 = r82;
                                    while (nVar5 != null) {
                                        if ((nVar5.f16407c & 262144) != 0) {
                                            i10++;
                                            r82 = r82;
                                            if (i10 == 1) {
                                                oVar = nVar5;
                                            } else {
                                                if (r82 == 0) {
                                                    r82 = new v0.h(new g1.n[16]);
                                                }
                                                if (oVar != 0) {
                                                    r82.b(oVar);
                                                    oVar = 0;
                                                }
                                                r82.b(nVar5);
                                            }
                                        }
                                        nVar5 = nVar5.f16410f;
                                        oVar = oVar;
                                        r82 = r82;
                                    }
                                    if (i10 == 1) {
                                    }
                                }
                                oVar = f(r82);
                            }
                        }
                    }
                }
                b(hVar, nVar3);
            }
            return;
        }
        t0.t.C0("visitSubtreeIf called on an unattached node");
        throw null;
    }

    public static final long a(float f10, boolean z10) {
        long j10;
        long floatToIntBits = Float.floatToIntBits(f10);
        if (z10) {
            j10 = 1;
        } else {
            j10 = 0;
        }
        return (j10 & 4294967295L) | (floatToIntBits << 32);
    }

    public static final void b(v0.h hVar, g1.n nVar) {
        v0.h u10 = y(nVar).u();
        int i10 = u10.f37655c;
        if (i10 > 0) {
            int i11 = i10 - 1;
            Object[] objArr = u10.f37653a;
            do {
                hVar.b(((androidx.compose.ui.node.a) objArr[i11]).f1422w.f7658e);
                i11--;
            } while (i11 >= 0);
        }
    }

    public static final int c(u0 u0Var, a2.a aVar) {
        long j10;
        u0 A0 = u0Var.A0();
        if (A0 != null) {
            if (u0Var.F0().c().containsKey(aVar)) {
                Integer num = (Integer) u0Var.F0().c().get(aVar);
                if (num == null) {
                    return Integer.MIN_VALUE;
                }
                return num.intValue();
            }
            int f10 = A0.f(aVar);
            if (f10 == Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
            A0.f7851f = true;
            u0Var.f7852g = true;
            u0Var.J0();
            A0.f7851f = false;
            u0Var.f7852g = false;
            if (aVar instanceof a2.p) {
                long H0 = A0.H0();
                int i10 = w2.h.f38792c;
                j10 = H0 & 4294967295L;
            } else {
                long H02 = A0.H0();
                int i11 = w2.h.f38792c;
                j10 = H02 >> 32;
            }
            return f10 + ((int) j10);
        }
        t0.t.C0("Child of " + u0Var + " cannot be null when calculating alignment line");
        throw null;
    }

    public static final boolean d(d dVar) {
        a2 a2Var = y(dVar).f1422w.f7657d;
        Intrinsics.d(a2Var, "null cannot be cast to non-null type androidx.compose.ui.node.TailModifierNode");
        return a2Var.f7653n;
    }

    public static final g1.n e(n nVar, int i10) {
        g1.n nVar2 = ((g1.n) nVar).f16405a.f16410f;
        if (nVar2 == null || (nVar2.f16408d & i10) == 0) {
            return null;
        }
        while (nVar2 != null) {
            int i11 = nVar2.f16407c;
            if ((i11 & 2) != 0) {
                return null;
            }
            if ((i11 & i10) != 0) {
                return nVar2;
            }
            nVar2 = nVar2.f16410f;
        }
        return null;
    }

    public static final g1.n f(v0.h hVar) {
        if (hVar != null && !hVar.k()) {
            return (g1.n) hVar.n(hVar.f37655c - 1);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final c0 g(g1.n nVar) {
        if ((nVar.f16407c & 2) != 0) {
            if (nVar instanceof c0) {
                return (c0) nVar;
            }
            if (nVar instanceof o) {
                g1.n nVar2 = ((o) nVar).f7801o;
                while (nVar2 != 0) {
                    if (nVar2 instanceof c0) {
                        return (c0) nVar2;
                    }
                    if ((nVar2 instanceof o) && (nVar2.f16407c & 2) != 0) {
                        nVar2 = ((o) nVar2).f7801o;
                    } else {
                        nVar2 = nVar2.f16410f;
                    }
                }
            }
        }
        return null;
    }

    public static final void h(g1.n nVar) {
        if (nVar.f16417m) {
            i(nVar, -1, 1);
        } else {
            t0.t.C0("autoInvalidateInsertedNode called on unattached node");
            throw null;
        }
    }

    public static final void i(g1.n nVar, int i10, int i11) {
        if (nVar instanceof o) {
            o oVar = (o) nVar;
            j(nVar, oVar.f7800n & i10, i11);
            int i12 = (~oVar.f7800n) & i10;
            for (g1.n nVar2 = oVar.f7801o; nVar2 != null; nVar2 = nVar2.f16410f) {
                i(nVar2, i12, i11);
            }
            return;
        }
        j(nVar, i10 & nVar.f16407c, i11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void j(g1.n nVar, int i10, int i11) {
        if (i11 == 0 && !nVar.F0()) {
            return;
        }
        if ((i10 & 2) != 0 && (nVar instanceof c0)) {
            t((c0) nVar);
            if (i11 == 2) {
                i1 x10 = x(nVar, 2);
                x10.f7724n = true;
                x10.A.mo2invoke();
                if (x10.C != null) {
                    x10.p1(null, false);
                }
            }
        }
        if ((i10 & 256) != 0 && (nVar instanceof t)) {
            y(nVar).z();
        }
        if ((i10 & 4) != 0 && (nVar instanceof s)) {
            s((s) nVar);
        }
        if ((i10 & 8) != 0 && (nVar instanceof z1)) {
            u((z1) nVar);
        }
        if ((i10 & 64) != 0 && (nVar instanceof u1)) {
            q0 q0Var = y((u1) nVar).f1423x;
            q0Var.f7827o.f7788p = true;
            m0 m0Var = q0Var.f7828p;
            if (m0Var != null) {
                m0Var.f7773u = true;
            }
        }
        if ((i10 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 && (nVar instanceof l1.t)) {
            if (i11 == 2) {
                nVar.K0();
            } else {
                l1.e eVar = ((androidx.compose.ui.focus.b) ((d2.a0) z(nVar)).getFocusOwner()).f1364e;
                eVar.b(eVar.f23888c, (l1.t) nVar);
            }
        }
        if ((i10 & 2048) != 0 && (nVar instanceof l1.m)) {
            l1.m mVar = (l1.m) nVar;
            h.f7712b = null;
            mVar.B0(h.f7711a);
            if (h.f7712b != null) {
                if (i11 == 2) {
                    g1.n nVar2 = ((g1.n) mVar).f16405a;
                    if (nVar2.f16417m) {
                        v0.h hVar = new v0.h(new g1.n[16]);
                        g1.n nVar3 = nVar2.f16410f;
                        if (nVar3 == null) {
                            b(hVar, nVar2);
                        } else {
                            hVar.b(nVar3);
                        }
                        while (hVar.l()) {
                            g1.n nVar4 = (g1.n) hVar.n(hVar.f37655c - 1);
                            if ((nVar4.f16408d & UserMetadata.MAX_ATTRIBUTE_SIZE) == 0) {
                                b(hVar, nVar4);
                            } else {
                                while (true) {
                                    if (nVar4 == null) {
                                        break;
                                    }
                                    if ((nVar4.f16407c & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                                        v0.h hVar2 = null;
                                        while (nVar4 != null) {
                                            if (nVar4 instanceof l1.t) {
                                                l1.t tVar = (l1.t) nVar4;
                                                l1.e eVar2 = ((androidx.compose.ui.focus.b) ((d2.a0) z(tVar)).getFocusOwner()).f1364e;
                                                eVar2.b(eVar2.f23888c, tVar);
                                            } else if ((nVar4.f16407c & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 && (nVar4 instanceof o)) {
                                                int i12 = 0;
                                                for (g1.n nVar5 = ((o) nVar4).f7801o; nVar5 != null; nVar5 = nVar5.f16410f) {
                                                    if ((nVar5.f16407c & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                                                        i12++;
                                                        if (i12 == 1) {
                                                            nVar4 = nVar5;
                                                        } else {
                                                            if (hVar2 == null) {
                                                                hVar2 = new v0.h(new g1.n[16]);
                                                            }
                                                            if (nVar4 != null) {
                                                                hVar2.b(nVar4);
                                                                nVar4 = null;
                                                            }
                                                            hVar2.b(nVar5);
                                                        }
                                                    }
                                                }
                                                if (i12 == 1) {
                                                }
                                            }
                                            nVar4 = f(hVar2);
                                        }
                                    } else {
                                        nVar4 = nVar4.f16410f;
                                    }
                                }
                            }
                        }
                    } else {
                        throw new IllegalStateException("visitChildren called on an unattached node".toString());
                    }
                } else {
                    l1.e eVar3 = ((androidx.compose.ui.focus.b) ((d2.a0) z(mVar)).getFocusOwner()).f1364e;
                    eVar3.b(eVar3.f23890e, mVar);
                }
            }
        }
        if ((i10 & 4096) != 0 && (nVar instanceof l1.c)) {
            l1.c cVar = (l1.c) nVar;
            l1.e eVar4 = ((androidx.compose.ui.focus.b) ((d2.a0) z(cVar)).getFocusOwner()).f1364e;
            eVar4.b(eVar4.f23889d, cVar);
        }
    }

    public static final void k(g1.n nVar) {
        if (nVar.f16417m) {
            i(nVar, -1, 0);
        } else {
            t0.t.C0("autoInvalidateUpdatedNode called on unattached node");
            throw null;
        }
    }

    public static final int l(g1.m mVar) {
        int i10;
        if (mVar instanceof a2.y) {
            i10 = 3;
        } else {
            i10 = 1;
        }
        if (mVar instanceof k1.f) {
            i10 |= 4;
        }
        if (mVar instanceof h2.k) {
            i10 |= 8;
        }
        if (mVar instanceof x1.y) {
            i10 |= 16;
        }
        if ((mVar instanceof b2.d) || (mVar instanceof b2.g)) {
            i10 |= 32;
        }
        if (mVar instanceof a2.t0) {
            i10 |= 256;
        }
        if (mVar instanceof a2.x0) {
            i10 |= 64;
        }
        if (mVar instanceof a2.v0) {
            return i10 | 128;
        }
        return i10;
    }

    public static final int m(g1.n nVar) {
        int i10;
        int i11 = nVar.f16407c;
        if (i11 != 0) {
            return i11;
        }
        if (nVar instanceof c0) {
            i10 = 3;
        } else {
            i10 = 1;
        }
        if (nVar instanceof s) {
            i10 |= 4;
        }
        if (nVar instanceof z1) {
            i10 |= 8;
        }
        if (nVar instanceof w1) {
            i10 |= 16;
        }
        if (nVar instanceof b2.f) {
            i10 |= 32;
        }
        if (nVar instanceof u1) {
            i10 |= 64;
        }
        if (nVar instanceof b0) {
            i10 |= 128;
        }
        if (nVar instanceof t) {
            i10 |= 256;
        }
        if (nVar instanceof l1.t) {
            i10 |= UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        if (nVar instanceof l1.m) {
            i10 |= 2048;
        }
        if (nVar instanceof l1.c) {
            i10 |= 4096;
        }
        if (nVar instanceof v1.c) {
            i10 |= UserMetadata.MAX_INTERNAL_KEY_SIZE;
        }
        if (nVar instanceof z1.a) {
            i10 |= Http2.INITIAL_MAX_FRAME_SIZE;
        }
        if (nVar instanceof m) {
            i10 |= 32768;
        }
        if (nVar instanceof c2) {
            return i10 | 262144;
        }
        return i10;
    }

    public static final int n(g1.n nVar) {
        if (nVar instanceof o) {
            o oVar = (o) nVar;
            int i10 = oVar.f7800n;
            for (g1.n nVar2 = oVar.f7801o; nVar2 != null; nVar2 = nVar2.f16410f) {
                i10 |= n(nVar2);
            }
            return i10;
        }
        return m(nVar);
    }

    public static final int o(long j10, long j11) {
        boolean z10;
        boolean z11 = false;
        if (((int) (j10 & 4294967295L)) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (((int) (4294967295L & j11)) != 0) {
            z11 = true;
        }
        if (z10 != z11) {
            if (!z10) {
                return 1;
            }
            return -1;
        }
        return (int) Math.signum(Float.intBitsToFloat((int) (j10 >> 32)) - Float.intBitsToFloat((int) (j11 >> 32)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object p(m mVar, t0.u1 u1Var) {
        if (((g1.n) mVar).f16405a.f16417m) {
            b1.g gVar = (b1.g) y(mVar).f1420u;
            gVar.getClass();
            return al.d.L0(gVar, u1Var);
        }
        t0.t.C0("Cannot read CompositionLocal because the Modifier node is not currently attached.");
        throw null;
    }

    public static final int q(int[] iArr) {
        return Math.min(iArr[2] - iArr[0], iArr[3] - iArr[1]);
    }

    public static final boolean r(int i10) {
        return (i10 & 128) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void s(s sVar) {
        if (((g1.n) sVar).f16405a.f16417m) {
            x(sVar, 1).b1();
        }
    }

    public static final void t(c0 c0Var) {
        y(c0Var).z();
    }

    public static final void u(z1 z1Var) {
        y(z1Var).A();
    }

    public static final boolean v(androidx.compose.ui.node.a aVar) {
        androidx.compose.ui.node.a aVar2;
        if (aVar.f1402c != null) {
            androidx.compose.ui.node.a q10 = aVar.q();
            if (q10 != null) {
                aVar2 = q10.f1402c;
            } else {
                aVar2 = null;
            }
            if (aVar2 == null || aVar.f1423x.f7814b) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void w(g1.n nVar, Function0 function0) {
        m1 m1Var = nVar.f16411g;
        if (m1Var == null) {
            m1Var = new m1((l1) nVar);
            nVar.f16411g = m1Var;
        }
        ((d2.a0) z(nVar)).getSnapshotObserver().a(m1Var, f.f7683l, function0);
    }

    public static final i1 x(n nVar, int i10) {
        i1 i1Var = ((g1.n) nVar).f16405a.f16412h;
        Intrinsics.c(i1Var);
        if (i1Var.W0() == nVar && r(i10)) {
            i1 i1Var2 = i1Var.f7722l;
            Intrinsics.c(i1Var2);
            return i1Var2;
        }
        return i1Var;
    }

    public static final androidx.compose.ui.node.a y(n nVar) {
        i1 i1Var = ((g1.n) nVar).f16405a.f16412h;
        if (i1Var != null) {
            return i1Var.f7721k;
        }
        t0.t.D0("Cannot obtain node coordinator. Is the Modifier.Node attached?");
        throw null;
    }

    public static final r1 z(n nVar) {
        r1 r1Var = y(nVar).f1408i;
        if (r1Var != null) {
            return r1Var;
        }
        t0.t.D0("This node does not have an owner.");
        throw null;
    }
}
