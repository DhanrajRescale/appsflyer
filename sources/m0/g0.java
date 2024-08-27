package m0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class g0 extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26190a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function2 f26191b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g0(Function2 function2, int i10) {
        super(2);
        this.f26190a = i10;
        this.f26191b = function2;
    }

    public final void a(t0.n nVar, int i10) {
        int i11 = this.f26190a;
        int i12 = 1;
        Function2 function2 = this.f26191b;
        switch (i11) {
            case 0:
                if ((i10 & 3) == 2) {
                    t0.r rVar = (t0.r) nVar;
                    if (rVar.G()) {
                        rVar.V();
                        return;
                    }
                }
                dp.b.p(d1.f26028a.b(Float.valueOf(vl.b.u(nVar))), function2, nVar, 0);
                return;
            case 1:
                if ((i10 & 3) == 2) {
                    t0.r rVar2 = (t0.r) nVar;
                    if (rVar2.G()) {
                        rVar2.V();
                        return;
                    }
                }
                g1.l lVar = g1.l.f16404b;
                float f10 = n3.f26520a;
                g1.o a10 = androidx.compose.foundation.layout.d.a(lVar, f10, f10);
                g1.g gVar = g1.a.f16383e;
                t0.r rVar3 = (t0.r) nVar;
                rVar3.b0(733328855);
                b0.v c10 = b0.s.c(gVar, false, rVar3, 6);
                rVar3.b0(-1323940314);
                int i13 = rVar3.P;
                t0.r1 o10 = rVar3.o();
                c2.l.M.getClass();
                c2.j jVar = c2.k.f7746b;
                b1.c j10 = androidx.compose.ui.layout.a.j(a10);
                if (rVar3.f35166a instanceof t0.f) {
                    rVar3.e0();
                    if (rVar3.O) {
                        rVar3.n(jVar);
                    } else {
                        rVar3.n0();
                    }
                    t0.t.v0(rVar3, c10, c2.k.f7749e);
                    t0.t.v0(rVar3, o10, c2.k.f7748d);
                    c2.i iVar = c2.k.f7750f;
                    if (rVar3.O || !Intrinsics.a(rVar3.Q(), Integer.valueOf(i13))) {
                        nn.d.s(i13, rVar3, i13, iVar);
                    }
                    v.e.w(rVar3, j10, rVar3, 0, 2058660585);
                    function2.invoke(rVar3, 0);
                    rVar3.s(false);
                    rVar3.s(true);
                    rVar3.s(false);
                    rVar3.s(false);
                    return;
                }
                al.d.v0();
                throw null;
            case 2:
                if ((i10 & 3) == 2) {
                    t0.r rVar4 = (t0.r) nVar;
                    if (rVar4.G()) {
                        rVar4.V();
                        return;
                    }
                }
                b9.a(((c9) ((t0.r) nVar).m(d9.f26076b)).f26020k, b1.d.b(nVar, -1567914264, new g0(function2, i12)), nVar, 48);
                return;
            default:
                if ((i10 & 3) == 2) {
                    t0.r rVar5 = (t0.r) nVar;
                    if (rVar5.G()) {
                        rVar5.V();
                        return;
                    }
                }
                b9.a(j2.g0.a(3, 16744447, 0L, 0L, 0L, 0L, null, ((c9) ((t0.r) nVar).m(d9.f26076b)).f26020k, null, null, null), function2, nVar, 0);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f26190a) {
            case 0:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            case 1:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            case 2:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            default:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
        }
    }
}
