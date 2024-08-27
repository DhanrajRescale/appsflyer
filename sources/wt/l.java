package wt;

import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import vt.n;

/* loaded from: classes2.dex */
public final class l extends n implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public static final l f39485b;

    /* renamed from: a, reason: collision with root package name */
    public final d f39486a;

    static {
        d.INSTANCE.getClass();
        f39485b = new l(d.f39460o);
    }

    public l(d backing) {
        Intrinsics.checkNotNullParameter(backing, "backing");
        this.f39486a = backing;
    }

    private final Object writeReplace() {
        if (this.f39486a.f39473m) {
            return new j(1, this);
        }
        throw new NotSerializableException("The set cannot be serialized while it is being built.");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        if (this.f39486a.b(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.f39486a.c();
        return super.addAll(elements);
    }

    @Override // vt.n
    public final int b() {
        return this.f39486a.f39469i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f39486a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f39486a.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f39486a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        d dVar = this.f39486a;
        dVar.getClass();
        return new e(dVar, 1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        d dVar = this.f39486a;
        dVar.c();
        int g10 = dVar.g(obj);
        if (g10 < 0) {
            return false;
        }
        dVar.m(g10);
        return true;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.f39486a.c();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.f39486a.c();
        return super.retainAll(elements);
    }

    public l() {
        this(new d());
    }
}
