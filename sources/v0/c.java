package v0;

import iu.j;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import t.m0;
import vt.g0;
import vt.t;

/* loaded from: classes.dex */
public final class c implements Set, ju.a {

    /* renamed from: a, reason: collision with root package name */
    public int f37644a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f37645b = new Object[16];

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        int i10;
        int i11 = this.f37644a;
        Object[] objArr = this.f37645b;
        if (i11 > 0) {
            i10 = e(obj);
            if (i10 >= 0) {
                return false;
            }
        } else {
            i10 = -1;
        }
        int i12 = -(i10 + 1);
        if (i11 == objArr.length) {
            Object[] objArr2 = new Object[objArr.length * 2];
            t.f(objArr, i12 + 1, objArr2, i12, i11);
            t.h(objArr, objArr2, 0, i12, 6);
            this.f37645b = objArr2;
        } else {
            t.f(objArr, i12 + 1, objArr, i12, i11);
        }
        this.f37645b[i12] = obj;
        this.f37644a++;
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void b(c cVar) {
        boolean z10;
        boolean z11;
        Object[] objArr;
        int i10;
        Object obj;
        int i11;
        if (cVar.isEmpty()) {
            return;
        }
        Object[] objArr2 = this.f37645b;
        Object[] objArr3 = cVar.f37645b;
        int i12 = this.f37644a;
        int i13 = cVar.f37644a;
        int i14 = i12 + i13;
        if (objArr2.length < i14) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i12 != 0 && System.identityHashCode(objArr2[i12 - 1]) >= System.identityHashCode(objArr3[0])) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (!z10 && z11) {
            t.f(objArr3, i12, objArr2, 0, i13);
            this.f37644a += i13;
            return;
        }
        if (z10) {
            if (i12 > i13) {
                i11 = i12 * 2;
            } else {
                i11 = i13 * 2;
            }
            objArr = new Object[i11];
        } else {
            objArr = objArr2;
        }
        int i15 = i12 - 1;
        int i16 = i13 - 1;
        int i17 = i14 - 1;
        while (true) {
            if (i15 < 0 && i16 < 0) {
                break;
            }
            if (i15 < 0) {
                i10 = i16 - 1;
                obj = objArr3[i16];
            } else if (i16 < 0) {
                i10 = i16;
                obj = objArr2[i15];
                i15--;
            } else {
                Object obj2 = objArr2[i15];
                Object obj3 = objArr3[i16];
                int identityHashCode = System.identityHashCode(obj2);
                int identityHashCode2 = System.identityHashCode(obj3);
                if (identityHashCode > identityHashCode2) {
                    i15--;
                } else {
                    if (identityHashCode >= identityHashCode2) {
                        if (obj2 == obj3) {
                            i15--;
                            i16--;
                        } else {
                            int i18 = i15 - 1;
                            while (i18 >= 0) {
                                int i19 = i18 - 1;
                                Object obj4 = objArr2[i18];
                                if (System.identityHashCode(obj4) != identityHashCode2) {
                                    break;
                                }
                                if (obj3 == obj4) {
                                    i16--;
                                    break;
                                }
                                i18 = i19;
                            }
                        }
                    }
                    i10 = i16 - 1;
                    obj = obj3;
                }
                i10 = i16;
                obj = obj2;
            }
            objArr[i17] = obj;
            i16 = i10;
            i17--;
        }
        if (i17 >= 0) {
            t.f(objArr, 0, objArr, i17 + 1, i14);
        }
        int i20 = i14 - (i17 + 1);
        t.k(i20, i14, objArr);
        this.f37645b = objArr;
        this.f37644a = i20;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        t.m(this.f37645b);
        this.f37644a = 0;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj == null || e(obj) < 0) {
            return false;
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
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

    public final int e(Object obj) {
        int i10 = this.f37644a - 1;
        int identityHashCode = System.identityHashCode(obj);
        Object[] objArr = this.f37645b;
        int i11 = 0;
        while (i11 <= i10) {
            int i12 = (i11 + i10) >>> 1;
            Object obj2 = objArr[i12];
            int identityHashCode2 = System.identityHashCode(obj2);
            if (identityHashCode2 < identityHashCode) {
                i11 = i12 + 1;
            } else {
                if (identityHashCode2 <= identityHashCode) {
                    if (obj2 == obj) {
                        return i12;
                    }
                    Object[] objArr2 = this.f37645b;
                    int i13 = this.f37644a;
                    for (int i14 = i12 - 1; -1 < i14; i14--) {
                        Object obj3 = objArr2[i14];
                        if (obj3 != obj) {
                            if (System.identityHashCode(obj3) != identityHashCode) {
                                break;
                            }
                        } else {
                            return i14;
                        }
                    }
                    for (int i15 = i12 + 1; i15 < i13; i15++) {
                        Object obj4 = objArr2[i15];
                        if (obj4 != obj) {
                            if (System.identityHashCode(obj4) != identityHashCode) {
                                return -(i15 + 1);
                            }
                        } else {
                            return i15;
                        }
                    }
                    return -(i13 + 1);
                }
                i10 = i12 - 1;
            }
        }
        return -(i11 + 1);
    }

    public final boolean g() {
        return this.f37644a > 0;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f37644a == 0;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new m0(this, 1);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        if (obj == null) {
            return false;
        }
        int e10 = e(obj);
        Object[] objArr = this.f37645b;
        int i10 = this.f37644a;
        if (e10 < 0) {
            return false;
        }
        int i11 = i10 - 1;
        if (e10 < i11) {
            t.f(objArr, e10, objArr, e10 + 1, i10);
        }
        objArr[i11] = null;
        this.f37644a--;
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f37644a;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return j.q(this);
    }

    public final String toString() {
        return g0.B(this, null, "[", "]", b.f37643a, 25);
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return j.r(this, objArr);
    }
}
