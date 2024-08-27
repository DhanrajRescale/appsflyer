package r0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class i0 extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32440a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ hu.c f32441b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i0(hu.c cVar, int i10) {
        super(2);
        this.f32440a = i10;
        this.f32441b = cVar;
    }

    public final void a(t0.n nVar, int i10) {
        b0.a0 a0Var = b0.a0.f2818a;
        g1.e eVar = g1.a.f16391m;
        g1.l lVar = g1.l.f16404b;
        int i11 = this.f32440a;
        hu.c cVar = this.f32441b;
        switch (i11) {
            case 0:
                if ((i10 & 3) == 2) {
                    t0.r rVar = (t0.r) nVar;
                    if (rVar.G()) {
                        rVar.V();
                        return;
                    }
                }
                t0.r rVar2 = (t0.r) nVar;
                rVar2.b0(-483455358);
                b0.l1 a10 = b0.y.a(b0.n.f2937c, eVar, rVar2, 0);
                rVar2.b0(-1323940314);
                int i12 = rVar2.P;
                t0.r1 o10 = rVar2.o();
                c2.l.M.getClass();
                c2.j jVar = c2.k.f7746b;
                b1.c j10 = androidx.compose.ui.layout.a.j(lVar);
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
                    if (rVar2.O || !Intrinsics.a(rVar2.Q(), Integer.valueOf(i12))) {
                        nn.d.s(i12, rVar2, i12, iVar);
                    }
                    v.e.w(rVar2, j10, rVar2, 0, 2058660585);
                    cVar.b(a0Var, rVar2, 6);
                    v.e.y(rVar2, false, true, false, false);
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
                t0.r rVar4 = (t0.r) nVar;
                rVar4.b0(-483455358);
                b0.l1 a11 = b0.y.a(b0.n.f2937c, eVar, rVar4, 0);
                rVar4.b0(-1323940314);
                int i13 = rVar4.P;
                t0.r1 o11 = rVar4.o();
                c2.l.M.getClass();
                c2.j jVar2 = c2.k.f7746b;
                b1.c j11 = androidx.compose.ui.layout.a.j(lVar);
                if (rVar4.f35166a instanceof t0.f) {
                    rVar4.e0();
                    if (rVar4.O) {
                        rVar4.n(jVar2);
                    } else {
                        rVar4.n0();
                    }
                    t0.t.v0(rVar4, a11, c2.k.f7749e);
                    t0.t.v0(rVar4, o11, c2.k.f7748d);
                    c2.i iVar2 = c2.k.f7750f;
                    if (rVar4.O || !Intrinsics.a(rVar4.Q(), Integer.valueOf(i13))) {
                        nn.d.s(i13, rVar4, i13, iVar2);
                    }
                    v.e.w(rVar4, j11, rVar4, 0, 2058660585);
                    cVar.b(a0Var, rVar4, 6);
                    v.e.y(rVar4, false, true, false, false);
                    return;
                }
                al.d.v0();
                throw null;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f32440a) {
            case 0:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            default:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
        }
    }
}
