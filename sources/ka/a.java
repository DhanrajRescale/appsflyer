package ka;

import b0.l1;
import com.assetgro.stockgro.prod.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import m0.b9;
import m0.c9;
import m0.d9;
import m0.l5;
import t0.r1;

/* loaded from: classes.dex */
public final class a extends iu.k implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public static final a f22711b = new a(0);

    /* renamed from: c, reason: collision with root package name */
    public static final a f22712c = new a(1);

    /* renamed from: d, reason: collision with root package name */
    public static final a f22713d = new a(2);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22714a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i10) {
        super(2);
        this.f22714a = i10;
    }

    public final void a(t0.n nVar, int i10) {
        g1.e eVar = g1.a.f16392n;
        g1.l lVar = g1.l.f16404b;
        switch (this.f22714a) {
            case 0:
                if ((i10 & 11) == 2) {
                    t0.r rVar = (t0.r) nVar;
                    if (rVar.G()) {
                        rVar.V();
                        return;
                    }
                }
                g1.o g10 = androidx.compose.foundation.layout.d.g(lVar, 300);
                b0.g gVar = b0.n.f2939e;
                t0.r rVar2 = (t0.r) nVar;
                rVar2.b0(-483455358);
                l1 a10 = b0.y.a(gVar, eVar, rVar2, 54);
                rVar2.b0(-1323940314);
                int i11 = rVar2.P;
                r1 o10 = rVar2.o();
                c2.l.M.getClass();
                c2.j jVar = c2.k.f7746b;
                b1.c j10 = androidx.compose.ui.layout.a.j(g10);
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
                    if (rVar2.O || !Intrinsics.a(rVar2.Q(), Integer.valueOf(i11))) {
                        nn.d.s(i11, rVar2, i11, iVar);
                    }
                    v.e.w(rVar2, j10, rVar2, 0, 2058660585);
                    l5.a(null, 0L, s0.g.f34069a, 0L, 0, rVar2, 0, 31);
                    v.e.y(rVar2, false, true, false, false);
                    return;
                }
                al.d.v0();
                throw null;
            case 1:
                if ((i10 & 11) == 2) {
                    t0.r rVar3 = (t0.r) nVar;
                    if (rVar3.G()) {
                        rVar3.V();
                        return;
                    }
                }
                g1.o g11 = androidx.compose.foundation.layout.d.g(lVar, 300);
                b0.g gVar2 = b0.n.f2939e;
                t0.r rVar4 = (t0.r) nVar;
                rVar4.b0(-483455358);
                l1 a11 = b0.y.a(gVar2, eVar, rVar4, 54);
                rVar4.b0(-1323940314);
                int i12 = rVar4.P;
                r1 o11 = rVar4.o();
                c2.l.M.getClass();
                c2.j jVar2 = c2.k.f7746b;
                b1.c j11 = androidx.compose.ui.layout.a.j(g11);
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
                    if (rVar4.O || !Intrinsics.a(rVar4.Q(), Integer.valueOf(i12))) {
                        nn.d.s(i12, rVar4, i12, iVar2);
                    }
                    v.e.w(rVar4, j11, rVar4, 0, 2058660585);
                    l5.a(null, 0L, s0.g.f34069a, 0L, 0, rVar4, 0, 31);
                    v.e.y(rVar4, false, true, false, false);
                    return;
                }
                al.d.v0();
                throw null;
            default:
                if ((i10 & 11) == 2) {
                    t0.r rVar5 = (t0.r) nVar;
                    if (rVar5.G()) {
                        rVar5.V();
                        return;
                    }
                }
                b9.b(hl.f.c1(R.string.please_select_your_portfolio, nVar), null, 0L, 0L, null, null, jh.c.f21372a, 0L, null, null, 0L, 0, false, 0, 0, null, ((c9) ((t0.r) nVar).m(d9.f26076b)).f26021l, nVar, 1572864, 0, 65470);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f22714a) {
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
