package e1;

import java.util.AbstractList;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class x implements ListIterator, ju.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14945a;

    /* renamed from: b, reason: collision with root package name */
    public int f14946b;

    /* renamed from: c, reason: collision with root package name */
    public int f14947c;

    /* renamed from: d, reason: collision with root package name */
    public int f14948d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f14949e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public x(c2.v vVar, int i10, int i11) {
        this(vVar, (i11 & 1) != 0 ? 0 : i10, 0, (i11 & 4) != 0 ? vVar.f7859d : 0);
        this.f14945a = 1;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        int i10;
        Object obj2 = this.f14949e;
        switch (this.f14945a) {
            case 0:
                d();
                s sVar = (s) obj2;
                sVar.add(this.f14946b + 1, obj);
                this.f14947c = -1;
                this.f14946b++;
                this.f14948d = sVar.i();
                return;
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 2:
                b();
                wt.b bVar = (wt.b) obj2;
                int i11 = this.f14946b;
                this.f14946b = i11 + 1;
                bVar.add(i11, obj);
                this.f14947c = -1;
                this.f14948d = wt.b.g(bVar);
                return;
            default:
                c();
                wt.c cVar = (wt.c) obj2;
                int i12 = this.f14946b;
                this.f14946b = i12 + 1;
                cVar.add(i12, obj);
                this.f14947c = -1;
                i10 = ((AbstractList) cVar).modCount;
                this.f14948d = i10;
                return;
        }
    }

    public final void b() {
        int i10;
        i10 = ((AbstractList) ((wt.b) this.f14949e).f39454e).modCount;
        if (i10 == this.f14948d) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    public final void c() {
        int i10;
        i10 = ((AbstractList) ((wt.c) this.f14949e)).modCount;
        if (i10 == this.f14948d) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    public final void d() {
        if (((s) this.f14949e).i() == this.f14948d) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        Object obj = this.f14949e;
        switch (this.f14945a) {
            case 0:
                if (this.f14946b >= ((s) obj).size() - 1) {
                    return false;
                }
                return true;
            case 1:
                if (this.f14946b >= this.f14948d) {
                    return false;
                }
                return true;
            case 2:
                if (this.f14946b >= ((wt.b) obj).f39452c) {
                    return false;
                }
                return true;
            default:
                if (this.f14946b >= ((wt.c) obj).f39457b) {
                    return false;
                }
                return true;
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.f14945a) {
            case 0:
                return this.f14946b >= 0;
            case 1:
                return this.f14946b > this.f14947c;
            case 2:
                return this.f14946b > 0;
            default:
                return this.f14946b > 0;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        Object obj = this.f14949e;
        switch (this.f14945a) {
            case 0:
                d();
                int i10 = this.f14946b + 1;
                this.f14947c = i10;
                s sVar = (s) obj;
                t.a(i10, sVar.size());
                Object obj2 = sVar.get(i10);
                this.f14946b = i10;
                return obj2;
            case 1:
                Object[] objArr = ((c2.v) obj).f7856a;
                int i11 = this.f14946b;
                this.f14946b = i11 + 1;
                Object obj3 = objArr[i11];
                Intrinsics.d(obj3, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
                return (g1.n) obj3;
            case 2:
                b();
                int i12 = this.f14946b;
                wt.b bVar = (wt.b) obj;
                if (i12 < bVar.f39452c) {
                    this.f14946b = i12 + 1;
                    this.f14947c = i12;
                    return bVar.f39450a[bVar.f39451b + i12];
                }
                throw new NoSuchElementException();
            default:
                c();
                int i13 = this.f14946b;
                wt.c cVar = (wt.c) obj;
                if (i13 < cVar.f39457b) {
                    this.f14946b = i13 + 1;
                    this.f14947c = i13;
                    return cVar.f39456a[i13];
                }
                throw new NoSuchElementException();
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.f14945a) {
            case 0:
                return this.f14946b + 1;
            case 1:
                return this.f14946b - this.f14947c;
            case 2:
                return this.f14946b;
            default:
                return this.f14946b;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        Object obj = this.f14949e;
        switch (this.f14945a) {
            case 0:
                d();
                s sVar = (s) obj;
                t.a(this.f14946b, sVar.size());
                int i10 = this.f14946b;
                this.f14947c = i10;
                this.f14946b--;
                return sVar.get(i10);
            case 1:
                Object[] objArr = ((c2.v) obj).f7856a;
                int i11 = this.f14946b - 1;
                this.f14946b = i11;
                Object obj2 = objArr[i11];
                Intrinsics.d(obj2, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
                return (g1.n) obj2;
            case 2:
                b();
                int i12 = this.f14946b;
                if (i12 > 0) {
                    int i13 = i12 - 1;
                    this.f14946b = i13;
                    this.f14947c = i13;
                    wt.b bVar = (wt.b) obj;
                    return bVar.f39450a[bVar.f39451b + i13];
                }
                throw new NoSuchElementException();
            default:
                c();
                int i14 = this.f14946b;
                if (i14 > 0) {
                    int i15 = i14 - 1;
                    this.f14946b = i15;
                    this.f14947c = i15;
                    return ((wt.c) obj).f39456a[i15];
                }
                throw new NoSuchElementException();
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        switch (this.f14945a) {
            case 0:
                return this.f14946b;
            case 1:
                return (this.f14946b - this.f14947c) - 1;
            case 2:
                return this.f14946b - 1;
            default:
                return this.f14946b - 1;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i10;
        Object obj = this.f14949e;
        switch (this.f14945a) {
            case 0:
                d();
                s sVar = (s) obj;
                sVar.remove(this.f14946b);
                this.f14946b--;
                this.f14947c = -1;
                this.f14948d = sVar.i();
                return;
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 2:
                b();
                int i11 = this.f14947c;
                if (i11 != -1) {
                    wt.b bVar = (wt.b) obj;
                    bVar.e(i11);
                    this.f14946b = this.f14947c;
                    this.f14947c = -1;
                    this.f14948d = wt.b.g(bVar);
                    return;
                }
                throw new IllegalStateException("Call next() or previous() before removing element from the iterator.".toString());
            default:
                c();
                int i12 = this.f14947c;
                if (i12 != -1) {
                    wt.c cVar = (wt.c) obj;
                    cVar.e(i12);
                    this.f14946b = this.f14947c;
                    this.f14947c = -1;
                    i10 = ((AbstractList) cVar).modCount;
                    this.f14948d = i10;
                    return;
                }
                throw new IllegalStateException("Call next() or previous() before removing element from the iterator.".toString());
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        Object obj2 = this.f14949e;
        switch (this.f14945a) {
            case 0:
                d();
                int i10 = this.f14947c;
                if (i10 >= 0) {
                    s sVar = (s) obj2;
                    sVar.set(i10, obj);
                    this.f14948d = sVar.i();
                    return;
                }
                Object obj3 = t.f14919a;
                throw new IllegalStateException("Cannot call set before the first call to next() or previous() or immediately after a call to add() or remove()".toString());
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 2:
                b();
                int i11 = this.f14947c;
                if (i11 != -1) {
                    ((wt.b) obj2).set(i11, obj);
                    return;
                }
                throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.".toString());
            default:
                c();
                int i12 = this.f14947c;
                if (i12 != -1) {
                    ((wt.c) obj2).set(i12, obj);
                    return;
                }
                throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.".toString());
        }
    }

    public x(c2.v vVar, int i10, int i11, int i12) {
        this.f14945a = 1;
        this.f14949e = vVar;
        this.f14946b = i10;
        this.f14947c = i11;
        this.f14948d = i12;
    }

    public x(wt.c list, int i10) {
        int i11;
        this.f14945a = 3;
        Intrinsics.checkNotNullParameter(list, "list");
        this.f14949e = list;
        this.f14946b = i10;
        this.f14947c = -1;
        i11 = ((AbstractList) list).modCount;
        this.f14948d = i11;
    }

    public x(s sVar, int i10) {
        this.f14945a = 0;
        this.f14949e = sVar;
        this.f14946b = i10 - 1;
        this.f14947c = -1;
        this.f14948d = sVar.i();
    }

    public x(wt.b list, int i10) {
        this.f14945a = 2;
        Intrinsics.checkNotNullParameter(list, "list");
        this.f14949e = list;
        this.f14946b = i10;
        this.f14947c = -1;
        this.f14948d = wt.b.g(list);
    }
}
