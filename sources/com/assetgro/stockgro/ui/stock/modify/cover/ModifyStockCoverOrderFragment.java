package com.assetgro.stockgro.ui.stock.modify.cover;

import android.view.View;
import androidx.lifecycle.h1;
import androidx.navigation.i;
import ba.zk;
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
import li.c;
import ni.q;
import nt.b;
import nt.f;
import nt.h;
import okhttp3.HttpUrl;
import qu.i0;
import ri.g;
import ri.n;
import x.i1;
import xf.x;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/assetgro/stockgro/ui/stock/modify/cover/ModifyStockCoverOrderFragment;", "Lgd/m;", "Lcom/assetgro/stockgro/ui/stock/modify/cover/ModifyStockCoverOrderViewModel;", "Lba/zk;", "<init>", "()V", "mt/p", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class ModifyStockCoverOrderFragment extends m<ModifyStockCoverOrderViewModel, zk> {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f10316i = 0;

    /* renamed from: g, reason: collision with root package name */
    public StockSharedViewModel f10317g;

    /* renamed from: h, reason: collision with root package name */
    public final i f10318h = new i(a0.a(ri.i.class), new x(this, 8));

    @Override // gd.m
    public final int C() {
        return R.layout.fragment_modify_stock_cover_order;
    }

    @Override // gd.m
    public final void D() {
        super.D();
        ModifyStockCoverOrderViewModel modifyStockCoverOrderViewModel = (ModifyStockCoverOrderViewModel) r();
        String portfolioId = H().f33775a;
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        at.m<BaseResponseDto<List<Portfolio>>> userPortfolios = modifyStockCoverOrderViewModel.f10319n.getUserPortfolios(HttpUrl.FRAGMENT_ENCODE_SET);
        q qVar = new q(24, new i1(portfolioId, 6));
        userPortfolios.getClass();
        b bVar = new b(new b(new b(new f(userPortfolios, qVar, 1), new q(25, new n(modifyStockCoverOrderViewModel, 6)), 1), new q(26, new n(modifyStockCoverOrderViewModel, 7)), 2), new q(27, new n(modifyStockCoverOrderViewModel, 8)), 0);
        e eVar = (e) modifyStockCoverOrderViewModel.f9079b;
        h c10 = bVar.c(eVar.J());
        d dVar = new d(new q(28, new n(modifyStockCoverOrderViewModel, 9)), new q(29, new n(modifyStockCoverOrderViewModel, 10)));
        c10.a(dVar);
        Intrinsics.checkNotNullExpressionValue(dVar, "subscribe(...)");
        a aVar = modifyStockCoverOrderViewModel.f9080c;
        aVar.c(dVar);
        String stockId = H().f33776b;
        Intrinsics.checkNotNullParameter(stockId, "stockId");
        StockRepository stockRepository = modifyStockCoverOrderViewModel.f10320o;
        at.m<BaseResponseDto<StockDetailDto>> stockDetails = stockRepository.getStockDetails(stockId);
        ri.m mVar = new ri.m(6, ri.h.f33771e);
        stockDetails.getClass();
        h c11 = new b(new b(new b(new f(stockDetails, mVar, 1), new ri.m(7, new n(modifyStockCoverOrderViewModel, 11)), 1), new ri.m(8, new n(modifyStockCoverOrderViewModel, 12)), 2), new ri.m(9, new n(modifyStockCoverOrderViewModel, 13)), 0).c(eVar.J());
        d dVar2 = new d(new ri.m(10, new n(modifyStockCoverOrderViewModel, 14)), new ri.m(11, new n(modifyStockCoverOrderViewModel, 15)));
        c11.a(dVar2);
        Intrinsics.checkNotNullExpressionValue(dVar2, "subscribe(...)");
        aVar.c(dVar2);
        String portfolioId2 = H().f33775a;
        String stockId2 = H().f33776b;
        Intrinsics.checkNotNullParameter(portfolioId2, "portfolioId");
        Intrinsics.checkNotNullParameter(stockId2, "stockId");
        at.m<BaseResponseDto<StockSellSelectOrderResponseDto>> stockOrderInfoForPortfolio = stockRepository.getStockOrderInfoForPortfolio(portfolioId2, stockId2);
        ri.m mVar2 = new ri.m(0, ri.h.f33772f);
        stockOrderInfoForPortfolio.getClass();
        h c12 = new b(new b(new b(new f(stockOrderInfoForPortfolio, mVar2, 1), new ri.m(1, new n(modifyStockCoverOrderViewModel, 16)), 1), new ri.m(2, new n(modifyStockCoverOrderViewModel, 17)), 2), new ri.m(3, new n(modifyStockCoverOrderViewModel, 18)), 0).c(eVar.J());
        d dVar3 = new d(new ri.m(4, new n(modifyStockCoverOrderViewModel, 19)), new ri.m(5, new n(modifyStockCoverOrderViewModel, 20)));
        c12.a(dVar3);
        Intrinsics.checkNotNullExpressionValue(dVar3, "subscribe(...)");
        aVar.c(dVar3);
        ((ModifyStockCoverOrderViewModel) r()).f10322q.observe(this, new c(16, new g(this, 1)));
        ((ModifyStockCoverOrderViewModel) r()).f10324s.observe(this, new c(16, new g(this, 2)));
        ((ModifyStockCoverOrderViewModel) r()).f10323r.observe(this, new c(16, ri.h.f33768b));
        ModifyStockCoverOrderViewModel modifyStockCoverOrderViewModel2 = (ModifyStockCoverOrderViewModel) r();
        modifyStockCoverOrderViewModel2.f10331z.observe(this, new c(16, new g(this, 3)));
        ((ModifyStockCoverOrderViewModel) r()).f10325t.observe(this, new c(16, new g(this, 4)));
        ((ModifyStockCoverOrderViewModel) r()).f10326u.observe(this, new c(16, new g(this, 5)));
        ((ModifyStockCoverOrderViewModel) r()).f10327v.observe(this, new c(16, new g(this, 6)));
        ModifyStockCoverOrderViewModel modifyStockCoverOrderViewModel3 = (ModifyStockCoverOrderViewModel) r();
        modifyStockCoverOrderViewModel3.A.observe(this, new c(16, new g(this, 7)));
        ((ModifyStockCoverOrderViewModel) r()).f10330y.observe(this, new c(16, new g(this, 0)));
    }

    @Override // gd.m
    public final void E(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        String stockId = requireArguments().getString("STOCK_NAME");
        if (stockId == null) {
            StockSharedViewModel stockSharedViewModel = this.f10317g;
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
            StockSharedViewModel stockSharedViewModel2 = this.f10317g;
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
            StockSharedViewModel stockSharedViewModel3 = this.f10317g;
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
        ModifyStockCoverOrderViewModel modifyStockCoverOrderViewModel = (ModifyStockCoverOrderViewModel) r();
        String portfolioId = H().f33775a;
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        Intrinsics.checkNotNullParameter(stockId, "stockId");
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        at.m<BaseResponseDto<StockModifyInfoDto>> orderDetails = modifyStockCoverOrderViewModel.f10320o.getOrderDetails(portfolioId, stockId, orderType, orderId);
        ri.m mVar = new ri.m(12, ri.h.f33770d);
        orderDetails.getClass();
        h c10 = new b(new b(new b(new f(orderDetails, mVar, 1), new ri.m(13, new n(modifyStockCoverOrderViewModel, 1)), 1), new ri.m(14, new n(modifyStockCoverOrderViewModel, 2)), 2), new ri.m(15, new n(modifyStockCoverOrderViewModel, 3)), 0).c(((e) modifyStockCoverOrderViewModel.f9079b).J());
        d dVar = new d(new ri.m(16, new n(modifyStockCoverOrderViewModel, 4)), new ri.m(17, new n(modifyStockCoverOrderViewModel, 5)));
        c10.a(dVar);
        Intrinsics.checkNotNullExpressionValue(dVar, "subscribe(...)");
        modifyStockCoverOrderViewModel.f9080c.c(dVar);
        zk zkVar = (zk) q();
        zkVar.f6858u.setOnInputViewAction(new eb.f(this, 6));
        zk zkVar2 = (zk) q();
        zkVar2.A.setOnClickListener(new bb.a(24, this, orderId));
        zk zkVar3 = (zk) q();
        zkVar3.C.setNavigationOnClickListener(new ph.a(this, 8));
        requireActivity().getOnBackPressedDispatcher().a(this, new androidx.activity.x(this, 9));
    }

    public final ri.i H() {
        return (ri.i) this.f10318h.getValue();
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
        ca.c factory = new ca.c(a0.a(ModifyStockCoverOrderViewModel.class), new d1.b(k10, c10, portfolioRepository, stocksRepository, orderValidator, userRepository, 6));
        m mVar = n0Var.f15238a;
        h1 e10 = com.google.android.gms.internal.p002firebaseauthapi.a.e(mVar, "owner", factory, "factory");
        y4.c defaultCreationExtras = com.google.android.gms.internal.p002firebaseauthapi.a.o(mVar, "owner", e10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h10 = com.google.android.gms.internal.p002firebaseauthapi.a.h(e10, factory, defaultCreationExtras, ModifyStockCoverOrderViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(ModifyStockCoverOrderViewModel.class, "<this>", ModifyStockCoverOrderViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            ModifyStockCoverOrderViewModel modifyStockCoverOrderViewModel = (ModifyStockCoverOrderViewModel) h10.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            yk.g.j(modifyStockCoverOrderViewModel);
            this.f17284b = modifyStockCoverOrderViewModel;
            FirebaseAnalytics d10 = bVar.d();
            yk.g.i(d10);
            this.f17285c = d10;
            Analytics o10 = bVar.o();
            yk.g.i(o10);
            this.f17286d = o10;
            ls.n0 h11 = bVar.h();
            yk.g.i(h11);
            this.f17287e = h11;
            this.f10317g = fragmentComponent.l();
            return;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
    }
}
