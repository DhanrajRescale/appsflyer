package x;

import android.view.View;
import kotlin.jvm.functions.Function1;
import t0.o3;

/* loaded from: classes.dex */
public final class q1 extends g1.n implements c2.m, c2.t, c2.s, c2.z1, c2.l1 {
    public final t0.n1 A;
    public long B;
    public w2.j C;

    /* renamed from: n, reason: collision with root package name */
    public Function1 f39684n;

    /* renamed from: o, reason: collision with root package name */
    public Function1 f39685o;

    /* renamed from: p, reason: collision with root package name */
    public Function1 f39686p;

    /* renamed from: q, reason: collision with root package name */
    public float f39687q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f39688r;

    /* renamed from: s, reason: collision with root package name */
    public long f39689s;

    /* renamed from: t, reason: collision with root package name */
    public float f39690t;

    /* renamed from: u, reason: collision with root package name */
    public float f39691u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f39692v;

    /* renamed from: w, reason: collision with root package name */
    public c2 f39693w;

    /* renamed from: x, reason: collision with root package name */
    public View f39694x;

    /* renamed from: y, reason: collision with root package name */
    public w2.b f39695y;

    /* renamed from: z, reason: collision with root package name */
    public b2 f39696z;

    public q1(Function1 function1, Function1 function12, Function1 function13, float f10, boolean z10, long j10, float f11, float f12, boolean z11, c2 c2Var) {
        this.f39684n = function1;
        this.f39685o = function12;
        this.f39686p = function13;
        this.f39687q = f10;
        this.f39688r = z10;
        this.f39689s = j10;
        this.f39690t = f11;
        this.f39691u = f12;
        this.f39692v = z11;
        this.f39693w = c2Var;
        long j11 = m1.c.f27235d;
        this.A = t0.t.n0(new m1.c(j11), o3.f35116a);
        this.B = j11;
    }

    @Override // c2.t
    public final void C0(c2.i1 i1Var) {
        this.A.setValue(new m1.c(androidx.compose.ui.layout.a.m(i1Var)));
    }

    @Override // g1.n
    public final void I0() {
        j0();
    }

    @Override // g1.n
    public final void J0() {
        b2 b2Var = this.f39696z;
        if (b2Var != null) {
            ((d2) b2Var).b();
        }
        this.f39696z = null;
    }

    public final void Q0() {
        w2.b bVar;
        b2 b2Var = this.f39696z;
        if (b2Var != null) {
            ((d2) b2Var).b();
        }
        View view = this.f39694x;
        if (view == null || (bVar = this.f39695y) == null) {
            return;
        }
        this.f39696z = this.f39693w.b(view, this.f39688r, this.f39689s, this.f39690t, this.f39691u, this.f39692v, bVar, this.f39687q);
        S0();
    }

    public final void R0() {
        w2.b bVar;
        long j10;
        long j11;
        b2 b2Var = this.f39696z;
        if (b2Var == null || (bVar = this.f39695y) == null) {
            return;
        }
        long j12 = ((m1.c) this.f39684n.invoke(bVar)).f27237a;
        t0.n1 n1Var = this.A;
        if (t0.t.e0(((m1.c) n1Var.getValue()).f27237a) && t0.t.e0(j12)) {
            j10 = m1.c.h(((m1.c) n1Var.getValue()).f27237a, j12);
        } else {
            j10 = m1.c.f27235d;
        }
        this.B = j10;
        if (t0.t.e0(j10)) {
            Function1 function1 = this.f39685o;
            if (function1 != null) {
                long j13 = ((m1.c) function1.invoke(bVar)).f27237a;
                m1.c cVar = new m1.c(j13);
                if (!t0.t.e0(j13)) {
                    cVar = null;
                }
                if (cVar != null) {
                    j11 = m1.c.h(((m1.c) n1Var.getValue()).f27237a, cVar.f27237a);
                    b2Var.a(this.B, j11, this.f39687q);
                    S0();
                    return;
                }
            }
            j11 = m1.c.f27235d;
            b2Var.a(this.B, j11, this.f39687q);
            S0();
            return;
        }
        ((d2) b2Var).b();
    }

    public final void S0() {
        w2.b bVar;
        b2 b2Var = this.f39696z;
        if (b2Var == null || (bVar = this.f39695y) == null) {
            return;
        }
        d2 d2Var = (d2) b2Var;
        long c10 = d2Var.c();
        w2.j jVar = this.C;
        if (!(jVar instanceof w2.j) || c10 != jVar.f38798a) {
            Function1 function1 = this.f39686p;
            if (function1 != null) {
                function1.invoke(new w2.g(bVar.p(hl.f.i1(d2Var.c()))));
            }
            this.C = new w2.j(d2Var.c());
        }
    }

    @Override // c2.s
    public final void e(p1.e eVar) {
        ((c2.j0) eVar).a();
        yk.g.H(E0(), null, null, new p1(this, null), 3);
    }

    @Override // c2.l1
    public final void j0() {
        c2.g.w(this, new o1(this, 1));
    }

    @Override // c2.z1
    public final void n(h2.j jVar) {
        jVar.h(r1.f39704a, new o1(this, 0));
    }
}
