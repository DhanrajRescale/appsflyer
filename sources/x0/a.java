package x0;

import java.util.ListIterator;

/* loaded from: classes.dex */
public abstract class a implements ListIterator, ju.a {

    /* renamed from: a, reason: collision with root package name */
    public int f39794a;

    /* renamed from: b, reason: collision with root package name */
    public int f39795b;

    public a(int i10, int i11) {
        this.f39794a = i10;
        this.f39795b = i11;
    }

    @Override // java.util.ListIterator
    public void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f39794a < this.f39795b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f39794a > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f39794a;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f39794a - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
