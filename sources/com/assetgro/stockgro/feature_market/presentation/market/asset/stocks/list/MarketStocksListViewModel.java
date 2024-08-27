package com.assetgro.stockgro.feature_market.presentation.market.asset.stocks.list;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.e0;
import at.m;
import com.assetgro.stockgro.data.WifiService;
import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.data.remote.response.StocksListResponse;
import com.assetgro.stockgro.data.repository.SortDirection;
import com.assetgro.stockgro.data.repository.SortOption;
import com.assetgro.stockgro.data.repository.StockRepository;
import com.assetgro.stockgro.data.repository.TopChartsRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.base.BaseViewModel;
import d2.y0;
import ft.b;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import jt.d;
import jt.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mt.c;
import ni.j;
import ni.s;
import nt.f;
import nt.h;
import pj.a;
import ta.i;
import ta.k;
import ta.l;
import tu.k1;
import tu.l1;
import tu.s0;
import vt.i0;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/assetgro/stockgro/feature_market/presentation/market/asset/stocks/list/MarketStocksListViewModel;", "Lcom/assetgro/stockgro/ui/base/BaseViewModel;", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class MarketStocksListViewModel extends BaseViewModel {
    public final e0 A;
    public e B;
    public final e0 C;
    public s D;

    /* renamed from: n, reason: collision with root package name */
    public final StockRepository f8671n;

    /* renamed from: o, reason: collision with root package name */
    public final TopChartsRepository f8672o;

    /* renamed from: p, reason: collision with root package name */
    public final k1 f8673p;

    /* renamed from: q, reason: collision with root package name */
    public final s0 f8674q;

    /* renamed from: r, reason: collision with root package name */
    public final e0 f8675r;

    /* renamed from: s, reason: collision with root package name */
    public final e0 f8676s;

    /* renamed from: t, reason: collision with root package name */
    public final e0 f8677t;

    /* renamed from: u, reason: collision with root package name */
    public final ArrayList f8678u;

    /* renamed from: v, reason: collision with root package name */
    public int f8679v;

    /* renamed from: w, reason: collision with root package name */
    public int f8680w;

    /* renamed from: x, reason: collision with root package name */
    public int f8681x;

    /* renamed from: y, reason: collision with root package name */
    public final int f8682y;

    /* renamed from: z, reason: collision with root package name */
    public String f8683z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r8v10, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r8v12, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r8v3, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r8v4, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r8v5, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    public MarketStocksListViewModel(a schedulerProvider, ct.a compositeDisposable, UserRepository userRepository, StockRepository stocksRepository, TopChartsRepository topChartsRepository) {
        super(schedulerProvider, compositeDisposable, userRepository);
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(stocksRepository, "stocksRepository");
        Intrinsics.checkNotNullParameter(topChartsRepository, "topChartsRepository");
        this.f8671n = stocksRepository;
        this.f8672o = topChartsRepository;
        k1 a10 = l1.a(new i(i0.f38321a, false, false, false, false));
        this.f8673p = a10;
        this.f8674q = new s0(a10);
        this.f8675r = new LiveData();
        this.f8676s = new LiveData();
        this.f8677t = new LiveData();
        this.f8678u = new ArrayList();
        this.f8679v = 1;
        this.f8681x = 1;
        this.f8682y = 50;
        this.f8683z = "nifty_500+";
        this.A = new LiveData();
        new LiveData();
        this.C = new LiveData(Boolean.FALSE);
        this.D = new s(SortOption.Percentage, SortDirection.Descending, R.string.percentage_descending);
        this.f9084g.postValue(Boolean.TRUE);
    }

    @Override // com.assetgro.stockgro.ui.base.BaseViewModel, androidx.lifecycle.a1
    public final void d() {
        super.d();
    }

    @Override // com.assetgro.stockgro.ui.base.BaseViewModel
    public final void e() {
    }

    public final void h(String type) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f9084g.postValue(Boolean.TRUE);
        h c10 = this.f8672o.getHomePageTopData().c(((kq.e) this.f9079b).J());
        d dVar = new d(new com.assetgro.stockgro.data.a(27, new y0(18, this, type)), new com.assetgro.stockgro.data.a(28, new l(this, 0)));
        c10.a(dVar);
        this.f9080c.c(dVar);
    }

    public final void i() {
        if (!WifiService.INSTANCE.getInstance().isOnline()) {
            this.f9083f.postValue(j.i("Not connected to internet"));
            return;
        }
        String valueOf = String.valueOf(this.f8679v);
        String str = this.f8683z;
        s sVar = this.D;
        m<BaseResponseDto<StocksListResponse>> stocks = this.f8671n.getStocks(valueOf, str, sVar.f28762a, sVar.f28763b);
        com.assetgro.stockgro.data.a aVar = new com.assetgro.stockgro.data.a(24, ta.m.f35668b);
        stocks.getClass();
        h c10 = new f(stocks, aVar, 1).c(((kq.e) this.f9079b).J());
        d dVar = new d(new com.assetgro.stockgro.data.a(25, new l(this, 1)), new com.assetgro.stockgro.data.a(26, new l(this, 2)));
        c10.a(dVar);
        this.f9080c.c(dVar);
    }

    public final void j() {
        if (!WifiService.INSTANCE.getInstance().isOnline()) {
            k(k.f35661d);
            return;
        }
        String valueOf = String.valueOf(this.f8679v);
        String str = this.f8683z;
        s sVar = this.D;
        m<BaseResponseDto<StocksListResponse>> stocks = this.f8671n.getStocks(valueOf, str, sVar.f28762a, sVar.f28763b);
        com.assetgro.stockgro.data.a aVar = new com.assetgro.stockgro.data.a(15, ta.m.f35669c);
        stocks.getClass();
        h c10 = new f(stocks, aVar, 1).c(((kq.e) this.f9079b).J());
        d dVar = new d(new com.assetgro.stockgro.data.a(16, new l(this, 3)), new com.assetgro.stockgro.data.a(17, new l(this, 4)));
        c10.a(dVar);
        this.f9080c.c(dVar);
    }

    public final void k(al.d stateEvents) {
        Intrinsics.checkNotNullParameter(stateEvents, "stateEvents");
        boolean z10 = stateEvents instanceof ta.j;
        k1 k1Var = this.f8673p;
        if (z10) {
            k1Var.m(i.a((i) k1Var.getValue(), ((ta.j) stateEvents).f35658b, false, false, 16));
            return;
        }
        if (Intrinsics.a(stateEvents, k.f35659b)) {
            k1Var.m(i.a((i) k1Var.getValue(), null, true, false, 29));
            j();
            l();
            return;
        }
        if (Intrinsics.a(stateEvents, k.f35660c)) {
            if (!((i) k1Var.getValue()).f35656d) {
                k1Var.m(i.a((i) k1Var.getValue(), null, false, false, 27));
                return;
            } else {
                k1Var.m(i.a((i) k1Var.getValue(), null, false, false, 27));
                return;
            }
        }
        if (Intrinsics.a(stateEvents, k.f35661d)) {
            if (((i) k1Var.getValue()).f35653a.isEmpty()) {
                k1Var.m(i.a((i) k1Var.getValue(), null, false, true, 23));
                k1Var.m(i.a((i) k1Var.getValue(), null, false, false, 27));
                return;
            }
            return;
        }
        if (Intrinsics.a(stateEvents, k.f35663f)) {
            j();
            return;
        }
        if (Intrinsics.a(stateEvents, k.f35664g)) {
            l();
            return;
        }
        if (Intrinsics.a(stateEvents, k.f35665h)) {
            e eVar = this.B;
            if (eVar != null) {
                b.b(eVar);
                return;
            }
            return;
        }
        if (Intrinsics.a(stateEvents, k.f35662e)) {
            k1Var.m(i.a((i) k1Var.getValue(), null, false, false, 27));
        }
    }

    public final void l() {
        e eVar = this.B;
        if (eVar != null) {
            b.b(eVar);
        }
        mt.f g10 = new c(at.e.a(5L, TimeUnit.SECONDS), new com.assetgro.stockgro.data.a(18, ta.m.f35671e)).g(((kq.e) this.f9079b).J());
        e eVar2 = new e(new com.assetgro.stockgro.data.a(19, new l(this, 7)), new com.assetgro.stockgro.data.a(20, ta.m.f35672f));
        g10.e(eVar2);
        this.B = eVar2;
    }
}
