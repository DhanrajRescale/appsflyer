package v0;

import iu.j;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.Intrinsics;
import t0.t;

/* loaded from: classes.dex */
public final class f implements List, ju.c {

    /* renamed from: a, reason: collision with root package name */
    public final List f37648a;

    /* renamed from: b, reason: collision with root package name */
    public final int f37649b;

    /* renamed from: c, reason: collision with root package name */
    public int f37650c;

    public f(int i10, int i11, List list) {
        this.f37648a = list;
        this.f37649b = i10;
        this.f37650c = i11;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        int i10 = this.f37650c;
        this.f37650c = i10 + 1;
        this.f37648a.add(i10, obj);
        return true;
    }

    @Override // java.util.List
    public final boolean addAll(int i10, Collection collection) {
        this.f37648a.addAll(i10 + this.f37649b, collection);
        this.f37650c = collection.size() + this.f37650c;
        return collection.size() > 0;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        int i10 = this.f37650c - 1;
        int i11 = this.f37649b;
        if (i11 <= i10) {
            while (true) {
                this.f37648a.remove(i10);
                if (i10 == i11) {
                    break;
                } else {
                    i10--;
                }
            }
        }
        this.f37650c = i11;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        int i10 = this.f37650c;
        for (int i11 = this.f37649b; i11 < i10; i11++) {
            if (Intrinsics.a(this.f37648a.get(i11), obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        t.k(i10, this);
        return this.f37648a.get(i10 + this.f37649b);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        int i10 = this.f37650c;
        int i11 = this.f37649b;
        for (int i12 = i11; i12 < i10; i12++) {
            if (Intrinsics.a(this.f37648a.get(i12), obj)) {
                return i12 - i11;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f37650c == this.f37649b;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new g(0, this);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        int i10 = this.f37650c - 1;
        int i11 = this.f37649b;
        if (i11 <= i10) {
            while (!Intrinsics.a(this.f37648a.get(i10), obj)) {
                if (i10 != i11) {
                    i10--;
                } else {
                    return -1;
                }
            }
            return i10 - i11;
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new g(0, this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i10 = this.f37650c;
        for (int i11 = this.f37649b; i11 < i10; i11++) {
            List list = this.f37648a;
            if (Intrinsics.a(list.get(i11), obj)) {
                list.remove(i11);
                this.f37650c--;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i10 = this.f37650c;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
        if (i10 != this.f37650c) {
            return true;
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i10 = this.f37650c;
        int i11 = i10 - 1;
        int i12 = this.f37649b;
        if (i12 <= i11) {
            while (true) {
                List list = this.f37648a;
                if (!collection.contains(list.get(i11))) {
                    list.remove(i11);
                    this.f37650c--;
                }
                if (i11 == i12) {
                    break;
                }
                i11--;
            }
        }
        if (i10 != this.f37650c) {
            return true;
        }
        return false;
    }

    @Override // java.util.List
    public final Object set(int i10, Object obj) {
        t.k(i10, this);
        return this.f37648a.set(i10 + this.f37649b, obj);
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f37650c - this.f37649b;
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
        this.f37648a.add(i10 + this.f37649b, obj);
        this.f37650c++;
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i10) {
        return new g(i10, this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return j.r(this, objArr);
    }

    @Override // java.util.List
    public final Object remove(int i10) {
        t.k(i10, this);
        this.f37650c--;
        return this.f37648a.remove(i10 + this.f37649b);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        this.f37648a.addAll(this.f37650c, collection);
        this.f37650c = collection.size() + this.f37650c;
        return collection.size() > 0;
    }
}
