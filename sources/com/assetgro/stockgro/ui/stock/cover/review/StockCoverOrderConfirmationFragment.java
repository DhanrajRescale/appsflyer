package com.assetgro.stockgro.ui.stock.cover.review;

import android.view.View;
import androidx.lifecycle.h1;
import androidx.navigation.i;
import ba.wn;
import com.assetgro.stockgro.data.model.StockOrderDto;
import com.assetgro.stockgro.data.model.portfolio.holdings.Portfolio;
import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.data.remote.response.StockOrderResponse;
import com.assetgro.stockgro.data.repository.StockRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.stock.cover.review.StockCoverOrderConfirmationFragment;
import com.assetgro.stockgro.ui.stock.cover.review.StockCoverOrderConfirmationViewModel;
import com.bumptech.glide.g;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import ct.a;
import da.f;
import ea.n0;
import gd.m;
import ij.h;
import iu.a0;
import ki.b;
import ki.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kq.e;
import q6.l;
import qu.i0;
import xf.x;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/assetgro/stockgro/ui/stock/cover/review/StockCoverOrderConfirmationFragment;", "Lgd/m;", "Lcom/assetgro/stockgro/ui/stock/cover/review/StockCoverOrderConfirmationViewModel;", "Lba/wn;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class StockCoverOrderConfirmationFragment extends m<StockCoverOrderConfirmationViewModel, wn> {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f10182h = 0;

    /* renamed from: g, reason: collision with root package name */
    public final i f10183g = new i(a0.a(c.class), new x(this, 5));

    @Override // gd.m
    public final int C() {
        return R.layout.fragment_stock_cover_order_confirmation;
    }

    @Override // gd.m
    public final void D() {
        super.D();
        ((StockCoverOrderConfirmationViewModel) r()).f10185o.observe(this, new ch.c(28, new b(this, 0)));
        ((StockCoverOrderConfirmationViewModel) r()).f9084g.observe(this, new ch.c(28, new b(this, 1)));
    }

    @Override // gd.m
    public final void E(View view) {
        String str;
        Intrinsics.checkNotNullParameter(view, "view");
        ((g) com.bumptech.glide.b.e(requireContext()).m(H().f23201a.getStockImageUrl()).b()).z(((wn) q()).f6559z);
        StockOrderDto stockOrderDto = H().f23201a;
        String stockName = stockOrderDto.getStockName();
        if (stockName != null) {
            ((wn) q()).A.setText(stockName);
        }
        String quantity = stockOrderDto.getQuantity();
        if (quantity != null) {
            ((wn) q()).f6557x.setValue(quantity);
        }
        Double executionPrice = stockOrderDto.getExecutionPrice();
        if (executionPrice != null) {
            double doubleValue = executionPrice.doubleValue();
            wn wnVar = (wn) q();
            h hVar = h.f20067a;
            wnVar.f6555v.setValue(h.m(hVar, doubleValue));
            if (stockOrderDto.getQuantity() != null) {
                ((wn) q()).C.setValue(h.m(hVar, Integer.parseInt(r2) * doubleValue));
            }
        }
        String orderType = stockOrderDto.getOrderType();
        if (orderType != null) {
            ((wn) q()).f6552s.setValue(orderType);
        }
        Portfolio portfolioDropDownInfoDto = stockOrderDto.getPortfolioDropDownInfoDto();
        if (portfolioDropDownInfoDto != null) {
            str = portfolioDropDownInfoDto.getPortfolioName();
        } else {
            str = null;
        }
        ((wn) q()).f6554u.setText(str);
        Portfolio portfolioDropDownInfoDto2 = stockOrderDto.getPortfolioDropDownInfoDto();
        if (portfolioDropDownInfoDto2 != null) {
            double cashBalance = portfolioDropDownInfoDto2.getCashBalance();
            ((wn) q()).f6553t.setText(h.m(h.f20067a, cashBalance));
        }
        final int i10 = 0;
        ((wn) q()).f6558y.setOnClickListener(new View.OnClickListener(this) { // from class: ki.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StockCoverOrderConfirmationFragment f23198b;

            {
                this.f23198b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                String str2;
                int i11 = i10;
                StockCoverOrderConfirmationFragment this$0 = this.f23198b;
                switch (i11) {
                    case 0:
                        int i12 = StockCoverOrderConfirmationFragment.f10182h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        StockCoverOrderConfirmationViewModel stockCoverOrderConfirmationViewModel = (StockCoverOrderConfirmationViewModel) this$0.r();
                        String quantity2 = this$0.H().f23201a.getQuantity();
                        Intrinsics.c(quantity2);
                        int parseInt = Integer.parseInt(quantity2);
                        String stockId = this$0.H().f23201a.getStockCode();
                        Intrinsics.c(stockId);
                        Portfolio portfolioDropDownInfoDto3 = this$0.H().f23201a.getPortfolioDropDownInfoDto();
                        if (portfolioDropDownInfoDto3 != null) {
                            str2 = portfolioDropDownInfoDto3.getPortfolioId();
                        } else {
                            str2 = null;
                        }
                        String portfolioId = str2;
                        Intrinsics.c(portfolioId);
                        String orderType2 = this$0.H().f23201a.getOrderType();
                        Intrinsics.c(orderType2);
                        Double executionPrice2 = this$0.H().f23201a.getExecutionPrice();
                        Intrinsics.c(executionPrice2);
                        double doubleValue2 = executionPrice2.doubleValue();
                        Intrinsics.checkNotNullParameter(stockId, "stockId");
                        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
                        Intrinsics.checkNotNullParameter(orderType2, "orderType");
                        at.m<BaseResponseDto<StockOrderResponse>> squareOffStock = stockCoverOrderConfirmationViewModel.f10184n.squareOffStock(stockId, parseInt, portfolioId, orderType2, doubleValue2, "cover");
                        hi.c cVar = new hi.c(8, new f(stockCoverOrderConfirmationViewModel, 0));
                        squareOffStock.getClass();
                        nt.h c10 = new nt.b(new nt.b(new nt.b(squareOffStock, cVar, 1), new hi.c(9, new f(stockCoverOrderConfirmationViewModel, 1)), 2), new hi.c(10, new f(stockCoverOrderConfirmationViewModel, 2)), 0).c(st.e.f34775c);
                        jt.d dVar = new jt.d(new hi.c(11, new f(stockCoverOrderConfirmationViewModel, 3)), new hi.c(12, new f(stockCoverOrderConfirmationViewModel, 4)));
                        c10.a(dVar);
                        Intrinsics.checkNotNullExpressionValue(dVar, "subscribe(...)");
                        stockCoverOrderConfirmationViewModel.f9080c.c(dVar);
                        return;
                    default:
                        int i13 = StockCoverOrderConfirmationFragment.f10182h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        l.h(this$0).p();
                        return;
                }
            }
        });
        final int i11 = 1;
        ((wn) q()).B.setNavigationOnClickListener(new View.OnClickListener(this) { // from class: ki.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StockCoverOrderConfirmationFragment f23198b;

            {
                this.f23198b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                String str2;
                int i112 = i11;
                StockCoverOrderConfirmationFragment this$0 = this.f23198b;
                switch (i112) {
                    case 0:
                        int i12 = StockCoverOrderConfirmationFragment.f10182h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        StockCoverOrderConfirmationViewModel stockCoverOrderConfirmationViewModel = (StockCoverOrderConfirmationViewModel) this$0.r();
                        String quantity2 = this$0.H().f23201a.getQuantity();
                        Intrinsics.c(quantity2);
                        int parseInt = Integer.parseInt(quantity2);
                        String stockId = this$0.H().f23201a.getStockCode();
                        Intrinsics.c(stockId);
                        Portfolio portfolioDropDownInfoDto3 = this$0.H().f23201a.getPortfolioDropDownInfoDto();
                        if (portfolioDropDownInfoDto3 != null) {
                            str2 = portfolioDropDownInfoDto3.getPortfolioId();
                        } else {
                            str2 = null;
                        }
                        String portfolioId = str2;
                        Intrinsics.c(portfolioId);
                        String orderType2 = this$0.H().f23201a.getOrderType();
                        Intrinsics.c(orderType2);
                        Double executionPrice2 = this$0.H().f23201a.getExecutionPrice();
                        Intrinsics.c(executionPrice2);
                        double doubleValue2 = executionPrice2.doubleValue();
                        Intrinsics.checkNotNullParameter(stockId, "stockId");
                        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
                        Intrinsics.checkNotNullParameter(orderType2, "orderType");
                        at.m<BaseResponseDto<StockOrderResponse>> squareOffStock = stockCoverOrderConfirmationViewModel.f10184n.squareOffStock(stockId, parseInt, portfolioId, orderType2, doubleValue2, "cover");
                        hi.c cVar = new hi.c(8, new f(stockCoverOrderConfirmationViewModel, 0));
                        squareOffStock.getClass();
                        nt.h c10 = new nt.b(new nt.b(new nt.b(squareOffStock, cVar, 1), new hi.c(9, new f(stockCoverOrderConfirmationViewModel, 1)), 2), new hi.c(10, new f(stockCoverOrderConfirmationViewModel, 2)), 0).c(st.e.f34775c);
                        jt.d dVar = new jt.d(new hi.c(11, new f(stockCoverOrderConfirmationViewModel, 3)), new hi.c(12, new f(stockCoverOrderConfirmationViewModel, 4)));
                        c10.a(dVar);
                        Intrinsics.checkNotNullExpressionValue(dVar, "subscribe(...)");
                        stockCoverOrderConfirmationViewModel.f9080c.c(dVar);
                        return;
                    default:
                        int i13 = StockCoverOrderConfirmationFragment.f10182h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        l.h(this$0).p();
                        return;
                }
            }
        });
    }

    public final c H() {
        return (c) this.f10183g.getValue();
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
        ca.c factory = new ca.c(a0.a(StockCoverOrderConfirmationViewModel.class), new ea.a(k10, c10, stockRepository, userRepository, 7));
        m mVar = n0Var.f15238a;
        h1 e10 = com.google.android.gms.internal.p002firebaseauthapi.a.e(mVar, "owner", factory, "factory");
        y4.c defaultCreationExtras = com.google.android.gms.internal.p002firebaseauthapi.a.o(mVar, "owner", e10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h10 = com.google.android.gms.internal.p002firebaseauthapi.a.h(e10, factory, defaultCreationExtras, StockCoverOrderConfirmationViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(StockCoverOrderConfirmationViewModel.class, "<this>", StockCoverOrderConfirmationViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            StockCoverOrderConfirmationViewModel stockCoverOrderConfirmationViewModel = (StockCoverOrderConfirmationViewModel) h10.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            yk.g.j(stockCoverOrderConfirmationViewModel);
            this.f17284b = stockCoverOrderConfirmationViewModel;
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
