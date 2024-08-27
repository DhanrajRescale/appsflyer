package com.assetgro.stockgro.ui.stock.sell;

import android.view.View;
import androidx.lifecycle.h1;
import androidx.navigation.i;
import ba.to;
import com.assetgro.stockgro.data.model.ChangeDto;
import com.assetgro.stockgro.data.model.StockOrderDto;
import com.assetgro.stockgro.data.model.portfolio.holdings.Portfolio;
import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.data.remote.response.StockSellSelectOrderResponseDto;
import com.assetgro.stockgro.data.repository.StockRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.stock.sell.StockSellFragment;
import com.assetgro.stockgro.ui.stock.sell.StockSellViewModel;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import ea.n0;
import eb.f;
import gd.m;
import ij.p;
import iu.a0;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.r;
import kq.e;
import li.c;
import nt.h;
import okhttp3.HttpUrl;
import qu.i0;
import ui.a;
import vi.b;
import vi.d;
import xf.x;
import yk.g;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/assetgro/stockgro/ui/stock/sell/StockSellFragment;", "Lgd/m;", "Lcom/assetgro/stockgro/ui/stock/sell/StockSellViewModel;", "Lba/to;", "<init>", "()V", "ni/g", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class StockSellFragment extends m<StockSellViewModel, to> {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f10392h = 0;

    /* renamed from: g, reason: collision with root package name */
    public final i f10393g = new i(a0.a(d.class), new x(this, 11));

    @Override // gd.m
    public final int C() {
        return R.layout.fragment_stock_sell;
    }

    @Override // gd.m
    public final void D() {
        super.D();
        ((StockSellViewModel) r()).f10402r.observe(this, new c(24, new b(this, 0)));
        StockSellViewModel stockSellViewModel = (StockSellViewModel) r();
        stockSellViewModel.f10406v.observe(this, new c(24, new b(this, 1)));
        StockSellViewModel stockSellViewModel2 = (StockSellViewModel) r();
        stockSellViewModel2.f10407w.observe(this, new c(24, vi.c.f38087b));
        ((StockSellViewModel) r()).f9084g.observe(this, new c(24, new b(this, 2)));
        ((StockSellViewModel) r()).f10403s.observe(this, new c(24, new b(this, 3)));
        ((StockSellViewModel) r()).f10404t.observe(this, new c(24, new b(this, 4)));
        ((StockSellViewModel) r()).f10405u.observe(this, new c(24, new b(this, 5)));
    }

    @Override // gd.m
    public final void E(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        StockSellViewModel stockSellViewModel = (StockSellViewModel) r();
        i iVar = this.f10393g;
        d dVar = (d) iVar.getValue();
        d dVar2 = (d) iVar.getValue();
        String portfolioId = dVar.f38090a;
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        String stockId = dVar2.f38091b;
        Intrinsics.checkNotNullParameter(stockId, "stockId");
        stockSellViewModel.f10400p = portfolioId;
        at.m<BaseResponseDto<StockSellSelectOrderResponseDto>> stockOrderInfoForPortfolio = stockSellViewModel.f10398n.getStockOrderInfoForPortfolio(portfolioId, stockId);
        final int i10 = 0;
        a aVar = new a(10, new vi.m(stockSellViewModel, 0));
        stockOrderInfoForPortfolio.getClass();
        final int i11 = 1;
        h c10 = new nt.b(new nt.b(new nt.b(stockOrderInfoForPortfolio, aVar, 1), new a(11, new vi.m(stockSellViewModel, 1)), 2), new a(12, new vi.m(stockSellViewModel, 2)), 0).c(((e) stockSellViewModel.f9079b).J());
        jt.d dVar3 = new jt.d(new a(13, new vi.m(stockSellViewModel, 3)), new a(14, new vi.m(stockSellViewModel, 4)));
        c10.a(dVar3);
        stockSellViewModel.f9080c.c(dVar3);
        to toVar = (to) q();
        toVar.f6213t.setOnInputViewAction(new f(this, 8));
        to toVar2 = (to) q();
        toVar2.f6219z.setOnClickListener(new View.OnClickListener(this) { // from class: vi.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StockSellFragment f38084b;

            {
                this.f38084b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                p pVar;
                StockSellSelectOrderResponseDto stockSellSelectOrderResponseDto;
                Portfolio portfolio;
                int i12 = i10;
                StockSellFragment this$0 = this.f38084b;
                switch (i12) {
                    case 0:
                        int i13 = StockSellFragment.f10392h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Integer g10 = r.g(((to) this$0.q()).f6218y.getInputValue());
                        Double price = ((to) this$0.q()).f6216w.getPrice();
                        StockSellViewModel stockSellViewModel2 = (StockSellViewModel) this$0.r();
                        StockSellSelectOrderResponseDto stockSellSelectOrderResponseDto2 = (StockSellSelectOrderResponseDto) stockSellViewModel2.f10402r.getValue();
                        if (stockSellSelectOrderResponseDto2 != null) {
                            String orderType = stockSellViewModel2.f10401q;
                            int remainingQuantity = stockSellSelectOrderResponseDto2.getRemainingQuantity();
                            double stockPrice = stockSellSelectOrderResponseDto2.getStockPrice();
                            stockSellViewModel2.f10399o.getClass();
                            Intrinsics.checkNotNullParameter(orderType, "orderType");
                            if (g10 != null && g10.intValue() > 0) {
                                if (g10.intValue() > remainingQuantity) {
                                    pVar = new p(R.string.quantity_greater_than_available, false);
                                } else {
                                    pVar = new p();
                                }
                            } else {
                                pVar = new p(R.string.quantity_too_low, false);
                            }
                            p G = mt.p.G(price, stockPrice, orderType);
                            stockSellViewModel2.f10404t.setValue(new l(pVar, G));
                            if (pVar.f20086a && G.f20086a && (stockSellSelectOrderResponseDto = (StockSellSelectOrderResponseDto) ((StockSellViewModel) this$0.r()).f10402r.getValue()) != null && (portfolio = (Portfolio) ((StockSellViewModel) this$0.r()).f10406v.getValue()) != null) {
                                StockOrderDto stockOrder = new StockOrderDto();
                                stockOrder.setStockName(stockSellSelectOrderResponseDto.getStockName());
                                stockOrder.setStockCode(((d) this$0.f10393g.getValue()).f38091b);
                                stockOrder.setQuantity(((to) this$0.q()).f6218y.getInputValue());
                                stockOrder.setExecutionPrice(((to) this$0.q()).f6216w.getPrice());
                                stockOrder.setOrderType(((to) this$0.q()).f6213t.getInputValue());
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
                                q6.l.h(this$0).o(new e(stockOrder));
                                return;
                            }
                            return;
                        }
                        throw new IllegalStateException("Can not perform validation without stock order info".toString());
                    default:
                        int i14 = StockSellFragment.f10392h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.requireActivity().finish();
                        return;
                }
            }
        });
        to toVar3 = (to) q();
        toVar3.B.setNavigationOnClickListener(new View.OnClickListener(this) { // from class: vi.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StockSellFragment f38084b;

            {
                this.f38084b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                p pVar;
                StockSellSelectOrderResponseDto stockSellSelectOrderResponseDto;
                Portfolio portfolio;
                int i12 = i11;
                StockSellFragment this$0 = this.f38084b;
                switch (i12) {
                    case 0:
                        int i13 = StockSellFragment.f10392h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Integer g10 = r.g(((to) this$0.q()).f6218y.getInputValue());
                        Double price = ((to) this$0.q()).f6216w.getPrice();
                        StockSellViewModel stockSellViewModel2 = (StockSellViewModel) this$0.r();
                        StockSellSelectOrderResponseDto stockSellSelectOrderResponseDto2 = (StockSellSelectOrderResponseDto) stockSellViewModel2.f10402r.getValue();
                        if (stockSellSelectOrderResponseDto2 != null) {
                            String orderType = stockSellViewModel2.f10401q;
                            int remainingQuantity = stockSellSelectOrderResponseDto2.getRemainingQuantity();
                            double stockPrice = stockSellSelectOrderResponseDto2.getStockPrice();
                            stockSellViewModel2.f10399o.getClass();
                            Intrinsics.checkNotNullParameter(orderType, "orderType");
                            if (g10 != null && g10.intValue() > 0) {
                                if (g10.intValue() > remainingQuantity) {
                                    pVar = new p(R.string.quantity_greater_than_available, false);
                                } else {
                                    pVar = new p();
                                }
                            } else {
                                pVar = new p(R.string.quantity_too_low, false);
                            }
                            p G = mt.p.G(price, stockPrice, orderType);
                            stockSellViewModel2.f10404t.setValue(new l(pVar, G));
                            if (pVar.f20086a && G.f20086a && (stockSellSelectOrderResponseDto = (StockSellSelectOrderResponseDto) ((StockSellViewModel) this$0.r()).f10402r.getValue()) != null && (portfolio = (Portfolio) ((StockSellViewModel) this$0.r()).f10406v.getValue()) != null) {
                                StockOrderDto stockOrder = new StockOrderDto();
                                stockOrder.setStockName(stockSellSelectOrderResponseDto.getStockName());
                                stockOrder.setStockCode(((d) this$0.f10393g.getValue()).f38091b);
                                stockOrder.setQuantity(((to) this$0.q()).f6218y.getInputValue());
                                stockOrder.setExecutionPrice(((to) this$0.q()).f6216w.getPrice());
                                stockOrder.setOrderType(((to) this$0.q()).f6213t.getInputValue());
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
                                q6.l.h(this$0).o(new e(stockOrder));
                                return;
                            }
                            return;
                        }
                        throw new IllegalStateException("Can not perform validation without stock order info".toString());
                    default:
                        int i14 = StockSellFragment.f10392h;
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
        e k10 = bVar.k();
        ct.a c10 = bVar.c();
        StockRepository stockRepository = bVar.l();
        g.i(stockRepository);
        Object stockSellOrderValidator = new Object();
        UserRepository userRepository = bVar.m();
        g.i(userRepository);
        n0 n0Var = fragmentComponent.f14278a;
        com.google.android.gms.internal.p002firebaseauthapi.a.s(n0Var, k10, "schedulerProvider", c10, "compositeDisposable");
        Intrinsics.checkNotNullParameter(stockRepository, "stockRepository");
        Intrinsics.checkNotNullParameter(stockSellOrderValidator, "stockSellOrderValidator");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        ca.c factory = new ca.c(a0.a(StockSellViewModel.class), new z2.e(k10, c10, stockRepository, stockSellOrderValidator, userRepository, 6));
        m mVar = n0Var.f15238a;
        h1 e10 = com.google.android.gms.internal.p002firebaseauthapi.a.e(mVar, "owner", factory, "factory");
        y4.c defaultCreationExtras = com.google.android.gms.internal.p002firebaseauthapi.a.o(mVar, "owner", e10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h10 = com.google.android.gms.internal.p002firebaseauthapi.a.h(e10, factory, defaultCreationExtras, StockSellViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(StockSellViewModel.class, "<this>", StockSellViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            StockSellViewModel stockSellViewModel = (StockSellViewModel) h10.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            g.j(stockSellViewModel);
            this.f17284b = stockSellViewModel;
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
