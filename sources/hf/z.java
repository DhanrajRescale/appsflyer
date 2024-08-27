package hf;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b0.l1;
import b0.o1;
import com.assetgro.stockgro.data.AnalyticEvent;
import com.assetgro.stockgro.data.model.homedata.Analytics;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.home.HomeViewModel;
import com.assetgro.stockgro.ui.home.homepage.data.HomeBannerDto;
import com.assetgro.stockgro.ui.home.homepage.data.HomeExpertViewDto;
import com.assetgro.stockgro.ui.home.homepage.data.HomeMarketDto;
import com.assetgro.stockgro.ui.home.homepage.data.HomePortfolioDto;
import com.assetgro.stockgro.ui.home.homepage.data.HomeSocialTradeViewDto;
import com.assetgro.stockgro.ui.home.homepage.data.HomeTitleDto;
import com.assetgro.stockgro.ui.home.homepage.data.HomeUserInfoDto;
import com.assetgro.stockgro.ui.home.homepage.data.HomepageHeadingDto;
import com.assetgro.stockgro.ui.home.homepage.data.HomepageTitleData;
import com.assetgro.stockgro.ui.home.homepage.data.MarketCategory;
import com.assetgro.stockgro.ui.home.homepage.data.MarketStocks;
import com.assetgro.stockgro.ui.home.homepage.data.PortfolioListItem;
import com.assetgro.stockgro.ui.home.homepage.domain.HomeSocialTradeView;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import d0.n0;
import d2.w0;
import e0.j0;
import e0.m0;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import m0.n5;
import m0.o0;
import m0.o5;
import n1.s0;
import okhttp3.HttpUrl;
import qu.f0;
import qu.i0;
import t0.d0;
import t0.g1;
import t0.m2;
import t0.m3;
import t0.o3;
import t0.r1;
import t0.x1;
import w.p0;

/* loaded from: classes.dex */
public abstract class z {
    public static final void a(g1.o oVar, HomepageHeadingDto homepageHeadingDto, Function2 onDeeplinkActionClicked, t0.n nVar, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        Intrinsics.checkNotNullParameter(onDeeplinkActionClicked, "onDeeplinkActionClicked");
        t0.r rVar = (t0.r) nVar;
        rVar.c0(-1850989614);
        if ((i11 & 2) != 0) {
            i12 = i10 | 48;
        } else if ((i10 & 112) == 0) {
            if (rVar.h(homepageHeadingDto)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 = i13 | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i10 & 896) == 0) {
            if (rVar.j(onDeeplinkActionClicked)) {
                i14 = 256;
            } else {
                i14 = 128;
            }
            i12 |= i14;
        }
        if ((i12 & 721) == 144 && rVar.G()) {
            rVar.V();
        } else {
            if ((i11 & 1) != 0) {
                oVar = g1.l.f16404b;
            }
            if (homepageHeadingDto != null) {
                HomepageTitleData title = homepageHeadingDto.getTitle();
                rVar.b0(-1889571413);
                if (title != null) {
                    c(null, title, false, onDeeplinkActionClicked, rVar, ((i12 << 3) & 7168) | 384, 1);
                }
                rVar.s(false);
                HomepageTitleData subTitle = homepageHeadingDto.getSubTitle();
                rVar.b0(-1889564016);
                if (subTitle != null) {
                    c(null, subTitle, true, onDeeplinkActionClicked, rVar, ((i12 << 3) & 7168) | 384, 1);
                    Unit unit = Unit.f23355a;
                }
                rVar.s(false);
            }
        }
        g1.o oVar2 = oVar;
        x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new d0.t(i10, i11, 15, oVar2, homepageHeadingDto, onDeeplinkActionClicked);
        }
    }

    public static final void b(g1.o oVar, HomepageHeadingDto homepageHeadingDto, Function2 onDeeplinkActionClick, Function0 onClick, t0.n nVar, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        g1.o oVar2;
        g1.o oVar3;
        boolean z10;
        boolean z11;
        Intrinsics.checkNotNullParameter(onDeeplinkActionClick, "onDeeplinkActionClick");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        t0.r rVar = (t0.r) nVar;
        rVar.c0(-2053563808);
        if ((i11 & 2) != 0) {
            i12 = i10 | 48;
        } else if ((i10 & 112) == 0) {
            if (rVar.h(homepageHeadingDto)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 = i13 | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i10 & 896) == 0) {
            if (rVar.j(onDeeplinkActionClick)) {
                i14 = 256;
            } else {
                i14 = 128;
            }
            i12 |= i14;
        }
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i10 & 7168) == 0) {
            if (rVar.j(onClick)) {
                i15 = 2048;
            } else {
                i15 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i12 |= i15;
        }
        if ((i12 & 5841) == 1168 && rVar.G()) {
            rVar.V();
            oVar3 = oVar;
        } else {
            if ((i11 & 1) != 0) {
                oVar2 = g1.l.f16404b;
            } else {
                oVar2 = oVar;
            }
            if (homepageHeadingDto != null) {
                HomepageTitleData title = homepageHeadingDto.getTitle();
                rVar.b0(806342171);
                if (title == null) {
                    z11 = false;
                } else {
                    HomepageTitleData copy$default = HomepageTitleData.copy$default(title, null, null, null, HttpUrl.FRAGMENT_ENCODE_SET, 7, null);
                    rVar.b0(1455988019);
                    int i16 = 1;
                    if ((i12 & 7168) == 2048) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    Object Q = rVar.Q();
                    if (z10 || Q == t0.m.f35080a) {
                        Q = new ld.e(onClick, i16);
                        rVar.k0(Q);
                    }
                    rVar.s(false);
                    z11 = false;
                    c(null, copy$default, false, (Function2) Q, rVar, 384, 1);
                }
                rVar.s(z11);
                HomepageTitleData subTitle = homepageHeadingDto.getSubTitle();
                rVar.b0(806353720);
                if (subTitle != null) {
                    c(null, subTitle, true, onDeeplinkActionClick, rVar, ((i12 << 3) & 7168) | 384, 1);
                    Unit unit = Unit.f23355a;
                }
                rVar.s(z11);
            }
            oVar3 = oVar2;
        }
        x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new d0.y((Object) oVar3, (Object) homepageHeadingDto, (ut.d) onDeeplinkActionClick, onClick, i10, i11, 10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(g1.o r32, com.assetgro.stockgro.ui.home.homepage.data.HomepageTitleData r33, boolean r34, kotlin.jvm.functions.Function2 r35, t0.n r36, int r37, int r38) {
        /*
            Method dump skipped, instructions count: 469
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: hf.z.c(g1.o, com.assetgro.stockgro.ui.home.homepage.data.HomepageTitleData, boolean, kotlin.jvm.functions.Function2, t0.n, int, int):void");
    }

    public static final void d(HomeViewModel viewModel, t0.n nVar, int i10) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        t0.r rVar = (t0.r) nVar;
        rVar.c0(1114363963);
        g1 C = t0.t.C(viewModel.B, rVar);
        t0.t.e(viewModel, new k(viewModel, null), rVar);
        if (((j) C.getValue()).f18379e) {
            rVar.b0(1435940396);
            el.l.d(null, new l(viewModel, 0), rVar, 0, 1);
            rVar.s(false);
        } else {
            rVar.b0(1436072828);
            if (kj.a.f23207b) {
                rVar.b0(1436103859);
                dp.b.y(new gf.l(viewModel, 1), (j) C.getValue(), rVar, 0, 0);
                rVar.s(false);
            } else {
                rVar.b0(1436373435);
                e(new gf.l(viewModel, 2), (j) C.getValue(), rVar, 0, 0);
                rVar.s(false);
            }
            rVar.s(false);
        }
        x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new p0(i10, 15, viewModel);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void e(kotlin.jvm.functions.Function1 r19, hf.j r20, t0.n r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 452
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: hf.z.e(kotlin.jvm.functions.Function1, hf.j, t0.n, int, int):void");
    }

    public static final void f(g1.o oVar, List tabs, j0 pagerState, Function2 onDeeplinkActionClick, t0.n nVar, int i10, int i11) {
        g1.o oVar2;
        boolean z10;
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        Intrinsics.checkNotNullParameter(pagerState, "pagerState");
        Intrinsics.checkNotNullParameter(onDeeplinkActionClick, "onDeeplinkActionClick");
        t0.r rVar = (t0.r) nVar;
        rVar.c0(1198958676);
        int i12 = i11 & 1;
        g1.l lVar = g1.l.f16404b;
        if (i12 != 0) {
            oVar2 = lVar;
        } else {
            oVar2 = oVar;
        }
        Object g10 = v.e.g(rVar, 773894976, -723523240);
        if (g10 == t0.m.f35080a) {
            g10 = v.e.o(t0.t.I(kotlin.coroutines.k.f23369a, rVar), rVar);
        }
        rVar.s(false);
        f0 f0Var = ((d0) g10).f34970a;
        rVar.s(false);
        g1.o n10 = androidx.compose.foundation.a.n(lVar, androidx.compose.foundation.a.o(rVar));
        rVar.b0(733328855);
        b0.v c10 = b0.s.c(g1.a.f16379a, false, rVar, 0);
        rVar.b0(-1323940314);
        int i13 = rVar.P;
        r1 o10 = rVar.o();
        c2.l.M.getClass();
        c2.j jVar = c2.k.f7746b;
        b1.c j10 = androidx.compose.ui.layout.a.j(n10);
        boolean z11 = rVar.f35166a instanceof t0.f;
        if (z11) {
            rVar.e0();
            if (rVar.O) {
                rVar.n(jVar);
            } else {
                rVar.n0();
            }
            c2.i iVar = c2.k.f7749e;
            t0.t.v0(rVar, c10, iVar);
            c2.i iVar2 = c2.k.f7748d;
            t0.t.v0(rVar, o10, iVar2);
            c2.i iVar3 = c2.k.f7750f;
            if (rVar.O || !Intrinsics.a(rVar.Q(), Integer.valueOf(i13))) {
                nn.d.s(i13, rVar, i13, iVar3);
            }
            nn.d.q(0, j10, new m2(rVar), rVar, 2058660585);
            g1.o e10 = androidx.compose.foundation.layout.d.e(oVar2, 1.0f);
            rVar.b0(693286680);
            l1 a10 = o1.a(b0.n.f2935a, g1.a.f16388j, rVar, 0);
            rVar.b0(-1323940314);
            int i14 = rVar.P;
            r1 o11 = rVar.o();
            b1.c j11 = androidx.compose.ui.layout.a.j(e10);
            if (z11) {
                rVar.e0();
                if (rVar.O) {
                    rVar.n(jVar);
                } else {
                    rVar.n0();
                }
                t0.t.v0(rVar, a10, iVar);
                t0.t.v0(rVar, o11, iVar2);
                if (rVar.O || !Intrinsics.a(rVar.Q(), Integer.valueOf(i14))) {
                    nn.d.s(i14, rVar, i14, iVar3);
                }
                nn.d.q(0, j11, new m2(rVar), rVar, 2058660585);
                int i15 = 0;
                for (Object obj : tabs) {
                    int i16 = i15 + 1;
                    if (i15 >= 0) {
                        MarketCategory marketCategory = (MarketCategory) obj;
                        rVar.b0(-1637487180);
                        if (i15 == 0) {
                            androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.q(lVar, 24), rVar);
                        }
                        rVar.s(false);
                        if (pagerState.f14718d.f14650b.i() == i15) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        g1.l lVar2 = lVar;
                        t0.r rVar2 = rVar;
                        dp.b.l(h2.l.a(androidx.compose.foundation.layout.d.g(lVar, 26), false, b.f18332e), z10, new s(f0Var, pagerState, i15, tabs, onDeeplinkActionClick), b1.d.c(-1174338575, new n0(marketCategory, tabs, i15, pagerState), rVar), 0L, 0L, rVar2, 3072, 48);
                        androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.q(lVar2, 10), rVar2);
                        rVar = rVar2;
                        lVar = lVar2;
                        f0Var = f0Var;
                        i15 = i16;
                        oVar2 = oVar2;
                    } else {
                        vt.y.j();
                        throw null;
                    }
                }
                g1.o oVar3 = oVar2;
                t0.r rVar3 = rVar;
                v.e.y(rVar3, false, true, false, false);
                x1 t10 = da.e.t(rVar3, false, true, false, false);
                if (t10 != null) {
                    t10.f35245d = new t(oVar3, tabs, pagerState, onDeeplinkActionClick, i10, i11, 0);
                    return;
                }
                return;
            }
            al.d.v0();
            throw null;
        }
        al.d.v0();
        throw null;
    }

    public static final void g(g1.o oVar, List tabs, j0 pagerState, Function2 onDeeplinkActionClick, t0.n nVar, int i10, int i11) {
        g1.o oVar2;
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        Intrinsics.checkNotNullParameter(pagerState, "pagerState");
        Intrinsics.checkNotNullParameter(onDeeplinkActionClick, "onDeeplinkActionClick");
        t0.r rVar = (t0.r) nVar;
        rVar.c0(-456387462);
        int i12 = i11 & 1;
        g1.l lVar = g1.l.f16404b;
        if (i12 != 0) {
            oVar2 = lVar;
        } else {
            oVar2 = oVar;
        }
        dp.b.B(pagerState, h2.l.a(androidx.compose.foundation.layout.d.e(lVar, 1.0f), false, b.f18333f), null, null, 0, s0.g.f34069a, null, null, false, false, null, null, null, b1.d.c(640849560, new u(0, tabs, onDeeplinkActionClick), rVar), rVar, (i10 >> 6) & 14, 3072, 8188);
        x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new t(oVar2, tabs, pagerState, onDeeplinkActionClick, i10, i11, 1);
        }
    }

    public static final void h(g1.o oVar, List stocks, String str, String str2, String str3, Function2 onDeeplinkActionClick, t0.n nVar, int i10, int i11) {
        g1.o oVar2;
        String str4;
        String str5;
        String str6;
        String str7;
        Intrinsics.checkNotNullParameter(stocks, "stocks");
        Intrinsics.checkNotNullParameter(onDeeplinkActionClick, "onDeeplinkActionClick");
        t0.r rVar = (t0.r) nVar;
        rVar.c0(-1826754059);
        int i12 = i11 & 1;
        g1.l lVar = g1.l.f16404b;
        if (i12 != 0) {
            oVar2 = lVar;
        } else {
            oVar2 = oVar;
        }
        if ((i11 & 4) != 0) {
            str4 = null;
        } else {
            str4 = str;
        }
        if ((i11 & 8) != 0) {
            str5 = null;
        } else {
            str5 = str2;
        }
        if ((i11 & 16) != 0) {
            str6 = null;
        } else {
            str6 = str3;
        }
        AnalyticEvent analyticEvent = new AnalyticEvent("app_home_section_cta_tapped", dp.b.a1(null, null, str5, str6, str4));
        rVar.b0(-483455358);
        l1 a10 = b0.y.a(b0.n.f2937c, g1.a.f16391m, rVar, 0);
        rVar.b0(-1323940314);
        int i13 = rVar.P;
        r1 o10 = rVar.o();
        c2.l.M.getClass();
        c2.j jVar = c2.k.f7746b;
        b1.c j10 = androidx.compose.ui.layout.a.j(lVar);
        boolean z10 = rVar.f35166a instanceof t0.f;
        if (z10) {
            rVar.e0();
            if (rVar.O) {
                rVar.n(jVar);
            } else {
                rVar.n0();
            }
            t0.t.v0(rVar, a10, c2.k.f7749e);
            t0.t.v0(rVar, o10, c2.k.f7748d);
            c2.i iVar = c2.k.f7750f;
            if (rVar.O || !Intrinsics.a(rVar.Q(), Integer.valueOf(i13))) {
                nn.d.s(i13, rVar, i13, iVar);
            }
            nn.d.q(0, j10, new m2(rVar), rVar, 2058660585);
            rVar.b0(-746112142);
            Iterator it = stocks.iterator();
            int i14 = 0;
            while (true) {
                boolean hasNext = it.hasNext();
                g1.f fVar = g1.a.f16388j;
                if (hasNext) {
                    Object next = it.next();
                    int i15 = i14 + 1;
                    if (i14 >= 0) {
                        MarketStocks marketStocks = (MarketStocks) next;
                        rVar.b0(693286680);
                        l1 a11 = o1.a(b0.n.f2935a, fVar, rVar, 0);
                        rVar.b0(-1323940314);
                        int i16 = rVar.P;
                        r1 o11 = rVar.o();
                        c2.l.M.getClass();
                        c2.j jVar2 = c2.k.f7746b;
                        AnalyticEvent analyticEvent2 = analyticEvent;
                        b1.c j11 = androidx.compose.ui.layout.a.j(lVar);
                        if (z10) {
                            rVar.e0();
                            boolean z11 = z10;
                            if (rVar.O) {
                                rVar.n(jVar2);
                            } else {
                                rVar.n0();
                            }
                            t0.t.v0(rVar, a11, c2.k.f7749e);
                            t0.t.v0(rVar, o11, c2.k.f7748d);
                            c2.i iVar2 = c2.k.f7750f;
                            if (rVar.O || !Intrinsics.a(rVar.Q(), Integer.valueOf(i16))) {
                                nn.d.s(i16, rVar, i16, iVar2);
                            }
                            nn.d.q(0, j11, new m2(rVar), rVar, 2058660585);
                            Integer valueOf = Integer.valueOf(i14);
                            int i17 = i10 >> 3;
                            i(null, marketStocks, valueOf, str6, onDeeplinkActionClick, rVar, (i17 & 7168) | (i17 & 57344), 1);
                            v.e.y(rVar, false, true, false, false);
                            pp.b.c(androidx.compose.foundation.layout.d.e(lVar, 1.0f), w0.e(R.color.separator_color_new, rVar), s0.g.f34069a, s0.g.f34069a, rVar, 6, 12);
                            i14 = i15;
                            z10 = z11;
                            analyticEvent = analyticEvent2;
                            str6 = str6;
                        } else {
                            al.d.v0();
                            throw null;
                        }
                    } else {
                        vt.y.j();
                        throw null;
                    }
                } else {
                    boolean z12 = z10;
                    AnalyticEvent analyticEvent3 = analyticEvent;
                    String str8 = str6;
                    rVar.s(false);
                    float f10 = 11;
                    g1.o x10 = androidx.compose.foundation.layout.a.x(androidx.compose.foundation.layout.d.e(oVar2, 1.0f), s0.g.f34069a, f10, 20, f10, 1);
                    b0.d dVar = b0.n.f2936b;
                    rVar.b0(693286680);
                    l1 a12 = o1.a(dVar, fVar, rVar, 6);
                    rVar.b0(-1323940314);
                    int i18 = rVar.P;
                    r1 o12 = rVar.o();
                    c2.l.M.getClass();
                    c2.j jVar3 = c2.k.f7746b;
                    b1.c j12 = androidx.compose.ui.layout.a.j(x10);
                    if (z12) {
                        rVar.e0();
                        if (rVar.O) {
                            rVar.n(jVar3);
                        } else {
                            rVar.n0();
                        }
                        t0.t.v0(rVar, a12, c2.k.f7749e);
                        t0.t.v0(rVar, o12, c2.k.f7748d);
                        c2.i iVar3 = c2.k.f7750f;
                        if (rVar.O || !Intrinsics.a(rVar.Q(), Integer.valueOf(i18))) {
                            nn.d.s(i18, rVar, i18, iVar3);
                        }
                        nn.d.q(0, j12, new m2(rVar), rVar, 2058660585);
                        if (str4 == null) {
                            str7 = HttpUrl.FRAGMENT_ENCODE_SET;
                        } else {
                            str7 = str4;
                        }
                        String str9 = str4;
                        String str10 = str5;
                        g1.o oVar3 = oVar2;
                        al.d.C(str7, h2.l.a(androidx.compose.foundation.a.k(lVar, new c0.s(15, onDeeplinkActionClick, str5, analyticEvent3), 7), false, b.f18334g), w0.e(R.color.primaryButtonColor, rVar), yk.j.e1(16), null, null, jh.c.f21384m, 0L, null, null, 0L, 0, false, 0, 0, null, null, rVar, 1575936, 0, 130992);
                        v.e.y(rVar, false, true, false, false);
                        x1 t10 = da.e.t(rVar, false, true, false, false);
                        if (t10 != null) {
                            t10.f35245d = new r0.j0(oVar3, stocks, str9, str10, str8, onDeeplinkActionClick, i10, i11, 3);
                            return;
                        }
                        return;
                    }
                    al.d.v0();
                    throw null;
                }
            }
        } else {
            al.d.v0();
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x04bf  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0164  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void i(g1.o r47, com.assetgro.stockgro.ui.home.homepage.data.MarketStocks r48, java.lang.Integer r49, java.lang.String r50, kotlin.jvm.functions.Function2 r51, t0.n r52, int r53, int r54) {
        /*
            Method dump skipped, instructions count: 1220
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: hf.z.i(g1.o, com.assetgro.stockgro.ui.home.homepage.data.MarketStocks, java.lang.Integer, java.lang.String, kotlin.jvm.functions.Function2, t0.n, int, int):void");
    }

    public static final void j(g1.o oVar, HomeMarketDto widget, Function2 onDeeplinkActionClick, t0.n nVar, int i10, int i11) {
        g1.o oVar2;
        int i12;
        int i13;
        int i14;
        int i15;
        g1.o oVar3;
        boolean z10;
        t0.r rVar;
        Intrinsics.checkNotNullParameter(widget, "widget");
        Intrinsics.checkNotNullParameter(onDeeplinkActionClick, "onDeeplinkActionClick");
        t0.r rVar2 = (t0.r) nVar;
        rVar2.c0(769519166);
        int i16 = i11 & 1;
        if (i16 != 0) {
            i12 = i10 | 6;
            oVar2 = oVar;
        } else if ((i10 & 14) == 0) {
            oVar2 = oVar;
            if (rVar2.h(oVar2)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i13 | i10;
        } else {
            oVar2 = oVar;
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            if (rVar2.h(widget)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i10 & 896) == 0) {
            if (rVar2.j(onDeeplinkActionClick)) {
                i15 = 256;
            } else {
                i15 = 128;
            }
            i12 |= i15;
        }
        if ((i12 & 731) == 146 && rVar2.G()) {
            rVar2.V();
            oVar3 = oVar2;
            rVar = rVar2;
        } else {
            g1.l lVar = g1.l.f16404b;
            if (i16 != 0) {
                oVar3 = lVar;
            } else {
                oVar3 = oVar2;
            }
            rVar2.b0(1417841300);
            if ((i12 & 112) == 32) {
                z10 = true;
            } else {
                z10 = false;
            }
            Object Q = rVar2.Q();
            if (z10 || Q == t0.m.f35080a) {
                Q = new lc.b(widget, 22);
                rVar2.k0(Q);
            }
            rVar2.s(false);
            e0.e a10 = m0.a((Function0) Q, rVar2, 0);
            rVar2.b0(-483455358);
            l1 a11 = b0.y.a(b0.n.f2937c, g1.a.f16391m, rVar2, 0);
            rVar2.b0(-1323940314);
            int i17 = rVar2.P;
            r1 o10 = rVar2.o();
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
                t0.t.v0(rVar2, a11, c2.k.f7749e);
                t0.t.v0(rVar2, o10, c2.k.f7748d);
                c2.i iVar = c2.k.f7750f;
                if (rVar2.O || !Intrinsics.a(rVar2.Q(), Integer.valueOf(i17))) {
                    nn.d.s(i17, rVar2, i17, iVar);
                }
                nn.d.q(0, j10, new m2(rVar2), rVar2, 2058660585);
                float f10 = 8;
                rVar = rVar2;
                pp.b.b(h2.l.a(androidx.compose.foundation.layout.d.e(androidx.compose.foundation.layout.a.x(oVar3, f10, s0.g.f34069a, f10, f10, 2), 1.0f), false, b.f18342o), h0.h.b(20), n1.t.f28173e, null, 4, b1.d.c(-191519995, new v.y(oVar3, widget, a10, onDeeplinkActionClick, 2), rVar2), rVar, 1769856, 24);
                v.e.u(lVar, 12, rVar, false, true);
                rVar.s(false);
                rVar.s(false);
            } else {
                al.d.v0();
                throw null;
            }
        }
        x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new d0.t(i10, i11, 16, oVar3, widget, onDeeplinkActionClick);
        }
    }

    public static final void k(g1.o oVar, HomeBannerDto widget, Function2 onDeeplinkActionClick, t0.n nVar, int i10, int i11) {
        g1.o oVar2;
        int i12;
        int i13;
        int i14;
        int i15;
        AnalyticEvent analyticEvent;
        Intrinsics.checkNotNullParameter(widget, "widget");
        Intrinsics.checkNotNullParameter(onDeeplinkActionClick, "onDeeplinkActionClick");
        t0.r rVar = (t0.r) nVar;
        rVar.c0(818479579);
        int i16 = i11 & 1;
        if (i16 != 0) {
            i12 = i10 | 6;
            oVar2 = oVar;
        } else if ((i10 & 14) == 0) {
            oVar2 = oVar;
            if (rVar.h(oVar2)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i13 | i10;
        } else {
            oVar2 = oVar;
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            if (rVar.h(widget)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i10 & 896) == 0) {
            if (rVar.j(onDeeplinkActionClick)) {
                i15 = 256;
            } else {
                i15 = 128;
            }
            i12 |= i15;
        }
        if ((i12 & 731) == 146 && rVar.G()) {
            rVar.V();
        } else {
            g1.l lVar = g1.l.f16404b;
            if (i16 != 0) {
                oVar2 = lVar;
            }
            Analytics analytics = widget.getAnalytics();
            if (analytics != null) {
                analyticEvent = new AnalyticEvent("app_home_card_tapped", dp.b.b1(analytics, null, widget.getRedirectionUrl(), null, 26));
            } else {
                analyticEvent = null;
            }
            g1.o e10 = androidx.compose.foundation.layout.d.e(oVar2, 1.0f);
            rVar.b0(-1592017476);
            Object Q = rVar.Q();
            if (Q == t0.m.f35080a) {
                Q = v.e.e(rVar);
            }
            rVar.s(false);
            g1.o a10 = h2.l.a(androidx.compose.foundation.a.j(e10, (a0.l) Q, null, false, null, new c0.s(17, onDeeplinkActionClick, widget, analyticEvent), 28), false, b.f18347t);
            g1.e eVar = g1.a.f16392n;
            b0.g gVar = b0.n.f2939e;
            rVar.b0(-483455358);
            l1 a11 = b0.y.a(gVar, eVar, rVar, 54);
            rVar.b0(-1323940314);
            int i17 = rVar.P;
            r1 o10 = rVar.o();
            c2.l.M.getClass();
            c2.j jVar = c2.k.f7746b;
            b1.c j10 = androidx.compose.ui.layout.a.j(a10);
            if (rVar.f35166a instanceof t0.f) {
                rVar.e0();
                if (rVar.O) {
                    rVar.n(jVar);
                } else {
                    rVar.n0();
                }
                t0.t.v0(rVar, a11, c2.k.f7749e);
                t0.t.v0(rVar, o10, c2.k.f7748d);
                c2.i iVar = c2.k.f7750f;
                if (rVar.O || !Intrinsics.a(rVar.Q(), Integer.valueOf(i17))) {
                    nn.d.s(i17, rVar, i17, iVar);
                }
                nn.d.q(0, j10, new m2(rVar), rVar, 2058660585);
                m3 m3Var = AndroidCompositionLocals_androidKt.f1428b;
                Context context = (Context) rVar.m(m3Var);
                String imageUrl = widget.getImageUrl();
                n8.o a12 = new n8.h(context).a();
                float aspectRatio = widget.getAspectRatio();
                y8.h hVar = new y8.h((Context) rVar.m(m3Var));
                hVar.f41338c = imageUrl;
                hVar.b();
                hVar.F = Integer.valueOf(R.drawable.error);
                hVar.G = null;
                androidx.compose.foundation.a.c(o8.p.a(hVar.a(), a12, null, null, null, 0, null, rVar, 72, 124), "image", androidx.compose.ui.draw.a.b(androidx.compose.foundation.layout.a.f(androidx.compose.foundation.layout.d.e(lVar, 1.0f), aspectRatio), h0.h.b(4)), null, a2.k.f101f, s0.g.f34069a, null, rVar, 24624, 104);
                v.e.u(lVar, 12, rVar, false, true);
                rVar.s(false);
                rVar.s(false);
            } else {
                al.d.v0();
                throw null;
            }
        }
        x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new d0.t(i10, i11, 17, oVar2, widget, onDeeplinkActionClick);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void l(g1.o r29, com.assetgro.stockgro.ui.home.homepage.data.PortfolioListItem r30, java.lang.Integer r31, kotlin.jvm.functions.Function2 r32, t0.n r33, int r34, int r35) {
        /*
            Method dump skipped, instructions count: 508
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: hf.z.l(g1.o, com.assetgro.stockgro.ui.home.homepage.data.PortfolioListItem, java.lang.Integer, kotlin.jvm.functions.Function2, t0.n, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9, types: [int, boolean] */
    public static final void m(g1.o oVar, HomePortfolioDto widget, HomepageHeadingDto homepageHeadingDto, Function2 onDeeplinkActionClick, t0.n nVar, int i10, int i11) {
        g1.o oVar2;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        g1.o oVar3;
        ?? r11;
        g1 g1Var;
        Object obj;
        boolean z10;
        int i17;
        int i18;
        g1 g1Var2;
        boolean z11;
        int i19;
        g1.o oVar4;
        boolean z12;
        Intrinsics.checkNotNullParameter(widget, "widget");
        Intrinsics.checkNotNullParameter(onDeeplinkActionClick, "onDeeplinkActionClick");
        t0.r rVar = (t0.r) nVar;
        rVar.c0(-1169565613);
        int i20 = i11 & 1;
        if (i20 != 0) {
            i12 = i10 | 6;
            oVar2 = oVar;
        } else if ((i10 & 14) == 0) {
            oVar2 = oVar;
            if (rVar.h(oVar2)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i13 | i10;
        } else {
            oVar2 = oVar;
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            if (rVar.h(widget)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i10 & 896) == 0) {
            if (rVar.h(homepageHeadingDto)) {
                i15 = 256;
            } else {
                i15 = 128;
            }
            i12 |= i15;
        }
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i10 & 7168) == 0) {
            if (rVar.j(onDeeplinkActionClick)) {
                i16 = 2048;
            } else {
                i16 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i12 |= i16;
        }
        int i21 = i12;
        if ((i21 & 5851) == 1170 && rVar.G()) {
            rVar.V();
            oVar4 = oVar2;
        } else {
            g1.l lVar = g1.l.f16404b;
            if (i20 != 0) {
                oVar3 = lVar;
            } else {
                oVar3 = oVar2;
            }
            rVar.b0(-431940596);
            Object Q = rVar.Q();
            Object obj2 = t0.m.f35080a;
            if (Q == obj2) {
                Q = t0.t.n0(Boolean.FALSE, o3.f35116a);
                rVar.k0(Q);
            }
            g1 g1Var3 = (g1) Q;
            rVar.s(false);
            g1.o e10 = androidx.compose.foundation.layout.d.e(lVar, 1.0f);
            rVar.b0(733328855);
            g1.g gVar = g1.a.f16379a;
            b0.v c10 = b0.s.c(gVar, false, rVar, 0);
            rVar.b0(-1323940314);
            int i22 = rVar.P;
            r1 o10 = rVar.o();
            c2.l.M.getClass();
            c2.j jVar = c2.k.f7746b;
            b1.c j10 = androidx.compose.ui.layout.a.j(e10);
            boolean z13 = rVar.f35166a instanceof t0.f;
            if (z13) {
                rVar.e0();
                if (rVar.O) {
                    rVar.n(jVar);
                } else {
                    rVar.n0();
                }
                c2.i iVar = c2.k.f7749e;
                t0.t.v0(rVar, c10, iVar);
                c2.i iVar2 = c2.k.f7748d;
                t0.t.v0(rVar, o10, iVar2);
                c2.i iVar3 = c2.k.f7750f;
                if (rVar.O || !Intrinsics.a(rVar.Q(), Integer.valueOf(i22))) {
                    nn.d.s(i22, rVar, i22, iVar3);
                }
                nn.d.q(0, j10, new m2(rVar), rVar, 2058660585);
                b0.s.a(androidx.compose.foundation.layout.b.f1281a.a(androidx.compose.foundation.a.e(androidx.compose.foundation.layout.d.g(androidx.compose.foundation.layout.d.e(lVar, 1.0f), 164), w0.e(R.color.gradientColor2, rVar), s0.f28162a), g1.a.f16380b), rVar, 0);
                g1.o e11 = androidx.compose.foundation.layout.d.e(oVar3, 1.0f);
                g1.e eVar = g1.a.f16391m;
                rVar.b0(-483455358);
                l1 a10 = b0.y.a(b0.n.f2937c, eVar, rVar, 48);
                rVar.b0(-1323940314);
                int i23 = rVar.P;
                r1 o11 = rVar.o();
                b1.c j11 = androidx.compose.ui.layout.a.j(e11);
                if (z13) {
                    rVar.e0();
                    g1.o oVar5 = oVar3;
                    if (rVar.O) {
                        rVar.n(jVar);
                    } else {
                        rVar.n0();
                    }
                    t0.t.v0(rVar, a10, iVar);
                    t0.t.v0(rVar, o11, iVar2);
                    if (rVar.O || !Intrinsics.a(rVar.Q(), Integer.valueOf(i23))) {
                        nn.d.s(i23, rVar, i23, iVar3);
                    }
                    nn.d.q(0, j11, new m2(rVar), rVar, 2058660585);
                    androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar, 16), rVar);
                    g1.o a11 = h2.l.a(lVar, false, v.f18418c);
                    rVar.b0(-742988146);
                    Object Q2 = rVar.Q();
                    if (Q2 == obj2) {
                        Q2 = com.google.android.gms.internal.p002firebaseauthapi.a.j(g1Var3, 16, rVar);
                    }
                    Function0 function0 = (Function0) Q2;
                    rVar.s(false);
                    int i24 = i21 >> 3;
                    g1 g1Var4 = g1Var3;
                    Object obj3 = obj2;
                    b(a11, homepageHeadingDto, onDeeplinkActionClick, function0, rVar, (i24 & 896) | (i24 & 112) | 3072, 0);
                    androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar, 20), rVar);
                    if (((Boolean) g1Var4.getValue()).booleanValue()) {
                        rVar.b0(-1557576130);
                        List<PortfolioListItem> portfolioListItems = widget.getPortfolioListItems();
                        if (portfolioListItems == null) {
                            z12 = false;
                        } else {
                            int i25 = 0;
                            for (Object obj4 : portfolioListItems) {
                                int i26 = i25 + 1;
                                if (i25 >= 0) {
                                    PortfolioListItem portfolioListItem = (PortfolioListItem) obj4;
                                    rVar.b0(-483455358);
                                    l1 a12 = b0.y.a(b0.n.f2937c, eVar, rVar, 0);
                                    rVar.b0(-1323940314);
                                    int i27 = rVar.P;
                                    r1 o12 = rVar.o();
                                    c2.l.M.getClass();
                                    c2.j jVar2 = c2.k.f7746b;
                                    b1.c j12 = androidx.compose.ui.layout.a.j(lVar);
                                    if (z13) {
                                        rVar.e0();
                                        if (rVar.O) {
                                            rVar.n(jVar2);
                                        } else {
                                            rVar.n0();
                                        }
                                        t0.t.v0(rVar, a12, c2.k.f7749e);
                                        t0.t.v0(rVar, o12, c2.k.f7748d);
                                        c2.i iVar4 = c2.k.f7750f;
                                        if (rVar.O || !Intrinsics.a(rVar.Q(), Integer.valueOf(i27))) {
                                            nn.d.s(i27, rVar, i27, iVar4);
                                        }
                                        nn.d.q(0, j12, new m2(rVar), rVar, 2058660585);
                                        l(lVar, portfolioListItem, Integer.valueOf(i25), onDeeplinkActionClick, rVar, (i21 & 7168) | 6, 0);
                                        v.e.u(lVar, 12, rVar, false, true);
                                        rVar.s(false);
                                        rVar.s(false);
                                        i25 = i26;
                                        eVar = eVar;
                                    } else {
                                        al.d.v0();
                                        throw null;
                                    }
                                } else {
                                    vt.y.j();
                                    throw null;
                                }
                            }
                            z12 = false;
                            Unit unit = Unit.f23355a;
                        }
                        rVar.s(z12);
                        r11 = z12;
                        g1Var = g1Var4;
                        obj = obj3;
                    } else {
                        int i28 = 1;
                        r11 = 0;
                        rVar.b0(-1557036637);
                        rVar.b0(733328855);
                        b0.v c11 = b0.s.c(gVar, false, rVar, 0);
                        rVar.b0(-1323940314);
                        int i29 = rVar.P;
                        r1 o13 = rVar.o();
                        b1.c j13 = androidx.compose.ui.layout.a.j(lVar);
                        if (z13) {
                            rVar.e0();
                            if (rVar.O) {
                                rVar.n(jVar);
                            } else {
                                rVar.n0();
                            }
                            t0.t.v0(rVar, c11, iVar);
                            t0.t.v0(rVar, o13, iVar2);
                            if (rVar.O || !Intrinsics.a(rVar.Q(), Integer.valueOf(i29))) {
                                nn.d.s(i29, rVar, i29, iVar3);
                            }
                            nn.d.q(0, j13, new m2(rVar), rVar, 2058660585);
                            List<PortfolioListItem> portfolioListItems2 = widget.getPortfolioListItems();
                            if (portfolioListItems2 == null) {
                                z10 = true;
                                g1Var = g1Var4;
                                obj = obj3;
                            } else {
                                int i30 = 0;
                                for (Object obj5 : portfolioListItems2) {
                                    int i31 = i30 + 1;
                                    if (i30 >= 0) {
                                        PortfolioListItem portfolioListItem2 = (PortfolioListItem) obj5;
                                        float f10 = i30;
                                        g1.o a13 = androidx.compose.ui.draw.a.a(t0.t.I0(androidx.compose.ui.draw.a.h(androidx.compose.foundation.layout.a.r(lVar, s0.g.f34069a, i30 * 15, i28), 1.0f - (0.08f * f10)), widget.getPortfolioListItems().size() - f10), 1.0f - (f10 * 0.2f));
                                        Integer valueOf = Integer.valueOf(i30);
                                        rVar.b0(-1346772974);
                                        if ((i21 & 112) == 32) {
                                            i17 = i28;
                                        } else {
                                            i17 = 0;
                                        }
                                        if ((i21 & 7168) == 2048) {
                                            i18 = i28;
                                        } else {
                                            i18 = 0;
                                        }
                                        int i32 = i17 | i18;
                                        Object Q3 = rVar.Q();
                                        Object obj6 = obj3;
                                        if (i32 == 0 && Q3 != obj6) {
                                            g1Var2 = g1Var4;
                                        } else {
                                            g1Var2 = g1Var4;
                                            Q3 = new o0(12, widget, onDeeplinkActionClick, g1Var2);
                                            rVar.k0(Q3);
                                        }
                                        rVar.s(false);
                                        l(a13, portfolioListItem2, valueOf, (Function2) Q3, rVar, 0, 0);
                                        obj3 = obj6;
                                        i30 = i31;
                                        g1Var4 = g1Var2;
                                        i28 = 1;
                                    } else {
                                        vt.y.j();
                                        throw null;
                                    }
                                }
                                g1Var = g1Var4;
                                obj = obj3;
                                Unit unit2 = Unit.f23355a;
                                z10 = true;
                            }
                            v.e.y(rVar, false, z10, false, false);
                            rVar.s(false);
                        } else {
                            al.d.v0();
                            throw null;
                        }
                    }
                    rVar.b0(-742928587);
                    if (((Boolean) g1Var.getValue()).booleanValue()) {
                        g1.o e12 = androidx.compose.foundation.layout.d.e(lVar, 1.0f);
                        b0.g gVar2 = b0.n.f2939e;
                        rVar.b0(693286680);
                        l1 a14 = o1.a(gVar2, g1.a.f16388j, rVar, 6);
                        rVar.b0(-1323940314);
                        int i33 = rVar.P;
                        r1 o14 = rVar.o();
                        c2.l.M.getClass();
                        c2.j jVar3 = c2.k.f7746b;
                        b1.c j14 = androidx.compose.ui.layout.a.j(e12);
                        if (z13) {
                            rVar.e0();
                            if (rVar.O) {
                                rVar.n(jVar3);
                            } else {
                                rVar.n0();
                            }
                            t0.t.v0(rVar, a14, c2.k.f7749e);
                            t0.t.v0(rVar, o14, c2.k.f7748d);
                            c2.i iVar5 = c2.k.f7750f;
                            if (rVar.O || !Intrinsics.a(rVar.Q(), Integer.valueOf(i33))) {
                                nn.d.s(i33, rVar, i33, iVar5);
                            }
                            nn.d.q(r11, j14, new m2(rVar), rVar, 2058660585);
                            q1.b u10 = w0.u(R.drawable.ic_portfolio_close, rVar, 6);
                            g1.o m10 = androidx.compose.foundation.layout.d.m(lVar, 28);
                            rVar.b0(-1831291070);
                            Object Q4 = rVar.Q();
                            if (Q4 == obj) {
                                Q4 = v.e.e(rVar);
                            }
                            a0.l lVar2 = (a0.l) Q4;
                            Object h10 = v.e.h(rVar, r11, -1831287125);
                            if (h10 == obj) {
                                h10 = com.google.android.gms.internal.p002firebaseauthapi.a.j(g1Var, 17, rVar);
                            }
                            rVar.s(r11);
                            g1.o j15 = androidx.compose.foundation.a.j(m10, lVar2, null, false, null, (Function0) h10, 28);
                            i19 = 32;
                            androidx.compose.foundation.a.c(u10, null, j15, null, null, s0.g.f34069a, null, rVar, 56, 120);
                            z11 = true;
                            v.e.y(rVar, r11, true, r11, r11);
                        } else {
                            al.d.v0();
                            throw null;
                        }
                    } else {
                        z11 = true;
                        i19 = 32;
                    }
                    rVar.s(r11);
                    v.e.u(lVar, i19, rVar, r11, z11);
                    v.e.y(rVar, r11, r11, r11, z11);
                    rVar.s(r11);
                    rVar.s(r11);
                    oVar4 = oVar5;
                } else {
                    al.d.v0();
                    throw null;
                }
            } else {
                al.d.v0();
                throw null;
            }
        }
        x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new d0.y((Object) oVar4, (Object) widget, (Object) homepageHeadingDto, (ut.d) onDeeplinkActionClick, i10, i11, 12);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void n(g1.o r30, com.assetgro.stockgro.ui.home.homepage.data.SocialExpertGroup r31, java.lang.Integer r32, kotlin.jvm.functions.Function2 r33, t0.n r34, int r35, int r36) {
        /*
            Method dump skipped, instructions count: 527
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: hf.z.n(g1.o, com.assetgro.stockgro.ui.home.homepage.data.SocialExpertGroup, java.lang.Integer, kotlin.jvm.functions.Function2, t0.n, int, int):void");
    }

    public static final void o(g1.o oVar, HomeExpertViewDto widget, Function2 onDeeplinkActionClick, t0.n nVar, int i10, int i11) {
        g1.o oVar2;
        int i12;
        int i13;
        int i14;
        int i15;
        boolean z10;
        boolean z11;
        Intrinsics.checkNotNullParameter(widget, "widget");
        Intrinsics.checkNotNullParameter(onDeeplinkActionClick, "onDeeplinkActionClick");
        t0.r rVar = (t0.r) nVar;
        rVar.c0(-952086798);
        int i16 = i11 & 1;
        if (i16 != 0) {
            i12 = i10 | 6;
            oVar2 = oVar;
        } else if ((i10 & 14) == 0) {
            oVar2 = oVar;
            if (rVar.h(oVar2)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i13 | i10;
        } else {
            oVar2 = oVar;
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            if (rVar.h(widget)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i10 & 896) == 0) {
            if (rVar.j(onDeeplinkActionClick)) {
                i15 = 256;
            } else {
                i15 = 128;
            }
            i12 |= i15;
        }
        if ((i12 & 731) == 146 && rVar.G()) {
            rVar.V();
        } else {
            g1.l lVar = g1.l.f16404b;
            if (i16 != 0) {
                oVar2 = lVar;
            }
            c0.m0 a10 = c0.p0.a(rVar);
            rVar.b0(-483455358);
            l1 a11 = b0.y.a(b0.n.f2937c, g1.a.f16391m, rVar, 0);
            rVar.b0(-1323940314);
            int i17 = rVar.P;
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
                t0.t.v0(rVar, a11, c2.k.f7749e);
                t0.t.v0(rVar, o10, c2.k.f7748d);
                c2.i iVar = c2.k.f7750f;
                if (rVar.O || !Intrinsics.a(rVar.Q(), Integer.valueOf(i17))) {
                    nn.d.s(i17, rVar, i17, iVar);
                }
                nn.d.q(0, j10, new m2(rVar), rVar, 2058660585);
                androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar, 16), rVar);
                g1.o e10 = androidx.compose.foundation.layout.d.e(oVar2, 1.0f);
                rVar.b0(76493887);
                if ((i12 & 112) == 32) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if ((i12 & 896) == 256) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                boolean z12 = z11 | z10;
                Object Q = rVar.Q();
                if (z12 || Q == t0.m.f35080a) {
                    Q = new zd.g(5, widget, onDeeplinkActionClick);
                    rVar.k0(Q);
                }
                rVar.s(false);
                i0.d(e10, a10, null, false, null, null, null, false, (Function1) Q, rVar, 0, 252);
                v.e.u(lVar, 12, rVar, false, true);
                rVar.s(false);
                rVar.s(false);
            } else {
                al.d.v0();
                throw null;
            }
        }
        g1.o oVar3 = oVar2;
        x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new d0.t(i10, i11, 18, oVar3, widget, onDeeplinkActionClick);
        }
    }

    public static final void p(HomeSocialTradeView.TradeContent tradeViewPost, String redirectionURL, Integer num, Analytics analytics, Function2 onDeeplinkActionClick, t0.n nVar, int i10, int i11) {
        Integer num2;
        Analytics analytics2;
        Intrinsics.checkNotNullParameter(tradeViewPost, "tradeViewPost");
        Intrinsics.checkNotNullParameter(redirectionURL, "redirectionURL");
        Intrinsics.checkNotNullParameter(onDeeplinkActionClick, "onDeeplinkActionClick");
        t0.r rVar = (t0.r) nVar;
        rVar.c0(1053980253);
        AnalyticEvent analyticEvent = null;
        if ((i11 & 4) != 0) {
            num2 = null;
        } else {
            num2 = num;
        }
        if ((i11 & 8) != 0) {
            analytics2 = null;
        } else {
            analytics2 = analytics;
        }
        if (analytics2 != null) {
            analyticEvent = new AnalyticEvent("app_home_card_tapped", dp.b.b1(analytics2, num2, redirectionURL, null, 24));
        }
        yb.g.a(null, null, tradeViewPost, new w(redirectionURL, onDeeplinkActionClick, analyticEvent), rVar, 512, 3);
        x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new x(tradeViewPost, redirectionURL, num2, analytics2, onDeeplinkActionClick, i10, i11);
        }
    }

    public static final void q(g1.o oVar, HomeSocialTradeViewDto widget, Function2 onDeeplinkActionClick, t0.n nVar, int i10, int i11) {
        g1.o oVar2;
        int i12;
        int i13;
        int i14;
        int i15;
        boolean z10;
        boolean z11;
        Intrinsics.checkNotNullParameter(widget, "widget");
        Intrinsics.checkNotNullParameter(onDeeplinkActionClick, "onDeeplinkActionClick");
        t0.r rVar = (t0.r) nVar;
        rVar.c0(-117155979);
        int i16 = i11 & 1;
        if (i16 != 0) {
            i12 = i10 | 6;
            oVar2 = oVar;
        } else if ((i10 & 14) == 0) {
            oVar2 = oVar;
            if (rVar.h(oVar2)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i13 | i10;
        } else {
            oVar2 = oVar;
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            if (rVar.h(widget)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i10 & 896) == 0) {
            if (rVar.j(onDeeplinkActionClick)) {
                i15 = 256;
            } else {
                i15 = 128;
            }
            i12 |= i15;
        }
        if ((i12 & 731) == 146 && rVar.G()) {
            rVar.V();
        } else {
            g1.l lVar = g1.l.f16404b;
            if (i16 != 0) {
                oVar2 = lVar;
            }
            c0.m0 a10 = c0.p0.a(rVar);
            g1.o v10 = androidx.compose.foundation.layout.a.v(lVar, s0.g.f34069a, 12, 1);
            rVar.b0(-483455358);
            l1 a11 = b0.y.a(b0.n.f2937c, g1.a.f16391m, rVar, 0);
            rVar.b0(-1323940314);
            int i17 = rVar.P;
            r1 o10 = rVar.o();
            c2.l.M.getClass();
            c2.j jVar = c2.k.f7746b;
            b1.c j10 = androidx.compose.ui.layout.a.j(v10);
            if (rVar.f35166a instanceof t0.f) {
                rVar.e0();
                if (rVar.O) {
                    rVar.n(jVar);
                } else {
                    rVar.n0();
                }
                t0.t.v0(rVar, a11, c2.k.f7749e);
                t0.t.v0(rVar, o10, c2.k.f7748d);
                c2.i iVar = c2.k.f7750f;
                if (rVar.O || !Intrinsics.a(rVar.Q(), Integer.valueOf(i17))) {
                    nn.d.s(i17, rVar, i17, iVar);
                }
                nn.d.q(0, j10, new m2(rVar), rVar, 2058660585);
                g1.o e10 = androidx.compose.foundation.layout.d.e(oVar2, 1.0f);
                rVar.b0(214533208);
                if ((i12 & 112) == 32) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if ((i12 & 896) == 256) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                boolean z12 = z11 | z10;
                Object Q = rVar.Q();
                if (z12 || Q == t0.m.f35080a) {
                    Q = new y(widget, onDeeplinkActionClick);
                    rVar.k0(Q);
                }
                rVar.s(false);
                i0.d(e10, a10, null, false, null, null, null, false, (Function1) Q, rVar, 0, 252);
                androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.q(lVar, 16), rVar);
                rVar.s(false);
                rVar.s(true);
                rVar.s(false);
                rVar.s(false);
            } else {
                al.d.v0();
                throw null;
            }
        }
        g1.o oVar3 = oVar2;
        x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new d0.t(i10, i11, 19, oVar3, widget, onDeeplinkActionClick);
        }
    }

    public static final void r(g1.o oVar, String redirectionUrl, Function2 onDeeplinkActionClick, t0.n nVar, int i10, int i11) {
        g1.o oVar2;
        int i12;
        int i13;
        int i14;
        int i15;
        g1.o oVar3;
        boolean z10;
        g1.o oVar4;
        Intrinsics.checkNotNullParameter(redirectionUrl, "redirectionUrl");
        Intrinsics.checkNotNullParameter(onDeeplinkActionClick, "onDeeplinkActionClick");
        t0.r rVar = (t0.r) nVar;
        rVar.c0(2052653824);
        int i16 = i11 & 1;
        if (i16 != 0) {
            i12 = i10 | 6;
            oVar2 = oVar;
        } else if ((i10 & 14) == 0) {
            oVar2 = oVar;
            if (rVar.h(oVar2)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i13 | i10;
        } else {
            oVar2 = oVar;
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            if (rVar.h(redirectionUrl)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i10 & 896) == 0) {
            if (rVar.j(onDeeplinkActionClick)) {
                i15 = 256;
            } else {
                i15 = 128;
            }
            i12 |= i15;
        }
        if ((i12 & 731) == 146 && rVar.G()) {
            rVar.V();
            oVar4 = oVar2;
        } else {
            if (i16 != 0) {
                oVar3 = g1.l.f16404b;
            } else {
                oVar3 = oVar2;
            }
            h0.g b10 = h0.h.b(12);
            g1.o m10 = androidx.compose.foundation.layout.d.m(androidx.compose.foundation.layout.a.x(oVar3, s0.g.f34069a, 18, s0.g.f34069a, s0.g.f34069a, 13), 200);
            rVar.b0(-82451534);
            Object Q = rVar.Q();
            to.e eVar = t0.m.f35080a;
            if (Q == eVar) {
                Q = v.e.e(rVar);
            }
            a0.l lVar = (a0.l) Q;
            rVar.s(false);
            o5 b11 = n5.b(n1.t.f28171c);
            rVar.b0(-82443714);
            boolean z11 = true;
            if ((i12 & 896) == 256) {
                z10 = true;
            } else {
                z10 = false;
            }
            if ((i12 & 112) != 32) {
                z11 = false;
            }
            boolean z12 = z10 | z11;
            Object Q2 = rVar.Q();
            if (z12 || Q2 == eVar) {
                Q2 = new ad.f(10, onDeeplinkActionClick, redirectionUrl);
                rVar.k0(Q2);
            }
            rVar.s(false);
            pp.b.b(androidx.compose.foundation.a.j(m10, lVar, b11, false, null, (Function0) Q2, 28), b10, n1.t.f28173e, null, 8, d.f18365e, rVar, 1769856, 24);
            oVar4 = oVar3;
        }
        x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new d0.t(i10, i11, 20, oVar4, redirectionUrl, onDeeplinkActionClick);
        }
    }

    public static final void s(g1.o oVar, HomeTitleDto widget, Function2 onDeeplinkActionClick, t0.n nVar, int i10, int i11) {
        g1.o oVar2;
        int i12;
        int i13;
        int i14;
        int i15;
        g1.o oVar3;
        boolean z10;
        boolean z11;
        g1.o oVar4;
        Intrinsics.checkNotNullParameter(widget, "widget");
        Intrinsics.checkNotNullParameter(onDeeplinkActionClick, "onDeeplinkActionClick");
        t0.r rVar = (t0.r) nVar;
        rVar.c0(1220712301);
        int i16 = i11 & 1;
        if (i16 != 0) {
            i12 = i10 | 6;
            oVar2 = oVar;
        } else if ((i10 & 14) == 0) {
            oVar2 = oVar;
            if (rVar.h(oVar)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i13 | i10;
        } else {
            oVar2 = oVar;
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            if (rVar.h(widget)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i10 & 896) == 0) {
            if (rVar.j(onDeeplinkActionClick)) {
                i15 = 256;
            } else {
                i15 = 128;
            }
            i12 |= i15;
        }
        if ((i12 & 731) == 146 && rVar.G()) {
            rVar.V();
            oVar4 = oVar2;
        } else {
            if (i16 != 0) {
                oVar3 = g1.l.f16404b;
            } else {
                oVar3 = oVar2;
            }
            g1.o a10 = h2.l.a(androidx.compose.foundation.layout.d.e(oVar3, 1.0f), false, v.f18424i);
            g1.e eVar = g1.a.f16392n;
            b0.g gVar = b0.n.f2939e;
            rVar.b0(-483455358);
            l1 a11 = b0.y.a(gVar, eVar, rVar, 54);
            rVar.b0(-1323940314);
            int i17 = rVar.P;
            r1 o10 = rVar.o();
            c2.l.M.getClass();
            c2.j jVar = c2.k.f7746b;
            b1.c j10 = androidx.compose.ui.layout.a.j(a10);
            if (rVar.f35166a instanceof t0.f) {
                rVar.e0();
                if (rVar.O) {
                    rVar.n(jVar);
                } else {
                    rVar.n0();
                }
                t0.t.v0(rVar, a11, c2.k.f7749e);
                t0.t.v0(rVar, o10, c2.k.f7748d);
                c2.i iVar = c2.k.f7750f;
                if (rVar.O || !Intrinsics.a(rVar.Q(), Integer.valueOf(i17))) {
                    nn.d.s(i17, rVar, i17, iVar);
                }
                nn.d.q(0, j10, new m2(rVar), rVar, 2058660585);
                String titleUrl = widget.getTitleUrl();
                float aspectRatio = widget.getAspectRatio();
                rVar.b0(1460101450);
                if ((i12 & 112) == 32) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if ((i12 & 896) == 256) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                boolean z12 = z11 | z10;
                Object Q = rVar.Q();
                if (z12 || Q == t0.m.f35080a) {
                    Q = new ad.f(11, widget, onDeeplinkActionClick);
                    rVar.k0(Q);
                }
                rVar.s(false);
                el.l.a(titleUrl, aspectRatio, (Function0) Q, rVar, 0);
                v.e.y(rVar, false, true, false, false);
                oVar4 = oVar3;
            } else {
                al.d.v0();
                throw null;
            }
        }
        x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new d0.t(i10, i11, 21, oVar4, widget, onDeeplinkActionClick);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void t(g1.o r29, com.assetgro.stockgro.ui.home.homepage.data.UserInfoItem r30, java.lang.Integer r31, kotlin.jvm.functions.Function2 r32, t0.n r33, int r34, int r35) {
        /*
            Method dump skipped, instructions count: 526
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: hf.z.t(g1.o, com.assetgro.stockgro.ui.home.homepage.data.UserInfoItem, java.lang.Integer, kotlin.jvm.functions.Function2, t0.n, int, int):void");
    }

    public static final void u(g1.o oVar, HomeUserInfoDto widget, Function2 onDeeplinkActionClick, t0.n nVar, int i10, int i11) {
        g1.o oVar2;
        int i12;
        int i13;
        int i14;
        int i15;
        boolean z10;
        boolean z11;
        Intrinsics.checkNotNullParameter(widget, "widget");
        Intrinsics.checkNotNullParameter(onDeeplinkActionClick, "onDeeplinkActionClick");
        t0.r rVar = (t0.r) nVar;
        rVar.c0(756811487);
        int i16 = i11 & 1;
        if (i16 != 0) {
            i12 = i10 | 6;
            oVar2 = oVar;
        } else if ((i10 & 14) == 0) {
            oVar2 = oVar;
            if (rVar.h(oVar2)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i13 | i10;
        } else {
            oVar2 = oVar;
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            if (rVar.h(widget)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i10 & 896) == 0) {
            if (rVar.j(onDeeplinkActionClick)) {
                i15 = 256;
            } else {
                i15 = 128;
            }
            i12 |= i15;
        }
        if ((i12 & 731) == 146 && rVar.G()) {
            rVar.V();
        } else {
            g1.l lVar = g1.l.f16404b;
            if (i16 != 0) {
                oVar2 = lVar;
            }
            c0.m0 a10 = c0.p0.a(rVar);
            rVar.b0(-483455358);
            l1 a11 = b0.y.a(b0.n.f2937c, g1.a.f16391m, rVar, 0);
            rVar.b0(-1323940314);
            int i17 = rVar.P;
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
                t0.t.v0(rVar, a11, c2.k.f7749e);
                t0.t.v0(rVar, o10, c2.k.f7748d);
                c2.i iVar = c2.k.f7750f;
                if (rVar.O || !Intrinsics.a(rVar.Q(), Integer.valueOf(i17))) {
                    nn.d.s(i17, rVar, i17, iVar);
                }
                nn.d.q(0, j10, new m2(rVar), rVar, 2058660585);
                androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar, 16), rVar);
                g1.o e10 = androidx.compose.foundation.layout.d.e(oVar2, 1.0f);
                rVar.b0(-495151771);
                if ((i12 & 112) == 32) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if ((i12 & 896) == 256) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                boolean z12 = z11 | z10;
                Object Q = rVar.Q();
                if (z12 || Q == t0.m.f35080a) {
                    Q = new zd.g(6, widget, onDeeplinkActionClick);
                    rVar.k0(Q);
                }
                rVar.s(false);
                i0.d(e10, a10, null, false, null, null, null, false, (Function1) Q, rVar, 0, 252);
                v.e.u(lVar, 12, rVar, false, true);
                rVar.s(false);
                rVar.s(false);
            } else {
                al.d.v0();
                throw null;
            }
        }
        g1.o oVar3 = oVar2;
        x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new d0.t(i10, i11, 22, oVar3, widget, onDeeplinkActionClick);
        }
    }
}
