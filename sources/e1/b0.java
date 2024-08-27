package e1;

import java.util.List;
import java.util.ListIterator;
import vt.q0;

/* loaded from: classes.dex */
public final class b0 implements ListIterator, ju.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14843a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f14844b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f14845c;

    public b0(q0 q0Var, int i10) {
        this.f14845c = q0Var;
        List list = (List) q0Var.f38334c;
        if (i10 >= 0 && i10 <= q0Var.size()) {
            this.f14844b = list.listIterator(q0Var.size() - i10);
            return;
        }
        StringBuilder n10 = a3.a.n("Position index ", i10, " must be in range [");
        n10.append(new kotlin.ranges.c(0, q0Var.size(), 1));
        n10.append("].");
        throw new IndexOutOfBoundsException(n10.toString());
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        switch (this.f14843a) {
            case 0:
                Object obj2 = t.f14919a;
                throw new IllegalStateException("Cannot modify a state list through an iterator".toString());
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        int i10 = this.f14843a;
        Object obj = this.f14844b;
        switch (i10) {
            case 0:
                if (((iu.x) obj).f20558a < ((c0) this.f14845c).f14859d - 1) {
                    return true;
                }
                return false;
            default:
                return ((ListIterator) obj).hasPrevious();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        int i10 = this.f14843a;
        Object obj = this.f14844b;
        switch (i10) {
            case 0:
                if (((iu.x) obj).f20558a >= 0) {
                    return true;
                }
                return false;
            default:
                return ((ListIterator) obj).hasNext();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int i10 = this.f14843a;
        Object obj = this.f14844b;
        switch (i10) {
            case 0:
                iu.x xVar = (iu.x) obj;
                int i11 = xVar.f20558a + 1;
                c0 c0Var = (c0) this.f14845c;
                t.a(i11, c0Var.f14859d);
                xVar.f20558a = i11;
                return c0Var.get(i11);
            default:
                return ((ListIterator) obj).previous();
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        int i10 = this.f14843a;
        Object obj = this.f14844b;
        switch (i10) {
            case 0:
                return ((iu.x) obj).f20558a + 1;
            default:
                q0 q0Var = (q0) this.f14845c;
                return vt.y.f(q0Var) - ((ListIterator) obj).previousIndex();
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        int i10 = this.f14843a;
        Object obj = this.f14844b;
        switch (i10) {
            case 0:
                iu.x xVar = (iu.x) obj;
                int i11 = xVar.f20558a;
                c0 c0Var = (c0) this.f14845c;
                t.a(i11, c0Var.f14859d);
                xVar.f20558a = i11 - 1;
                return c0Var.get(i11);
            default:
                return ((ListIterator) obj).next();
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        int i10 = this.f14843a;
        Object obj = this.f14844b;
        switch (i10) {
            case 0:
                return ((iu.x) obj).f20558a;
            default:
                q0 q0Var = (q0) this.f14845c;
                return vt.y.f(q0Var) - ((ListIterator) obj).nextIndex();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        switch (this.f14843a) {
            case 0:
                Object obj = t.f14919a;
                throw new IllegalStateException("Cannot modify a state list through an iterator".toString());
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.f14843a) {
            case 0:
                Object obj2 = t.f14919a;
                throw new IllegalStateException("Cannot modify a state list through an iterator".toString());
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public b0(iu.x xVar, c0 c0Var) {
        this.f14844b = xVar;
        this.f14845c = c0Var;
    }
}
