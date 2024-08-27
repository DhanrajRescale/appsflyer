package pu;

import d4.t1;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/* loaded from: classes2.dex */
public class m extends k {
    public static Sequence b(Iterator it) {
        Intrinsics.checkNotNullParameter(it, "<this>");
        t1 t1Var = new t1(it, 5);
        Intrinsics.checkNotNullParameter(t1Var, "<this>");
        if (!(t1Var instanceof a)) {
            return new a(t1Var);
        }
        return t1Var;
    }

    public static Sequence c() {
        return d.f31416a;
    }

    public static Sequence d(Function1 nextFunction, Object obj) {
        Intrinsics.checkNotNullParameter(nextFunction, "nextFunction");
        if (obj == null) {
            return d.f31416a;
        }
        return new q(new l(obj), nextFunction);
    }
}
