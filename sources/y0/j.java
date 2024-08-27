package y0;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class j extends vt.n {

    /* renamed from: a, reason: collision with root package name */
    public final f f41034a;

    public j(f fVar) {
        this.f41034a = fVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // vt.n
    public final int b() {
        return this.f41034a.d();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f41034a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f41034a.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        s[] sVarArr = new s[8];
        for (int i10 = 0; i10 < 8; i10++) {
            sVarArr[i10] = new s();
        }
        return new g(this.f41034a, sVarArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        f fVar = this.f41034a;
        if (fVar.containsKey(obj)) {
            fVar.remove(obj);
            return true;
        }
        return false;
    }
}
