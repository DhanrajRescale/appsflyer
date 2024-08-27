package c2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class j0 implements p1.h, p1.e {

    /* renamed from: a, reason: collision with root package name */
    public final p1.c f7740a = new p1.c();

    /* renamed from: b, reason: collision with root package name */
    public s f7741b;

    @Override // p1.h
    public final void B(long j10, long j11, long j12, long j13, p1.i iVar, float f10, n1.u uVar, int i10) {
        this.f7740a.B(j10, j11, j12, j13, iVar, f10, uVar, i10);
    }

    @Override // w2.b
    public final long H(float f10) {
        return this.f7740a.H(f10);
    }

    @Override // w2.b
    public final float N(int i10) {
        return this.f7740a.N(i10);
    }

    @Override // w2.b
    public final float P(float f10) {
        return this.f7740a.P(f10);
    }

    @Override // p1.h
    public final void Q(n1.p pVar, long j10, long j11, float f10, int i10, n1.q0 q0Var, float f11, n1.u uVar, int i11) {
        this.f7740a.Q(pVar, j10, j11, f10, i10, q0Var, f11, uVar, i11);
    }

    @Override // p1.h
    public final void X(long j10, long j11, long j12, float f10, int i10, n1.q0 q0Var, float f11, n1.u uVar, int i11) {
        this.f7740a.X(j10, j11, j12, f10, i10, q0Var, f11, uVar, i11);
    }

    @Override // w2.b
    public final float Y() {
        return this.f7740a.Y();
    }

    public final void a() {
        n1.r a10 = this.f7740a.f30501b.a();
        n nVar = this.f7741b;
        Intrinsics.c(nVar);
        g1.n nVar2 = (g1.n) nVar;
        g1.n nVar3 = nVar2.f16405a.f16410f;
        if (nVar3 != null && (nVar3.f16408d & 4) != 0) {
            while (nVar3 != null) {
                int i10 = nVar3.f16407c;
                if ((i10 & 2) != 0) {
                    break;
                } else if ((i10 & 4) != 0) {
                    break;
                } else {
                    nVar3 = nVar3.f16410f;
                }
            }
        }
        nVar3 = null;
        if (nVar3 != null) {
            v0.h hVar = null;
            while (nVar3 != null) {
                if (nVar3 instanceof s) {
                    s sVar = (s) nVar3;
                    i1 x10 = g.x(sVar, 4);
                    long i12 = hl.f.i1(x10.f31c);
                    androidx.compose.ui.node.a aVar = x10.f7721k;
                    aVar.getClass();
                    ((d2.a0) k0.a(aVar)).getSharedDrawScope().c(a10, i12, x10, sVar);
                } else if ((nVar3.f16407c & 4) != 0 && (nVar3 instanceof o)) {
                    int i11 = 0;
                    for (g1.n nVar4 = ((o) nVar3).f7801o; nVar4 != null; nVar4 = nVar4.f16410f) {
                        if ((nVar4.f16407c & 4) != 0) {
                            i11++;
                            if (i11 == 1) {
                                nVar3 = nVar4;
                            } else {
                                if (hVar == null) {
                                    hVar = new v0.h(new g1.n[16]);
                                }
                                if (nVar3 != null) {
                                    hVar.b(nVar3);
                                    nVar3 = null;
                                }
                                hVar.b(nVar4);
                            }
                        }
                    }
                    if (i11 == 1) {
                    }
                }
                nVar3 = g.f(hVar);
            }
            return;
        }
        i1 x11 = g.x(nVar, 4);
        if (x11.W0() == nVar2.f16405a) {
            x11 = x11.f7722l;
            Intrinsics.c(x11);
        }
        x11.g1(a10);
    }

    @Override // w2.b
    public final float b() {
        return this.f7740a.b();
    }

    public final void c(n1.r rVar, long j10, i1 i1Var, s sVar) {
        s sVar2 = this.f7741b;
        this.f7741b = sVar;
        w2.k kVar = i1Var.f7721k.f1418s;
        p1.c cVar = this.f7740a;
        p1.a aVar = cVar.f30500a;
        w2.b bVar = aVar.f30494a;
        w2.k kVar2 = aVar.f30495b;
        n1.r rVar2 = aVar.f30496c;
        long j11 = aVar.f30497d;
        aVar.f30494a = i1Var;
        aVar.f30495b = kVar;
        aVar.f30496c = rVar;
        aVar.f30497d = j10;
        rVar.h();
        sVar.e(this);
        rVar.s();
        p1.a aVar2 = cVar.f30500a;
        aVar2.f30494a = bVar;
        aVar2.f30495b = kVar2;
        aVar2.f30496c = rVar2;
        aVar2.f30497d = j11;
        this.f7741b = sVar2;
    }

    @Override // w2.b
    public final float c0(float f10) {
        return this.f7740a.b() * f10;
    }

    @Override // p1.h
    public final long d() {
        return this.f7740a.d();
    }

    @Override // p1.h
    public final void e0(n1.p pVar, long j10, long j11, long j12, float f10, p1.i iVar, n1.u uVar, int i10) {
        this.f7740a.e0(pVar, j10, j11, j12, f10, iVar, uVar, i10);
    }

    @Override // p1.h
    public final p1.b f0() {
        return this.f7740a.f30501b;
    }

    @Override // p1.h
    public final w2.k getLayoutDirection() {
        return this.f7740a.f30500a.f30495b;
    }

    @Override // w2.b
    public final int h0(long j10) {
        return this.f7740a.h0(j10);
    }

    @Override // p1.h
    public final void i0(long j10, float f10, float f11, long j11, long j12, float f12, p1.i iVar, n1.u uVar, int i10) {
        this.f7740a.i0(j10, f10, f11, j11, j12, f12, iVar, uVar, i10);
    }

    @Override // p1.h
    public final void k0(n1.p0 p0Var, n1.p pVar, float f10, p1.i iVar, n1.u uVar, int i10) {
        this.f7740a.k0(p0Var, pVar, f10, iVar, uVar, i10);
    }

    @Override // w2.b
    public final int m0(float f10) {
        return this.f7740a.m0(f10);
    }

    @Override // w2.b
    public final long o(float f10) {
        return this.f7740a.o(f10);
    }

    @Override // w2.b
    public final long p(long j10) {
        return this.f7740a.p(j10);
    }

    @Override // p1.h
    public final long p0() {
        return this.f7740a.p0();
    }

    @Override // p1.h
    public final void s(n1.p0 p0Var, long j10, float f10, p1.i iVar, n1.u uVar, int i10) {
        this.f7740a.s(p0Var, j10, f10, iVar, uVar, i10);
    }

    @Override // w2.b
    public final long s0(long j10) {
        return this.f7740a.s0(j10);
    }

    @Override // p1.h
    public final void t(n1.h0 h0Var, long j10, long j11, long j12, long j13, float f10, p1.i iVar, n1.u uVar, int i10, int i11) {
        this.f7740a.t(h0Var, j10, j11, j12, j13, f10, iVar, uVar, i10, i11);
    }

    @Override // p1.h
    public final void t0(n1.p pVar, long j10, long j11, float f10, p1.i iVar, n1.u uVar, int i10) {
        this.f7740a.t0(pVar, j10, j11, f10, iVar, uVar, i10);
    }

    @Override // p1.h
    public final void v(n1.h0 h0Var, long j10, float f10, p1.i iVar, n1.u uVar, int i10) {
        this.f7740a.v(h0Var, j10, f10, iVar, uVar, i10);
    }

    @Override // p1.h
    public final void w(long j10, long j11, long j12, float f10, p1.i iVar, n1.u uVar, int i10) {
        this.f7740a.w(j10, j11, j12, f10, iVar, uVar, i10);
    }

    @Override // w2.b
    public final float x(long j10) {
        return this.f7740a.x(j10);
    }

    @Override // w2.b
    public final float x0(long j10) {
        return this.f7740a.x0(j10);
    }

    @Override // p1.h
    public final void y(long j10, float f10, long j11, float f11, p1.i iVar, n1.u uVar, int i10) {
        this.f7740a.y(j10, f10, j11, f11, iVar, uVar, i10);
    }
}
