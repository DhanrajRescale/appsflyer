package y0;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class p extends vt.b {

    /* renamed from: a, reason: collision with root package name */
    public final d f41038a;

    public p(d dVar) {
        this.f41038a = dVar;
    }

    @Override // vt.b
    public final int b() {
        return this.f41038a.size();
    }

    @Override // vt.b, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f41038a.containsValue(obj);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        r rVar = this.f41038a.f41018d;
        s[] sVarArr = new s[8];
        for (int i10 = 0; i10 < 8; i10++) {
            sVarArr[i10] = new s();
        }
        return new e(rVar, sVarArr);
    }
}
