package x;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class x0 extends c2.o implements l1.c, c2.b0, c2.z1, c2.t, l1.p {

    /* renamed from: p, reason: collision with root package name */
    public l1.s f39769p;

    /* renamed from: q, reason: collision with root package name */
    public final v0 f39770q;

    /* renamed from: r, reason: collision with root package name */
    public final z0 f39771r;

    /* renamed from: s, reason: collision with root package name */
    public final c1 f39772s;

    /* renamed from: t, reason: collision with root package name */
    public final f0.f f39773t;

    /* renamed from: u, reason: collision with root package name */
    public final f0.g f39774u;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [c2.n, g1.n, x.v0] */
    /* JADX WARN: Type inference failed for: r2v1, types: [c2.n, g1.n, x.z0] */
    /* JADX WARN: Type inference failed for: r2v2, types: [c2.n, x.c1, g1.n] */
    public x0(a0.l lVar) {
        ?? nVar = new g1.n();
        nVar.f39741n = lVar;
        Q0(nVar);
        this.f39770q = nVar;
        ?? nVar2 = new g1.n();
        Q0(nVar2);
        this.f39771r = nVar2;
        ?? nVar3 = new g1.n();
        Q0(nVar3);
        this.f39772s = nVar3;
        f0.f fVar = new f0.f();
        this.f39773t = fVar;
        f0.g gVar = new f0.g(fVar);
        Q0(gVar);
        this.f39774u = gVar;
    }

    @Override // c2.t
    public final void C0(c2.i1 i1Var) {
        this.f39772s.C0(i1Var);
    }

    public final void T0(a0.l lVar) {
        a0.d dVar;
        v0 v0Var = this.f39770q;
        if (!Intrinsics.a(v0Var.f39741n, lVar)) {
            a0.l lVar2 = v0Var.f39741n;
            if (lVar2 != null && (dVar = v0Var.f39742o) != null) {
                lVar2.b(new a0.e(dVar));
            }
            v0Var.f39742o = null;
            v0Var.f39741n = lVar;
        }
    }

    @Override // c2.b0
    public final void g0(c2.i1 i1Var) {
        this.f39774u.f15874o = i1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [a0.j, a0.d, java.lang.Object] */
    @Override // l1.c
    public final void i(l1.s sVar) {
        Function1 function1;
        Function1 function12;
        if (!Intrinsics.a(this.f39769p, sVar)) {
            boolean a10 = sVar.a();
            d0.c0 c0Var = null;
            if (a10) {
                yk.g.H(E0(), null, null, new w0(this, null), 3);
            }
            if (this.f16417m) {
                c2.g.u(this);
            }
            v0 v0Var = this.f39770q;
            a0.l lVar = v0Var.f39741n;
            if (lVar != null) {
                if (a10) {
                    a0.d dVar = v0Var.f39742o;
                    if (dVar != null) {
                        v0Var.Q0(lVar, new a0.e(dVar));
                        v0Var.f39742o = null;
                    }
                    ?? obj = new Object();
                    v0Var.Q0(lVar, obj);
                    v0Var.f39742o = obj;
                } else {
                    a0.d dVar2 = v0Var.f39742o;
                    if (dVar2 != null) {
                        v0Var.Q0(lVar, new a0.e(dVar2));
                        v0Var.f39742o = null;
                    }
                }
            }
            c1 c1Var = this.f39772s;
            if (a10 != c1Var.f39518n) {
                if (!a10) {
                    if (c1Var.f16417m) {
                        function12 = (Function1) c1Var.c(b1.f39509a);
                    } else {
                        function12 = null;
                    }
                    if (function12 != null) {
                        function12.invoke(null);
                    }
                } else {
                    a2.u uVar = c1Var.f39519o;
                    if (uVar != null && uVar.m()) {
                        if (c1Var.f16417m) {
                            function1 = (Function1) c1Var.c(b1.f39509a);
                        } else {
                            function1 = null;
                        }
                        if (function1 != null) {
                            function1.invoke(c1Var.f39519o);
                        }
                    }
                }
                c1Var.f39518n = a10;
            }
            z0 z0Var = this.f39771r;
            if (a10) {
                z0Var.getClass();
                iu.z zVar = new iu.z();
                c2.g.w(z0Var, new y0(0, zVar, z0Var));
                d0.c0 c0Var2 = (d0.c0) zVar.f20560a;
                if (c0Var2 != null) {
                    c0Var2.a();
                    c0Var = c0Var2;
                }
                z0Var.f39791n = c0Var;
            } else {
                d0.c0 c0Var3 = z0Var.f39791n;
                if (c0Var3 != null) {
                    c0Var3.b();
                }
                z0Var.f39791n = null;
            }
            z0Var.f39792o = a10;
            this.f39769p = sVar;
        }
    }

    @Override // c2.z1
    public final void n(h2.j jVar) {
        l1.s sVar = this.f39769p;
        boolean z10 = false;
        if (sVar != null && sVar.a()) {
            z10 = true;
        }
        ou.g[] gVarArr = h2.t.f17908a;
        h2.u uVar = h2.r.f17892l;
        ou.g gVar = h2.t.f17908a[4];
        uVar.a(jVar, Boolean.valueOf(z10));
        jVar.h(h2.i.f17844t, new h2.a(null, new a(this, 2)));
    }
}
