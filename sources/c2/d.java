package c2;

import android.os.SystemClock;
import android.view.MotionEvent;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import ut.l;

/* loaded from: classes.dex */
public final class d extends g1.n implements c0, s, z1, w1, b2.f, b2.h, u1, b0, t, l1.c, l1.m, l1.p, s1, k1.a {

    /* renamed from: n, reason: collision with root package name */
    public g1.m f7668n;

    /* renamed from: o, reason: collision with root package name */
    public b2.a f7669o;

    /* renamed from: p, reason: collision with root package name */
    public HashSet f7670p;

    @Override // l1.m
    public final void B0(l1.j jVar) {
        t0.t.C0("applyFocusProperties called on wrong node");
        throw null;
    }

    @Override // c2.t
    public final void C0(i1 i1Var) {
        g1.m mVar = this.f7668n;
        Intrinsics.d(mVar, "null cannot be cast to non-null type androidx.compose.ui.layout.OnGloballyPositionedModifier");
        d0.c cVar = (d0.c) ((a2.t0) mVar);
        if (!cVar.f13145b) {
            cVar.f13145b = true;
            yt.c cVar2 = cVar.f13146c;
            if (cVar2 != null) {
                l.Companion companion = ut.l.INSTANCE;
                cVar2.resumeWith(Unit.f23355a);
            }
            cVar.f13146c = null;
        }
    }

    @Override // c2.w1
    public final void D() {
        g1.m mVar = this.f7668n;
        Intrinsics.d(mVar, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        x1.b0 b0Var = ((x1.c0) ((x1.y) mVar)).f39835e;
        if (b0Var.f39828b == 2) {
            long uptimeMillis = SystemClock.uptimeMillis();
            x1.c0 c0Var = b0Var.f39829c;
            x1.a0 a0Var = new x1.a0(c0Var, 1);
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, s0.g.f34069a, s0.g.f34069a, 0);
            obtain.setSource(0);
            a0Var.invoke(obtain);
            obtain.recycle();
            b0Var.f39828b = 1;
            c0Var.f39834d = false;
        }
    }

    @Override // c2.c0
    public final int F(a2.r rVar, a2.q qVar, int i10) {
        g1.m mVar = this.f7668n;
        Intrinsics.d(mVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((a2.y) mVar).a(new a2.t(rVar, rVar.getLayoutDirection()), new a2.q0(qVar, a2.r0.f113b, a2.s0.f120b, 0), hl.f.c(i10, 0, 13)).a();
    }

    @Override // g1.n
    public final void I0() {
        Q0(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    @Override // c2.w1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void J(x1.k r8, x1.l r9, long r10) {
        /*
            r7 = this;
            g1.m r10 = r7.f7668n
            java.lang.String r11 = "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier"
            kotlin.jvm.internal.Intrinsics.d(r10, r11)
            x1.y r10 = (x1.y) r10
            x1.c0 r10 = (x1.c0) r10
            x1.b0 r10 = r10.f39835e
            r10.getClass()
            x1.c0 r11 = r10.f39829c
            boolean r0 = r11.f39834d
            r1 = 0
            r2 = 1
            java.util.List r3 = r8.f39870a
            if (r0 != 0) goto L39
            int r0 = r3.size()
            r4 = r1
        L1f:
            if (r4 >= r0) goto L37
            java.lang.Object r5 = r3.get(r4)
            x1.t r5 = (x1.t) r5
            boolean r6 = t0.t.y(r5)
            if (r6 != 0) goto L39
            boolean r5 = t0.t.A(r5)
            if (r5 == 0) goto L34
            goto L39
        L34:
            int r4 = r4 + 1
            goto L1f
        L37:
            r0 = r1
            goto L3a
        L39:
            r0 = r2
        L3a:
            int r4 = r10.f39828b
            x1.l r5 = x1.l.f39879c
            r6 = 3
            if (r4 == r6) goto L51
            x1.l r4 = x1.l.f39877a
            if (r9 != r4) goto L4a
            if (r0 == 0) goto L4a
            r10.a(r8)
        L4a:
            if (r9 != r5) goto L51
            if (r0 != 0) goto L51
            r10.a(r8)
        L51:
            if (r9 != r5) goto L6e
            int r8 = r3.size()
            r9 = r1
        L58:
            if (r9 >= r8) goto L6a
            java.lang.Object r0 = r3.get(r9)
            x1.t r0 = (x1.t) r0
            boolean r0 = t0.t.A(r0)
            if (r0 != 0) goto L67
            goto L6e
        L67:
            int r9 = r9 + 1
            goto L58
        L6a:
            r10.f39828b = r2
            r11.f39834d = r1
        L6e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c2.d.J(x1.k, x1.l, long):void");
    }

    @Override // g1.n
    public final void J0() {
        R0();
    }

    @Override // c2.s
    public final void K() {
        g.s(this);
    }

    @Override // c2.u1
    public final Object L(w2.b bVar, Object obj) {
        g1.m mVar = this.f7668n;
        Intrinsics.d(mVar, "null cannot be cast to non-null type androidx.compose.ui.layout.ParentDataModifier");
        return ((a2.x0) mVar).h();
    }

    @Override // c2.w1
    public final void M() {
        g1.m mVar = this.f7668n;
        Intrinsics.d(mVar, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        ((x1.c0) ((x1.y) mVar)).f39835e.getClass();
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, b2.a] */
    public final void Q0(boolean z10) {
        if (this.f16417m) {
            g1.m mVar = this.f7668n;
            if ((this.f16407c & 32) != 0) {
                if (mVar instanceof b2.d) {
                    c cVar = new c(this, 0);
                    v0.h hVar = ((d2.a0) g.z(this)).F0;
                    if (!hVar.h(cVar)) {
                        hVar.b(cVar);
                    }
                }
                if (mVar instanceof b2.g) {
                    b2.g gVar = (b2.g) mVar;
                    b2.a aVar = this.f7669o;
                    if (aVar != null && aVar.G(gVar.getKey())) {
                        aVar.f3087e = gVar;
                        b2.e modifierLocalManager = ((d2.a0) g.z(this)).getModifierLocalManager();
                        b2.i key = gVar.getKey();
                        modifierLocalManager.f3091b.b(this);
                        modifierLocalManager.f3092c.b(key);
                        modifierLocalManager.a();
                    } else {
                        ?? obj = new Object();
                        obj.f3087e = gVar;
                        this.f7669o = obj;
                        if (g.d(this)) {
                            b2.e modifierLocalManager2 = ((d2.a0) g.z(this)).getModifierLocalManager();
                            b2.i key2 = gVar.getKey();
                            modifierLocalManager2.f3091b.b(this);
                            modifierLocalManager2.f3092c.b(key2);
                            modifierLocalManager2.a();
                        }
                    }
                }
            }
            if ((this.f16407c & 4) != 0 && !z10) {
                g.x(this, 2).b1();
            }
            if ((this.f16407c & 2) != 0) {
                if (g.d(this)) {
                    i1 i1Var = this.f16412h;
                    Intrinsics.c(i1Var);
                    ((d0) i1Var).I = this;
                    p1 p1Var = i1Var.C;
                    if (p1Var != null) {
                        p1Var.invalidate();
                    }
                }
                if (!z10) {
                    g.x(this, 2).b1();
                    g.y(this).z();
                }
            }
            if (mVar instanceof a2.d1) {
                androidx.compose.ui.node.a y10 = g.y(this);
                c0.h0 h0Var = (c0.h0) ((a2.d1) mVar);
                int i10 = h0Var.f7502b;
                y.d2 d2Var = h0Var.f7503c;
                switch (i10) {
                    case 0:
                        ((c0.m0) d2Var).f7539j = y10;
                        break;
                    default:
                        ((e0.j0) d2Var).f14738x.setValue(y10);
                        break;
                }
            }
            if ((this.f16407c & 128) != 0 && (mVar instanceof a2.v0) && g.d(this)) {
                g.y(this).z();
            }
            if ((this.f16407c & 256) != 0 && (mVar instanceof a2.t0) && g.d(this)) {
                g.y(this).z();
            }
            int i11 = this.f16407c;
            if ((i11 & 16) != 0 && (mVar instanceof x1.y)) {
                ((x1.c0) ((x1.y) mVar)).f39835e.f39827a = this.f16412h;
            }
            if ((i11 & 8) != 0) {
                ((d2.a0) g.z(this)).A();
                return;
            }
            return;
        }
        t0.t.C0("initializeModifier called on unattached node");
        throw null;
    }

    public final void R0() {
        if (this.f16417m) {
            g1.m mVar = this.f7668n;
            if ((this.f16407c & 32) != 0) {
                if (mVar instanceof b2.g) {
                    b2.e modifierLocalManager = ((d2.a0) g.z(this)).getModifierLocalManager();
                    b2.i key = ((b2.g) mVar).getKey();
                    modifierLocalManager.f3093d.b(g.y(this));
                    modifierLocalManager.f3094e.b(key);
                    modifierLocalManager.a();
                }
                if (mVar instanceof b2.d) {
                    ((b2.d) mVar).f(g.f7700a);
                }
            }
            if ((this.f16407c & 8) != 0) {
                ((d2.a0) g.z(this)).A();
                return;
            }
            return;
        }
        t0.t.C0("unInitializeModifier called on unattached node");
        throw null;
    }

    public final void S0() {
        if (this.f16417m) {
            this.f7670p.clear();
            ((d2.a0) g.z(this)).getSnapshotObserver().a(this, f.f7673b, new c(this, 1));
        }
    }

    @Override // b2.f
    public final kp.j V() {
        b2.a aVar = this.f7669o;
        return aVar != null ? aVar : b2.b.f3088e;
    }

    @Override // c2.c0
    public final a2.n0 a(a2.o0 o0Var, a2.l0 l0Var, long j10) {
        g1.m mVar = this.f7668n;
        Intrinsics.d(mVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((a2.y) mVar).a(o0Var, l0Var, j10);
    }

    @Override // k1.a
    public final w2.b b() {
        return g.y(this).f1417r;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [g1.n] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [g1.n] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [v0.h] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [v0.h] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    @Override // b2.f, b2.h
    public final Object c(b2.i iVar) {
        b1 b1Var;
        this.f7670p.add(iVar);
        g1.n nVar = this.f16405a;
        if (nVar.f16417m) {
            g1.n nVar2 = nVar.f16409e;
            androidx.compose.ui.node.a y10 = g.y(this);
            while (y10 != null) {
                if ((y10.f1422w.f7658e.f16408d & 32) != 0) {
                    while (nVar2 != null) {
                        if ((nVar2.f16407c & 32) != 0) {
                            o oVar = nVar2;
                            ?? r42 = 0;
                            while (oVar != 0) {
                                if (oVar instanceof b2.f) {
                                    b2.f fVar = (b2.f) oVar;
                                    if (fVar.V().G(iVar)) {
                                        return fVar.V().P(iVar);
                                    }
                                } else if ((oVar.f16407c & 32) != 0 && (oVar instanceof o)) {
                                    g1.n nVar3 = oVar.f7801o;
                                    int i10 = 0;
                                    oVar = oVar;
                                    r42 = r42;
                                    while (nVar3 != null) {
                                        if ((nVar3.f16407c & 32) != 0) {
                                            i10++;
                                            r42 = r42;
                                            if (i10 == 1) {
                                                oVar = nVar3;
                                            } else {
                                                if (r42 == 0) {
                                                    r42 = new v0.h(new g1.n[16]);
                                                }
                                                if (oVar != 0) {
                                                    r42.b(oVar);
                                                    oVar = 0;
                                                }
                                                r42.b(nVar3);
                                            }
                                        }
                                        nVar3 = nVar3.f16410f;
                                        oVar = oVar;
                                        r42 = r42;
                                    }
                                    if (i10 == 1) {
                                    }
                                }
                                oVar = g.f(r42);
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
            return iVar.f3089a.mo2invoke();
        }
        throw new IllegalStateException("visitAncestors called on an unattached node".toString());
    }

    @Override // k1.a
    public final long d() {
        return hl.f.i1(g.x(this, 128).f31c);
    }

    @Override // c2.c0
    public final int d0(a2.r rVar, a2.q qVar, int i10) {
        g1.m mVar = this.f7668n;
        Intrinsics.d(mVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((a2.y) mVar).a(new a2.t(rVar, rVar.getLayoutDirection()), new a2.q0(qVar, a2.r0.f113b, a2.s0.f119a, 0), hl.f.c(0, i10, 7)).b();
    }

    @Override // c2.s
    public final void e(p1.e eVar) {
        g1.m mVar = this.f7668n;
        Intrinsics.d(mVar, "null cannot be cast to non-null type androidx.compose.ui.draw.DrawModifier");
        ((k1.f) mVar).e(eVar);
    }

    @Override // c2.b0
    public final void g0(i1 i1Var) {
    }

    @Override // k1.a
    public final w2.k getLayoutDirection() {
        return g.y(this).f1418s;
    }

    @Override // l1.c
    public final void i(l1.s sVar) {
        t0.t.C0("onFocusEvent called on wrong node");
        throw null;
    }

    @Override // c2.c0
    public final int l(a2.r rVar, a2.q qVar, int i10) {
        g1.m mVar = this.f7668n;
        Intrinsics.d(mVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((a2.y) mVar).a(new a2.t(rVar, rVar.getLayoutDirection()), new a2.q0(qVar, a2.r0.f112a, a2.s0.f120b, 0), hl.f.c(i10, 0, 13)).a();
    }

    @Override // c2.b0
    public final void m(long j10) {
        g1.m mVar = this.f7668n;
        if (mVar instanceof a2.v0) {
            a2.w0 w0Var = (a2.w0) ((a2.v0) mVar);
            if (!w2.j.a(w0Var.f127d, j10)) {
                w0Var.f126c.invoke(new w2.j(j10));
                w0Var.f127d = j10;
            }
        }
    }

    @Override // c2.z1
    public final void n(h2.j jVar) {
        g1.m mVar = this.f7668n;
        Intrinsics.d(mVar, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsModifier");
        h2.j i10 = ((h2.k) mVar).i();
        Intrinsics.d(jVar, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsConfiguration");
        if (i10.f17851b) {
            jVar.f17851b = true;
        }
        if (i10.f17852c) {
            jVar.f17852c = true;
        }
        for (Map.Entry entry : i10.f17850a.entrySet()) {
            h2.u uVar = (h2.u) entry.getKey();
            Object value = entry.getValue();
            LinkedHashMap linkedHashMap = jVar.f17850a;
            if (!linkedHashMap.containsKey(uVar)) {
                linkedHashMap.put(uVar, value);
            } else if (value instanceof h2.a) {
                Object obj = linkedHashMap.get(uVar);
                Intrinsics.d(obj, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
                h2.a aVar = (h2.a) obj;
                String str = aVar.f17809a;
                if (str == null) {
                    str = ((h2.a) value).f17809a;
                }
                ut.d dVar = aVar.f17810b;
                if (dVar == null) {
                    dVar = ((h2.a) value).f17810b;
                }
                linkedHashMap.put(uVar, new h2.a(str, dVar));
            }
        }
    }

    @Override // c2.w1
    public final boolean q0() {
        g1.m mVar = this.f7668n;
        Intrinsics.d(mVar, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        ((x1.c0) ((x1.y) mVar)).f39835e.getClass();
        return true;
    }

    @Override // c2.s1
    public final boolean r() {
        return this.f16417m;
    }

    public final String toString() {
        return this.f7668n.toString();
    }

    @Override // c2.c0
    public final int u0(a2.r rVar, a2.q qVar, int i10) {
        g1.m mVar = this.f7668n;
        Intrinsics.d(mVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((a2.y) mVar).a(new a2.t(rVar, rVar.getLayoutDirection()), new a2.q0(qVar, a2.r0.f112a, a2.s0.f119a, 0), hl.f.c(0, i10, 7)).b();
    }
}
