package lp;

import java.util.Iterator;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.SortedSet;

/* loaded from: classes2.dex */
public final class k extends n implements NavigableSet {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r f25001e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(r rVar, NavigableMap navigableMap) {
        super(rVar, navigableMap);
        this.f25001e = rVar;
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        return b().ceilingKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Iterator descendingIterator() {
        return ((i) descendingSet()).iterator();
    }

    @Override // java.util.NavigableSet
    public final NavigableSet descendingSet() {
        return new k(this.f25001e, b().descendingMap());
    }

    @Override // lp.n
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final NavigableMap b() {
        return (NavigableMap) ((SortedMap) this.f24992b);
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        return b().floorKey(obj);
    }

    @Override // lp.n, java.util.SortedSet, java.util.NavigableSet
    public final SortedSet headSet(Object obj) {
        return headSet(obj, false);
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        return b().higherKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        return b().lowerKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        f fVar = (f) iterator();
        if (fVar.hasNext()) {
            Object next = fVar.next();
            fVar.remove();
            return next;
        }
        return null;
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        Iterator descendingIterator = descendingIterator();
        if (descendingIterator.hasNext()) {
            Object next = descendingIterator.next();
            descendingIterator.remove();
            return next;
        }
        return null;
    }

    @Override // lp.n, java.util.SortedSet, java.util.NavigableSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // lp.n, java.util.SortedSet, java.util.NavigableSet
    public final SortedSet tailSet(Object obj) {
        return tailSet(obj, true);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z10) {
        return new k(this.f25001e, b().headMap(obj, z10));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet subSet(Object obj, boolean z10, Object obj2, boolean z11) {
        return new k(this.f25001e, b().subMap(obj, z10, obj2, z11));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z10) {
        return new k(this.f25001e, b().tailMap(obj, z10));
    }
}
