package com.assetgro.stockgro.ui.stock.sell;

import android.view.View;
import androidx.lifecycle.h1;
import androidx.navigation.i;
import ba.vo;
import com.assetgro.stockgro.data.model.StockOrderDto;
import com.assetgro.stockgro.data.model.portfolio.holdings.Portfolio;
import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.data.remote.response.StockOrderResponse;
import com.assetgro.stockgro.data.repository.StockRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.stock.sell.StockSellOrderConfirmationFragment;
import com.assetgro.stockgro.ui.stock.sell.StockSellOrderConfirmationViewModel;
import com.bumptech.glide.b;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import ct.a;
import da.f;
import ea.n0;
import gd.m;
import iu.a0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kq.e;
import li.c;
import qu.i0;
import vi.g;
import vi.h;
import xf.x;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/assetgro/stockgro/ui/stock/sell/StockSellOrderConfirmationFragment;", "Lgd/m;", "Lcom/assetgro/stockgro/ui/stock/sell/StockSellOrderConfirmationViewModel;", "Lba/vo;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class StockSellOrderConfirmationFragment extends m<StockSellOrderConfirmationViewModel, vo> {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f10394h = 0;

    /* renamed from: g, reason: collision with root package name */
    public final i f10395g = new i(a0.a(h.class), new x(this, 12));

    @Override // gd.m
    public final int C() {
        return R.layout.fragment_stock_sell_order_confirmation;
    }

    @Override // gd.m
    public final void D() {
        super.D();
        ((StockSellOrderConfirmationViewModel) r()).f10397o.observe(this, new c(25, new g(this, 0)));
        ((StockSellOrderConfirmationViewModel) r()).f9084g.observe(this, new c(25, new g(this, 1)));
    }

    @Override // gd.m
    public final void E(View view) {
        String portfolioName;
        Intrinsics.checkNotNullParameter(view, "view");
        ((com.bumptech.glide.g) b.e(requireContext()).m(H().f38098a.getStockImageUrl()).b()).z(((vo) q()).f6461z);
        StockOrderDto stockOrderDto = H().f38098a;
        String stockName = stockOrderDto.getStockName();
        if (stockName != null) {
            ((vo) q()).A.setText(stockName);
        }
        String quantity = stockOrderDto.getQuantity();
        if (quantity != null) {
            ((vo) q()).f6459x.setValue(quantity);
        }
        Double executionPrice = stockOrderDto.getExecutionPrice();
        if (executionPrice != null) {
            double doubleValue = executionPrice.doubleValue();
            vo voVar = (vo) q();
            ij.h hVar = ij.h.f20067a;
            voVar.f6457v.setValue(ij.h.m(hVar, doubleValue));
            if (stockOrderDto.getQuantity() != null) {
                ((vo) q()).C.setValue(ij.h.m(hVar, Integer.parseInt(r2) * doubleValue));
            }
        }
        String orderType = stockOrderDto.getOrderType();
        if (orderType != null) {
            ((vo) q()).f6454s.setValue(orderType);
        }
        Portfolio portfolioDropDownInfoDto = stockOrderDto.getPortfolioDropDownInfoDto();
        if (portfolioDropDownInfoDto != null && (portfolioName = portfolioDropDownInfoDto.getPortfolioName()) != null) {
            ((vo) q()).f6456u.setText(portfolioName);
        }
        Portfolio portfolioDropDownInfoDto2 = stockOrderDto.getPortfolioDropDownInfoDto();
        if (portfolioDropDownInfoDto2 != null) {
            ((vo) q()).f6455t.setText(ij.h.m(ij.h.f20067a, portfolioDropDownInfoDto2.getCashBalance()));
        }
        final int i10 = 0;
        ((vo) q()).f6460y.setOnClickListener(new View.OnClickListener(this) { // from class: vi.f

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StockSellOrderConfirmationFragment f38095b;

            {
                this.f38095b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                String str;
                int i11 = i10;
                StockSellOrderConfirmationFragment this$0 = this.f38095b;
                switch (i11) {
                    case 0:
                        int i12 = StockSellOrderConfirmationFragment.f10394h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        StockSellOrderConfirmationViewModel stockSellOrderConfirmationViewModel = (StockSellOrderConfirmationViewModel) this$0.r();
                        String quantity2 = this$0.H().f38098a.getQuantity();
                        Intrinsics.c(quantity2);
                        int parseInt = Integer.parseInt(quantity2);
                        String stockId = this$0.H().f38098a.getStockCode();
                        Intrinsics.c(stockId);
                        Portfolio portfolioDropDownInfoDto3 = this$0.H().f38098a.getPortfolioDropDownInfoDto();
                        if (portfolioDropDownInfoDto3 != null) {
                            str = portfolioDropDownInfoDto3.getPortfolioId();
                        } else {
                            str = null;
                        }
                        String portfolioId = str;
                        Intrinsics.c(portfolioId);
                        String orderType2 = this$0.H().f38098a.getOrderType();
                        Intrinsics.c(orderType2);
                        Double executionPrice2 = this$0.H().f38098a.getExecutionPrice();
                        Intrinsics.c(executionPrice2);
                        double doubleValue2 = executionPrice2.doubleValue();
                        Intrinsics.checkNotNullParameter(stockId, "stockId");
                        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
                        Intrinsics.checkNotNullParameter(orderType2, "orderType");
                        at.m<BaseResponseDto<StockOrderResponse>> sellOrder = stockSellOrderConfirmationViewModel.f10396n.sellOrder(stockId, parseInt, portfolioId, orderType2, doubleValue2, null);
                        ui.a aVar = new ui.a(5, new k(stockSellOrderConfirmationViewModel, 0));
                        sellOrder.getClass();
                        nt.h c10 = new nt.b(new nt.b(new nt.b(sellOrder, aVar, 1), new ui.a(6, new k(stockSellOrderConfirmationViewModel, 1)), 2), new ui.a(7, new k(stockSellOrderConfirmationViewModel, 2)), 0).c(st.e.f34775c);
                        jt.d dVar = new jt.d(new ui.a(8, new k(stockSellOrderConfirmationViewModel, 3)), new ui.a(9, new k(stockSellOrderConfirmationViewModel, 4)));
                        c10.a(dVar);
                        Intrinsics.checkNotNullExpressionValue(dVar, "subscribe(...)");
                        stockSellOrderConfirmationViewModel.f9080c.c(dVar);
                        return;
                    default:
                        int i13 = StockSellOrderConfirmationFragment.f10394h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        q6.l.h(this$0).p();
                        return;
                }
            }
        });
        final int i11 = 1;
        ((vo) q()).B.setNavigationOnClickListener(new View.OnClickListener(this) { // from class: vi.f

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StockSellOrderConfirmationFragment f38095b;

            {
                this.f38095b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                String str;
                int i112 = i11;
                StockSellOrderConfirmationFragment this$0 = this.f38095b;
                switch (i112) {
                    case 0:
                        int i12 = StockSellOrderConfirmationFragment.f10394h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        StockSellOrderConfirmationViewModel stockSellOrderConfirmationViewModel = (StockSellOrderConfirmationViewModel) this$0.r();
                        String quantity2 = this$0.H().f38098a.getQuantity();
                        Intrinsics.c(quantity2);
                        int parseInt = Integer.parseInt(quantity2);
                        String stockId = this$0.H().f38098a.getStockCode();
                        Intrinsics.c(stockId);
                        Portfolio portfolioDropDownInfoDto3 = this$0.H().f38098a.getPortfolioDropDownInfoDto();
                        if (portfolioDropDownInfoDto3 != null) {
                            str = portfolioDropDownInfoDto3.getPortfolioId();
                        } else {
                            str = null;
                        }
                        String portfolioId = str;
                        Intrinsics.c(portfolioId);
                        String orderType2 = this$0.H().f38098a.getOrderType();
                        Intrinsics.c(orderType2);
                        Double executionPrice2 = this$0.H().f38098a.getExecutionPrice();
                        Intrinsics.c(executionPrice2);
                        double doubleValue2 = executionPrice2.doubleValue();
                        Intrinsics.checkNotNullParameter(stockId, "stockId");
                        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
                        Intrinsics.checkNotNullParameter(orderType2, "orderType");
                        at.m<BaseResponseDto<StockOrderResponse>> sellOrder = stockSellOrderConfirmationViewModel.f10396n.sellOrder(stockId, parseInt, portfolioId, orderType2, doubleValue2, null);
                        ui.a aVar = new ui.a(5, new k(stockSellOrderConfirmationViewModel, 0));
                        sellOrder.getClass();
                        nt.h c10 = new nt.b(new nt.b(new nt.b(sellOrder, aVar, 1), new ui.a(6, new k(stockSellOrderConfirmationViewModel, 1)), 2), new ui.a(7, new k(stockSellOrderConfirmationViewModel, 2)), 0).c(st.e.f34775c);
                        jt.d dVar = new jt.d(new ui.a(8, new k(stockSellOrderConfirmationViewModel, 3)), new ui.a(9, new k(stockSellOrderConfirmationViewModel, 4)));
                        c10.a(dVar);
                        Intrinsics.checkNotNullExpressionValue(dVar, "subscribe(...)");
                        stockSellOrderConfirmationViewModel.f9080c.c(dVar);
                        return;
                    default:
                        int i13 = StockSellOrderConfirmationFragment.f10394h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        q6.l.h(this$0).p();
                        return;
                }
            }
        });
    }

    public final h H() {
        return (h) this.f10395g.getValue();
    }

    @Override // gd.m
    public final void w(f fragmentComponent) {
        Intrinsics.checkNotNullParameter(fragmentComponent, "fragmentComponent");
        da.b bVar = fragmentComponent.f14279b;
        e k10 = bVar.k();
        a c10 = bVar.c();
        StockRepository stockRepository = bVar.l();
        yk.g.i(stockRepository);
        UserRepository userRepository = bVar.m();
        yk.g.i(userRepository);
        n0 n0Var = fragmentComponent.f14278a;
        com.google.android.gms.internal.p002firebaseauthapi.a.s(n0Var, k10, "schedulerProvider", c10, "compositeDisposable");
        Intrinsics.checkNotNullParameter(stockRepository, "stockRepository");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        ca.c factory = new ca.c(a0.a(StockSellOrderConfirmationViewModel.class), new ea.a(k10, c10, stockRepository, userRepository, 13));
        m mVar = n0Var.f15238a;
        h1 e10 = com.google.android.gms.internal.p002firebaseauthapi.a.e(mVar, "owner", factory, "factory");
        y4.c defaultCreationExtras = com.google.android.gms.internal.p002firebaseauthapi.a.o(mVar, "owner", e10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h10 = com.google.android.gms.internal.p002firebaseauthapi.a.h(e10, factory, defaultCreationExtras, StockSellOrderConfirmationViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(StockSellOrderConfirmationViewModel.class, "<this>", StockSellOrderConfirmationViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            StockSellOrderConfirmationViewModel stockSellOrderConfirmationViewModel = (StockSellOrderConfirmationViewModel) h10.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            yk.g.j(stockSellOrderConfirmationViewModel);
            this.f17284b = stockSellOrderConfirmationViewModel;
            FirebaseAnalytics d10 = bVar.d();
            yk.g.i(d10);
            this.f17285c = d10;
            Analytics o10 = bVar.o();
            yk.g.i(o10);
            this.f17286d = o10;
            ls.n0 h11 = bVar.h();
            yk.g.i(h11);
            this.f17287e = h11;
            return;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
    }
}
