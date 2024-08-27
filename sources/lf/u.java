package lf;

import com.assetgro.stockgro.data.model.homedata.ListItem;
import com.assetgro.stockgro.data.model.homedata.Widget;
import com.assetgro.stockgro.ui.portfolio.orders.model.FnoOrderResponseData;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import t0.l3;

/* loaded from: classes.dex */
public final class u extends iu.k implements hu.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24789a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f24790b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f24791c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Function2 f24792d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f24793e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(List list, Object obj, Function2 function2, Object obj2, int i10) {
        super(4);
        this.f24789a = i10;
        this.f24790b = list;
        this.f24791c = obj;
        this.f24792d = function2;
        this.f24793e = obj2;
    }

    public final void a(c0.c cVar, int i10, t0.n nVar, int i11) {
        int i12;
        int i13;
        int i14;
        boolean z10;
        int i15;
        int i16;
        boolean z11;
        int i17;
        int i18;
        boolean z12;
        int i19;
        FnoOrderResponseData fnoOrderResponseData;
        to.e eVar = t0.m.f35080a;
        g1.l lVar = g1.l.f16404b;
        int i20 = this.f24789a;
        int i21 = 12;
        Object obj = this.f24793e;
        Object obj2 = this.f24791c;
        List list = this.f24790b;
        int i22 = 32;
        int i23 = 16;
        int i24 = 2;
        switch (i20) {
            case 0:
                if ((i11 & 6) == 0) {
                    if (((t0.r) nVar).h(cVar)) {
                        i24 = 4;
                    }
                    i12 = i11 | i24;
                } else {
                    i12 = i11;
                }
                if ((i11 & 48) == 0) {
                    if (!((t0.r) nVar).f(i10)) {
                        i22 = 16;
                    }
                    i12 |= i22;
                }
                if ((i12 & 147) == 146) {
                    t0.r rVar = (t0.r) nVar;
                    if (rVar.G()) {
                        rVar.V();
                        return;
                    }
                }
                int i25 = (i12 & 112) | (i12 & 14);
                ListItem listItem = (ListItem) list.get(i10);
                t0.r rVar2 = (t0.r) nVar;
                rVar2.b0(1369098165);
                rVar2.Z(1291090309, listItem.getRedirectionUrl());
                float f10 = 16;
                androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.q(lVar, f10), rVar2);
                Widget widget = (Widget) obj;
                dp.b.h((g1.o) obj2, listItem, 2, this.f24792d, widget, i10, rVar2, ((i25 >> 3) & 112) | 384 | ((i25 << 12) & 458752), 0);
                rVar2.s(false);
                rVar2.b0(1291105915);
                if (i10 == widget.getListItems().size() - 1) {
                    androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.q(lVar, f10), rVar2);
                }
                rVar2.s(false);
                rVar2.s(false);
                return;
            case 1:
                if ((i11 & 6) == 0) {
                    if (((t0.r) nVar).h(cVar)) {
                        i24 = 4;
                    }
                    i13 = i11 | i24;
                } else {
                    i13 = i11;
                }
                if ((i11 & 48) == 0) {
                    if (!((t0.r) nVar).f(i10)) {
                        i22 = 16;
                    }
                    i13 |= i22;
                }
                if ((i13 & 147) == 146) {
                    t0.r rVar3 = (t0.r) nVar;
                    if (rVar3.G()) {
                        rVar3.V();
                        return;
                    }
                }
                int i26 = (i13 & 112) | (i13 & 14);
                ListItem listItem2 = (ListItem) list.get(i10);
                t0.r rVar4 = (t0.r) nVar;
                rVar4.b0(-196433161);
                rVar4.Z(1794778627, listItem2.getRedirectionUrl());
                float f11 = 16;
                androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.q(lVar, f11), rVar4);
                Widget widget2 = (Widget) obj;
                dp.b.j((g1.o) obj2, listItem2, this.f24792d, widget2, i10, rVar4, ((i26 >> 3) & 112) | ((i26 << 9) & 57344), 0);
                rVar4.s(false);
                rVar4.b0(1794792900);
                if (i10 == widget2.getListItems().size() - 1) {
                    androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.q(lVar, f11), rVar4);
                }
                rVar4.s(false);
                rVar4.s(false);
                return;
            case 2:
                if ((i11 & 6) == 0) {
                    if (((t0.r) nVar).h(cVar)) {
                        i24 = 4;
                    }
                    i14 = i11 | i24;
                } else {
                    i14 = i11;
                }
                if ((i11 & 48) == 0) {
                    if (((t0.r) nVar).f(i10)) {
                        i15 = 32;
                    } else {
                        i15 = 16;
                    }
                    i14 |= i15;
                }
                if ((i14 & 147) == 146) {
                    t0.r rVar5 = (t0.r) nVar;
                    if (rVar5.G()) {
                        rVar5.V();
                        return;
                    }
                }
                int i27 = (i14 & 112) | (i14 & 14);
                ListItem listItem3 = (ListItem) list.get(i10);
                t0.r rVar6 = (t0.r) nVar;
                rVar6.b0(1104799967);
                rVar6.Z(-518550769, listItem3.getRedirectionUrl());
                float f12 = 16;
                androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.q(lVar, f12), rVar6);
                g1.o oVar = (g1.o) obj2;
                rVar6.b0(-518538417);
                if ((((i27 & 112) ^ 48) > 32 && rVar6.f(i10)) || (i27 & 48) == 32) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                Object Q = rVar6.Q();
                if (z10 || Q == eVar) {
                    Q = new l1.i(i10, 7);
                    rVar6.k0(Q);
                }
                rVar6.s(false);
                Widget widget3 = (Widget) obj;
                dp.b.D(h2.l.a(oVar, false, (Function1) Q), listItem3, 0, this.f24792d, widget3, i10, rVar6, ((i27 >> 3) & 112) | ((i27 << 12) & 458752), 4);
                rVar6.s(false);
                rVar6.b0(-518534593);
                if (i10 == widget3.getListItems().size() - 1) {
                    androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.q(lVar, f12), rVar6);
                }
                rVar6.s(false);
                rVar6.s(false);
                return;
            case 3:
                if ((i11 & 6) == 0) {
                    if (((t0.r) nVar).h(cVar)) {
                        i24 = 4;
                    }
                    i16 = i11 | i24;
                } else {
                    i16 = i11;
                }
                if ((i11 & 48) == 0) {
                    if (((t0.r) nVar).f(i10)) {
                        i17 = 32;
                    } else {
                        i17 = 16;
                    }
                    i16 |= i17;
                }
                if ((i16 & 147) == 146) {
                    t0.r rVar7 = (t0.r) nVar;
                    if (rVar7.G()) {
                        rVar7.V();
                        return;
                    }
                }
                int i28 = (i16 & 112) | (i16 & 14);
                ListItem listItem4 = (ListItem) list.get(i10);
                t0.r rVar8 = (t0.r) nVar;
                rVar8.b0(490524160);
                float f13 = 16;
                androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.q(lVar, f13), rVar8);
                rVar8.Z(-954006223, listItem4.getRedirectionUrl());
                g1.o oVar2 = (g1.o) obj2;
                rVar8.b0(-953995886);
                if ((((i28 & 112) ^ 48) > 32 && rVar8.f(i10)) || (i28 & 48) == 32) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                Object Q2 = rVar8.Q();
                if (z11 || Q2 == eVar) {
                    Q2 = new l1.i(i10, 8);
                    rVar8.k0(Q2);
                }
                rVar8.s(false);
                Widget widget4 = (Widget) obj;
                dp.b.l0(h2.l.a(oVar2, false, (Function1) Q2), listItem4, 0, this.f24792d, widget4, i10, rVar8, ((i28 >> 3) & 112) | ((i28 << 12) & 458752), 4);
                rVar8.s(false);
                rVar8.b0(-953992062);
                if (widget4.getListItems().size() - 1 == i10) {
                    androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.q(lVar, f13), rVar8);
                }
                rVar8.s(false);
                rVar8.s(false);
                return;
            case 4:
                if ((i11 & 6) == 0) {
                    if (((t0.r) nVar).h(cVar)) {
                        i24 = 4;
                    }
                    i18 = i11 | i24;
                } else {
                    i18 = i11;
                }
                if ((i11 & 48) == 0) {
                    if (((t0.r) nVar).f(i10)) {
                        i23 = 32;
                    }
                    i18 |= i23;
                }
                if ((i18 & 147) == 146) {
                    t0.r rVar9 = (t0.r) nVar;
                    if (rVar9.G()) {
                        rVar9.V();
                        return;
                    }
                }
                int i29 = (i18 & 112) | (i18 & 14);
                ListItem listItem5 = (ListItem) list.get(i10);
                t0.r rVar10 = (t0.r) nVar;
                rVar10.b0(377615212);
                rVar10.Z(-819102994, listItem5.getRedirectionUrl());
                g1.o oVar3 = (g1.o) obj2;
                rVar10.b0(-819097074);
                if ((((i29 & 112) ^ 48) > 32 && rVar10.f(i10)) || (i29 & 48) == 32) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                Object Q3 = rVar10.Q();
                if (z12 || Q3 == eVar) {
                    Q3 = new l1.i(i10, i21);
                    rVar10.k0(Q3);
                }
                rVar10.s(false);
                Widget widget5 = (Widget) obj;
                dp.b.p0(h2.l.a(oVar3, false, (Function1) Q3), listItem5, this.f24792d, widget5, i10, rVar10, ((i29 >> 3) & 112) | ((i29 << 9) & 57344), 0);
                rVar10.s(false);
                rVar10.b0(-819089899);
                if (i10 == widget5.getListItems().size() - 1) {
                    androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.q(lVar, 10), rVar10);
                }
                rVar10.s(false);
                rVar10.s(false);
                return;
            default:
                if ((i11 & 6) == 0) {
                    if (((t0.r) nVar).h(cVar)) {
                        i24 = 4;
                    }
                    i19 = i11 | i24;
                } else {
                    i19 = i11;
                }
                if ((i11 & 48) == 0) {
                    if (!((t0.r) nVar).f(i10)) {
                        i22 = 16;
                    }
                    i19 |= i22;
                }
                if ((i19 & 147) == 146) {
                    t0.r rVar11 = (t0.r) nVar;
                    if (rVar11.G()) {
                        rVar11.V();
                        return;
                    }
                }
                int i30 = i19 & 14;
                FnoOrderResponseData fnoOrderResponseData2 = (FnoOrderResponseData) list.get(i10);
                t0.r rVar12 = (t0.r) nVar;
                rVar12.b0(1831835340);
                rVar12.b0(613283655);
                Function1 function1 = (Function1) obj2;
                boolean h10 = rVar12.h(function1);
                Object Q4 = rVar12.Q();
                if (h10 || Q4 == eVar) {
                    Q4 = new v.c0(22, function1);
                    rVar12.k0(Q4);
                }
                Function1 function12 = (Function1) Q4;
                rVar12.s(false);
                rVar12.b0(613286485);
                Function2 function2 = this.f24792d;
                boolean h11 = rVar12.h(function2) | rVar12.h(fnoOrderResponseData2);
                Object Q5 = rVar12.Q();
                if (h11 || Q5 == eVar) {
                    Q5 = new zd.g(i21, function2, fnoOrderResponseData2);
                    rVar12.k0(Q5);
                }
                rVar12.s(false);
                dp.b.M(fnoOrderResponseData2, function12, (Function1) Q5, rVar12, (i30 >> 3) & 14);
                rVar12.b0(613294648);
                List list2 = (List) ((l3) obj).getValue();
                if (list2 != null) {
                    fnoOrderResponseData = (FnoOrderResponseData) vt.g0.C(list2);
                } else {
                    fnoOrderResponseData = null;
                }
                if (!Intrinsics.a(fnoOrderResponseData2, fnoOrderResponseData)) {
                    androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar, 16), rVar12);
                }
                rVar12.s(false);
                rVar12.s(false);
                return;
        }
    }

    @Override // hu.d
    public final /* bridge */ /* synthetic */ Object g(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.f24789a) {
            case 0:
                a((c0.c) obj, ((Number) obj2).intValue(), (t0.n) obj3, ((Number) obj4).intValue());
                return Unit.f23355a;
            case 1:
                a((c0.c) obj, ((Number) obj2).intValue(), (t0.n) obj3, ((Number) obj4).intValue());
                return Unit.f23355a;
            case 2:
                a((c0.c) obj, ((Number) obj2).intValue(), (t0.n) obj3, ((Number) obj4).intValue());
                return Unit.f23355a;
            case 3:
                a((c0.c) obj, ((Number) obj2).intValue(), (t0.n) obj3, ((Number) obj4).intValue());
                return Unit.f23355a;
            case 4:
                a((c0.c) obj, ((Number) obj2).intValue(), (t0.n) obj3, ((Number) obj4).intValue());
                return Unit.f23355a;
            default:
                a((c0.c) obj, ((Number) obj2).intValue(), (t0.n) obj3, ((Number) obj4).intValue());
                return Unit.f23355a;
        }
    }
}
