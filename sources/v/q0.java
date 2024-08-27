package v;

import a2.a1;
import kotlin.jvm.functions.Function2;
import t0.n1;
import t0.o3;
import w.z1;

/* loaded from: classes.dex */
public final class q0 extends m0 {

    /* renamed from: n, reason: collision with root package name */
    public w.n f37598n;

    /* renamed from: o, reason: collision with root package name */
    public Function2 f37599o;

    /* renamed from: r, reason: collision with root package name */
    public boolean f37602r;

    /* renamed from: p, reason: collision with root package name */
    public long f37600p = androidx.compose.animation.a.f1167a;

    /* renamed from: q, reason: collision with root package name */
    public long f37601q = hl.f.c(0, 0, 15);

    /* renamed from: s, reason: collision with root package name */
    public final n1 f37603s = t0.t.n0(null, o3.f35116a);

    public q0(w.f0 f0Var, Function2 function2) {
        this.f37598n = f0Var;
        this.f37599o = function2;
    }

    @Override // g1.n
    public final void I0() {
        this.f37600p = androidx.compose.animation.a.f1167a;
        this.f37602r = false;
    }

    @Override // g1.n
    public final void K0() {
        this.f37603s.setValue(null);
    }

    @Override // c2.c0
    public final a2.n0 a(a2.o0 o0Var, a2.l0 l0Var, long j10) {
        long j11;
        a1 E;
        a2.n0 n0;
        boolean z10 = true;
        if (o0Var.a0()) {
            this.f37601q = j10;
            this.f37602r = true;
            E = l0Var.E(j10);
        } else {
            if (this.f37602r) {
                j11 = this.f37601q;
            } else {
                j11 = j10;
            }
            E = l0Var.E(j11);
        }
        long k10 = hl.f.k(E.f29a, E.f30b);
        int i10 = 3;
        if (o0Var.a0()) {
            this.f37600p = k10;
        } else {
            if (!w2.j.a(this.f37600p, androidx.compose.animation.a.f1167a)) {
                k10 = this.f37600p;
            }
            long j12 = k10;
            n1 n1Var = this.f37603s;
            o0 o0Var2 = (o0) n1Var.getValue();
            if (o0Var2 != null) {
                w.d dVar = o0Var2.f37583a;
                if (w2.j.a(j12, ((w2.j) dVar.d()).f38798a) || ((Boolean) dVar.f38454d.getValue()).booleanValue()) {
                    z10 = false;
                }
                if (!w2.j.a(j12, ((w2.j) dVar.f38455e.getValue()).f38798a) || z10) {
                    o0Var2.f37584b = ((w2.j) dVar.d()).f38798a;
                    yk.g.H(E0(), null, null, new p0(o0Var2, j12, this, null), 3);
                }
            } else {
                o0Var2 = new o0(new w.d(new w2.j(j12), z1.f38746h, new w2.j(hl.f.k(1, 1)), 8), j12);
            }
            n1Var.setValue(o0Var2);
            k10 = hl.f.I(j10, ((w2.j) o0Var2.f37583a.d()).f38798a);
        }
        n0 = o0Var.n0((int) (k10 >> 32), (int) (4294967295L & k10), vt.p0.d(), new f(i10, E));
        return n0;
    }
}
