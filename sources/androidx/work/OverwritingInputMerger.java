package androidx.work;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class OverwritingInputMerger extends o {
    @Override // androidx.work.o
    public final k a(ArrayList arrayList) {
        j jVar = new j(0);
        HashMap hashMap = new HashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            hashMap.putAll(Collections.unmodifiableMap(((k) it.next()).f2622a));
        }
        jVar.c(hashMap);
        return jVar.a();
    }
}
