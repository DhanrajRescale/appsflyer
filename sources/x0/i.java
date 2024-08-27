package x0;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class i extends a {

    /* renamed from: c, reason: collision with root package name */
    public final Object f39817c;

    public i(Object obj, int i10) {
        super(i10, 1);
        this.f39817c = obj;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            this.f39794a++;
            return this.f39817c;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            this.f39794a--;
            return this.f39817c;
        }
        throw new NoSuchElementException();
    }
}
