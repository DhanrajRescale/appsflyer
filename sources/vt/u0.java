package vt;

import java.util.HashSet;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public class u0 extends t0 {
    public static HashSet a(Object... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        HashSet hashSet = new HashSet(o0.a(elements.length));
        v.w(hashSet, elements);
        return hashSet;
    }
}
