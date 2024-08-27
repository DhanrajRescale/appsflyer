package v0;

import iu.j;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.Intrinsics;
import t0.t;

/* loaded from: classes.dex */
public final class e implements List, ju.c {

    /* renamed from: a, reason: collision with root package name */
    public final h f37647a;

    public e(h hVar) {
        this.f37647a = hVar;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        this.f37647a.b(obj);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        h hVar = this.f37647a;
        return hVar.d(hVar.f37655c, collection);
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.f37647a.g();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f37647a.h(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        h hVar = this.f37647a;
        hVar.getClass();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!hVar.h(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        t.k(i10, this);
        return this.f37647a.f37653a[i10];
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return this.f37647a.j(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f37647a.k();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new g(0, this);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        h hVar = this.f37647a;
        int i10 = hVar.f37655c;
        if (i10 > 0) {
            int i11 = i10 - 1;
            Object[] objArr = hVar.f37653a;
            while (!Intrinsics.a(obj, objArr[i11])) {
                i11--;
                if (i11 < 0) {
                }
            }
            return i11;
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new g(0, this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        return this.f37647a.m(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        h hVar = this.f37647a;
        hVar.getClass();
        if (collection.isEmpty()) {
            return false;
        }
        int i10 = hVar.f37655c;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            hVar.m(it.next());
        }
        if (i10 == hVar.f37655c) {
            return false;
        }
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        h hVar = this.f37647a;
        int i10 = hVar.f37655c;
        for (int i11 = i10 - 1; -1 < i11; i11--) {
            if (!collection.contains(hVar.f37653a[i11])) {
                hVar.n(i11);
            }
        }
        if (i10 != hVar.f37655c) {
            return true;
        }
        return false;
    }

    @Override // java.util.List
    public final Object set(int i10, Object obj) {
        t.k(i10, this);
        return this.f37647a.p(i10, obj);
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f37647a.f37655c;
    }

    @Override // java.util.List
    public final List subList(int i10, int i11) {
        t.l(i10, i11, this);
        return new f(i10, i11, this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return j.q(this);
    }

    @Override // java.util.List
    public final void add(int i10, Object obj) {
        this.f37647a.a(i10, obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i10) {
        return new g(i10, this);
    }

    @Override // java.util.List
    public final Object remove(int i10) {
        t.k(i10, this);
        return this.f37647a.n(i10);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return j.r(this, objArr);
    }

    @Override // java.util.List
    public final boolean addAll(int i10, Collection collection) {
        return this.f37647a.d(i10, collection);
    }
}
