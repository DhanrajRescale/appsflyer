package t;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class f extends j0 implements Map {

    /* renamed from: d, reason: collision with root package name */
    public a f34852d;

    /* renamed from: e, reason: collision with root package name */
    public c f34853e;

    /* renamed from: f, reason: collision with root package name */
    public e f34854f;

    public f(f fVar) {
        super(0);
        if (fVar != null) {
            g(fVar);
        }
    }

    @Override // t.j0, java.util.Map
    public final boolean containsKey(Object obj) {
        return super.containsKey(obj);
    }

    @Override // t.j0, java.util.Map
    public final boolean containsValue(Object obj) {
        return super.containsValue(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        a aVar = this.f34852d;
        if (aVar == null) {
            a aVar2 = new a(this, 0);
            this.f34852d = aVar2;
            return aVar2;
        }
        return aVar;
    }

    @Override // t.j0, java.util.Map
    public final Object get(Object obj) {
        return super.get(obj);
    }

    public final boolean k(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!super.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Map
    public final Set keySet() {
        c cVar = this.f34853e;
        if (cVar == null) {
            c cVar2 = new c(this);
            this.f34853e = cVar2;
            return cVar2;
        }
        return cVar;
    }

    public final boolean l(Collection collection) {
        int i10 = this.f34873c;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            super.remove(it.next());
        }
        if (i10 != this.f34873c) {
            return true;
        }
        return false;
    }

    public final boolean m(Collection collection) {
        int i10 = this.f34873c;
        for (int i11 = i10 - 1; i11 >= 0; i11--) {
            if (!collection.contains(f(i11))) {
                h(i11);
            }
        }
        if (i10 != this.f34873c) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        b(map.size() + this.f34873c);
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // t.j0, java.util.Map
    public final Object remove(Object obj) {
        return super.remove(obj);
    }

    @Override // java.util.Map
    public final Collection values() {
        e eVar = this.f34854f;
        if (eVar == null) {
            e eVar2 = new e(this);
            this.f34854f = eVar2;
            return eVar2;
        }
        return eVar;
    }
}
