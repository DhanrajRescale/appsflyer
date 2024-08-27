package m0;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class p2 {

    /* renamed from: a, reason: collision with root package name */
    public final y f26627a;

    /* renamed from: b, reason: collision with root package name */
    public w2.b f26628b;

    public p2(q2 q2Var, Function1 function1) {
        this.f26627a = new y(q2Var, new c2(this, 1), new o2(this, 0), m2.f26478d, function1);
    }

    public static final w2.b a(p2 p2Var) {
        w2.b bVar = p2Var.f26628b;
        if (bVar != null) {
            return bVar;
        }
        throw new IllegalArgumentException(("The density on DrawerState (" + p2Var + ") was not set. Did you use DrawerState with the Drawer composable?").toString());
    }
}
