package y0;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class o extends vt.o {

    /* renamed from: b, reason: collision with root package name */
    public final d f41037b;

    public o(d dVar) {
        this.f41037b = dVar;
    }

    @Override // vt.b
    public final int b() {
        return this.f41037b.size();
    }

    @Override // vt.b, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f41037b.containsKey(obj);
    }

    @Override // vt.o, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        r rVar = this.f41037b.f41018d;
        s[] sVarArr = new s[8];
        for (int i10 = 0; i10 < 8; i10++) {
            sVarArr[i10] = new s();
        }
        return new e(rVar, sVarArr);
    }
}
