package x0;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class d extends a {

    /* renamed from: c, reason: collision with root package name */
    public final Object[] f39798c;

    public d(Object[] objArr, int i10, int i11) {
        super(i10, i11);
        this.f39798c = objArr;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            int i10 = this.f39794a;
            this.f39794a = i10 + 1;
            return this.f39798c[i10];
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            int i10 = this.f39794a - 1;
            this.f39794a = i10;
            return this.f39798c[i10];
        }
        throw new NoSuchElementException();
    }
}
