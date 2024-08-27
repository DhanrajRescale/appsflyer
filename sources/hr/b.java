package hr;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f18686a;

    /* renamed from: b, reason: collision with root package name */
    public final c f18687b;

    public b(Set set, c cVar) {
        this.f18686a = b(set);
        this.f18687b = cVar;
    }

    public static String b(Set set) {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            sb2.append(aVar.f18684a);
            sb2.append('/');
            sb2.append(aVar.f18685b);
            if (it.hasNext()) {
                sb2.append(' ');
            }
        }
        return sb2.toString();
    }

    public final String a() {
        Set unmodifiableSet;
        Set unmodifiableSet2;
        c cVar = this.f18687b;
        synchronized (((Set) cVar.f18690b)) {
            unmodifiableSet = Collections.unmodifiableSet((Set) cVar.f18690b);
        }
        boolean isEmpty = unmodifiableSet.isEmpty();
        String str = this.f18686a;
        if (isEmpty) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(' ');
        synchronized (((Set) cVar.f18690b)) {
            unmodifiableSet2 = Collections.unmodifiableSet((Set) cVar.f18690b);
        }
        sb2.append(b(unmodifiableSet2));
        return sb2.toString();
    }
}
