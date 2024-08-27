package y0;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class i implements Iterator, ju.a {

    /* renamed from: a, reason: collision with root package name */
    public final g f41033a;

    public i(f fVar) {
        s[] sVarArr = new s[8];
        for (int i10 = 0; i10 < 8; i10++) {
            sVarArr[i10] = new v(this);
        }
        this.f41033a = new g(fVar, sVarArr);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f41033a.f41022c;
    }

    @Override // java.util.Iterator
    public final Object next() {
        return (Map.Entry) this.f41033a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f41033a.remove();
    }
}
