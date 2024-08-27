package m0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class n0 extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26513a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b0.h1 f26514b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ hu.c f26515c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n0(b0.h1 h1Var, hu.c cVar, int i10) {
        super(2);
        this.f26513a = i10;
        this.f26514b = h1Var;
        this.f26515c = cVar;
    }

    public final void a(t0.n nVar, int i10) {
        int i11 = this.f26513a;
        b0.h1 h1Var = this.f26514b;
        int i12 = 0;
        hu.c cVar = this.f26515c;
        switch (i11) {
            case 0:
                if ((i10 & 3) == 2) {
                    t0.r rVar = (t0.r) nVar;
                    if (rVar.G()) {
                        rVar.V();
                        return;
                    }
                }
                g1.o s7 = androidx.compose.foundation.layout.a.s(androidx.compose.foundation.layout.d.a(g1.l.f16404b, m0.f26468b, m0.f26469c), h1Var);
                b0.g gVar = b0.n.f2939e;
                g1.f fVar = g1.a.f16389k;
                t0.r rVar2 = (t0.r) nVar;
                rVar2.b0(693286680);
                b0.l1 a10 = b0.o1.a(gVar, fVar, rVar2, 54);
                rVar2.b0(-1323940314);
                int i13 = rVar2.P;
                t0.r1 o10 = rVar2.o();
                c2.l.M.getClass();
                c2.j jVar = c2.k.f7746b;
                b1.c j10 = androidx.compose.ui.layout.a.j(s7);
                if (rVar2.f35166a instanceof t0.f) {
                    rVar2.e0();
                    if (rVar2.O) {
                        rVar2.n(jVar);
                    } else {
                        rVar2.n0();
                    }
                    t0.t.v0(rVar2, a10, c2.k.f7749e);
                    t0.t.v0(rVar2, o10, c2.k.f7748d);
                    c2.i iVar = c2.k.f7750f;
                    if (rVar2.O || !Intrinsics.a(rVar2.Q(), Integer.valueOf(i13))) {
                        nn.d.s(i13, rVar2, i13, iVar);
                    }
                    nn.d.q(0, j10, new t0.m2(rVar2), rVar2, 2058660585);
                    cVar.b(b0.q1.f2981a, rVar2, 6);
                    rVar2.s(false);
                    v.e.x(rVar2, true, false, false);
                    return;
                }
                al.d.v0();
                throw null;
            default:
                if ((i10 & 3) == 2) {
                    t0.r rVar3 = (t0.r) nVar;
                    if (rVar3.G()) {
                        rVar3.V();
                        return;
                    }
                }
                b9.a(((c9) ((t0.r) nVar).m(d9.f26076b)).f26020k, b1.d.b(nVar, -630330208, new n0(h1Var, cVar, i12)), nVar, 48);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f26513a) {
            case 0:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            default:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
        }
    }
}
