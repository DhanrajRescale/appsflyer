package d2;

import android.database.DataSetObserver;
import android.os.Parcelable;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import ba.cm;
import ba.dk;
import ba.rj;
import ba.sf;
import ba.xj;
import com.assetgro.stockgro.data.model.portfolio.holdings.Portfolio;
import com.assetgro.stockgro.feature_arena.widget.PrepZoneWhatsNewWidget;
import com.assetgro.stockgro.feature_market.presentation.market.asset.stocks.list.MarketStocksListViewModel;
import com.assetgro.stockgro.feature_social.presentation.RiaProfileActivity;
import com.assetgro.stockgro.feature_social.presentation.RiaProfileViewModel;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.portfolio.v2.data.remote.PortfolioSectionDto;
import com.assetgro.stockgro.widget.ArrowSlider;
import com.assetgro.stockgro.widget.WrapContentViewPager;
import java.util.Arrays;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class y3 implements tu.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13691a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f13692b;

    public /* synthetic */ y3(Object obj, int i10) {
        this.f13691a = i10;
        this.f13692b = obj;
    }

    /* JADX WARN: Type inference failed for: r5v50, types: [bh.d, x7.a, androidx.fragment.app.m1] */
    /* JADX WARN: Type inference failed for: r8v102, types: [bh.b, x7.a, androidx.fragment.app.m1] */
    @Override // tu.g
    public final Object a(Object obj, yt.a aVar) {
        Parcelable parcelable;
        List<Portfolio> portfolios;
        List<Portfolio> portfolios2;
        int i10 = this.f13691a;
        Object obj2 = this.f13692b;
        switch (i10) {
            case 0:
                ((i2) obj2).f13459a.j(((Number) obj).floatValue());
                return Unit.f23355a;
            case 1:
                Object h10 = ((su.p) obj2).h(obj, aVar);
                if (h10 != zt.a.f42823a) {
                    return Unit.f23355a;
                }
                return h10;
            case 2:
                ((su.g) obj2).o((Unit) obj);
                return Unit.f23355a;
            case 3:
                ((h7.b) obj2).f18026e.setValue((g7.c0) obj);
                return Unit.f23355a;
            case 4:
                ja.j jVar = (ja.j) obj;
                if (!jVar.f21272a.isEmpty()) {
                    ja.i iVar = (ja.i) obj2;
                    ja.c cVar = iVar.f21271h;
                    if (cVar != null) {
                        cVar.u(jVar.f21272a);
                        LinearLayout marketOptionsContainer = ((xj) iVar.q()).f6661t;
                        Intrinsics.checkNotNullExpressionValue(marketOptionsContainer, "marketOptionsContainer");
                        zq.f.m0(marketOptionsContainer);
                        TextView marketOptionsTitle = ((xj) iVar.q()).f6662u;
                        Intrinsics.checkNotNullExpressionValue(marketOptionsTitle, "marketOptionsTitle");
                        zq.f.m0(marketOptionsTitle);
                        RecyclerView optionRecyclerView = ((xj) iVar.q()).f6663v;
                        Intrinsics.checkNotNullExpressionValue(optionRecyclerView, "optionRecyclerView");
                        zq.f.m0(optionRecyclerView);
                    } else {
                        Intrinsics.k("marketOptionLisAdapter");
                        throw null;
                    }
                } else {
                    LinearLayout marketOptionsContainer2 = ((xj) ((ja.i) obj2).q()).f6661t;
                    Intrinsics.checkNotNullExpressionValue(marketOptionsContainer2, "marketOptionsContainer");
                    zq.f.M(marketOptionsContainer2);
                }
                boolean z10 = jVar.f21275d;
                boolean z11 = jVar.f21273b;
                if (z11) {
                    ComposeView composeView = ((xj) ((ja.i) obj2).q()).f6660s;
                    Intrinsics.c(composeView);
                    zq.f.m0(composeView);
                    composeView.setContent(ja.b.f21255a);
                } else if (!z11 && !z10) {
                    ComposeView composeView2 = ((xj) ((ja.i) obj2).q()).f6660s;
                    Intrinsics.checkNotNullExpressionValue(composeView2, "composeView");
                    zq.f.M(composeView2);
                }
                boolean z12 = jVar.f21274c;
                if (z12) {
                    ((xj) ((ja.i) obj2).q()).f6664w.setRefreshing(true);
                } else if (!z12) {
                    ((xj) ((ja.i) obj2).q()).f6664w.setRefreshing(false);
                }
                if (z10) {
                    ja.i iVar2 = (ja.i) obj2;
                    int i11 = ja.i.f21269i;
                    ComposeView composeView3 = ((xj) iVar2.q()).f6660s;
                    Intrinsics.checkNotNullExpressionValue(composeView3, "composeView");
                    iVar2.F(composeView3);
                    xj xjVar = (xj) iVar2.q();
                    androidx.compose.foundation.layout.e eVar = new androidx.compose.foundation.layout.e(iVar2, 10);
                    Object obj3 = b1.d.f3079a;
                    xjVar.f6660s.setContent(new b1.c(eVar, true, 1515669365));
                    ((xj) iVar2.q()).f6664w.setEnabled(false);
                } else if (!z10 && !z11) {
                    ja.i iVar3 = (ja.i) obj2;
                    int i12 = ja.i.f21269i;
                    ComposeView composeView4 = ((xj) iVar3.q()).f6660s;
                    Intrinsics.checkNotNullExpressionValue(composeView4, "composeView");
                    zq.f.M(composeView4);
                    ((xj) iVar3.q()).f6664w.setEnabled(true);
                }
                return Unit.f23355a;
            case 5:
                ra.c cVar2 = (ra.c) obj;
                if (!cVar2.f33549a.isEmpty()) {
                    sa.l lVar = (sa.l) obj2;
                    k7.i1 layoutManager = ((rj) lVar.q()).f5975t.getLayoutManager();
                    if (layoutManager != null) {
                        parcelable = layoutManager.i0();
                    } else {
                        parcelable = null;
                    }
                    ((rj) lVar.q()).f5975t.setVisibility(0);
                    sa.a aVar2 = lVar.f34424i;
                    if (aVar2 != null) {
                        aVar2.u(cVar2.f33549a);
                        k7.i1 layoutManager2 = ((rj) lVar.q()).f5975t.getLayoutManager();
                        if (layoutManager2 != null) {
                            layoutManager2.h0(parcelable);
                        }
                    } else {
                        Intrinsics.k("assetInsightAdapter");
                        throw null;
                    }
                } else {
                    ((rj) ((sa.l) obj2).q()).f5975t.setVisibility(8);
                }
                boolean z13 = cVar2.f33553e;
                boolean z14 = cVar2.f33550b;
                if (z14) {
                    ComposeView composeView5 = ((rj) ((sa.l) obj2).q()).f5974s;
                    Intrinsics.c(composeView5);
                    zq.f.m0(composeView5);
                    composeView5.setContent(sa.g.f34415a);
                } else if (!z14 && !z13) {
                    ComposeView composeView6 = ((rj) ((sa.l) obj2).q()).f5974s;
                    Intrinsics.checkNotNullExpressionValue(composeView6, "composeView");
                    zq.f.M(composeView6);
                }
                boolean z15 = cVar2.f33551c;
                if (z15) {
                    ((rj) ((sa.l) obj2).q()).f5976u.setRefreshing(true);
                } else if (!z15) {
                    ((rj) ((sa.l) obj2).q()).f5976u.setRefreshing(false);
                }
                if (z13) {
                    sa.l lVar2 = (sa.l) obj2;
                    int i13 = sa.l.f34421j;
                    ComposeView composeView7 = ((rj) lVar2.q()).f5974s;
                    Intrinsics.checkNotNullExpressionValue(composeView7, "composeView");
                    lVar2.F(composeView7);
                    rj rjVar = (rj) lVar2.q();
                    androidx.compose.foundation.layout.e eVar2 = new androidx.compose.foundation.layout.e(lVar2, 12);
                    Object obj4 = b1.d.f3079a;
                    rjVar.f5974s.setContent(new b1.c(eVar2, true, 466580797));
                    ((rj) lVar2.q()).f5976u.setEnabled(false);
                } else if (!z13 && !z14) {
                    sa.l lVar3 = (sa.l) obj2;
                    int i14 = sa.l.f34421j;
                    ComposeView composeView8 = ((rj) lVar3.q()).f5974s;
                    Intrinsics.checkNotNullExpressionValue(composeView8, "composeView");
                    zq.f.M(composeView8);
                    ((rj) lVar3.q()).f5976u.setEnabled(true);
                }
                return Unit.f23355a;
            case 6:
                ta.i iVar4 = (ta.i) obj;
                if (!iVar4.f35653a.isEmpty()) {
                    ta.h hVar = (ta.h) obj2;
                    ConstraintLayout stockLayout = ((dk) hVar.q()).f4499w;
                    Intrinsics.checkNotNullExpressionValue(stockLayout, "stockLayout");
                    zq.f.m0(stockLayout);
                    ni.a aVar3 = hVar.f35652i;
                    if (aVar3 != null) {
                        aVar3.u(iVar4.f35653a);
                    } else {
                        Intrinsics.k("stockAdapter");
                        throw null;
                    }
                } else {
                    ConstraintLayout stockLayout2 = ((dk) ((ta.h) obj2).q()).f4499w;
                    Intrinsics.checkNotNullExpressionValue(stockLayout2, "stockLayout");
                    zq.f.M(stockLayout2);
                }
                boolean z16 = iVar4.f35656d;
                boolean z17 = iVar4.f35654b;
                if (z17) {
                    ComposeView composeView9 = ((dk) ((ta.h) obj2).q()).f4495s;
                    Intrinsics.c(composeView9);
                    zq.f.m0(composeView9);
                    composeView9.setContent(ta.b.f35637a);
                } else if (!z17 && !z16) {
                    ComposeView composeView10 = ((dk) ((ta.h) obj2).q()).f4495s;
                    Intrinsics.checkNotNullExpressionValue(composeView10, "composeView");
                    zq.f.M(composeView10);
                }
                boolean z18 = iVar4.f35657e;
                if (z18) {
                    ta.h hVar2 = (ta.h) obj2;
                    ArrowSlider pagerView = ((dk) hVar2.q()).f4496t;
                    Intrinsics.checkNotNullExpressionValue(pagerView, "pagerView");
                    hVar2.t(pagerView);
                    Object[] objArr = new Object[0];
                    Intrinsics.checkNotNullParameter("MarketStocksListFragment", "tag");
                    com.google.android.gms.internal.p002firebaseauthapi.a.g("Discarding stocks list since search is open", "s", objArr, "params", "MarketStocksListFragment").getClass();
                    ek.u.k(objArr);
                } else if (!z18) {
                    ta.h hVar3 = (ta.h) obj2;
                    int i15 = ta.h.f35649j;
                    ArrowSlider pagerView2 = ((dk) hVar3.q()).f4496t;
                    Intrinsics.checkNotNullExpressionValue(pagerView2, "pagerView");
                    hVar3.F(pagerView2);
                    TextView title = ((dk) hVar3.q()).f4496t.getTitle();
                    String string = hVar3.getString(R.string.stock_pager_title_text);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    String format = String.format(string, Arrays.copyOf(new Object[]{Integer.valueOf(((MarketStocksListViewModel) hVar3.r()).f8679v), Integer.valueOf(((MarketStocksListViewModel) hVar3.r()).f8681x)}, 2));
                    Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                    title.setText(format);
                    if (((MarketStocksListViewModel) hVar3.r()).f8679v == 1) {
                        ((dk) hVar3.q()).f4496t.getPrev().setVisibility(4);
                        ((dk) hVar3.q()).f4496t.getNext().setVisibility(0);
                    } else if (((MarketStocksListViewModel) hVar3.r()).f8679v == ((MarketStocksListViewModel) hVar3.r()).f8681x) {
                        ((dk) hVar3.q()).f4496t.getPrev().setVisibility(0);
                        ((dk) hVar3.q()).f4496t.getNext().setVisibility(4);
                    } else {
                        ((dk) hVar3.q()).f4496t.getPrev().setVisibility(0);
                        ((dk) hVar3.q()).f4496t.getNext().setVisibility(0);
                    }
                    ((MarketStocksListViewModel) hVar3.r()).f8676s.postValue(Boolean.TRUE);
                }
                boolean z19 = iVar4.f35655c;
                if (z19) {
                    ((dk) ((ta.h) obj2).q()).f4501y.setRefreshing(true);
                } else if (!z19) {
                    xu.e eVar3 = qu.r0.f32255a;
                    yk.g.H(hl.f.d(vu.u.f38408a), null, null, new ta.f((ta.h) obj2, null), 3);
                }
                if (z16) {
                    ta.h hVar4 = (ta.h) obj2;
                    int i16 = ta.h.f35649j;
                    ComposeView composeView11 = ((dk) hVar4.q()).f4495s;
                    Intrinsics.checkNotNullExpressionValue(composeView11, "composeView");
                    hVar4.F(composeView11);
                    dk dkVar = (dk) hVar4.q();
                    androidx.compose.foundation.layout.e eVar4 = new androidx.compose.foundation.layout.e(hVar4, 13);
                    Object obj5 = b1.d.f3079a;
                    dkVar.f4495s.setContent(new b1.c(eVar4, true, -1342040710));
                    ((dk) hVar4.q()).f4501y.setEnabled(false);
                } else if (!z16 && !z17) {
                    ta.h hVar5 = (ta.h) obj2;
                    int i17 = ta.h.f35649j;
                    ComposeView composeView12 = ((dk) hVar5.q()).f4495s;
                    Intrinsics.checkNotNullExpressionValue(composeView12, "composeView");
                    zq.f.M(composeView12);
                    ((dk) hVar5.q()).f4501y.setEnabled(true);
                }
                return Unit.f23355a;
            case 7:
                ib.y yVar = (ib.y) obj;
                if (yVar.f19837a != null) {
                    ((RiaProfileViewModel) ((RiaProfileActivity) obj2).x()).f8798r.setValue(yVar.f19837a);
                }
                boolean z20 = yVar.f19839c;
                boolean z21 = yVar.f19838b;
                if (z21) {
                    ComposeView composeView13 = ((ba.n3) ((RiaProfileActivity) obj2).w()).f5516u;
                    Intrinsics.c(composeView13);
                    zq.f.m0(composeView13);
                    composeView13.setContent(ib.b.f19759b);
                } else if (!z21 && !z20) {
                    ComposeView composeView14 = ((ba.n3) ((RiaProfileActivity) obj2).w()).f5516u;
                    Intrinsics.checkNotNullExpressionValue(composeView14, "composeView");
                    zq.f.M(composeView14);
                }
                if (z20) {
                    RiaProfileActivity riaProfileActivity = (RiaProfileActivity) obj2;
                    int i18 = RiaProfileActivity.f8791m;
                    ComposeView composeView15 = ((ba.n3) riaProfileActivity.w()).f5516u;
                    Intrinsics.checkNotNullExpressionValue(composeView15, "composeView");
                    riaProfileActivity.show(composeView15);
                    ba.n3 n3Var = (ba.n3) riaProfileActivity.w();
                    androidx.compose.foundation.layout.e eVar5 = new androidx.compose.foundation.layout.e(riaProfileActivity, 14);
                    Object obj6 = b1.d.f3079a;
                    n3Var.f5516u.setContent(new b1.c(eVar5, true, 329407032));
                } else if (!z20 && !z21) {
                    int i19 = RiaProfileActivity.f8791m;
                    ComposeView composeView16 = ((ba.n3) ((RiaProfileActivity) obj2).w()).f5516u;
                    Intrinsics.checkNotNullExpressionValue(composeView16, "composeView");
                    zq.f.M(composeView16);
                }
                return Unit.f23355a;
            case 8:
                g7.z0 z0Var = (g7.z0) obj;
                if (z0Var instanceof g7.y0) {
                    sc.i iVar5 = (sc.i) obj2;
                    PrepZoneWhatsNewWidget whatsNewPrepzone = ((sf) iVar5.q()).f6082y;
                    Intrinsics.checkNotNullExpressionValue(whatsNewPrepzone, "whatsNewPrepzone");
                    zq.f.M(whatsNewPrepzone);
                    LinearLayout noMyLeagueContainer = ((sf) iVar5.q()).f6078u;
                    Intrinsics.checkNotNullExpressionValue(noMyLeagueContainer, "noMyLeagueContainer");
                    zq.f.M(noMyLeagueContainer);
                    RecyclerView rvArenaUpcomingRecycler = ((sf) iVar5.q()).f6079v;
                    Intrinsics.checkNotNullExpressionValue(rvArenaUpcomingRecycler, "rvArenaUpcomingRecycler");
                    zq.f.m0(rvArenaUpcomingRecycler);
                } else if (z0Var instanceof g7.w0) {
                    sc.i iVar6 = (sc.i) obj2;
                    RecyclerView rvArenaUpcomingRecycler2 = ((sf) iVar6.q()).f6079v;
                    Intrinsics.checkNotNullExpressionValue(rvArenaUpcomingRecycler2, "rvArenaUpcomingRecycler");
                    zq.f.M(rvArenaUpcomingRecycler2);
                    LinearLayout noMyLeagueContainer2 = ((sf) iVar6.q()).f6078u;
                    Intrinsics.checkNotNullExpressionValue(noMyLeagueContainer2, "noMyLeagueContainer");
                    zq.f.m0(noMyLeagueContainer2);
                    if (!kj.a.f23207b) {
                        PrepZoneWhatsNewWidget whatsNewPrepzone2 = ((sf) iVar6.q()).f6082y;
                        Intrinsics.checkNotNullExpressionValue(whatsNewPrepzone2, "whatsNewPrepzone");
                        zq.f.m0(whatsNewPrepzone2);
                    }
                }
                return Unit.f23355a;
            default:
                gg.f fVar = (gg.f) obj;
                PortfolioSectionDto portfolioSectionDto = fVar.f17395a;
                if (portfolioSectionDto != null && (portfolios2 = portfolioSectionDto.getPortfolios()) != null && (!portfolios2.isEmpty())) {
                    gg.e eVar6 = (gg.e) obj2;
                    ((cm) eVar6.q()).f4392z.setVisibility(0);
                    cm cmVar = (cm) eVar6.q();
                    PortfolioSectionDto portfolioSectionDto2 = fVar.f17395a;
                    cmVar.C.setText(portfolioSectionDto2.getTitle());
                    ((cm) eVar6.q()).B.setText(portfolioSectionDto2.getSubTitle());
                    androidx.fragment.app.d1 fm2 = eVar6.getChildFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(fm2, "getChildFragmentManager(...)");
                    List<Portfolio> data = portfolioSectionDto2.getPortfolios();
                    Intrinsics.checkNotNullParameter(fm2, "fm");
                    Intrinsics.checkNotNullParameter(data, "data");
                    ?? m1Var = new androidx.fragment.app.m1(fm2);
                    m1Var.f6975j = data;
                    eVar6.f17393h = m1Var;
                    List<Portfolio> data2 = portfolioSectionDto2.getPortfolios();
                    Intrinsics.checkNotNullParameter(data2, "data");
                    m1Var.f6975j = data2;
                    synchronized (m1Var) {
                        try {
                            DataSetObserver dataSetObserver = m1Var.f40074b;
                            if (dataSetObserver != null) {
                                dataSetObserver.onChanged();
                            }
                        } finally {
                        }
                    }
                    m1Var.f40073a.notifyChanged();
                    WrapContentViewPager wrapContentViewPager = ((cm) eVar6.q()).f4391y;
                    wrapContentViewPager.setClipToPadding(false);
                    wrapContentViewPager.setPadding(kj.f.j(16), kj.f.j(1), kj.f.j(48), kj.f.j(1));
                    wrapContentViewPager.setPageMargin(36);
                    bh.d dVar = eVar6.f17393h;
                    if (dVar != null) {
                        wrapContentViewPager.setAdapter(dVar);
                        if (portfolioSectionDto2.getPortfolios().size() == 1) {
                            ((cm) eVar6.q()).A.setVisibility(8);
                        } else {
                            ((cm) eVar6.q()).A.setVisibility(0);
                            ((cm) eVar6.q()).A.setViewPager(((cm) eVar6.q()).f4391y);
                        }
                    } else {
                        Intrinsics.k("modelPortfolioCardAdapter");
                        throw null;
                    }
                } else {
                    ((cm) ((gg.e) obj2).q()).f4392z.setVisibility(8);
                }
                PortfolioSectionDto portfolioSectionDto3 = fVar.f17396b;
                if (portfolioSectionDto3 != null && (portfolios = portfolioSectionDto3.getPortfolios()) != null && (!portfolios.isEmpty())) {
                    gg.e eVar7 = (gg.e) obj2;
                    ((cm) eVar7.q()).f4387u.setVisibility(0);
                    ((cm) eVar7.q()).f4390x.setText(portfolioSectionDto3.getTitle());
                    ((cm) eVar7.q()).f4389w.setText(portfolioSectionDto3.getSubTitle());
                    androidx.fragment.app.d1 fm3 = eVar7.getChildFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(fm3, "getChildFragmentManager(...)");
                    List<Portfolio> data3 = portfolioSectionDto3.getPortfolios();
                    Intrinsics.checkNotNullParameter(fm3, "fm");
                    Intrinsics.checkNotNullParameter(data3, "data");
                    ?? m1Var2 = new androidx.fragment.app.m1(fm3);
                    m1Var2.f6973j = data3;
                    eVar7.f17394i = m1Var2;
                    List<Portfolio> data4 = portfolioSectionDto3.getPortfolios();
                    Intrinsics.checkNotNullParameter(data4, "data");
                    m1Var2.f6973j = data4;
                    synchronized (m1Var2) {
                        try {
                            DataSetObserver dataSetObserver2 = m1Var2.f40074b;
                            if (dataSetObserver2 != null) {
                                dataSetObserver2.onChanged();
                            }
                        } finally {
                        }
                    }
                    m1Var2.f40073a.notifyChanged();
                    WrapContentViewPager wrapContentViewPager2 = ((cm) eVar7.q()).f4386t;
                    wrapContentViewPager2.setClipToPadding(false);
                    wrapContentViewPager2.setPadding(kj.f.j(16), kj.f.j(1), kj.f.j(48), kj.f.j(1));
                    wrapContentViewPager2.setPageMargin(36);
                    bh.b bVar = eVar7.f17394i;
                    if (bVar != null) {
                        wrapContentViewPager2.setAdapter(bVar);
                        if (portfolioSectionDto3.getPortfolios().size() == 1) {
                            ((cm) eVar7.q()).f4388v.setVisibility(8);
                        } else {
                            ((cm) eVar7.q()).f4388v.setVisibility(0);
                            ((cm) eVar7.q()).f4388v.setViewPager(((cm) eVar7.q()).f4386t);
                        }
                    } else {
                        Intrinsics.k("leaguePortfolioCardAdapter");
                        throw null;
                    }
                } else {
                    ((cm) ((gg.e) obj2).q()).f4387u.setVisibility(8);
                }
                boolean z22 = fVar.f17399e;
                boolean z23 = fVar.f17397c;
                if (z23) {
                    ComposeView composeView17 = ((cm) ((gg.e) obj2).q()).f4385s;
                    Intrinsics.c(composeView17);
                    zq.f.m0(composeView17);
                    composeView17.setContent(gg.b.f17386a);
                } else if (!z23 && !z22) {
                    ComposeView composeView18 = ((cm) ((gg.e) obj2).q()).f4385s;
                    Intrinsics.checkNotNullExpressionValue(composeView18, "composeView");
                    zq.f.M(composeView18);
                }
                boolean z24 = fVar.f17398d;
                if (z24) {
                    ((cm) ((gg.e) obj2).q()).D.setRefreshing(true);
                } else if (!z24) {
                    ((cm) ((gg.e) obj2).q()).D.setRefreshing(false);
                }
                if (z22) {
                    gg.e eVar8 = (gg.e) obj2;
                    int i20 = gg.e.f17391j;
                    ComposeView composeView19 = ((cm) eVar8.q()).f4385s;
                    Intrinsics.checkNotNullExpressionValue(composeView19, "composeView");
                    eVar8.F(composeView19);
                    cm cmVar2 = (cm) eVar8.q();
                    be.b bVar2 = new be.b(eVar8, 8);
                    Object obj7 = b1.d.f3079a;
                    cmVar2.f4385s.setContent(new b1.c(bVar2, true, -335407060));
                    ((cm) eVar8.q()).D.setEnabled(false);
                } else if (!z22 && !z23) {
                    gg.e eVar9 = (gg.e) obj2;
                    int i21 = gg.e.f17391j;
                    ComposeView composeView20 = ((cm) eVar9.q()).f4385s;
                    Intrinsics.checkNotNullExpressionValue(composeView20, "composeView");
                    zq.f.M(composeView20);
                    ((cm) eVar9.q()).D.setEnabled(true);
                }
                return Unit.f23355a;
        }
    }

    public y3(g7.j4 channel) {
        this.f13691a = 1;
        Intrinsics.checkNotNullParameter(channel, "channel");
        this.f13692b = channel;
    }
}
