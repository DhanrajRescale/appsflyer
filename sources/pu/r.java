package pu;

import java.util.Iterator;
import kotlin.sequences.Sequence;

/* loaded from: classes2.dex */
public final class r implements Iterator, ju.a {

    /* renamed from: a, reason: collision with root package name */
    public final Iterator f31436a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f31437b;

    public r(q qVar) {
        this.f31437b = qVar;
        this.f31436a = ((Sequence) qVar.f31434b).iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f31436a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.f31437b.f31435c.invoke(this.f31436a.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
