package o0;

import b0.l1;
import b0.y;
import com.assetgro.stockgro.feature_market.data.remote.FnoPortfolioHolding;
import com.assetgro.stockgro.feature_market.data.remote.PeriodicPnl;
import com.assetgro.stockgro.feature_market.data.remote.Value;
import com.assetgro.stockgro.prod.R;
import d2.w0;
import g1.l;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import t0.l3;
import t0.n;
import t0.p0;
import t0.r;
import t0.r1;
import t0.t;

/* loaded from: classes.dex */
public final class g extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29350a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l3 f29351b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(l3 l3Var, int i10) {
        super(2);
        this.f29350a = i10;
        this.f29351b = l3Var;
    }

    public final void a(n nVar, int i10) {
        List<PeriodicPnl> list;
        Value value;
        List<PeriodicPnl> periodicPnl;
        Value value2;
        l lVar = l.f16404b;
        int i11 = this.f29350a;
        int i12 = 1;
        l3 l3Var = this.f29351b;
        switch (i11) {
            case 0:
                if ((i10 & 3) == 2) {
                    r rVar = (r) nVar;
                    if (rVar.G()) {
                        rVar.V();
                        return;
                    }
                }
                p0 p0Var = i.f29353a;
                ((Function2) l3Var.getValue()).invoke(nVar, 0);
                return;
            case 1:
                if ((i10 & 3) == 2) {
                    r rVar2 = (r) nVar;
                    if (rVar2.G()) {
                        rVar2.V();
                        return;
                    }
                }
                ((Function2) l3Var.getValue()).invoke(nVar, 0);
                return;
            case 2:
                if ((i10 & 3) == 2) {
                    r rVar3 = (r) nVar;
                    if (rVar3.G()) {
                        rVar3.V();
                        return;
                    }
                }
                hl.f.o(h2.l.a(lVar, false, z2.b.f41907b), b1.d.b(nVar, -533674951, new g(l3Var, i12)), nVar, 48, 0);
                return;
            case 3:
                if ((i10 & 3) == 2) {
                    r rVar4 = (r) nVar;
                    if (rVar4.G()) {
                        rVar4.V();
                        return;
                    }
                }
                p0 p0Var2 = z2.i.f41932a;
                ((Function2) l3Var.getValue()).invoke(nVar, 0);
                return;
            default:
                if ((i10 & 11) == 2) {
                    r rVar5 = (r) nVar;
                    if (rVar5.G()) {
                        rVar5.V();
                        return;
                    }
                }
                r rVar6 = (r) nVar;
                rVar6.b0(-483455358);
                l1 a10 = y.a(b0.n.f2937c, g1.a.f16391m, rVar6, 0);
                rVar6.b0(-1323940314);
                int i13 = rVar6.P;
                r1 o10 = rVar6.o();
                c2.l.M.getClass();
                c2.j jVar = c2.k.f7746b;
                b1.c j10 = androidx.compose.ui.layout.a.j(lVar);
                if (rVar6.f35166a instanceof t0.f) {
                    rVar6.e0();
                    if (rVar6.O) {
                        rVar6.n(jVar);
                    } else {
                        rVar6.n0();
                    }
                    t.v0(rVar6, a10, c2.k.f7749e);
                    t.v0(rVar6, o10, c2.k.f7748d);
                    c2.i iVar = c2.k.f7750f;
                    if (rVar6.O || !Intrinsics.a(rVar6.Q(), Integer.valueOf(i13))) {
                        nn.d.s(i13, rVar6, i13, iVar);
                    }
                    v.e.w(rVar6, j10, rVar6, 0, 2058660585);
                    FnoPortfolioHolding fnoPortfolioHolding = (FnoPortfolioHolding) l3Var.getValue();
                    if (fnoPortfolioHolding != null && (value2 = fnoPortfolioHolding.getValue()) != null) {
                        list = value2.getPeriodicPnl();
                    } else {
                        list = null;
                    }
                    if (list != null) {
                        int i14 = 0;
                        for (Object obj : list) {
                            int i15 = i14 + 1;
                            if (i14 >= 0) {
                                float f10 = 16;
                                androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar, f10), rVar6);
                                dp.b.L((PeriodicPnl) obj, rVar6, 0);
                                androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar, f10), rVar6);
                                rVar6.b0(1126762955);
                                FnoPortfolioHolding fnoPortfolioHolding2 = (FnoPortfolioHolding) l3Var.getValue();
                                if (fnoPortfolioHolding2 == null || (value = fnoPortfolioHolding2.getValue()) == null || (periodicPnl = value.getPeriodicPnl()) == null || i14 != periodicPnl.size() - 1) {
                                    pp.b.c(androidx.compose.foundation.layout.d.e(lVar, 1.0f), w0.e(R.color.lightColorSeparator, rVar6), s0.g.f34069a, s0.g.f34069a, rVar6, 6, 12);
                                }
                                rVar6.s(false);
                                i14 = i15;
                            } else {
                                vt.y.j();
                                throw null;
                            }
                        }
                    }
                    v.e.y(rVar6, false, true, false, false);
                    return;
                }
                al.d.v0();
                throw null;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f29350a) {
            case 0:
                a((n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            case 1:
                a((n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            case 2:
                a((n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            case 3:
                a((n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            default:
                a((n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
        }
    }
}
