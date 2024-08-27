package vt;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public abstract class c implements Iterator, ju.a {

    /* renamed from: a, reason: collision with root package name */
    public int f38308a;

    /* renamed from: b, reason: collision with root package name */
    public Object f38309b;

    public abstract void b();

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i10 = this.f38308a;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    return false;
                }
                throw new IllegalArgumentException("hasNext called when the iterator is in the FAILED state.");
            }
        } else {
            this.f38308a = 3;
            b();
            if (this.f38308a != 1) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i10 = this.f38308a;
        if (i10 == 1) {
            this.f38308a = 0;
            return this.f38309b;
        }
        if (i10 != 2) {
            this.f38308a = 3;
            b();
            if (this.f38308a == 1) {
                this.f38308a = 0;
                return this.f38309b;
            }
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
