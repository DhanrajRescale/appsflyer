package wt;

import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.jvm.internal.Intrinsics;
import vt.d;
import vt.t;
import vt.x;

/* loaded from: classes2.dex */
public final class b extends vt.l implements RandomAccess, Serializable {

    /* renamed from: a */
    public Object[] f39450a;

    /* renamed from: b */
    public final int f39451b;

    /* renamed from: c */
    public int f39452c;

    /* renamed from: d */
    public final b f39453d;

    /* renamed from: e */
    public final c f39454e;

    public b(Object[] backing, int i10, int i11, b bVar, c root) {
        int i12;
        Intrinsics.checkNotNullParameter(backing, "backing");
        Intrinsics.checkNotNullParameter(root, "root");
        this.f39450a = backing;
        this.f39451b = i10;
        this.f39452c = i11;
        this.f39453d = bVar;
        this.f39454e = root;
        i12 = ((AbstractList) root).modCount;
        ((AbstractList) this).modCount = i12;
    }

    public static final /* synthetic */ int g(b bVar) {
        return ((AbstractList) bVar).modCount;
    }

    private final Object writeReplace() {
        if (this.f39454e.f39458c) {
            return new j(0, this);
        }
        throw new NotSerializableException("The list cannot be serialized while it is being built.");
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m();
        k();
        i(this.f39451b + this.f39452c, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        m();
        k();
        int size = elements.size();
        h(this.f39451b + this.f39452c, size, elements);
        return size > 0;
    }

    @Override // vt.l
    /* renamed from: b */
    public final int getF38332c() {
        k();
        return this.f39452c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        m();
        k();
        p(this.f39451b, this.f39452c);
    }

    @Override // vt.l
    public final Object e(int i10) {
        m();
        k();
        d.Companion companion = vt.d.INSTANCE;
        int i11 = this.f39452c;
        companion.getClass();
        d.Companion.a(i10, i11);
        return o(this.f39451b + i10);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        k();
        if (obj != this) {
            if (obj instanceof List) {
                if (zq.f.s(this.f39450a, this.f39451b, this.f39452c, (List) obj)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        k();
        d.Companion companion = vt.d.INSTANCE;
        int i11 = this.f39452c;
        companion.getClass();
        d.Companion.a(i10, i11);
        return this.f39450a[this.f39451b + i10];
    }

    public final void h(int i10, int i11, Collection collection) {
        ((AbstractList) this).modCount++;
        c cVar = this.f39454e;
        b bVar = this.f39453d;
        if (bVar != null) {
            bVar.h(i10, i11, collection);
        } else {
            c cVar2 = c.f39455d;
            cVar.h(i10, i11, collection);
        }
        this.f39450a = cVar.f39456a;
        this.f39452c += i11;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10;
        k();
        Object[] objArr = this.f39450a;
        int i11 = this.f39452c;
        int i12 = 1;
        for (int i13 = 0; i13 < i11; i13++) {
            Object obj = objArr[this.f39451b + i13];
            int i14 = i12 * 31;
            if (obj != null) {
                i10 = obj.hashCode();
            } else {
                i10 = 0;
            }
            i12 = i14 + i10;
        }
        return i12;
    }

    public final void i(int i10, Object obj) {
        ((AbstractList) this).modCount++;
        c cVar = this.f39454e;
        b bVar = this.f39453d;
        if (bVar != null) {
            bVar.i(i10, obj);
        } else {
            c cVar2 = c.f39455d;
            cVar.i(i10, obj);
        }
        this.f39450a = cVar.f39456a;
        this.f39452c++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        k();
        for (int i10 = 0; i10 < this.f39452c; i10++) {
            if (Intrinsics.a(this.f39450a[this.f39451b + i10], obj)) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        k();
        if (this.f39452c == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final void k() {
        int i10;
        i10 = ((AbstractList) this.f39454e).modCount;
        if (i10 == ((AbstractList) this).modCount) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        k();
        for (int i10 = this.f39452c - 1; i10 >= 0; i10--) {
            if (Intrinsics.a(this.f39450a[this.f39451b + i10], obj)) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    public final void m() {
        if (!this.f39454e.f39458c) {
        } else {
            throw new UnsupportedOperationException();
        }
    }

    public final Object o(int i10) {
        Object o10;
        ((AbstractList) this).modCount++;
        b bVar = this.f39453d;
        if (bVar != null) {
            o10 = bVar.o(i10);
        } else {
            c cVar = c.f39455d;
            o10 = this.f39454e.o(i10);
        }
        this.f39452c--;
        return o10;
    }

    public final void p(int i10, int i11) {
        if (i11 > 0) {
            ((AbstractList) this).modCount++;
        }
        b bVar = this.f39453d;
        if (bVar != null) {
            bVar.p(i10, i11);
        } else {
            c cVar = c.f39455d;
            this.f39454e.p(i10, i11);
        }
        this.f39452c -= i11;
    }

    public final int q(int i10, int i11, Collection collection, boolean z10) {
        int q10;
        b bVar = this.f39453d;
        if (bVar != null) {
            q10 = bVar.q(i10, i11, collection, z10);
        } else {
            c cVar = c.f39455d;
            q10 = this.f39454e.q(i10, i11, collection, z10);
        }
        if (q10 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f39452c -= q10;
        return q10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        m();
        k();
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            e(indexOf);
        }
        if (indexOf >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        m();
        k();
        if (q(this.f39451b, this.f39452c, elements, false) <= 0) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        m();
        k();
        if (q(this.f39451b, this.f39452c, elements, true) > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        m();
        k();
        d.Companion companion = vt.d.INSTANCE;
        int i11 = this.f39452c;
        companion.getClass();
        d.Companion.a(i10, i11);
        Object[] objArr = this.f39450a;
        int i12 = this.f39451b + i10;
        Object obj2 = objArr[i12];
        objArr[i12] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i10, int i11) {
        d.Companion companion = vt.d.INSTANCE;
        int i12 = this.f39452c;
        companion.getClass();
        d.Companion.c(i10, i11, i12);
        return new b(this.f39450a, this.f39451b + i10, i11 - i10, this, this.f39454e);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        k();
        int length = array.length;
        int i10 = this.f39452c;
        int i11 = this.f39451b;
        if (length < i10) {
            Object[] copyOfRange = Arrays.copyOfRange(this.f39450a, i11, i10 + i11, array.getClass());
            Intrinsics.checkNotNullExpressionValue(copyOfRange, "copyOfRange(...)");
            return copyOfRange;
        }
        t.f(this.f39450a, 0, array, i11, i10 + i11);
        x.b(this.f39452c, array);
        return array;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        k();
        return zq.f.t(this.f39450a, this.f39451b, this.f39452c, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i10) {
        k();
        d.Companion companion = vt.d.INSTANCE;
        int i11 = this.f39452c;
        companion.getClass();
        d.Companion.b(i10, i11);
        return new e1.x(this, i10);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        m();
        k();
        d.Companion companion = vt.d.INSTANCE;
        int i11 = this.f39452c;
        companion.getClass();
        d.Companion.b(i10, i11);
        i(this.f39451b + i10, obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i10, Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        m();
        k();
        d.Companion companion = vt.d.INSTANCE;
        int i11 = this.f39452c;
        companion.getClass();
        d.Companion.b(i10, i11);
        int size = elements.size();
        h(this.f39451b + i10, size, elements);
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        k();
        Object[] objArr = this.f39450a;
        int i10 = this.f39452c;
        int i11 = this.f39451b;
        return t.j(i11, i10 + i11, objArr);
    }
}
