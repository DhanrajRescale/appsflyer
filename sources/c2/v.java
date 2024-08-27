package c2;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class v implements List, ju.a {

    /* renamed from: a, reason: collision with root package name */
    public Object[] f7856a = new Object[16];

    /* renamed from: b, reason: collision with root package name */
    public long[] f7857b = new long[16];

    /* renamed from: c, reason: collision with root package name */
    public int f7858c = -1;

    /* renamed from: d, reason: collision with root package name */
    public int f7859d;

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int i10, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i10, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final long b() {
        long a10 = g.a(Float.POSITIVE_INFINITY, false);
        int i10 = this.f7858c + 1;
        int f10 = vt.y.f(this);
        if (i10 <= f10) {
            while (true) {
                long j10 = this.f7857b[i10];
                if (g.o(j10, a10) < 0) {
                    a10 = j10;
                }
                if (Float.intBitsToFloat((int) (a10 >> 32)) < s0.g.f34069a && ((int) (4294967295L & a10)) != 0) {
                    return a10;
                }
                if (i10 == f10) {
                    break;
                }
                i10++;
            }
        }
        return a10;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.f7858c = -1;
        g();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof g1.n) || indexOf((g1.n) obj) == -1) {
            return false;
        }
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains((g1.n) it.next())) {
                return false;
            }
        }
        return true;
    }

    public final void e(g1.n nVar, float f10, boolean z10, Function0 function0) {
        int i10 = this.f7858c;
        int i11 = i10 + 1;
        this.f7858c = i11;
        Object[] objArr = this.f7856a;
        if (i11 >= objArr.length) {
            int length = objArr.length + 16;
            Object[] copyOf = Arrays.copyOf(objArr, length);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.f7856a = copyOf;
            long[] copyOf2 = Arrays.copyOf(this.f7857b, length);
            Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(this, newSize)");
            this.f7857b = copyOf2;
        }
        Object[] objArr2 = this.f7856a;
        int i12 = this.f7858c;
        objArr2[i12] = nVar;
        this.f7857b[i12] = g.a(f10, z10);
        g();
        function0.mo2invoke();
        this.f7858c = i10;
    }

    public final void g() {
        int i10 = this.f7858c + 1;
        int f10 = vt.y.f(this);
        if (i10 <= f10) {
            while (true) {
                this.f7856a[i10] = null;
                if (i10 == f10) {
                    break;
                } else {
                    i10++;
                }
            }
        }
        this.f7859d = this.f7858c + 1;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        Object obj = this.f7856a[i10];
        Intrinsics.d(obj, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
        return (g1.n) obj;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof g1.n)) {
            return -1;
        }
        g1.n nVar = (g1.n) obj;
        int f10 = vt.y.f(this);
        if (f10 < 0) {
            return -1;
        }
        int i10 = 0;
        while (!Intrinsics.a(this.f7856a[i10], nVar)) {
            if (i10 == f10) {
                return -1;
            }
            i10++;
        }
        return i10;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f7859d == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new e1.x(this, 0, 7);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof g1.n)) {
            return -1;
        }
        g1.n nVar = (g1.n) obj;
        for (int f10 = vt.y.f(this); -1 < f10; f10--) {
            if (Intrinsics.a(this.f7856a[f10], nVar)) {
                return f10;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new e1.x(this, 0, 7);
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void replaceAll(UnaryOperator unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f7859d;
    }

    @Override // java.util.List
    public final void sort(Comparator comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List subList(int i10, int i11) {
        return new u(this, i10, i11);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return iu.j.q(this);
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i10) {
        return new e1.x(this, i10, 6);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return iu.j.r(this, objArr);
    }
}
