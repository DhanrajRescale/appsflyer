package c2;

import com.google.android.gms.common.api.Api;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class n0 extends a2.a1 implements a2.l0, b {
    public Function1 A;
    public long B;
    public float C;
    public final x.y0 D;
    public final /* synthetic */ q0 E;

    /* renamed from: f, reason: collision with root package name */
    public boolean f7778f;

    /* renamed from: i, reason: collision with root package name */
    public boolean f7781i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f7782j;

    /* renamed from: l, reason: collision with root package name */
    public boolean f7784l;

    /* renamed from: m, reason: collision with root package name */
    public long f7785m;

    /* renamed from: n, reason: collision with root package name */
    public Function1 f7786n;

    /* renamed from: o, reason: collision with root package name */
    public float f7787o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f7788p;

    /* renamed from: q, reason: collision with root package name */
    public Object f7789q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f7790r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f7791s;

    /* renamed from: t, reason: collision with root package name */
    public final i0 f7792t;

    /* renamed from: u, reason: collision with root package name */
    public final v0.h f7793u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f7794v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f7795w;

    /* renamed from: x, reason: collision with root package name */
    public final x.a f7796x;

    /* renamed from: y, reason: collision with root package name */
    public float f7797y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f7798z;

    /* renamed from: g, reason: collision with root package name */
    public int f7779g = Api.BaseClientBuilder.API_PRIORITY_OTHER;

    /* renamed from: h, reason: collision with root package name */
    public int f7780h = Api.BaseClientBuilder.API_PRIORITY_OTHER;

    /* renamed from: k, reason: collision with root package name */
    public int f7783k = 3;

    /* JADX WARN: Type inference failed for: r3v0, types: [c2.i0, c2.a] */
    public n0(q0 q0Var) {
        this.E = q0Var;
        long j10 = w2.h.f38791b;
        this.f7785m = j10;
        this.f7788p = true;
        this.f7792t = new a(this);
        this.f7793u = new v0.h(new n0[16]);
        this.f7794v = true;
        this.f7796x = new x.a(this, 29);
        this.B = j10;
        this.D = new x.y0(13, q0Var, this);
    }

    public final void A0() {
        if (this.f7790r) {
            int i10 = 0;
            this.f7790r = false;
            v0.h u10 = this.E.f7813a.u();
            int i11 = u10.f37655c;
            if (i11 > 0) {
                Object[] objArr = u10.f37653a;
                do {
                    ((androidx.compose.ui.node.a) objArr[i10]).f1423x.f7827o.A0();
                    i10++;
                } while (i10 < i11);
            }
        }
    }

    public final void B0() {
        v0.h u10;
        int i10;
        q0 q0Var = this.E;
        if (q0Var.f7826n > 0 && (i10 = (u10 = q0Var.f7813a.u()).f37655c) > 0) {
            Object[] objArr = u10.f37653a;
            int i11 = 0;
            do {
                androidx.compose.ui.node.a aVar = (androidx.compose.ui.node.a) objArr[i11];
                q0 q0Var2 = aVar.f1423x;
                if ((q0Var2.f7824l || q0Var2.f7825m) && !q0Var2.f7817e) {
                    aVar.R(false);
                }
                q0Var2.f7827o.B0();
                i11++;
            } while (i11 < i10);
        }
    }

    public final void C0() {
        int i10;
        q0 q0Var = this.E;
        androidx.compose.ui.node.a.S(q0Var.f7813a, false, 3);
        androidx.compose.ui.node.a aVar = q0Var.f7813a;
        androidx.compose.ui.node.a q10 = aVar.q();
        if (q10 != null && aVar.G == 3) {
            int e10 = w.k.e(q10.f1423x.f7815c);
            if (e10 != 0) {
                i10 = 2;
                if (e10 != 2) {
                    i10 = q10.G;
                }
            } else {
                i10 = 1;
            }
            aVar.G = i10;
        }
    }

    @Override // a2.q
    public final int D(int i10) {
        C0();
        return this.E.a().D(i10);
    }

    @Override // a2.l0
    public final a2.a1 E(long j10) {
        int i10;
        q0 q0Var = this.E;
        androidx.compose.ui.node.a aVar = q0Var.f7813a;
        if (aVar.G == 3) {
            aVar.d();
        }
        androidx.compose.ui.node.a aVar2 = q0Var.f7813a;
        if (g.v(aVar2)) {
            m0 m0Var = q0Var.f7828p;
            Intrinsics.c(m0Var);
            m0Var.f7761i = 3;
            m0Var.E(j10);
        }
        androidx.compose.ui.node.a q10 = aVar2.q();
        if (q10 != null) {
            if (this.f7783k != 3 && !aVar2.f1421v) {
                t0.t.C0("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
                throw null;
            }
            q0 q0Var2 = q10.f1423x;
            int e10 = w.k.e(q0Var2.f7815c);
            if (e10 != 0) {
                i10 = 2;
                if (e10 != 2) {
                    throw new IllegalStateException("Measurable could be only measured from the parent's measure or layout block. Parents state is ".concat(a3.a.D(q0Var2.f7815c)));
                }
            } else {
                i10 = 1;
            }
            this.f7783k = i10;
        } else {
            this.f7783k = 3;
        }
        G0(j10);
        return this;
    }

    public final void E0() {
        this.f7798z = true;
        q0 q0Var = this.E;
        androidx.compose.ui.node.a q10 = q0Var.f7813a.q();
        float f10 = j().f7733w;
        b1 b1Var = q0Var.f7813a.f1422w;
        i1 i1Var = b1Var.f7656c;
        while (i1Var != b1Var.f7655b) {
            Intrinsics.d(i1Var, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
            d0 d0Var = (d0) i1Var;
            f10 += d0Var.f7733w;
            i1Var = d0Var.f7722l;
        }
        if (f10 != this.f7797y) {
            this.f7797y = f10;
            if (q10 != null) {
                q10.J();
            }
            if (q10 != null) {
                q10.x();
            }
        }
        if (!this.f7790r) {
            if (q10 != null) {
                q10.x();
            }
            w0();
            if (this.f7778f && q10 != null) {
                q10.R(false);
            }
        }
        if (q10 != null) {
            if (!this.f7778f) {
                q0 q0Var2 = q10.f1423x;
                if (q0Var2.f7815c == 3) {
                    if (this.f7780h == Integer.MAX_VALUE) {
                        int i10 = q0Var2.f7823k;
                        this.f7780h = i10;
                        q0Var2.f7823k = i10 + 1;
                    } else {
                        t0.t.C0("Place was called on a node which was placed already");
                        throw null;
                    }
                }
            }
        } else {
            this.f7780h = 0;
        }
        J();
    }

    public final void F0(long j10, float f10, Function1 function1) {
        q0 q0Var = this.E;
        androidx.compose.ui.node.a aVar = q0Var.f7813a;
        if (!aVar.F) {
            q0Var.f7815c = 3;
            this.f7785m = j10;
            this.f7787o = f10;
            this.f7786n = function1;
            this.f7782j = true;
            this.f7798z = false;
            r1 a10 = k0.a(aVar);
            if (!q0Var.f7817e && this.f7790r) {
                i1 a11 = q0Var.a();
                long j11 = a11.f33e;
                a11.h1(hl.f.j(((int) (j10 >> 32)) + ((int) (j11 >> 32)), ((int) (j10 & 4294967295L)) + ((int) (j11 & 4294967295L))), f10, function1);
                E0();
            } else {
                this.f7792t.f7635g = false;
                q0Var.c(false);
                this.A = function1;
                this.B = j10;
                this.C = f10;
                t1 snapshotObserver = ((d2.a0) a10).getSnapshotObserver();
                snapshotObserver.a(q0Var.f7813a, snapshotObserver.f7845f, this.D);
                this.A = null;
            }
            q0Var.f7815c = 5;
            return;
        }
        t0.t.A0("place is called on a deactivated node");
        throw null;
    }

    public final boolean G0(long j10) {
        boolean z10;
        q0 q0Var = this.E;
        androidx.compose.ui.node.a aVar = q0Var.f7813a;
        boolean z11 = true;
        if (!aVar.F) {
            r1 a10 = k0.a(aVar);
            androidx.compose.ui.node.a aVar2 = q0Var.f7813a;
            androidx.compose.ui.node.a q10 = aVar2.q();
            if (!aVar2.f1421v && (q10 == null || !q10.f1421v)) {
                z10 = false;
            } else {
                z10 = true;
            }
            aVar2.f1421v = z10;
            if (!aVar2.f1423x.f7816d && w2.a.b(this.f32d, j10)) {
                ((d2.a0) a10).F.d(aVar2, false);
                aVar2.V();
                return false;
            }
            this.f7792t.f7634f = false;
            L(f.f7679h);
            this.f7781i = true;
            long j11 = q0Var.a().f31c;
            q0(j10);
            if (q0Var.f7815c == 5) {
                q0Var.f7815c = 1;
                q0Var.f7816d = false;
                q0Var.f7829q = j10;
                t1 snapshotObserver = ((d2.a0) k0.a(aVar2)).getSnapshotObserver();
                snapshotObserver.a(aVar2, snapshotObserver.f7842c, q0Var.f7830r);
                if (q0Var.f7815c == 1) {
                    q0Var.f7817e = true;
                    q0Var.f7818f = true;
                    q0Var.f7815c = 5;
                }
                if (w2.j.a(q0Var.a().f31c, j11) && q0Var.a().f29a == this.f29a && q0Var.a().f30b == this.f30b) {
                    z11 = false;
                }
                l0(hl.f.k(q0Var.a().f29a, q0Var.a().f30b));
                return z11;
            }
            t0.t.C0("layout state is not idle before measure starts");
            throw null;
        }
        t0.t.A0("measure is called on a deactivated node");
        throw null;
    }

    @Override // c2.b
    public final void J() {
        v0.h u10;
        int i10;
        this.f7795w = true;
        i0 i0Var = this.f7792t;
        i0Var.i();
        q0 q0Var = this.E;
        boolean z10 = q0Var.f7817e;
        androidx.compose.ui.node.a aVar = q0Var.f7813a;
        if (z10 && (i10 = (u10 = aVar.u()).f37655c) > 0) {
            Object[] objArr = u10.f37653a;
            int i11 = 0;
            do {
                androidx.compose.ui.node.a aVar2 = (androidx.compose.ui.node.a) objArr[i11];
                q0 q0Var2 = aVar2.f1423x;
                if (q0Var2.f7816d && q0Var2.f7827o.f7783k == 1 && androidx.compose.ui.node.a.L(aVar2)) {
                    androidx.compose.ui.node.a.S(aVar, false, 3);
                }
                i11++;
            } while (i11 < i10);
        }
        if (q0Var.f7818f || (!this.f7784l && !j().f7852g && q0Var.f7817e)) {
            q0Var.f7817e = false;
            int i12 = q0Var.f7815c;
            q0Var.f7815c = 3;
            q0Var.d(false);
            t1 snapshotObserver = ((d2.a0) k0.a(aVar)).getSnapshotObserver();
            snapshotObserver.a(aVar, snapshotObserver.f7844e, this.f7796x);
            q0Var.f7815c = i12;
            if (j().f7852g && q0Var.f7824l) {
                requestLayout();
            }
            q0Var.f7818f = false;
        }
        if (i0Var.f7632d) {
            i0Var.f7633e = true;
        }
        if (i0Var.f7630b && i0Var.f()) {
            i0Var.h();
        }
        this.f7795w = false;
    }

    @Override // c2.b
    public final boolean K() {
        return this.f7790r;
    }

    @Override // c2.b
    public final void L(Function1 function1) {
        v0.h u10 = this.E.f7813a.u();
        int i10 = u10.f37655c;
        if (i10 > 0) {
            Object[] objArr = u10.f37653a;
            int i11 = 0;
            do {
                function1.invoke(((androidx.compose.ui.node.a) objArr[i11]).f1423x.f7827o);
                i11++;
            } while (i11 < i10);
        }
    }

    @Override // c2.b
    public final void V() {
        androidx.compose.ui.node.a.S(this.E.f7813a, false, 3);
    }

    @Override // a2.q
    public final int W(int i10) {
        C0();
        return this.E.a().W(i10);
    }

    @Override // a2.p0, a2.q
    public final Object a() {
        return this.f7789q;
    }

    @Override // a2.a1
    public final int b0() {
        return this.E.a().b0();
    }

    @Override // c2.b
    public final a c() {
        return this.f7792t;
    }

    @Override // a2.a1
    public final int d0() {
        return this.E.a().d0();
    }

    @Override // a2.q
    public final int e(int i10) {
        C0();
        return this.E.a().e(i10);
    }

    @Override // a2.p0
    public final int f(a2.a aVar) {
        int i10;
        q0 q0Var = this.E;
        androidx.compose.ui.node.a q10 = q0Var.f7813a.q();
        if (q10 != null) {
            i10 = q10.f1423x.f7815c;
        } else {
            i10 = 0;
        }
        i0 i0Var = this.f7792t;
        if (i10 == 1) {
            i0Var.f7631c = true;
        } else {
            androidx.compose.ui.node.a q11 = q0Var.f7813a.q();
            if (q11 != null && q11.f1423x.f7815c == 3) {
                i0Var.f7632d = true;
            }
        }
        this.f7784l = true;
        int f10 = q0Var.a().f(aVar);
        this.f7784l = false;
        return f10;
    }

    @Override // c2.b
    public final x j() {
        return this.E.f7813a.f1422w.f7655b;
    }

    @Override // a2.a1
    public final void j0(long j10, float f10, Function1 function1) {
        a2.z0 placementScope;
        this.f7791s = true;
        boolean a10 = w2.h.a(j10, this.f7785m);
        q0 q0Var = this.E;
        if (!a10) {
            if (q0Var.f7825m || q0Var.f7824l) {
                q0Var.f7817e = true;
            }
            B0();
        }
        boolean z10 = false;
        if (g.v(q0Var.f7813a)) {
            i1 i1Var = q0Var.a().f7723m;
            androidx.compose.ui.node.a aVar = q0Var.f7813a;
            if (i1Var == null || (placementScope = i1Var.f7853h) == null) {
                placementScope = ((d2.a0) k0.a(aVar)).getPlacementScope();
            }
            m0 m0Var = q0Var.f7828p;
            Intrinsics.c(m0Var);
            androidx.compose.ui.node.a q10 = aVar.q();
            if (q10 != null) {
                q10.f1423x.f7822j = 0;
            }
            m0Var.f7760h = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            a2.z0.d(placementScope, m0Var, (int) (j10 >> 32), (int) (4294967295L & j10));
        }
        m0 m0Var2 = q0Var.f7828p;
        if (m0Var2 != null && !m0Var2.f7763k) {
            z10 = true;
        }
        if (true ^ z10) {
            F0(j10, f10, function1);
        } else {
            t0.t.C0("Error: Placement happened before lookahead.");
            throw null;
        }
    }

    @Override // c2.b
    public final b l() {
        q0 q0Var;
        androidx.compose.ui.node.a q10 = this.E.f7813a.q();
        if (q10 != null && (q0Var = q10.f1423x) != null) {
            return q0Var.f7827o;
        }
        return null;
    }

    @Override // c2.b
    public final void requestLayout() {
        this.E.f7813a.R(false);
    }

    public final List u0() {
        q0 q0Var = this.E;
        q0Var.f7813a.b0();
        boolean z10 = this.f7794v;
        v0.h hVar = this.f7793u;
        if (!z10) {
            return hVar.e();
        }
        androidx.compose.ui.node.a aVar = q0Var.f7813a;
        v0.h u10 = aVar.u();
        int i10 = u10.f37655c;
        if (i10 > 0) {
            Object[] objArr = u10.f37653a;
            int i11 = 0;
            do {
                androidx.compose.ui.node.a aVar2 = (androidx.compose.ui.node.a) objArr[i11];
                if (hVar.f37655c <= i11) {
                    hVar.b(aVar2.f1423x.f7827o);
                } else {
                    hVar.p(i11, aVar2.f1423x.f7827o);
                }
                i11++;
            } while (i11 < i10);
        }
        hVar.o(aVar.m().size(), hVar.f37655c);
        this.f7794v = false;
        return hVar.e();
    }

    public final void w0() {
        boolean z10 = this.f7790r;
        this.f7790r = true;
        androidx.compose.ui.node.a aVar = this.E.f7813a;
        if (!z10) {
            q0 q0Var = aVar.f1423x;
            if (q0Var.f7816d) {
                androidx.compose.ui.node.a.S(aVar, true, 2);
            } else if (q0Var.f7819g) {
                androidx.compose.ui.node.a.Q(aVar, true, 2);
            }
        }
        b1 b1Var = aVar.f1422w;
        i1 i1Var = b1Var.f7655b.f7722l;
        for (i1 i1Var2 = b1Var.f7656c; !Intrinsics.a(i1Var2, i1Var) && i1Var2 != null; i1Var2 = i1Var2.f7722l) {
            if (i1Var2.B) {
                i1Var2.b1();
            }
        }
        v0.h u10 = aVar.u();
        int i10 = u10.f37655c;
        if (i10 > 0) {
            Object[] objArr = u10.f37653a;
            int i11 = 0;
            do {
                androidx.compose.ui.node.a aVar2 = (androidx.compose.ui.node.a) objArr[i11];
                if (aVar2.s() != Integer.MAX_VALUE) {
                    aVar2.f1423x.f7827o.w0();
                    androidx.compose.ui.node.a.T(aVar2);
                }
                i11++;
            } while (i11 < i10);
        }
    }

    @Override // a2.q
    public final int z(int i10) {
        C0();
        return this.E.a().z(i10);
    }
}
