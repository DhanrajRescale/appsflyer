package y0;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class a extends vt.n {
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Map.Entry entry;
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry2 = (Map.Entry) obj;
        if (entry2 instanceof Object) {
            entry = entry2;
        } else {
            entry = null;
        }
        if (!(entry instanceof Map.Entry)) {
            return false;
        }
        Object key = entry2.getKey();
        f fVar = ((h) this).f41032a;
        Object obj2 = fVar.get(key);
        if (obj2 != null) {
            return Intrinsics.a(obj2, entry2.getValue());
        }
        if (entry2.getValue() != null || !fVar.containsKey(entry2.getKey())) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Map.Entry entry;
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry2 = (Map.Entry) obj;
        if (entry2 instanceof Object) {
            entry = entry2;
        } else {
            entry = null;
        }
        if (!(entry instanceof Map.Entry)) {
            return false;
        }
        return ((h) this).f41032a.remove(entry2.getKey(), entry2.getValue());
    }
}
