package com.assetgro.stockgro.ui.stock.modify.sell;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.d0;
import androidx.lifecycle.e0;
import com.assetgro.stockgro.data.model.BottomSheetItem;
import com.assetgro.stockgro.data.repository.PortfolioRepository;
import com.assetgro.stockgro.data.repository.StockRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.ui.base.BaseViewModel;
import java.util.concurrent.atomic.AtomicInteger;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mt.p;
import okhttp3.HttpUrl;
import pj.a;
import qu.i0;
import si.b;
import si.g;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/assetgro/stockgro/ui/stock/modify/sell/ModifyStockSellViewModel;", "Lcom/assetgro/stockgro/ui/base/BaseViewModel;", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class ModifyStockSellViewModel extends BaseViewModel {
    public final d0 A;

    /* renamed from: n, reason: collision with root package name */
    public final PortfolioRepository f10335n;

    /* renamed from: o, reason: collision with root package name */
    public final StockRepository f10336o;

    /* renamed from: p, reason: collision with root package name */
    public final p f10337p;

    /* renamed from: q, reason: collision with root package name */
    public final e0 f10338q;

    /* renamed from: r, reason: collision with root package name */
    public final e0 f10339r;

    /* renamed from: s, reason: collision with root package name */
    public final e0 f10340s;

    /* renamed from: t, reason: collision with root package name */
    public final e0 f10341t;

    /* renamed from: u, reason: collision with root package name */
    public final e0 f10342u;

    /* renamed from: v, reason: collision with root package name */
    public final e0 f10343v;

    /* renamed from: w, reason: collision with root package name */
    public final AtomicInteger f10344w;

    /* renamed from: x, reason: collision with root package name */
    public final e0 f10345x;

    /* renamed from: y, reason: collision with root package name */
    public final e0 f10346y;

    /* renamed from: z, reason: collision with root package name */
    public final d0 f10347z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v3, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v6, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r3v4, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r5v2, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    public ModifyStockSellViewModel(PortfolioRepository portfolioRepository, StockRepository stocksRepository, UserRepository userRepository, p orderValidator, a schedulerProvider, ct.a compositeDisposable) {
        super(schedulerProvider, compositeDisposable, userRepository);
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(portfolioRepository, "portfolioRepository");
        Intrinsics.checkNotNullParameter(stocksRepository, "stocksRepository");
        Intrinsics.checkNotNullParameter(orderValidator, "orderValidator");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        this.f10335n = portfolioRepository;
        this.f10336o = stocksRepository;
        this.f10337p = orderValidator;
        this.f10338q = new LiveData();
        this.f10339r = new LiveData();
        this.f10340s = new LiveData();
        this.f10341t = new LiveData();
        this.f10342u = h.i();
        ?? liveData = new LiveData();
        this.f10343v = liveData;
        new LiveData();
        new BottomSheetItem("All Holdings", HttpUrl.FRAGMENT_ENCODE_SET);
        this.f10344w = new AtomicInteger(0);
        ?? liveData2 = new LiveData();
        this.f10345x = liveData2;
        this.f10346y = new LiveData();
        this.f10347z = i0.C(liveData2, new g(this, 0));
        this.A = i0.C(liveData, b.f34641g);
    }

    @Override // com.assetgro.stockgro.ui.base.BaseViewModel
    public final void e() {
    }
}
