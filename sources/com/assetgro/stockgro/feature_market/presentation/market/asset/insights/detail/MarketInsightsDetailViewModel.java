package com.assetgro.stockgro.feature_market.presentation.market.asset.insights.detail;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.e0;
import com.assetgro.stockgro.data.model.InsightListType;
import com.assetgro.stockgro.data.repository.StockRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.ui.base.BaseViewModel;
import jt.d;
import jt.e;
import kj.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nt.h;
import qf.a;
import qf.b;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/assetgro/stockgro/feature_market/presentation/market/asset/insights/detail/MarketInsightsDetailViewModel;", "Lcom/assetgro/stockgro/ui/base/BaseViewModel;", "kq/e", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class MarketInsightsDetailViewModel extends BaseViewModel {

    /* renamed from: s, reason: collision with root package name */
    public static boolean f8660s;

    /* renamed from: n, reason: collision with root package name */
    public final StockRepository f8661n;

    /* renamed from: o, reason: collision with root package name */
    public e f8662o;

    /* renamed from: p, reason: collision with root package name */
    public final e0 f8663p;

    /* renamed from: q, reason: collision with root package name */
    public InsightListType f8664q;

    /* renamed from: r, reason: collision with root package name */
    public final e0 f8665r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v3, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    public MarketInsightsDetailViewModel(StockRepository stocksRepository, UserRepository userRepository, a maintenanceConfigManager, pj.a schedulerProvider, ct.a compositeDisposable) {
        super(schedulerProvider, compositeDisposable, userRepository);
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(stocksRepository, "stocksRepository");
        Intrinsics.checkNotNullParameter(maintenanceConfigManager, "maintenanceConfigManager");
        this.f8661n = stocksRepository;
        this.f8663p = new LiveData();
        this.f8664q = InsightListType.TRENDING;
        ?? liveData = new LiveData();
        this.f8665r = liveData;
        boolean b10 = maintenanceConfigManager.b(b.f31938m);
        if (f8660s != b10) {
            f8660s = b10;
            liveData.postValue(new j(Boolean.valueOf(b10)));
        }
    }

    public final void h() {
        h c10 = this.f8661n.getStockInsights().c(((kq.e) this.f9079b).J());
        d dVar = new d(new com.assetgro.stockgro.data.a(8, new pa.e(this, 0)), new com.assetgro.stockgro.data.a(9, new pa.e(this, 1)));
        c10.a(dVar);
        this.f9080c.c(dVar);
    }
}
