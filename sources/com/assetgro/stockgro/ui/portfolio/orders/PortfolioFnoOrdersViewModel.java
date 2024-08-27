package com.assetgro.stockgro.ui.portfolio.orders;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.e0;
import androidx.lifecycle.u0;
import com.assetgro.stockgro.data.WifiService;
import com.assetgro.stockgro.data.model.portfolio.holdings.Portfolio;
import com.assetgro.stockgro.data.repository.PortfolioRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.ui.base.BaseViewModel;
import com.assetgro.stockgro.ui.portfolio.orders.model.PortfolioPendingOrderCancelRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ni.j;
import pj.a;
import tg.d;
import tg.e;
import tu.k1;
import tu.l1;
import yk.g;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/assetgro/stockgro/ui/portfolio/orders/PortfolioFnoOrdersViewModel;", "Lcom/assetgro/stockgro/ui/base/BaseViewModel;", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class PortfolioFnoOrdersViewModel extends BaseViewModel {

    /* renamed from: n, reason: collision with root package name */
    public final PortfolioRepository f9908n;

    /* renamed from: o, reason: collision with root package name */
    public Portfolio f9909o;

    /* renamed from: p, reason: collision with root package name */
    public final e0 f9910p;

    /* renamed from: q, reason: collision with root package name */
    public final e0 f9911q;

    /* renamed from: r, reason: collision with root package name */
    public final k1 f9912r;

    /* renamed from: s, reason: collision with root package name */
    public final e0 f9913s;

    /* renamed from: t, reason: collision with root package name */
    public final e0 f9914t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    public PortfolioFnoOrdersViewModel(a schedulerProvider, ct.a compositeDisposable, PortfolioRepository portfolioRepository, UserRepository userRepository) {
        super(schedulerProvider, compositeDisposable, userRepository);
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(portfolioRepository, "portfolioRepository");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        this.f9908n = portfolioRepository;
        portfolioRepository.getUserId();
        ?? liveData = new LiveData();
        this.f9910p = liveData;
        this.f9911q = liveData;
        this.f9912r = l1.a(Boolean.FALSE);
        ?? liveData2 = new LiveData();
        this.f9913s = liveData2;
        this.f9914t = liveData2;
    }

    public final void h(String optionType, PortfolioPendingOrderCancelRequest body) {
        Intrinsics.checkNotNullParameter(optionType, "optionType");
        Intrinsics.checkNotNullParameter(body, "body");
        boolean isOnline = WifiService.INSTANCE.getInstance().isOnline();
        e0 e0Var = this.f9083f;
        if (!isOnline) {
            e0Var.setValue(j.i("Not connected to internet"));
            return;
        }
        try {
            g.H(u0.f(this), null, null, new d(this, optionType, body, null), 3);
        } catch (Exception unused) {
            e0Var.setValue(j.i("Technical Error Occurred"));
        }
    }

    public final void i(String str) {
        if (!WifiService.INSTANCE.getInstance().isOnline()) {
            this.f9083f.setValue(j.i("Not connected to internet"));
        } else {
            try {
                g.H(u0.f(this), null, null, new e(this, str, null), 3);
            } catch (Exception unused) {
            }
        }
    }
}
