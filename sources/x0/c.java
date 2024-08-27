package x0;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes.dex */
public abstract class c extends vt.d implements w0.c {
    @Override // java.util.Collection, java.util.List, w0.c
    public w0.c addAll(Collection collection) {
        f l10 = l();
        l10.addAll(collection);
        return l10.g();
    }

    @Override // vt.b, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    @Override // vt.b, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Collection collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // vt.d, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // vt.d, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // vt.d, java.util.List
    public final List subList(int i10, int i11) {
        return new w0.a(this, i10, i11);
    }
}
