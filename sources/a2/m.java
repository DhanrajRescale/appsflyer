package a2;

/* loaded from: classes.dex */
public final class m implements l0 {

    /* renamed from: a, reason: collision with root package name */
    public final q f105a;

    /* renamed from: b, reason: collision with root package name */
    public final int f106b;

    /* renamed from: c, reason: collision with root package name */
    public final int f107c;

    public m(q qVar, int i10, int i11) {
        this.f105a = qVar;
        this.f106b = i10;
        this.f107c = i11;
    }

    @Override // a2.q
    public final int D(int i10) {
        return this.f105a.D(i10);
    }

    @Override // a2.l0
    public final a1 E(long j10) {
        int W;
        int z10;
        int i10 = this.f107c;
        int i11 = 32767;
        int i12 = this.f106b;
        q qVar = this.f105a;
        if (i10 == 1) {
            if (i12 == 2) {
                z10 = qVar.D(w2.a.g(j10));
            } else {
                z10 = qVar.z(w2.a.g(j10));
            }
            if (w2.a.c(j10)) {
                i11 = w2.a.g(j10);
            }
            return new o(z10, i11, 0);
        }
        if (i12 == 2) {
            W = qVar.e(w2.a.h(j10));
        } else {
            W = qVar.W(w2.a.h(j10));
        }
        if (w2.a.d(j10)) {
            i11 = w2.a.h(j10);
        }
        return new o(i11, W, 0);
    }

    @Override // a2.q
    public final int W(int i10) {
        return this.f105a.W(i10);
    }

    @Override // a2.q
    public final Object a() {
        return this.f105a.a();
    }

    @Override // a2.q
    public final int e(int i10) {
        return this.f105a.e(i10);
    }

    @Override // a2.q
    public final int z(int i10) {
        return this.f105a.z(i10);
    }
}
