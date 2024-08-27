package lp;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.SortedSet;

/* loaded from: classes2.dex */
public final class u1 extends t1 implements SortedSet {
    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return ((SortedSet) this.f25058a).comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        Iterator it = this.f25058a.iterator();
        it.getClass();
        kp.h hVar = this.f25059b;
        hVar.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            if (hVar.apply(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [lp.t1, java.util.SortedSet] */
    @Override // java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        return new t1(((SortedSet) this.f25058a).headSet(obj), this.f25059b);
    }

    @Override // java.util.SortedSet
    public final Object last() {
        SortedSet sortedSet = (SortedSet) this.f25058a;
        while (true) {
            Object last = sortedSet.last();
            if (this.f25059b.apply(last)) {
                return last;
            }
            sortedSet = sortedSet.headSet(last);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [lp.t1, java.util.SortedSet] */
    @Override // java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return new t1(((SortedSet) this.f25058a).subSet(obj, obj2), this.f25059b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [lp.t1, java.util.SortedSet] */
    @Override // java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        return new t1(((SortedSet) this.f25058a).tailSet(obj), this.f25059b);
    }
}
