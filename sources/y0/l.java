package y0;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class l extends vt.k {

    /* renamed from: a, reason: collision with root package name */
    public final f f41035a;

    public l(f fVar) {
        this.f41035a = fVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // vt.k
    public final int b() {
        return this.f41035a.d();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f41035a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f41035a.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        s[] sVarArr = new s[8];
        for (int i10 = 0; i10 < 8; i10++) {
            sVarArr[i10] = new s();
        }
        return new g(this.f41035a, sVarArr);
    }
}
