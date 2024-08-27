package s5;

import r5.u0;
import r5.v0;

/* loaded from: classes.dex */
public final class h implements v0 {

    /* renamed from: a, reason: collision with root package name */
    public final j f34258a;

    /* renamed from: b, reason: collision with root package name */
    public final u0 f34259b;

    /* renamed from: c, reason: collision with root package name */
    public final int f34260c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f34261d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j f34262e;

    public h(j jVar, j jVar2, u0 u0Var, int i10) {
        this.f34262e = jVar;
        this.f34258a = jVar2;
        this.f34259b = u0Var;
        this.f34260c = i10;
    }

    public final void a() {
        if (!this.f34261d) {
            j jVar = this.f34262e;
            l0.j jVar2 = jVar.f34269g;
            int[] iArr = jVar.f34264b;
            int i10 = this.f34260c;
            jVar2.c(iArr[i10], jVar.f34265c[i10], 0, null, jVar.f34282t);
            this.f34261d = true;
        }
    }

    @Override // r5.v0
    public final void c() {
    }

    @Override // r5.v0
    public final boolean d() {
        j jVar = this.f34262e;
        if (!jVar.n() && this.f34259b.q(jVar.f34285w)) {
            return true;
        }
        return false;
    }

    @Override // r5.v0
    public final int e(long j10) {
        j jVar = this.f34262e;
        if (jVar.n()) {
            return 0;
        }
        boolean z10 = jVar.f34285w;
        u0 u0Var = this.f34259b;
        int p10 = u0Var.p(j10, z10);
        a aVar = jVar.f34284v;
        if (aVar != null) {
            p10 = Math.min(p10, aVar.a(this.f34260c + 1) - u0Var.n());
        }
        u0Var.w(p10);
        if (p10 > 0) {
            a();
        }
        return p10;
    }

    @Override // r5.v0
    public final int f(tr.e eVar, h5.f fVar, int i10) {
        j jVar = this.f34262e;
        if (jVar.n()) {
            return -3;
        }
        a aVar = jVar.f34284v;
        u0 u0Var = this.f34259b;
        if (aVar != null && aVar.a(this.f34260c + 1) <= u0Var.n()) {
            return -3;
        }
        a();
        return u0Var.t(eVar, fVar, i10, jVar.f34285w);
    }
}
