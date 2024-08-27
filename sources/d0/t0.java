package d0;

import a2.h1;

/* loaded from: classes.dex */
public final class t0 implements e0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f13222a;

    /* renamed from: b, reason: collision with root package name */
    public final long f13223b;

    /* renamed from: c, reason: collision with root package name */
    public h1 f13224c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f13225d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f13226e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ u0 f13227f;

    public t0(u0 u0Var, int i10, long j10) {
        this.f13227f = u0Var;
        this.f13222a = i10;
        this.f13223b = j10;
    }

    public final boolean a() {
        if (!this.f13226e) {
            int c10 = ((u) this.f13227f.f13228a.f13214b.mo2invoke()).c();
            int i10 = this.f13222a;
            if (i10 >= 0 && i10 < c10) {
                return true;
            }
        }
        return false;
    }

    public final void b() {
        if (a()) {
            if (this.f13224c == null) {
                u0 u0Var = this.f13227f;
                u uVar = (u) u0Var.f13228a.f13214b.mo2invoke();
                int i10 = this.f13222a;
                Object a10 = uVar.a(i10);
                this.f13224c = u0Var.f13229b.a().f(a10, u0Var.f13228a.a(i10, a10, uVar.d(i10)));
                return;
            }
            throw new IllegalArgumentException("Request was already composed!".toString());
        }
        throw new IllegalArgumentException("Callers should check whether the request is still valid before calling performComposition()".toString());
    }

    public final void c() {
        if (!this.f13226e) {
            if (!this.f13225d) {
                this.f13225d = true;
                h1 h1Var = this.f13224c;
                if (h1Var != null) {
                    int b10 = h1Var.b();
                    for (int i10 = 0; i10 < b10; i10++) {
                        h1Var.c(i10, this.f13223b);
                    }
                    return;
                }
                throw new IllegalArgumentException("performComposition() must be called before performMeasure()".toString());
            }
            throw new IllegalArgumentException("Request was already measured!".toString());
        }
        throw new IllegalArgumentException("Callers should check whether the request is still valid before calling performMeasure()".toString());
    }

    @Override // d0.e0
    public final void cancel() {
        if (!this.f13226e) {
            this.f13226e = true;
            h1 h1Var = this.f13224c;
            if (h1Var != null) {
                h1Var.a();
            }
            this.f13224c = null;
        }
    }

    public final String toString() {
        boolean z10;
        StringBuilder sb2 = new StringBuilder("HandleAndRequestImpl { index = ");
        sb2.append(this.f13222a);
        sb2.append(", constraints = ");
        sb2.append((Object) w2.a.k(this.f13223b));
        sb2.append(", isComposed = ");
        if (this.f13224c != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        sb2.append(z10);
        sb2.append(", isMeasured = ");
        sb2.append(this.f13225d);
        sb2.append(", isCanceled = ");
        return da.e.o(sb2, this.f13226e, " }");
    }
}
