package com.assetgro.stockgro.feature_market.presentation.market.asset.stocks.asset;

import com.assetgro.stockgro.data.WifiService;
import com.assetgro.stockgro.data.repository.StockRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.ui.base.BaseViewModel;
import ft.b;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import jt.d;
import jt.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mt.f;
import nt.h;
import pj.a;
import ra.c;
import tu.k1;
import tu.l1;
import tu.s0;
import yk.g;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/assetgro/stockgro/feature_market/presentation/market/asset/stocks/asset/MarketAssetInsightsViewModel;", "Lcom/assetgro/stockgro/ui/base/BaseViewModel;", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class MarketAssetInsightsViewModel extends BaseViewModel {

    /* renamed from: n, reason: collision with root package name */
    public final StockRepository f8666n;

    /* renamed from: o, reason: collision with root package name */
    public final k1 f8667o;

    /* renamed from: p, reason: collision with root package name */
    public final s0 f8668p;

    /* renamed from: q, reason: collision with root package name */
    public e f8669q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketAssetInsightsViewModel(StockRepository stocksRepository, UserRepository userRepository, a schedulerProvider, ct.a compositeDisposable) {
        super(schedulerProvider, compositeDisposable, userRepository);
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(stocksRepository, "stocksRepository");
        this.f8666n = stocksRepository;
        k1 a10 = l1.a(new c(new ArrayList(), false, false, false, false));
        this.f8667o = a10;
        this.f8668p = new s0(a10);
    }

    public final void h() {
        if (!WifiService.INSTANCE.getInstance().isOnline()) {
            i(ra.e.f33557d);
            return;
        }
        h c10 = this.f8666n.getStockInsights().c(((kq.e) this.f9079b).J());
        d dVar = new d(new com.assetgro.stockgro.data.a(13, new ra.a(this, 0)), new com.assetgro.stockgro.data.a(14, new ra.a(this, 1)));
        c10.a(dVar);
        this.f9080c.c(dVar);
    }

    public final void i(g stateEvents) {
        Intrinsics.checkNotNullParameter(stateEvents, "stateEvents");
        boolean z10 = stateEvents instanceof ra.d;
        k1 k1Var = this.f8667o;
        if (z10) {
            k1Var.m(c.a((c) k1Var.getValue(), ((ra.d) stateEvents).f33554b, false, false, false, 8));
            return;
        }
        if (Intrinsics.a(stateEvents, ra.e.f33555b)) {
            k1Var.m(c.a((c) k1Var.getValue(), null, true, false, false, 29));
            h();
            j();
            return;
        }
        boolean a10 = Intrinsics.a(stateEvents, ra.e.f33558e);
        ra.e eVar = ra.e.f33556c;
        if (a10) {
            i(eVar);
            h();
            return;
        }
        if (Intrinsics.a(stateEvents, ra.e.f33559f)) {
            h();
            return;
        }
        if (Intrinsics.a(stateEvents, ra.e.f33557d)) {
            if (((c) k1Var.getValue()).f33549a.isEmpty()) {
                k1Var.m(c.a((c) k1Var.getValue(), null, false, false, true, 15));
                return;
            }
            return;
        }
        if (Intrinsics.a(stateEvents, ra.e.f33560g)) {
            j();
            return;
        }
        if (Intrinsics.a(stateEvents, ra.e.f33561h)) {
            e eVar2 = this.f8669q;
            if (eVar2 != null) {
                b.b(eVar2);
                return;
            }
            return;
        }
        if (Intrinsics.a(stateEvents, eVar)) {
            if (!((c) k1Var.getValue()).f33553e) {
                k1Var.m(c.a((c) k1Var.getValue(), null, false, true, false, 27));
            } else {
                k1Var.m(c.a((c) k1Var.getValue(), null, false, false, false, 27));
            }
        }
    }

    public final void j() {
        e eVar = this.f8669q;
        if (eVar != null) {
            b.b(eVar);
        }
        f g10 = new mt.c(at.e.a(10L, TimeUnit.SECONDS), new com.assetgro.stockgro.data.a(10, ra.b.f33546b)).g(((kq.e) this.f9079b).J());
        e eVar2 = new e(new com.assetgro.stockgro.data.a(11, new ra.a(this, 2)), new com.assetgro.stockgro.data.a(12, ra.b.f33547c));
        g10.e(eVar2);
        this.f8669q = eVar2;
    }
}
