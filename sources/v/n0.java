package v;

import t0.l3;
import w.f1;
import w.x1;
import w.y1;

/* loaded from: classes.dex */
public abstract class n0 {

    /* renamed from: a, reason: collision with root package name */
    public static final f1 f37579a = w.e.v(s0.g.f34069a, null, 7);

    public static final l3 a(long j10, x1 x1Var, t0.n nVar, int i10, int i11) {
        String str;
        t0.r rVar = (t0.r) nVar;
        rVar.b0(-451899108);
        w.n nVar2 = x1Var;
        if ((i11 & 2) != 0) {
            nVar2 = f37579a;
        }
        w.n nVar3 = nVar2;
        if ((i11 & 4) != 0) {
            str = "ColorAnimation";
        } else {
            str = null;
        }
        String str2 = str;
        o1.d g10 = n1.t.g(j10);
        rVar.b0(-309953459);
        boolean h10 = rVar.h(g10);
        Object Q = rVar.Q();
        if (h10 || Q == t0.m.f35080a) {
            Q = (y1) l.f37550f.invoke(n1.t.g(j10));
            rVar.k0(Q);
        }
        rVar.s(false);
        int i12 = i10 << 6;
        l3 c10 = w.i.c(new n1.t(j10), (y1) Q, nVar3, null, str2, null, rVar, (i10 & 14) | ((i10 << 3) & 896) | (57344 & i12) | (i12 & 458752), 8);
        rVar.s(false);
        return c10;
    }
}
