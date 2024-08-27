package e1;

import kotlin.jvm.functions.Function1;
import qu.i0;

/* loaded from: classes.dex */
public final class d0 extends c {

    /* renamed from: p, reason: collision with root package name */
    public final c f14862p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f14863q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f14864r;

    /* renamed from: s, reason: collision with root package name */
    public Function1 f14865s;

    /* renamed from: t, reason: collision with root package name */
    public Function1 f14866t;

    /* renamed from: u, reason: collision with root package name */
    public final long f14867u;

    public d0(c cVar, Function1 function1, Function1 function12, boolean z10, boolean z11) {
        super(0, n.f14896e, p.j(function1, (cVar == null || (r1 = cVar.f()) == null) ? ((b) p.f14912i.get()).f14847f : r1, z10), p.a(function12, (cVar == null || (r1 = cVar.i()) == null) ? ((b) p.f14912i.get()).f14848g : r1));
        Function1 i10;
        Function1 f10;
        this.f14862p = cVar;
        this.f14863q = z10;
        this.f14864r = z11;
        this.f14865s = this.f14847f;
        this.f14866t = this.f14848g;
        this.f14867u = dp.b.f1();
    }

    @Override // e1.c
    public final void A(v0.c cVar) {
        vl.b.p0();
        throw null;
    }

    @Override // e1.c
    public final c B(Function1 function1, Function1 function12) {
        Function1 j10 = p.j(function1, this.f14865s, true);
        Function1 a10 = p.a(function12, this.f14866t);
        if (!this.f14863q) {
            return new d0(C().B(null, a10), j10, a10, false, true);
        }
        return C().B(j10, a10);
    }

    public final c C() {
        c cVar = this.f14862p;
        if (cVar == null) {
            return (c) p.f14912i.get();
        }
        return cVar;
    }

    @Override // e1.c, e1.i
    public final void c() {
        c cVar;
        this.f14882c = true;
        if (this.f14864r && (cVar = this.f14862p) != null) {
            cVar.c();
        }
    }

    @Override // e1.i
    public final int d() {
        return C().d();
    }

    @Override // e1.i
    public final n e() {
        return C().e();
    }

    @Override // e1.c, e1.i
    public final Function1 f() {
        return this.f14865s;
    }

    @Override // e1.c, e1.i
    public final boolean g() {
        return C().g();
    }

    @Override // e1.c, e1.i
    public final int h() {
        return C().h();
    }

    @Override // e1.c, e1.i
    public final Function1 i() {
        return this.f14866t;
    }

    @Override // e1.c, e1.i
    public final void k() {
        vl.b.p0();
        throw null;
    }

    @Override // e1.c, e1.i
    public final void l() {
        vl.b.p0();
        throw null;
    }

    @Override // e1.c, e1.i
    public final void m() {
        C().m();
    }

    @Override // e1.c, e1.i
    public final void n(y yVar) {
        C().n(yVar);
    }

    @Override // e1.i
    public final void q(int i10) {
        vl.b.p0();
        throw null;
    }

    @Override // e1.i
    public final void r(n nVar) {
        vl.b.p0();
        throw null;
    }

    @Override // e1.c, e1.i
    public final void s(int i10) {
        C().s(i10);
    }

    @Override // e1.c, e1.i
    public final i t(Function1 function1) {
        Function1 j10 = p.j(function1, this.f14865s, true);
        if (!this.f14863q) {
            return p.g(C().t(null), j10, true);
        }
        return C().t(j10);
    }

    @Override // e1.c
    public final i0 v() {
        return C().v();
    }

    @Override // e1.c
    public final v0.c w() {
        return C().w();
    }

    @Override // e1.c
    /* renamed from: x */
    public final Function1 f() {
        return this.f14865s;
    }
}
