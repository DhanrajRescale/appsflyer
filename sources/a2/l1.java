package a2;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.Predicate;

/* loaded from: classes.dex */
public final class l1 implements Collection, ju.a {

    /* renamed from: a, reason: collision with root package name */
    public final Set f104a = new LinkedHashSet();

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        return this.f104a.add(obj);
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        this.f104a.clear();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.f104a.contains(obj);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.f104a.containsAll(collection);
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f104a.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.f104a.iterator();
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        return this.f104a.remove(obj);
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        return this.f104a.remove(collection);
    }

    @Override // java.util.Collection
    public final boolean removeIf(Predicate predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        return this.f104a.retainAll(collection);
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f104a.size();
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return iu.j.q(this);
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return iu.j.r(this, objArr);
    }
}
