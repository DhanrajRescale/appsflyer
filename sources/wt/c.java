package wt;

import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.jvm.internal.Intrinsics;
import vt.d;
import vt.t;
import vt.x;

/* loaded from: classes2.dex */
public final class c extends vt.l implements RandomAccess, Serializable {

    /* renamed from: d, reason: collision with root package name */
    public static final c f39455d;

    /* renamed from: a, reason: collision with root package name */
    public Object[] f39456a;

    /* renamed from: b, reason: collision with root package name */
    public int f39457b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f39458c;

    static {
        c cVar = new c(0);
        cVar.f39458c = true;
        f39455d = cVar;
    }

    public c() {
        this(10);
    }

    private final Object writeReplace() {
        if (this.f39458c) {
            return new j(0, this);
        }
        throw new NotSerializableException("The list cannot be serialized while it is being built.");
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        k();
        int i10 = this.f39457b;
        ((AbstractList) this).modCount++;
        m(i10, 1);
        this.f39456a[i10] = obj;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        k();
        int size = elements.size();
        h(this.f39457b, size, elements);
        return size > 0;
    }

    @Override // vt.l
    /* renamed from: b */
    public final int getF38332c() {
        return this.f39457b;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        k();
        p(0, this.f39457b);
    }

    @Override // vt.l
    public final Object e(int i10) {
        k();
        d.Companion companion = vt.d.INSTANCE;
        int i11 = this.f39457b;
        companion.getClass();
        d.Companion.a(i10, i11);
        return o(i10);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof List)) {
                return false;
            }
            if (!zq.f.s(this.f39456a, 0, this.f39457b, (List) obj)) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        d.Companion companion = vt.d.INSTANCE;
        int i11 = this.f39457b;
        companion.getClass();
        d.Companion.a(i10, i11);
        return this.f39456a[i10];
    }

    public final void h(int i10, int i11, Collection collection) {
        ((AbstractList) this).modCount++;
        m(i10, i11);
        Iterator it = collection.iterator();
        for (int i12 = 0; i12 < i11; i12++) {
            this.f39456a[i10 + i12] = it.next();
        }
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10;
        Object[] objArr = this.f39456a;
        int i11 = this.f39457b;
        int i12 = 1;
        for (int i13 = 0; i13 < i11; i13++) {
            Object obj = objArr[i13];
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
        m(i10, 1);
        this.f39456a[i10] = obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        for (int i10 = 0; i10 < this.f39457b; i10++) {
            if (Intrinsics.a(this.f39456a[i10], obj)) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f39457b == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final void k() {
        if (!this.f39458c) {
        } else {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        for (int i10 = this.f39457b - 1; i10 >= 0; i10--) {
            if (Intrinsics.a(this.f39456a[i10], obj)) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    public final void m(int i10, int i11) {
        int i12 = this.f39457b + i11;
        if (i12 >= 0) {
            Object[] objArr = this.f39456a;
            if (i12 > objArr.length) {
                d.Companion companion = vt.d.INSTANCE;
                int length = objArr.length;
                companion.getClass();
                int d10 = d.Companion.d(length, i12);
                Object[] objArr2 = this.f39456a;
                Intrinsics.checkNotNullParameter(objArr2, "<this>");
                Object[] copyOf = Arrays.copyOf(objArr2, d10);
                Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
                this.f39456a = copyOf;
            }
            Object[] objArr3 = this.f39456a;
            t.f(objArr3, i10 + i11, objArr3, i10, this.f39457b);
            this.f39457b += i11;
            return;
        }
        throw new OutOfMemoryError();
    }

    public final Object o(int i10) {
        ((AbstractList) this).modCount++;
        Object[] objArr = this.f39456a;
        Object obj = objArr[i10];
        t.f(objArr, i10, objArr, i10 + 1, this.f39457b);
        Object[] objArr2 = this.f39456a;
        int i11 = this.f39457b - 1;
        Intrinsics.checkNotNullParameter(objArr2, "<this>");
        objArr2[i11] = null;
        this.f39457b--;
        return obj;
    }

    public final void p(int i10, int i11) {
        if (i11 > 0) {
            ((AbstractList) this).modCount++;
        }
        Object[] objArr = this.f39456a;
        t.f(objArr, i10, objArr, i10 + i11, this.f39457b);
        Object[] objArr2 = this.f39456a;
        int i12 = this.f39457b;
        zq.f.e0(i12 - i11, i12, objArr2);
        this.f39457b -= i11;
    }

    public final int q(int i10, int i11, Collection collection, boolean z10) {
        int i12 = 0;
        int i13 = 0;
        while (i12 < i11) {
            int i14 = i10 + i12;
            if (collection.contains(this.f39456a[i14]) == z10) {
                Object[] objArr = this.f39456a;
                i12++;
                objArr[i13 + i10] = objArr[i14];
                i13++;
            } else {
                i12++;
            }
        }
        int i15 = i11 - i13;
        Object[] objArr2 = this.f39456a;
        t.f(objArr2, i10 + i13, objArr2, i11 + i10, this.f39457b);
        Object[] objArr3 = this.f39456a;
        int i16 = this.f39457b;
        zq.f.e0(i16 - i15, i16, objArr3);
        if (i15 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f39457b -= i15;
        return i15;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
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
        k();
        if (q(0, this.f39457b, elements, false) <= 0) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        k();
        if (q(0, this.f39457b, elements, true) <= 0) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        k();
        d.Companion companion = vt.d.INSTANCE;
        int i11 = this.f39457b;
        companion.getClass();
        d.Companion.a(i10, i11);
        Object[] objArr = this.f39456a;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i10, int i11) {
        d.Companion companion = vt.d.INSTANCE;
        int i12 = this.f39457b;
        companion.getClass();
        d.Companion.c(i10, i11, i12);
        return new b(this.f39456a, i10, i11 - i10, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        int length = array.length;
        int i10 = this.f39457b;
        if (length < i10) {
            Object[] copyOfRange = Arrays.copyOfRange(this.f39456a, 0, i10, array.getClass());
            Intrinsics.checkNotNullExpressionValue(copyOfRange, "copyOfRange(...)");
            return copyOfRange;
        }
        t.f(this.f39456a, 0, array, 0, i10);
        x.b(this.f39457b, array);
        return array;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return zq.f.t(this.f39456a, 0, this.f39457b, this);
    }

    public c(int i10) {
        if (i10 >= 0) {
            this.f39456a = new Object[i10];
            return;
        }
        throw new IllegalArgumentException("capacity must be non-negative.".toString());
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i10) {
        d.Companion companion = vt.d.INSTANCE;
        int i11 = this.f39457b;
        companion.getClass();
        d.Companion.b(i10, i11);
        return new e1.x(this, i10);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        k();
        d.Companion companion = vt.d.INSTANCE;
        int i11 = this.f39457b;
        companion.getClass();
        d.Companion.b(i10, i11);
        ((AbstractList) this).modCount++;
        m(i10, 1);
        this.f39456a[i10] = obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i10, Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        k();
        d.Companion companion = vt.d.INSTANCE;
        int i11 = this.f39457b;
        companion.getClass();
        d.Companion.b(i10, i11);
        int size = elements.size();
        h(i10, size, elements);
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return t.j(0, this.f39457b, this.f39456a);
    }
}
