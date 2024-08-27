package c2;

import android.view.View;
import d2.l3;
import d2.p3;
import d2.w2;
import java.lang.ref.Reference;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* loaded from: classes.dex */
public abstract class i1 extends u0 implements a2.l0, a2.u, s1 {
    public static final n1.u0 D;
    public static final a0 E;
    public static final float[] F;
    public static final androidx.work.u G;
    public static final androidx.work.u H;
    public boolean B;
    public p1 C;

    /* renamed from: k, reason: collision with root package name */
    public final androidx.compose.ui.node.a f7721k;

    /* renamed from: l, reason: collision with root package name */
    public i1 f7722l;

    /* renamed from: m, reason: collision with root package name */
    public i1 f7723m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f7724n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f7725o;

    /* renamed from: p, reason: collision with root package name */
    public Function1 f7726p;

    /* renamed from: q, reason: collision with root package name */
    public w2.b f7727q;

    /* renamed from: r, reason: collision with root package name */
    public w2.k f7728r;

    /* renamed from: t, reason: collision with root package name */
    public a2.n0 f7730t;

    /* renamed from: u, reason: collision with root package name */
    public LinkedHashMap f7731u;

    /* renamed from: w, reason: collision with root package name */
    public float f7733w;

    /* renamed from: x, reason: collision with root package name */
    public m1.b f7734x;

    /* renamed from: y, reason: collision with root package name */
    public a0 f7735y;

    /* renamed from: s, reason: collision with root package name */
    public float f7729s = 0.8f;

    /* renamed from: v, reason: collision with root package name */
    public long f7732v = w2.h.f38791b;

    /* renamed from: z, reason: collision with root package name */
    public final e1 f7736z = new e1(this, 0);
    public final p0 A = new p0(this, 1);

    /* JADX WARN: Type inference failed for: r0v0, types: [n1.u0, java.lang.Object] */
    static {
        ?? obj = new Object();
        obj.f28182b = 1.0f;
        obj.f28183c = 1.0f;
        obj.f28184d = 1.0f;
        long j10 = n1.g0.f28137a;
        obj.f28188h = j10;
        obj.f28189i = j10;
        obj.f28193m = 8.0f;
        obj.f28194n = n1.b1.f28120b;
        obj.f28195o = n1.s0.f28162a;
        obj.f28197q = 0;
        obj.f28198r = m1.f.f27252c;
        obj.f28199s = yk.j.o();
        D = obj;
        E = new a0();
        F = new float[]{1.0f, s0.g.f34069a, s0.g.f34069a, s0.g.f34069a, s0.g.f34069a, 1.0f, s0.g.f34069a, s0.g.f34069a, s0.g.f34069a, s0.g.f34069a, 1.0f, s0.g.f34069a, s0.g.f34069a, s0.g.f34069a, s0.g.f34069a, 1.0f};
        G = new androidx.work.u(0);
        H = new androidx.work.u(1);
    }

    public i1(androidx.compose.ui.node.a aVar) {
        this.f7721k = aVar;
        this.f7727q = aVar.f1417r;
        this.f7728r = aVar.f1418s;
    }

    public static i1 l1(a2.u uVar) {
        a2.k0 k0Var;
        i1 i1Var;
        if (uVar instanceof a2.k0) {
            k0Var = (a2.k0) uVar;
        } else {
            k0Var = null;
        }
        if (k0Var == null || (i1Var = k0Var.f103a.f7860k) == null) {
            Intrinsics.d(uVar, "null cannot be cast to non-null type androidx.compose.ui.node.NodeCoordinator");
            return (i1) uVar;
        }
        return i1Var;
    }

    @Override // c2.u0
    public final u0 A0() {
        return this.f7722l;
    }

    @Override // c2.u0
    public final a2.u B0() {
        return this;
    }

    @Override // c2.u0
    public final boolean C0() {
        return this.f7730t != null;
    }

    @Override // c2.u0
    public final androidx.compose.ui.node.a E0() {
        return this.f7721k;
    }

    @Override // a2.u
    public final long F(long j10) {
        if (W0().f16417m) {
            a2.u e10 = androidx.compose.ui.layout.a.e(this);
            d2.a0 a0Var = (d2.a0) k0.a(this.f7721k);
            a0Var.B();
            return O(e10, m1.c.g(n1.k0.a(j10, a0Var.f13307f0), androidx.compose.ui.layout.a.m(e10)));
        }
        t0.t.C0("LayoutCoordinate operations are only valid when isAttached is true");
        throw null;
    }

    @Override // c2.u0
    public final a2.n0 F0() {
        a2.n0 n0Var = this.f7730t;
        if (n0Var != null) {
            return n0Var;
        }
        throw new IllegalStateException("Asking for measurement result of unmeasured layout modifier".toString());
    }

    @Override // a2.u
    public final a2.u G() {
        if (W0().f16417m) {
            d1();
            return this.f7721k.f1422w.f7656c.f7723m;
        }
        t0.t.C0("LayoutCoordinate operations are only valid when isAttached is true");
        throw null;
    }

    @Override // c2.u0
    public final u0 G0() {
        return this.f7723m;
    }

    @Override // c2.u0
    public final long H0() {
        return this.f7732v;
    }

    @Override // a2.u
    public final void I(a2.u uVar, float[] fArr) {
        i1 l12 = l1(uVar);
        l12.d1();
        i1 S0 = S0(l12);
        n1.k0.c(fArr);
        l12.o1(S0, fArr);
        n1(S0, fArr);
    }

    @Override // c2.u0
    public final void J0() {
        j0(this.f7732v, this.f7733w, this.f7726p);
    }

    public final void K0(i1 i1Var, m1.b bVar, boolean z10) {
        if (i1Var == this) {
            return;
        }
        i1 i1Var2 = this.f7723m;
        if (i1Var2 != null) {
            i1Var2.K0(i1Var, bVar, z10);
        }
        long j10 = this.f7732v;
        int i10 = w2.h.f38792c;
        float f10 = (int) (j10 >> 32);
        bVar.f27229a -= f10;
        bVar.f27231c -= f10;
        float f11 = (int) (j10 & 4294967295L);
        bVar.f27230b -= f11;
        bVar.f27232d -= f11;
        p1 p1Var = this.C;
        if (p1Var != null) {
            p1Var.d(bVar, true);
            if (this.f7725o && z10) {
                long j11 = this.f31c;
                bVar.a(s0.g.f34069a, s0.g.f34069a, (int) (j11 >> 32), (int) (j11 & 4294967295L));
            }
        }
    }

    public final long L0(i1 i1Var, long j10) {
        if (i1Var == this) {
            return j10;
        }
        i1 i1Var2 = this.f7723m;
        if (i1Var2 != null && !Intrinsics.a(i1Var, i1Var2)) {
            return T0(i1Var2.L0(i1Var, j10));
        }
        return T0(j10);
    }

    @Override // a2.u
    public final long M(long j10) {
        if (W0().f16417m) {
            d1();
            for (i1 i1Var = this; i1Var != null; i1Var = i1Var.f7723m) {
                j10 = i1Var.m1(j10);
            }
            return j10;
        }
        t0.t.C0("LayoutCoordinate operations are only valid when isAttached is true");
        throw null;
    }

    public final long M0(long j10) {
        return t0.t.j(Math.max(s0.g.f34069a, (m1.f.e(j10) - d0()) / 2.0f), Math.max(s0.g.f34069a, (m1.f.c(j10) - b0()) / 2.0f));
    }

    public final float N0(long j10, long j11) {
        float d02;
        float b02;
        if (d0() >= m1.f.e(j11) && b0() >= m1.f.c(j11)) {
            return Float.POSITIVE_INFINITY;
        }
        long M0 = M0(j11);
        float e10 = m1.f.e(M0);
        float c10 = m1.f.c(M0);
        float d10 = m1.c.d(j10);
        if (d10 < s0.g.f34069a) {
            d02 = -d10;
        } else {
            d02 = d10 - d0();
        }
        float max = Math.max(s0.g.f34069a, d02);
        float e11 = m1.c.e(j10);
        if (e11 < s0.g.f34069a) {
            b02 = -e11;
        } else {
            b02 = e11 - b0();
        }
        long g10 = t0.t.g(max, Math.max(s0.g.f34069a, b02));
        if ((e10 <= s0.g.f34069a && c10 <= s0.g.f34069a) || m1.c.d(g10) > e10 || m1.c.e(g10) > c10) {
            return Float.POSITIVE_INFINITY;
        }
        if (g10 != 9205357640488583168L) {
            float intBitsToFloat = Float.intBitsToFloat((int) (g10 >> 32));
            float intBitsToFloat2 = Float.intBitsToFloat((int) (g10 & 4294967295L));
            return (intBitsToFloat2 * intBitsToFloat2) + (intBitsToFloat * intBitsToFloat);
        }
        t0.t.B0("Offset is unspecified");
        throw null;
    }

    @Override // a2.u
    public final long O(a2.u uVar, long j10) {
        if (uVar instanceof a2.k0) {
            return m1.c.k(uVar.O(this, m1.c.k(j10)));
        }
        i1 l12 = l1(uVar);
        l12.d1();
        i1 S0 = S0(l12);
        while (l12 != S0) {
            j10 = l12.m1(j10);
            l12 = l12.f7723m;
            Intrinsics.c(l12);
        }
        return L0(S0, j10);
    }

    public final void O0(n1.r rVar) {
        p1 p1Var = this.C;
        if (p1Var != null) {
            p1Var.g(rVar);
            return;
        }
        long j10 = this.f7732v;
        int i10 = w2.h.f38792c;
        float f10 = (int) (j10 >> 32);
        float f11 = (int) (j10 & 4294967295L);
        rVar.r(f10, f11);
        Q0(rVar);
        rVar.r(-f10, -f11);
    }

    public final void P0(n1.r rVar, n1.f fVar) {
        long j10 = this.f31c;
        rVar.getClass();
        rVar.i(0.5f, 0.5f, ((int) (j10 >> 32)) - 0.5f, ((int) (j10 & 4294967295L)) - 0.5f, fVar);
    }

    public final void Q0(n1.r rVar) {
        g1.n X0 = X0(4);
        if (X0 == null) {
            g1(rVar);
            return;
        }
        androidx.compose.ui.node.a aVar = this.f7721k;
        aVar.getClass();
        j0 sharedDrawScope = ((d2.a0) k0.a(aVar)).getSharedDrawScope();
        long i12 = hl.f.i1(this.f31c);
        sharedDrawScope.getClass();
        v0.h hVar = null;
        while (X0 != null) {
            if (X0 instanceof s) {
                sharedDrawScope.c(rVar, i12, this, (s) X0);
            } else if ((X0.f16407c & 4) != 0 && (X0 instanceof o)) {
                int i10 = 0;
                for (g1.n nVar = ((o) X0).f7801o; nVar != null; nVar = nVar.f16410f) {
                    if ((nVar.f16407c & 4) != 0) {
                        i10++;
                        if (i10 == 1) {
                            X0 = nVar;
                        } else {
                            if (hVar == null) {
                                hVar = new v0.h(new g1.n[16]);
                            }
                            if (X0 != null) {
                                hVar.b(X0);
                                X0 = null;
                            }
                            hVar.b(nVar);
                        }
                    }
                }
                if (i10 == 1) {
                }
            }
            X0 = g.f(hVar);
        }
    }

    public abstract void R0();

    public final i1 S0(i1 i1Var) {
        androidx.compose.ui.node.a aVar = i1Var.f7721k;
        androidx.compose.ui.node.a aVar2 = this.f7721k;
        if (aVar == aVar2) {
            g1.n W0 = i1Var.W0();
            g1.n nVar = W0().f16405a;
            if (nVar.f16417m) {
                for (g1.n nVar2 = nVar.f16409e; nVar2 != null; nVar2 = nVar2.f16409e) {
                    if ((nVar2.f16407c & 2) != 0 && nVar2 == W0) {
                        return i1Var;
                    }
                }
                return this;
            }
            t0.t.C0("visitLocalAncestors called on an unattached node");
            throw null;
        }
        while (aVar.f1410k > aVar2.f1410k) {
            aVar = aVar.q();
            Intrinsics.c(aVar);
        }
        androidx.compose.ui.node.a aVar3 = aVar2;
        while (aVar3.f1410k > aVar.f1410k) {
            aVar3 = aVar3.q();
            Intrinsics.c(aVar3);
        }
        while (aVar != aVar3) {
            aVar = aVar.q();
            aVar3 = aVar3.q();
            if (aVar == null || aVar3 == null) {
                throw new IllegalArgumentException("layouts are not part of the same hierarchy");
            }
        }
        if (aVar3 == aVar2) {
            return this;
        }
        if (aVar != i1Var.f7721k) {
            return aVar.f1422w.f7655b;
        }
        return i1Var;
    }

    public final long T0(long j10) {
        long j11 = this.f7732v;
        float d10 = m1.c.d(j10);
        int i10 = w2.h.f38792c;
        long g10 = t0.t.g(d10 - ((int) (j11 >> 32)), m1.c.e(j10) - ((int) (j11 & 4294967295L)));
        p1 p1Var = this.C;
        if (p1Var != null) {
            return p1Var.f(g10, true);
        }
        return g10;
    }

    public abstract v0 U0();

    public final long V0() {
        return this.f7727q.s0(this.f7721k.f1419t.d());
    }

    public abstract g1.n W0();

    public final g1.n X0(int i10) {
        boolean r10 = g.r(i10);
        g1.n W0 = W0();
        if (r10 || (W0 = W0.f16409e) != null) {
            for (g1.n Y0 = Y0(r10); Y0 != null && (Y0.f16408d & i10) != 0; Y0 = Y0.f16410f) {
                if ((Y0.f16407c & i10) != 0) {
                    return Y0;
                }
                if (Y0 == W0) {
                    return null;
                }
            }
            return null;
        }
        return null;
    }

    @Override // w2.b
    public final float Y() {
        return this.f7721k.f1417r.Y();
    }

    public final g1.n Y0(boolean z10) {
        g1.n W0;
        b1 b1Var = this.f7721k.f1422w;
        if (b1Var.f7656c == this) {
            return b1Var.f7658e;
        }
        if (z10) {
            i1 i1Var = this.f7723m;
            if (i1Var != null && (W0 = i1Var.W0()) != null) {
                return W0.f16410f;
            }
        } else {
            i1 i1Var2 = this.f7723m;
            if (i1Var2 != null) {
                return i1Var2.W0();
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x010c, code lost:
    
        if (c2.g.o(r21.b(), c2.g.a(r15, r23)) > 0) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void Z0(c2.d1 r18, long r19, c2.v r21, boolean r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c2.i1.Z0(c2.d1, long, c2.v, boolean, boolean):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [g1.n] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [g1.n] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v9 */
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
    @Override // a2.p0, a2.q
    public final Object a() {
        androidx.compose.ui.node.a aVar = this.f7721k;
        if (!aVar.f1422w.d(64)) {
            return null;
        }
        W0();
        iu.z zVar = new iu.z();
        for (g1.n nVar = aVar.f1422w.f7657d; nVar != null; nVar = nVar.f16409e) {
            if ((nVar.f16407c & 64) != 0) {
                ?? r62 = 0;
                o oVar = nVar;
                while (oVar != 0) {
                    if (oVar instanceof u1) {
                        zVar.f20560a = ((u1) oVar).L(aVar.f1417r, zVar.f20560a);
                    } else if ((oVar.f16407c & 64) != 0 && (oVar instanceof o)) {
                        g1.n nVar2 = oVar.f7801o;
                        int i10 = 0;
                        oVar = oVar;
                        r62 = r62;
                        while (nVar2 != null) {
                            if ((nVar2.f16407c & 64) != 0) {
                                i10++;
                                r62 = r62;
                                if (i10 == 1) {
                                    oVar = nVar2;
                                } else {
                                    if (r62 == 0) {
                                        r62 = new v0.h(new g1.n[16]);
                                    }
                                    if (oVar != 0) {
                                        r62.b(oVar);
                                        oVar = 0;
                                    }
                                    r62.b(nVar2);
                                }
                            }
                            nVar2 = nVar2.f16410f;
                            oVar = oVar;
                            r62 = r62;
                        }
                        if (i10 == 1) {
                        }
                    }
                    oVar = g.f(r62);
                }
            }
        }
        return zVar.f20560a;
    }

    public void a1(d1 d1Var, long j10, v vVar, boolean z10, boolean z11) {
        i1 i1Var = this.f7722l;
        if (i1Var != null) {
            i1Var.Z0(d1Var, i1Var.T0(j10), vVar, z10, z11);
        }
    }

    @Override // w2.b
    public final float b() {
        return this.f7721k.f1417r.b();
    }

    public final void b1() {
        p1 p1Var = this.C;
        if (p1Var != null) {
            p1Var.invalidate();
            return;
        }
        i1 i1Var = this.f7723m;
        if (i1Var != null) {
            i1Var.b1();
        }
    }

    public final boolean c1() {
        if (this.C != null && this.f7729s <= s0.g.f34069a) {
            return true;
        }
        i1 i1Var = this.f7723m;
        if (i1Var != null) {
            return i1Var.c1();
        }
        return false;
    }

    public final void d1() {
        q0 q0Var = this.f7721k.f1423x;
        int i10 = q0Var.f7813a.f1423x.f7815c;
        if (i10 == 3 || i10 == 4) {
            if (q0Var.f7827o.f7795w) {
                q0Var.d(true);
            } else {
                q0Var.c(true);
            }
        }
        if (i10 == 4) {
            m0 m0Var = q0Var.f7828p;
            if (m0Var != null && m0Var.f7772t) {
                q0Var.d(true);
            } else {
                q0Var.c(true);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [g1.n] */
    /* JADX WARN: Type inference failed for: r7v7, types: [g1.n] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2, types: [v0.h] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [v0.h] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final void e1() {
        Function1 function1;
        g1.n nVar;
        g1.n Y0 = Y0(g.r(128));
        if (Y0 != null && (Y0.f16405a.f16408d & 128) != 0) {
            e1.i h10 = yq.b.h();
            if (h10 != null) {
                function1 = h10.f();
            } else {
                function1 = null;
            }
            e1.i i10 = yq.b.i(h10);
            try {
                boolean r10 = g.r(128);
                if (r10) {
                    nVar = W0();
                } else {
                    nVar = W0().f16409e;
                    if (nVar == null) {
                        Unit unit = Unit.f23355a;
                        yq.b.l(h10, i10, function1);
                    }
                }
                for (g1.n Y02 = Y0(r10); Y02 != null && (Y02.f16408d & 128) != 0; Y02 = Y02.f16410f) {
                    if ((Y02.f16407c & 128) != 0) {
                        ?? r82 = 0;
                        o oVar = Y02;
                        while (oVar != 0) {
                            if (oVar instanceof b0) {
                                ((b0) oVar).m(this.f31c);
                            } else if ((oVar.f16407c & 128) != 0 && (oVar instanceof o)) {
                                g1.n nVar2 = oVar.f7801o;
                                int i11 = 0;
                                oVar = oVar;
                                r82 = r82;
                                while (nVar2 != null) {
                                    if ((nVar2.f16407c & 128) != 0) {
                                        i11++;
                                        r82 = r82;
                                        if (i11 == 1) {
                                            oVar = nVar2;
                                        } else {
                                            if (r82 == 0) {
                                                r82 = new v0.h(new g1.n[16]);
                                            }
                                            if (oVar != 0) {
                                                r82.b(oVar);
                                                oVar = 0;
                                            }
                                            r82.b(nVar2);
                                        }
                                    }
                                    nVar2 = nVar2.f16410f;
                                    oVar = oVar;
                                    r82 = r82;
                                }
                                if (i11 == 1) {
                                }
                            }
                            oVar = g.f(r82);
                        }
                    }
                    if (Y02 == nVar) {
                        break;
                    }
                }
                Unit unit2 = Unit.f23355a;
                yq.b.l(h10, i10, function1);
            } catch (Throwable th2) {
                yq.b.l(h10, i10, function1);
                throw th2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [g1.n] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [g1.n] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
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
    public final void f1() {
        boolean r10 = g.r(128);
        g1.n W0 = W0();
        if (r10 || (W0 = W0.f16409e) != null) {
            for (g1.n Y0 = Y0(r10); Y0 != null && (Y0.f16408d & 128) != 0; Y0 = Y0.f16410f) {
                if ((Y0.f16407c & 128) != 0) {
                    o oVar = Y0;
                    ?? r52 = 0;
                    while (oVar != 0) {
                        if (oVar instanceof b0) {
                            ((b0) oVar).g0(this);
                        } else if ((oVar.f16407c & 128) != 0 && (oVar instanceof o)) {
                            g1.n nVar = oVar.f7801o;
                            int i10 = 0;
                            oVar = oVar;
                            r52 = r52;
                            while (nVar != null) {
                                if ((nVar.f16407c & 128) != 0) {
                                    i10++;
                                    r52 = r52;
                                    if (i10 == 1) {
                                        oVar = nVar;
                                    } else {
                                        if (r52 == 0) {
                                            r52 = new v0.h(new g1.n[16]);
                                        }
                                        if (oVar != 0) {
                                            r52.b(oVar);
                                            oVar = 0;
                                        }
                                        r52.b(nVar);
                                    }
                                }
                                nVar = nVar.f16410f;
                                oVar = oVar;
                                r52 = r52;
                            }
                            if (i10 == 1) {
                            }
                        }
                        oVar = g.f(r52);
                    }
                }
                if (Y0 == W0) {
                    return;
                }
            }
        }
    }

    @Override // a2.u
    public final long g(long j10) {
        long M = M(j10);
        d2.a0 a0Var = (d2.a0) k0.a(this.f7721k);
        a0Var.B();
        return n1.k0.a(M, a0Var.f13305e0);
    }

    public abstract void g1(n1.r rVar);

    @Override // a2.r
    public final w2.k getLayoutDirection() {
        return this.f7721k.f1418s;
    }

    public final void h1(long j10, float f10, Function1 function1) {
        p1(function1, false);
        if (!w2.h.a(this.f7732v, j10)) {
            this.f7732v = j10;
            androidx.compose.ui.node.a aVar = this.f7721k;
            aVar.f1423x.f7827o.B0();
            p1 p1Var = this.C;
            if (p1Var != null) {
                p1Var.j(j10);
            } else {
                i1 i1Var = this.f7723m;
                if (i1Var != null) {
                    i1Var.b1();
                }
            }
            u0.I0(this);
            r1 r1Var = aVar.f1408i;
            if (r1Var != null) {
                ((d2.a0) r1Var).y(aVar);
            }
        }
        this.f7733w = f10;
        if (!this.f7852g) {
            w0(new v1(F0(), this));
        }
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, m1.b] */
    @Override // a2.u
    public final m1.d i(a2.u uVar, boolean z10) {
        if (W0().f16417m) {
            if (uVar.m()) {
                i1 l12 = l1(uVar);
                l12.d1();
                i1 S0 = S0(l12);
                m1.b bVar = this.f7734x;
                m1.b bVar2 = bVar;
                if (bVar == null) {
                    ?? obj = new Object();
                    obj.f27229a = s0.g.f34069a;
                    obj.f27230b = s0.g.f34069a;
                    obj.f27231c = s0.g.f34069a;
                    obj.f27232d = s0.g.f34069a;
                    this.f7734x = obj;
                    bVar2 = obj;
                }
                bVar2.f27229a = s0.g.f34069a;
                bVar2.f27230b = s0.g.f34069a;
                bVar2.f27231c = (int) (uVar.q() >> 32);
                bVar2.f27232d = (int) (uVar.q() & 4294967295L);
                i1 i1Var = l12;
                while (i1Var != S0) {
                    i1Var.i1(bVar2, z10, false);
                    if (bVar2.b()) {
                        return m1.d.f27238e;
                    }
                    i1 i1Var2 = i1Var.f7723m;
                    Intrinsics.c(i1Var2);
                    i1Var = i1Var2;
                }
                K0(S0, bVar2, z10);
                return new m1.d(bVar2.f27229a, bVar2.f27230b, bVar2.f27231c, bVar2.f27232d);
            }
            t0.t.C0("LayoutCoordinates " + uVar + " is not attached!");
            throw null;
        }
        t0.t.C0("LayoutCoordinate operations are only valid when isAttached is true");
        throw null;
    }

    public final void i1(m1.b bVar, boolean z10, boolean z11) {
        p1 p1Var = this.C;
        if (p1Var != null) {
            if (this.f7725o) {
                if (z11) {
                    long V0 = V0();
                    float e10 = m1.f.e(V0) / 2.0f;
                    float c10 = m1.f.c(V0) / 2.0f;
                    long j10 = this.f31c;
                    bVar.a(-e10, -c10, ((int) (j10 >> 32)) + e10, ((int) (j10 & 4294967295L)) + c10);
                } else if (z10) {
                    long j11 = this.f31c;
                    bVar.a(s0.g.f34069a, s0.g.f34069a, (int) (j11 >> 32), (int) (j11 & 4294967295L));
                }
                if (bVar.b()) {
                    return;
                }
            }
            p1Var.d(bVar, false);
        }
        long j12 = this.f7732v;
        int i10 = w2.h.f38792c;
        float f10 = (int) (j12 >> 32);
        bVar.f27229a += f10;
        bVar.f27231c += f10;
        float f11 = (int) (j12 & 4294967295L);
        bVar.f27230b += f11;
        bVar.f27232d += f11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [g1.n] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [g1.n] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
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
    public final void j1(a2.n0 n0Var) {
        a2.n0 n0Var2 = this.f7730t;
        if (n0Var != n0Var2) {
            this.f7730t = n0Var;
            androidx.compose.ui.node.a aVar = this.f7721k;
            if (n0Var2 == null || n0Var.b() != n0Var2.b() || n0Var.a() != n0Var2.a()) {
                int b10 = n0Var.b();
                int a10 = n0Var.a();
                p1 p1Var = this.C;
                if (p1Var != null) {
                    p1Var.h(hl.f.k(b10, a10));
                } else {
                    i1 i1Var = this.f7723m;
                    if (i1Var != null) {
                        i1Var.b1();
                    }
                }
                l0(hl.f.k(b10, a10));
                q1(false);
                boolean r10 = g.r(4);
                g1.n W0 = W0();
                if (r10 || (W0 = W0.f16409e) != null) {
                    for (g1.n Y0 = Y0(r10); Y0 != null && (Y0.f16408d & 4) != 0; Y0 = Y0.f16410f) {
                        if ((Y0.f16407c & 4) != 0) {
                            o oVar = Y0;
                            ?? r82 = 0;
                            while (oVar != 0) {
                                if (oVar instanceof s) {
                                    ((s) oVar).K();
                                } else if ((oVar.f16407c & 4) != 0 && (oVar instanceof o)) {
                                    g1.n nVar = oVar.f7801o;
                                    int i10 = 0;
                                    oVar = oVar;
                                    r82 = r82;
                                    while (nVar != null) {
                                        if ((nVar.f16407c & 4) != 0) {
                                            i10++;
                                            r82 = r82;
                                            if (i10 == 1) {
                                                oVar = nVar;
                                            } else {
                                                if (r82 == 0) {
                                                    r82 = new v0.h(new g1.n[16]);
                                                }
                                                if (oVar != 0) {
                                                    r82.b(oVar);
                                                    oVar = 0;
                                                }
                                                r82.b(nVar);
                                            }
                                        }
                                        nVar = nVar.f16410f;
                                        oVar = oVar;
                                        r82 = r82;
                                    }
                                    if (i10 == 1) {
                                    }
                                }
                                oVar = g.f(r82);
                            }
                        }
                        if (Y0 == W0) {
                            break;
                        }
                    }
                }
                r1 r1Var = aVar.f1408i;
                if (r1Var != null) {
                    ((d2.a0) r1Var).y(aVar);
                }
            }
            LinkedHashMap linkedHashMap = this.f7731u;
            if (((linkedHashMap != null && !linkedHashMap.isEmpty()) || (!n0Var.c().isEmpty())) && !Intrinsics.a(n0Var.c(), this.f7731u)) {
                aVar.f1423x.f7827o.f7792t.g();
                LinkedHashMap linkedHashMap2 = this.f7731u;
                if (linkedHashMap2 == null) {
                    linkedHashMap2 = new LinkedHashMap();
                    this.f7731u = linkedHashMap2;
                }
                linkedHashMap2.clear();
                linkedHashMap2.putAll(n0Var.c());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v2, types: [g1.n] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [g1.n] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
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
    public final void k1(g1.n nVar, d1 d1Var, long j10, v vVar, boolean z10, boolean z11, float f10) {
        if (nVar == null) {
            a1(d1Var, j10, vVar, z10, z11);
            return;
        }
        androidx.work.u uVar = (androidx.work.u) d1Var;
        int i10 = 16;
        switch (uVar.f2637a) {
            case 0:
                o oVar = nVar;
                ?? r52 = 0;
                while (oVar != 0) {
                    if (oVar instanceof w1) {
                        ((w1) oVar).M();
                    } else if ((oVar.f16407c & 16) != 0 && (oVar instanceof o)) {
                        g1.n nVar2 = oVar.f7801o;
                        int i11 = 0;
                        oVar = oVar;
                        r52 = r52;
                        while (nVar2 != null) {
                            if ((nVar2.f16407c & 16) != 0) {
                                i11++;
                                r52 = r52;
                                if (i11 == 1) {
                                    oVar = nVar2;
                                } else {
                                    if (r52 == 0) {
                                        r52 = new v0.h(new g1.n[16]);
                                    }
                                    if (oVar != 0) {
                                        r52.b(oVar);
                                        oVar = 0;
                                    }
                                    r52.b(nVar2);
                                }
                            }
                            nVar2 = nVar2.f16410f;
                            oVar = oVar;
                            r52 = r52;
                        }
                        if (i11 == 1) {
                        }
                    }
                    oVar = g.f(r52);
                }
                break;
        }
        switch (uVar.f2637a) {
            case 0:
                break;
            default:
                i10 = 8;
                break;
        }
        k1(g.e(nVar, i10), d1Var, j10, vVar, z10, z11, f10);
    }

    @Override // a2.u
    public final boolean m() {
        return W0().f16417m;
    }

    public final long m1(long j10) {
        p1 p1Var = this.C;
        if (p1Var != null) {
            j10 = p1Var.f(j10, false);
        }
        long j11 = this.f7732v;
        float d10 = m1.c.d(j10);
        int i10 = w2.h.f38792c;
        return t0.t.g(d10 + ((int) (j11 >> 32)), m1.c.e(j10) + ((int) (j11 & 4294967295L)));
    }

    @Override // a2.u
    public final void n(float[] fArr) {
        r1 a10 = k0.a(this.f7721k);
        o1(l1(androidx.compose.ui.layout.a.e(this)), fArr);
        d2.a0 a0Var = (d2.a0) a10;
        a0Var.B();
        n1.k0.d(fArr, a0Var.f13305e0);
        float d10 = m1.c.d(a0Var.f13313i0);
        float e10 = m1.c.e(a0Var.f13313i0);
        float[] fArr2 = a0Var.J;
        n1.k0.c(fArr2);
        n1.k0.e(fArr2, d10, e10);
        d2.w0.v(fArr, fArr2);
    }

    public final void n1(i1 i1Var, float[] fArr) {
        if (!Intrinsics.a(i1Var, this)) {
            i1 i1Var2 = this.f7723m;
            Intrinsics.c(i1Var2);
            i1Var2.n1(i1Var, fArr);
            if (!w2.h.a(this.f7732v, w2.h.f38791b)) {
                float[] fArr2 = F;
                n1.k0.c(fArr2);
                long j10 = this.f7732v;
                n1.k0.e(fArr2, -((int) (j10 >> 32)), -((int) (j10 & 4294967295L)));
                n1.k0.d(fArr, fArr2);
            }
            p1 p1Var = this.C;
            if (p1Var != null) {
                p1Var.i(fArr);
            }
        }
    }

    public final void o1(i1 i1Var, float[] fArr) {
        i1 i1Var2 = this;
        while (!Intrinsics.a(i1Var2, i1Var)) {
            p1 p1Var = i1Var2.C;
            if (p1Var != null) {
                p1Var.a(fArr);
            }
            if (!w2.h.a(i1Var2.f7732v, w2.h.f38791b)) {
                float[] fArr2 = F;
                n1.k0.c(fArr2);
                n1.k0.e(fArr2, (int) (r1 >> 32), (int) (r1 & 4294967295L));
                n1.k0.d(fArr, fArr2);
            }
            i1Var2 = i1Var2.f7723m;
            Intrinsics.c(i1Var2);
        }
    }

    public final void p1(Function1 function1, boolean z10) {
        boolean z11;
        r1 r1Var;
        Reference poll;
        v0.h hVar;
        d2.y1 y1Var;
        androidx.compose.ui.node.a aVar = this.f7721k;
        if (!z10 && this.f7726p == function1 && Intrinsics.a(this.f7727q, aVar.f1417r) && this.f7728r == aVar.f1418s) {
            z11 = false;
        } else {
            z11 = true;
        }
        this.f7726p = function1;
        this.f7727q = aVar.f1417r;
        this.f7728r = aVar.f1418s;
        boolean C = aVar.C();
        p0 p0Var = this.A;
        Object obj = null;
        if (C && function1 != null) {
            if (this.C == null) {
                d2.a0 a0Var = (d2.a0) k0.a(aVar);
                do {
                    p3 p3Var = a0Var.E0;
                    poll = p3Var.f13568b.poll();
                    hVar = p3Var.f13567a;
                    if (poll != null) {
                        hVar.m(poll);
                    }
                } while (poll != null);
                while (true) {
                    if (!hVar.l()) {
                        break;
                    }
                    Object obj2 = ((Reference) hVar.n(hVar.f37655c - 1)).get();
                    if (obj2 != null) {
                        obj = obj2;
                        break;
                    }
                }
                p1 p1Var = (p1) obj;
                e1 e1Var = this.f7736z;
                if (p1Var != null) {
                    p1Var.l(p0Var, e1Var);
                } else {
                    if (a0Var.isHardwareAccelerated() && a0Var.f13315j0) {
                        try {
                            p1Var = new w2(a0Var, e1Var, p0Var);
                        } catch (Throwable unused) {
                            a0Var.f13315j0 = false;
                        }
                    }
                    if (a0Var.C == null) {
                        if (!l3.f13502s) {
                            mt.p.F(new View(a0Var.getContext()));
                        }
                        if (l3.f13503t) {
                            y1Var = new d2.y1(a0Var.getContext());
                        } else {
                            y1Var = new d2.y1(a0Var.getContext());
                        }
                        a0Var.C = y1Var;
                        a0Var.addView(y1Var);
                    }
                    d2.y1 y1Var2 = a0Var.C;
                    Intrinsics.c(y1Var2);
                    p1Var = new l3(a0Var, y1Var2, e1Var, p0Var);
                }
                p1Var.h(this.f31c);
                p1Var.j(this.f7732v);
                this.C = p1Var;
                q1(true);
                aVar.A = true;
                p0Var.mo2invoke();
                return;
            }
            if (z11) {
                q1(true);
                return;
            }
            return;
        }
        p1 p1Var2 = this.C;
        if (p1Var2 != null) {
            p1Var2.b();
            aVar.A = true;
            p0Var.mo2invoke();
            if (W0().f16417m && (r1Var = aVar.f1408i) != null) {
                ((d2.a0) r1Var).y(aVar);
            }
        }
        this.C = null;
        this.B = false;
    }

    @Override // a2.u
    public final long q() {
        return this.f31c;
    }

    public final void q1(boolean z10) {
        r1 r1Var;
        p1 p1Var = this.C;
        if (p1Var != null) {
            Function1 function1 = this.f7726p;
            if (function1 != null) {
                n1.u0 u0Var = D;
                u0Var.i(1.0f);
                u0Var.j(1.0f);
                u0Var.a(1.0f);
                u0Var.r(s0.g.f34069a);
                u0Var.z(s0.g.f34069a);
                u0Var.l(s0.g.f34069a);
                long j10 = n1.g0.f28137a;
                u0Var.c(j10);
                u0Var.n(j10);
                u0Var.e(s0.g.f34069a);
                u0Var.f(s0.g.f34069a);
                u0Var.g(s0.g.f34069a);
                if (u0Var.f28193m != 8.0f) {
                    u0Var.f28181a |= 2048;
                    u0Var.f28193m = 8.0f;
                }
                u0Var.q(n1.b1.f28120b);
                u0Var.m(n1.s0.f28162a);
                int i10 = 0;
                if (u0Var.f28196p) {
                    u0Var.f28181a |= Http2.INITIAL_MAX_FRAME_SIZE;
                    u0Var.f28196p = false;
                }
                if (!Intrinsics.a(null, null)) {
                    u0Var.f28181a |= 131072;
                }
                if (!n1.s0.c(u0Var.f28197q, 0)) {
                    u0Var.f28181a |= 32768;
                    u0Var.f28197q = 0;
                }
                u0Var.f28198r = m1.f.f27252c;
                u0Var.f28181a = 0;
                androidx.compose.ui.node.a aVar = this.f7721k;
                u0Var.f28199s = aVar.f1417r;
                u0Var.f28198r = hl.f.i1(this.f31c);
                ((d2.a0) k0.a(aVar)).getSnapshotObserver().a(this, f.f7682k, new h1(i10, function1));
                a0 a0Var = this.f7735y;
                if (a0Var == null) {
                    a0Var = new a0();
                    this.f7735y = a0Var;
                }
                a0Var.f7638a = u0Var.f28182b;
                a0Var.f7639b = u0Var.f28183c;
                a0Var.f7640c = u0Var.f28185e;
                a0Var.f7641d = u0Var.f28186f;
                a0Var.f7642e = u0Var.f28190j;
                a0Var.f7643f = u0Var.f28191k;
                a0Var.f7644g = u0Var.f28192l;
                a0Var.f7645h = u0Var.f28193m;
                a0Var.f7646i = u0Var.f28194n;
                p1Var.c(u0Var, aVar.f1418s, aVar.f1417r);
                this.f7725o = u0Var.f28196p;
                this.f7729s = u0Var.f28184d;
                if (z10 && (r1Var = aVar.f1408i) != null) {
                    ((d2.a0) r1Var).y(aVar);
                    return;
                }
                return;
            }
            t0.t.D0("updateLayerParameters requires a non-null layerBlock");
            throw null;
        }
        if (this.f7726p == null) {
            return;
        }
        t0.t.C0("null layer with a non-null layerBlock");
        throw null;
    }

    @Override // c2.s1
    public final boolean r() {
        if (this.C != null && !this.f7724n && this.f7721k.C()) {
            return true;
        }
        return false;
    }
}
