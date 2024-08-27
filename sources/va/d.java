package va;

import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import ba.a2;
import com.assetgro.stockgro.data.AnalyticEvent;
import com.assetgro.stockgro.data.model.MarketSearchRecords;
import com.assetgro.stockgro.data.model.MarketSearchResponseData;
import com.assetgro.stockgro.feature_market.data.remote.FnoOptionDto;
import com.assetgro.stockgro.feature_market.presentation.fno.OptionDetailHostActivity;
import com.assetgro.stockgro.feature_market.presentation.market.search.MarketAdvancedSearchActivity;
import com.assetgro.stockgro.feature_market.presentation.market.search.MarketAdvancedSearchViewModel;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.stock.detail.StockDetailHostActivity;
import iu.k;
import java.util.Arrays;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.w;
import z9.h;

/* loaded from: classes.dex */
public final class d extends k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37820a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MarketAdvancedSearchActivity f37821b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(MarketAdvancedSearchActivity marketAdvancedSearchActivity, int i10) {
        super(1);
        this.f37820a = i10;
        this.f37821b = marketAdvancedSearchActivity;
    }

    public final void a(FnoOptionDto it) {
        boolean z10;
        String str;
        int i10 = this.f37820a;
        MarketAdvancedSearchActivity marketAdvancedSearchActivity = this.f37821b;
        switch (i10) {
            case 4:
                Intrinsics.checkNotNullParameter(it, "it");
                String identifier = it.getIdentifier();
                int i11 = MarketAdvancedSearchActivity.f8684m;
                marketAdvancedSearchActivity.getClass();
                Intent intent = new Intent(marketAdvancedSearchActivity, (Class<?>) StockDetailHostActivity.class);
                Bundle bundle = new Bundle();
                bundle.putBoolean("ADD_TO_PORTFOLIO", marketAdvancedSearchActivity.getIntent().getBooleanExtra("ADD_TO_PORTFOLIO", false));
                bundle.putParcelable("PORTFOLIO", marketAdvancedSearchActivity.getIntent().getParcelableExtra("PORTFOLIO"));
                bundle.putBoolean("CALL_FROM_PORTFOLIO", marketAdvancedSearchActivity.getIntent().getBooleanExtra("CALL_FROM_PORTFOLIO", false));
                bundle.putString("STOCK_NAME", identifier);
                intent.putExtras(bundle);
                marketAdvancedSearchActivity.startActivity(intent);
                return;
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                String str2 = null;
                AnalyticEvent analyticEvent = new AnalyticEvent("app_market_fno_stocklist_click", null, 2, null);
                marketAdvancedSearchActivity.C(analyticEvent);
                marketAdvancedSearchActivity.E(analyticEvent);
                Intent intent2 = new Intent(marketAdvancedSearchActivity, (Class<?>) OptionDetailHostActivity.class);
                intent2.putExtra("DATA", it.toFnoOption());
                Bundle extras = intent2.getExtras();
                if (extras != null) {
                    z10 = extras.getBoolean("CALL_FROM_PORTFOLIO");
                } else {
                    z10 = true;
                }
                intent2.putExtra("CALL_FROM_PORTFOLIO", z10);
                Bundle extras2 = intent2.getExtras();
                if (extras2 != null) {
                    str = extras2.getString("PORTFOLIO_ID");
                } else {
                    str = null;
                }
                intent2.putExtra("PORTFOLIO_ID", str);
                Bundle extras3 = intent2.getExtras();
                if (extras3 != null) {
                    str2 = extras3.getString("IS_MODEL");
                }
                intent2.putExtra("IS_MODEL", str2);
                marketAdvancedSearchActivity.startActivity(intent2);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10;
        h hVar;
        List<FnoOptionDto> list;
        List<FnoOptionDto> list2;
        int i11;
        MarketSearchRecords options;
        Boolean bool;
        Boolean bool2;
        int i12;
        List<FnoOptionDto> records;
        int i13;
        List<FnoOptionDto> records2;
        List<FnoOptionDto> records3;
        List<FnoOptionDto> records4;
        Integer num;
        String m10;
        List<FnoOptionDto> records5;
        Integer num2;
        String m11;
        List<FnoOptionDto> records6;
        MarketSearchRecords stocks;
        int i14 = this.f37820a;
        MarketAdvancedSearchActivity marketAdvancedSearchActivity = this.f37821b;
        switch (i14) {
            case 0:
                e eVar = (e) obj;
                if (eVar == null) {
                    i10 = -1;
                } else {
                    i10 = c.f37819a[eVar.ordinal()];
                }
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 == 3) {
                            LinearLayout searchResultFirstContainer = ((a2) marketAdvancedSearchActivity.w()).f4154t.C;
                            Intrinsics.checkNotNullExpressionValue(searchResultFirstContainer, "searchResultFirstContainer");
                            zq.f.M(searchResultFirstContainer);
                            LinearLayout searchResultSecondContainer = ((a2) marketAdvancedSearchActivity.w()).f4154t.F;
                            Intrinsics.checkNotNullExpressionValue(searchResultSecondContainer, "searchResultSecondContainer");
                            zq.f.M(searchResultSecondContainer);
                            TextView viewMoreSecondSearchResult = ((a2) marketAdvancedSearchActivity.w()).f4154t.M;
                            Intrinsics.checkNotNullExpressionValue(viewMoreSecondSearchResult, "viewMoreSecondSearchResult");
                            zq.f.M(viewMoreSecondSearchResult);
                            TextView chipOptions = ((a2) marketAdvancedSearchActivity.w()).f4154t.f5080u;
                            Intrinsics.checkNotNullExpressionValue(chipOptions, "chipOptions");
                            chipOptions.setBackground(r3.k.getDrawable(marketAdvancedSearchActivity, R.drawable.background_social_search_chip_selected));
                            TextView chipAll = ((a2) marketAdvancedSearchActivity.w()).f4154t.f5079t;
                            Intrinsics.checkNotNullExpressionValue(chipAll, "chipAll");
                            MarketAdvancedSearchActivity.K(marketAdvancedSearchActivity, chipAll);
                            TextView chipStocks = ((a2) marketAdvancedSearchActivity.w()).f4154t.f5081v;
                            Intrinsics.checkNotNullExpressionValue(chipStocks, "chipStocks");
                            MarketAdvancedSearchActivity.K(marketAdvancedSearchActivity, chipStocks);
                            ((a2) marketAdvancedSearchActivity.w()).f4154t.I.setMyScrollChangeListener(new b(marketAdvancedSearchActivity, 0));
                            marketAdvancedSearchActivity.L(((MarketAdvancedSearchViewModel) marketAdvancedSearchActivity.x()).f8693t);
                        }
                    } else {
                        LinearLayout searchResultFirstContainer2 = ((a2) marketAdvancedSearchActivity.w()).f4154t.C;
                        Intrinsics.checkNotNullExpressionValue(searchResultFirstContainer2, "searchResultFirstContainer");
                        zq.f.M(searchResultFirstContainer2);
                        TextView viewMoreFirstSearchResult = ((a2) marketAdvancedSearchActivity.w()).f4154t.L;
                        Intrinsics.checkNotNullExpressionValue(viewMoreFirstSearchResult, "viewMoreFirstSearchResult");
                        zq.f.M(viewMoreFirstSearchResult);
                        LinearLayout searchResultSecondContainer2 = ((a2) marketAdvancedSearchActivity.w()).f4154t.F;
                        Intrinsics.checkNotNullExpressionValue(searchResultSecondContainer2, "searchResultSecondContainer");
                        zq.f.M(searchResultSecondContainer2);
                        TextView chipStocks2 = ((a2) marketAdvancedSearchActivity.w()).f4154t.f5081v;
                        Intrinsics.checkNotNullExpressionValue(chipStocks2, "chipStocks");
                        chipStocks2.setBackground(r3.k.getDrawable(marketAdvancedSearchActivity, R.drawable.background_social_search_chip_selected));
                        TextView chipAll2 = ((a2) marketAdvancedSearchActivity.w()).f4154t.f5079t;
                        Intrinsics.checkNotNullExpressionValue(chipAll2, "chipAll");
                        MarketAdvancedSearchActivity.K(marketAdvancedSearchActivity, chipAll2);
                        TextView chipOptions2 = ((a2) marketAdvancedSearchActivity.w()).f4154t.f5080u;
                        Intrinsics.checkNotNullExpressionValue(chipOptions2, "chipOptions");
                        MarketAdvancedSearchActivity.K(marketAdvancedSearchActivity, chipOptions2);
                        ((a2) marketAdvancedSearchActivity.w()).f4154t.I.setMyScrollChangeListener(new b(marketAdvancedSearchActivity, 0));
                        marketAdvancedSearchActivity.L(((MarketAdvancedSearchViewModel) marketAdvancedSearchActivity.x()).f8693t);
                    }
                } else {
                    LinearLayout searchResultFirstContainer3 = ((a2) marketAdvancedSearchActivity.w()).f4154t.C;
                    Intrinsics.checkNotNullExpressionValue(searchResultFirstContainer3, "searchResultFirstContainer");
                    zq.f.M(searchResultFirstContainer3);
                    TextView viewMoreFirstSearchResult2 = ((a2) marketAdvancedSearchActivity.w()).f4154t.L;
                    Intrinsics.checkNotNullExpressionValue(viewMoreFirstSearchResult2, "viewMoreFirstSearchResult");
                    zq.f.M(viewMoreFirstSearchResult2);
                    TextView viewMoreSecondSearchResult2 = ((a2) marketAdvancedSearchActivity.w()).f4154t.M;
                    Intrinsics.checkNotNullExpressionValue(viewMoreSecondSearchResult2, "viewMoreSecondSearchResult");
                    zq.f.M(viewMoreSecondSearchResult2);
                    LinearLayout searchResultSecondContainer3 = ((a2) marketAdvancedSearchActivity.w()).f4154t.F;
                    Intrinsics.checkNotNullExpressionValue(searchResultSecondContainer3, "searchResultSecondContainer");
                    zq.f.M(searchResultSecondContainer3);
                    TextView chipAll3 = ((a2) marketAdvancedSearchActivity.w()).f4154t.f5079t;
                    Intrinsics.checkNotNullExpressionValue(chipAll3, "chipAll");
                    chipAll3.setBackground(r3.k.getDrawable(marketAdvancedSearchActivity, R.drawable.background_social_search_chip_selected));
                    TextView chipStocks3 = ((a2) marketAdvancedSearchActivity.w()).f4154t.f5081v;
                    Intrinsics.checkNotNullExpressionValue(chipStocks3, "chipStocks");
                    MarketAdvancedSearchActivity.K(marketAdvancedSearchActivity, chipStocks3);
                    TextView chipOptions3 = ((a2) marketAdvancedSearchActivity.w()).f4154t.f5080u;
                    Intrinsics.checkNotNullExpressionValue(chipOptions3, "chipOptions");
                    MarketAdvancedSearchActivity.K(marketAdvancedSearchActivity, chipOptions3);
                    MarketAdvancedSearchViewModel marketAdvancedSearchViewModel = (MarketAdvancedSearchViewModel) marketAdvancedSearchActivity.x();
                    marketAdvancedSearchViewModel.f8694u = false;
                    marketAdvancedSearchViewModel.f8695v = 0;
                    ((a2) marketAdvancedSearchActivity.w()).f4154t.I.setMyScrollChangeListener(null);
                }
                return Unit.f23355a;
            case 1:
                Boolean bool3 = (Boolean) obj;
                Intrinsics.c(bool3);
                if (bool3.booleanValue()) {
                    TextView chipOptions4 = ((a2) marketAdvancedSearchActivity.w()).f4154t.f5080u;
                    Intrinsics.checkNotNullExpressionValue(chipOptions4, "chipOptions");
                    zq.f.M(chipOptions4);
                    a2 a2Var = (a2) marketAdvancedSearchActivity.w();
                    if (kj.a.f23207b) {
                        hVar = new h(R.string.search_for_stock, new Object[0]);
                    } else {
                        hVar = new h(R.string.search_for_stock, new Object[0]);
                    }
                    a2Var.f4158x.setTitle(hVar.a(marketAdvancedSearchActivity));
                    LinearLayout searchResultSecondContainer4 = ((a2) marketAdvancedSearchActivity.w()).f4154t.F;
                    Intrinsics.checkNotNullExpressionValue(searchResultSecondContainer4, "searchResultSecondContainer");
                    zq.f.M(searchResultSecondContainer4);
                    LinearLayout noSearchResultSecondContainer = ((a2) marketAdvancedSearchActivity.w()).f4154t.A;
                    Intrinsics.checkNotNullExpressionValue(noSearchResultSecondContainer, "noSearchResultSecondContainer");
                    zq.f.M(noSearchResultSecondContainer);
                }
                return Unit.f23355a;
            case 2:
                MarketSearchResponseData marketSearchResponseData = (MarketSearchResponseData) obj;
                if (marketSearchResponseData != null && (stocks = marketSearchResponseData.getStocks()) != null) {
                    list = stocks.getRecords();
                } else {
                    list = null;
                }
                if (list == null || list.isEmpty()) {
                    if (marketSearchResponseData != null && (options = marketSearchResponseData.getOptions()) != null) {
                        list2 = options.getRecords();
                    } else {
                        list2 = null;
                    }
                    if (list2 == null || list2.isEmpty()) {
                        ((a2) marketAdvancedSearchActivity.w()).f4155u.setVisibility(0);
                        ((a2) marketAdvancedSearchActivity.w()).f4156v.setVisibility(8);
                        ((a2) marketAdvancedSearchActivity.w()).f4153s.setVisibility(8);
                        LinearLayout linearLayout = ((a2) marketAdvancedSearchActivity.w()).f4154t.f5078s;
                        if (((MarketAdvancedSearchViewModel) marketAdvancedSearchActivity.x()).f8692s == e.f37822b) {
                            i11 = 8;
                        } else {
                            i11 = 0;
                        }
                        linearLayout.setVisibility(i11);
                        ((a2) marketAdvancedSearchActivity.w()).f4154t.C.setVisibility(8);
                        ((a2) marketAdvancedSearchActivity.w()).f4154t.F.setVisibility(8);
                        ((a2) marketAdvancedSearchActivity.w()).f4154t.f5085z.setVisibility(8);
                        ((a2) marketAdvancedSearchActivity.w()).f4154t.A.setVisibility(8);
                        int ordinal = ((MarketAdvancedSearchViewModel) marketAdvancedSearchActivity.x()).f8692s.ordinal();
                        if (ordinal != 0) {
                            if (ordinal != 1) {
                                if (ordinal == 2) {
                                    a2 a2Var2 = (a2) marketAdvancedSearchActivity.w();
                                    String string = marketAdvancedSearchActivity.getString(R.string.text_no_search_results_options);
                                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                                    a2Var2.f4157w.setText(a3.a.m(new Object[]{((MarketAdvancedSearchViewModel) marketAdvancedSearchActivity.x()).f8693t}, 1, string, "format(...)"));
                                }
                            } else {
                                a2 a2Var3 = (a2) marketAdvancedSearchActivity.w();
                                String string2 = marketAdvancedSearchActivity.getString(R.string.text_no_search_results_stocks);
                                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                                a2Var3.f4157w.setText(a3.a.m(new Object[]{((MarketAdvancedSearchViewModel) marketAdvancedSearchActivity.x()).f8693t}, 1, string2, "format(...)"));
                            }
                        } else {
                            a2 a2Var4 = (a2) marketAdvancedSearchActivity.w();
                            String string3 = marketAdvancedSearchActivity.getString(R.string.text_no_search_results_all);
                            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                            a2Var4.f4157w.setText(a3.a.m(new Object[]{((MarketAdvancedSearchViewModel) marketAdvancedSearchActivity.x()).f8693t}, 1, string3, "format(...)"));
                        }
                        return Unit.f23355a;
                    }
                }
                ((a2) marketAdvancedSearchActivity.w()).f4155u.setVisibility(8);
                ((a2) marketAdvancedSearchActivity.w()).f4156v.setVisibility(8);
                ((a2) marketAdvancedSearchActivity.w()).f4153s.setVisibility(8);
                ((a2) marketAdvancedSearchActivity.w()).f4154t.f5078s.setVisibility(0);
                if (marketSearchResponseData != null) {
                    int ordinal2 = ((MarketAdvancedSearchViewModel) marketAdvancedSearchActivity.x()).f8692s.ordinal();
                    if (ordinal2 != 0) {
                        if (ordinal2 != 1) {
                            if (ordinal2 == 2) {
                                marketAdvancedSearchActivity.M();
                                MarketSearchRecords options2 = marketSearchResponseData.getOptions();
                                MarketSearchRecords options3 = marketSearchResponseData.getOptions();
                                if (options3 != null) {
                                    num2 = Integer.valueOf(options3.getTotal());
                                } else {
                                    num2 = null;
                                }
                                String valueOf = String.valueOf(num2);
                                if (Intrinsics.a(valueOf, "1")) {
                                    String string4 = marketAdvancedSearchActivity.getString(R.string.text_label_search_results_options_singular);
                                    Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                                    m11 = a3.a.m(new Object[]{valueOf, ((MarketAdvancedSearchViewModel) marketAdvancedSearchActivity.x()).f8693t}, 2, string4, "format(...)");
                                } else if (((MarketAdvancedSearchViewModel) marketAdvancedSearchActivity.x()).f8693t.length() == 0) {
                                    String string5 = marketAdvancedSearchActivity.getString(R.string.text_label_search_results_options_empty);
                                    Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
                                    m11 = a3.a.m(new Object[]{valueOf}, 1, string5, "format(...)");
                                } else {
                                    String string6 = marketAdvancedSearchActivity.getString(R.string.text_label_search_results_options);
                                    Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
                                    m11 = a3.a.m(new Object[]{valueOf, ((MarketAdvancedSearchViewModel) marketAdvancedSearchActivity.x()).f8693t}, 2, string6, "format(...)");
                                }
                                ((a2) marketAdvancedSearchActivity.w()).f4154t.f5082w.setText(m11);
                                RecyclerView recyclerView = ((a2) marketAdvancedSearchActivity.w()).f4154t.E;
                                wa.a aVar = marketAdvancedSearchActivity.f8686l;
                                if (aVar != null) {
                                    recyclerView.setAdapter(aVar);
                                    if (options2 != null && (records6 = options2.getRecords()) != null) {
                                        marketAdvancedSearchActivity.N(records6);
                                    }
                                } else {
                                    Intrinsics.k("advancedSearchOptionsAdapter");
                                    throw null;
                                }
                            }
                        } else {
                            marketAdvancedSearchActivity.M();
                            MarketSearchRecords stocks2 = marketSearchResponseData.getStocks();
                            MarketSearchRecords stocks3 = marketSearchResponseData.getStocks();
                            if (stocks3 != null) {
                                num = Integer.valueOf(stocks3.getTotal());
                            } else {
                                num = null;
                            }
                            String valueOf2 = String.valueOf(num);
                            if (Intrinsics.a(valueOf2, "1")) {
                                String string7 = marketAdvancedSearchActivity.getString(R.string.text_label_search_results_stocks_singular);
                                Intrinsics.checkNotNullExpressionValue(string7, "getString(...)");
                                m10 = a3.a.m(new Object[]{valueOf2, ((MarketAdvancedSearchViewModel) marketAdvancedSearchActivity.x()).f8693t}, 2, string7, "format(...)");
                            } else if (((MarketAdvancedSearchViewModel) marketAdvancedSearchActivity.x()).f8693t.length() == 0) {
                                String string8 = marketAdvancedSearchActivity.getString(R.string.text_label_search_results_stocks_empty);
                                Intrinsics.checkNotNullExpressionValue(string8, "getString(...)");
                                m10 = a3.a.m(new Object[]{valueOf2}, 1, string8, "format(...)");
                            } else {
                                String string9 = marketAdvancedSearchActivity.getString(R.string.text_label_search_results_stocks);
                                Intrinsics.checkNotNullExpressionValue(string9, "getString(...)");
                                m10 = a3.a.m(new Object[]{valueOf2, ((MarketAdvancedSearchViewModel) marketAdvancedSearchActivity.x()).f8693t}, 2, string9, "format(...)");
                            }
                            ((a2) marketAdvancedSearchActivity.w()).f4154t.f5082w.setText(m10);
                            RecyclerView recyclerView2 = ((a2) marketAdvancedSearchActivity.w()).f4154t.E;
                            wa.f fVar = marketAdvancedSearchActivity.f8685k;
                            if (fVar != null) {
                                recyclerView2.setAdapter(fVar);
                                if (stocks2 != null && (records5 = stocks2.getRecords()) != null) {
                                    marketAdvancedSearchActivity.O(records5);
                                }
                            } else {
                                Intrinsics.k("advancedSearchStocksAdapter");
                                throw null;
                            }
                        }
                    } else {
                        MarketSearchRecords stocks4 = marketSearchResponseData.getStocks();
                        MarketSearchRecords options4 = marketSearchResponseData.getOptions();
                        MarketSearchRecords stocks5 = marketSearchResponseData.getStocks();
                        if (stocks5 != null && (records4 = stocks5.getRecords()) != null) {
                            bool = Boolean.valueOf(!records4.isEmpty());
                        } else {
                            bool = null;
                        }
                        MarketSearchRecords options5 = marketSearchResponseData.getOptions();
                        if (options5 != null && (records3 = options5.getRecords()) != null) {
                            bool2 = Boolean.valueOf(!records3.isEmpty());
                        } else {
                            bool2 = null;
                        }
                        Boolean bool4 = Boolean.TRUE;
                        if (Intrinsics.a(bool, bool4)) {
                            LinearLayout searchResultFirstContainer4 = ((a2) marketAdvancedSearchActivity.w()).f4154t.C;
                            Intrinsics.checkNotNullExpressionValue(searchResultFirstContainer4, "searchResultFirstContainer");
                            zq.f.m0(searchResultFirstContainer4);
                            LinearLayout searchResultFirstDataContainer = ((a2) marketAdvancedSearchActivity.w()).f4154t.D;
                            Intrinsics.checkNotNullExpressionValue(searchResultFirstDataContainer, "searchResultFirstDataContainer");
                            zq.f.m0(searchResultFirstDataContainer);
                            LinearLayout noSearchResultFirstContainer = ((a2) marketAdvancedSearchActivity.w()).f4154t.f5085z;
                            Intrinsics.checkNotNullExpressionValue(noSearchResultFirstContainer, "noSearchResultFirstContainer");
                            zq.f.M(noSearchResultFirstContainer);
                            ((a2) marketAdvancedSearchActivity.w()).f4154t.f5082w.setText(marketAdvancedSearchActivity.getString(R.string.stocks));
                            RecyclerView recyclerView3 = ((a2) marketAdvancedSearchActivity.w()).f4154t.E;
                            wa.f fVar2 = marketAdvancedSearchActivity.f8685k;
                            if (fVar2 != null) {
                                recyclerView3.setAdapter(fVar2);
                                boolean morePresent = marketSearchResponseData.getStocks().getMorePresent();
                                TextView textView = ((a2) marketAdvancedSearchActivity.w()).f4154t.L;
                                if (morePresent) {
                                    i13 = 0;
                                } else {
                                    i13 = 8;
                                }
                                textView.setVisibility(i13);
                                if (stocks4 != null && (records2 = stocks4.getRecords()) != null) {
                                    marketAdvancedSearchActivity.O(records2);
                                }
                            } else {
                                Intrinsics.k("advancedSearchStocksAdapter");
                                throw null;
                            }
                        } else {
                            LinearLayout searchResultFirstDataContainer2 = ((a2) marketAdvancedSearchActivity.w()).f4154t.D;
                            Intrinsics.checkNotNullExpressionValue(searchResultFirstDataContainer2, "searchResultFirstDataContainer");
                            zq.f.M(searchResultFirstDataContainer2);
                            LinearLayout noSearchResultFirstContainer2 = ((a2) marketAdvancedSearchActivity.w()).f4154t.f5085z;
                            Intrinsics.checkNotNullExpressionValue(noSearchResultFirstContainer2, "noSearchResultFirstContainer");
                            zq.f.m0(noSearchResultFirstContainer2);
                            TextView textView2 = ((a2) marketAdvancedSearchActivity.w()).f4154t.f5084y;
                            String string10 = marketAdvancedSearchActivity.getString(R.string.text_no_search_results_stocks);
                            Intrinsics.checkNotNullExpressionValue(string10, "getString(...)");
                            String format = String.format(string10, Arrays.copyOf(new Object[]{((MarketAdvancedSearchViewModel) marketAdvancedSearchActivity.x()).f8693t}, 1));
                            Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                            textView2.setText(format);
                        }
                        if (Intrinsics.a(bool2, bool4)) {
                            LinearLayout searchResultSecondContainer5 = ((a2) marketAdvancedSearchActivity.w()).f4154t.F;
                            Intrinsics.checkNotNullExpressionValue(searchResultSecondContainer5, "searchResultSecondContainer");
                            zq.f.m0(searchResultSecondContainer5);
                            LinearLayout noSearchResultSecondContainer2 = ((a2) marketAdvancedSearchActivity.w()).f4154t.A;
                            Intrinsics.checkNotNullExpressionValue(noSearchResultSecondContainer2, "noSearchResultSecondContainer");
                            zq.f.M(noSearchResultSecondContainer2);
                            ((a2) marketAdvancedSearchActivity.w()).f4154t.G.setVisibility(0);
                            ((a2) marketAdvancedSearchActivity.w()).f4154t.f5083x.setText(marketAdvancedSearchActivity.getString(R.string.text_fno));
                            RecyclerView recyclerView4 = ((a2) marketAdvancedSearchActivity.w()).f4154t.H;
                            wa.a aVar2 = marketAdvancedSearchActivity.f8686l;
                            if (aVar2 != null) {
                                recyclerView4.setAdapter(aVar2);
                                boolean morePresent2 = marketSearchResponseData.getOptions().getMorePresent();
                                TextView textView3 = ((a2) marketAdvancedSearchActivity.w()).f4154t.M;
                                if (morePresent2) {
                                    i12 = 0;
                                } else {
                                    i12 = 8;
                                }
                                textView3.setVisibility(i12);
                                if (options4 != null && (records = options4.getRecords()) != null) {
                                    marketAdvancedSearchActivity.N(records);
                                }
                            } else {
                                Intrinsics.k("advancedSearchOptionsAdapter");
                                throw null;
                            }
                        } else {
                            LinearLayout searchResultSecondDataContainer = ((a2) marketAdvancedSearchActivity.w()).f4154t.G;
                            Intrinsics.checkNotNullExpressionValue(searchResultSecondDataContainer, "searchResultSecondDataContainer");
                            zq.f.M(searchResultSecondDataContainer);
                            LinearLayout noSearchResultSecondContainer3 = ((a2) marketAdvancedSearchActivity.w()).f4154t.A;
                            Intrinsics.checkNotNullExpressionValue(noSearchResultSecondContainer3, "noSearchResultSecondContainer");
                            zq.f.m0(noSearchResultSecondContainer3);
                            TextView textView4 = ((a2) marketAdvancedSearchActivity.w()).f4154t.K;
                            String string11 = marketAdvancedSearchActivity.getString(R.string.text_no_search_results_options);
                            Intrinsics.checkNotNullExpressionValue(string11, "getString(...)");
                            String format2 = String.format(string11, Arrays.copyOf(new Object[]{((MarketAdvancedSearchViewModel) marketAdvancedSearchActivity.x()).f8693t}, 1));
                            Intrinsics.checkNotNullExpressionValue(format2, "format(...)");
                            textView4.setText(format2);
                        }
                    }
                }
                return Unit.f23355a;
            case 3:
                String str = (String) obj;
                if (str != null && w.X(str).toString().length() != 1) {
                    marketAdvancedSearchActivity.L(str);
                }
                return Unit.f23355a;
            case 4:
                a((FnoOptionDto) obj);
                return Unit.f23355a;
            default:
                a((FnoOptionDto) obj);
                return Unit.f23355a;
        }
    }
}
