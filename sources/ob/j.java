package ob;

import b0.k0;
import b0.l1;
import b0.s;
import b0.v;
import com.assetgro.stockgro.data.model.CreateGroupUser;
import com.assetgro.stockgro.data.model.homedata.ListItem;
import com.assetgro.stockgro.data.model.homedata.Widget;
import com.assetgro.stockgro.feature_market.data.remote.FnoPortfolioHolding;
import com.assetgro.stockgro.feature_market.data.remote.OptionValue;
import com.assetgro.stockgro.ui.portfolio.holdings.PortfolioFnoHoldingsViewModel;
import e0.a0;
import e0.j0;
import g1.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import pd.y;
import t0.m;
import t0.n;
import t0.r;
import t0.r1;
import t0.t;
import v.c0;
import vt.i0;

/* loaded from: classes.dex */
public final class j extends iu.k implements hu.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29908a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f29909b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f29910c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f29911d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(int i10, Object obj, Object obj2, List list) {
        super(4);
        this.f29908a = i10;
        this.f29910c = obj;
        this.f29909b = list;
        this.f29911d = obj2;
    }

    public final void a(c0.c items, int i10, n nVar, int i11) {
        int i12;
        int i13;
        int i14;
        boolean z10;
        String str;
        int i15;
        int i16;
        boolean z11;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        boolean z12;
        int i23;
        Object obj = m.f35080a;
        g1.l lVar = g1.l.f16404b;
        int i24 = this.f29908a;
        boolean z13 = true;
        Object obj2 = this.f29911d;
        Object obj3 = this.f29910c;
        List list = this.f29909b;
        int i25 = 2;
        switch (i24) {
            case 0:
                int i26 = 32;
                if ((i11 & 6) == 0) {
                    if (((r) nVar).h(items)) {
                        i13 = 4;
                    } else {
                        i13 = 2;
                    }
                    i12 = i11 | i13;
                } else {
                    i12 = i11;
                }
                if ((i11 & 48) == 0) {
                    if (!((r) nVar).f(i10)) {
                        i26 = 16;
                    }
                    i12 |= i26;
                }
                if ((i12 & 147) == 146) {
                    r rVar = (r) nVar;
                    if (rVar.G()) {
                        rVar.V();
                        return;
                    }
                }
                gb.b bVar = (gb.b) list.get(i10);
                r rVar2 = (r) nVar;
                rVar2.b0(121437852);
                yk.j.w(bVar, (Function1) obj3, (Function1) obj2, androidx.compose.foundation.layout.a.v(lVar, kp.j.R(16, rVar2), s0.g.f34069a, 2), rVar2, ((i12 & 14) >> 3) & 14, 0);
                rVar2.s(false);
                return;
            case 1:
                Intrinsics.checkNotNullParameter(items, "$this$items");
                if ((i11 & 112) == 0) {
                    if (((r) nVar).f(i10)) {
                        i15 = 32;
                    } else {
                        i15 = 16;
                    }
                    i14 = i11 | i15;
                } else {
                    i14 = i11;
                }
                if ((i14 & 721) == 144) {
                    r rVar3 = (r) nVar;
                    if (rVar3.G()) {
                        rVar3.V();
                        return;
                    }
                }
                CreateGroupUser createGroupUser = (CreateGroupUser) ((h7.b) obj3).a(i10);
                Object obj4 = null;
                if (list != null) {
                    Iterator it = list.iterator();
                    Object obj5 = null;
                    boolean z14 = false;
                    while (true) {
                        if (it.hasNext()) {
                            Object next = it.next();
                            String userId = ((CreateGroupUser) next).getUserId();
                            if (createGroupUser != null) {
                                str = createGroupUser.getUserId();
                            } else {
                                str = null;
                            }
                            if (Intrinsics.a(userId, str)) {
                                if (!z14) {
                                    obj5 = next;
                                    z14 = true;
                                }
                            }
                        } else if (z14) {
                            obj4 = obj5;
                        }
                    }
                    obj4 = (CreateGroupUser) obj4;
                }
                if (createGroupUser != null) {
                    if (obj4 != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    r rVar4 = (r) nVar;
                    rVar4.b0(-1058031452);
                    Function2 function2 = (Function2) obj2;
                    boolean h10 = rVar4.h(function2);
                    Object Q = rVar4.Q();
                    if (h10 || Q == obj) {
                        Q = new y(function2, i25);
                        rVar4.k0(Q);
                    }
                    rVar4.s(false);
                    kp.j.l(createGroupUser, z10, false, (Function2) Q, rVar4, 8, 4);
                    return;
                }
                return;
            case 2:
                if ((i11 & 6) == 0) {
                    if (((r) nVar).h(items)) {
                        i25 = 4;
                    }
                    i16 = i11 | i25;
                } else {
                    i16 = i11;
                }
                if ((i11 & 48) == 0) {
                    if (((r) nVar).f(i10)) {
                        i17 = 32;
                    } else {
                        i17 = 16;
                    }
                    i16 |= i17;
                }
                if ((i16 & 147) == 146) {
                    r rVar5 = (r) nVar;
                    if (rVar5.G()) {
                        rVar5.V();
                        return;
                    }
                }
                int i27 = (i16 & 112) | (i16 & 14);
                ListItem listItem = (ListItem) list.get(i10);
                r rVar6 = (r) nVar;
                rVar6.b0(1945332751);
                rVar6.Z(-1322720788, listItem.getRedirectionUrl());
                rVar6.b0(-1322711156);
                if ((((i27 & 112) ^ 48) > 32 && rVar6.f(i10)) || (i27 & 48) == 32) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                Object Q2 = rVar6.Q();
                if (z11 || Q2 == obj) {
                    Q2 = new l1.i(i10, 10);
                    rVar6.k0(Q2);
                }
                rVar6.s(false);
                Function2 function22 = (Function2) obj3;
                Widget widget = (Widget) obj2;
                dp.b.n0(h2.l.a(lVar, false, (Function1) Q2), listItem, function22, widget, i10, rVar6, ((i27 >> 3) & 112) | ((i27 << 9) & 57344), 0);
                rVar6.s(false);
                rVar6.b0(-1322707477);
                if (widget.getListItems().size() - 1 == i10) {
                    androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.q(lVar, 6), rVar6);
                }
                rVar6.s(false);
                rVar6.s(false);
                return;
            case 3:
            default:
                if ((i11 & 6) == 0) {
                    if (((r) nVar).h(items)) {
                        i25 = 4;
                    }
                    i22 = i11 | i25;
                } else {
                    i22 = i11;
                }
                if ((i11 & 48) == 0) {
                    if (((r) nVar).f(i10)) {
                        i23 = 32;
                    } else {
                        i23 = 16;
                    }
                    i22 |= i23;
                }
                if ((i22 & 147) == 146) {
                    r rVar7 = (r) nVar;
                    if (rVar7.G()) {
                        rVar7.V();
                        return;
                    }
                }
                int i28 = (i22 & 112) | (i22 & 14);
                th.b bVar2 = (th.b) list.get(i10);
                r rVar8 = (r) nVar;
                rVar8.b0(-94183330);
                rVar8.b0(1105340136);
                if (i10 == 0) {
                    androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.q(lVar, 10), rVar8);
                }
                rVar8.s(false);
                o m10 = androidx.compose.foundation.layout.d.m(lVar, 120);
                rVar8.b0(1105347121);
                Function1 function1 = (Function1) obj3;
                boolean h11 = rVar8.h(function1);
                if ((((i28 & 896) ^ 384) > 256 && rVar8.h(bVar2)) || (i28 & 384) == 256) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                boolean z15 = z12 | h11;
                Object Q3 = rVar8.Q();
                if (z15 || Q3 == obj) {
                    Q3 = new ad.f(15, function1, bVar2);
                    rVar8.k0(Q3);
                }
                rVar8.s(false);
                zq.f.m(m10, bVar2, (Function0) Q3, rVar8, ((i28 >> 3) & 112) | 6);
                rVar8.b0(1105350684);
                if (((List) obj2).size() - 1 == i10) {
                    androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.q(lVar, 10), rVar8);
                }
                rVar8.s(false);
                rVar8.s(false);
                return;
            case 4:
                if ((i11 & 6) == 0) {
                    if (((r) nVar).h(items)) {
                        i25 = 4;
                    }
                    i18 = i11 | i25;
                } else {
                    i18 = i11;
                }
                if ((i11 & 48) == 0) {
                    if (((r) nVar).f(i10)) {
                        i19 = 32;
                    } else {
                        i19 = 16;
                    }
                    i18 |= i19;
                }
                if ((i18 & 147) == 146) {
                    r rVar9 = (r) nVar;
                    if (rVar9.G()) {
                        rVar9.V();
                        return;
                    }
                }
                int i29 = i18 & 14;
                OptionValue optionValue = (OptionValue) list.get(i10);
                r rVar10 = (r) nVar;
                rVar10.b0(-1469117299);
                rVar10.b0(-1432862062);
                Function2 function23 = (Function2) obj2;
                boolean h12 = rVar10.h(function23);
                Object Q4 = rVar10.Q();
                if (h12 || Q4 == obj) {
                    Q4 = new y(function23, 10);
                    rVar10.k0(Q4);
                }
                Function2 function24 = (Function2) Q4;
                rVar10.s(false);
                rVar10.b0(-1432857559);
                Function1 function12 = (Function1) obj3;
                boolean h13 = rVar10.h(function12);
                Object Q5 = rVar10.Q();
                if (h13 || Q5 == obj) {
                    Q5 = new c0(20, function12);
                    rVar10.k0(Q5);
                }
                rVar10.s(false);
                dp.b.w(optionValue, function24, (Function1) Q5, rVar10, (i29 >> 3) & 14);
                androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar, 16), rVar10);
                rVar10.s(false);
                return;
            case 5:
                if ((i11 & 6) == 0) {
                    if (((r) nVar).h(items)) {
                        i25 = 4;
                    }
                    i20 = i11 | i25;
                } else {
                    i20 = i11;
                }
                if ((i11 & 48) == 0) {
                    if (((r) nVar).f(i10)) {
                        i21 = 32;
                    } else {
                        i21 = 16;
                    }
                    i20 |= i21;
                }
                if ((i20 & 147) == 146) {
                    r rVar11 = (r) nVar;
                    if (rVar11.G()) {
                        rVar11.V();
                        return;
                    }
                }
                int i30 = (i20 & 112) | (i20 & 14);
                pg.c cVar = (pg.c) list.get(i10);
                r rVar12 = (r) nVar;
                rVar12.b0(-350203805);
                pg.c cVar2 = (pg.c) obj2;
                rVar12.b0(1097087187);
                Function1 function13 = (Function1) obj3;
                boolean h14 = rVar12.h(function13);
                if ((((i30 & 896) ^ 384) <= 256 || !rVar12.h(cVar)) && (i30 & 384) != 256) {
                    z13 = false;
                }
                boolean z16 = h14 | z13;
                Object Q6 = rVar12.Q();
                if (z16 || Q6 == obj) {
                    Q6 = new zd.g(10, function13, cVar);
                    rVar12.k0(Q6);
                }
                rVar12.s(false);
                zq.f.e(cVar, cVar2, (Function1) Q6, rVar12, (i30 >> 6) & 14, 0);
                androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar, 8), rVar12);
                rVar12.s(false);
                return;
        }
    }

    public final void d(a0 HorizontalPager, int i10, n nVar, int i11) {
        List<OptionValue> options;
        boolean z10;
        boolean z11;
        g1.l lVar = g1.l.f16404b;
        int i12 = this.f29908a;
        Object obj = this.f29910c;
        Object obj2 = this.f29911d;
        List list = this.f29909b;
        switch (i12) {
            case 3:
                Intrinsics.checkNotNullParameter(HorizontalPager, "$this$HorizontalPager");
                PortfolioFnoHoldingsViewModel portfolioFnoHoldingsViewModel = (PortfolioFnoHoldingsViewModel) obj;
                j0 j0Var = (j0) obj2;
                r rVar = (r) nVar;
                rVar.b0(-483455358);
                l1 a10 = b0.y.a(b0.n.f2937c, g1.a.f16391m, rVar, 0);
                rVar.b0(-1323940314);
                int i13 = rVar.P;
                r1 o10 = rVar.o();
                c2.l.M.getClass();
                c2.j jVar = c2.k.f7746b;
                b1.c j10 = androidx.compose.ui.layout.a.j(lVar);
                if (rVar.f35166a instanceof t0.f) {
                    rVar.e0();
                    if (rVar.O) {
                        rVar.n(jVar);
                    } else {
                        rVar.n0();
                    }
                    t.v0(rVar, a10, c2.k.f7749e);
                    t.v0(rVar, o10, c2.k.f7748d);
                    c2.i iVar = c2.k.f7750f;
                    if (rVar.O || !Intrinsics.a(rVar.Q(), Integer.valueOf(i13))) {
                        nn.d.s(i13, rVar, i13, iVar);
                    }
                    v.e.w(rVar, j10, rVar, 0, 2058660585);
                    FnoPortfolioHolding fnoPortfolioHolding = (FnoPortfolioHolding) portfolioFnoHoldingsViewModel.f9831t.getValue();
                    if (fnoPortfolioHolding == null || (options = fnoPortfolioHolding.getOptionValues()) == null) {
                        options = i0.f38321a;
                    }
                    String sectorToFilter = (String) list.get(j0Var.f14718d.f14650b.i());
                    Intrinsics.checkNotNullParameter(options, "options");
                    Intrinsics.checkNotNullParameter(sectorToFilter, "sectorToFilter");
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : options) {
                        if (Intrinsics.a(((OptionValue) obj3).getSector(), sectorToFilter)) {
                            arrayList.add(obj3);
                        }
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        dp.b.P((OptionValue) it.next(), rVar, 0);
                    }
                    v.e.y(rVar, false, true, false, false);
                    return;
                }
                al.d.v0();
                throw null;
            default:
                Intrinsics.checkNotNullParameter(HorizontalPager, "$this$HorizontalPager");
                if (!list.isEmpty()) {
                    th.b bVar = (th.b) list.get(i10);
                    r rVar2 = (r) nVar;
                    rVar2.Z(1065868914, bVar);
                    o f10 = androidx.compose.foundation.layout.a.f(androidx.compose.foundation.layout.d.u(t.I0(lVar, 1.0f), null, 3), 1.0f);
                    rVar2.b0(1065875823);
                    if ((((i11 & 112) ^ 48) > 32 && rVar2.f(i10)) || (i11 & 48) == 32) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    j0 j0Var2 = (j0) obj2;
                    boolean h10 = z10 | rVar2.h(j0Var2);
                    Object Q = rVar2.Q();
                    Object obj4 = m.f35080a;
                    if (h10 || Q == obj4) {
                        Q = new k0(i10, 2, j0Var2);
                        rVar2.k0(Q);
                    }
                    rVar2.s(false);
                    o q10 = androidx.compose.ui.graphics.a.q(f10, (Function1) Q);
                    Object obj5 = (Function1) obj;
                    rVar2.b0(733328855);
                    v c10 = s.c(g1.a.f16379a, false, rVar2, 0);
                    rVar2.b0(-1323940314);
                    int i14 = rVar2.P;
                    r1 o11 = rVar2.o();
                    c2.l.M.getClass();
                    Function0 function0 = c2.k.f7746b;
                    b1.c j11 = androidx.compose.ui.layout.a.j(q10);
                    if (rVar2.f35166a instanceof t0.f) {
                        rVar2.e0();
                        if (rVar2.O) {
                            rVar2.n(function0);
                        } else {
                            rVar2.n0();
                        }
                        t.v0(rVar2, c10, c2.k.f7749e);
                        t.v0(rVar2, o11, c2.k.f7748d);
                        c2.i iVar2 = c2.k.f7750f;
                        if (rVar2.O || !Intrinsics.a(rVar2.Q(), Integer.valueOf(i14))) {
                            nn.d.s(i14, rVar2, i14, iVar2);
                        }
                        v.e.w(rVar2, j11, rVar2, 0, 2058660585);
                        if (i10 == j0Var2.f14718d.f14650b.i()) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        rVar2.b0(763601921);
                        boolean h11 = rVar2.h(obj5) | rVar2.h(bVar);
                        Object Q2 = rVar2.Q();
                        if (h11 || Q2 == obj4) {
                            Q2 = new zd.g(18, obj5, bVar);
                            rVar2.k0(Q2);
                        }
                        rVar2.s(false);
                        zq.f.o(bVar, z11, (Function1) Q2, rVar2, 0, 0);
                        v.e.y(rVar2, false, true, false, false);
                        rVar2.s(false);
                        return;
                    }
                    al.d.v0();
                    throw null;
                }
                return;
        }
    }

    @Override // hu.d
    public final /* bridge */ /* synthetic */ Object g(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.f29908a) {
            case 0:
                a((c0.c) obj, ((Number) obj2).intValue(), (n) obj3, ((Number) obj4).intValue());
                return Unit.f23355a;
            case 1:
                a((c0.c) obj, ((Number) obj2).intValue(), (n) obj3, ((Number) obj4).intValue());
                return Unit.f23355a;
            case 2:
                a((c0.c) obj, ((Number) obj2).intValue(), (n) obj3, ((Number) obj4).intValue());
                return Unit.f23355a;
            case 3:
                d((a0) obj, ((Number) obj2).intValue(), (n) obj3, ((Number) obj4).intValue());
                return Unit.f23355a;
            case 4:
                a((c0.c) obj, ((Number) obj2).intValue(), (n) obj3, ((Number) obj4).intValue());
                return Unit.f23355a;
            case 5:
                a((c0.c) obj, ((Number) obj2).intValue(), (n) obj3, ((Number) obj4).intValue());
                return Unit.f23355a;
            case 6:
                d((a0) obj, ((Number) obj2).intValue(), (n) obj3, ((Number) obj4).intValue());
                return Unit.f23355a;
            default:
                a((c0.c) obj, ((Number) obj2).intValue(), (n) obj3, ((Number) obj4).intValue());
                return Unit.f23355a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(int i10, Object obj, List list, ut.d dVar) {
        super(4);
        this.f29908a = i10;
        this.f29909b = list;
        this.f29910c = dVar;
        this.f29911d = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(List list, Object obj, Function1 function1, int i10) {
        super(4);
        this.f29908a = i10;
        this.f29909b = list;
        this.f29911d = obj;
        this.f29910c = function1;
    }
}
