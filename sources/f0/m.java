package f0;

import a2.u;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import t0.t;
import y.s;

/* loaded from: classes.dex */
public final class m extends a implements d {

    /* renamed from: p, reason: collision with root package name */
    public final h f15901p;

    /* renamed from: q, reason: collision with root package name */
    public final b2.j f15902q = t.i0(new Pair(c.f15876a, this));

    public m(s sVar) {
        this.f15901p = sVar;
    }

    public static final m1.d R0(m mVar, u uVar, Function0 function0) {
        m1.d dVar;
        u Q0 = mVar.Q0();
        if (Q0 == null) {
            return null;
        }
        if (!uVar.m()) {
            uVar = null;
        }
        if (uVar == null || (dVar = (m1.d) function0.mo2invoke()) == null) {
            return null;
        }
        m1.d i10 = Q0.i(uVar, false);
        return dVar.g(t.g(i10.f27239a, i10.f27240b));
    }

    @Override // b2.f
    public final kp.j V() {
        return this.f15902q;
    }

    @Override // f0.d
    public final Object b0(u uVar, Function0 function0, yt.a aVar) {
        Object P = hl.f.P(new l(this, uVar, function0, new c0.s(2, this, uVar, function0), null), aVar);
        if (P == zt.a.f42823a) {
            return P;
        }
        return Unit.f23355a;
    }
}
