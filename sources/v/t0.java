package v;

import android.view.ViewConfiguration;
import d2.s1;

/* loaded from: classes.dex */
public abstract class t0 {

    /* renamed from: a, reason: collision with root package name */
    public static final float f37612a = ViewConfiguration.getScrollFriction();

    public static final w.b0 a(t0.n nVar) {
        t0.r rVar = (t0.r) nVar;
        rVar.b0(904445851);
        w2.b bVar = (w2.b) rVar.m(s1.f13620e);
        float b10 = bVar.b();
        rVar.b0(-903108203);
        boolean e10 = rVar.e(b10);
        Object Q = rVar.Q();
        if (e10 || Q == t0.m.f35080a) {
            Q = new w.b0(new s0(bVar));
            rVar.k0(Q);
        }
        w.b0 b0Var = (w.b0) Q;
        rVar.s(false);
        rVar.s(false);
        return b0Var;
    }
}
