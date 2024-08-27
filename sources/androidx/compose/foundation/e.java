package androidx.compose.foundation;

import a0.k;
import d2.s;
import g1.o;
import t0.a0;
import t0.m3;
import t0.t;
import x.a1;
import x.j1;
import x.n1;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final m3 f1221a = new a0(a1.f39495c);

    public static final o a(o oVar, k kVar, j1 j1Var) {
        if (j1Var == null) {
            return oVar;
        }
        if (j1Var instanceof n1) {
            return oVar.g(new IndicationModifierElement(kVar, (n1) j1Var));
        }
        return t.H(oVar, s.f13613k, new v.o(2, j1Var, kVar));
    }
}
