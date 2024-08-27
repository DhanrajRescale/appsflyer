package lp;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;

/* loaded from: classes2.dex */
public class g extends AbstractMap {

    /* renamed from: a, reason: collision with root package name */
    public transient e f24978a;

    /* renamed from: b, reason: collision with root package name */
    public transient z f24979b;

    /* renamed from: c, reason: collision with root package name */
    public final transient Map f24980c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r f24981d;

    public g(r rVar, Map map) {
        this.f24981d = rVar;
        this.f24980c = map;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Set entrySet() {
        e eVar = this.f24978a;
        if (eVar == null) {
            e eVar2 = new e(this);
            this.f24978a = eVar2;
            return eVar2;
        }
        return eVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Collection values() {
        z zVar = this.f24979b;
        if (zVar == null) {
            z zVar2 = new z(this);
            this.f24979b = zVar2;
            return zVar2;
        }
        return zVar;
    }

    public final j0 c(Map.Entry entry) {
        q qVar;
        Object key = entry.getKey();
        Collection collection = (Collection) entry.getValue();
        c cVar = (c) this.f24981d;
        cVar.getClass();
        List list = (List) collection;
        if (list instanceof RandomAccess) {
            qVar = new q(cVar, key, list, null);
        } else {
            qVar = new q(cVar, key, list, null);
        }
        return new j0(key, qVar);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        r rVar = this.f24981d;
        if (this.f24980c == rVar.f25046d) {
            rVar.b();
            return;
        }
        f fVar = new f(this);
        while (fVar.hasNext()) {
            fVar.next();
            fVar.remove();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map map = this.f24980c;
        map.getClass();
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this != obj && !this.f24980c.equals(obj)) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        q qVar;
        Map map = this.f24980c;
        map.getClass();
        try {
            obj2 = map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        Collection collection = (Collection) obj2;
        if (collection == null) {
            return null;
        }
        c cVar = (c) this.f24981d;
        cVar.getClass();
        List list = (List) collection;
        if (list instanceof RandomAccess) {
            qVar = new q(cVar, obj, list, null);
        } else {
            qVar = new q(cVar, obj, list, null);
        }
        return qVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return this.f24980c.hashCode();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        i iVar;
        r rVar = this.f24981d;
        i iVar2 = rVar.f25060a;
        if (iVar2 == null) {
            f1 f1Var = (f1) rVar;
            Map map = f1Var.f25046d;
            if (map instanceof NavigableMap) {
                iVar = new k(f1Var, (NavigableMap) f1Var.f25046d);
            } else if (map instanceof SortedMap) {
                iVar = new n(f1Var, (SortedMap) f1Var.f25046d);
            } else {
                iVar = new i(f1Var, f1Var.f25046d);
            }
            iVar2 = iVar;
            rVar.f25060a = iVar2;
        }
        return iVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Collection collection = (Collection) this.f24980c.remove(obj);
        if (collection == null) {
            return null;
        }
        r rVar = this.f24981d;
        List list = (List) ((f1) rVar).f24977f.get();
        list.addAll(collection);
        rVar.f25047e -= collection.size();
        collection.clear();
        return list;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f24980c.size();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        return this.f24980c.toString();
    }
}
