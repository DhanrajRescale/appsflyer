package wt;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class g extends a {

    /* renamed from: a, reason: collision with root package name */
    public final d f39477a;

    public g(d backing) {
        Intrinsics.checkNotNullParameter(backing, "backing");
        this.f39477a = backing;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        Map.Entry element = (Map.Entry) obj;
        Intrinsics.checkNotNullParameter(element, "element");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // vt.n
    public final int b() {
        return this.f39477a.f39469i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f39477a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return this.f39477a.d(elements);
    }

    @Override // wt.a
    public final boolean e(Map.Entry element) {
        Intrinsics.checkNotNullParameter(element, "element");
        return this.f39477a.e(element);
    }

    @Override // wt.a
    public final boolean g(Map.Entry entry) {
        Intrinsics.checkNotNullParameter(entry, "element");
        d dVar = this.f39477a;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(entry, "entry");
        dVar.c();
        int g10 = dVar.g(entry.getKey());
        if (g10 < 0) {
            return false;
        }
        Object[] objArr = dVar.f39462b;
        Intrinsics.c(objArr);
        if (!Intrinsics.a(objArr[g10], entry.getValue())) {
            return false;
        }
        dVar.m(g10);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f39477a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        d dVar = this.f39477a;
        dVar.getClass();
        return new e(dVar, 0);
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.f39477a.c();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.f39477a.c();
        return super.retainAll(elements);
    }
}
