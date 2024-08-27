package v;

import a2.a1;
import w.n1;
import w.o1;
import w.u1;

/* loaded from: classes.dex */
public final class g0 extends m0 {

    /* renamed from: n, reason: collision with root package name */
    public u1 f37504n;

    /* renamed from: o, reason: collision with root package name */
    public o1 f37505o;

    /* renamed from: p, reason: collision with root package name */
    public o1 f37506p;

    /* renamed from: q, reason: collision with root package name */
    public o1 f37507q;

    /* renamed from: r, reason: collision with root package name */
    public h0 f37508r;

    /* renamed from: s, reason: collision with root package name */
    public i0 f37509s;

    /* renamed from: t, reason: collision with root package name */
    public a0 f37510t;

    /* renamed from: u, reason: collision with root package name */
    public long f37511u = androidx.compose.animation.a.f1167a;

    /* renamed from: v, reason: collision with root package name */
    public g1.d f37512v;

    /* renamed from: w, reason: collision with root package name */
    public final f0 f37513w;

    /* renamed from: x, reason: collision with root package name */
    public final f0 f37514x;

    public g0(u1 u1Var, o1 o1Var, o1 o1Var2, o1 o1Var3, h0 h0Var, i0 i0Var, a0 a0Var) {
        this.f37504n = u1Var;
        this.f37505o = o1Var;
        this.f37506p = o1Var2;
        this.f37507q = o1Var3;
        this.f37508r = h0Var;
        this.f37509s = i0Var;
        this.f37510t = a0Var;
        hl.f.c(0, 0, 15);
        this.f37513w = new f0(this, 0);
        this.f37514x = new f0(this, 1);
    }

    @Override // g1.n
    public final void I0() {
        this.f37511u = androidx.compose.animation.a.f1167a;
    }

    public final g1.d Q0() {
        g1.d dVar;
        if (this.f37504n.e().a(z.f37636a, z.f37637b)) {
            t tVar = this.f37508r.f37527a.f37623c;
            if (tVar == null || (dVar = tVar.f37608a) == null) {
                t tVar2 = this.f37509s.f37532a.f37623c;
                if (tVar2 == null) {
                    return null;
                }
                return tVar2.f37608a;
            }
        } else {
            t tVar3 = this.f37509s.f37532a.f37623c;
            if (tVar3 == null || (dVar = tVar3.f37608a) == null) {
                t tVar4 = this.f37508r.f37527a.f37623c;
                if (tVar4 == null) {
                    return null;
                }
                return tVar4.f37608a;
            }
        }
        return dVar;
    }

    @Override // c2.c0
    public final a2.n0 a(a2.o0 o0Var, a2.l0 l0Var, long j10) {
        n1 n1Var;
        long j11;
        n1 n1Var2;
        long j12;
        long j13;
        long j14;
        a2.n0 n0;
        a2.n0 n02;
        Object obj = null;
        if (this.f37504n.c() == this.f37504n.f38689c.getValue()) {
            this.f37512v = null;
        } else if (this.f37512v == null) {
            g1.d Q0 = Q0();
            if (Q0 == null) {
                Q0 = g1.a.f16379a;
            }
            this.f37512v = Q0;
        }
        int i10 = 2;
        if (o0Var.a0()) {
            a1 E = l0Var.E(j10);
            long k10 = hl.f.k(E.f29a, E.f30b);
            this.f37511u = k10;
            n02 = o0Var.n0((int) (k10 >> 32), (int) (4294967295L & k10), vt.p0.d(), new f(2, E));
            return n02;
        }
        a0 a0Var = this.f37510t;
        o1 o1Var = a0Var.f37477a;
        int i11 = 1;
        int i12 = 0;
        h0 h0Var = a0Var.f37479c;
        i0 i0Var = a0Var.f37480d;
        if (o1Var != null) {
            n1Var = o1Var.a(new b0(h0Var, i0Var, 0), new b0(h0Var, i0Var, 1));
        } else {
            n1Var = null;
        }
        if (a0Var.f37478b.c() == z.f37636a) {
            h0Var.f37527a.getClass();
            i0Var.f37532a.getClass();
        } else {
            i0Var.f37532a.getClass();
            h0Var.f37527a.getClass();
        }
        c.g gVar = new c.g(i11, n1Var, obj, obj);
        a1 E2 = l0Var.E(j10);
        long k11 = hl.f.k(E2.f29a, E2.f30b);
        if (!w2.j.a(this.f37511u, androidx.compose.animation.a.f1167a)) {
            j11 = this.f37511u;
        } else {
            j11 = k11;
        }
        o1 o1Var2 = this.f37505o;
        if (o1Var2 != null) {
            n1Var2 = o1Var2.a(this.f37513w, new e0(this, j11, i12));
        } else {
            n1Var2 = null;
        }
        if (n1Var2 != null) {
            k11 = ((w2.j) n1Var2.getValue()).f38798a;
        }
        long I = hl.f.I(j10, k11);
        o1 o1Var3 = this.f37506p;
        if (o1Var3 != null) {
            j12 = ((w2.h) o1Var3.a(l.f37557m, new e0(this, j11, i11)).getValue()).f38793a;
        } else {
            j12 = w2.h.f38791b;
        }
        long j15 = j12;
        o1 o1Var4 = this.f37507q;
        if (o1Var4 != null) {
            j13 = ((w2.h) o1Var4.a(this.f37514x, new e0(this, j11, i10)).getValue()).f38793a;
        } else {
            j13 = w2.h.f38791b;
        }
        g1.d dVar = this.f37512v;
        if (dVar != null) {
            j14 = ((g1.g) dVar).a(j11, I, w2.k.f38799a);
        } else {
            j14 = w2.h.f38791b;
        }
        n0 = o0Var.n0((int) (I >> 32), (int) (I & 4294967295L), vt.p0.d(), new d0(0, hl.f.j(((int) (j14 >> 32)) + ((int) (j13 >> 32)), ((int) (j14 & 4294967295L)) + ((int) (j13 & 4294967295L))), j15, E2, gVar));
        return n0;
    }
}
