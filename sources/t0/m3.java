package t0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class m3 extends u1 {
    @Override // t0.a0
    public final l3 a(Object obj, l3 l3Var) {
        if (l3Var == null || !Intrinsics.a(l3Var.getValue(), obj)) {
            return new n3(obj);
        }
        return l3Var;
    }
}
