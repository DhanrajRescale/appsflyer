package androidx.lifecycle;

import java.util.Iterator;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class h1 {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f1912a = new LinkedHashMap();

    public final void a() {
        LinkedHashMap linkedHashMap = this.f1912a;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((a1) it.next()).b();
        }
        linkedHashMap.clear();
    }
}
