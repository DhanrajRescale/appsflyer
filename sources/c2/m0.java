package c2;

import com.google.android.gms.common.api.Api;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class m0 extends a2.a1 implements a2.l0, b {

    /* renamed from: f, reason: collision with root package name */
    public boolean f7758f;

    /* renamed from: j, reason: collision with root package name */
    public boolean f7762j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f7763k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f7764l;

    /* renamed from: m, reason: collision with root package name */
    public w2.a f7765m;

    /* renamed from: o, reason: collision with root package name */
    public Function1 f7767o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f7768p;

    /* renamed from: t, reason: collision with root package name */
    public boolean f7772t;

    /* renamed from: v, reason: collision with root package name */
    public Object f7774v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f7775w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ q0 f7776x;

    /* renamed from: g, reason: collision with root package name */
    public int f7759g = Api.BaseClientBuilder.API_PRIORITY_OTHER;

    /* renamed from: h, reason: collision with root package name */
    public int f7760h = Api.BaseClientBuilder.API_PRIORITY_OTHER;

    /* renamed from: i, reason: collision with root package name */
    public int f7761i = 3;

    /* renamed from: n, reason: collision with root package name */
    public long f7766n = w2.h.f38791b;

    /* renamed from: q, reason: collision with root package name */
    public final r0 f7769q = new a(this);

    /* renamed from: r, reason: collision with root package name */
    public final v0.h f7770r = new v0.h(new m0[16]);

    /* renamed from: s, reason: collision with root package name */
    public boolean f7771s = true;

    /* renamed from: u, reason: collision with root package name */
    public boolean f7773u = true;

    /* JADX WARN: Type inference failed for: r0v3, types: [c2.r0, c2.a] */
    public m0(q0 q0Var) {
        this.f7776x = q0Var;
        this.f7774v = q0Var.f7827o.f7789q;
    }

    public final void A0() {
        v0.h u10;
        int i10;
        q0 q0Var = this.f7776x;
        if (q0Var.f7826n > 0 && (i10 = (u10 = q0Var.f7813a.u()).f37655c) > 0) {
            Object[] objArr = u10.f37653a;
            int i11 = 0;
            do {
                androidx.compose.ui.node.a aVar = (androidx.compose.ui.node.a) objArr[i11];
                q0 q0Var2 = aVar.f1423x;
                if ((q0Var2.f7824l || q0Var2.f7825m) && !q0Var2.f7817e) {
                    aVar.P(false);
                }
                m0 m0Var = q0Var2.f7828p;
                if (m0Var != null) {
                    m0Var.A0();
                }
                i11++;
            } while (i11 < i10);
        }
    }

    public final void B0() {
        int i10;
        q0 q0Var = this.f7776x;
        androidx.compose.ui.node.a.Q(q0Var.f7813a, false, 3);
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

    public final void C0() {
        q0 q0Var;
        int i10;
        this.f7775w = true;
        androidx.compose.ui.node.a q10 = this.f7776x.f7813a.q();
        if (!this.f7768p) {
            u0();
            if (this.f7758f && q10 != null) {
                q10.P(false);
            }
        }
        if (q10 != null) {
            if (!this.f7758f && ((i10 = (q0Var = q10.f1423x).f7815c) == 3 || i10 == 4)) {
                if (this.f7760h == Integer.MAX_VALUE) {
                    int i11 = q0Var.f7822j;
                    this.f7760h = i11;
                    q0Var.f7822j = i11 + 1;
                } else {
                    t0.t.C0("Place was called on a node which was placed already");
                    throw null;
                }
            }
        } else {
            this.f7760h = 0;
        }
        J();
    }

    @Override // a2.q
    public final int D(int i10) {
        B0();
        v0 U0 = this.f7776x.a().U0();
        Intrinsics.c(U0);
        return ((w) U0).D(i10);
    }

    @Override // a2.l0
    public final a2.a1 E(long j10) {
        androidx.compose.ui.node.a q10;
        q0 q0Var = this.f7776x;
        androidx.compose.ui.node.a q11 = q0Var.f7813a.q();
        int i10 = 2;
        androidx.compose.ui.node.a aVar = q0Var.f7813a;
        if ((q11 != null && q11.f1423x.f7815c == 2) || ((q10 = aVar.q()) != null && q10.f1423x.f7815c == 4)) {
            q0Var.f7814b = false;
        }
        androidx.compose.ui.node.a q12 = aVar.q();
        if (q12 != null) {
            if (this.f7761i != 3 && !aVar.f1421v) {
                t0.t.C0("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
                throw null;
            }
            q0 q0Var2 = q12.f1423x;
            int e10 = w.k.e(q0Var2.f7815c);
            if (e10 != 0 && e10 != 1) {
                if (e10 != 2 && e10 != 3) {
                    throw new IllegalStateException("Measurable could be only measured from the parent's measure or layout block. Parents state is ".concat(a3.a.D(q0Var2.f7815c)));
                }
            } else {
                i10 = 1;
            }
            this.f7761i = i10;
        } else {
            this.f7761i = 3;
        }
        if (aVar.G == 3) {
            aVar.d();
        }
        E0(j10);
        return this;
    }

    public final boolean E0(long j10) {
        boolean z10;
        long k10;
        w2.a aVar;
        q0 q0Var = this.f7776x;
        androidx.compose.ui.node.a aVar2 = q0Var.f7813a;
        if (!aVar2.F) {
            androidx.compose.ui.node.a q10 = aVar2.q();
            androidx.compose.ui.node.a aVar3 = q0Var.f7813a;
            int i10 = 0;
            if (!aVar3.f1421v && (q10 == null || !q10.f1421v)) {
                z10 = false;
            } else {
                z10 = true;
            }
            aVar3.f1421v = z10;
            if (!aVar3.f1423x.f7819g && (aVar = this.f7765m) != null && w2.a.b(aVar.f38776a, j10)) {
                r1 r1Var = aVar3.f1408i;
                if (r1Var != null) {
                    ((d2.a0) r1Var).F.d(aVar3, true);
                }
                aVar3.V();
                return false;
            }
            this.f7765m = new w2.a(j10);
            q0(j10);
            this.f7769q.f7634f = false;
            L(f.f7676e);
            if (this.f7764l) {
                k10 = this.f31c;
            } else {
                k10 = hl.f.k(Integer.MIN_VALUE, Integer.MIN_VALUE);
            }
            this.f7764l = true;
            v0 U0 = q0Var.a().U0();
            if (U0 != null) {
                q0Var.f7815c = 2;
                q0Var.f7819g = false;
                t1 snapshotObserver = ((d2.a0) k0.a(aVar3)).getSnapshotObserver();
                o0 o0Var = new o0(q0Var, i10, j10);
                snapshotObserver.getClass();
                if (aVar3.f1402c != null) {
                    snapshotObserver.a(aVar3, snapshotObserver.f7841b, o0Var);
                } else {
                    snapshotObserver.a(aVar3, snapshotObserver.f7842c, o0Var);
                }
                q0Var.f7820h = true;
                q0Var.f7821i = true;
                if (g.v(aVar3)) {
                    q0Var.f7817e = true;
                    q0Var.f7818f = true;
                } else {
                    q0Var.f7816d = true;
                }
                q0Var.f7815c = 5;
                l0(hl.f.k(U0.f29a, U0.f30b));
                if (((int) (k10 >> 32)) != U0.f29a || ((int) (4294967295L & k10)) != U0.f30b) {
                    return true;
                }
                return false;
            }
            t0.t.C0("Lookahead result from lookaheadRemeasure cannot be null");
            throw null;
        }
        t0.t.A0("measure is called on a deactivated node");
        throw null;
    }

    @Override // c2.b
    public final void J() {
        v0.h u10;
        int i10;
        w2.a aVar;
        this.f7772t = true;
        r0 r0Var = this.f7769q;
        r0Var.i();
        q0 q0Var = this.f7776x;
        boolean z10 = q0Var.f7820h;
        androidx.compose.ui.node.a aVar2 = q0Var.f7813a;
        if (z10 && (i10 = (u10 = aVar2.u()).f37655c) > 0) {
            Object[] objArr = u10.f37653a;
            int i11 = 0;
            do {
                androidx.compose.ui.node.a aVar3 = (androidx.compose.ui.node.a) objArr[i11];
                if (aVar3.f1423x.f7819g && aVar3.p() == 1) {
                    q0 q0Var2 = aVar3.f1423x;
                    m0 m0Var = q0Var2.f7828p;
                    Intrinsics.c(m0Var);
                    m0 m0Var2 = q0Var2.f7828p;
                    if (m0Var2 != null) {
                        aVar = m0Var2.f7765m;
                    } else {
                        aVar = null;
                    }
                    Intrinsics.c(aVar);
                    if (m0Var.E0(aVar.f38776a)) {
                        androidx.compose.ui.node.a.Q(aVar2, false, 3);
                    }
                }
                i11++;
            } while (i11 < i10);
        }
        v0 v0Var = j().J;
        Intrinsics.c(v0Var);
        if (q0Var.f7821i || (!this.f7762j && !v0Var.f7852g && q0Var.f7820h)) {
            q0Var.f7820h = false;
            int i12 = q0Var.f7815c;
            q0Var.f7815c = 4;
            r1 a10 = k0.a(aVar2);
            q0Var.d(false);
            t1 snapshotObserver = ((d2.a0) a10).getSnapshotObserver();
            c0.s sVar = new c0.s(5, this, v0Var, q0Var);
            snapshotObserver.getClass();
            if (aVar2.f1402c != null) {
                snapshotObserver.a(aVar2, snapshotObserver.f7847h, sVar);
            } else {
                snapshotObserver.a(aVar2, snapshotObserver.f7844e, sVar);
            }
            q0Var.f7815c = i12;
            if (q0Var.f7824l && v0Var.f7852g) {
                requestLayout();
            }
            q0Var.f7821i = false;
        }
        if (r0Var.f7632d) {
            r0Var.f7633e = true;
        }
        if (r0Var.f7630b && r0Var.f()) {
            r0Var.h();
        }
        this.f7772t = false;
    }

    @Override // c2.b
    public final boolean K() {
        return this.f7768p;
    }

    @Override // c2.b
    public final void L(Function1 function1) {
        v0.h u10 = this.f7776x.f7813a.u();
        int i10 = u10.f37655c;
        if (i10 > 0) {
            Object[] objArr = u10.f37653a;
            int i11 = 0;
            do {
                m0 m0Var = ((androidx.compose.ui.node.a) objArr[i11]).f1423x.f7828p;
                Intrinsics.c(m0Var);
                function1.invoke(m0Var);
                i11++;
            } while (i11 < i10);
        }
    }

    @Override // c2.b
    public final void V() {
        androidx.compose.ui.node.a.Q(this.f7776x.f7813a, false, 3);
    }

    @Override // a2.q
    public final int W(int i10) {
        B0();
        v0 U0 = this.f7776x.a().U0();
        Intrinsics.c(U0);
        return ((w) U0).W(i10);
    }

    @Override // a2.p0, a2.q
    public final Object a() {
        return this.f7774v;
    }

    @Override // a2.a1
    public final int b0() {
        v0 U0 = this.f7776x.a().U0();
        Intrinsics.c(U0);
        return U0.b0();
    }

    @Override // c2.b
    public final a c() {
        return this.f7769q;
    }

    @Override // a2.a1
    public final int d0() {
        v0 U0 = this.f7776x.a().U0();
        Intrinsics.c(U0);
        return U0.d0();
    }

    @Override // a2.q
    public final int e(int i10) {
        B0();
        v0 U0 = this.f7776x.a().U0();
        Intrinsics.c(U0);
        return ((w) U0).e(i10);
    }

    @Override // a2.p0
    public final int f(a2.a aVar) {
        int i10;
        q0 q0Var = this.f7776x;
        androidx.compose.ui.node.a q10 = q0Var.f7813a.q();
        if (q10 != null) {
            i10 = q10.f1423x.f7815c;
        } else {
            i10 = 0;
        }
        r0 r0Var = this.f7769q;
        if (i10 == 2) {
            r0Var.f7631c = true;
        } else {
            androidx.compose.ui.node.a q11 = q0Var.f7813a.q();
            if (q11 != null && q11.f1423x.f7815c == 4) {
                r0Var.f7632d = true;
            }
        }
        this.f7762j = true;
        v0 U0 = q0Var.a().U0();
        Intrinsics.c(U0);
        int f10 = U0.f(aVar);
        this.f7762j = false;
        return f10;
    }

    @Override // c2.b
    public final x j() {
        return this.f7776x.f7813a.f1422w.f7655b;
    }

    @Override // a2.a1
    public final void j0(long j10, float f10, Function1 function1) {
        q0 q0Var = this.f7776x;
        if (!q0Var.f7813a.F) {
            q0Var.f7815c = 4;
            this.f7763k = true;
            this.f7775w = false;
            if (!w2.h.a(j10, this.f7766n)) {
                if (q0Var.f7825m || q0Var.f7824l) {
                    q0Var.f7820h = true;
                }
                A0();
            }
            androidx.compose.ui.node.a aVar = q0Var.f7813a;
            r1 a10 = k0.a(aVar);
            if (!q0Var.f7820h && this.f7768p) {
                v0 U0 = q0Var.a().U0();
                Intrinsics.c(U0);
                long j11 = U0.f33e;
                U0.L0(hl.f.j(((int) (j10 >> 32)) + ((int) (j11 >> 32)), ((int) (j10 & 4294967295L)) + ((int) (j11 & 4294967295L))));
                C0();
            } else {
                q0Var.c(false);
                this.f7769q.f7635g = false;
                t1 snapshotObserver = ((d2.a0) a10).getSnapshotObserver();
                l0 l0Var = new l0(q0Var, a10, j10);
                snapshotObserver.getClass();
                if (aVar.f1402c != null) {
                    snapshotObserver.a(aVar, snapshotObserver.f7846g, l0Var);
                } else {
                    snapshotObserver.a(aVar, snapshotObserver.f7845f, l0Var);
                }
            }
            this.f7766n = j10;
            this.f7767o = function1;
            q0Var.f7815c = 5;
            return;
        }
        t0.t.A0("place is called on a deactivated node");
        throw null;
    }

    @Override // c2.b
    public final b l() {
        q0 q0Var;
        androidx.compose.ui.node.a q10 = this.f7776x.f7813a.q();
        if (q10 != null && (q0Var = q10.f1423x) != null) {
            return q0Var.f7828p;
        }
        return null;
    }

    @Override // c2.b
    public final void requestLayout() {
        this.f7776x.f7813a.P(false);
    }

    public final void u0() {
        boolean z10 = this.f7768p;
        this.f7768p = true;
        q0 q0Var = this.f7776x;
        if (!z10 && q0Var.f7819g) {
            androidx.compose.ui.node.a.Q(q0Var.f7813a, true, 2);
        }
        v0.h u10 = q0Var.f7813a.u();
        int i10 = u10.f37655c;
        if (i10 > 0) {
            Object[] objArr = u10.f37653a;
            int i11 = 0;
            do {
                androidx.compose.ui.node.a aVar = (androidx.compose.ui.node.a) objArr[i11];
                if (aVar.s() != Integer.MAX_VALUE) {
                    m0 m0Var = aVar.f1423x.f7828p;
                    Intrinsics.c(m0Var);
                    m0Var.u0();
                    androidx.compose.ui.node.a.T(aVar);
                }
                i11++;
            } while (i11 < i10);
        }
    }

    public final void w0() {
        if (this.f7768p) {
            int i10 = 0;
            this.f7768p = false;
            v0.h u10 = this.f7776x.f7813a.u();
            int i11 = u10.f37655c;
            if (i11 > 0) {
                Object[] objArr = u10.f37653a;
                do {
                    m0 m0Var = ((androidx.compose.ui.node.a) objArr[i10]).f1423x.f7828p;
                    Intrinsics.c(m0Var);
                    m0Var.w0();
                    i10++;
                } while (i10 < i11);
            }
        }
    }

    @Override // a2.q
    public final int z(int i10) {
        B0();
        v0 U0 = this.f7776x.a().U0();
        Intrinsics.c(U0);
        return ((w) U0).z(i10);
    }
}
