package pd;

import androidx.compose.foundation.layout.FillElement;
import b0.h1;
import d2.d3;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import t0.g1;
import t0.l3;
import t0.m2;
import t0.r1;
import v.r0;
import v.u0;
import w.f1;
import w.x1;

/* loaded from: classes.dex */
public final class w extends iu.k implements hu.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30974a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f30975b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p0.o f30976c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l3 f30977d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d3 f30978e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e1.s f30979f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ h7.b f30980g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ h7.b f30981h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ h7.b f30982i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ g1 f30983j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ g1 f30984k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(h1 h1Var, p0.o oVar, l3 l3Var, d3 d3Var, e1.s sVar, h7.b bVar, h7.b bVar2, h7.b bVar3, g1 g1Var, g1 g1Var2, int i10) {
        super(3);
        this.f30974a = i10;
        this.f30975b = h1Var;
        this.f30976c = oVar;
        this.f30977d = l3Var;
        this.f30978e = d3Var;
        this.f30979f = sVar;
        this.f30980g = bVar;
        this.f30981h = bVar2;
        this.f30982i = bVar3;
        this.f30983j = g1Var;
        this.f30984k = g1Var2;
    }

    public final void a(v.r AnimatedVisibility, t0.n nVar) {
        g1.g gVar = g1.a.f16380b;
        androidx.compose.foundation.layout.b bVar = androidx.compose.foundation.layout.b.f1281a;
        g1.g gVar2 = g1.a.f16379a;
        g1.l lVar = g1.l.f16404b;
        int i10 = this.f30974a;
        l3 l3Var = this.f30977d;
        p0.o oVar = this.f30976c;
        Object obj = this.f30975b;
        switch (i10) {
            case 0:
                Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                g1.o x10 = androidx.compose.foundation.layout.a.x(lVar, s0.g.f34069a, 8, s0.g.f34069a, s0.g.f34069a, 13);
                FillElement fillElement = androidx.compose.foundation.layout.d.f1286c;
                g1.o K0 = al.d.K0(androidx.compose.foundation.layout.a.s(x10.g(fillElement), (h1) obj), oVar);
                p0.o oVar2 = this.f30976c;
                d3 d3Var = this.f30978e;
                e1.s sVar = this.f30979f;
                h7.b bVar2 = this.f30980g;
                h7.b bVar3 = this.f30981h;
                h7.b bVar4 = this.f30982i;
                g1 g1Var = this.f30983j;
                g1 g1Var2 = this.f30984k;
                t0.r rVar = (t0.r) nVar;
                rVar.b0(733328855);
                b0.v c10 = b0.s.c(gVar2, false, rVar, 0);
                rVar.b0(-1323940314);
                int i11 = rVar.P;
                r1 o10 = rVar.o();
                c2.l.M.getClass();
                c2.j jVar = c2.k.f7746b;
                b1.c j10 = androidx.compose.ui.layout.a.j(K0);
                if (rVar.f35166a instanceof t0.f) {
                    rVar.e0();
                    if (rVar.O) {
                        rVar.n(jVar);
                    } else {
                        rVar.n0();
                    }
                    t0.t.v0(rVar, c10, c2.k.f7749e);
                    t0.t.v0(rVar, o10, c2.k.f7748d);
                    c2.i iVar = c2.k.f7750f;
                    if (rVar.O || !Intrinsics.a(rVar.Q(), Integer.valueOf(i11))) {
                        nn.d.s(i11, rVar, i11, iVar);
                    }
                    j10.b(new m2(rVar), rVar, 0);
                    rVar.b0(2058660585);
                    pp.b.j(fillElement, null, 0L, 0L, null, s0.g.f34069a, b1.d.c(1622339614, new v(d3Var, sVar, bVar2, bVar3, bVar4, g1Var, g1Var2, 0), rVar), rVar, 1572870, 62);
                    p0.h.a(((Boolean) l3Var.getValue()).booleanValue(), oVar2, bVar.a(lVar, gVar), 0L, 0L, false, rVar, 64, 56);
                    v.e.y(rVar, false, true, false, false);
                    return;
                }
                al.d.v0();
                throw null;
            default:
                Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                g1.o x11 = androidx.compose.foundation.layout.a.x(lVar, s0.g.f34069a, 12, s0.g.f34069a, s0.g.f34069a, 13);
                FillElement fillElement2 = androidx.compose.foundation.layout.d.f1286c;
                g1.o K02 = al.d.K0(androidx.compose.foundation.layout.a.s(x11.g(fillElement2), (h1) obj), oVar);
                p0.o oVar3 = this.f30976c;
                d3 d3Var2 = this.f30978e;
                e1.s sVar2 = this.f30979f;
                h7.b bVar5 = this.f30980g;
                h7.b bVar6 = this.f30981h;
                h7.b bVar7 = this.f30982i;
                g1 g1Var3 = this.f30983j;
                g1 g1Var4 = this.f30984k;
                t0.r rVar2 = (t0.r) nVar;
                rVar2.b0(733328855);
                b0.v c11 = b0.s.c(gVar2, false, rVar2, 0);
                rVar2.b0(-1323940314);
                int i12 = rVar2.P;
                r1 o11 = rVar2.o();
                c2.l.M.getClass();
                c2.j jVar2 = c2.k.f7746b;
                b1.c j11 = androidx.compose.ui.layout.a.j(K02);
                if (rVar2.f35166a instanceof t0.f) {
                    rVar2.e0();
                    if (rVar2.O) {
                        rVar2.n(jVar2);
                    } else {
                        rVar2.n0();
                    }
                    t0.t.v0(rVar2, c11, c2.k.f7749e);
                    t0.t.v0(rVar2, o11, c2.k.f7748d);
                    c2.i iVar2 = c2.k.f7750f;
                    if (rVar2.O || !Intrinsics.a(rVar2.Q(), Integer.valueOf(i12))) {
                        nn.d.s(i12, rVar2, i12, iVar2);
                    }
                    j11.b(new m2(rVar2), rVar2, 0);
                    rVar2.b0(2058660585);
                    pp.b.j(fillElement2, null, 0L, 0L, null, s0.g.f34069a, b1.d.c(-2125866870, new v(d3Var2, sVar2, bVar5, bVar6, bVar7, g1Var3, g1Var4, 1), rVar2), rVar2, 1572870, 62);
                    p0.h.a(((Boolean) l3Var.getValue()).booleanValue(), oVar3, bVar.a(lVar, gVar), 0L, 0L, false, rVar2, 64, 56);
                    v.e.y(rVar2, false, true, false, false);
                    return;
                }
                al.d.v0();
                throw null;
        }
    }

    @Override // hu.c
    public final Object b(Object obj, Object obj2, Object obj3) {
        int i10;
        switch (this.f30974a) {
            case 0:
                ((Number) obj3).intValue();
                a((v.r) obj, (t0.n) obj2);
                return Unit.f23355a;
            case 1:
                ((Number) obj3).intValue();
                a((v.r) obj, (t0.n) obj2);
                return Unit.f23355a;
            default:
                h1 it = (h1) obj;
                t0.n nVar = (t0.n) obj2;
                int intValue = ((Number) obj3).intValue();
                Intrinsics.checkNotNullParameter(it, "it");
                if ((intValue & 14) == 0) {
                    if (((t0.r) nVar).h(it)) {
                        i10 = 4;
                    } else {
                        i10 = 2;
                    }
                    intValue |= i10;
                }
                if ((intValue & 91) == 18) {
                    t0.r rVar = (t0.r) nVar;
                    if (rVar.G()) {
                        rVar.V();
                        return Unit.f23355a;
                    }
                }
                g1 g1Var = this.f30983j;
                boolean z10 = !((Boolean) g1Var.getValue()).booleanValue();
                x1 x10 = w.e.x(400, 0, null, 6);
                wd.d dVar = wd.d.f39018c;
                f1 f1Var = androidx.compose.animation.b.f1168a;
                iu.j.d(z10, null, new v.h0(new u0(null, new r0(x10, new v.c0(4, dVar)), null, false, null, 61)).b(androidx.compose.animation.b.c(w.e.x(400, 0, null, 6), 2)), androidx.compose.animation.b.f(w.e.v(10000.0f, null, 5), wd.d.f39019d).b(androidx.compose.animation.b.d()), null, b1.d.c(-1557794420, new w(it, this.f30976c, this.f30977d, this.f30978e, this.f30979f, this.f30980g, this.f30981h, this.f30982i, this.f30984k, this.f30983j, 1), nVar), nVar, 200064, 18);
                iu.j.d(((Boolean) g1Var.getValue()).booleanValue(), null, new v.h0(new u0(null, new r0(w.e.x(400, 0, null, 6), new v.c0(4, wd.d.f39022g)), null, false, null, 61)).b(androidx.compose.animation.b.c(w.e.x(400, 0, null, 6), 2)), androidx.compose.animation.b.f(w.e.v(10000.0f, null, 5), wd.d.f39023h).b(androidx.compose.animation.b.d()), null, b1.d.c(-86966859, new m0.i0(7, g1Var, this.f30979f, (Function1) this.f30975b), nVar), nVar, 200064, 18);
                return Unit.f23355a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(g1 g1Var, p0.o oVar, g1 g1Var2, d3 d3Var, e1.s sVar, h7.b bVar, h7.b bVar2, h7.b bVar3, g1 g1Var3, Function1 function1) {
        super(3);
        this.f30974a = 2;
        this.f30983j = g1Var;
        this.f30976c = oVar;
        this.f30977d = g1Var2;
        this.f30978e = d3Var;
        this.f30979f = sVar;
        this.f30980g = bVar;
        this.f30981h = bVar2;
        this.f30982i = bVar3;
        this.f30984k = g1Var3;
        this.f30975b = function1;
    }
}
