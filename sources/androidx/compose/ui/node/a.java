package androidx.compose.ui.node;

import a2.c1;
import a2.i0;
import a2.m0;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import c2.b0;
import c2.b1;
import c2.d0;
import c2.e0;
import c2.f0;
import c2.g0;
import c2.h0;
import c2.i1;
import c2.k0;
import c2.n0;
import c2.p1;
import c2.q0;
import c2.q1;
import c2.r;
import c2.r0;
import c2.r1;
import c2.s1;
import c2.t1;
import c2.v;
import c2.w1;
import c2.x;
import c2.y0;
import c2.z;
import c2.z0;
import com.google.android.gms.common.api.Api;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import d2.a0;
import d2.j3;
import g1.m;
import g1.n;
import g1.o;
import h2.j;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l1.c;
import l1.e;
import n1.u0;
import s0.g;
import t0.c0;
import t0.l;
import t0.s;
import t0.t;
import v0.h;
import y2.k;

/* loaded from: classes.dex */
public final class a implements l, c1, s1, c2.l, q1 {
    public static final f0 I = new g0("Undefined intrinsics block and it is required");
    public static final e0 J = new Object();
    public static final s X = new s(1);
    public boolean A;
    public o B;
    public Function1 C;
    public Function1 D;
    public boolean E;
    public boolean F;
    public int G;
    public int H;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f1400a;

    /* renamed from: b, reason: collision with root package name */
    public int f1401b;

    /* renamed from: c, reason: collision with root package name */
    public a f1402c;

    /* renamed from: d, reason: collision with root package name */
    public int f1403d;

    /* renamed from: e, reason: collision with root package name */
    public final z0 f1404e;

    /* renamed from: f, reason: collision with root package name */
    public h f1405f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1406g;

    /* renamed from: h, reason: collision with root package name */
    public a f1407h;

    /* renamed from: i, reason: collision with root package name */
    public r1 f1408i;

    /* renamed from: j, reason: collision with root package name */
    public k f1409j;

    /* renamed from: k, reason: collision with root package name */
    public int f1410k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f1411l;

    /* renamed from: m, reason: collision with root package name */
    public j f1412m;

    /* renamed from: n, reason: collision with root package name */
    public final h f1413n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f1414o;

    /* renamed from: p, reason: collision with root package name */
    public m0 f1415p;

    /* renamed from: q, reason: collision with root package name */
    public final z f1416q;

    /* renamed from: r, reason: collision with root package name */
    public w2.b f1417r;

    /* renamed from: s, reason: collision with root package name */
    public w2.k f1418s;

    /* renamed from: t, reason: collision with root package name */
    public j3 f1419t;

    /* renamed from: u, reason: collision with root package name */
    public c0 f1420u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f1421v;

    /* renamed from: w, reason: collision with root package name */
    public final b1 f1422w;

    /* renamed from: x, reason: collision with root package name */
    public final q0 f1423x;

    /* renamed from: y, reason: collision with root package name */
    public i0 f1424y;

    /* renamed from: z, reason: collision with root package name */
    public i1 f1425z;

    public a(int i10, boolean z10, int i11) {
        this((i10 & 2) != 0 ? h2.l.f17853a.addAndGet(1) : 0, (i10 & 1) != 0 ? false : z10);
    }

    public static boolean L(a aVar) {
        w2.a aVar2;
        n0 n0Var = aVar.f1423x.f7827o;
        if (n0Var.f7781i) {
            aVar2 = new w2.a(n0Var.f32d);
        } else {
            aVar2 = null;
        }
        return aVar.K(aVar2);
    }

    public static void Q(a aVar, boolean z10, int i10) {
        boolean z11;
        a q10;
        boolean z12 = false;
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        if ((i10 & 2) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (aVar.f1402c != null) {
            z12 = true;
        }
        if (z12) {
            r1 r1Var = aVar.f1408i;
            if (r1Var != null && !aVar.f1411l && !aVar.f1400a) {
                ((a0) r1Var).z(aVar, true, z10, z11);
                c2.m0 m0Var = aVar.f1423x.f7828p;
                Intrinsics.c(m0Var);
                q0 q0Var = m0Var.f7776x;
                a q11 = q0Var.f7813a.q();
                int i11 = q0Var.f7813a.G;
                if (q11 != null && i11 != 3) {
                    while (q11.G == i11 && (q10 = q11.q()) != null) {
                        q11 = q10;
                    }
                    int e10 = w.k.e(i11);
                    if (e10 != 0) {
                        if (e10 == 1) {
                            if (q11.f1402c != null) {
                                q11.P(z10);
                                return;
                            } else {
                                q11.R(z10);
                                return;
                            }
                        }
                        throw new IllegalStateException("Intrinsics isn't used by the parent".toString());
                    }
                    if (q11.f1402c != null) {
                        Q(q11, z10, 2);
                        return;
                    } else {
                        S(q11, z10, 2);
                        return;
                    }
                }
                return;
            }
            return;
        }
        t.C0("Lookahead measure cannot be requested on a node that is not a part of theLookaheadScope");
        throw null;
    }

    public static void S(a aVar, boolean z10, int i10) {
        boolean z11;
        r1 r1Var;
        a q10;
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        if ((i10 & 2) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!aVar.f1411l && !aVar.f1400a && (r1Var = aVar.f1408i) != null) {
            ((a0) r1Var).z(aVar, false, z10, z11);
            q0 q0Var = aVar.f1423x.f7827o.E;
            a q11 = q0Var.f7813a.q();
            int i11 = q0Var.f7813a.G;
            if (q11 != null && i11 != 3) {
                while (q11.G == i11 && (q10 = q11.q()) != null) {
                    q11 = q10;
                }
                int e10 = w.k.e(i11);
                if (e10 != 0) {
                    if (e10 == 1) {
                        q11.R(z10);
                        return;
                    }
                    throw new IllegalStateException("Intrinsics isn't used by the parent".toString());
                }
                S(q11, z10, 2);
            }
        }
    }

    public static void T(a aVar) {
        int i10 = h0.f7713a[w.k.e(aVar.f1423x.f7815c)];
        q0 q0Var = aVar.f1423x;
        if (i10 == 1) {
            if (q0Var.f7819g) {
                Q(aVar, true, 2);
                return;
            }
            if (q0Var.f7820h) {
                aVar.P(true);
            }
            if (q0Var.f7816d) {
                S(aVar, true, 2);
                return;
            } else {
                if (q0Var.f7817e) {
                    aVar.R(true);
                    return;
                }
                return;
            }
        }
        throw new IllegalStateException("Unexpected state ".concat(a3.a.D(q0Var.f7815c)));
    }

    public final void A() {
        this.f1412m = null;
        ((a0) k0.a(this)).A();
    }

    public final void B() {
        a aVar;
        if (this.f1403d > 0) {
            this.f1406g = true;
        }
        if (this.f1400a && (aVar = this.f1407h) != null) {
            aVar.B();
        }
    }

    public final boolean C() {
        return this.f1408i != null;
    }

    public final boolean D() {
        return this.f1423x.f7827o.f7790r;
    }

    public final Boolean E() {
        c2.m0 m0Var = this.f1423x.f7828p;
        if (m0Var != null) {
            return Boolean.valueOf(m0Var.f7768p);
        }
        return null;
    }

    public final void F() {
        a q10;
        if (this.G == 3) {
            e();
        }
        c2.m0 m0Var = this.f1423x.f7828p;
        Intrinsics.c(m0Var);
        try {
            m0Var.f7758f = true;
            if (m0Var.f7763k) {
                m0Var.f7775w = false;
                boolean z10 = m0Var.f7768p;
                m0Var.j0(m0Var.f7766n, g.f34069a, null);
                if (z10 && !m0Var.f7775w && (q10 = m0Var.f7776x.f7813a.q()) != null) {
                    q10.P(false);
                }
                return;
            }
            t.C0("replace() called on item that was not placed");
            throw null;
        } finally {
            m0Var.f7758f = false;
        }
    }

    public final void G(int i10, int i11, int i12) {
        int i13;
        if (i10 == i11) {
            return;
        }
        for (int i14 = 0; i14 < i12; i14++) {
            if (i10 > i11) {
                i13 = i10 + i14;
            } else {
                i13 = i10;
            }
            int i15 = i10 > i11 ? i11 + i14 : (i11 + i12) - 2;
            z0 z0Var = this.f1404e;
            Object n10 = z0Var.f7887a.n(i13);
            Function0 function0 = z0Var.f7888b;
            function0.mo2invoke();
            z0Var.f7887a.a(i15, (a) n10);
            function0.mo2invoke();
        }
        J();
        B();
        z();
    }

    public final void H(a aVar) {
        if (aVar.f1423x.f7826n > 0) {
            this.f1423x.b(r0.f7826n - 1);
        }
        if (this.f1408i != null) {
            aVar.g();
        }
        aVar.f1407h = null;
        aVar.f1422w.f7656c.f7723m = null;
        if (aVar.f1400a) {
            this.f1403d--;
            h hVar = aVar.f1404e.f7887a;
            int i10 = hVar.f37655c;
            if (i10 > 0) {
                Object[] objArr = hVar.f37653a;
                int i11 = 0;
                do {
                    ((a) objArr[i11]).f1422w.f7656c.f7723m = null;
                    i11++;
                } while (i11 < i10);
            }
        }
        B();
        J();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v2, types: [g1.n] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [g1.n] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
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
    public final void I() {
        n nVar;
        b1 b1Var = this.f1422w;
        x xVar = b1Var.f7655b;
        boolean r10 = c2.g.r(128);
        if (r10) {
            nVar = xVar.I;
        } else {
            nVar = xVar.I.f16409e;
            if (nVar == null) {
                return;
            }
        }
        u0 u0Var = i1.D;
        for (n Y0 = xVar.Y0(r10); Y0 != null && (Y0.f16408d & 128) != 0; Y0 = Y0.f16410f) {
            if ((Y0.f16407c & 128) != 0) {
                c2.o oVar = Y0;
                ?? r62 = 0;
                while (oVar != 0) {
                    if (oVar instanceof b0) {
                        ((b0) oVar).g0(b1Var.f7655b);
                    } else if ((oVar.f16407c & 128) != 0 && (oVar instanceof c2.o)) {
                        n nVar2 = oVar.f7801o;
                        int i10 = 0;
                        oVar = oVar;
                        r62 = r62;
                        while (nVar2 != null) {
                            if ((nVar2.f16407c & 128) != 0) {
                                i10++;
                                r62 = r62;
                                if (i10 == 1) {
                                    oVar = nVar2;
                                } else {
                                    if (r62 == 0) {
                                        r62 = new h(new n[16]);
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
                    oVar = c2.g.f(r62);
                }
            }
            if (Y0 == nVar) {
                return;
            }
        }
    }

    public final void J() {
        if (this.f1400a) {
            a q10 = q();
            if (q10 != null) {
                q10.J();
                return;
            }
            return;
        }
        this.f1414o = true;
    }

    public final boolean K(w2.a aVar) {
        if (aVar != null) {
            if (this.G == 3) {
                d();
            }
            return this.f1423x.f7827o.G0(aVar.f38776a);
        }
        return false;
    }

    public final void M() {
        z0 z0Var = this.f1404e;
        int i10 = z0Var.f7887a.f37655c;
        while (true) {
            i10--;
            if (-1 < i10) {
                H((a) z0Var.f7887a.f37653a[i10]);
            } else {
                z0Var.f7887a.g();
                z0Var.f7888b.mo2invoke();
                return;
            }
        }
    }

    public final void N(int i10, int i11) {
        if (i11 >= 0) {
            int i12 = (i11 + i10) - 1;
            if (i10 > i12) {
                return;
            }
            while (true) {
                z0 z0Var = this.f1404e;
                Object n10 = z0Var.f7887a.n(i12);
                z0Var.f7888b.mo2invoke();
                H((a) n10);
                if (i12 != i10) {
                    i12--;
                } else {
                    return;
                }
            }
        } else {
            t.A0("count (" + i11 + ") must be greater than 0");
            throw null;
        }
    }

    public final void O() {
        a q10;
        if (this.G == 3) {
            e();
        }
        n0 n0Var = this.f1423x.f7827o;
        n0Var.getClass();
        try {
            n0Var.f7778f = true;
            if (n0Var.f7782j) {
                boolean z10 = n0Var.f7790r;
                n0Var.F0(n0Var.f7785m, n0Var.f7787o, n0Var.f7786n);
                if (z10 && !n0Var.f7798z && (q10 = n0Var.E.f7813a.q()) != null) {
                    q10.R(false);
                }
                return;
            }
            t.C0("replace called on unplaced item");
            throw null;
        } finally {
            n0Var.f7778f = false;
        }
    }

    public final void P(boolean z10) {
        r1 r1Var;
        if (!this.f1400a && (r1Var = this.f1408i) != null) {
            a0 a0Var = (a0) r1Var;
            if (a0Var.F.n(this, z10)) {
                a0Var.C(null);
            }
        }
    }

    public final void R(boolean z10) {
        r1 r1Var;
        if (!this.f1400a && (r1Var = this.f1408i) != null) {
            a0 a0Var = (a0) r1Var;
            if (a0Var.F.p(this, z10)) {
                a0Var.C(null);
            }
        }
    }

    public final void U() {
        int i10;
        b1 b1Var = this.f1422w;
        for (n nVar = b1Var.f7657d; nVar != null; nVar = nVar.f16409e) {
            if (nVar.f16417m) {
                nVar.L0();
            }
        }
        h hVar = b1Var.f7659f;
        if (hVar != null && (i10 = hVar.f37655c) > 0) {
            Object[] objArr = hVar.f37653a;
            int i11 = 0;
            do {
                m mVar = (m) objArr[i11];
                if (mVar instanceof SuspendPointerInputElement) {
                    hVar.p(i11, new ForceUpdateElement((y0) mVar));
                }
                i11++;
            } while (i11 < i10);
        }
        n nVar2 = b1Var.f7657d;
        for (n nVar3 = nVar2; nVar3 != null; nVar3 = nVar3.f16409e) {
            if (nVar3.f16417m) {
                nVar3.N0();
            }
        }
        while (nVar2 != null) {
            if (nVar2.f16417m) {
                nVar2.H0();
            }
            nVar2 = nVar2.f16409e;
        }
    }

    public final void V() {
        h u10 = u();
        int i10 = u10.f37655c;
        if (i10 > 0) {
            Object[] objArr = u10.f37653a;
            int i11 = 0;
            do {
                a aVar = (a) objArr[i11];
                int i12 = aVar.H;
                aVar.G = i12;
                if (i12 != 3) {
                    aVar.V();
                }
                i11++;
            } while (i11 < i10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [g1.n] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [g1.n] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [v0.h] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [v0.h] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    public final void W(w2.b bVar) {
        if (!Intrinsics.a(this.f1417r, bVar)) {
            this.f1417r = bVar;
            z();
            a q10 = q();
            if (q10 != null) {
                q10.x();
            }
            y();
            n nVar = this.f1422w.f7658e;
            if ((nVar.f16408d & 16) != 0) {
                while (nVar != null) {
                    if ((nVar.f16407c & 16) != 0) {
                        c2.o oVar = nVar;
                        ?? r32 = 0;
                        while (oVar != 0) {
                            if (oVar instanceof w1) {
                                ((w1) oVar).W();
                            } else if ((oVar.f16407c & 16) != 0 && (oVar instanceof c2.o)) {
                                n nVar2 = oVar.f7801o;
                                int i10 = 0;
                                oVar = oVar;
                                r32 = r32;
                                while (nVar2 != null) {
                                    if ((nVar2.f16407c & 16) != 0) {
                                        i10++;
                                        r32 = r32;
                                        if (i10 == 1) {
                                            oVar = nVar2;
                                        } else {
                                            if (r32 == 0) {
                                                r32 = new h(new n[16]);
                                            }
                                            if (oVar != 0) {
                                                r32.b(oVar);
                                                oVar = 0;
                                            }
                                            r32.b(nVar2);
                                        }
                                    }
                                    nVar2 = nVar2.f16410f;
                                    oVar = oVar;
                                    r32 = r32;
                                }
                                if (i10 == 1) {
                                }
                            }
                            oVar = c2.g.f(r32);
                        }
                    }
                    if ((nVar.f16408d & 16) != 0) {
                        nVar = nVar.f16410f;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public final void X(a aVar) {
        if (!Intrinsics.a(aVar, this.f1402c)) {
            this.f1402c = aVar;
            if (aVar != null) {
                q0 q0Var = this.f1423x;
                if (q0Var.f7828p == null) {
                    q0Var.f7828p = new c2.m0(q0Var);
                }
                b1 b1Var = this.f1422w;
                i1 i1Var = b1Var.f7655b.f7722l;
                for (i1 i1Var2 = b1Var.f7656c; !Intrinsics.a(i1Var2, i1Var) && i1Var2 != null; i1Var2 = i1Var2.f7722l) {
                    i1Var2.R0();
                }
            }
            z();
        }
    }

    public final void Y(m0 m0Var) {
        if (!Intrinsics.a(this.f1415p, m0Var)) {
            this.f1415p = m0Var;
            this.f1416q.f7886b.setValue(m0Var);
            z();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:70:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x014f  */
    /* JADX WARN: Type inference failed for: r2v5, types: [g1.n] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void Z(g1.o r15) {
        /*
            Method dump skipped, instructions count: 409
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.a.Z(g1.o):void");
    }

    @Override // t0.l
    public final void a() {
        k kVar = this.f1409j;
        if (kVar != null) {
            kVar.a();
        }
        i0 i0Var = this.f1424y;
        if (i0Var != null) {
            i0Var.a();
        }
        b1 b1Var = this.f1422w;
        i1 i1Var = b1Var.f7655b.f7722l;
        for (i1 i1Var2 = b1Var.f7656c; !Intrinsics.a(i1Var2, i1Var) && i1Var2 != null; i1Var2 = i1Var2.f7722l) {
            i1Var2.f7724n = true;
            i1Var2.A.mo2invoke();
            if (i1Var2.C != null) {
                i1Var2.p1(null, false);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [g1.n] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [g1.n] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [v0.h] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [v0.h] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    public final void a0(j3 j3Var) {
        if (!Intrinsics.a(this.f1419t, j3Var)) {
            this.f1419t = j3Var;
            n nVar = this.f1422w.f7658e;
            if ((nVar.f16408d & 16) != 0) {
                while (nVar != null) {
                    if ((nVar.f16407c & 16) != 0) {
                        c2.o oVar = nVar;
                        ?? r32 = 0;
                        while (oVar != 0) {
                            if (oVar instanceof w1) {
                                ((w1) oVar).w0();
                            } else if ((oVar.f16407c & 16) != 0 && (oVar instanceof c2.o)) {
                                n nVar2 = oVar.f7801o;
                                int i10 = 0;
                                oVar = oVar;
                                r32 = r32;
                                while (nVar2 != null) {
                                    if ((nVar2.f16407c & 16) != 0) {
                                        i10++;
                                        r32 = r32;
                                        if (i10 == 1) {
                                            oVar = nVar2;
                                        } else {
                                            if (r32 == 0) {
                                                r32 = new h(new n[16]);
                                            }
                                            if (oVar != 0) {
                                                r32.b(oVar);
                                                oVar = 0;
                                            }
                                            r32.b(nVar2);
                                        }
                                    }
                                    nVar2 = nVar2.f16410f;
                                    oVar = oVar;
                                    r32 = r32;
                                }
                                if (i10 == 1) {
                                }
                            }
                            oVar = c2.g.f(r32);
                        }
                    }
                    if ((nVar.f16408d & 16) != 0) {
                        nVar = nVar.f16410f;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    @Override // t0.l
    public final void b() {
        k kVar = this.f1409j;
        if (kVar != null) {
            kVar.b();
        }
        i0 i0Var = this.f1424y;
        if (i0Var != null) {
            i0Var.e(true);
        }
        this.F = true;
        U();
        if (C()) {
            A();
        }
    }

    public final void b0() {
        if (this.f1403d > 0 && this.f1406g) {
            int i10 = 0;
            this.f1406g = false;
            h hVar = this.f1405f;
            if (hVar == null) {
                hVar = new h(new a[16]);
                this.f1405f = hVar;
            }
            hVar.g();
            h hVar2 = this.f1404e.f7887a;
            int i11 = hVar2.f37655c;
            if (i11 > 0) {
                Object[] objArr = hVar2.f37653a;
                do {
                    a aVar = (a) objArr[i10];
                    if (aVar.f1400a) {
                        hVar.c(hVar.f37655c, aVar.u());
                    } else {
                        hVar.b(aVar);
                    }
                    i10++;
                } while (i10 < i11);
            }
            q0 q0Var = this.f1423x;
            q0Var.f7827o.f7794v = true;
            c2.m0 m0Var = q0Var.f7828p;
            if (m0Var != null) {
                m0Var.f7771s = true;
            }
        }
    }

    public final void c(r1 r1Var) {
        boolean z10;
        int i10;
        a aVar;
        boolean z11;
        boolean z12;
        boolean z13;
        r1 r1Var2;
        String str;
        if (this.f1408i == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        x xVar = null;
        if (z10) {
            a aVar2 = this.f1407h;
            if (aVar2 != null && !Intrinsics.a(aVar2.f1408i, r1Var)) {
                StringBuilder sb2 = new StringBuilder("Attaching to a different owner(");
                sb2.append(r1Var);
                sb2.append(") than the parent's owner(");
                a q10 = q();
                if (q10 != null) {
                    r1Var2 = q10.f1408i;
                } else {
                    r1Var2 = null;
                }
                sb2.append(r1Var2);
                sb2.append("). This tree: ");
                sb2.append(f(0));
                sb2.append(" Parent tree: ");
                a aVar3 = this.f1407h;
                if (aVar3 != null) {
                    str = aVar3.f(0);
                } else {
                    str = null;
                }
                sb2.append(str);
                t.C0(sb2.toString());
                throw null;
            }
            a q11 = q();
            q0 q0Var = this.f1423x;
            if (q11 == null) {
                q0Var.f7827o.f7790r = true;
                c2.m0 m0Var = q0Var.f7828p;
                if (m0Var != null) {
                    m0Var.f7768p = true;
                }
            }
            b1 b1Var = this.f1422w;
            i1 i1Var = b1Var.f7656c;
            if (q11 != null) {
                xVar = q11.f1422w.f7655b;
            }
            i1Var.f7723m = xVar;
            this.f1408i = r1Var;
            if (q11 != null) {
                i10 = q11.f1410k;
            } else {
                i10 = -1;
            }
            this.f1410k = i10 + 1;
            if (b1Var.d(8)) {
                A();
            }
            r1Var.getClass();
            a aVar4 = this.f1407h;
            if (aVar4 == null || (aVar = aVar4.f1402c) == null) {
                aVar = this.f1402c;
            }
            X(aVar);
            if (!this.F) {
                for (n nVar = b1Var.f7658e; nVar != null; nVar = nVar.f16410f) {
                    nVar.G0();
                }
            }
            h hVar = this.f1404e.f7887a;
            int i11 = hVar.f37655c;
            if (i11 > 0) {
                Object[] objArr = hVar.f37653a;
                int i12 = 0;
                do {
                    ((a) objArr[i12]).c(r1Var);
                    i12++;
                } while (i12 < i11);
            }
            if (!this.F) {
                b1Var.e();
            }
            z();
            if (q11 != null) {
                q11.z();
            }
            i1 i1Var2 = b1Var.f7655b.f7722l;
            for (i1 i1Var3 = b1Var.f7656c; !Intrinsics.a(i1Var3, i1Var2) && i1Var3 != null; i1Var3 = i1Var3.f7722l) {
                i1Var3.p1(i1Var3.f7726p, true);
                p1 p1Var = i1Var3.C;
                if (p1Var != null) {
                    p1Var.invalidate();
                }
            }
            Function1 function1 = this.C;
            if (function1 != null) {
                function1.invoke(r1Var);
            }
            q0Var.e();
            if (!this.F) {
                n nVar2 = b1Var.f7658e;
                if ((nVar2.f16408d & 7168) != 0) {
                    while (nVar2 != null) {
                        int i13 = nVar2.f16407c;
                        if ((i13 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if ((i13 & 2048) != 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        boolean z14 = z11 | z12;
                        if ((i13 & 4096) != 0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (z13 | z14) {
                            c2.g.h(nVar2);
                        }
                        nVar2 = nVar2.f16410f;
                    }
                    return;
                }
                return;
            }
            return;
        }
        t.C0("Cannot attach " + this + " as it already is attached.  Tree: " + f(0));
        throw null;
    }

    public final void d() {
        this.H = this.G;
        this.G = 3;
        h u10 = u();
        int i10 = u10.f37655c;
        if (i10 > 0) {
            Object[] objArr = u10.f37653a;
            int i11 = 0;
            do {
                a aVar = (a) objArr[i11];
                if (aVar.G != 3) {
                    aVar.d();
                }
                i11++;
            } while (i11 < i10);
        }
    }

    public final void e() {
        this.H = this.G;
        this.G = 3;
        h u10 = u();
        int i10 = u10.f37655c;
        if (i10 > 0) {
            Object[] objArr = u10.f37653a;
            int i11 = 0;
            do {
                a aVar = (a) objArr[i11];
                if (aVar.G == 2) {
                    aVar.e();
                }
                i11++;
            } while (i11 < i10);
        }
    }

    public final String f(int i10) {
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < i10; i11++) {
            sb2.append("  ");
        }
        sb2.append("|-");
        sb2.append(toString());
        sb2.append('\n');
        h u10 = u();
        int i12 = u10.f37655c;
        if (i12 > 0) {
            Object[] objArr = u10.f37653a;
            int i13 = 0;
            do {
                sb2.append(((a) objArr[i13]).f(i10 + 1));
                i13++;
            } while (i13 < i12);
        }
        String sb3 = sb2.toString();
        if (i10 == 0) {
            String substring = sb3.substring(0, sb3.length() - 1);
            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }
        return sb3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v12, types: [g1.n] */
    /* JADX WARN: Type inference failed for: r12v21 */
    public final void g() {
        r0 r0Var;
        b1 b1Var;
        n nVar;
        String str;
        r1 r1Var = this.f1408i;
        h hVar = null;
        if (r1Var == null) {
            StringBuilder sb2 = new StringBuilder("Cannot detach node that is already detached!  Tree: ");
            a q10 = q();
            if (q10 != null) {
                str = q10.f(0);
            } else {
                str = null;
            }
            sb2.append(str);
            t.D0(sb2.toString());
            throw null;
        }
        b1 b1Var2 = this.f1422w;
        int i10 = b1Var2.f7658e.f16408d & UserMetadata.MAX_ATTRIBUTE_SIZE;
        n nVar2 = b1Var2.f7657d;
        if (i10 != 0) {
            n nVar3 = nVar2;
            while (nVar3 != null) {
                if ((nVar3.f16407c & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                    h hVar2 = hVar;
                    n nVar4 = nVar3;
                    while (nVar4 != null) {
                        if (nVar4 instanceof l1.t) {
                            l1.t tVar = (l1.t) nVar4;
                            if (tVar.R0().a()) {
                                ((androidx.compose.ui.focus.b) ((a0) k0.a(this)).getFocusOwner()).a(true, false, true);
                                n nVar5 = tVar.f16405a;
                                if (nVar5.f16417m) {
                                    a y10 = c2.g.y(tVar);
                                    while (y10 != null) {
                                        if ((y10.f1422w.f7658e.f16408d & 5120) != 0) {
                                            while (nVar5 != null) {
                                                int i11 = nVar5.f16407c;
                                                if ((i11 & 5120) != 0 && (i11 & UserMetadata.MAX_ATTRIBUTE_SIZE) == 0 && nVar5.f16417m) {
                                                    h hVar3 = hVar;
                                                    c2.o oVar = nVar5;
                                                    while (oVar != 0) {
                                                        if (oVar instanceof c) {
                                                            c cVar = (c) oVar;
                                                            e eVar = ((androidx.compose.ui.focus.b) ((a0) c2.g.z(cVar)).getFocusOwner()).f1364e;
                                                            eVar.b(eVar.f23889d, cVar);
                                                        } else if ((oVar.f16407c & 4096) != 0 && (oVar instanceof c2.o)) {
                                                            n nVar6 = oVar.f7801o;
                                                            int i12 = 0;
                                                            nVar = oVar;
                                                            hVar3 = hVar3;
                                                            while (nVar6 != null) {
                                                                if ((nVar6.f16407c & 4096) != 0) {
                                                                    i12++;
                                                                    hVar3 = hVar3;
                                                                    if (i12 == 1) {
                                                                        nVar = nVar6;
                                                                    } else {
                                                                        if (hVar3 == null) {
                                                                            hVar3 = new h(new n[16]);
                                                                        }
                                                                        if (nVar != null) {
                                                                            hVar3.b(nVar);
                                                                            nVar = null;
                                                                        }
                                                                        hVar3.b(nVar6);
                                                                    }
                                                                }
                                                                nVar6 = nVar6.f16410f;
                                                                nVar = nVar;
                                                                hVar3 = hVar3;
                                                            }
                                                            if (i12 == 1) {
                                                                oVar = nVar;
                                                                hVar3 = hVar3;
                                                            }
                                                        }
                                                        nVar = c2.g.f(hVar3);
                                                        oVar = nVar;
                                                        hVar3 = hVar3;
                                                    }
                                                }
                                                nVar5 = nVar5.f16409e;
                                                hVar = null;
                                            }
                                        }
                                        y10 = y10.q();
                                        if (y10 != null && (b1Var = y10.f1422w) != null) {
                                            nVar5 = b1Var.f7657d;
                                        } else {
                                            nVar5 = null;
                                        }
                                        hVar = null;
                                    }
                                } else {
                                    throw new IllegalStateException("visitAncestors called on an unattached node".toString());
                                }
                            }
                        } else if ((nVar4.f16407c & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 && (nVar4 instanceof c2.o)) {
                            int i13 = 0;
                            for (n nVar7 = ((c2.o) nVar4).f7801o; nVar7 != null; nVar7 = nVar7.f16410f) {
                                if ((nVar7.f16407c & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                                    i13++;
                                    if (i13 == 1) {
                                        nVar4 = nVar7;
                                    } else {
                                        if (hVar2 == null) {
                                            hVar2 = new h(new n[16]);
                                        }
                                        if (nVar4 != null) {
                                            hVar2.b(nVar4);
                                            nVar4 = null;
                                        }
                                        hVar2.b(nVar7);
                                    }
                                }
                            }
                            if (i13 == 1) {
                                hVar = null;
                            }
                        }
                        nVar4 = c2.g.f(hVar2);
                        hVar = null;
                    }
                }
                nVar3 = nVar3.f16409e;
                hVar = null;
            }
        }
        a q11 = q();
        q0 q0Var = this.f1423x;
        if (q11 != null) {
            q11.x();
            q11.z();
            q0Var.f7827o.f7783k = 3;
            c2.m0 m0Var = q0Var.f7828p;
            if (m0Var != null) {
                m0Var.f7761i = 3;
            }
        }
        c2.i0 i0Var = q0Var.f7827o.f7792t;
        i0Var.f7630b = true;
        i0Var.f7631c = false;
        i0Var.f7633e = false;
        i0Var.f7632d = false;
        i0Var.f7634f = false;
        i0Var.f7635g = false;
        i0Var.f7636h = null;
        c2.m0 m0Var2 = q0Var.f7828p;
        if (m0Var2 != null && (r0Var = m0Var2.f7769q) != null) {
            r0Var.f7630b = true;
            r0Var.f7631c = false;
            r0Var.f7633e = false;
            r0Var.f7632d = false;
            r0Var.f7634f = false;
            r0Var.f7635g = false;
            r0Var.f7636h = null;
        }
        Function1 function1 = this.D;
        if (function1 != null) {
            function1.invoke(r1Var);
        }
        if (b1Var2.d(8)) {
            A();
        }
        for (n nVar8 = nVar2; nVar8 != null; nVar8 = nVar8.f16409e) {
            if (nVar8.f16417m) {
                nVar8.N0();
            }
        }
        this.f1411l = true;
        h hVar4 = this.f1404e.f7887a;
        int i14 = hVar4.f37655c;
        if (i14 > 0) {
            Object[] objArr = hVar4.f37653a;
            int i15 = 0;
            do {
                ((a) objArr[i15]).g();
                i15++;
            } while (i15 < i14);
        }
        this.f1411l = false;
        while (nVar2 != null) {
            if (nVar2.f16417m) {
                nVar2.H0();
            }
            nVar2 = nVar2.f16409e;
        }
        a0 a0Var = (a0) r1Var;
        r rVar = a0Var.F.f7874b;
        rVar.f7831a.c(this);
        rVar.f7832b.c(this);
        a0Var.f13341x = true;
        this.f1408i = null;
        X(null);
        this.f1410k = 0;
        n0 n0Var = q0Var.f7827o;
        n0Var.f7780h = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        n0Var.f7779g = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        n0Var.f7790r = false;
        c2.m0 m0Var3 = q0Var.f7828p;
        if (m0Var3 != null) {
            m0Var3.f7760h = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            m0Var3.f7759g = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            m0Var3.f7768p = false;
        }
    }

    public final void h(n1.r rVar) {
        this.f1422w.f7656c.O0(rVar);
    }

    @Override // t0.l
    public final void i() {
        if (C()) {
            k kVar = this.f1409j;
            if (kVar != null) {
                kVar.i();
            }
            i0 i0Var = this.f1424y;
            if (i0Var != null) {
                i0Var.e(false);
            }
            if (this.F) {
                this.F = false;
                A();
            } else {
                U();
            }
            this.f1401b = h2.l.f17853a.addAndGet(1);
            b1 b1Var = this.f1422w;
            for (n nVar = b1Var.f7658e; nVar != null; nVar = nVar.f16410f) {
                nVar.G0();
            }
            b1Var.e();
            T(this);
            return;
        }
        t.A0("onReuse is only expected on attached node");
        throw null;
    }

    public final void j() {
        w2.a aVar;
        if (this.f1402c != null) {
            Q(this, false, 1);
        } else {
            S(this, false, 1);
        }
        n0 n0Var = this.f1423x.f7827o;
        if (n0Var.f7781i) {
            aVar = new w2.a(n0Var.f32d);
        } else {
            aVar = null;
        }
        if (aVar != null) {
            r1 r1Var = this.f1408i;
            if (r1Var != null) {
                ((a0) r1Var).v(this, aVar.f38776a);
                return;
            }
            return;
        }
        r1 r1Var2 = this.f1408i;
        if (r1Var2 != null) {
            ((a0) r1Var2).u(true);
        }
    }

    public final List k() {
        c2.m0 m0Var = this.f1423x.f7828p;
        Intrinsics.c(m0Var);
        q0 q0Var = m0Var.f7776x;
        q0Var.f7813a.m();
        boolean z10 = m0Var.f7771s;
        h hVar = m0Var.f7770r;
        if (!z10) {
            return hVar.e();
        }
        a aVar = q0Var.f7813a;
        h u10 = aVar.u();
        int i10 = u10.f37655c;
        if (i10 > 0) {
            Object[] objArr = u10.f37653a;
            int i11 = 0;
            do {
                a aVar2 = (a) objArr[i11];
                if (hVar.f37655c <= i11) {
                    c2.m0 m0Var2 = aVar2.f1423x.f7828p;
                    Intrinsics.c(m0Var2);
                    hVar.b(m0Var2);
                } else {
                    c2.m0 m0Var3 = aVar2.f1423x.f7828p;
                    Intrinsics.c(m0Var3);
                    hVar.p(i11, m0Var3);
                }
                i11++;
            } while (i11 < i10);
        }
        hVar.o(aVar.m().size(), hVar.f37655c);
        m0Var.f7771s = false;
        return hVar.e();
    }

    public final List l() {
        return this.f1423x.f7827o.u0();
    }

    public final List m() {
        return u().e();
    }

    public final j n() {
        if (this.f1422w.d(8) && this.f1412m == null) {
            iu.z zVar = new iu.z();
            zVar.f20560a = new j();
            t1 snapshotObserver = ((a0) k0.a(this)).getSnapshotObserver();
            snapshotObserver.a(this, snapshotObserver.f7843d, new x.y0(this, zVar));
            j jVar = (j) zVar.f20560a;
            this.f1412m = jVar;
            return jVar;
        }
        return this.f1412m;
    }

    public final List o() {
        return this.f1404e.f7887a.e();
    }

    public final int p() {
        int i10;
        c2.m0 m0Var = this.f1423x.f7828p;
        if (m0Var == null || (i10 = m0Var.f7761i) == 0) {
            return 3;
        }
        return i10;
    }

    public final a q() {
        a aVar = this.f1407h;
        while (aVar != null && aVar.f1400a) {
            aVar = aVar.f1407h;
        }
        return aVar;
    }

    @Override // c2.s1
    public final boolean r() {
        return C();
    }

    public final int s() {
        return this.f1423x.f7827o.f7780h;
    }

    public final h t() {
        boolean z10 = this.f1414o;
        h hVar = this.f1413n;
        if (z10) {
            hVar.g();
            hVar.c(hVar.f37655c, u());
            s comparator = X;
            Object[] objArr = hVar.f37653a;
            int i10 = hVar.f37655c;
            Intrinsics.checkNotNullParameter(objArr, "<this>");
            Intrinsics.checkNotNullParameter(comparator, "comparator");
            Arrays.sort(objArr, 0, i10, comparator);
            this.f1414o = false;
        }
        return hVar;
    }

    public final String toString() {
        return t.y0(this) + " children: " + m().size() + " measurePolicy: " + this.f1415p;
    }

    public final h u() {
        b0();
        if (this.f1403d == 0) {
            return this.f1404e.f7887a;
        }
        h hVar = this.f1405f;
        Intrinsics.c(hVar);
        return hVar;
    }

    public final void v(long j10, v vVar, boolean z10, boolean z11) {
        b1 b1Var = this.f1422w;
        b1Var.f7656c.Z0(i1.G, b1Var.f7656c.T0(j10), vVar, z10, z11);
    }

    public final void w(int i10, a aVar) {
        boolean z10;
        String str;
        if (aVar.f1407h == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            StringBuilder sb2 = new StringBuilder("Cannot insert ");
            sb2.append(aVar);
            sb2.append(" because it already has a parent. This tree: ");
            sb2.append(f(0));
            sb2.append(" Other tree: ");
            a aVar2 = aVar.f1407h;
            if (aVar2 != null) {
                str = aVar2.f(0);
            } else {
                str = null;
            }
            sb2.append(str);
            t.C0(sb2.toString());
            throw null;
        }
        if (aVar.f1408i == null) {
            aVar.f1407h = this;
            z0 z0Var = this.f1404e;
            z0Var.f7887a.a(i10, aVar);
            z0Var.f7888b.mo2invoke();
            J();
            if (aVar.f1400a) {
                this.f1403d++;
            }
            B();
            r1 r1Var = this.f1408i;
            if (r1Var != null) {
                aVar.c(r1Var);
            }
            if (aVar.f1423x.f7826n > 0) {
                q0 q0Var = this.f1423x;
                q0Var.b(q0Var.f7826n + 1);
                return;
            }
            return;
        }
        t.C0("Cannot insert " + aVar + " because it already has an owner. This tree: " + f(0) + " Other tree: " + aVar.f(0));
        throw null;
    }

    public final void x() {
        p1 p1Var;
        if (this.A) {
            b1 b1Var = this.f1422w;
            i1 i1Var = b1Var.f7655b;
            i1 i1Var2 = b1Var.f7656c.f7723m;
            this.f1425z = null;
            while (true) {
                if (Intrinsics.a(i1Var, i1Var2)) {
                    break;
                }
                if (i1Var != null) {
                    p1Var = i1Var.C;
                } else {
                    p1Var = null;
                }
                if (p1Var != null) {
                    this.f1425z = i1Var;
                    break;
                } else if (i1Var != null) {
                    i1Var = i1Var.f7723m;
                } else {
                    i1Var = null;
                }
            }
        }
        i1 i1Var3 = this.f1425z;
        if (i1Var3 != null && i1Var3.C == null) {
            t.D0("layer was not set");
            throw null;
        }
        if (i1Var3 != null) {
            i1Var3.b1();
            return;
        }
        a q10 = q();
        if (q10 != null) {
            q10.x();
        }
    }

    public final void y() {
        b1 b1Var = this.f1422w;
        i1 i1Var = b1Var.f7656c;
        x xVar = b1Var.f7655b;
        while (i1Var != xVar) {
            Intrinsics.d(i1Var, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
            d0 d0Var = (d0) i1Var;
            p1 p1Var = d0Var.C;
            if (p1Var != null) {
                p1Var.invalidate();
            }
            i1Var = d0Var.f7722l;
        }
        p1 p1Var2 = b1Var.f7655b.C;
        if (p1Var2 != null) {
            p1Var2.invalidate();
        }
    }

    public final void z() {
        if (this.f1402c != null) {
            Q(this, false, 3);
        } else {
            S(this, false, 3);
        }
    }

    public a(int i10, boolean z10) {
        this.f1400a = z10;
        this.f1401b = i10;
        this.f1404e = new z0(new h(new a[16]), new x.a(this, 28));
        this.f1413n = new h(new a[16]);
        this.f1414o = true;
        this.f1415p = I;
        this.f1416q = new z(this);
        this.f1417r = k0.f7751a;
        this.f1418s = w2.k.f38799a;
        this.f1419t = J;
        c0.f34958a0.getClass();
        this.f1420u = t0.b0.f34947b;
        this.G = 3;
        this.H = 3;
        this.f1422w = new b1(this);
        this.f1423x = new q0(this);
        this.A = true;
        this.B = g1.l.f16404b;
    }
}
