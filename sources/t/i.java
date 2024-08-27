package t;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public abstract class i implements Iterator, ju.a {

    /* renamed from: a, reason: collision with root package name */
    public int f34866a;

    /* renamed from: b, reason: collision with root package name */
    public int f34867b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f34868c;

    public i(int i10) {
        this.f34866a = i10;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f34867b < this.f34866a;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object f10;
        if (hasNext()) {
            int i10 = this.f34867b;
            b bVar = (b) this;
            int i11 = bVar.f34837d;
            Object obj = bVar.f34838e;
            switch (i11) {
                case 0:
                    f10 = ((f) obj).f(i10);
                    break;
                case 1:
                    f10 = ((f) obj).j(i10);
                    break;
                default:
                    f10 = ((g) obj).f34857b[i10];
                    break;
            }
            this.f34867b++;
            this.f34868c = true;
            return f10;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.f34868c) {
            int i10 = this.f34867b - 1;
            this.f34867b = i10;
            b bVar = (b) this;
            int i11 = bVar.f34837d;
            Object obj = bVar.f34838e;
            switch (i11) {
                case 0:
                    ((f) obj).h(i10);
                    break;
                case 1:
                    ((f) obj).h(i10);
                    break;
                default:
                    ((g) obj).b(i10);
                    break;
            }
            this.f34866a--;
            this.f34868c = false;
            return;
        }
        throw new IllegalStateException("Call next() before removing an element.".toString());
    }
}
