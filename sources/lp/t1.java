package lp;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.Set;

/* loaded from: classes2.dex */
public class t1 extends AbstractCollection implements Set {

    /* renamed from: a, reason: collision with root package name */
    public final Collection f25058a;

    /* renamed from: b, reason: collision with root package name */
    public final kp.h f25059b;

    public t1(Set set, kp.h hVar) {
        this.f25058a = set;
        this.f25059b = hVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final boolean add(Object obj) {
        if (this.f25059b.apply(obj)) {
            return this.f25058a.add(obj);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final boolean addAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!this.f25059b.apply(it.next())) {
                throw new IllegalArgumentException();
            }
        }
        return this.f25058a.addAll(collection);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return g0.b(this, obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final void clear() {
        Collection collection = this.f25058a;
        boolean z10 = collection instanceof RandomAccess;
        kp.h hVar = this.f25059b;
        if (z10 && (collection instanceof List)) {
            List list = (List) collection;
            hVar.getClass();
            int i10 = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                Object obj = list.get(i11);
                if (!hVar.apply(obj)) {
                    if (i11 > i10) {
                        try {
                            list.set(i10, obj);
                        } catch (IllegalArgumentException unused) {
                            g0.m(list, hVar, i10, i11);
                            return;
                        } catch (UnsupportedOperationException unused2) {
                            g0.m(list, hVar, i10, i11);
                            return;
                        }
                    }
                    i10++;
                }
            }
            list.subList(i10, list.size()).clear();
            return;
        }
        Iterator it = collection.iterator();
        hVar.getClass();
        while (it.hasNext()) {
            if (hVar.apply(it.next())) {
                it.remove();
            }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final boolean contains(Object obj) {
        Collection collection = this.f25058a;
        collection.getClass();
        try {
            if (collection.contains(obj)) {
                return this.f25059b.apply(obj);
            }
            return false;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return g0.h(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public final boolean isEmpty() {
        Iterator it = this.f25058a.iterator();
        kp.h hVar = this.f25059b;
        if (hVar != null) {
            boolean z10 = false;
            int i10 = 0;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (hVar.apply(it.next())) {
                    if (i10 != -1) {
                        z10 = true;
                    }
                } else {
                    i10++;
                }
            }
            return !z10;
        }
        throw new NullPointerException("predicate");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public final Iterator iterator() {
        Iterator it = this.f25058a.iterator();
        it.getClass();
        kp.h hVar = this.f25059b;
        hVar.getClass();
        return new w0(it, hVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public final boolean remove(Object obj) {
        if (contains(obj) && this.f25058a.remove(obj)) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public final boolean removeAll(Collection collection) {
        Iterator it = this.f25058a.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.f25059b.apply(next) && collection.contains(next)) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public final boolean retainAll(Collection collection) {
        Iterator it = this.f25058a.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.f25059b.apply(next) && !collection.contains(next)) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public final int size() {
        Iterator it = this.f25058a.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (this.f25059b.apply(it.next())) {
                i10++;
            }
        }
        return i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public final Object[] toArray() {
        w0 w0Var = (w0) iterator();
        ArrayList arrayList = new ArrayList();
        while (w0Var.hasNext()) {
            arrayList.add(w0Var.next());
        }
        return arrayList.toArray();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public final Object[] toArray(Object[] objArr) {
        w0 w0Var = (w0) iterator();
        ArrayList arrayList = new ArrayList();
        while (w0Var.hasNext()) {
            arrayList.add(w0Var.next());
        }
        return arrayList.toArray(objArr);
    }
}
