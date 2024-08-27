package e5;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public final class e implements Iterable {

    /* renamed from: a, reason: collision with root package name */
    public final Object f15006a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f15007b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public Set f15008c = Collections.emptySet();

    /* renamed from: d, reason: collision with root package name */
    public List f15009d = Collections.emptyList();

    public final int b(Object obj) {
        int i10;
        synchronized (this.f15006a) {
            try {
                if (this.f15007b.containsKey(obj)) {
                    i10 = ((Integer) this.f15007b.get(obj)).intValue();
                } else {
                    i10 = 0;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return i10;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Iterator it;
        synchronized (this.f15006a) {
            it = this.f15009d.iterator();
        }
        return it;
    }
}
