package com.assetgro.stockgro.ui.stock.list;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.e0;
import at.m;
import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.data.remote.response.StocksListResponse;
import com.assetgro.stockgro.data.repository.SortDirection;
import com.assetgro.stockgro.data.repository.SortOption;
import com.assetgro.stockgro.data.repository.StockRepository;
import com.assetgro.stockgro.data.repository.TopChartsRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.base.BaseViewModel;
import ft.b;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import jr.h;
import jt.d;
import jt.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mt.c;
import ni.k;
import ni.q;
import ni.r;
import ni.s;
import nt.f;
import pj.a;
import zd.g;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/assetgro/stockgro/ui/stock/list/StockListViewModel;", "Lcom/assetgro/stockgro/ui/base/BaseViewModel;", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class StockListViewModel extends BaseViewModel {
    public e A;
    public s B;
    public boolean C;
    public boolean D;

    /* renamed from: n, reason: collision with root package name */
    public final StockRepository f10253n;

    /* renamed from: o, reason: collision with root package name */
    public final TopChartsRepository f10254o;

    /* renamed from: p, reason: collision with root package name */
    public final e0 f10255p;

    /* renamed from: q, reason: collision with root package name */
    public final e0 f10256q;

    /* renamed from: r, reason: collision with root package name */
    public final e0 f10257r;

    /* renamed from: s, reason: collision with root package name */
    public final ArrayList f10258s;

    /* renamed from: t, reason: collision with root package name */
    public final String[] f10259t;

    /* renamed from: u, reason: collision with root package name */
    public int f10260u;

    /* renamed from: v, reason: collision with root package name */
    public int f10261v;

    /* renamed from: w, reason: collision with root package name */
    public final int f10262w;

    /* renamed from: x, reason: collision with root package name */
    public String f10263x;

    /* renamed from: y, reason: collision with root package name */
    public final e0 f10264y;

    /* renamed from: z, reason: collision with root package name */
    public final e0 f10265z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v3, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r3v4, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r3v5, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    public StockListViewModel(a schedulerProvider, ct.a compositeDisposable, StockRepository stocksRepository, TopChartsRepository topChartsRepository, UserRepository userRepository) {
        super(schedulerProvider, compositeDisposable, userRepository);
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(stocksRepository, "stocksRepository");
        Intrinsics.checkNotNullParameter(topChartsRepository, "topChartsRepository");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        this.f10253n = stocksRepository;
        this.f10254o = topChartsRepository;
        this.f10255p = new LiveData();
        this.f10256q = h.i();
        this.f10257r = new LiveData();
        this.f10258s = new ArrayList();
        this.f10259t = new String[]{"Nifty 50", "Nifty 200", "Nifty 500"};
        this.f10260u = 1;
        this.f10261v = 1;
        this.f10262w = 50;
        this.f10263x = "nifty_50";
        this.f10264y = new LiveData();
        this.f10265z = new LiveData();
        new ArrayList();
        this.B = new s(SortOption.Percentage, SortDirection.Descending, R.string.percentage_descending);
        this.D = true;
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
        nt.h c10 = this.f10254o.getHomePageTopData().c(((kq.e) this.f9079b).J());
        d dVar = new d(new q(1, new g(20, this, type)), new q(2, new r(this, 0)));
        c10.a(dVar);
        this.f9080c.c(dVar);
    }

    public final void i() {
        this.f10256q.postValue(Boolean.FALSE);
        String valueOf = String.valueOf(this.f10260u);
        String str = this.f10263x;
        s sVar = this.B;
        m<BaseResponseDto<StocksListResponse>> stocks = this.f10253n.getStocks(valueOf, str, sVar.f28762a, sVar.f28763b);
        q qVar = new q(3, k.f28744g);
        stocks.getClass();
        nt.h c10 = new f(stocks, qVar, 1).c(((kq.e) this.f9079b).J());
        d dVar = new d(new q(4, new r(this, 1)), new q(5, new r(this, 2)));
        c10.a(dVar);
        this.f9080c.c(dVar);
    }

    public final void j() {
        e eVar = this.A;
        if (eVar != null) {
            b.b(eVar);
        }
        mt.f g10 = new c(at.e.a(5L, TimeUnit.SECONDS), new hi.c(29, k.f28745h)).g(((kq.e) this.f9079b).J());
        e eVar2 = new e(new q(0, new r(this, 3)), gt.e.f17572d);
        g10.e(eVar2);
        this.A = eVar2;
    }
}
