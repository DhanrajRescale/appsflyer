package g5;

import java.util.List;
import java.util.Map;
import java.util.Set;
import lp.f0;
import lp.g0;

/* loaded from: classes.dex */
public final class n extends f0 {

    /* renamed from: a, reason: collision with root package name */
    public final Map f16597a;

    public n(Map map) {
        this.f16597a = map;
    }

    @Override // lp.f0, java.util.Map
    public final boolean containsKey(Object obj) {
        if (obj != null && super.containsKey(obj)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003a, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0027, code lost:
    
        if (r0.hasNext() == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0037, code lost:
    
        if (r4.equals(((java.util.Map.Entry) r0.next()).getValue()) == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2:0x000e, code lost:
    
        if (r4 == null) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0014, code lost:
    
        if (r0.hasNext() == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0020, code lost:
    
        if (((java.util.Map.Entry) r0.next()).getValue() != null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:?, code lost:
    
        return true;
     */
    @Override // java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean containsValue(java.lang.Object r4) {
        /*
            r3 = this;
            java.util.Set r0 = r3.entrySet()
            lp.t1 r0 = (lp.t1) r0
            java.util.Iterator r0 = r0.iterator()
            r0.getClass()
            r1 = 1
            if (r4 != 0) goto L23
        L10:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L3a
            java.lang.Object r4 = r0.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r4 = r4.getValue()
            if (r4 != 0) goto L10
            goto L3b
        L23:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L3a
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r2 = r2.getValue()
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L23
            goto L3b
        L3a:
            r1 = 0
        L3b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: g5.n.containsValue(java.lang.Object):boolean");
    }

    @Override // lp.f0, java.util.Map
    public final Set entrySet() {
        return g0.c(super.entrySet(), new m(0));
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj != null && kp.j.O(obj, this)) {
            return true;
        }
        return false;
    }

    @Override // lp.f0, java.util.Map
    public final Object get(Object obj) {
        if (obj == null) {
            return null;
        }
        return (List) super.get(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return g0.h(entrySet());
    }

    @Override // lp.f0, java.util.Map
    public final boolean isEmpty() {
        if (super.isEmpty()) {
            return true;
        }
        if (super.size() == 1 && super.containsKey(null)) {
            return true;
        }
        return false;
    }

    @Override // lp.f0, java.util.Map
    public final Set keySet() {
        return g0.c(super.keySet(), new m(1));
    }

    @Override // lp.f0, java.util.Map
    public final int size() {
        return super.size() - (super.containsKey(null) ? 1 : 0);
    }
}
