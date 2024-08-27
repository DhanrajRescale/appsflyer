package x0;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class g extends a {

    /* renamed from: c, reason: collision with root package name */
    public final Object[] f39811c;

    /* renamed from: d, reason: collision with root package name */
    public final k f39812d;

    public g(Object[] objArr, int i10, Object[] objArr2, int i11, int i12) {
        super(i10, i11);
        this.f39811c = objArr2;
        int i13 = (i11 - 1) & (-32);
        this.f39812d = new k(objArr, i10 > i13 ? i13 : i10, i13, i12);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            k kVar = this.f39812d;
            if (kVar.hasNext()) {
                this.f39794a++;
                return kVar.next();
            }
            int i10 = this.f39794a;
            this.f39794a = i10 + 1;
            return this.f39811c[i10 - kVar.f39795b];
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            int i10 = this.f39794a;
            k kVar = this.f39812d;
            int i11 = kVar.f39795b;
            if (i10 > i11) {
                int i12 = i10 - 1;
                this.f39794a = i12;
                return this.f39811c[i12 - i11];
            }
            this.f39794a = i10 - 1;
            return kVar.previous();
        }
        throw new NoSuchElementException();
    }
}
