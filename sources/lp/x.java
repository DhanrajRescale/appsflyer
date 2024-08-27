package lp;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public abstract class x implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public int f25075a;

    /* renamed from: b, reason: collision with root package name */
    public int f25076b;

    /* renamed from: c, reason: collision with root package name */
    public int f25077c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a0 f25078d;

    public x(a0 a0Var) {
        int i10;
        this.f25078d = a0Var;
        this.f25075a = a0Var.f24954e;
        if (a0Var.isEmpty()) {
            i10 = -1;
        } else {
            i10 = 0;
        }
        this.f25076b = i10;
        this.f25077c = -1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f25076b >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object obj;
        a0 a0Var = this.f25078d;
        if (a0Var.f24954e == this.f25075a) {
            if (hasNext()) {
                int i10 = this.f25076b;
                this.f25077c = i10;
                v vVar = (v) this;
                int i11 = vVar.f25064e;
                a0 a0Var2 = vVar.f25065f;
                switch (i11) {
                    case 0:
                        obj = a0Var2.i()[i10];
                        break;
                    case 1:
                        obj = new y(a0Var2, i10);
                        break;
                    default:
                        obj = a0Var2.j()[i10];
                        break;
                }
                int i12 = this.f25076b + 1;
                if (i12 >= a0Var.f24955f) {
                    i12 = -1;
                }
                this.f25076b = i12;
                return obj;
            }
            throw new NoSuchElementException();
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        a0 a0Var = this.f25078d;
        int i10 = a0Var.f24954e;
        int i11 = this.f25075a;
        if (i10 == i11) {
            int i12 = this.f25077c;
            if (i12 >= 0) {
                this.f25075a = i11 + 32;
                a0Var.remove(a0Var.i()[i12]);
                this.f25076b--;
                this.f25077c = -1;
                return;
            }
            throw new IllegalStateException("no calls to next() since the last call to remove()");
        }
        throw new ConcurrentModificationException();
    }
}
