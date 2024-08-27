package v0;

import java.util.List;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class g implements ListIterator, ju.a {

    /* renamed from: a, reason: collision with root package name */
    public final List f37651a;

    /* renamed from: b, reason: collision with root package name */
    public int f37652b;

    public g(int i10, List list) {
        this.f37651a = list;
        this.f37652b = i10;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        this.f37651a.add(this.f37652b, obj);
        this.f37652b++;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        if (this.f37652b < this.f37651a.size()) {
            return true;
        }
        return false;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f37652b > 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int i10 = this.f37652b;
        this.f37652b = i10 + 1;
        return this.f37651a.get(i10);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f37652b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        int i10 = this.f37652b - 1;
        this.f37652b = i10;
        return this.f37651a.get(i10);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f37652b - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i10 = this.f37652b - 1;
        this.f37652b = i10;
        this.f37651a.remove(i10);
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        this.f37651a.set(this.f37652b, obj);
    }
}
