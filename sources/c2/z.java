package c2;

import t0.o3;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.compose.ui.node.a f7885a;

    /* renamed from: b, reason: collision with root package name */
    public final t0.n1 f7886b = t0.t.n0(null, o3.f35116a);

    public z(androidx.compose.ui.node.a aVar) {
        this.f7885a = aVar;
    }

    public final a2.m0 a() {
        a2.m0 m0Var = (a2.m0) this.f7886b.getValue();
        if (m0Var != null) {
            return m0Var;
        }
        throw new IllegalStateException("Intrinsic size is queried but there is no measure policy in place.".toString());
    }
}
