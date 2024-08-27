package k0;

import a2.a1;
import a2.l0;
import a2.n0;
import a2.o0;
import a2.p;
import a2.q;
import c2.c0;
import c2.j0;
import c2.s;
import c2.z1;
import g1.n;
import h2.u;
import i0.l1;
import j2.b0;
import j2.g0;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import n1.w0;
import n1.x;
import o2.r;
import t0.n1;
import t0.o3;
import t0.t;

/* loaded from: classes.dex */
public final class k extends n implements c0, s, z1 {

    /* renamed from: n, reason: collision with root package name */
    public String f21878n;

    /* renamed from: o, reason: collision with root package name */
    public g0 f21879o;

    /* renamed from: p, reason: collision with root package name */
    public r f21880p;

    /* renamed from: q, reason: collision with root package name */
    public int f21881q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f21882r;

    /* renamed from: s, reason: collision with root package name */
    public int f21883s;

    /* renamed from: t, reason: collision with root package name */
    public int f21884t;

    /* renamed from: u, reason: collision with root package name */
    public x f21885u;

    /* renamed from: v, reason: collision with root package name */
    public Map f21886v;

    /* renamed from: w, reason: collision with root package name */
    public e f21887w;

    /* renamed from: x, reason: collision with root package name */
    public j f21888x;

    /* renamed from: y, reason: collision with root package name */
    public final n1 f21889y = t.n0(null, o3.f35116a);

    public k(String str, g0 g0Var, r rVar, int i10, boolean z10, int i11, int i12, x xVar) {
        this.f21878n = str;
        this.f21879o = g0Var;
        this.f21880p = rVar;
        this.f21881q = i10;
        this.f21882r = z10;
        this.f21883s = i11;
        this.f21884t = i12;
        this.f21885u = xVar;
    }

    @Override // c2.c0
    public final int F(a2.r rVar, q qVar, int i10) {
        return R0(rVar).a(i10, rVar.getLayoutDirection());
    }

    public final e Q0() {
        if (this.f21887w == null) {
            this.f21887w = new e(this.f21878n, this.f21879o, this.f21880p, this.f21881q, this.f21882r, this.f21883s, this.f21884t);
        }
        e eVar = this.f21887w;
        Intrinsics.c(eVar);
        return eVar;
    }

    public final e R0(w2.b bVar) {
        e eVar;
        i S0 = S0();
        if (S0 != null && S0.f21874c && (eVar = S0.f21875d) != null) {
            eVar.c(bVar);
            return eVar;
        }
        e Q0 = Q0();
        Q0.c(bVar);
        return Q0;
    }

    public final i S0() {
        return (i) this.f21889y.getValue();
    }

    @Override // c2.c0
    public final n0 a(o0 o0Var, l0 l0Var, long j10) {
        long j11;
        boolean z10;
        boolean z11;
        j2.r rVar;
        boolean z12;
        e R0 = R0(o0Var);
        w2.k layoutDirection = o0Var.getLayoutDirection();
        if (R0.f21841g > 1) {
            b bVar = R0.f21847m;
            g0 g0Var = R0.f21836b;
            w2.b bVar2 = R0.f21843i;
            Intrinsics.c(bVar2);
            b G = kq.e.G(bVar, layoutDirection, g0Var, bVar2, R0.f21837c);
            R0.f21847m = G;
            j11 = G.a(R0.f21841g, j10);
        } else {
            j11 = j10;
        }
        j2.a aVar = R0.f21844j;
        if (aVar != null && (rVar = R0.f21848n) != null && !rVar.a() && layoutDirection == R0.f21849o && (w2.a.b(j11, R0.f21850p) || (w2.a.h(j11) == w2.a.h(R0.f21850p) && w2.a.g(j11) >= aVar.b() && !aVar.f20630d.f21963c))) {
            if (!w2.a.b(j11, R0.f21850p)) {
                j2.a aVar2 = R0.f21844j;
                Intrinsics.c(aVar2);
                R0.f21846l = hl.f.I(j11, hl.f.k(l1.q(Math.min(aVar2.f20627a.f33034i.b(), aVar2.c())), l1.q(aVar2.b())));
                if (!kp.j.N(R0.f21838d, 3) && (((int) (r12 >> 32)) < aVar2.c() || ((int) (r12 & 4294967295L)) < aVar2.b())) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                R0.f21845k = z12;
                R0.f21850p = j11;
            }
            z11 = false;
        } else {
            j2.a b10 = R0.b(j11, layoutDirection);
            R0.f21850p = j11;
            R0.f21846l = hl.f.I(j11, hl.f.k(l1.q(b10.c()), l1.q(b10.b())));
            if (!kp.j.N(R0.f21838d, 3) && (((int) (r5 >> 32)) < b10.c() || ((int) (r5 & 4294967295L)) < b10.b())) {
                z10 = true;
            } else {
                z10 = false;
            }
            R0.f21845k = z10;
            R0.f21844j = b10;
            z11 = true;
        }
        j2.r rVar2 = R0.f21848n;
        if (rVar2 != null) {
            rVar2.a();
        }
        Unit unit = Unit.f23355a;
        j2.a aVar3 = R0.f21844j;
        Intrinsics.c(aVar3);
        long j12 = R0.f21846l;
        if (z11) {
            c2.g.x(this, 2).b1();
            Map map = this.f21886v;
            if (map == null) {
                map = new LinkedHashMap(2);
            }
            p pVar = a2.d.f47a;
            k2.t tVar = aVar3.f20630d;
            map.put(pVar, Integer.valueOf(Math.round(tVar.c(0))));
            map.put(a2.d.f48b, Integer.valueOf(Math.round(tVar.c(tVar.f21965e - 1))));
            this.f21886v = map;
        }
        int i10 = (int) (j12 >> 32);
        int i11 = (int) (j12 & 4294967295L);
        a1 E = l0Var.E(al.d.l0(i10, i11));
        Map map2 = this.f21886v;
        Intrinsics.c(map2);
        return o0Var.n0(i10, i11, map2, new v.f(12, E));
    }

    @Override // c2.c0
    public final int d0(a2.r rVar, q qVar, int i10) {
        return l1.q(R0(rVar).d(rVar.getLayoutDirection()).c());
    }

    @Override // c2.s
    public final void e(p1.e eVar) {
        long j10;
        if (!this.f16417m) {
            return;
        }
        j2.a aVar = Q0().f21844j;
        if (aVar != null) {
            n1.r a10 = ((j0) eVar).f7740a.f30501b.a();
            boolean z10 = Q0().f21845k;
            if (z10) {
                m1.d h10 = t.h(m1.c.f27233b, t.j((int) (Q0().f21846l >> 32), (int) (Q0().f21846l & 4294967295L)));
                a10.h();
                n1.r.m(a10, h10);
            }
            try {
                b0 b0Var = this.f21879o.f20722a;
                u2.j jVar = b0Var.f20671m;
                if (jVar == null) {
                    jVar = u2.j.f36684b;
                }
                u2.j jVar2 = jVar;
                w0 w0Var = b0Var.f20672n;
                if (w0Var == null) {
                    w0Var = w0.f28204d;
                }
                w0 w0Var2 = w0Var;
                p1.i iVar = b0Var.f20674p;
                if (iVar == null) {
                    iVar = p1.k.f30509a;
                }
                p1.i iVar2 = iVar;
                n1.p b10 = b0Var.f20659a.b();
                if (b10 != null) {
                    float c10 = this.f21879o.f20722a.f20659a.c();
                    p1.h.S.getClass();
                    aVar.f(a10, b10, c10, w0Var2, jVar2, iVar2, p1.g.f30507b);
                } else {
                    x xVar = this.f21885u;
                    if (xVar != null) {
                        j10 = xVar.a();
                    } else {
                        j10 = n1.t.f28177i;
                    }
                    if (j10 == 16) {
                        if (this.f21879o.b() != 16) {
                            j10 = this.f21879o.b();
                        } else {
                            j10 = n1.t.f28170b;
                        }
                    }
                    long j11 = j10;
                    p1.h.S.getClass();
                    aVar.e(a10, j11, w0Var2, jVar2, iVar2, p1.g.f30507b);
                }
                if (z10) {
                    a10.s();
                    return;
                }
                return;
            } catch (Throwable th2) {
                if (z10) {
                    a10.s();
                }
                throw th2;
            }
        }
        throw new IllegalArgumentException("no paragraph".toString());
    }

    @Override // c2.c0
    public final int l(a2.r rVar, q qVar, int i10) {
        return R0(rVar).a(i10, rVar.getLayoutDirection());
    }

    @Override // c2.z1
    public final void n(h2.j jVar) {
        j jVar2 = this.f21888x;
        if (jVar2 == null) {
            jVar2 = new j(this, 0);
            this.f21888x = jVar2;
        }
        j2.e eVar = new j2.e(this.f21878n, null, 6);
        ou.g[] gVarArr = h2.t.f17908a;
        jVar.h(h2.r.f17903w, vt.x.a(eVar));
        i S0 = S0();
        if (S0 != null) {
            boolean z10 = S0.f21874c;
            u uVar = h2.r.f17905y;
            ou.g[] gVarArr2 = h2.t.f17908a;
            ou.g gVar = gVarArr2[12];
            uVar.a(jVar, Boolean.valueOf(z10));
            j2.e eVar2 = new j2.e(S0.f21873b, null, 6);
            u uVar2 = h2.r.f17904x;
            ou.g gVar2 = gVarArr2[11];
            uVar2.a(jVar, eVar2);
        }
        jVar.h(h2.i.f17833i, new h2.a(null, new j(this, 1)));
        jVar.h(h2.i.f17834j, new h2.a(null, new j(this, 2)));
        jVar.h(h2.i.f17835k, new h2.a(null, new x.a(this, 15)));
        h2.t.c(jVar, jVar2);
    }

    @Override // c2.c0
    public final int u0(a2.r rVar, q qVar, int i10) {
        return l1.q(R0(rVar).d(rVar.getLayoutDirection()).b());
    }
}
