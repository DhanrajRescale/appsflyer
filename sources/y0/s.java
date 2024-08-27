package y0;

import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class s implements Iterator, ju.a {

    /* renamed from: a, reason: collision with root package name */
    public Object[] f41046a = r.f41041e.f41045d;

    /* renamed from: b, reason: collision with root package name */
    public int f41047b;

    /* renamed from: c, reason: collision with root package name */
    public int f41048c;

    public final void b(int i10, int i11, Object[] objArr) {
        this.f41046a = objArr;
        this.f41047b = i10;
        this.f41048c = i11;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f41048c < this.f41047b;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
