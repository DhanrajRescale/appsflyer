package com.assetgro.stockgro.ui.stock.v2.presentation.overview;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.e0;
import androidx.lifecycle.u0;
import com.assetgro.stockgro.data.repository.StockRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.ui.base.BaseViewModel;
import dj.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import pj.a;
import yk.g;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/assetgro/stockgro/ui/stock/v2/presentation/overview/StockOverviewV2ViewModel;", "Lcom/assetgro/stockgro/ui/base/BaseViewModel;", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class StockOverviewV2ViewModel extends BaseViewModel {

    /* renamed from: n, reason: collision with root package name */
    public final StockRepository f10490n;

    /* renamed from: o, reason: collision with root package name */
    public final e0 f10491o;

    /* renamed from: p, reason: collision with root package name */
    public final e0 f10492p;

    /* renamed from: q, reason: collision with root package name */
    public final e0 f10493q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    public StockOverviewV2ViewModel(StockRepository stockRepository, UserRepository userRepository, a schedulerProvider, ct.a compositeDisposable) {
        super(schedulerProvider, compositeDisposable, userRepository);
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(stockRepository, "stockRepository");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        this.f10490n = stockRepository;
        ?? liveData = new LiveData();
        this.f10491o = liveData;
        this.f10492p = liveData;
        this.f10493q = new LiveData();
    }

    public final void h(String stockName) {
        Intrinsics.checkNotNullParameter(stockName, "stockName");
        this.f9084g.postValue(Boolean.TRUE);
        g.H(u0.f(this), null, null, new h(this, stockName, null), 3);
    }
}
