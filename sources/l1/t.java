package l1;

import c2.b1;
import c2.i1;
import c2.l1;
import c2.r1;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import d2.a0;
import iu.z;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import x.y0;

/* loaded from: classes.dex */
public final class t extends g1.n implements c2.m, l1, b2.f {

    /* renamed from: n, reason: collision with root package name */
    public boolean f23922n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f23923o;

    /* renamed from: p, reason: collision with root package name */
    public s f23924p;

    public static final boolean S0(t tVar) {
        g1.n nVar = tVar.f16405a;
        if (nVar.f16417m) {
            v0.h hVar = new v0.h(new g1.n[16]);
            g1.n nVar2 = nVar.f16410f;
            if (nVar2 == null) {
                c2.g.b(hVar, nVar);
            } else {
                hVar.b(nVar2);
            }
            while (hVar.l()) {
                g1.n nVar3 = (g1.n) hVar.n(hVar.f37655c - 1);
                if ((nVar3.f16408d & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                    for (g1.n nVar4 = nVar3; nVar4 != null; nVar4 = nVar4.f16410f) {
                        if ((nVar4.f16407c & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                            v0.h hVar2 = null;
                            g1.n nVar5 = nVar4;
                            while (nVar5 != null) {
                                if (nVar5 instanceof t) {
                                    t tVar2 = (t) nVar5;
                                    if (tVar2.f23924p != null) {
                                        int ordinal = tVar2.R0().ordinal();
                                        if (ordinal == 0 || ordinal == 1 || ordinal == 2) {
                                            return true;
                                        }
                                        if (ordinal == 3) {
                                            return false;
                                        }
                                        throw new NoWhenBranchMatchedException();
                                    }
                                } else if ((nVar5.f16407c & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 && (nVar5 instanceof c2.o)) {
                                    int i10 = 0;
                                    for (g1.n nVar6 = ((c2.o) nVar5).f7801o; nVar6 != null; nVar6 = nVar6.f16410f) {
                                        if ((nVar6.f16407c & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                                            i10++;
                                            if (i10 == 1) {
                                                nVar5 = nVar6;
                                            } else {
                                                if (hVar2 == null) {
                                                    hVar2 = new v0.h(new g1.n[16]);
                                                }
                                                if (nVar5 != null) {
                                                    hVar2.b(nVar5);
                                                    nVar5 = null;
                                                }
                                                hVar2.b(nVar6);
                                            }
                                        }
                                    }
                                    if (i10 == 1) {
                                    }
                                }
                                nVar5 = c2.g.f(hVar2);
                            }
                        }
                    }
                }
                c2.g.b(hVar, nVar3);
            }
            return false;
        }
        t0.t.C0("visitSubtreeIf called on an unattached node");
        throw null;
    }

    public static final boolean T0(t tVar) {
        b1 b1Var;
        g1.n nVar = tVar.f16405a;
        if (nVar.f16417m) {
            g1.n nVar2 = nVar.f16409e;
            androidx.compose.ui.node.a y10 = c2.g.y(tVar);
            while (y10 != null) {
                if ((y10.f1422w.f7658e.f16408d & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                    while (nVar2 != null) {
                        if ((nVar2.f16407c & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                            g1.n nVar3 = nVar2;
                            v0.h hVar = null;
                            while (nVar3 != null) {
                                if (nVar3 instanceof t) {
                                    t tVar2 = (t) nVar3;
                                    if (tVar2.f23924p != null) {
                                        int ordinal = tVar2.R0().ordinal();
                                        if (ordinal == 0) {
                                            return false;
                                        }
                                        if (ordinal == 1) {
                                            return true;
                                        }
                                        if (ordinal == 2 || ordinal == 3) {
                                            return false;
                                        }
                                        throw new NoWhenBranchMatchedException();
                                    }
                                } else if ((nVar3.f16407c & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 && (nVar3 instanceof c2.o)) {
                                    int i10 = 0;
                                    for (g1.n nVar4 = ((c2.o) nVar3).f7801o; nVar4 != null; nVar4 = nVar4.f16410f) {
                                        if ((nVar4.f16407c & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                                            i10++;
                                            if (i10 == 1) {
                                                nVar3 = nVar4;
                                            } else {
                                                if (hVar == null) {
                                                    hVar = new v0.h(new g1.n[16]);
                                                }
                                                if (nVar3 != null) {
                                                    hVar.b(nVar3);
                                                    nVar3 = null;
                                                }
                                                hVar.b(nVar4);
                                            }
                                        }
                                    }
                                    if (i10 == 1) {
                                    }
                                }
                                nVar3 = c2.g.f(hVar);
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
            return false;
        }
        throw new IllegalStateException("visitAncestors called on an unattached node".toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x000e, code lost:
    
        if (r0 != 2) goto L19;
     */
    @Override // g1.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void K0() {
        /*
            r3 = this;
            l1.s r0 = r3.R0()
            int r0 = r0.ordinal()
            r1 = 1
            if (r0 == 0) goto L30
            if (r0 == r1) goto L11
            r2 = 2
            if (r0 == r2) goto L30
            goto L53
        L11:
            l1.u r0 = androidx.compose.ui.focus.a.F(r3)
            boolean r2 = r0.f23927c     // Catch: java.lang.Throwable -> L1d
            if (r2 == 0) goto L1f
            l1.u.a(r0)     // Catch: java.lang.Throwable -> L1d
            goto L1f
        L1d:
            r1 = move-exception
            goto L2c
        L1f:
            r0.f23927c = r1     // Catch: java.lang.Throwable -> L1d
            l1.s r1 = l1.s.f23920c     // Catch: java.lang.Throwable -> L1d
            r3.V0(r1)     // Catch: java.lang.Throwable -> L1d
            kotlin.Unit r1 = kotlin.Unit.f23355a     // Catch: java.lang.Throwable -> L1d
            l1.u.b(r0)
            goto L53
        L2c:
            l1.u.b(r0)
            throw r1
        L30:
            c2.r1 r0 = c2.g.z(r3)
            d2.a0 r0 = (d2.a0) r0
            l1.f r0 = r0.getFocusOwner()
            r2 = 0
            androidx.compose.ui.focus.b r0 = (androidx.compose.ui.focus.b) r0
            r0.a(r1, r1, r2)
            c2.r1 r0 = c2.g.z(r3)
            d2.a0 r0 = (d2.a0) r0
            l1.f r0 = r0.getFocusOwner()
            androidx.compose.ui.focus.b r0 = (androidx.compose.ui.focus.b) r0
            l1.e r0 = r0.f1364e
            t.d0 r1 = r0.f23888c
            r0.b(r1, r3)
        L53:
            r0 = 0
            r3.f23924p = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l1.t.K0():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [l1.j, l1.k, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v10, types: [g1.n] */
    /* JADX WARN: Type inference failed for: r5v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [g1.n] */
    /* JADX WARN: Type inference failed for: r5v8, types: [l1.m] */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [v0.h] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [v0.h] */
    public final k Q0() {
        b1 b1Var;
        ?? obj = new Object();
        obj.f23901a = true;
        o oVar = o.f23914b;
        obj.f23902b = oVar;
        obj.f23903c = oVar;
        obj.f23904d = oVar;
        obj.f23905e = oVar;
        obj.f23906f = oVar;
        obj.f23907g = oVar;
        obj.f23908h = oVar;
        obj.f23909i = oVar;
        obj.f23910j = h.f23894c;
        obj.f23911k = h.f23895d;
        g1.n nVar = this.f16405a;
        if (nVar.f16417m) {
            androidx.compose.ui.node.a y10 = c2.g.y(this);
            g1.n nVar2 = nVar;
            loop0: while (y10 != null) {
                if ((y10.f1422w.f7658e.f16408d & 3072) != 0) {
                    while (nVar2 != null) {
                        int i10 = nVar2.f16407c;
                        if ((i10 & 3072) != 0) {
                            if (nVar2 != nVar && (i10 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                                break loop0;
                            }
                            if ((i10 & 2048) != 0) {
                                c2.o oVar2 = nVar2;
                                ?? r72 = 0;
                                while (oVar2 != 0) {
                                    if (oVar2 instanceof m) {
                                        ((m) oVar2).B0(obj);
                                    } else if ((oVar2.f16407c & 2048) != 0 && (oVar2 instanceof c2.o)) {
                                        g1.n nVar3 = oVar2.f7801o;
                                        int i11 = 0;
                                        oVar2 = oVar2;
                                        r72 = r72;
                                        while (nVar3 != null) {
                                            if ((nVar3.f16407c & 2048) != 0) {
                                                i11++;
                                                r72 = r72;
                                                if (i11 == 1) {
                                                    oVar2 = nVar3;
                                                } else {
                                                    if (r72 == 0) {
                                                        r72 = new v0.h(new g1.n[16]);
                                                    }
                                                    if (oVar2 != 0) {
                                                        r72.b(oVar2);
                                                        oVar2 = 0;
                                                    }
                                                    r72.b(nVar3);
                                                }
                                            }
                                            nVar3 = nVar3.f16410f;
                                            oVar2 = oVar2;
                                            r72 = r72;
                                        }
                                        if (i11 == 1) {
                                        }
                                    }
                                    oVar2 = c2.g.f(r72);
                                }
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
            return obj;
        }
        throw new IllegalStateException("visitAncestors called on an unattached node".toString());
    }

    public final s R0() {
        u uVar;
        s sVar;
        androidx.compose.ui.node.a aVar;
        r1 r1Var;
        f focusOwner;
        i1 i1Var = this.f16405a.f16412h;
        if (i1Var != null && (aVar = i1Var.f7721k) != null && (r1Var = aVar.f1408i) != null && (focusOwner = ((a0) r1Var).getFocusOwner()) != null) {
            uVar = ((androidx.compose.ui.focus.b) focusOwner).f1365f;
        } else {
            uVar = null;
        }
        if (uVar == null || (sVar = (s) uVar.f23925a.f(this)) == null) {
            s sVar2 = this.f23924p;
            if (sVar2 == null) {
                return s.f23920c;
            }
            return sVar2;
        }
        return sVar;
    }

    public final void U0() {
        boolean z10;
        s sVar;
        s sVar2 = this.f23924p;
        if (sVar2 == null) {
            if (sVar2 != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                u F = androidx.compose.ui.focus.a.F(this);
                try {
                    if (F.f23927c) {
                        u.a(F);
                    }
                    F.f23927c = true;
                    if (T0(this) && S0(this)) {
                        sVar = s.f23919b;
                    } else {
                        sVar = s.f23920c;
                    }
                    V0(sVar);
                    Unit unit = Unit.f23355a;
                    u.b(F);
                } catch (Throwable th2) {
                    u.b(F);
                    throw th2;
                }
            } else {
                throw new IllegalStateException("Re-initializing focus target node.".toString());
            }
        }
        int ordinal = R0().ordinal();
        if (ordinal == 0 || ordinal == 2) {
            z zVar = new z();
            c2.g.w(this, new y0(10, zVar, this));
            Object obj = zVar.f20560a;
            if (obj != null) {
                if (!((j) obj).a()) {
                    ((androidx.compose.ui.focus.b) ((a0) c2.g.z(this)).getFocusOwner()).a(true, true, true);
                    return;
                }
                return;
            }
            Intrinsics.k("focusProperties");
            throw null;
        }
    }

    public final void V0(s sVar) {
        androidx.compose.ui.focus.a.F(this).f23925a.l(this, sVar);
    }

    @Override // c2.l1
    public final void j0() {
        s R0 = R0();
        U0();
        if (R0 != R0()) {
            androidx.compose.ui.focus.a.B(this);
        }
    }
}
