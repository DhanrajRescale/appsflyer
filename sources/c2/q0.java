package c2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class q0 {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.compose.ui.node.a f7813a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f7814b;

    /* renamed from: d, reason: collision with root package name */
    public boolean f7816d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f7817e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f7818f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f7819g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f7820h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f7821i;

    /* renamed from: j, reason: collision with root package name */
    public int f7822j;

    /* renamed from: k, reason: collision with root package name */
    public int f7823k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f7824l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f7825m;

    /* renamed from: n, reason: collision with root package name */
    public int f7826n;

    /* renamed from: p, reason: collision with root package name */
    public m0 f7828p;

    /* renamed from: c, reason: collision with root package name */
    public int f7815c = 5;

    /* renamed from: o, reason: collision with root package name */
    public final n0 f7827o = new n0(this);

    /* renamed from: q, reason: collision with root package name */
    public long f7829q = hl.f.c(0, 0, 15);

    /* renamed from: r, reason: collision with root package name */
    public final p0 f7830r = new p0(this, 0);

    public q0(androidx.compose.ui.node.a aVar) {
        this.f7813a = aVar;
    }

    public final i1 a() {
        return this.f7813a.f1422w.f7656c;
    }

    public final void b(int i10) {
        boolean z10;
        q0 q0Var;
        int i11 = this.f7826n;
        this.f7826n = i10;
        boolean z11 = false;
        if (i11 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i10 == 0) {
            z11 = true;
        }
        if (z10 != z11) {
            androidx.compose.ui.node.a q10 = this.f7813a.q();
            if (q10 != null) {
                q0Var = q10.f1423x;
            } else {
                q0Var = null;
            }
            if (q0Var != null) {
                if (i10 == 0) {
                    q0Var.b(q0Var.f7826n - 1);
                } else {
                    q0Var.b(q0Var.f7826n + 1);
                }
            }
        }
    }

    public final void c(boolean z10) {
        if (this.f7825m != z10) {
            this.f7825m = z10;
            if (z10 && !this.f7824l) {
                b(this.f7826n + 1);
            } else if (!z10 && !this.f7824l) {
                b(this.f7826n - 1);
            }
        }
    }

    public final void d(boolean z10) {
        if (this.f7824l != z10) {
            this.f7824l = z10;
            if (z10 && !this.f7825m) {
                b(this.f7826n + 1);
            } else if (!z10 && !this.f7825m) {
                b(this.f7826n - 1);
            }
        }
    }

    public final void e() {
        n0 n0Var = this.f7827o;
        Object obj = n0Var.f7789q;
        androidx.compose.ui.node.a aVar = this.f7813a;
        q0 q0Var = n0Var.E;
        if ((obj != null || q0Var.a().a() != null) && n0Var.f7788p) {
            n0Var.f7788p = false;
            n0Var.f7789q = q0Var.a().a();
            androidx.compose.ui.node.a q10 = aVar.q();
            if (q10 != null) {
                androidx.compose.ui.node.a.S(q10, false, 3);
            }
        }
        m0 m0Var = this.f7828p;
        if (m0Var != null) {
            Object obj2 = m0Var.f7774v;
            q0 q0Var2 = m0Var.f7776x;
            if (obj2 == null) {
                v0 U0 = q0Var2.a().U0();
                Intrinsics.c(U0);
                if (U0.f7860k.a() == null) {
                    return;
                }
            }
            if (m0Var.f7773u) {
                m0Var.f7773u = false;
                v0 U02 = q0Var2.a().U0();
                Intrinsics.c(U02);
                m0Var.f7774v = U02.f7860k.a();
                if (g.v(aVar)) {
                    androidx.compose.ui.node.a q11 = aVar.q();
                    if (q11 != null) {
                        androidx.compose.ui.node.a.S(q11, false, 3);
                        return;
                    }
                    return;
                }
                androidx.compose.ui.node.a q12 = aVar.q();
                if (q12 != null) {
                    androidx.compose.ui.node.a.Q(q12, false, 3);
                }
            }
        }
    }
}
