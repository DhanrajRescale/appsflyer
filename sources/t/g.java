package t;

import com.airbnb.deeplinkdispatch.UrlTreeKt;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class g implements Collection, Set, ju.b, ju.e {

    /* renamed from: a, reason: collision with root package name */
    public int[] f34856a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f34857b;

    /* renamed from: c, reason: collision with root package name */
    public int f34858c;

    public g(int i10) {
        this.f34856a = u.a.f36599a;
        this.f34857b = u.a.f36601c;
        if (i10 > 0) {
            qu.i0.f(this, i10);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i10;
        int z10;
        boolean z11;
        int i11 = this.f34858c;
        if (obj == null) {
            Intrinsics.checkNotNullParameter(this, "<this>");
            z10 = qu.i0.z(this, null, 0);
            i10 = 0;
        } else {
            int hashCode = obj.hashCode();
            i10 = hashCode;
            z10 = qu.i0.z(this, obj, hashCode);
        }
        if (z10 >= 0) {
            return false;
        }
        int i12 = ~z10;
        int[] iArr = this.f34856a;
        if (i11 >= iArr.length) {
            int i13 = 8;
            if (i11 >= 8) {
                i13 = (i11 >> 1) + i11;
            } else if (i11 < 4) {
                i13 = 4;
            }
            Object[] objArr = this.f34857b;
            qu.i0.f(this, i13);
            if (i11 == this.f34858c) {
                int[] iArr2 = this.f34856a;
                if (iArr2.length == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z11) {
                    vt.t.g(iArr, iArr2, 0, iArr.length, 6);
                    vt.t.h(objArr, this.f34857b, 0, objArr.length, 6);
                }
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i12 < i11) {
            int[] iArr3 = this.f34856a;
            int i14 = i12 + 1;
            vt.t.c(i14, i12, i11, iArr3, iArr3);
            Object[] objArr2 = this.f34857b;
            vt.t.f(objArr2, i14, objArr2, i12, i11);
        }
        int i15 = this.f34858c;
        if (i11 == i15) {
            int[] iArr4 = this.f34856a;
            if (i12 < iArr4.length) {
                iArr4[i12] = i10;
                this.f34857b[i12] = obj;
                this.f34858c = i15 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int size = elements.size() + this.f34858c;
        int i10 = this.f34858c;
        int[] iArr = this.f34856a;
        boolean z10 = false;
        if (iArr.length < size) {
            Object[] objArr = this.f34857b;
            qu.i0.f(this, size);
            int i11 = this.f34858c;
            if (i11 > 0) {
                vt.t.g(iArr, this.f34856a, 0, i11, 6);
                vt.t.h(objArr, this.f34857b, 0, this.f34858c, 6);
            }
        }
        if (this.f34858c == i10) {
            Iterator it = elements.iterator();
            while (it.hasNext()) {
                z10 |= add(it.next());
            }
            return z10;
        }
        throw new ConcurrentModificationException();
    }

    public final Object b(int i10) {
        int i11 = this.f34858c;
        Object[] objArr = this.f34857b;
        Object obj = objArr[i10];
        if (i11 <= 1) {
            clear();
        } else {
            int i12 = i11 - 1;
            int[] iArr = this.f34856a;
            int i13 = 8;
            if (iArr.length > 8 && i11 < iArr.length / 3) {
                if (i11 > 8) {
                    i13 = i11 + (i11 >> 1);
                }
                qu.i0.f(this, i13);
                if (i10 > 0) {
                    vt.t.g(iArr, this.f34856a, 0, i10, 6);
                    vt.t.h(objArr, this.f34857b, 0, i10, 6);
                }
                if (i10 < i12) {
                    int i14 = i10 + 1;
                    vt.t.c(i10, i14, i11, iArr, this.f34856a);
                    vt.t.f(objArr, i10, this.f34857b, i14, i11);
                }
            } else {
                if (i10 < i12) {
                    int i15 = i10 + 1;
                    vt.t.c(i10, i15, i11, iArr, iArr);
                    Object[] objArr2 = this.f34857b;
                    vt.t.f(objArr2, i10, objArr2, i15, i11);
                }
                this.f34857b[i12] = null;
            }
            if (i11 == this.f34858c) {
                this.f34858c = i12;
            } else {
                throw new ConcurrentModificationException();
            }
        }
        return obj;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        if (this.f34858c != 0) {
            int[] iArr = u.a.f36599a;
            Intrinsics.checkNotNullParameter(iArr, "<set-?>");
            this.f34856a = iArr;
            Object[] objArr = u.a.f36601c;
            Intrinsics.checkNotNullParameter(objArr, "<set-?>");
            this.f34857b = objArr;
            this.f34858c = 0;
        }
        if (this.f34858c == 0) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int z10;
        if (obj == null) {
            Intrinsics.checkNotNullParameter(this, "<this>");
            z10 = qu.i0.z(this, null, 0);
        } else {
            z10 = qu.i0.z(this, obj, obj.hashCode());
        }
        if (z10 < 0) {
            return false;
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof Set) && this.f34858c == ((Set) obj).size()) {
            try {
                int i10 = this.f34858c;
                for (int i11 = 0; i11 < i10; i11++) {
                    if (((Set) obj).contains(this.f34857b[i11])) {
                    }
                }
                return true;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.f34856a;
        int i10 = this.f34858c;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 += iArr[i12];
        }
        return i11;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f34858c <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new b(this);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int z10;
        if (obj == null) {
            Intrinsics.checkNotNullParameter(this, "<this>");
            z10 = qu.i0.z(this, null, 0);
        } else {
            z10 = qu.i0.z(this, obj, obj.hashCode());
        }
        if (z10 < 0) {
            return false;
        }
        b(z10);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Iterator it = elements.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            z10 |= remove(it.next());
        }
        return z10;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        boolean z10 = false;
        for (int i10 = this.f34858c - 1; -1 < i10; i10--) {
            if (!vt.g0.q(elements, this.f34857b[i10])) {
                b(i10);
                z10 = true;
            }
        }
        return z10;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.f34858c;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] result) {
        Intrinsics.checkNotNullParameter(result, "array");
        int i10 = this.f34858c;
        if (result.length < i10) {
            result = (Object[]) Array.newInstance(result.getClass().getComponentType(), i10);
        } else if (result.length > i10) {
            result[i10] = null;
        }
        vt.t.f(this.f34857b, 0, result, 0, this.f34858c);
        Intrinsics.checkNotNullExpressionValue(result, "result");
        return result;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f34858c * 14);
        sb2.append(UrlTreeKt.componentParamPrefixChar);
        int i10 = this.f34858c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            Object obj = this.f34857b[i11];
            if (obj != this) {
                sb2.append(obj);
            } else {
                sb2.append("(this Set)");
            }
        }
        sb2.append(UrlTreeKt.componentParamSuffixChar);
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }

    public g() {
        this(0);
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return vt.t.j(0, this.f34858c, this.f34857b);
    }
}
