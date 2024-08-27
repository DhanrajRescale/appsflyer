package com.assetgro.stockgro.ui.stock.v2.presentation.chart;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.e0;
import com.assetgro.stockgro.data.repository.StockRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.ui.base.BaseViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import pj.a;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/assetgro/stockgro/ui/stock/v2/presentation/chart/StockTradingViewFullScreenChartViewModel;", "Lcom/assetgro/stockgro/ui/base/BaseViewModel;", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class StockTradingViewFullScreenChartViewModel extends BaseViewModel {

    /* renamed from: n, reason: collision with root package name */
    public final StockRepository f10474n;

    /* renamed from: o, reason: collision with root package name */
    public final String f10475o;

    /* renamed from: p, reason: collision with root package name */
    public final e0 f10476p;

    /* renamed from: q, reason: collision with root package name */
    public final e0 f10477q;

    /* renamed from: r, reason: collision with root package name */
    public final e0 f10478r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v3, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    public StockTradingViewFullScreenChartViewModel(StockRepository stockRepository, UserRepository userRepository, a schedulerProvider, ct.a compositeDisposable) {
        super(schedulerProvider, compositeDisposable, userRepository);
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(stockRepository, "stockRepository");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        this.f10474n = stockRepository;
        this.f10475o = a3.a.d("toString(...)");
        ?? liveData = new LiveData();
        this.f10476p = liveData;
        this.f10477q = liveData;
        this.f10478r = new LiveData();
    }
}
