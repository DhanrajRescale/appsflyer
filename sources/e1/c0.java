package e1;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import vt.l0;

/* loaded from: classes.dex */
public final class c0 implements List, ju.c {

    /* renamed from: a, reason: collision with root package name */
    public final s f14856a;

    /* renamed from: b, reason: collision with root package name */
    public final int f14857b;

    /* renamed from: c, reason: collision with root package name */
    public int f14858c;

    /* renamed from: d, reason: collision with root package name */
    public int f14859d;

    public c0(s sVar, int i10, int i11) {
        this.f14856a = sVar;
        this.f14857b = i10;
        this.f14858c = sVar.i();
        this.f14859d = i11 - i10;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        b();
        int i10 = this.f14857b + this.f14859d;
        s sVar = this.f14856a;
        sVar.add(i10, obj);
        this.f14859d++;
        this.f14858c = sVar.i();
        return true;
    }

    @Override // java.util.List
    public final boolean addAll(int i10, Collection collection) {
        b();
        int i11 = i10 + this.f14857b;
        s sVar = this.f14856a;
        boolean addAll = sVar.addAll(i11, collection);
        if (addAll) {
            this.f14859d = collection.size() + this.f14859d;
            this.f14858c = sVar.i();
        }
        return addAll;
    }

    public final void b() {
        if (this.f14856a.i() == this.f14858c) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        int i10;
        w0.c cVar;
        i i11;
        boolean z10;
        if (this.f14859d > 0) {
            b();
            s sVar = this.f14856a;
            int i12 = this.f14857b;
            int i13 = this.f14859d + i12;
            sVar.getClass();
            do {
                Object obj = t.f14919a;
                synchronized (obj) {
                    r rVar = sVar.f14918a;
                    Intrinsics.d(rVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                    r rVar2 = (r) p.h(rVar);
                    i10 = rVar2.f14916d;
                    cVar = rVar2.f14915c;
                    Unit unit = Unit.f23355a;
                }
                Intrinsics.c(cVar);
                x0.f l10 = cVar.l();
                l10.subList(i12, i13).clear();
                w0.c g10 = l10.g();
                if (Intrinsics.a(g10, cVar)) {
                    break;
                }
                r rVar3 = sVar.f14918a;
                Intrinsics.d(rVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                synchronized (p.f14905b) {
                    i11 = p.i();
                    r rVar4 = (r) p.u(rVar3, sVar, i11);
                    synchronized (obj) {
                        int i14 = rVar4.f14916d;
                        if (i14 == i10) {
                            rVar4.f14915c = g10;
                            rVar4.f14916d = i14 + 1;
                            z10 = true;
                            rVar4.f14917e++;
                        } else {
                            z10 = false;
                        }
                    }
                }
                p.l(i11, sVar);
            } while (!z10);
            this.f14859d = 0;
            this.f14858c = this.f14856a.i();
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        if (indexOf(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
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

    @Override // java.util.List
    public final Object get(int i10) {
        b();
        t.a(i10, this.f14859d);
        return this.f14856a.get(this.f14857b + i10);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        b();
        int i10 = this.f14859d;
        int i11 = this.f14857b;
        Iterator<Integer> it = kotlin.ranges.d.k(i11, i10 + i11).iterator();
        while (it.hasNext()) {
            int b10 = ((l0) it).b();
            if (Intrinsics.a(obj, this.f14856a.get(b10))) {
                return b10 - i11;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f14859d == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        b();
        int i10 = this.f14859d;
        int i11 = this.f14857b;
        for (int i12 = (i10 + i11) - 1; i12 >= i11; i12--) {
            if (Intrinsics.a(obj, this.f14856a.get(i12))) {
                return i12 - i11;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        while (true) {
            boolean z10 = false;
            while (it.hasNext()) {
                if (remove(it.next()) || z10) {
                    z10 = true;
                }
            }
            return z10;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i10;
        w0.c cVar;
        i i11;
        boolean z10;
        b();
        s sVar = this.f14856a;
        int i12 = this.f14857b;
        int i13 = this.f14859d + i12;
        int size = sVar.size();
        do {
            Object obj = t.f14919a;
            synchronized (obj) {
                r rVar = sVar.f14918a;
                Intrinsics.d(rVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                r rVar2 = (r) p.h(rVar);
                i10 = rVar2.f14916d;
                cVar = rVar2.f14915c;
                Unit unit = Unit.f23355a;
            }
            Intrinsics.c(cVar);
            x0.f l10 = cVar.l();
            l10.subList(i12, i13).retainAll(collection);
            w0.c g10 = l10.g();
            if (Intrinsics.a(g10, cVar)) {
                break;
            }
            r rVar3 = sVar.f14918a;
            Intrinsics.d(rVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (p.f14905b) {
                i11 = p.i();
                r rVar4 = (r) p.u(rVar3, sVar, i11);
                synchronized (obj) {
                    int i14 = rVar4.f14916d;
                    if (i14 == i10) {
                        rVar4.f14915c = g10;
                        rVar4.f14916d = i14 + 1;
                        rVar4.f14917e++;
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                }
            }
            p.l(i11, sVar);
        } while (!z10);
        int size2 = size - sVar.size();
        if (size2 > 0) {
            this.f14858c = this.f14856a.i();
            this.f14859d -= size2;
        }
        if (size2 > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.List
    public final Object set(int i10, Object obj) {
        t.a(i10, this.f14859d);
        b();
        int i11 = i10 + this.f14857b;
        s sVar = this.f14856a;
        Object obj2 = sVar.set(i11, obj);
        this.f14858c = sVar.i();
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f14859d;
    }

    @Override // java.util.List
    public final List subList(int i10, int i11) {
        boolean z10;
        if (i10 >= 0 && i10 <= i11 && i11 <= this.f14859d) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            b();
            int i12 = this.f14857b;
            return new c0(this.f14856a, i10 + i12, i11 + i12);
        }
        al.d.e1("fromIndex or toIndex are out of bounds");
        throw null;
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return iu.j.q(this);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i10) {
        b();
        iu.x xVar = new iu.x();
        xVar.f20558a = i10 - 1;
        return new b0(xVar, this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return iu.j.r(this, objArr);
    }

    @Override // java.util.List
    public final Object remove(int i10) {
        b();
        int i11 = this.f14857b + i10;
        s sVar = this.f14856a;
        Object remove = sVar.remove(i11);
        this.f14859d--;
        this.f14858c = sVar.i();
        return remove;
    }

    @Override // java.util.List
    public final void add(int i10, Object obj) {
        b();
        int i11 = this.f14857b + i10;
        s sVar = this.f14856a;
        sVar.add(i11, obj);
        this.f14859d++;
        this.f14858c = sVar.i();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        return addAll(this.f14859d, collection);
    }
}
