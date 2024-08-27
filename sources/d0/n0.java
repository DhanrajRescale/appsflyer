package d0;

import android.content.Context;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b0.o1;
import c2.r1;
import com.assetgro.stockgro.data.AnalyticEvent;
import com.assetgro.stockgro.data.model.homedata.ListItem;
import com.assetgro.stockgro.data.model.homedata.Widget;
import com.assetgro.stockgro.feature_market.data.remote.FnoPortfolio;
import com.assetgro.stockgro.feature_market.data.remote.OptionValue;
import com.assetgro.stockgro.feature_social.presentation.feed.comments.CommentsViewModel;
import com.assetgro.stockgro.missions.presentation.home.MissionsHomeViewModel;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.home.homepage.data.MarketCategory;
import com.assetgro.stockgro.ui.portfolio.orders.PortfolioFnoOrdersViewModel;
import com.assetgro.stockgro.ui.portfolio.orders.model.FnoOrderResponseData;
import d2.g3;
import d2.s1;
import d2.w0;
import i0.l1;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l0.v0;
import m0.n5;
import okhttp3.HttpUrl;
import t0.l3;
import t0.m2;
import t0.m3;

/* loaded from: classes.dex */
public final class n0 extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13190a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f13191b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f13192c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f13193d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f13194e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(int i10, AnalyticEvent analyticEvent, ListItem listItem, Function2 function2) {
        super(2);
        this.f13190a = 15;
        this.f13192c = i10;
        this.f13191b = function2;
        this.f13193d = listItem;
        this.f13194e = analyticEvent;
    }

    public final void a(t0.n nVar, int i10) {
        long j10;
        int i11 = this.f13190a;
        int i12 = this.f13192c;
        Object obj = this.f13191b;
        Object obj2 = this.f13194e;
        Object obj3 = this.f13193d;
        switch (i11) {
            case 0:
                ((o0) obj3).e(obj2, (Function2) obj, nVar, t0.t.H0(1 | i12));
                return;
            case 1:
                l1.g((g1.o) obj3, (v0) obj2, (Function2) obj, nVar, t0.t.H0(1 | i12));
                return;
            case 2:
                dp.b.x((l0.n) obj3, (l0.l) obj2, (Function2) obj, nVar, t0.t.H0(1 | i12));
                return;
            case 3:
                ((b1.c) obj3).d(obj2, obj, nVar, 1 | t0.t.H0(i12));
                return;
            case 4:
                ((d1.k) obj3).e(obj2, (Function2) obj, nVar, t0.t.H0(1 | i12));
                return;
            case 5:
                s1.a((r1) obj3, (g3) obj2, (Function2) obj, nVar, t0.t.H0(1 | i12));
                return;
            case 6:
                yk.o.t((List) obj3, (FnoPortfolio) obj2, (Function1) obj, nVar, t0.t.H0(1 | i12));
                return;
            case 7:
                yk.j.i((hb.s) obj3, (CommentsViewModel) obj2, (Function2) obj, nVar, t0.t.H0(1 | i12));
                return;
            case 8:
                yk.o.h((hb.k) obj3, (l3) obj2, (Function2) obj, nVar, t0.t.H0(1 | i12));
                return;
            case 9:
                yk.j.u((List) obj3, (List) obj2, (Function2) obj, nVar, t0.t.H0(1 | i12));
                return;
            case 10:
                yk.j.c0((List) obj3, (Function1) obj2, (Function0) obj, nVar, t0.t.H0(1 | i12));
                return;
            case 11:
                kp.j.y((String) obj3, (String) obj2, (Function2) obj, nVar, t0.t.H0(1 | i12));
                return;
            case 12:
                kp.j.e((String) obj3, (q1.b) obj2, (Function0) obj, nVar, t0.t.H0(1 | i12));
                return;
            case 13:
                if ((i10 & 11) == 2) {
                    t0.r rVar = (t0.r) nVar;
                    if (rVar.G()) {
                        rVar.V();
                        return;
                    }
                }
                g1.f fVar = g1.a.f16389k;
                MarketCategory marketCategory = (MarketCategory) obj3;
                List list = (List) obj2;
                e0.j0 j0Var = (e0.j0) obj;
                t0.r rVar2 = (t0.r) nVar;
                rVar2.b0(693286680);
                g1.l lVar = g1.l.f16404b;
                b0.l1 a10 = o1.a(b0.n.f2935a, fVar, rVar2, 48);
                rVar2.b0(-1323940314);
                int i13 = rVar2.P;
                t0.r1 o10 = rVar2.o();
                c2.l.M.getClass();
                c2.j jVar = c2.k.f7746b;
                b1.c j11 = androidx.compose.ui.layout.a.j(lVar);
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
                    v.e.w(rVar2, j11, rVar2, 0, 2058660585);
                    float f10 = 4;
                    androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.q(lVar, f10), rVar2);
                    rVar2.b0(-1597587262);
                    if (marketCategory.getIconUrl() != null) {
                        m3 m3Var = AndroidCompositionLocals_androidKt.f1428b;
                        n8.o a11 = new n8.h((Context) rVar2.m(m3Var)).a();
                        y8.h hVar = new y8.h((Context) rVar2.m(m3Var));
                        hVar.f41338c = marketCategory.getIconUrl();
                        hVar.b();
                        hVar.F = Integer.valueOf(R.drawable.error);
                        hVar.G = null;
                        androidx.compose.foundation.a.c(o8.p.a(hVar.a(), a11, null, null, null, 0, null, rVar2, 72, 124), "image", androidx.compose.foundation.layout.d.m(lVar, 12), null, a2.k.f96a, s0.g.f34069a, null, rVar2, 25008, 104);
                        androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.q(lVar, 2), rVar2);
                    }
                    rVar2.s(false);
                    String title = ((MarketCategory) list.get(i12)).getTitle();
                    if (title == null) {
                        title = HttpUrl.FRAGMENT_ENCODE_SET;
                    }
                    String str = title;
                    if (j0Var.f14718d.f14650b.i() == i12) {
                        j10 = n1.t.f28173e;
                    } else {
                        j10 = n1.t.f28170b;
                    }
                    al.d.C(str, androidx.compose.foundation.layout.a.m(lVar), j10, yk.j.e1(13), null, null, jh.c.f21381j, 0L, null, null, 0L, 0, false, 0, 0, null, null, rVar2, 1575984, 0, 130992);
                    androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.q(lVar, f10), rVar2);
                    rVar2.s(false);
                    rVar2.s(true);
                    rVar2.s(false);
                    rVar2.s(false);
                    return;
                }
                al.d.v0();
                throw null;
            case 14:
                dp.b.z((Widget) obj3, (g1.o) obj2, (Function2) obj, nVar, t0.t.H0(i12 | 1));
                return;
            case 15:
                if ((i10 & 11) == 2) {
                    t0.r rVar3 = (t0.r) nVar;
                    if (rVar3.G()) {
                        rVar3.V();
                        return;
                    }
                }
                FillElement fillElement = androidx.compose.foundation.layout.d.f1286c;
                t0.r rVar4 = (t0.r) nVar;
                rVar4.b0(-1250164570);
                Object Q = rVar4.Q();
                to.e eVar = t0.m.f35080a;
                if (Q == eVar) {
                    Q = v.e.e(rVar4);
                }
                rVar4.s(false);
                ListItem listItem = (ListItem) obj3;
                g1.o j12 = androidx.compose.foundation.a.j(fillElement, (a0.l) Q, n5.b(w0.e(R.color.purple_663549E3, rVar4)), false, null, new lf.r(4, (AnalyticEvent) obj2, listItem, (Function2) obj), 28);
                rVar4.b0(-1250152873);
                boolean f11 = rVar4.f(i12);
                Object Q2 = rVar4.Q();
                if (f11 || Q2 == eVar) {
                    Q2 = new l1.i(i12, 9);
                    rVar4.k0(Q2);
                }
                rVar4.s(false);
                g1.o a12 = h2.l.a(j12, false, (Function1) Q2);
                g1.e eVar2 = g1.a.f16391m;
                rVar4.b0(-483455358);
                b0.l1 a13 = b0.y.a(b0.n.f2937c, eVar2, rVar4, 48);
                rVar4.b0(-1323940314);
                int i14 = rVar4.P;
                t0.r1 o11 = rVar4.o();
                c2.l.M.getClass();
                c2.j jVar2 = c2.k.f7746b;
                b1.c j13 = androidx.compose.ui.layout.a.j(a12);
                if (rVar4.f35166a instanceof t0.f) {
                    rVar4.e0();
                    if (rVar4.O) {
                        rVar4.n(jVar2);
                    } else {
                        rVar4.n0();
                    }
                    t0.t.v0(rVar4, a13, c2.k.f7749e);
                    t0.t.v0(rVar4, o11, c2.k.f7748d);
                    c2.i iVar2 = c2.k.f7750f;
                    if (rVar4.O || !Intrinsics.a(rVar4.Q(), Integer.valueOf(i14))) {
                        nn.d.s(i14, rVar4, i14, iVar2);
                    }
                    j13.b(new m2(rVar4), rVar4, 0);
                    rVar4.b0(2058660585);
                    y8.h hVar2 = new y8.h((Context) rVar4.m(AndroidCompositionLocals_androidKt.f1428b));
                    hVar2.f41338c = listItem.getImageUrl();
                    hVar2.b();
                    q6.l.d(hVar2.a(), "User photo", fillElement, a2.k.f101f, rVar4, 1573304, 4024);
                    v.e.y(rVar4, false, true, false, false);
                    return;
                }
                al.d.v0();
                throw null;
            case 16:
                dp.b.w((OptionValue) obj3, (Function2) obj, (Function1) obj2, nVar, t0.t.H0(i12 | 1));
                return;
            case 17:
                dp.b.M((FnoOrderResponseData) obj3, (Function1) obj2, (Function1) obj, nVar, t0.t.H0(i12 | 1));
                return;
            case 18:
                dp.b.N((PortfolioFnoOrdersViewModel) obj3, (Function1) obj2, (Function2) obj, nVar, t0.t.H0(i12 | 1));
                return;
            case 19:
                dp.b.u0((uh.i) obj3, (th.b) obj2, (MissionsHomeViewModel) obj, nVar, t0.t.H0(i12 | 1));
                return;
            case 20:
                zq.f.m((g1.o) obj3, (th.b) obj2, (Function0) obj, nVar, t0.t.H0(i12 | 1));
                return;
            default:
                dp.b.a0((uh.i) obj3, (List) obj2, (Function1) obj, nVar, t0.t.H0(i12 | 1));
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f13190a) {
            case 0:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            case 1:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            case 2:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            case 3:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            case 4:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            case 5:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            case 6:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            case 7:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            case 8:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            case 9:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            case 10:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            case 11:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            case 12:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            case 13:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            case 14:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            case 15:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            case 16:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            case 17:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            case 18:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            case 19:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            case 20:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            default:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(OptionValue optionValue, Function2 function2, Function1 function1, int i10) {
        super(2);
        this.f13190a = 16;
        this.f13193d = optionValue;
        this.f13191b = function2;
        this.f13194e = function1;
        this.f13192c = i10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(MarketCategory marketCategory, List list, int i10, e0.j0 j0Var) {
        super(2);
        this.f13190a = 13;
        this.f13193d = marketCategory;
        this.f13194e = list;
        this.f13192c = i10;
        this.f13191b = j0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n0(Object obj, Object obj2, Object obj3, int i10, int i11) {
        super(2);
        this.f13190a = i11;
        this.f13193d = obj;
        this.f13194e = obj2;
        this.f13191b = obj3;
        this.f13192c = i10;
    }
}
