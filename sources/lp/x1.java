package lp;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class x1 implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final Iterator f25081a;

    public x1(Iterator it) {
        it.getClass();
        this.f25081a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f25081a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return ((Map.Entry) this.f25081a.next()).getValue();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f25081a.remove();
    }
}
