package com.assetgro.stockgro.ui.stock.cover.order;

import android.view.View;
import androidx.lifecycle.h1;
import androidx.navigation.i;
import ba.un;
import ch.c;
import com.assetgro.stockgro.data.model.ChangeDto;
import com.assetgro.stockgro.data.model.StockOrderDto;
import com.assetgro.stockgro.data.model.portfolio.holdings.Portfolio;
import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.data.remote.response.StockSellSelectOrderResponseDto;
import com.assetgro.stockgro.data.repository.StockRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.stock.cover.order.StockCoverOrderFragment;
import com.assetgro.stockgro.ui.stock.cover.order.StockCoverOrderViewModel;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import ct.a;
import ea.n0;
import eb.f;
import gd.m;
import ij.p;
import iu.a0;
import java.util.HashMap;
import ji.d;
import ji.e;
import ji.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.r;
import nt.b;
import okhttp3.HttpUrl;
import q6.l;
import qu.i0;
import xf.x;
import yk.g;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/assetgro/stockgro/ui/stock/cover/order/StockCoverOrderFragment;", "Lgd/m;", "Lcom/assetgro/stockgro/ui/stock/cover/order/StockCoverOrderViewModel;", "Lba/un;", "<init>", "()V", "yk/g", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class StockCoverOrderFragment extends m<StockCoverOrderViewModel, un> {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f10170h = 0;

    /* renamed from: g, reason: collision with root package name */
    public final i f10171g = new i(a0.a(e.class), new x(this, 4));

    @Override // gd.m
    public final int C() {
        return R.layout.fragment_stock_cover_order;
    }

    @Override // gd.m
    public final void D() {
        super.D();
        ((StockCoverOrderViewModel) r()).f10176r.observe(this, new c(27, new ji.c(this, 0)));
        StockCoverOrderViewModel stockCoverOrderViewModel = (StockCoverOrderViewModel) r();
        stockCoverOrderViewModel.f10180v.observe(this, new c(27, new ji.c(this, 1)));
        StockCoverOrderViewModel stockCoverOrderViewModel2 = (StockCoverOrderViewModel) r();
        stockCoverOrderViewModel2.f10181w.observe(this, new c(27, d.f21399b));
        ((StockCoverOrderViewModel) r()).f9084g.observe(this, new c(27, new ji.c(this, 2)));
        ((StockCoverOrderViewModel) r()).f10177s.observe(this, new c(27, new ji.c(this, 3)));
        ((StockCoverOrderViewModel) r()).f10178t.observe(this, new c(27, new ji.c(this, 4)));
        ((StockCoverOrderViewModel) r()).f10179u.observe(this, new c(27, new ji.c(this, 5)));
    }

    @Override // gd.m
    public final void E(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        StockCoverOrderViewModel stockCoverOrderViewModel = (StockCoverOrderViewModel) r();
        i iVar = this.f10171g;
        e eVar = (e) iVar.getValue();
        e eVar2 = (e) iVar.getValue();
        String portfolioId = eVar.f21402a;
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        String stockId = eVar2.f21403b;
        Intrinsics.checkNotNullParameter(stockId, "stockId");
        stockCoverOrderViewModel.f10174p = portfolioId;
        at.m<BaseResponseDto<StockSellSelectOrderResponseDto>> stockOrderInfoForPortfolio = stockCoverOrderViewModel.f10172n.getStockOrderInfoForPortfolio(portfolioId, stockId);
        final int i10 = 0;
        hi.c cVar = new hi.c(3, new h(stockCoverOrderViewModel, 0));
        stockOrderInfoForPortfolio.getClass();
        final int i11 = 1;
        nt.h c10 = new b(new b(new b(stockOrderInfoForPortfolio, cVar, 1), new hi.c(4, new h(stockCoverOrderViewModel, 1)), 2), new hi.c(5, new h(stockCoverOrderViewModel, 2)), 0).c(((kq.e) stockCoverOrderViewModel.f9079b).J());
        jt.d dVar = new jt.d(new hi.c(6, new h(stockCoverOrderViewModel, 3)), new hi.c(7, new h(stockCoverOrderViewModel, 4)));
        c10.a(dVar);
        stockCoverOrderViewModel.f9080c.c(dVar);
        un unVar = (un) q();
        unVar.f6333u.setOnInputViewAction(new f(this, 5));
        un unVar2 = (un) q();
        unVar2.A.setOnClickListener(new View.OnClickListener(this) { // from class: ji.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StockCoverOrderFragment f21392b;

            {
                this.f21392b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                p pVar;
                p pVar2;
                StockSellSelectOrderResponseDto stockSellSelectOrderResponseDto;
                Portfolio portfolio;
                int i12 = i10;
                StockCoverOrderFragment this$0 = this.f21392b;
                switch (i12) {
                    case 0:
                        int i13 = StockCoverOrderFragment.f10170h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Integer g10 = r.g(((un) this$0.q()).f6338z.getInputValue());
                        Double price = ((un) this$0.q()).f6336x.getPrice();
                        StockCoverOrderViewModel stockCoverOrderViewModel2 = (StockCoverOrderViewModel) this$0.r();
                        StockSellSelectOrderResponseDto stockSellSelectOrderResponseDto2 = (StockSellSelectOrderResponseDto) stockCoverOrderViewModel2.f10176r.getValue();
                        if (stockSellSelectOrderResponseDto2 != null) {
                            String orderType = stockCoverOrderViewModel2.f10175q;
                            int coverRemainingQuantity = stockSellSelectOrderResponseDto2.getCoverRemainingQuantity();
                            double stockPrice = stockSellSelectOrderResponseDto2.getStockPrice();
                            stockCoverOrderViewModel2.f10173o.getClass();
                            Intrinsics.checkNotNullParameter(orderType, "orderType");
                            if (g10 != null && g10.intValue() > 0) {
                                if (g10.intValue() > coverRemainingQuantity) {
                                    pVar = new p(R.string.quantity_greater_than_available, false);
                                } else {
                                    pVar = new p();
                                }
                            } else {
                                pVar = new p(R.string.quantity_too_low, false);
                            }
                            Intrinsics.checkNotNullParameter(orderType, "orderType");
                            if (price != null && price.doubleValue() > 0.0d) {
                                if (price.doubleValue() > stockPrice && Intrinsics.a(orderType, "Market")) {
                                    pVar2 = new p(R.string.price_too_high, false);
                                } else if (price.doubleValue() > stockPrice && Intrinsics.a(orderType, "Limit")) {
                                    pVar2 = new p(R.string.error_limit_greater_than_market, false);
                                } else {
                                    pVar2 = new p();
                                }
                            } else {
                                pVar2 = new p(R.string.price_too_low, false);
                            }
                            stockCoverOrderViewModel2.f10178t.setValue(new g(pVar, pVar2));
                            if (pVar.f20086a && pVar2.f20086a && (stockSellSelectOrderResponseDto = (StockSellSelectOrderResponseDto) ((StockCoverOrderViewModel) this$0.r()).f10176r.getValue()) != null && (portfolio = (Portfolio) ((StockCoverOrderViewModel) this$0.r()).f10180v.getValue()) != null) {
                                StockOrderDto stockOrder = new StockOrderDto();
                                stockOrder.setStockName(stockSellSelectOrderResponseDto.getStockName());
                                stockOrder.setStockCode(((e) this$0.f10171g.getValue()).f21403b);
                                stockOrder.setQuantity(((un) this$0.q()).f6338z.getInputValue());
                                stockOrder.setExecutionPrice(((un) this$0.q()).f6336x.getPrice());
                                stockOrder.setOrderType(((un) this$0.q()).f6333u.getInputValue());
                                stockOrder.setStockImageUrl(stockSellSelectOrderResponseDto.getStockImage());
                                String portfolioName = portfolio.getPortfolioName();
                                String portfolioId2 = portfolio.getPortfolioId();
                                double portfolioValue = portfolio.getPortfolioValue();
                                double cashBalance = portfolio.getCashBalance();
                                double investedAmount = portfolio.getInvestedAmount();
                                HashMap hashMap = new HashMap();
                                ChangeDto totalReturns = portfolio.getTotalReturns();
                                String leagueName = portfolio.getLeagueName();
                                int numberOfStocks = portfolio.getNumberOfStocks();
                                String portfolioStatus = portfolio.getPortfolioStatus();
                                if (portfolioStatus == null) {
                                    portfolioStatus = HttpUrl.FRAGMENT_ENCODE_SET;
                                }
                                stockOrder.setPortfolioDropDownInfoDto(new Portfolio(investedAmount, 0.0d, 0.0d, 0.0d, totalReturns, hashMap, cashBalance, 0.0d, 0.0d, 0.0d, portfolioValue, portfolioId2, portfolioName, portfolioStatus, numberOfStocks, leagueName, HttpUrl.FRAGMENT_ENCODE_SET, null, HttpUrl.FRAGMENT_ENCODE_SET, false, 524288, null));
                                Intrinsics.checkNotNullParameter(stockOrder, "stockOrder");
                                l.h(this$0).o(new f(stockOrder));
                                return;
                            }
                            return;
                        }
                        throw new IllegalStateException("Can not perform validation without stock order info".toString());
                    default:
                        int i14 = StockCoverOrderFragment.f10170h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.requireActivity().finish();
                        return;
                }
            }
        });
        un unVar3 = (un) q();
        unVar3.C.setNavigationOnClickListener(new View.OnClickListener(this) { // from class: ji.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StockCoverOrderFragment f21392b;

            {
                this.f21392b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                p pVar;
                p pVar2;
                StockSellSelectOrderResponseDto stockSellSelectOrderResponseDto;
                Portfolio portfolio;
                int i12 = i11;
                StockCoverOrderFragment this$0 = this.f21392b;
                switch (i12) {
                    case 0:
                        int i13 = StockCoverOrderFragment.f10170h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Integer g10 = r.g(((un) this$0.q()).f6338z.getInputValue());
                        Double price = ((un) this$0.q()).f6336x.getPrice();
                        StockCoverOrderViewModel stockCoverOrderViewModel2 = (StockCoverOrderViewModel) this$0.r();
                        StockSellSelectOrderResponseDto stockSellSelectOrderResponseDto2 = (StockSellSelectOrderResponseDto) stockCoverOrderViewModel2.f10176r.getValue();
                        if (stockSellSelectOrderResponseDto2 != null) {
                            String orderType = stockCoverOrderViewModel2.f10175q;
                            int coverRemainingQuantity = stockSellSelectOrderResponseDto2.getCoverRemainingQuantity();
                            double stockPrice = stockSellSelectOrderResponseDto2.getStockPrice();
                            stockCoverOrderViewModel2.f10173o.getClass();
                            Intrinsics.checkNotNullParameter(orderType, "orderType");
                            if (g10 != null && g10.intValue() > 0) {
                                if (g10.intValue() > coverRemainingQuantity) {
                                    pVar = new p(R.string.quantity_greater_than_available, false);
                                } else {
                                    pVar = new p();
                                }
                            } else {
                                pVar = new p(R.string.quantity_too_low, false);
                            }
                            Intrinsics.checkNotNullParameter(orderType, "orderType");
                            if (price != null && price.doubleValue() > 0.0d) {
                                if (price.doubleValue() > stockPrice && Intrinsics.a(orderType, "Market")) {
                                    pVar2 = new p(R.string.price_too_high, false);
                                } else if (price.doubleValue() > stockPrice && Intrinsics.a(orderType, "Limit")) {
                                    pVar2 = new p(R.string.error_limit_greater_than_market, false);
                                } else {
                                    pVar2 = new p();
                                }
                            } else {
                                pVar2 = new p(R.string.price_too_low, false);
                            }
                            stockCoverOrderViewModel2.f10178t.setValue(new g(pVar, pVar2));
                            if (pVar.f20086a && pVar2.f20086a && (stockSellSelectOrderResponseDto = (StockSellSelectOrderResponseDto) ((StockCoverOrderViewModel) this$0.r()).f10176r.getValue()) != null && (portfolio = (Portfolio) ((StockCoverOrderViewModel) this$0.r()).f10180v.getValue()) != null) {
                                StockOrderDto stockOrder = new StockOrderDto();
                                stockOrder.setStockName(stockSellSelectOrderResponseDto.getStockName());
                                stockOrder.setStockCode(((e) this$0.f10171g.getValue()).f21403b);
                                stockOrder.setQuantity(((un) this$0.q()).f6338z.getInputValue());
                                stockOrder.setExecutionPrice(((un) this$0.q()).f6336x.getPrice());
                                stockOrder.setOrderType(((un) this$0.q()).f6333u.getInputValue());
                                stockOrder.setStockImageUrl(stockSellSelectOrderResponseDto.getStockImage());
                                String portfolioName = portfolio.getPortfolioName();
                                String portfolioId2 = portfolio.getPortfolioId();
                                double portfolioValue = portfolio.getPortfolioValue();
                                double cashBalance = portfolio.getCashBalance();
                                double investedAmount = portfolio.getInvestedAmount();
                                HashMap hashMap = new HashMap();
                                ChangeDto totalReturns = portfolio.getTotalReturns();
                                String leagueName = portfolio.getLeagueName();
                                int numberOfStocks = portfolio.getNumberOfStocks();
                                String portfolioStatus = portfolio.getPortfolioStatus();
                                if (portfolioStatus == null) {
                                    portfolioStatus = HttpUrl.FRAGMENT_ENCODE_SET;
                                }
                                stockOrder.setPortfolioDropDownInfoDto(new Portfolio(investedAmount, 0.0d, 0.0d, 0.0d, totalReturns, hashMap, cashBalance, 0.0d, 0.0d, 0.0d, portfolioValue, portfolioId2, portfolioName, portfolioStatus, numberOfStocks, leagueName, HttpUrl.FRAGMENT_ENCODE_SET, null, HttpUrl.FRAGMENT_ENCODE_SET, false, 524288, null));
                                Intrinsics.checkNotNullParameter(stockOrder, "stockOrder");
                                l.h(this$0).o(new f(stockOrder));
                                return;
                            }
                            return;
                        }
                        throw new IllegalStateException("Can not perform validation without stock order info".toString());
                    default:
                        int i14 = StockCoverOrderFragment.f10170h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.requireActivity().finish();
                        return;
                }
            }
        });
    }

    @Override // gd.m
    public final void w(da.f fragmentComponent) {
        Intrinsics.checkNotNullParameter(fragmentComponent, "fragmentComponent");
        da.b bVar = fragmentComponent.f14279b;
        kq.e k10 = bVar.k();
        a c10 = bVar.c();
        StockRepository stockRepository = bVar.l();
        g.i(stockRepository);
        Object stockCoverOrderValidator = new Object();
        UserRepository userRepository = bVar.m();
        g.i(userRepository);
        n0 n0Var = fragmentComponent.f14278a;
        com.google.android.gms.internal.p002firebaseauthapi.a.s(n0Var, k10, "schedulerProvider", c10, "compositeDisposable");
        Intrinsics.checkNotNullParameter(stockRepository, "stockRepository");
        Intrinsics.checkNotNullParameter(stockCoverOrderValidator, "stockCoverOrderValidator");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        ca.c factory = new ca.c(a0.a(StockCoverOrderViewModel.class), new z2.e(k10, c10, stockRepository, stockCoverOrderValidator, userRepository, 4));
        m mVar = n0Var.f15238a;
        h1 e10 = com.google.android.gms.internal.p002firebaseauthapi.a.e(mVar, "owner", factory, "factory");
        y4.c defaultCreationExtras = com.google.android.gms.internal.p002firebaseauthapi.a.o(mVar, "owner", e10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h10 = com.google.android.gms.internal.p002firebaseauthapi.a.h(e10, factory, defaultCreationExtras, StockCoverOrderViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(StockCoverOrderViewModel.class, "<this>", StockCoverOrderViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            StockCoverOrderViewModel stockCoverOrderViewModel = (StockCoverOrderViewModel) h10.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            g.j(stockCoverOrderViewModel);
            this.f17284b = stockCoverOrderViewModel;
            FirebaseAnalytics d10 = bVar.d();
            g.i(d10);
            this.f17285c = d10;
            Analytics o10 = bVar.o();
            g.i(o10);
            this.f17286d = o10;
            ls.n0 h11 = bVar.h();
            g.i(h11);
            this.f17287e = h11;
            return;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
    }
}
