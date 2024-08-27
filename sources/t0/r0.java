package t0;

import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class r0 implements Iterator, ju.a {

    /* renamed from: a, reason: collision with root package name */
    public final o2 f35192a;

    /* renamed from: b, reason: collision with root package name */
    public final int f35193b;

    /* renamed from: c, reason: collision with root package name */
    public int f35194c;

    /* renamed from: d, reason: collision with root package name */
    public final int f35195d;

    public r0(int i10, int i11, o2 o2Var) {
        this.f35192a = o2Var;
        this.f35193b = i11;
        this.f35194c = i10;
        this.f35195d = o2Var.f35112g;
        if (!o2Var.f35111f) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f35194c < this.f35193b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        o2 o2Var = this.f35192a;
        int i10 = o2Var.f35112g;
        int i11 = this.f35195d;
        if (i10 == i11) {
            int i12 = this.f35194c;
            this.f35194c = dp.b.D0(o2Var.f35106a, i12) + i12;
            return new p2(i12, i11, o2Var);
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
