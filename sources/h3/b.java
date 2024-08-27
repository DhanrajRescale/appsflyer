package h3;

import j3.j;
import w.k;

/* loaded from: classes.dex */
public final class b extends g3.g {
    public int n0;

    /* renamed from: o0, reason: collision with root package name */
    public int f17913o0;

    /* renamed from: p0, reason: collision with root package name */
    public j3.a f17914p0;

    @Override // g3.g, g3.b, g3.h
    public final void a() {
        t();
        int e10 = k.e(this.n0);
        int i10 = 1;
        if (e10 != 1 && e10 != 3) {
            i10 = e10 != 4 ? e10 != 5 ? 0 : 3 : 2;
        }
        j3.a aVar = this.f17914p0;
        aVar.f20818u0 = i10;
        aVar.f20820w0 = this.f17913o0;
    }

    @Override // g3.b
    public final g3.b l(int i10) {
        this.f17913o0 = i10;
        return this;
    }

    @Override // g3.b
    public final g3.b m(Float f10) {
        this.f17913o0 = this.f16493k0.c(f10);
        return this;
    }

    @Override // g3.g
    public final j t() {
        if (this.f17914p0 == null) {
            this.f17914p0 = new j3.a();
        }
        return this.f17914p0;
    }
}
