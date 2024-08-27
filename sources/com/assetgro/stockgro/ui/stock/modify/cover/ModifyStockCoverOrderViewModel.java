package com.assetgro.stockgro.ui.stock.modify.cover;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.d0;
import androidx.lifecycle.e0;
import com.assetgro.stockgro.data.model.BottomSheetItem;
import com.assetgro.stockgro.data.repository.PortfolioRepository;
import com.assetgro.stockgro.data.repository.StockRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.ui.base.BaseViewModel;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mt.p;
import okhttp3.HttpUrl;
import pj.a;
import qu.i0;
import ri.h;
import ri.n;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/assetgro/stockgro/ui/stock/modify/cover/ModifyStockCoverOrderViewModel;", "Lcom/assetgro/stockgro/ui/base/BaseViewModel;", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class ModifyStockCoverOrderViewModel extends BaseViewModel {
    public final d0 A;

    /* renamed from: n, reason: collision with root package name */
    public final PortfolioRepository f10319n;

    /* renamed from: o, reason: collision with root package name */
    public final StockRepository f10320o;

    /* renamed from: p, reason: collision with root package name */
    public final p f10321p;

    /* renamed from: q, reason: collision with root package name */
    public final e0 f10322q;

    /* renamed from: r, reason: collision with root package name */
    public final e0 f10323r;

    /* renamed from: s, reason: collision with root package name */
    public final e0 f10324s;

    /* renamed from: t, reason: collision with root package name */
    public final e0 f10325t;

    /* renamed from: u, reason: collision with root package name */
    public final e0 f10326u;

    /* renamed from: v, reason: collision with root package name */
    public final e0 f10327v;

    /* renamed from: w, reason: collision with root package name */
    public final AtomicInteger f10328w;

    /* renamed from: x, reason: collision with root package name */
    public final e0 f10329x;

    /* renamed from: y, reason: collision with root package name */
    public final e0 f10330y;

    /* renamed from: z, reason: collision with root package name */
    public final d0 f10331z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v3, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v5, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v6, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r3v4, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r5v2, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    public ModifyStockCoverOrderViewModel(PortfolioRepository portfolioRepository, StockRepository stocksRepository, UserRepository userRepository, p orderValidatorModify, a schedulerProvider, ct.a compositeDisposable) {
        super(schedulerProvider, compositeDisposable, userRepository);
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(portfolioRepository, "portfolioRepository");
        Intrinsics.checkNotNullParameter(stocksRepository, "stocksRepository");
        Intrinsics.checkNotNullParameter(orderValidatorModify, "orderValidatorModify");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        this.f10319n = portfolioRepository;
        this.f10320o = stocksRepository;
        this.f10321p = orderValidatorModify;
        this.f10322q = new LiveData();
        this.f10323r = new LiveData();
        this.f10324s = new LiveData();
        this.f10325t = new LiveData();
        this.f10326u = new LiveData();
        ?? liveData = new LiveData();
        this.f10327v = liveData;
        new LiveData();
        new BottomSheetItem("All Holdings", HttpUrl.FRAGMENT_ENCODE_SET);
        this.f10328w = new AtomicInteger(0);
        ?? liveData2 = new LiveData();
        this.f10329x = liveData2;
        this.f10330y = new LiveData();
        this.f10331z = i0.C(liveData2, new n(this, 0));
        this.A = i0.C(liveData, h.f33773g);
    }

    @Override // com.assetgro.stockgro.ui.base.BaseViewModel
    public final void e() {
    }
}
