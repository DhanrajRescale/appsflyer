package r1;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class f0 implements Iterator, ju.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32911a;

    /* renamed from: b, reason: collision with root package name */
    public final Iterator f32912b;

    public /* synthetic */ f0(Iterator it, int i10) {
        this.f32911a = i10;
        this.f32912b = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i10 = this.f32911a;
        Iterator it = this.f32912b;
        switch (i10) {
            case 0:
                return it.hasNext();
            case 1:
                return it.hasNext();
            default:
                return it.hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i10 = this.f32911a;
        Iterator it = this.f32912b;
        switch (i10) {
            case 0:
                return (i0) it.next();
            case 1:
                return ((Map.Entry) it.next()).getKey();
            default:
                return ((Map.Entry) it.next()).getValue();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f32911a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public f0(g0 g0Var) {
        this.f32911a = 0;
        this.f32912b = g0Var.f32925j.iterator();
    }
}
