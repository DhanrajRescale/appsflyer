package e1;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class e0 extends i {

    /* renamed from: f, reason: collision with root package name */
    public final i f14870f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f14871g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f14872h;

    /* renamed from: i, reason: collision with root package name */
    public Function1 f14873i;

    /* renamed from: j, reason: collision with root package name */
    public final long f14874j;

    public e0(i iVar, Function1 function1, boolean z10) {
        super(0, n.f14896e);
        Function1 f10;
        this.f14870f = iVar;
        this.f14871g = false;
        this.f14872h = z10;
        this.f14873i = p.j(function1, (iVar == null || (f10 = iVar.f()) == null) ? ((b) p.f14912i.get()).f14847f : f10, false);
        this.f14874j = dp.b.f1();
    }

    @Override // e1.i
    public final void c() {
        i iVar;
        this.f14882c = true;
        if (this.f14872h && (iVar = this.f14870f) != null) {
            iVar.c();
        }
    }

    @Override // e1.i
    public final int d() {
        return u().d();
    }

    @Override // e1.i
    public final n e() {
        return u().e();
    }

    @Override // e1.i
    public final Function1 f() {
        return this.f14873i;
    }

    @Override // e1.i
    public final boolean g() {
        return u().g();
    }

    @Override // e1.i
    public final Function1 i() {
        return null;
    }

    @Override // e1.i
    public final void k() {
        vl.b.p0();
        throw null;
    }

    @Override // e1.i
    public final void l() {
        vl.b.p0();
        throw null;
    }

    @Override // e1.i
    public final void m() {
        u().m();
    }

    @Override // e1.i
    public final void n(y yVar) {
        u().n(yVar);
    }

    @Override // e1.i
    public final i t(Function1 function1) {
        Function1 j10 = p.j(function1, this.f14873i, true);
        if (!this.f14871g) {
            return p.g(u().t(null), j10, true);
        }
        return u().t(j10);
    }

    public final i u() {
        i iVar = this.f14870f;
        if (iVar == null) {
            return (i) p.f14912i.get();
        }
        return iVar;
    }
}
