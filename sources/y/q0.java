package y;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.ui.platform.ComposeView;
import com.assetgro.stockgro.data.AnalyticEvent;
import com.assetgro.stockgro.data.model.arenaV2.ArenaGame;
import com.assetgro.stockgro.data.model.arenaV2.ArenaSortOptions;
import com.assetgro.stockgro.data.model.arenaV2.Option;
import com.assetgro.stockgro.data.model.homedata.Widget;
import com.assetgro.stockgro.feature_market.data.remote.PortfolioReviewResponse;
import com.assetgro.stockgro.feature_market.domain.model.OptionContract;
import com.assetgro.stockgro.feature_market.domain.model.OptionOverview;
import com.assetgro.stockgro.feature_market.presentation.fno.details.OptionOrderPageBottomSheetFragment;
import com.assetgro.stockgro.feature_market.presentation.fno.details.OptionOrderPageBottomSheetViewModel;
import com.assetgro.stockgro.feature_social.presentation.RiaProfileActivity;
import com.assetgro.stockgro.feature_social.presentation.feed.details.FeedPostStreamDetailActivity;
import com.assetgro.stockgro.feature_social.presentation.feed.streams.FeedStreamViewModel;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.arena.detail.pre.LeagueDetailPreJoiningActivity;
import com.assetgro.stockgro.ui.arena.detail.pre.LeagueDetailPreJoiningViewModel;
import g7.w4;
import java.util.List;
import java.util.ListIterator;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import m0.b9;
import m0.n3;
import m0.p3;
import m0.s3;
import t0.o3;

/* loaded from: classes.dex */
public final class q0 extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f40902a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f40903b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f40904c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q0(int i10, Object obj, Object obj2) {
        super(2);
        this.f40902a = i10;
        this.f40903b = obj;
        this.f40904c = obj2;
    }

    private final void e(t0.n nVar, int i10) {
        if ((i10 & 3) == 2) {
            t0.r rVar = (t0.r) nVar;
            if (rVar.G()) {
                rVar.V();
                return;
            }
        }
        ((hu.c) this.f40903b).b((androidx.compose.foundation.layout.c) this.f40904c, nVar, 0);
    }

    private final void f(t0.n nVar, int i10) {
        boolean z10;
        if ((i10 & 3) == 2) {
            t0.r rVar = (t0.r) nVar;
            if (rVar.G()) {
                rVar.V();
                return;
            }
        }
        d0.s sVar = (d0.s) this.f40903b;
        d0.u uVar = (d0.u) sVar.f13214b.mo2invoke();
        d0.r rVar2 = (d0.r) this.f40904c;
        int i11 = rVar2.f13207c;
        if ((i11 >= uVar.c() || !Intrinsics.a(uVar.a(i11), rVar2.f13205a)) && (i11 = uVar.b(rVar2.f13205a)) != -1) {
            rVar2.f13207c = i11;
        }
        int i12 = i11;
        if (i12 != -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        t0.r rVar3 = (t0.r) nVar;
        rVar3.d0(Boolean.valueOf(z10));
        boolean i13 = rVar3.i(z10);
        if (z10) {
            al.d.G(uVar, sVar.f13213a, i12, rVar2.f13205a, rVar3, 0);
        } else {
            rVar3.p(i13);
        }
        rVar3.x();
        Object obj = rVar2.f13205a;
        rVar3.b0(-715770114);
        boolean j10 = rVar3.j(rVar2);
        Object Q = rVar3.Q();
        if (j10 || Q == t0.m.f35080a) {
            Q = new t.g0(rVar2, 11);
            rVar3.k0(Q);
        }
        rVar3.s(false);
        t0.t.c(obj, (Function1) Q, rVar3);
    }

    private final void i(t0.n nVar, int i10) {
        d1.r rVar;
        if ((i10 & 3) == 2) {
            t0.r rVar2 = (t0.r) nVar;
            if (rVar2.G()) {
                rVar2.V();
                return;
            }
        }
        d0.o0 o0Var = (d0.o0) this.f40903b;
        t0.r rVar3 = (t0.r) nVar;
        rVar3.b0(15454635);
        Object[] objArr = new Object[0];
        switch (d1.k.f13274d.f41804a) {
            case 8:
                rVar = e0.e.G;
                break;
            default:
                rVar = d1.k.f13275e;
                break;
        }
        d1.k kVar = (d1.k) el.l.y0(objArr, rVar, d1.l.f13279b, rVar3, 3072, 4);
        kVar.f13278c = (d1.n) rVar3.m(d1.q.f13288a);
        rVar3.s(false);
        o0Var.f13196b.setValue(kVar);
        ((hu.c) this.f40904c).b(o0Var, nVar, 0);
    }

    private final void j(t0.n nVar, int i10) {
        float f10;
        if ((i10 & 3) == 2) {
            t0.r rVar = (t0.r) nVar;
            if (rVar.G()) {
                rVar.V();
                return;
            }
        }
        int i11 = 0;
        g1.o a10 = h2.l.a(g1.l.f16404b, false, o0.e.f29344c);
        t0.r rVar2 = (t0.r) nVar;
        rVar2.b0(-1166280442);
        o0.k kVar = (o0.k) this.f40903b;
        boolean j10 = rVar2.j(kVar);
        Object Q = rVar2.Q();
        int i12 = 1;
        if (j10 || Q == t0.m.f35080a) {
            Q = new o0.d(kVar, i12);
            rVar2.k0(Q);
        }
        rVar2.s(false);
        g1.o l10 = androidx.compose.ui.layout.a.l(a10, (Function1) Q);
        if (((Boolean) kVar.f29363q.getValue()).booleanValue()) {
            f10 = 1.0f;
        } else {
            f10 = s0.g.f34069a;
        }
        g1.o a11 = androidx.compose.ui.draw.a.a(l10, f10);
        b1.c b10 = b1.d.b(rVar2, -348416302, new o0.g((t0.l3) this.f40904c, i11));
        rVar2.b0(-1085885553);
        o0.h hVar = o0.h.f29352a;
        rVar2.b0(-1323940314);
        int i13 = rVar2.P;
        t0.r1 o10 = rVar2.o();
        c2.l.M.getClass();
        c2.j jVar = c2.k.f7746b;
        b1.c j11 = androidx.compose.ui.layout.a.j(a11);
        if (rVar2.f35166a instanceof t0.f) {
            rVar2.e0();
            if (rVar2.O) {
                rVar2.n(jVar);
            } else {
                rVar2.n0();
            }
            t0.t.v0(rVar2, hVar, c2.k.f7749e);
            t0.t.v0(rVar2, o10, c2.k.f7748d);
            c2.i iVar = c2.k.f7750f;
            if (rVar2.O || !Intrinsics.a(rVar2.Q(), Integer.valueOf(i13))) {
                nn.d.s(i13, rVar2, i13, iVar);
            }
            nn.d.q(0, j11, new t0.m2(rVar2), rVar2, 2058660585);
            b10.invoke(rVar2, 6);
            rVar2.s(false);
            rVar2.s(true);
            rVar2.s(false);
            rVar2.s(false);
            return;
        }
        al.d.v0();
        throw null;
    }

    private final void k(t0.n nVar, int i10) {
        if ((i10 & 3) == 2) {
            t0.r rVar = (t0.r) nVar;
            if (rVar.G()) {
                rVar.V();
                return;
            }
        }
        a3.a.u(this.f40903b);
        throw null;
    }

    private final void l(t0.n nVar, int i10) {
        if ((i10 & 3) == 2) {
            t0.r rVar = (t0.r) nVar;
            if (rVar.G()) {
                rVar.V();
                return;
            }
        }
        boolean booleanValue = ((Boolean) ((a2.a0) this.f40903b).f28f.getValue()).booleanValue();
        Function2 function2 = (Function2) this.f40904c;
        t0.r rVar2 = (t0.r) nVar;
        rVar2.d0(Boolean.valueOf(booleanValue));
        boolean i11 = rVar2.i(booleanValue);
        if (booleanValue) {
            function2.invoke(rVar2, 0);
        } else {
            rVar2.p(i11);
        }
        rVar2.x();
    }

    private final void m(t0.n nVar, int i10) {
        if ((i10 & 3) == 2) {
            t0.r rVar = (t0.r) nVar;
            if (rVar.G()) {
                rVar.V();
                return;
            }
        }
        b1.c cVar = v2.b.f37675a;
        t0.r rVar2 = (t0.r) nVar;
        rVar2.b0(493252433);
        Object[] objArr = (Object[]) this.f40903b;
        boolean j10 = rVar2.j(objArr);
        t0.e1 e1Var = (t0.e1) this.f40904c;
        Object Q = rVar2.Q();
        if (j10 || Q == t0.m.f35080a) {
            Q = new x.y0(18, e1Var, objArr);
            rVar2.k0(Q);
        }
        rVar2.s(false);
        n3.a(cVar, (Function0) Q, null, null, null, null, 0L, 0L, null, rVar2, 6, 508);
    }

    private final void n(t0.n nVar, int i10) {
        float f10;
        int i11 = 3;
        if ((i10 & 3) == 2) {
            t0.r rVar = (t0.r) nVar;
            if (rVar.G()) {
                rVar.V();
                return;
            }
        }
        g1.o a10 = h2.l.a(g1.l.f16404b, false, z2.b.f41910e);
        t0.r rVar2 = (t0.r) nVar;
        rVar2.b0(1511665357);
        z2.r rVar3 = (z2.r) this.f40903b;
        boolean j10 = rVar2.j(rVar3);
        Object Q = rVar2.Q();
        int i12 = 1;
        if (j10 || Q == t0.m.f35080a) {
            Q = new z2.h(rVar3, i12);
            rVar2.k0(Q);
        }
        rVar2.s(false);
        g1.o l10 = androidx.compose.ui.layout.a.l(a10, (Function1) Q);
        if (rVar3.getCanCalculatePosition()) {
            f10 = 1.0f;
        } else {
            f10 = s0.g.f34069a;
        }
        g1.o a11 = androidx.compose.ui.draw.a.a(l10, f10);
        b1.c b10 = b1.d.b(rVar2, 606497925, new o0.g((t0.l3) this.f40904c, i11));
        rVar2.b0(1406149896);
        z2.d dVar = z2.d.f41919c;
        rVar2.b0(-1323940314);
        int i13 = rVar2.P;
        t0.r1 o10 = rVar2.o();
        c2.l.M.getClass();
        c2.j jVar = c2.k.f7746b;
        b1.c j11 = androidx.compose.ui.layout.a.j(a11);
        if (rVar2.f35166a instanceof t0.f) {
            rVar2.e0();
            if (rVar2.O) {
                rVar2.n(jVar);
            } else {
                rVar2.n0();
            }
            t0.t.v0(rVar2, dVar, c2.k.f7749e);
            t0.t.v0(rVar2, o10, c2.k.f7748d);
            c2.i iVar = c2.k.f7750f;
            if (rVar2.O || !Intrinsics.a(rVar2.Q(), Integer.valueOf(i13))) {
                nn.d.s(i13, rVar2, i13, iVar);
            }
            nn.d.q(0, j11, new t0.m2(rVar2), rVar2, 2058660585);
            b10.invoke(rVar2, 6);
            rVar2.s(false);
            rVar2.s(true);
            rVar2.s(false);
            rVar2.s(false);
            return;
        }
        al.d.v0();
        throw null;
    }

    private final void o(t0.n nVar, int i10) {
        if ((i10 & 11) == 2) {
            t0.r rVar = (t0.r) nVar;
            if (rVar.G()) {
                rVar.V();
                return;
            }
        }
        Object obj = this.f40903b;
        OptionContract optionContract = (OptionContract) ((ut.p) obj).f37400a;
        OptionOverview optionOverview = (OptionOverview) ((ut.p) obj).f37401b;
        PortfolioReviewResponse portfolioReviewResponse = (PortfolioReviewResponse) ((ut.p) obj).f37402c;
        Object obj2 = this.f40904c;
        yk.o.s(optionContract, optionOverview, portfolioReviewResponse, ((OptionOrderPageBottomSheetViewModel) ((OptionOrderPageBottomSheetFragment) obj2).t()).f8613l, ((OptionOrderPageBottomSheetViewModel) ((OptionOrderPageBottomSheetFragment) obj2).t()).f8611j, new ha.t((OptionOrderPageBottomSheetFragment) obj2, 0), new v.g((OptionOrderPageBottomSheetFragment) obj2, 8), nVar, 576, 0);
    }

    private final void p(t0.n nVar, int i10) {
        if ((i10 & 11) == 2) {
            t0.r rVar = (t0.r) nVar;
            if (rVar.G()) {
                rVar.V();
                return;
            }
        }
        g1.f fVar = g1.a.f16390l;
        Function1 function1 = (Function1) this.f40903b;
        gb.d dVar = (gb.d) this.f40904c;
        t0.r rVar2 = (t0.r) nVar;
        rVar2.b0(693286680);
        g1.l lVar = g1.l.f16404b;
        b0.d dVar2 = b0.n.f2935a;
        b0.l1 a10 = b0.o1.a(dVar2, fVar, rVar2, 48);
        rVar2.b0(-1323940314);
        int i11 = rVar2.P;
        t0.r1 o10 = rVar2.o();
        c2.l.M.getClass();
        c2.j jVar = c2.k.f7746b;
        b1.c j10 = androidx.compose.ui.layout.a.j(lVar);
        boolean z10 = rVar2.f35166a instanceof t0.f;
        if (z10) {
            rVar2.e0();
            if (rVar2.O) {
                rVar2.n(jVar);
            } else {
                rVar2.n0();
            }
            c2.i iVar = c2.k.f7749e;
            t0.t.v0(rVar2, a10, iVar);
            c2.i iVar2 = c2.k.f7748d;
            t0.t.v0(rVar2, o10, iVar2);
            c2.i iVar3 = c2.k.f7750f;
            if (rVar2.O || !Intrinsics.a(rVar2.Q(), Integer.valueOf(i11))) {
                nn.d.s(i11, rVar2, i11, iVar3);
            }
            nn.d.q(0, j10, new t0.m2(rVar2), rVar2, 2058660585);
            b0.q1 q1Var = b0.q1.f2981a;
            g1.o w10 = androidx.compose.foundation.layout.a.w(androidx.compose.foundation.layout.d.g(q1Var.b(lVar, 1.0f, true), kp.j.R(56, rVar2)), kp.j.R(8, rVar2), kp.j.R(4, rVar2), kp.j.R(0, rVar2), kp.j.R(4, rVar2));
            g1.f fVar2 = g1.a.f16389k;
            rVar2.b0(693286680);
            b0.l1 a11 = b0.o1.a(dVar2, fVar2, rVar2, 48);
            rVar2.b0(-1323940314);
            int i12 = rVar2.P;
            t0.r1 o11 = rVar2.o();
            b1.c j11 = androidx.compose.ui.layout.a.j(w10);
            if (z10) {
                rVar2.e0();
                if (rVar2.O) {
                    rVar2.n(jVar);
                } else {
                    rVar2.n0();
                }
                t0.t.v0(rVar2, a11, iVar);
                t0.t.v0(rVar2, o11, iVar2);
                if (rVar2.O || !Intrinsics.a(rVar2.Q(), Integer.valueOf(i12))) {
                    nn.d.s(i12, rVar2, i12, iVar3);
                }
                nn.d.q(0, j11, new t0.m2(rVar2), rVar2, 2058660585);
                androidx.compose.foundation.a.c(yk.g.T(dVar.b(), d2.w0.u(R.drawable.ic_feed_sub_cat_placeholder, rVar2, 6), d2.w0.u(R.drawable.ic_feed_sub_cat_placeholder, rVar2, 6), rVar2, 576), null, h2.l.a(androidx.compose.foundation.layout.d.m(lVar, kp.j.R(32, rVar2)), false, pb.a.f30821h), null, null, s0.g.f34069a, null, rVar2, 48, 120);
                androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.q(lVar, kp.j.R(8, rVar2)), rVar2);
                String c10 = dVar.c();
                o2.v vVar = jh.c.f21373b;
                b9.b(c10, h2.l.a(q1Var.b(lVar, 1.0f, true), false, pb.a.f30822i), n1.t.f28170b, kp.j.S(12, rVar2, 6), null, null, vVar, 0L, null, null, 0L, 2, false, 3, 0, null, null, rVar2, 1573248, 3120, 120752);
                v.e.y(rVar2, false, true, false, false);
                rVar2.b0(-1462530158);
                boolean h10 = rVar2.h(function1) | rVar2.h(dVar);
                Object Q = rVar2.Q();
                if (h10 || Q == t0.m.f35080a) {
                    Q = new pb.c(function1, dVar, 1);
                    rVar2.k0(Q);
                }
                rVar2.s(false);
                p3.a((Function0) Q, h2.l.a(androidx.compose.foundation.layout.a.x(androidx.compose.foundation.layout.d.m(q1Var.a(lVar, fVar), kp.j.R(32, rVar2)), s0.g.f34069a, s0.g.f34069a, s0.g.f34069a, kp.j.R(2, rVar2), 7), false, pb.a.f30823j), false, null, b1.d.c(-1360312768, new q0(15, dVar, q1Var), rVar2), rVar2, 24576, 12);
                v.e.y(rVar2, false, true, false, false);
                return;
            }
            al.d.v0();
            throw null;
        }
        al.d.v0();
        throw null;
    }

    private final void q(t0.n nVar, int i10) {
        int i11;
        if ((i10 & 11) == 2) {
            t0.r rVar = (t0.r) nVar;
            if (rVar.G()) {
                rVar.V();
                return;
            }
        }
        if (((gb.d) this.f40903b).f()) {
            i11 = R.drawable.ic_start_selected;
        } else {
            i11 = R.drawable.ic_start_unselected;
        }
        s3.b(d2.w0.A(i11, nVar, 8), null, ((b0.p1) this.f40904c).a(androidx.compose.foundation.layout.d.m(g1.l.f16404b, kp.j.R(20, nVar)), g1.a.f16390l), n1.t.f28177i, nVar, 3120, 0);
    }

    private final void r(t0.n nVar, int i10) {
        ArenaSortOptions arenaSortOptions;
        Option option;
        Parcelable parcelable;
        if ((i10 & 11) == 2) {
            t0.r rVar = (t0.r) nVar;
            if (rVar.G()) {
                rVar.V();
                return;
            }
        }
        sc.k kVar = (sc.k) this.f40903b;
        Bundle arguments = kVar.getArguments();
        if (arguments != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = (Parcelable) k2.m.g(arguments);
            } else {
                Parcelable parcelable2 = arguments.getParcelable("LIST_OF_OPTIONS");
                if (!(parcelable2 instanceof ArenaSortOptions)) {
                    parcelable2 = null;
                }
                parcelable = (ArenaSortOptions) parcelable2;
            }
            arenaSortOptions = (ArenaSortOptions) parcelable;
        } else {
            arenaSortOptions = null;
        }
        Intrinsics.d(arenaSortOptions, "null cannot be cast to non-null type com.assetgro.stockgro.data.model.arenaV2.ArenaSortOptions");
        t0.r rVar2 = (t0.r) nVar;
        rVar2.b0(441797846);
        Object Q = rVar2.Q();
        if (Q == t0.m.f35080a) {
            Q = t0.t.n0(null, o3.f35116a);
            rVar2.k0(Q);
        }
        t0.g1 g1Var = (t0.g1) Q;
        rVar2.s(false);
        List<Option> options = arenaSortOptions.getOptions();
        Object obj = this.f40904c;
        if (options != null && (option = options.get(0)) != null) {
            String str = (String) obj;
            g1Var.setValue(option);
            if (Intrinsics.a(str, "ALL")) {
                g1Var.setValue(sc.k.f34571l);
            } else if (Intrinsics.a(str, "EQUITY")) {
                g1Var.setValue(sc.k.f34572m);
            }
        }
        kp.j.t((Option) g1Var.getValue(), arenaSortOptions, new d2.y0(24, kVar, (String) obj), new sc.j(kVar, 1), rVar2, 72, 0);
    }

    private final void s(t0.n nVar, int i10) {
        if ((i10 & 11) == 2) {
            t0.r rVar = (t0.r) nVar;
            if (rVar.G()) {
                rVar.V();
                return;
            }
        }
        ArenaGame arenaGame = (ArenaGame) this.f40903b;
        Intrinsics.checkNotNullExpressionValue(arenaGame, "$arenaGame");
        yk.j.O(arenaGame, ((LeagueDetailPreJoiningViewModel) ((LeagueDetailPreJoiningActivity) this.f40904c).x()).f9051r, nVar, 8, 0);
    }

    private final void t(t0.n nVar, int i10) {
        t0.r rVar;
        if ((i10 & 11) == 2) {
            t0.r rVar2 = (t0.r) nVar;
            if (rVar2.G()) {
                rVar2.V();
                return;
            }
        }
        g1.l lVar = g1.l.f16404b;
        g1.o k10 = androidx.compose.foundation.a.k(androidx.compose.foundation.layout.d.f1286c, new pd.a0((c.n) this.f40903b, 0), 7);
        g1.g gVar = g1.a.f16383e;
        t0.g1 g1Var = (t0.g1) this.f40904c;
        t0.r rVar3 = (t0.r) nVar;
        rVar3.b0(733328855);
        b0.v c10 = b0.s.c(gVar, false, rVar3, 6);
        rVar3.b0(-1323940314);
        int i11 = rVar3.P;
        t0.r1 o10 = rVar3.o();
        c2.l.M.getClass();
        c2.j jVar = c2.k.f7746b;
        b1.c j10 = androidx.compose.ui.layout.a.j(k10);
        boolean z10 = rVar3.f35166a instanceof t0.f;
        if (z10) {
            rVar3.e0();
            if (rVar3.O) {
                rVar3.n(jVar);
            } else {
                rVar3.n0();
            }
            c2.i iVar = c2.k.f7749e;
            t0.t.v0(rVar3, c10, iVar);
            c2.i iVar2 = c2.k.f7748d;
            t0.t.v0(rVar3, o10, iVar2);
            c2.i iVar3 = c2.k.f7750f;
            if (rVar3.O || !Intrinsics.a(rVar3.Q(), Integer.valueOf(i11))) {
                nn.d.s(i11, rVar3, i11, iVar3);
            }
            nn.d.q(0, j10, new t0.m2(rVar3), rVar3, 2058660585);
            g1.f fVar = g1.a.f16389k;
            rVar3.b0(693286680);
            b0.l1 a10 = b0.o1.a(b0.n.f2935a, fVar, rVar3, 48);
            rVar3.b0(-1323940314);
            int i12 = rVar3.P;
            t0.r1 o11 = rVar3.o();
            b1.c j11 = androidx.compose.ui.layout.a.j(lVar);
            if (z10) {
                rVar3.e0();
                if (rVar3.O) {
                    rVar3.n(jVar);
                } else {
                    rVar3.n0();
                }
                t0.t.v0(rVar3, a10, iVar);
                t0.t.v0(rVar3, o11, iVar2);
                if (rVar3.O || !Intrinsics.a(rVar3.Q(), Integer.valueOf(i12))) {
                    nn.d.s(i12, rVar3, i12, iVar3);
                }
                nn.d.q(0, j11, new t0.m2(rVar3), rVar3, 2058660585);
                if (((Uri) g1Var.getValue()) == null) {
                    rVar3.b0(1682857756);
                    rVar = rVar3;
                    androidx.compose.foundation.a.c(d2.w0.u(R.drawable.ic_portfolio, rVar3, 6), "Create Group Cover Image Icon", null, null, null, s0.g.f34069a, null, rVar3, 56, 124);
                    androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.q(lVar, 8), rVar);
                    al.d.C(hl.f.c1(R.string.select_cover_pic_for_group, rVar), null, d2.w0.e(R.color.black_1A1A1A, rVar), yk.j.e1(12), null, null, jh.c.f21372a, 0L, null, null, 0L, 0, false, 0, 0, null, null, rVar, 1575936, 0, 130994);
                    rVar.s(false);
                } else {
                    rVar = rVar3;
                    rVar.b0(1683443594);
                    q6.l.d((Uri) g1Var.getValue(), null, androidx.compose.foundation.layout.d.e(lVar, 1.0f), a2.k.f96a, rVar, 1573304, 4024);
                    rVar.s(false);
                }
                v.e.y(rVar, false, true, false, false);
                v.e.y(rVar, false, true, false, false);
                return;
            }
            al.d.v0();
            throw null;
        }
        al.d.v0();
        throw null;
    }

    public final void a(int i10, String postId) {
        Object obj;
        int i11 = this.f40902a;
        Object obj2 = this.f40904c;
        Object obj3 = this.f40903b;
        switch (i11) {
            case 17:
                Intrinsics.checkNotNullParameter(postId, "postId");
                ((t0.g1) obj3).setValue(null);
                FeedStreamViewModel feedStreamViewModel = (FeedStreamViewModel) obj2;
                feedStreamViewModel.getClass();
                Intrinsics.checkNotNullParameter(postId, "postId");
                ListIterator listIterator = feedStreamViewModel.f8838s.listIterator();
                while (true) {
                    e1.x xVar = (e1.x) listIterator;
                    if (xVar.hasNext()) {
                        obj = xVar.next();
                        if (Intrinsics.a(((hb.u) obj).f18230a.f18224a, postId)) {
                        }
                    } else {
                        obj = null;
                    }
                }
                hb.u uVar = (hb.u) obj;
                if (uVar != null) {
                    hb.s sVar = uVar.f18230a;
                    hb.q qVar = sVar.f18229f;
                    feedStreamViewModel.k(new sb.b0(hb.u.a(hb.s.a(sVar, null, hb.q.a(qVar, null, new hb.o(i10, qVar.f18211b.f18206a), null, 13), 31))));
                    return;
                }
                return;
            default:
                Intrinsics.checkNotNullParameter(postId, "onDeepLinkAction");
                ((Function2) obj2).invoke(postId, new AnalyticEvent("app_home_card_tapped", dp.b.Z0((Widget) obj3, i10)));
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:124:0x051a, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.a(r1.Q(), java.lang.Integer.valueOf(r8)) == false) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0097, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.a(r1.Q(), java.lang.Integer.valueOf(r9)) == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x0976, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.a(r1.Q(), java.lang.Integer.valueOf(r7)) == false) goto L249;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(t0.n r58, int r59) {
        /*
            Method dump skipped, instructions count: 3036
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y.q0.d(t0.n, int):void");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f40902a;
        Object obj3 = this.f40904c;
        Object obj4 = this.f40903b;
        switch (i10) {
            case 0:
                x1.t tVar = (x1.t) obj;
                long j10 = ((m1.c) obj2).f27237a;
                vl.b.c((y1.d) obj4, tVar);
                tVar.a();
                ((iu.y) obj3).f20559a = j10;
                return Unit.f23355a;
            case 1:
                d((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            case 2:
                return u((a2.k1) obj, ((w2.a) obj2).f38776a);
            case 3:
                d((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            case 4:
                return u((a2.k1) obj, ((w2.a) obj2).f38776a);
            case 5:
                d((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            case 6:
                d((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            case 7:
                d((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            case 8:
                d((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            case 9:
                d((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            case 10:
                d((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            case 11:
                d((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            case 12:
                g7.t0 prependHint = (g7.t0) obj;
                g7.t0 appendHint = (g7.t0) obj2;
                Intrinsics.checkNotNullParameter(prependHint, "prependHint");
                Intrinsics.checkNotNullParameter(appendHint, "appendHint");
                if (((g7.b1) obj4) == g7.b1.f16664b) {
                    w4 w4Var = (w4) obj3;
                    prependHint.f17060a = w4Var;
                    if (w4Var != null) {
                        prependHint.f17061b.f(w4Var);
                    }
                } else {
                    w4 w4Var2 = (w4) obj3;
                    appendHint.f17060a = w4Var2;
                    if (w4Var2 != null) {
                        appendHint.f17061b.f(w4Var2);
                    }
                }
                return Unit.f23355a;
            case 13:
                d((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            case 14:
                String postId = (String) obj;
                String groupId = (String) obj2;
                Intrinsics.checkNotNullParameter(postId, "postId");
                Intrinsics.checkNotNullParameter(groupId, "groupId");
                Intent intent = new Intent(((ComposeView) obj3).getContext(), (Class<?>) FeedPostStreamDetailActivity.class);
                intent.putExtras(hl.f.y(new Pair("POST_ID", postId), new Pair("GROUP_CHAT_ID", groupId), new Pair("FEED_STREAM_TYPE", "FEED_STREAM_POST_DETAILS")));
                ((RiaProfileActivity) obj4).startActivity(intent);
                return Unit.f23355a;
            case 15:
                d((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            case 16:
                d((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            case 17:
                a(((Number) obj2).intValue(), (String) obj);
                return Unit.f23355a;
            case 18:
                d((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            case 19:
                d((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            case 20:
                d((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            case 21:
                d((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            case 22:
                d((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            case 23:
                d((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            case 24:
                d((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            case 25:
                a(((Number) obj2).intValue(), (String) obj);
                return Unit.f23355a;
            case 26:
                d((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            case 27:
                d((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            case 28:
                d((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            default:
                d((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
        }
    }

    public final a2.n0 u(a2.k1 k1Var, long j10) {
        int i10 = this.f40902a;
        Object obj = this.f40904c;
        Object obj2 = this.f40903b;
        switch (i10) {
            case 2:
                androidx.compose.foundation.layout.c cVar = new androidx.compose.foundation.layout.c(k1Var, j10);
                Unit unit = Unit.f23355a;
                q0 q0Var = new q0(1, (hu.c) obj, cVar);
                Object obj3 = b1.d.f3079a;
                return ((a2.m0) obj2).a(k1Var, k1Var.k(unit, new b1.c(q0Var, true, -1945019079)), j10);
            default:
                return (a2.n0) ((Function2) obj).invoke(new d0.a0((d0.s) obj2, k1Var), new w2.a(j10));
        }
    }
}
