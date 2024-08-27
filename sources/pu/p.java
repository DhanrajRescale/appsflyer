package pu;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import vt.i0;
import vt.x;

/* loaded from: classes2.dex */
public class p extends n {
    public static f e(q qVar) {
        Intrinsics.checkNotNullParameter(qVar, "<this>");
        o predicate = o.f31432a;
        Intrinsics.checkNotNullParameter(qVar, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        return new f(qVar);
    }

    public static Object f(f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        e eVar = new e(fVar);
        if (!eVar.hasNext()) {
            return null;
        }
        return eVar.next();
    }

    public static q g(Sequence sequence, Function1 transform) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return new q(1, transform, sequence);
    }

    public static f h(Sequence sequence, Function1 transform) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return e(new q(1, transform, sequence));
    }

    public static List i(Sequence sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Iterator it = sequence.iterator();
        if (!it.hasNext()) {
            return i0.f38321a;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return x.a(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}
