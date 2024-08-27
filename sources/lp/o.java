package lp;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* loaded from: classes2.dex */
public abstract class o extends AbstractCollection {

    /* renamed from: a, reason: collision with root package name */
    public final Object f25020a;

    /* renamed from: b, reason: collision with root package name */
    public Collection f25021b;

    /* renamed from: c, reason: collision with root package name */
    public final o f25022c;

    /* renamed from: d, reason: collision with root package name */
    public final Collection f25023d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r f25024e;

    public o(r rVar, Object obj, Collection collection, o oVar) {
        Collection collection2;
        this.f25024e = rVar;
        this.f25020a = obj;
        this.f25021b = collection;
        this.f25022c = oVar;
        if (oVar == null) {
            collection2 = null;
        } else {
            collection2 = oVar.f25021b;
        }
        this.f25023d = collection2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        e();
        boolean isEmpty = this.f25021b.isEmpty();
        boolean add = this.f25021b.add(obj);
        if (add) {
            this.f25024e.f25047e++;
            if (isEmpty) {
                b();
            }
        }
        return add;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = this.f25021b.addAll(collection);
        if (addAll) {
            this.f25024e.f25047e += this.f25021b.size() - size;
            if (size == 0) {
                b();
            }
        }
        return addAll;
    }

    public final void b() {
        o oVar = this.f25022c;
        if (oVar != null) {
            oVar.b();
        } else {
            this.f25024e.f25046d.put(this.f25020a, this.f25021b);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        int size = size();
        if (size == 0) {
            return;
        }
        this.f25021b.clear();
        this.f25024e.f25047e -= size;
        g();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        e();
        return this.f25021b.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection collection) {
        e();
        return this.f25021b.containsAll(collection);
    }

    public final void e() {
        Collection collection;
        o oVar = this.f25022c;
        if (oVar != null) {
            oVar.e();
            if (oVar.f25021b != this.f25023d) {
                throw new ConcurrentModificationException();
            }
        } else if (this.f25021b.isEmpty() && (collection = (Collection) this.f25024e.f25046d.get(this.f25020a)) != null) {
            this.f25021b = collection;
        }
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        e();
        return this.f25021b.equals(obj);
    }

    public final void g() {
        o oVar = this.f25022c;
        if (oVar != null) {
            oVar.g();
        } else if (this.f25021b.isEmpty()) {
            this.f25024e.f25046d.remove(this.f25020a);
        }
    }

    @Override // java.util.Collection
    public final int hashCode() {
        e();
        return this.f25021b.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        e();
        return new f(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        e();
        boolean remove = this.f25021b.remove(obj);
        if (remove) {
            r rVar = this.f25024e;
            rVar.f25047e--;
            g();
        }
        return remove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean removeAll = this.f25021b.removeAll(collection);
        if (removeAll) {
            this.f25024e.f25047e += this.f25021b.size() - size;
            g();
        }
        return removeAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        int size = size();
        boolean retainAll = this.f25021b.retainAll(collection);
        if (retainAll) {
            this.f25024e.f25047e += this.f25021b.size() - size;
            g();
        }
        return retainAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        e();
        return this.f25021b.size();
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        e();
        return this.f25021b.toString();
    }
}
