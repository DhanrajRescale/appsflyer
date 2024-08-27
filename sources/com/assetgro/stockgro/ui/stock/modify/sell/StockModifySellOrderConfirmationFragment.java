package com.assetgro.stockgro.ui.stock.modify.sell;

import android.view.View;
import androidx.fragment.app.j0;
import androidx.lifecycle.h1;
import androidx.navigation.i;
import ba.vo;
import com.assetgro.stockgro.data.model.ModifyOrderDto;
import com.assetgro.stockgro.data.model.portfolio.holdings.Portfolio;
import com.assetgro.stockgro.data.repository.StockRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.stock.modify.sell.StockModifySellOrderConfirmationFragment;
import com.assetgro.stockgro.ui.stock.modify.sell.StockModifySellOrderConfirmationViewModel;
import com.bumptech.glide.b;
import com.bumptech.glide.g;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import ct.a;
import da.f;
import ea.n0;
import gd.m;
import ij.h;
import iu.a0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kq.e;
import li.c;
import qu.i0;
import si.j;
import xf.x;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/assetgro/stockgro/ui/stock/modify/sell/StockModifySellOrderConfirmationFragment;", "Lgd/m;", "Lcom/assetgro/stockgro/ui/stock/modify/sell/StockModifySellOrderConfirmationViewModel;", "Lba/vo;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class StockModifySellOrderConfirmationFragment extends m<StockModifySellOrderConfirmationViewModel, vo> {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f10348h = 0;

    /* renamed from: g, reason: collision with root package name */
    public final i f10349g = new i(a0.a(j.class), new x(this, 10));

    @Override // gd.m
    public final int C() {
        return R.layout.fragment_stock_sell_order_confirmation;
    }

    @Override // gd.m
    public final void D() {
        super.D();
        ((StockModifySellOrderConfirmationViewModel) r()).f10351o.observe(this, new c(18, new si.i(this, 0)));
        ((StockModifySellOrderConfirmationViewModel) r()).f9084g.observe(this, new c(18, new si.i(this, 1)));
    }

    @Override // gd.m
    public final void E(View view) {
        String portfolioName;
        Intrinsics.checkNotNullParameter(view, "view");
        ((g) b.e(requireContext()).m(H().f34655a.getStockImageUrl()).b()).z(((vo) q()).f6461z);
        ModifyOrderDto modifyOrderDto = H().f34655a;
        String stockName = modifyOrderDto.getStockName();
        if (stockName != null) {
            ((vo) q()).A.setText(stockName);
        }
        String quantity = modifyOrderDto.getQuantity();
        if (quantity != null) {
            ((vo) q()).f6459x.setValue(quantity);
        }
        Double executionPrice = modifyOrderDto.getExecutionPrice();
        if (executionPrice != null) {
            double doubleValue = executionPrice.doubleValue();
            vo voVar = (vo) q();
            h hVar = h.f20067a;
            voVar.f6457v.setValue(h.m(hVar, doubleValue));
            if (modifyOrderDto.getQuantity() != null) {
                ((vo) q()).C.setValue(h.m(hVar, Integer.parseInt(r2) * doubleValue));
            }
        }
        String orderType = modifyOrderDto.getOrderType();
        if (orderType != null) {
            ((vo) q()).f6454s.setValue(orderType);
        }
        Portfolio selectedPortfolio = modifyOrderDto.getSelectedPortfolio();
        if (selectedPortfolio != null && (portfolioName = selectedPortfolio.getPortfolioName()) != null) {
            ((vo) q()).f6456u.setText(portfolioName);
        }
        Portfolio selectedPortfolio2 = modifyOrderDto.getSelectedPortfolio();
        if (selectedPortfolio2 != null) {
            ((vo) q()).f6455t.setText(h.m(h.f20067a, selectedPortfolio2.getCashBalance()));
        }
        final int i10 = 0;
        ((vo) q()).f6460y.setOnClickListener(new View.OnClickListener(this) { // from class: si.h

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StockModifySellOrderConfirmationFragment f34652b;

            {
                this.f34652b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i11 = i10;
                StockModifySellOrderConfirmationFragment this$0 = this.f34652b;
                switch (i11) {
                    case 0:
                        int i12 = StockModifySellOrderConfirmationFragment.f10348h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        StockModifySellOrderConfirmationViewModel stockModifySellOrderConfirmationViewModel = (StockModifySellOrderConfirmationViewModel) this$0.r();
                        ModifyOrderDto modifyOrderDto2 = this$0.H().f34655a;
                        Intrinsics.checkNotNullParameter(modifyOrderDto2, "modifyOrderDto");
                        stockModifySellOrderConfirmationViewModel.f9084g.postValue(Boolean.TRUE);
                        nt.h c10 = stockModifySellOrderConfirmationViewModel.f10350n.modifyOrders(modifyOrderDto2).c(((kq.e) stockModifySellOrderConfirmationViewModel.f9079b).J());
                        jt.d dVar = new jt.d(new f(12, new n(stockModifySellOrderConfirmationViewModel, 0)), new f(13, new n(stockModifySellOrderConfirmationViewModel, 1)));
                        c10.a(dVar);
                        stockModifySellOrderConfirmationViewModel.f9080c.c(dVar);
                        return;
                    default:
                        int i13 = StockModifySellOrderConfirmationFragment.f10348h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        j0 activity = this$0.getActivity();
                        if (activity != null) {
                            activity.finish();
                            return;
                        }
                        return;
                }
            }
        });
        final int i11 = 1;
        ((vo) q()).B.setNavigationOnClickListener(new View.OnClickListener(this) { // from class: si.h

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StockModifySellOrderConfirmationFragment f34652b;

            {
                this.f34652b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i112 = i11;
                StockModifySellOrderConfirmationFragment this$0 = this.f34652b;
                switch (i112) {
                    case 0:
                        int i12 = StockModifySellOrderConfirmationFragment.f10348h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        StockModifySellOrderConfirmationViewModel stockModifySellOrderConfirmationViewModel = (StockModifySellOrderConfirmationViewModel) this$0.r();
                        ModifyOrderDto modifyOrderDto2 = this$0.H().f34655a;
                        Intrinsics.checkNotNullParameter(modifyOrderDto2, "modifyOrderDto");
                        stockModifySellOrderConfirmationViewModel.f9084g.postValue(Boolean.TRUE);
                        nt.h c10 = stockModifySellOrderConfirmationViewModel.f10350n.modifyOrders(modifyOrderDto2).c(((kq.e) stockModifySellOrderConfirmationViewModel.f9079b).J());
                        jt.d dVar = new jt.d(new f(12, new n(stockModifySellOrderConfirmationViewModel, 0)), new f(13, new n(stockModifySellOrderConfirmationViewModel, 1)));
                        c10.a(dVar);
                        stockModifySellOrderConfirmationViewModel.f9080c.c(dVar);
                        return;
                    default:
                        int i13 = StockModifySellOrderConfirmationFragment.f10348h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        j0 activity = this$0.getActivity();
                        if (activity != null) {
                            activity.finish();
                            return;
                        }
                        return;
                }
            }
        });
        requireActivity().getOnBackPressedDispatcher().a(this, new androidx.activity.x(this, 11));
    }

    public final j H() {
        return (j) this.f10349g.getValue();
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
        ca.c factory = new ca.c(a0.a(StockModifySellOrderConfirmationViewModel.class), new ea.a(k10, c10, stockRepository, userRepository, 9));
        m mVar = n0Var.f15238a;
        h1 e10 = com.google.android.gms.internal.p002firebaseauthapi.a.e(mVar, "owner", factory, "factory");
        y4.c defaultCreationExtras = com.google.android.gms.internal.p002firebaseauthapi.a.o(mVar, "owner", e10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h10 = com.google.android.gms.internal.p002firebaseauthapi.a.h(e10, factory, defaultCreationExtras, StockModifySellOrderConfirmationViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(StockModifySellOrderConfirmationViewModel.class, "<this>", StockModifySellOrderConfirmationViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            StockModifySellOrderConfirmationViewModel stockModifySellOrderConfirmationViewModel = (StockModifySellOrderConfirmationViewModel) h10.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            yk.g.j(stockModifySellOrderConfirmationViewModel);
            this.f17284b = stockModifySellOrderConfirmationViewModel;
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
