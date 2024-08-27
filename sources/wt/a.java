package wt;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import vt.n;

/* loaded from: classes2.dex */
public abstract class a extends n {
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry element = (Map.Entry) obj;
        Intrinsics.checkNotNullParameter(element, "element");
        return e(element);
    }

    public abstract boolean e(Map.Entry entry);

    public /* bridge */ boolean g(Map.Entry entry) {
        return super.remove(entry);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        return g((Map.Entry) obj);
    }
}
