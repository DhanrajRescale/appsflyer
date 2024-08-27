package lp;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public abstract class o0 extends i0 implements List, RandomAccess {

    /* renamed from: b, reason: collision with root package name */
    public static final l0 f25025b = new l0(0, j1.f24998e);

    public static j1 o(int i10, Object[] objArr) {
        if (i10 == 0) {
            return j1.f24998e;
        }
        return new j1(objArr, i10);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [lp.h0, lp.k0] */
    public static k0 p() {
        return new h0();
    }

    public static o0 q(Collection collection) {
        if (collection instanceof i0) {
            o0 b10 = ((i0) collection).b();
            if (b10.k()) {
                Object[] array = b10.toArray(i0.f24994a);
                return o(array.length, array);
            }
            return b10;
        }
        Object[] array2 = collection.toArray();
        g0.a(array2.length, array2);
        return o(array2.length, array2);
    }

    public static j1 r(Object[] objArr) {
        if (objArr.length == 0) {
            return j1.f24998e;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        g0.a(objArr2.length, objArr2);
        return o(objArr2.length, objArr2);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public static j1 t() {
        return j1.f24998e;
    }

    public static j1 u(Long l10, Long l11, Long l12, Long l13, Long l14) {
        Object[] objArr = {l10, l11, l12, l13, l14};
        g0.a(5, objArr);
        return o(5, objArr);
    }

    public static j1 v(Object obj) {
        Object[] objArr = {obj};
        g0.a(1, objArr);
        return o(1, objArr);
    }

    @Override // java.util.List
    public final void add(int i10, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i10, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // lp.i0
    public final o0 b() {
        return this;
    }

    @Override // lp.i0, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (indexOf(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // lp.i0
    public int e(int i10, Object[] objArr) {
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            objArr[i10 + i11] = get(i11);
        }
        return i10 + size;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    for (int i10 = 0; i10 < size; i10++) {
                        if (pn.e.g(get(i10), list.get(i10))) {
                        }
                    }
                    return true;
                }
                Iterator it = iterator();
                Iterator it2 = list.iterator();
                while (it.hasNext()) {
                    if (it2.hasNext() && pn.e.g(it.next(), it2.next())) {
                    }
                }
                return !it2.hasNext();
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i10 = 1;
        for (int i11 = 0; i11 < size; i11++) {
            i10 = ~(~(get(i11).hashCode() + (i10 * 31)));
        }
        return i10;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (obj.equals(get(i10))) {
                return i10;
            }
        }
        return -1;
    }

    @Override // lp.i0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // lp.i0
    /* renamed from: m */
    public final y1 iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final Object remove(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public final l0 listIterator(int i10) {
        dp.b.T0(i10, size());
        if (isEmpty()) {
            return f25025b;
        }
        return new l0(i10, this);
    }

    @Override // java.util.List
    public final Object set(int i10, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public o0 subList(int i10, int i11) {
        dp.b.U0(i10, i11, size());
        int i12 = i11 - i10;
        if (i12 == size()) {
            return this;
        }
        if (i12 == 0) {
            return j1.f24998e;
        }
        return new n0(this, i10, i12);
    }

    @Override // lp.i0
    public Object writeReplace() {
        return new m0(toArray(i0.f24994a));
    }

    public ListIterator listIterator() {
        return listIterator(0);
    }
}
