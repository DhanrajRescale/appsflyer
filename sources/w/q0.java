package w;

import kotlin.jvm.functions.Function2;
import t0.o3;

/* loaded from: classes.dex */
public final class q0 {

    /* renamed from: a, reason: collision with root package name */
    public final v0.h f38643a = new v0.h(new l0[16]);

    /* renamed from: b, reason: collision with root package name */
    public final t0.n1 f38644b;

    /* renamed from: c, reason: collision with root package name */
    public long f38645c;

    /* renamed from: d, reason: collision with root package name */
    public final t0.n1 f38646d;

    public q0() {
        Boolean bool = Boolean.FALSE;
        o3 o3Var = o3.f35116a;
        this.f38644b = t0.t.n0(bool, o3Var);
        this.f38645c = Long.MIN_VALUE;
        this.f38646d = t0.t.n0(Boolean.TRUE, o3Var);
    }

    public final void a(t0.n nVar, int i10) {
        int i11;
        int i12;
        t0.r rVar = (t0.r) nVar;
        rVar.c0(-318043801);
        if ((i10 & 6) == 0) {
            if (rVar.j(this)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i11 = i12 | i10;
        } else {
            i11 = i10;
        }
        int i13 = 0;
        if ((i11 & 3) == 2 && rVar.G()) {
            rVar.V();
        } else {
            rVar.b0(2102345647);
            Object Q = rVar.Q();
            to.e eVar = t0.m.f35080a;
            if (Q == eVar) {
                Q = t0.t.n0(null, o3.f35116a);
                rVar.k0(Q);
            }
            t0.g1 g1Var = (t0.g1) Q;
            rVar.s(false);
            if (((Boolean) this.f38646d.getValue()).booleanValue() || ((Boolean) this.f38644b.getValue()).booleanValue()) {
                rVar.b0(2102345795);
                boolean j10 = rVar.j(this);
                Object Q2 = rVar.Q();
                if (j10 || Q2 == eVar) {
                    Q2 = new o0(g1Var, this, null);
                    rVar.k0(Q2);
                }
                rVar.s(false);
                t0.t.e(this, (Function2) Q2, rVar);
            }
        }
        t0.x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new p0(i10, i13, this);
        }
    }
}
