package y0;

import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class m extends vt.o {

    /* renamed from: b, reason: collision with root package name */
    public final d f41036b;

    public m(d dVar) {
        this.f41036b = dVar;
    }

    @Override // vt.b
    public final int b() {
        return this.f41036b.size();
    }

    @Override // vt.b, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (!(entry instanceof Map.Entry)) {
            return false;
        }
        Object key = entry.getKey();
        d dVar = this.f41036b;
        Object obj2 = dVar.get(key);
        if (obj2 != null) {
            return Intrinsics.a(obj2, entry.getValue());
        }
        if (entry.getValue() != null || !dVar.containsKey(entry.getKey())) {
            return false;
        }
        return true;
    }

    @Override // vt.o, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        r rVar = this.f41036b.f41018d;
        s[] sVarArr = new s[8];
        for (int i10 = 0; i10 < 8; i10++) {
            sVarArr[i10] = new s();
        }
        return new e(rVar, sVarArr);
    }
}
