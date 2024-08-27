package ha;

import b0.l1;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import m0.l5;
import t0.r1;

/* loaded from: classes.dex */
public final class c extends iu.k implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public static final c f18072b = new c(0);

    /* renamed from: c, reason: collision with root package name */
    public static final c f18073c = new c(1);

    /* renamed from: d, reason: collision with root package name */
    public static final c f18074d = new c(2);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18075a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i10) {
        super(2);
        this.f18075a = i10;
    }

    public final void a(t0.n nVar, int i10) {
        g1.e eVar = g1.a.f16392n;
        g1.l lVar = g1.l.f16404b;
        switch (this.f18075a) {
            case 0:
                if ((i10 & 11) == 2) {
                    t0.r rVar = (t0.r) nVar;
                    if (rVar.G()) {
                        rVar.V();
                        return;
                    }
                }
                dp.b.c(nVar, 0);
                return;
            case 1:
                if ((i10 & 11) == 2) {
                    t0.r rVar2 = (t0.r) nVar;
                    if (rVar2.G()) {
                        rVar2.V();
                        return;
                    }
                }
                g1.o g10 = androidx.compose.foundation.layout.d.g(lVar, 300);
                b0.g gVar = b0.n.f2939e;
                t0.r rVar3 = (t0.r) nVar;
                rVar3.b0(-483455358);
                l1 a10 = b0.y.a(gVar, eVar, rVar3, 54);
                rVar3.b0(-1323940314);
                int i11 = rVar3.P;
                r1 o10 = rVar3.o();
                c2.l.M.getClass();
                c2.j jVar = c2.k.f7746b;
                b1.c j10 = androidx.compose.ui.layout.a.j(g10);
                if (rVar3.f35166a instanceof t0.f) {
                    rVar3.e0();
                    if (rVar3.O) {
                        rVar3.n(jVar);
                    } else {
                        rVar3.n0();
                    }
                    t0.t.v0(rVar3, a10, c2.k.f7749e);
                    t0.t.v0(rVar3, o10, c2.k.f7748d);
                    c2.i iVar = c2.k.f7750f;
                    if (rVar3.O || !Intrinsics.a(rVar3.Q(), Integer.valueOf(i11))) {
                        nn.d.s(i11, rVar3, i11, iVar);
                    }
                    v.e.w(rVar3, j10, rVar3, 0, 2058660585);
                    l5.a(null, 0L, s0.g.f34069a, 0L, 0, rVar3, 0, 31);
                    v.e.y(rVar3, false, true, false, false);
                    return;
                }
                al.d.v0();
                throw null;
            default:
                if ((i10 & 11) == 2) {
                    t0.r rVar4 = (t0.r) nVar;
                    if (rVar4.G()) {
                        rVar4.V();
                        return;
                    }
                }
                g1.o g11 = androidx.compose.foundation.layout.d.g(lVar, 300);
                b0.g gVar2 = b0.n.f2939e;
                t0.r rVar5 = (t0.r) nVar;
                rVar5.b0(-483455358);
                l1 a11 = b0.y.a(gVar2, eVar, rVar5, 54);
                rVar5.b0(-1323940314);
                int i12 = rVar5.P;
                r1 o11 = rVar5.o();
                c2.l.M.getClass();
                c2.j jVar2 = c2.k.f7746b;
                b1.c j11 = androidx.compose.ui.layout.a.j(g11);
                if (rVar5.f35166a instanceof t0.f) {
                    rVar5.e0();
                    if (rVar5.O) {
                        rVar5.n(jVar2);
                    } else {
                        rVar5.n0();
                    }
                    t0.t.v0(rVar5, a11, c2.k.f7749e);
                    t0.t.v0(rVar5, o11, c2.k.f7748d);
                    c2.i iVar2 = c2.k.f7750f;
                    if (rVar5.O || !Intrinsics.a(rVar5.Q(), Integer.valueOf(i12))) {
                        nn.d.s(i12, rVar5, i12, iVar2);
                    }
                    v.e.w(rVar5, j11, rVar5, 0, 2058660585);
                    l5.a(null, 0L, s0.g.f34069a, 0L, 0, rVar5, 0, 31);
                    v.e.y(rVar5, false, true, false, false);
                    return;
                }
                al.d.v0();
                throw null;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f18075a) {
            case 0:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            case 1:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            default:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
        }
    }
}
