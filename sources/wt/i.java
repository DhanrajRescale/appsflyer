package wt;

import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class i extends vt.k {

    /* renamed from: a, reason: collision with root package name */
    public final d f39479a;

    public i(d backing) {
        Intrinsics.checkNotNullParameter(backing, "backing");
        this.f39479a = backing;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // vt.k
    public final int b() {
        return this.f39479a.f39469i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f39479a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f39479a.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return this.f39479a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        d dVar = this.f39479a;
        dVar.getClass();
        return new e(dVar, 2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        d dVar = this.f39479a;
        dVar.c();
        int h10 = dVar.h(obj);
        if (h10 < 0) {
            return false;
        }
        dVar.m(h10);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.f39479a.c();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.f39479a.c();
        return super.retainAll(elements);
    }
}
