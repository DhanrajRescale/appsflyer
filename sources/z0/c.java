package z0;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import y0.d;

/* loaded from: classes.dex */
public final class c implements Iterator, ju.a {

    /* renamed from: a, reason: collision with root package name */
    public Object f41896a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f41897b;

    /* renamed from: c, reason: collision with root package name */
    public int f41898c;

    public c(Object obj, d dVar) {
        this.f41896a = obj;
        this.f41897b = dVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f41898c < this.f41897b.size()) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            Object obj = this.f41896a;
            this.f41898c++;
            Object obj2 = this.f41897b.get(obj);
            if (obj2 != null) {
                this.f41896a = ((a) obj2).f41891b;
                return obj;
            }
            throw new ConcurrentModificationException("Hash code of an element (" + obj + ") has changed after it was added to the persistent set.");
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
