package m0;

/* loaded from: classes.dex */
public abstract class x0 {

    /* renamed from: a, reason: collision with root package name */
    public static final t0.m3 f27075a = new t0.a0(w0.f26991b);

    public static final long a(long j10, t0.n nVar) {
        long j11;
        t0.r rVar = (t0.r) nVar;
        v0 v0Var = (v0) rVar.m(f27075a);
        boolean d10 = n1.t.d(j10, v0Var.c());
        t0.n1 n1Var = v0Var.f26925h;
        if (d10) {
            j11 = ((n1.t) n1Var.getValue()).f28179a;
        } else if (n1.t.d(j10, ((n1.t) v0Var.f26919b.getValue()).f28179a)) {
            j11 = ((n1.t) n1Var.getValue()).f28179a;
        } else {
            boolean d11 = n1.t.d(j10, ((n1.t) v0Var.f26920c.getValue()).f28179a);
            t0.n1 n1Var2 = v0Var.f26926i;
            if (d11) {
                j11 = ((n1.t) n1Var2.getValue()).f28179a;
            } else if (n1.t.d(j10, ((n1.t) v0Var.f26921d.getValue()).f28179a)) {
                j11 = ((n1.t) n1Var2.getValue()).f28179a;
            } else if (n1.t.d(j10, ((n1.t) v0Var.f26922e.getValue()).f28179a)) {
                j11 = ((n1.t) v0Var.f26927j.getValue()).f28179a;
            } else if (n1.t.d(j10, v0Var.d())) {
                j11 = v0Var.b();
            } else if (n1.t.d(j10, v0Var.a())) {
                j11 = ((n1.t) v0Var.f26929l.getValue()).f28179a;
            } else {
                j11 = n1.t.f28177i;
            }
        }
        if (j11 == 16) {
            return ((n1.t) rVar.m(e1.f26084a)).f28179a;
        }
        return j11;
    }

    public static final long b(v0 v0Var) {
        if (v0Var.e()) {
            return v0Var.c();
        }
        return v0Var.d();
    }
}
