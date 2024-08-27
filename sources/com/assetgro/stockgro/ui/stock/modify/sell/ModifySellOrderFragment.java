package com.assetgro.stockgro.ui.stock.modify.sell;

import android.view.View;
import androidx.lifecycle.h1;
import androidx.navigation.i;
import ba.to;
import com.assetgro.stockgro.data.model.StockDetailDto;
import com.assetgro.stockgro.data.model.StockModifyInfoDto;
import com.assetgro.stockgro.data.model.portfolio.holdings.Portfolio;
import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.data.remote.response.StockSellSelectOrderResponseDto;
import com.assetgro.stockgro.data.repository.PortfolioRepository;
import com.assetgro.stockgro.data.repository.StockRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.stock.detail.StockSharedViewModel;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import ct.a;
import ea.n0;
import gd.m;
import iu.a0;
import java.util.List;
import jt.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kq.e;
import nt.b;
import nt.f;
import nt.h;
import okhttp3.HttpUrl;
import qu.i0;
import si.c;
import si.g;
import x.i1;
import xf.x;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/assetgro/stockgro/ui/stock/modify/sell/ModifySellOrderFragment;", "Lgd/m;", "Lcom/assetgro/stockgro/ui/stock/modify/sell/ModifyStockSellViewModel;", "Lba/to;", "<init>", "()V", "mt/p", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class ModifySellOrderFragment extends m<ModifyStockSellViewModel, to> {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f10332i = 0;

    /* renamed from: g, reason: collision with root package name */
    public StockSharedViewModel f10333g;

    /* renamed from: h, reason: collision with root package name */
    public final i f10334h = new i(a0.a(c.class), new x(this, 9));

    @Override // gd.m
    public final int C() {
        return R.layout.fragment_stock_sell;
    }

    @Override // gd.m
    public final void D() {
        super.D();
        ModifyStockSellViewModel modifyStockSellViewModel = (ModifyStockSellViewModel) r();
        String portfolioId = H().f34643a;
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        at.m<BaseResponseDto<List<Portfolio>>> userPortfolios = modifyStockSellViewModel.f10335n.getUserPortfolios(HttpUrl.FRAGMENT_ENCODE_SET);
        ri.m mVar = new ri.m(24, new i1(portfolioId, 7));
        userPortfolios.getClass();
        b bVar = new b(new b(new b(new f(userPortfolios, mVar, 1), new ri.m(25, new g(modifyStockSellViewModel, 6)), 1), new ri.m(26, new g(modifyStockSellViewModel, 7)), 2), new ri.m(27, new g(modifyStockSellViewModel, 8)), 0);
        e eVar = (e) modifyStockSellViewModel.f9079b;
        h c10 = bVar.c(eVar.J());
        d dVar = new d(new ri.m(28, new g(modifyStockSellViewModel, 9)), new ri.m(29, new g(modifyStockSellViewModel, 10)));
        c10.a(dVar);
        Intrinsics.checkNotNullExpressionValue(dVar, "subscribe(...)");
        a aVar = modifyStockSellViewModel.f9080c;
        aVar.c(dVar);
        String stockId = H().f34644b;
        Intrinsics.checkNotNullParameter(stockId, "stockId");
        StockRepository stockRepository = modifyStockSellViewModel.f10336o;
        at.m<BaseResponseDto<StockDetailDto>> stockDetails = stockRepository.getStockDetails(stockId);
        ri.m mVar2 = new ri.m(18, si.b.f34639e);
        stockDetails.getClass();
        h c11 = new b(new b(new b(new f(stockDetails, mVar2, 1), new ri.m(19, new g(modifyStockSellViewModel, 11)), 1), new ri.m(20, new g(modifyStockSellViewModel, 12)), 2), new ri.m(21, new g(modifyStockSellViewModel, 13)), 0).c(eVar.J());
        d dVar2 = new d(new ri.m(22, new g(modifyStockSellViewModel, 14)), new ri.m(23, new g(modifyStockSellViewModel, 15)));
        c11.a(dVar2);
        Intrinsics.checkNotNullExpressionValue(dVar2, "subscribe(...)");
        aVar.c(dVar2);
        String portfolioId2 = H().f34643a;
        String stockId2 = H().f34644b;
        Intrinsics.checkNotNullParameter(portfolioId2, "portfolioId");
        Intrinsics.checkNotNullParameter(stockId2, "stockId");
        at.m<BaseResponseDto<StockSellSelectOrderResponseDto>> stockOrderInfoForPortfolio = stockRepository.getStockOrderInfoForPortfolio(portfolioId2, stockId2);
        si.f fVar = new si.f(0, si.b.f34640f);
        stockOrderInfoForPortfolio.getClass();
        h c12 = new b(new b(new b(new f(stockOrderInfoForPortfolio, fVar, 1), new si.f(1, new g(modifyStockSellViewModel, 16)), 1), new si.f(2, new g(modifyStockSellViewModel, 17)), 2), new si.f(3, new g(modifyStockSellViewModel, 18)), 0).c(eVar.J());
        d dVar3 = new d(new si.f(4, new g(modifyStockSellViewModel, 19)), new si.f(5, new g(modifyStockSellViewModel, 20)));
        c12.a(dVar3);
        Intrinsics.checkNotNullExpressionValue(dVar3, "subscribe(...)");
        aVar.c(dVar3);
        ((ModifyStockSellViewModel) r()).f10338q.observe(this, new li.c(17, new si.a(this, 1)));
        ((ModifyStockSellViewModel) r()).f10340s.observe(this, new li.c(17, new si.a(this, 2)));
        ((ModifyStockSellViewModel) r()).f10339r.observe(this, new li.c(17, si.b.f34636b));
        ModifyStockSellViewModel modifyStockSellViewModel2 = (ModifyStockSellViewModel) r();
        modifyStockSellViewModel2.f10347z.observe(this, new li.c(17, new si.a(this, 3)));
        ((ModifyStockSellViewModel) r()).f10341t.observe(this, new li.c(17, new si.a(this, 4)));
        ((ModifyStockSellViewModel) r()).f10342u.observe(this, new li.c(17, new si.a(this, 5)));
        ((ModifyStockSellViewModel) r()).f10343v.observe(this, new li.c(17, new si.a(this, 6)));
        ModifyStockSellViewModel modifyStockSellViewModel3 = (ModifyStockSellViewModel) r();
        modifyStockSellViewModel3.A.observe(this, new li.c(17, new si.a(this, 7)));
        ((ModifyStockSellViewModel) r()).f10346y.observe(this, new li.c(17, new si.a(this, 0)));
    }

    @Override // gd.m
    public final void E(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        String stockId = requireArguments().getString("STOCK_NAME");
        if (stockId == null) {
            StockSharedViewModel stockSharedViewModel = this.f10333g;
            if (stockSharedViewModel != null) {
                stockId = stockSharedViewModel.f10202s;
                if (stockId == null) {
                    throw new IllegalStateException("StockID not supplied as an argument".toString());
                }
            } else {
                Intrinsics.k("stockSharedViewModel");
                throw null;
            }
        }
        String orderType = requireArguments().getString("ORDER_TYPE");
        if (orderType == null) {
            StockSharedViewModel stockSharedViewModel2 = this.f10333g;
            if (stockSharedViewModel2 != null) {
                orderType = stockSharedViewModel2.f10204u;
                if (orderType == null) {
                    throw new IllegalStateException("OrderType not supplied as an argument".toString());
                }
            } else {
                Intrinsics.k("stockSharedViewModel");
                throw null;
            }
        }
        String orderId = requireArguments().getString("ORDERID");
        if (orderId == null) {
            StockSharedViewModel stockSharedViewModel3 = this.f10333g;
            if (stockSharedViewModel3 != null) {
                orderId = stockSharedViewModel3.f10203t;
                if (orderId == null) {
                    throw new IllegalStateException("OrderID not supplied as an argument".toString());
                }
            } else {
                Intrinsics.k("stockSharedViewModel");
                throw null;
            }
        }
        ModifyStockSellViewModel modifyStockSellViewModel = (ModifyStockSellViewModel) r();
        String portfolioId = H().f34643a;
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        Intrinsics.checkNotNullParameter(stockId, "stockId");
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        at.m<BaseResponseDto<StockModifyInfoDto>> orderDetails = modifyStockSellViewModel.f10336o.getOrderDetails(portfolioId, stockId, orderType, orderId);
        si.f fVar = new si.f(6, si.b.f34638d);
        orderDetails.getClass();
        h c10 = new b(new b(new b(new f(orderDetails, fVar, 1), new si.f(7, new g(modifyStockSellViewModel, 1)), 1), new si.f(8, new g(modifyStockSellViewModel, 2)), 2), new si.f(9, new g(modifyStockSellViewModel, 3)), 0).c(((e) modifyStockSellViewModel.f9079b).J());
        d dVar = new d(new si.f(10, new g(modifyStockSellViewModel, 4)), new si.f(11, new g(modifyStockSellViewModel, 5)));
        c10.a(dVar);
        Intrinsics.checkNotNullExpressionValue(dVar, "subscribe(...)");
        modifyStockSellViewModel.f9080c.c(dVar);
        to toVar = (to) q();
        toVar.f6213t.setOnInputViewAction(new eb.f(this, 7));
        to toVar2 = (to) q();
        toVar2.f6219z.setOnClickListener(new bb.a(25, this, orderId));
        to toVar3 = (to) q();
        toVar3.B.setNavigationOnClickListener(new ph.a(this, 9));
        requireActivity().getOnBackPressedDispatcher().a(this, new androidx.activity.x(this, 10));
    }

    public final c H() {
        return (c) this.f10334h.getValue();
    }

    @Override // gd.m
    public final void w(da.f fragmentComponent) {
        Intrinsics.checkNotNullParameter(fragmentComponent, "fragmentComponent");
        da.b bVar = fragmentComponent.f14279b;
        e k10 = bVar.k();
        a c10 = bVar.c();
        StockRepository stocksRepository = bVar.l();
        yk.g.i(stocksRepository);
        PortfolioRepository portfolioRepository = bVar.j();
        yk.g.i(portfolioRepository);
        Object orderValidator = new Object();
        UserRepository userRepository = bVar.m();
        yk.g.i(userRepository);
        n0 n0Var = fragmentComponent.f14278a;
        com.google.android.gms.internal.p002firebaseauthapi.a.s(n0Var, k10, "schedulerProvider", c10, "compositeDisposable");
        Intrinsics.checkNotNullParameter(stocksRepository, "stocksRepository");
        Intrinsics.checkNotNullParameter(portfolioRepository, "portfolioRepository");
        Intrinsics.checkNotNullParameter(orderValidator, "orderValidator");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        ca.c factory = new ca.c(a0.a(ModifyStockSellViewModel.class), new d1.b(k10, c10, portfolioRepository, stocksRepository, orderValidator, userRepository, 7));
        m mVar = n0Var.f15238a;
        h1 e10 = com.google.android.gms.internal.p002firebaseauthapi.a.e(mVar, "owner", factory, "factory");
        y4.c defaultCreationExtras = com.google.android.gms.internal.p002firebaseauthapi.a.o(mVar, "owner", e10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h10 = com.google.android.gms.internal.p002firebaseauthapi.a.h(e10, factory, defaultCreationExtras, ModifyStockSellViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(ModifyStockSellViewModel.class, "<this>", ModifyStockSellViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            ModifyStockSellViewModel modifyStockSellViewModel = (ModifyStockSellViewModel) h10.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            yk.g.j(modifyStockSellViewModel);
            this.f17284b = modifyStockSellViewModel;
            FirebaseAnalytics d10 = bVar.d();
            yk.g.i(d10);
            this.f17285c = d10;
            Analytics o10 = bVar.o();
            yk.g.i(o10);
            this.f17286d = o10;
            ls.n0 h11 = bVar.h();
            yk.g.i(h11);
            this.f17287e = h11;
            this.f10333g = fragmentComponent.l();
            return;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
    }
}
