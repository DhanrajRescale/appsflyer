package hf;

import com.assetgro.stockgro.ui.home.homepage.data.HomeSocialTradeViewDto;
import com.assetgro.stockgro.ui.home.homepage.data.HomeSocialTradeViewDtoKt;
import com.assetgro.stockgro.ui.home.homepage.data.MarketCategory;
import com.assetgro.stockgro.ui.home.homepage.data.MarketStocks;
import com.assetgro.stockgro.ui.home.homepage.data.SocialExpertGroup;
import com.assetgro.stockgro.ui.home.homepage.data.UserInfoItem;
import com.assetgro.stockgro.ui.home.homepage.domain.HomeSocialTradeView;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import vt.i0;

/* loaded from: classes.dex */
public final class u extends iu.k implements hu.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18414a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f18415b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function2 f18416c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(int i10, List list, Function2 function2) {
        super(4);
        this.f18414a = i10;
        this.f18415b = list;
        this.f18416c = function2;
    }

    public final void a(c0.c cVar, int i10, t0.n nVar, int i11) {
        int i12;
        int i13;
        int i14;
        g1.l lVar = g1.l.f16404b;
        int i15 = this.f18414a;
        List list = this.f18415b;
        int i16 = 32;
        int i17 = 2;
        switch (i15) {
            case 1:
                if ((i11 & 6) == 0) {
                    if (((t0.r) nVar).h(cVar)) {
                        i17 = 4;
                    }
                    i12 = i11 | i17;
                } else {
                    i12 = i11;
                }
                if ((i11 & 48) == 0) {
                    if (!((t0.r) nVar).f(i10)) {
                        i16 = 16;
                    }
                    i12 |= i16;
                }
                if ((i12 & 147) == 146) {
                    t0.r rVar = (t0.r) nVar;
                    if (rVar.G()) {
                        rVar.V();
                        return;
                    }
                }
                Object obj = list.get(i10);
                int i18 = (i12 & 112) | (i12 & 14);
                t0.r rVar2 = (t0.r) nVar;
                rVar2.b0(1988470675);
                z.n(androidx.compose.foundation.layout.a.x(lVar, s0.g.f34069a, s0.g.f34069a, s0.g.f34069a, 8, 7), (SocialExpertGroup) obj, Integer.valueOf(i10), this.f18416c, rVar2, ((i18 >> 3) & 112) | 6 | ((i18 << 3) & 896), 0);
                androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.q(lVar, 16), rVar2);
                rVar2.s(false);
                return;
            case 2:
                if ((i11 & 6) == 0) {
                    if (((t0.r) nVar).h(cVar)) {
                        i17 = 4;
                    }
                    i13 = i11 | i17;
                } else {
                    i13 = i11;
                }
                if ((i11 & 48) == 0) {
                    if (!((t0.r) nVar).f(i10)) {
                        i16 = 16;
                    }
                    i13 |= i16;
                }
                if ((i13 & 147) == 146) {
                    t0.r rVar3 = (t0.r) nVar;
                    if (rVar3.G()) {
                        rVar3.V();
                        return;
                    }
                }
                int i19 = (i13 & 112) | (i13 & 14);
                HomeSocialTradeViewDto.TradeViewElement tradeViewElement = (HomeSocialTradeViewDto.TradeViewElement) list.get(i10);
                t0.r rVar4 = (t0.r) nVar;
                rVar4.b0(839851570);
                HomeSocialTradeViewDto.TradeContent tradeContent = tradeViewElement.getTradeContent();
                Intrinsics.c(tradeContent);
                HomeSocialTradeView.TradeContent domainLayer = HomeSocialTradeViewDtoKt.toDomainLayer(tradeContent);
                rVar4.b0(-1081285524);
                if (domainLayer != null) {
                    String redirectionUrl = tradeViewElement.getRedirectionUrl();
                    if (redirectionUrl == null) {
                        redirectionUrl = HttpUrl.FRAGMENT_ENCODE_SET;
                    }
                    z.p(domainLayer, redirectionUrl, Integer.valueOf(i10), null, this.f18416c, rVar4, ((i19 << 3) & 896) | 8, 8);
                    androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.q(lVar, 16), rVar4);
                }
                rVar4.s(false);
                rVar4.s(false);
                return;
            default:
                if ((i11 & 6) == 0) {
                    if (((t0.r) nVar).h(cVar)) {
                        i17 = 4;
                    }
                    i14 = i11 | i17;
                } else {
                    i14 = i11;
                }
                if ((i11 & 48) == 0) {
                    if (!((t0.r) nVar).f(i10)) {
                        i16 = 16;
                    }
                    i14 |= i16;
                }
                if ((i14 & 147) == 146) {
                    t0.r rVar5 = (t0.r) nVar;
                    if (rVar5.G()) {
                        rVar5.V();
                        return;
                    }
                }
                Object obj2 = list.get(i10);
                int i20 = (i14 & 112) | (i14 & 14);
                t0.r rVar6 = (t0.r) nVar;
                rVar6.b0(269709233);
                z.t(androidx.compose.foundation.layout.a.x(lVar, s0.g.f34069a, s0.g.f34069a, s0.g.f34069a, 8, 7), (UserInfoItem) obj2, Integer.valueOf(i10), this.f18416c, rVar6, ((i20 >> 3) & 112) | 6 | ((i20 << 3) & 896), 0);
                androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.q(lVar, 16), rVar6);
                rVar6.s(false);
                return;
        }
    }

    @Override // hu.d
    public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.f18414a) {
            case 0:
                e0.a0 HorizontalPager = (e0.a0) obj;
                int intValue = ((Number) obj2).intValue();
                t0.n nVar = (t0.n) obj3;
                ((Number) obj4).intValue();
                Intrinsics.checkNotNullParameter(HorizontalPager, "$this$HorizontalPager");
                List list = this.f18415b;
                List<MarketStocks> stocks = ((MarketCategory) list.get(intValue)).getStocks();
                if (stocks == null) {
                    stocks = i0.f38321a;
                }
                List<MarketStocks> list2 = stocks;
                String cta = ((MarketCategory) list.get(intValue)).getCta();
                if (cta == null) {
                    cta = "Show All";
                }
                z.h(null, list2, cta, ((MarketCategory) list.get(intValue)).getRedirectionUrl(), ((MarketCategory) list.get(intValue)).getTitle(), this.f18416c, nVar, 64, 1);
                return Unit.f23355a;
            case 1:
                a((c0.c) obj, ((Number) obj2).intValue(), (t0.n) obj3, ((Number) obj4).intValue());
                return Unit.f23355a;
            case 2:
                a((c0.c) obj, ((Number) obj2).intValue(), (t0.n) obj3, ((Number) obj4).intValue());
                return Unit.f23355a;
            default:
                a((c0.c) obj, ((Number) obj2).intValue(), (t0.n) obj3, ((Number) obj4).intValue());
                return Unit.f23355a;
        }
    }
}
