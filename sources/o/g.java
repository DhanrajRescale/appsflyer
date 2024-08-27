package o;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class g implements Iterable {

    /* renamed from: a, reason: collision with root package name */
    public c f29335a;

    /* renamed from: b, reason: collision with root package name */
    public c f29336b;

    /* renamed from: c, reason: collision with root package name */
    public final WeakHashMap f29337c = new WeakHashMap();

    /* renamed from: d, reason: collision with root package name */
    public int f29338d = 0;

    public c b(Object obj) {
        c cVar = this.f29335a;
        while (cVar != null && !cVar.f29326a.equals(obj)) {
            cVar = cVar.f29328c;
        }
        return cVar;
    }

    public Object e(Object obj, Object obj2) {
        c b10 = b(obj);
        if (b10 != null) {
            return b10.f29327b;
        }
        c cVar = new c(obj, obj2);
        this.f29338d++;
        c cVar2 = this.f29336b;
        if (cVar2 == null) {
            this.f29335a = cVar;
            this.f29336b = cVar;
            return null;
        }
        cVar2.f29328c = cVar;
        cVar.f29329d = cVar2;
        this.f29336b = cVar;
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0048, code lost:
    
        if (r3.hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0050, code lost:
    
        if (((o.e) r7).hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:?, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0054, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 1
            if (r7 != r6) goto L4
            return r0
        L4:
            boolean r1 = r7 instanceof o.g
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            o.g r7 = (o.g) r7
            int r1 = r6.f29338d
            int r3 = r7.f29338d
            if (r1 == r3) goto L13
            return r2
        L13:
            java.util.Iterator r1 = r6.iterator()
            java.util.Iterator r7 = r7.iterator()
        L1b:
            r3 = r1
            o.e r3 = (o.e) r3
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L44
            r4 = r7
            o.e r4 = (o.e) r4
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L44
            java.lang.Object r3 = r3.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r4.next()
            if (r3 != 0) goto L3b
            if (r4 != 0) goto L43
        L3b:
            if (r3 == 0) goto L1b
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L1b
        L43:
            return r2
        L44:
            boolean r1 = r3.hasNext()
            if (r1 != 0) goto L53
            o.e r7 = (o.e) r7
            boolean r7 = r7.hasNext()
            if (r7 != 0) goto L53
            goto L54
        L53:
            r0 = r2
        L54:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.g.equals(java.lang.Object):boolean");
    }

    public Object g(Object obj) {
        c b10 = b(obj);
        if (b10 == null) {
            return null;
        }
        this.f29338d--;
        WeakHashMap weakHashMap = this.f29337c;
        if (!weakHashMap.isEmpty()) {
            Iterator it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((f) it.next()).a(b10);
            }
        }
        c cVar = b10.f29329d;
        if (cVar != null) {
            cVar.f29328c = b10.f29328c;
        } else {
            this.f29335a = b10.f29328c;
        }
        c cVar2 = b10.f29328c;
        if (cVar2 != null) {
            cVar2.f29329d = cVar;
        } else {
            this.f29336b = cVar;
        }
        b10.f29328c = null;
        b10.f29329d = null;
        return b10.f29327b;
    }

    public final int hashCode() {
        Iterator it = iterator();
        int i10 = 0;
        while (true) {
            e eVar = (e) it;
            if (eVar.hasNext()) {
                i10 += ((Map.Entry) eVar.next()).hashCode();
            } else {
                return i10;
            }
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        b bVar = new b(this.f29335a, this.f29336b, 0);
        this.f29337c.put(bVar, Boolean.FALSE);
        return bVar;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            e eVar = (e) it;
            if (eVar.hasNext()) {
                sb2.append(((Map.Entry) eVar.next()).toString());
                if (eVar.hasNext()) {
                    sb2.append(", ");
                }
            } else {
                sb2.append("]");
                return sb2.toString();
            }
        }
    }
}
