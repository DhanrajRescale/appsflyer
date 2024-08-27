package vt;

import java.util.ListIterator;
import java.util.NoSuchElementException;
import vt.d;

/* loaded from: classes2.dex */
public final class e extends t.m0 implements ListIterator {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d f38311d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(d dVar, int i10) {
        super(dVar, 4);
        this.f38311d = dVar;
        d.Companion companion = d.INSTANCE;
        int size = dVar.size();
        companion.getClass();
        d.Companion.b(i10, size);
        this.f34883b = i10;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f34883b > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f34883b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            int i10 = this.f34883b - 1;
            this.f34883b = i10;
            return this.f38311d.get(i10);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f34883b - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
