package r5;

import b5.i1;

/* loaded from: classes.dex */
public abstract class f1 extends h {

    /* renamed from: k, reason: collision with root package name */
    public final a f33161k;

    public f1(a aVar) {
        this.f33161k = aVar;
    }

    @Override // r5.a
    public final i1 g() {
        return this.f33161k.g();
    }

    @Override // r5.a
    public final b5.k0 h() {
        return this.f33161k.h();
    }

    @Override // r5.a
    public final boolean i() {
        return this.f33161k.i();
    }

    @Override // r5.a
    public final void l(g5.u uVar) {
        this.f33175j = uVar;
        this.f33174i = e5.x.l(null);
        z();
    }

    @Override // r5.h
    public final w s(Object obj, w wVar) {
        return x(wVar);
    }

    @Override // r5.h
    public final long t(long j10, Object obj) {
        return j10;
    }

    @Override // r5.h
    public final int u(int i10, Object obj) {
        return i10;
    }

    @Override // r5.h
    public final void v(Object obj, a aVar, i1 i1Var) {
        y(i1Var);
    }

    public w x(w wVar) {
        return wVar;
    }

    public abstract void y(i1 i1Var);

    public void z() {
        w(null, this.f33161k);
    }
}
