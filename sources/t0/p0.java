package t0;

import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class p0 extends u1 {

    /* renamed from: b, reason: collision with root package name */
    public final z2 f35124b;

    public p0(z2 z2Var, Function0 function0) {
        super(function0);
        this.f35124b = z2Var;
    }

    @Override // t0.a0
    public final l3 a(Object obj, l3 l3Var) {
        if (l3Var != null && (l3Var instanceof g1)) {
            ((g1) l3Var).setValue(obj);
            return l3Var;
        }
        return t.n0(obj, this.f35124b);
    }
}
