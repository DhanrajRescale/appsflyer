package xd;

import k7.w;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class d extends w {
    @Override // k7.w
    public final boolean b(Object obj, Object obj2) {
        a oldItem = (a) obj;
        a newItem = (a) obj2;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return oldItem.equals(newItem);
    }

    @Override // k7.w
    public final boolean d(Object obj, Object obj2) {
        a oldItem = (a) obj;
        a newItem = (a) obj2;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return Intrinsics.a(oldItem.f40174b, newItem.f40174b);
    }
}
