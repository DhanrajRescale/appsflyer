package x0;

import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class h extends a {

    /* renamed from: c, reason: collision with root package name */
    public final f f39813c;

    /* renamed from: d, reason: collision with root package name */
    public int f39814d;

    /* renamed from: e, reason: collision with root package name */
    public k f39815e;

    /* renamed from: f, reason: collision with root package name */
    public int f39816f;

    public h(f fVar, int i10) {
        super(i10, fVar.getF38332c());
        this.f39813c = fVar;
        this.f39814d = fVar.i();
        this.f39816f = -1;
        c();
    }

    @Override // x0.a, java.util.ListIterator
    public final void add(Object obj) {
        b();
        int i10 = this.f39794a;
        f fVar = this.f39813c;
        fVar.add(i10, obj);
        this.f39794a++;
        this.f39795b = fVar.getF38332c();
        this.f39814d = fVar.i();
        this.f39816f = -1;
        c();
    }

    public final void b() {
        if (this.f39814d == this.f39813c.i()) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r6v4 */
    public final void c() {
        f fVar = this.f39813c;
        Object[] objArr = fVar.f39808f;
        if (objArr == null) {
            this.f39815e = null;
            return;
        }
        int i10 = (fVar.f39810h - 1) & (-32);
        int i11 = this.f39794a;
        if (i11 > i10) {
            i11 = i10;
        }
        int i12 = (fVar.f39806d / 5) + 1;
        k kVar = this.f39815e;
        if (kVar == null) {
            this.f39815e = new k(objArr, i11, i10, i12);
            return;
        }
        kVar.f39794a = i11;
        kVar.f39795b = i10;
        kVar.f39820c = i12;
        if (kVar.f39821d.length < i12) {
            kVar.f39821d = new Object[i12];
        }
        ?? r62 = 0;
        kVar.f39821d[0] = objArr;
        if (i11 == i10) {
            r62 = 1;
        }
        kVar.f39822e = r62;
        kVar.c(i11 - r62, 1);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        b();
        if (hasNext()) {
            int i10 = this.f39794a;
            this.f39816f = i10;
            k kVar = this.f39815e;
            f fVar = this.f39813c;
            if (kVar == null) {
                Object[] objArr = fVar.f39809g;
                this.f39794a = i10 + 1;
                return objArr[i10];
            }
            if (kVar.hasNext()) {
                this.f39794a++;
                return kVar.next();
            }
            Object[] objArr2 = fVar.f39809g;
            int i11 = this.f39794a;
            this.f39794a = i11 + 1;
            return objArr2[i11 - kVar.f39795b];
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        b();
        if (hasPrevious()) {
            int i10 = this.f39794a;
            this.f39816f = i10 - 1;
            k kVar = this.f39815e;
            f fVar = this.f39813c;
            if (kVar == null) {
                Object[] objArr = fVar.f39809g;
                int i11 = i10 - 1;
                this.f39794a = i11;
                return objArr[i11];
            }
            int i12 = kVar.f39795b;
            if (i10 > i12) {
                Object[] objArr2 = fVar.f39809g;
                int i13 = i10 - 1;
                this.f39794a = i13;
                return objArr2[i13 - i12];
            }
            this.f39794a = i10 - 1;
            return kVar.previous();
        }
        throw new NoSuchElementException();
    }

    @Override // x0.a, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        b();
        int i10 = this.f39816f;
        if (i10 != -1) {
            f fVar = this.f39813c;
            fVar.e(i10);
            int i11 = this.f39816f;
            if (i11 < this.f39794a) {
                this.f39794a = i11;
            }
            this.f39795b = fVar.getF38332c();
            this.f39814d = fVar.i();
            this.f39816f = -1;
            c();
            return;
        }
        throw new IllegalStateException();
    }

    @Override // x0.a, java.util.ListIterator
    public final void set(Object obj) {
        b();
        int i10 = this.f39816f;
        if (i10 != -1) {
            f fVar = this.f39813c;
            fVar.set(i10, obj);
            this.f39814d = fVar.i();
            c();
            return;
        }
        throw new IllegalStateException();
    }
}
