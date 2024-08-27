package e1;

import b0.k0;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class s implements y, List, RandomAccess, ju.c {

    /* renamed from: a, reason: collision with root package name */
    public r f14918a = new r(x0.j.f39818c);

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        int i10;
        w0.c cVar;
        boolean z10;
        i i11;
        do {
            Object obj2 = t.f14919a;
            synchronized (obj2) {
                r rVar = this.f14918a;
                Intrinsics.d(rVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                r rVar2 = (r) p.h(rVar);
                i10 = rVar2.f14916d;
                cVar = rVar2.f14915c;
                Unit unit = Unit.f23355a;
            }
            Intrinsics.c(cVar);
            w0.c add = cVar.add(obj);
            z10 = false;
            if (Intrinsics.a(add, cVar)) {
                return false;
            }
            r rVar3 = this.f14918a;
            Intrinsics.d(rVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (p.f14905b) {
                i11 = p.i();
                r rVar4 = (r) p.u(rVar3, this, i11);
                synchronized (obj2) {
                    int i12 = rVar4.f14916d;
                    if (i12 == i10) {
                        rVar4.f14915c = add;
                        rVar4.f14917e++;
                        rVar4.f14916d = i12 + 1;
                        z10 = true;
                    }
                }
            }
            p.l(i11, this);
        } while (!z10);
        return true;
    }

    @Override // java.util.List
    public final boolean addAll(int i10, Collection collection) {
        return k(new k0(i10, 1, collection));
    }

    @Override // e1.y
    public final a0 b() {
        return this.f14918a;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        i i10;
        r rVar = this.f14918a;
        Intrinsics.d(rVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        synchronized (p.f14905b) {
            i10 = p.i();
            r rVar2 = (r) p.u(rVar, this, i10);
            synchronized (t.f14919a) {
                rVar2.f14915c = x0.j.f39818c;
                rVar2.f14916d++;
                rVar2.f14917e++;
            }
        }
        p.l(i10, this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return ((x0.c) g().f14915c).contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return ((x0.c) g().f14915c).containsAll(collection);
    }

    @Override // e1.y
    public final void e(a0 a0Var) {
        a0Var.f14842b = this.f14918a;
        this.f14918a = (r) a0Var;
    }

    public final r g() {
        r rVar = this.f14918a;
        Intrinsics.d(rVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return (r) p.r(rVar, this);
    }

    @Override // java.util.List
    public final Object get(int i10) {
        return g().f14915c.get(i10);
    }

    public final int i() {
        r rVar = this.f14918a;
        Intrinsics.d(rVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return ((r) p.h(rVar)).f14917e;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return g().f14915c.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return ((vt.b) g().f14915c).isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator();
    }

    public final boolean k(Function1 function1) {
        int i10;
        w0.c cVar;
        Object invoke;
        i i11;
        boolean z10;
        do {
            Object obj = t.f14919a;
            synchronized (obj) {
                r rVar = this.f14918a;
                Intrinsics.d(rVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                r rVar2 = (r) p.h(rVar);
                i10 = rVar2.f14916d;
                cVar = rVar2.f14915c;
                Unit unit = Unit.f23355a;
            }
            Intrinsics.c(cVar);
            x0.f l10 = cVar.l();
            invoke = function1.invoke(l10);
            w0.c g10 = l10.g();
            if (Intrinsics.a(g10, cVar)) {
                break;
            }
            r rVar3 = this.f14918a;
            Intrinsics.d(rVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (p.f14905b) {
                i11 = p.i();
                r rVar4 = (r) p.u(rVar3, this, i11);
                synchronized (obj) {
                    int i12 = rVar4.f14916d;
                    if (i12 == i10) {
                        rVar4.f14915c = g10;
                        rVar4.f14916d = i12 + 1;
                        z10 = true;
                        rVar4.f14917e++;
                    } else {
                        z10 = false;
                    }
                }
            }
            p.l(i11, this);
        } while (!z10);
        return ((Boolean) invoke).booleanValue();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return g().f14915c.lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new x(this, 0);
    }

    @Override // java.util.List
    public final Object remove(int i10) {
        int i11;
        w0.c cVar;
        i i12;
        boolean z10;
        Object obj = get(i10);
        do {
            Object obj2 = t.f14919a;
            synchronized (obj2) {
                r rVar = this.f14918a;
                Intrinsics.d(rVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                r rVar2 = (r) p.h(rVar);
                i11 = rVar2.f14916d;
                cVar = rVar2.f14915c;
                Unit unit = Unit.f23355a;
            }
            Intrinsics.c(cVar);
            w0.c j10 = cVar.j(i10);
            if (Intrinsics.a(j10, cVar)) {
                break;
            }
            r rVar3 = this.f14918a;
            Intrinsics.d(rVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (p.f14905b) {
                i12 = p.i();
                r rVar4 = (r) p.u(rVar3, this, i12);
                synchronized (obj2) {
                    int i13 = rVar4.f14916d;
                    if (i13 == i11) {
                        rVar4.f14915c = j10;
                        z10 = true;
                        rVar4.f14917e++;
                        rVar4.f14916d = i13 + 1;
                    } else {
                        z10 = false;
                    }
                }
            }
            p.l(i12, this);
        } while (!z10);
        return obj;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i10;
        w0.c cVar;
        int i11;
        i i12;
        do {
            Object obj = t.f14919a;
            synchronized (obj) {
                r rVar = this.f14918a;
                Intrinsics.d(rVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                r rVar2 = (r) p.h(rVar);
                i10 = rVar2.f14916d;
                cVar = rVar2.f14915c;
                Unit unit = Unit.f23355a;
            }
            Intrinsics.c(cVar);
            i11 = 0;
            w0.c a10 = ((x0.c) cVar).a(new x0.b(i11, collection));
            if (Intrinsics.a(a10, cVar)) {
                return false;
            }
            r rVar3 = this.f14918a;
            Intrinsics.d(rVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (p.f14905b) {
                i12 = p.i();
                r rVar4 = (r) p.u(rVar3, this, i12);
                synchronized (obj) {
                    int i13 = rVar4.f14916d;
                    if (i13 == i10) {
                        rVar4.f14915c = a10;
                        rVar4.f14917e++;
                        rVar4.f14916d = i13 + 1;
                        i11 = 1;
                    }
                }
            }
            p.l(i12, this);
        } while (i11 == 0);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        return k(new x0.b(2, collection));
    }

    @Override // java.util.List
    public final Object set(int i10, Object obj) {
        int i11;
        w0.c cVar;
        i i12;
        boolean z10;
        Object obj2 = get(i10);
        do {
            Object obj3 = t.f14919a;
            synchronized (obj3) {
                r rVar = this.f14918a;
                Intrinsics.d(rVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                r rVar2 = (r) p.h(rVar);
                i11 = rVar2.f14916d;
                cVar = rVar2.f14915c;
                Unit unit = Unit.f23355a;
            }
            Intrinsics.c(cVar);
            w0.c cVar2 = cVar.set(i10, obj);
            if (Intrinsics.a(cVar2, cVar)) {
                break;
            }
            r rVar3 = this.f14918a;
            Intrinsics.d(rVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (p.f14905b) {
                i12 = p.i();
                r rVar4 = (r) p.u(rVar3, this, i12);
                synchronized (obj3) {
                    int i13 = rVar4.f14916d;
                    if (i13 == i11) {
                        rVar4.f14915c = cVar2;
                        rVar4.f14916d = i13 + 1;
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                }
            }
            p.l(i12, this);
        } while (!z10);
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return ((vt.b) g().f14915c).b();
    }

    @Override // java.util.List
    public final List subList(int i10, int i11) {
        boolean z10;
        if (i10 >= 0 && i10 <= i11 && i11 <= size()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return new c0(this, i10, i11);
        }
        al.d.e1("fromIndex or toIndex are out of bounds");
        throw null;
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return iu.j.q(this);
    }

    public final String toString() {
        r rVar = this.f14918a;
        Intrinsics.d(rVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return "SnapshotStateList(value=" + ((r) p.h(rVar)).f14915c + ")@" + hashCode();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        int i10;
        w0.c cVar;
        boolean z10;
        i i11;
        do {
            Object obj = t.f14919a;
            synchronized (obj) {
                r rVar = this.f14918a;
                Intrinsics.d(rVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                r rVar2 = (r) p.h(rVar);
                i10 = rVar2.f14916d;
                cVar = rVar2.f14915c;
                Unit unit = Unit.f23355a;
            }
            Intrinsics.c(cVar);
            w0.c addAll = cVar.addAll(collection);
            z10 = false;
            if (Intrinsics.a(addAll, cVar)) {
                return false;
            }
            r rVar3 = this.f14918a;
            Intrinsics.d(rVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (p.f14905b) {
                i11 = p.i();
                r rVar4 = (r) p.u(rVar3, this, i11);
                synchronized (obj) {
                    int i12 = rVar4.f14916d;
                    if (i12 == i10) {
                        rVar4.f14915c = addAll;
                        rVar4.f14917e++;
                        rVar4.f14916d = i12 + 1;
                        z10 = true;
                    }
                }
            }
            p.l(i11, this);
        } while (!z10);
        return true;
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i10) {
        return new x(this, i10);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return iu.j.r(this, objArr);
    }

    @Override // java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        w0.c cVar;
        i i12;
        boolean z10;
        do {
            Object obj2 = t.f14919a;
            synchronized (obj2) {
                r rVar = this.f14918a;
                Intrinsics.d(rVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                r rVar2 = (r) p.h(rVar);
                i11 = rVar2.f14916d;
                cVar = rVar2.f14915c;
                Unit unit = Unit.f23355a;
            }
            Intrinsics.c(cVar);
            w0.c add = cVar.add(i10, obj);
            if (Intrinsics.a(add, cVar)) {
                return;
            }
            r rVar3 = this.f14918a;
            Intrinsics.d(rVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (p.f14905b) {
                i12 = p.i();
                r rVar4 = (r) p.u(rVar3, this, i12);
                synchronized (obj2) {
                    int i13 = rVar4.f14916d;
                    if (i13 == i11) {
                        rVar4.f14915c = add;
                        z10 = true;
                        rVar4.f14917e++;
                        rVar4.f14916d = i13 + 1;
                    } else {
                        z10 = false;
                    }
                }
            }
            p.l(i12, this);
        } while (!z10);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i10;
        w0.c cVar;
        boolean z10;
        i i11;
        do {
            Object obj2 = t.f14919a;
            synchronized (obj2) {
                r rVar = this.f14918a;
                Intrinsics.d(rVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                r rVar2 = (r) p.h(rVar);
                i10 = rVar2.f14916d;
                cVar = rVar2.f14915c;
                Unit unit = Unit.f23355a;
            }
            Intrinsics.c(cVar);
            x0.c cVar2 = (x0.c) cVar;
            int indexOf = cVar2.indexOf(obj);
            w0.c cVar3 = cVar2;
            if (indexOf != -1) {
                cVar3 = cVar2.j(indexOf);
            }
            z10 = false;
            if (Intrinsics.a(cVar3, cVar)) {
                return false;
            }
            r rVar3 = this.f14918a;
            Intrinsics.d(rVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (p.f14905b) {
                i11 = p.i();
                r rVar4 = (r) p.u(rVar3, this, i11);
                synchronized (obj2) {
                    int i12 = rVar4.f14916d;
                    if (i12 == i10) {
                        rVar4.f14915c = cVar3;
                        rVar4.f14917e++;
                        rVar4.f14916d = i12 + 1;
                        z10 = true;
                    }
                }
            }
            p.l(i11, this);
        } while (!z10);
        return true;
    }
}
