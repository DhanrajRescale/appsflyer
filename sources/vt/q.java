package vt;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import vt.d;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u0005*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001\u0006B\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lvt/q;", "E", "Lvt/l;", "<init>", "()V", "d", "a", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class q<E> extends l {

    /* renamed from: e, reason: collision with root package name */
    public static final Object[] f38329e = new Object[0];

    /* renamed from: a, reason: collision with root package name */
    public int f38330a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f38331b = f38329e;

    /* renamed from: c, reason: collision with root package name */
    public int f38332c;

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        h(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (elements.isEmpty()) {
            return false;
        }
        s();
        k(elements.size() + getF38332c());
        i(r(getF38332c() + this.f38330a), elements);
        return true;
    }

    @Override // vt.l
    /* renamed from: b, reason: from getter */
    public final int getF38332c() {
        return this.f38332c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            s();
            q(this.f38330a, r(getF38332c() + this.f38330a));
        }
        this.f38330a = 0;
        this.f38332c = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    @Override // vt.l
    public final Object e(int i10) {
        d.Companion companion = d.INSTANCE;
        int i11 = this.f38332c;
        companion.getClass();
        d.Companion.a(i10, i11);
        if (i10 == y.f(this)) {
            return u();
        }
        if (i10 == 0) {
            return t();
        }
        s();
        int r10 = r(this.f38330a + i10);
        Object[] objArr = this.f38331b;
        Object obj = objArr[r10];
        if (i10 < (this.f38332c >> 1)) {
            int i12 = this.f38330a;
            if (r10 >= i12) {
                t.f(objArr, i12 + 1, objArr, i12, r10);
            } else {
                t.f(objArr, 1, objArr, 0, r10);
                Object[] objArr2 = this.f38331b;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i13 = this.f38330a;
                t.f(objArr2, i13 + 1, objArr2, i13, objArr2.length - 1);
            }
            Object[] objArr3 = this.f38331b;
            int i14 = this.f38330a;
            objArr3[i14] = null;
            this.f38330a = m(i14);
        } else {
            int r11 = r(y.f(this) + this.f38330a);
            if (r10 <= r11) {
                Object[] objArr4 = this.f38331b;
                t.f(objArr4, r10, objArr4, r10 + 1, r11 + 1);
            } else {
                Object[] objArr5 = this.f38331b;
                t.f(objArr5, r10, objArr5, r10 + 1, objArr5.length);
                Object[] objArr6 = this.f38331b;
                objArr6[objArr6.length - 1] = objArr6[0];
                t.f(objArr6, 0, objArr6, 1, r11 + 1);
            }
            this.f38331b[r11] = null;
        }
        this.f38332c--;
        return obj;
    }

    public final Object first() {
        if (!isEmpty()) {
            return this.f38331b[this.f38330a];
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    public final void g(Object obj) {
        int i10;
        s();
        k(this.f38332c + 1);
        int i11 = this.f38330a;
        if (i11 == 0) {
            i10 = v.r(this.f38331b);
        } else {
            i10 = i11 - 1;
        }
        this.f38330a = i10;
        this.f38331b[i10] = obj;
        this.f38332c++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        d.Companion companion = d.INSTANCE;
        int i11 = this.f38332c;
        companion.getClass();
        d.Companion.a(i10, i11);
        return this.f38331b[r(this.f38330a + i10)];
    }

    public final void h(Object obj) {
        s();
        k(getF38332c() + 1);
        this.f38331b[r(getF38332c() + this.f38330a)] = obj;
        this.f38332c = getF38332c() + 1;
    }

    public final void i(int i10, Collection collection) {
        Iterator<E> it = collection.iterator();
        int length = this.f38331b.length;
        while (i10 < length && it.hasNext()) {
            this.f38331b[i10] = it.next();
            i10++;
        }
        int i11 = this.f38330a;
        for (int i12 = 0; i12 < i11 && it.hasNext(); i12++) {
            this.f38331b[i12] = it.next();
        }
        this.f38332c = collection.size() + getF38332c();
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i10;
        int r10 = r(getF38332c() + this.f38330a);
        int i11 = this.f38330a;
        if (i11 < r10) {
            while (i11 < r10) {
                if (Intrinsics.a(obj, this.f38331b[i11])) {
                    i10 = this.f38330a;
                } else {
                    i11++;
                }
            }
            return -1;
        }
        if (i11 >= r10) {
            int length = this.f38331b.length;
            while (true) {
                if (i11 < length) {
                    if (Intrinsics.a(obj, this.f38331b[i11])) {
                        i10 = this.f38330a;
                        break;
                    }
                    i11++;
                } else {
                    for (int i12 = 0; i12 < r10; i12++) {
                        if (Intrinsics.a(obj, this.f38331b[i12])) {
                            i11 = i12 + this.f38331b.length;
                            i10 = this.f38330a;
                        }
                    }
                    return -1;
                }
            }
        } else {
            return -1;
        }
        return i11 - i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        if (getF38332c() == 0) {
            return true;
        }
        return false;
    }

    public final void k(int i10) {
        if (i10 >= 0) {
            Object[] objArr = this.f38331b;
            if (i10 <= objArr.length) {
                return;
            }
            if (objArr == f38329e) {
                if (i10 < 10) {
                    i10 = 10;
                }
                this.f38331b = new Object[i10];
                return;
            }
            d.Companion companion = d.INSTANCE;
            int length = objArr.length;
            companion.getClass();
            Object[] objArr2 = new Object[d.Companion.d(length, i10)];
            Object[] objArr3 = this.f38331b;
            t.f(objArr3, 0, objArr2, this.f38330a, objArr3.length);
            Object[] objArr4 = this.f38331b;
            int length2 = objArr4.length;
            int i11 = this.f38330a;
            t.f(objArr4, length2 - i11, objArr2, 0, i11);
            this.f38330a = 0;
            this.f38331b = objArr2;
            return;
        }
        throw new IllegalStateException("Deque is too big.");
    }

    public final Object last() {
        if (!isEmpty()) {
            return this.f38331b[r(y.f(this) + this.f38330a)];
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int r10;
        int i10;
        int r11 = r(getF38332c() + this.f38330a);
        int i11 = this.f38330a;
        if (i11 < r11) {
            r10 = r11 - 1;
            if (i11 <= r10) {
                while (!Intrinsics.a(obj, this.f38331b[r10])) {
                    if (r10 != i11) {
                        r10--;
                    }
                }
                i10 = this.f38330a;
                return r10 - i10;
            }
            return -1;
        }
        if (i11 > r11) {
            int i12 = r11 - 1;
            while (true) {
                if (-1 < i12) {
                    if (Intrinsics.a(obj, this.f38331b[i12])) {
                        r10 = i12 + this.f38331b.length;
                        i10 = this.f38330a;
                        break;
                    }
                    i12--;
                } else {
                    r10 = v.r(this.f38331b);
                    int i13 = this.f38330a;
                    if (i13 <= r10) {
                        while (!Intrinsics.a(obj, this.f38331b[r10])) {
                            if (r10 != i13) {
                                r10--;
                            }
                        }
                        i10 = this.f38330a;
                    }
                }
            }
        }
        return -1;
    }

    public final int m(int i10) {
        if (i10 == v.r(this.f38331b)) {
            return 0;
        }
        return i10 + 1;
    }

    public final Object o() {
        if (isEmpty()) {
            return null;
        }
        return this.f38331b[r(y.f(this) + this.f38330a)];
    }

    public final int p(int i10) {
        if (i10 < 0) {
            return i10 + this.f38331b.length;
        }
        return i10;
    }

    public final void q(int i10, int i11) {
        if (i10 < i11) {
            t.k(i10, i11, this.f38331b);
            return;
        }
        Object[] objArr = this.f38331b;
        t.k(i10, objArr.length, objArr);
        t.k(0, i11, this.f38331b);
    }

    public final int r(int i10) {
        Object[] objArr = this.f38331b;
        if (i10 >= objArr.length) {
            return i10 - objArr.length;
        }
        return i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        e(indexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection elements) {
        int r10;
        Intrinsics.checkNotNullParameter(elements, "elements");
        boolean z10 = false;
        z10 = false;
        z10 = false;
        if (!isEmpty() && this.f38331b.length != 0) {
            int r11 = r(this.f38332c + this.f38330a);
            int i10 = this.f38330a;
            if (i10 < r11) {
                r10 = i10;
                while (i10 < r11) {
                    Object obj = this.f38331b[i10];
                    if (!elements.contains(obj)) {
                        this.f38331b[r10] = obj;
                        r10++;
                    } else {
                        z10 = true;
                    }
                    i10++;
                }
                t.k(r10, r11, this.f38331b);
            } else {
                int length = this.f38331b.length;
                boolean z11 = false;
                int i11 = i10;
                while (i10 < length) {
                    Object[] objArr = this.f38331b;
                    Object obj2 = objArr[i10];
                    objArr[i10] = null;
                    if (!elements.contains(obj2)) {
                        this.f38331b[i11] = obj2;
                        i11++;
                    } else {
                        z11 = true;
                    }
                    i10++;
                }
                r10 = r(i11);
                for (int i12 = 0; i12 < r11; i12++) {
                    Object[] objArr2 = this.f38331b;
                    Object obj3 = objArr2[i12];
                    objArr2[i12] = null;
                    if (!elements.contains(obj3)) {
                        this.f38331b[r10] = obj3;
                        r10 = m(r10);
                    } else {
                        z11 = true;
                    }
                }
                z10 = z11;
            }
            if (z10) {
                s();
                this.f38332c = p(r10 - this.f38330a);
            }
        }
        return z10;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        d.Companion companion = d.INSTANCE;
        int i12 = this.f38332c;
        companion.getClass();
        d.Companion.c(i10, i11, i12);
        int i13 = i11 - i10;
        if (i13 == 0) {
            return;
        }
        if (i13 == this.f38332c) {
            clear();
            return;
        }
        if (i13 == 1) {
            e(i10);
            return;
        }
        s();
        if (i10 < this.f38332c - i11) {
            int r10 = r((i10 - 1) + this.f38330a);
            int r11 = r((i11 - 1) + this.f38330a);
            while (i10 > 0) {
                int i14 = r10 + 1;
                int min = Math.min(i10, Math.min(i14, r11 + 1));
                Object[] objArr = this.f38331b;
                int i15 = r11 - min;
                int i16 = r10 - min;
                t.f(objArr, i15 + 1, objArr, i16 + 1, i14);
                r10 = p(i16);
                r11 = p(i15);
                i10 -= min;
            }
            int r12 = r(this.f38330a + i13);
            q(this.f38330a, r12);
            this.f38330a = r12;
        } else {
            int r13 = r(this.f38330a + i11);
            int r14 = r(this.f38330a + i10);
            int i17 = this.f38332c;
            while (true) {
                i17 -= i11;
                if (i17 <= 0) {
                    break;
                }
                Object[] objArr2 = this.f38331b;
                i11 = Math.min(i17, Math.min(objArr2.length - r13, objArr2.length - r14));
                Object[] objArr3 = this.f38331b;
                int i18 = r13 + i11;
                t.f(objArr3, r14, objArr3, r13, i18);
                r13 = r(i18);
                r14 = r(r14 + i11);
            }
            int r15 = r(this.f38332c + this.f38330a);
            q(p(r15 - i13), r15);
        }
        this.f38332c -= i13;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection elements) {
        int r10;
        Intrinsics.checkNotNullParameter(elements, "elements");
        boolean z10 = false;
        z10 = false;
        z10 = false;
        if (!isEmpty() && this.f38331b.length != 0) {
            int r11 = r(this.f38332c + this.f38330a);
            int i10 = this.f38330a;
            if (i10 < r11) {
                r10 = i10;
                while (i10 < r11) {
                    Object obj = this.f38331b[i10];
                    if (elements.contains(obj)) {
                        this.f38331b[r10] = obj;
                        r10++;
                    } else {
                        z10 = true;
                    }
                    i10++;
                }
                t.k(r10, r11, this.f38331b);
            } else {
                int length = this.f38331b.length;
                boolean z11 = false;
                int i11 = i10;
                while (i10 < length) {
                    Object[] objArr = this.f38331b;
                    Object obj2 = objArr[i10];
                    objArr[i10] = null;
                    if (elements.contains(obj2)) {
                        this.f38331b[i11] = obj2;
                        i11++;
                    } else {
                        z11 = true;
                    }
                    i10++;
                }
                r10 = r(i11);
                for (int i12 = 0; i12 < r11; i12++) {
                    Object[] objArr2 = this.f38331b;
                    Object obj3 = objArr2[i12];
                    objArr2[i12] = null;
                    if (elements.contains(obj3)) {
                        this.f38331b[r10] = obj3;
                        r10 = m(r10);
                    } else {
                        z11 = true;
                    }
                }
                z10 = z11;
            }
            if (z10) {
                s();
                this.f38332c = p(r10 - this.f38330a);
            }
        }
        return z10;
    }

    public final void s() {
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        d.Companion companion = d.INSTANCE;
        int i11 = this.f38332c;
        companion.getClass();
        d.Companion.a(i10, i11);
        int r10 = r(this.f38330a + i10);
        Object[] objArr = this.f38331b;
        Object obj2 = objArr[r10];
        objArr[r10] = obj;
        return obj2;
    }

    public final Object t() {
        if (!isEmpty()) {
            s();
            Object[] objArr = this.f38331b;
            int i10 = this.f38330a;
            Object obj = objArr[i10];
            objArr[i10] = null;
            this.f38330a = m(i10);
            this.f38332c = getF38332c() - 1;
            return obj;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[getF38332c()]);
    }

    public final Object u() {
        if (!isEmpty()) {
            s();
            int r10 = r(y.f(this) + this.f38330a);
            Object[] objArr = this.f38331b;
            Object obj = objArr[r10];
            objArr[r10] = null;
            this.f38332c = getF38332c() - 1;
            return obj;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        d.Companion companion = d.INSTANCE;
        int i11 = this.f38332c;
        companion.getClass();
        d.Companion.b(i10, i11);
        if (i10 == this.f38332c) {
            h(obj);
            return;
        }
        if (i10 == 0) {
            g(obj);
            return;
        }
        s();
        k(this.f38332c + 1);
        int r10 = r(this.f38330a + i10);
        int i12 = this.f38332c;
        if (i10 < ((i12 + 1) >> 1)) {
            int r11 = r10 == 0 ? v.r(this.f38331b) : r10 - 1;
            int i13 = this.f38330a;
            int r12 = i13 == 0 ? v.r(this.f38331b) : i13 - 1;
            int i14 = this.f38330a;
            if (r11 >= i14) {
                Object[] objArr = this.f38331b;
                objArr[r12] = objArr[i14];
                t.f(objArr, i14, objArr, i14 + 1, r11 + 1);
            } else {
                Object[] objArr2 = this.f38331b;
                t.f(objArr2, i14 - 1, objArr2, i14, objArr2.length);
                Object[] objArr3 = this.f38331b;
                objArr3[objArr3.length - 1] = objArr3[0];
                t.f(objArr3, 0, objArr3, 1, r11 + 1);
            }
            this.f38331b[r11] = obj;
            this.f38330a = r12;
        } else {
            int r13 = r(i12 + this.f38330a);
            if (r10 < r13) {
                Object[] objArr4 = this.f38331b;
                t.f(objArr4, r10 + 1, objArr4, r10, r13);
            } else {
                Object[] objArr5 = this.f38331b;
                t.f(objArr5, 1, objArr5, 0, r13);
                Object[] objArr6 = this.f38331b;
                objArr6[0] = objArr6[objArr6.length - 1];
                t.f(objArr6, r10 + 1, objArr6, r10, objArr6.length - 1);
            }
            this.f38331b[r10] = obj;
        }
        this.f38332c++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] reference) {
        Intrinsics.checkNotNullParameter(reference, "array");
        int length = reference.length;
        int i10 = this.f38332c;
        if (length < i10) {
            Intrinsics.checkNotNullParameter(reference, "reference");
            Object newInstance = Array.newInstance(reference.getClass().getComponentType(), i10);
            Intrinsics.d(newInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
            reference = (Object[]) newInstance;
        }
        int r10 = r(this.f38332c + this.f38330a);
        int i11 = this.f38330a;
        if (i11 < r10) {
            t.h(this.f38331b, reference, i11, r10, 2);
        } else if (!isEmpty()) {
            Object[] objArr = this.f38331b;
            t.f(objArr, 0, reference, this.f38330a, objArr.length);
            Object[] objArr2 = this.f38331b;
            t.f(objArr2, objArr2.length - this.f38330a, reference, 0, r10);
        }
        x.b(this.f38332c, reference);
        return reference;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i10, Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        d.Companion companion = d.INSTANCE;
        int i11 = this.f38332c;
        companion.getClass();
        d.Companion.b(i10, i11);
        if (elements.isEmpty()) {
            return false;
        }
        if (i10 == this.f38332c) {
            return addAll(elements);
        }
        s();
        k(elements.size() + this.f38332c);
        int r10 = r(this.f38332c + this.f38330a);
        int r11 = r(this.f38330a + i10);
        int size = elements.size();
        if (i10 < ((this.f38332c + 1) >> 1)) {
            int i12 = this.f38330a;
            int i13 = i12 - size;
            if (r11 < i12) {
                Object[] objArr = this.f38331b;
                t.f(objArr, i13, objArr, i12, objArr.length);
                if (size >= r11) {
                    Object[] objArr2 = this.f38331b;
                    t.f(objArr2, objArr2.length - size, objArr2, 0, r11);
                } else {
                    Object[] objArr3 = this.f38331b;
                    t.f(objArr3, objArr3.length - size, objArr3, 0, size);
                    Object[] objArr4 = this.f38331b;
                    t.f(objArr4, 0, objArr4, size, r11);
                }
            } else if (i13 >= 0) {
                Object[] objArr5 = this.f38331b;
                t.f(objArr5, i13, objArr5, i12, r11);
            } else {
                Object[] objArr6 = this.f38331b;
                i13 += objArr6.length;
                int i14 = r11 - i12;
                int length = objArr6.length - i13;
                if (length >= i14) {
                    t.f(objArr6, i13, objArr6, i12, r11);
                } else {
                    t.f(objArr6, i13, objArr6, i12, i12 + length);
                    Object[] objArr7 = this.f38331b;
                    t.f(objArr7, 0, objArr7, this.f38330a + length, r11);
                }
            }
            this.f38330a = i13;
            i(p(r11 - size), elements);
        } else {
            int i15 = r11 + size;
            if (r11 < r10) {
                int i16 = size + r10;
                Object[] objArr8 = this.f38331b;
                if (i16 <= objArr8.length) {
                    t.f(objArr8, i15, objArr8, r11, r10);
                } else if (i15 >= objArr8.length) {
                    t.f(objArr8, i15 - objArr8.length, objArr8, r11, r10);
                } else {
                    int length2 = r10 - (i16 - objArr8.length);
                    t.f(objArr8, 0, objArr8, length2, r10);
                    Object[] objArr9 = this.f38331b;
                    t.f(objArr9, i15, objArr9, r11, length2);
                }
            } else {
                Object[] objArr10 = this.f38331b;
                t.f(objArr10, size, objArr10, 0, r10);
                Object[] objArr11 = this.f38331b;
                if (i15 >= objArr11.length) {
                    t.f(objArr11, i15 - objArr11.length, objArr11, r11, objArr11.length);
                } else {
                    t.f(objArr11, 0, objArr11, objArr11.length - size, objArr11.length);
                    Object[] objArr12 = this.f38331b;
                    t.f(objArr12, i15, objArr12, r11, objArr12.length - size);
                }
            }
            i(r11, elements);
        }
        return true;
    }
}
