package rb;

import com.assetgro.stockgro.data.model.CreateGroupUser;
import com.assetgro.stockgro.ui.home.homepage.data.HomeBannerDto;
import com.assetgro.stockgro.ui.home.homepage.data.HomeExpertViewDto;
import com.assetgro.stockgro.ui.home.homepage.data.HomeMarketDto;
import com.assetgro.stockgro.ui.home.homepage.data.HomePortfolioDto;
import com.assetgro.stockgro.ui.home.homepage.data.HomeSocialTradeViewDto;
import com.assetgro.stockgro.ui.home.homepage.data.HomeTitleDto;
import com.assetgro.stockgro.ui.home.homepage.data.HomeUserInfoDto;
import com.assetgro.stockgro.ui.home.homepage.data.HomepageHeadingDto;
import com.assetgro.stockgro.ui.home.homepage.domain.SectionHomeDomain;
import com.assetgro.stockgro.ui.home.homepage.domain.WidgetDataInterface;
import hf.p;
import hf.z;
import iu.k;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kp.j;
import t0.m;
import t0.n;
import t0.p3;
import t0.r;
import yk.o;

/* loaded from: classes.dex */
public final class e extends k implements hu.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33574a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f33575b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function1 f33576c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(List list, Function1 function1, int i10) {
        super(4);
        this.f33574a = i10;
        this.f33575b = list;
        this.f33576c = function1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void a(c0.c cVar, int i10, n nVar, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16 = this.f33574a;
        Function1 function1 = this.f33576c;
        List list = this.f33575b;
        int i17 = 16;
        int i18 = 2;
        int i19 = 4;
        switch (i16) {
            case 0:
                if ((i11 & 6) == 0) {
                    if (((r) nVar).h(cVar)) {
                        i18 = 4;
                    }
                    i12 = i11 | i18;
                } else {
                    i12 = i11;
                }
                if ((i11 & 48) == 0) {
                    if (((r) nVar).f(i10)) {
                        i17 = 32;
                    }
                    i12 |= i17;
                }
                if ((i12 & 147) == 146) {
                    r rVar = (r) nVar;
                    if (rVar.G()) {
                        rVar.V();
                        return;
                    }
                }
                gb.e eVar = (gb.e) list.get(i10);
                r rVar2 = (r) nVar;
                rVar2.b0(2142510940);
                o.m(eVar, function1, rVar2, ((i12 & 14) >> 3) & 14);
                rVar2.s(false);
                return;
            case 1:
                if ((i11 & 6) == 0) {
                    if (!((r) nVar).h(cVar)) {
                        i19 = 2;
                    }
                    i13 = i11 | i19;
                } else {
                    i13 = i11;
                }
                if ((i11 & 48) == 0) {
                    if (((r) nVar).f(i10)) {
                        i17 = 32;
                    }
                    i13 |= i17;
                }
                if ((i13 & 147) == 146) {
                    r rVar3 = (r) nVar;
                    if (rVar3.G()) {
                        rVar3.V();
                        return;
                    }
                }
                CreateGroupUser createGroupUser = (CreateGroupUser) list.get(i10);
                r rVar4 = (r) nVar;
                rVar4.b0(188364025);
                j.x(null, false, createGroupUser, new ad.f(2, function1, createGroupUser), rVar4, 512, 3);
                rVar4.s(false);
                return;
            default:
                if ((i11 & 6) == 0) {
                    if (((r) nVar).h(cVar)) {
                        i15 = 4;
                    } else {
                        i15 = 2;
                    }
                    i14 = i11 | i15;
                } else {
                    i14 = i11;
                }
                if ((i11 & 48) == 0) {
                    if (((r) nVar).f(i10)) {
                        i17 = 32;
                    }
                    i14 |= i17;
                }
                if ((i14 & 147) == 146) {
                    r rVar5 = (r) nVar;
                    if (rVar5.G()) {
                        rVar5.V();
                        return;
                    }
                }
                SectionHomeDomain sectionHomeDomain = (SectionHomeDomain) list.get(i10);
                r rVar6 = (r) nVar;
                rVar6.b0(1013396500);
                rVar6.b0(1556705732);
                boolean a10 = Intrinsics.a(sectionHomeDomain.getWidgetType(), "portfolios");
                to.e eVar2 = m.f35080a;
                int i20 = 1;
                if (!a10) {
                    HomepageHeadingDto heading = sectionHomeDomain.getHeading();
                    rVar6.b0(1556711798);
                    boolean h10 = rVar6.h(function1);
                    Object Q = rVar6.Q();
                    if (h10 || Q == eVar2) {
                        Q = new p3(i20, function1);
                        rVar6.k0(Q);
                    }
                    rVar6.s(false);
                    z.a(null, heading, (Function2) Q, rVar6, 0, 1);
                }
                rVar6.s(false);
                String widgetType = sectionHomeDomain.getWidgetType();
                switch (widgetType.hashCode()) {
                    case -1396342996:
                        if (widgetType.equals("banner")) {
                            rVar6.b0(1016046534);
                            WidgetDataInterface widgetData = sectionHomeDomain.getWidgetData();
                            Intrinsics.d(widgetData, "null cannot be cast to non-null type com.assetgro.stockgro.ui.home.homepage.data.HomeBannerDto");
                            HomeBannerDto homeBannerDto = (HomeBannerDto) widgetData;
                            rVar6.b0(1556801724);
                            boolean h11 = rVar6.h(function1) | rVar6.h(sectionHomeDomain);
                            Object Q2 = rVar6.Q();
                            if (h11 || Q2 == eVar2) {
                                Q2 = new p(function1, sectionHomeDomain, 2);
                                rVar6.k0(Q2);
                            }
                            rVar6.s(false);
                            z.k(null, homeBannerDto, (Function2) Q2, rVar6, 0, 1);
                            rVar6.s(false);
                            break;
                        }
                        rVar6.b0(1018902068);
                        rVar6.s(false);
                        break;
                    case 110371416:
                        if (widgetType.equals("title")) {
                            rVar6.b0(1013910293);
                            WidgetDataInterface widgetData2 = sectionHomeDomain.getWidgetData();
                            Intrinsics.d(widgetData2, "null cannot be cast to non-null type com.assetgro.stockgro.ui.home.homepage.data.HomeTitleDto");
                            HomeTitleDto homeTitleDto = (HomeTitleDto) widgetData2;
                            rVar6.b0(1556732658);
                            boolean h12 = rVar6.h(function1);
                            Object Q3 = rVar6.Q();
                            if (h12 || Q3 == eVar2) {
                                Q3 = new p3(i18, function1);
                                rVar6.k0(Q3);
                            }
                            rVar6.s(false);
                            z.s(null, homeTitleDto, (Function2) Q3, rVar6, 0, 1);
                            rVar6.s(false);
                            break;
                        }
                        rVar6.b0(1018902068);
                        rVar6.s(false);
                        break;
                    case 339204258:
                        if (widgetType.equals("user_info")) {
                            rVar6.b0(1015331333);
                            WidgetDataInterface widgetData3 = sectionHomeDomain.getWidgetData();
                            Intrinsics.d(widgetData3, "null cannot be cast to non-null type com.assetgro.stockgro.ui.home.homepage.data.HomeUserInfoDto");
                            HomeUserInfoDto homeUserInfoDto = (HomeUserInfoDto) widgetData3;
                            rVar6.b0(1556778684);
                            boolean h13 = rVar6.h(function1) | rVar6.h(sectionHomeDomain);
                            Object Q4 = rVar6.Q();
                            if (h13 || Q4 == eVar2) {
                                Q4 = new p(function1, sectionHomeDomain, 1);
                                rVar6.k0(Q4);
                            }
                            rVar6.s(false);
                            z.u(null, homeUserInfoDto, (Function2) Q4, rVar6, 0, 1);
                            rVar6.s(false);
                            break;
                        }
                        rVar6.b0(1018902068);
                        rVar6.s(false);
                        break;
                    case 415474731:
                        if (widgetType.equals("portfolios")) {
                            rVar6.b0(1014554504);
                            WidgetDataInterface widgetData4 = sectionHomeDomain.getWidgetData();
                            Intrinsics.d(widgetData4, "null cannot be cast to non-null type com.assetgro.stockgro.ui.home.homepage.data.HomePortfolioDto");
                            HomePortfolioDto homePortfolioDto = (HomePortfolioDto) widgetData4;
                            HomepageHeadingDto heading2 = sectionHomeDomain.getHeading();
                            rVar6.b0(1556755516);
                            boolean h14 = rVar6.h(function1) | rVar6.h(sectionHomeDomain);
                            Object Q5 = rVar6.Q();
                            if (h14 || Q5 == eVar2) {
                                Q5 = new p(function1, sectionHomeDomain, 0);
                                rVar6.k0(Q5);
                            }
                            rVar6.s(false);
                            z.m(null, homePortfolioDto, heading2, (Function2) Q5, rVar6, 0, 1);
                            rVar6.s(false);
                            break;
                        }
                        rVar6.b0(1018902068);
                        rVar6.s(false);
                        break;
                    case 839250871:
                        if (widgetType.equals("markets")) {
                            rVar6.b0(1016761766);
                            WidgetDataInterface widgetData5 = sectionHomeDomain.getWidgetData();
                            Intrinsics.d(widgetData5, "null cannot be cast to non-null type com.assetgro.stockgro.ui.home.homepage.data.HomeMarketDto");
                            HomeMarketDto homeMarketDto = (HomeMarketDto) widgetData5;
                            rVar6.b0(1556824796);
                            boolean h15 = rVar6.h(function1) | rVar6.h(sectionHomeDomain);
                            Object Q6 = rVar6.Q();
                            if (h15 || Q6 == eVar2) {
                                Q6 = new p(function1, sectionHomeDomain, 3);
                                rVar6.k0(Q6);
                            }
                            rVar6.s(false);
                            z.j(null, homeMarketDto, (Function2) Q6, rVar6, 0, 1);
                            rVar6.s(false);
                            break;
                        }
                        rVar6.b0(1018902068);
                        rVar6.s(false);
                        break;
                    case 1875722400:
                        if (widgetType.equals("trade_view")) {
                            rVar6.b0(1017480439);
                            WidgetDataInterface widgetData6 = sectionHomeDomain.getWidgetData();
                            Intrinsics.d(widgetData6, "null cannot be cast to non-null type com.assetgro.stockgro.ui.home.homepage.data.HomeSocialTradeViewDto");
                            HomeSocialTradeViewDto homeSocialTradeViewDto = (HomeSocialTradeViewDto) widgetData6;
                            rVar6.b0(1556848444);
                            boolean h16 = rVar6.h(function1) | rVar6.h(sectionHomeDomain);
                            Object Q7 = rVar6.Q();
                            if (h16 || Q7 == eVar2) {
                                Q7 = new p(function1, sectionHomeDomain, 4);
                                rVar6.k0(Q7);
                            }
                            rVar6.s(false);
                            z.q(null, homeSocialTradeViewDto, (Function2) Q7, rVar6, 0, 1);
                            rVar6.s(false);
                            break;
                        }
                        rVar6.b0(1018902068);
                        rVar6.s(false);
                        break;
                    case 1952010138:
                        if (widgetType.equals("expert_view")) {
                            rVar6.b0(1018214395);
                            WidgetDataInterface widgetData7 = sectionHomeDomain.getWidgetData();
                            Intrinsics.d(widgetData7, "null cannot be cast to non-null type com.assetgro.stockgro.ui.home.homepage.data.HomeExpertViewDto");
                            HomeExpertViewDto homeExpertViewDto = (HomeExpertViewDto) widgetData7;
                            rVar6.b0(1556871996);
                            boolean h17 = rVar6.h(function1) | rVar6.h(sectionHomeDomain);
                            Object Q8 = rVar6.Q();
                            if (h17 || Q8 == eVar2) {
                                Q8 = new p(function1, sectionHomeDomain, 5);
                                rVar6.k0(Q8);
                            }
                            rVar6.s(false);
                            z.o(null, homeExpertViewDto, (Function2) Q8, rVar6, 0, 1);
                            rVar6.s(false);
                            break;
                        }
                        rVar6.b0(1018902068);
                        rVar6.s(false);
                        break;
                    default:
                        rVar6.b0(1018902068);
                        rVar6.s(false);
                        break;
                }
                rVar6.s(false);
                return;
        }
    }

    @Override // hu.d
    public final /* bridge */ /* synthetic */ Object g(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.f33574a) {
            case 0:
                a((c0.c) obj, ((Number) obj2).intValue(), (n) obj3, ((Number) obj4).intValue());
                return Unit.f23355a;
            case 1:
                a((c0.c) obj, ((Number) obj2).intValue(), (n) obj3, ((Number) obj4).intValue());
                return Unit.f23355a;
            default:
                a((c0.c) obj, ((Number) obj2).intValue(), (n) obj3, ((Number) obj4).intValue());
                return Unit.f23355a;
        }
    }
}
