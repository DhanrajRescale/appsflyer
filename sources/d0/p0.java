package d0;

/* loaded from: classes.dex */
public final class p0 {

    /* renamed from: a, reason: collision with root package name */
    public final v0.h f13198a = new v0.h(new f[16]);

    /* renamed from: b, reason: collision with root package name */
    public int f13199b;

    /* renamed from: c, reason: collision with root package name */
    public f f13200c;

    public final void a(int i10, q qVar) {
        if (i10 >= 0) {
            if (i10 == 0) {
                return;
            }
            f fVar = new f(this.f13199b, i10, qVar);
            this.f13199b += i10;
            this.f13198a.b(fVar);
            return;
        }
        throw new IllegalArgumentException(jr.h.n("size should be >=0, but was ", i10).toString());
    }

    public final void b(int i10) {
        if (i10 >= 0 && i10 < this.f13199b) {
            return;
        }
        StringBuilder n10 = a3.a.n("Index ", i10, ", size ");
        n10.append(this.f13199b);
        throw new IndexOutOfBoundsException(n10.toString());
    }

    public final f c(int i10) {
        b(i10);
        f fVar = this.f13200c;
        if (fVar != null) {
            int i11 = fVar.f13158b;
            int i12 = fVar.f13157a;
            if (i10 < i11 + i12 && i12 <= i10) {
                return fVar;
            }
        }
        v0.h hVar = this.f13198a;
        f fVar2 = (f) hVar.f37653a[al.d.I(i10, hVar)];
        this.f13200c = fVar2;
        return fVar2;
    }
}
