package vt;

import java.util.Iterator;

/* loaded from: classes2.dex */
public abstract class m0 implements Iterator, ju.a {
    public abstract long b();

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return Long.valueOf(b());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
