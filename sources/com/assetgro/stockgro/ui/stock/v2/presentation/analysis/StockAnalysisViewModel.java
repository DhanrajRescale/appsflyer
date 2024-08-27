package com.assetgro.stockgro.ui.stock.v2.presentation.analysis;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.e0;
import com.assetgro.stockgro.data.repository.StockRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.ui.base.BaseViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import pj.a;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/assetgro/stockgro/ui/stock/v2/presentation/analysis/StockAnalysisViewModel;", "Lcom/assetgro/stockgro/ui/base/BaseViewModel;", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class StockAnalysisViewModel extends BaseViewModel {

    /* renamed from: n, reason: collision with root package name */
    public final StockRepository f10455n;

    /* renamed from: o, reason: collision with root package name */
    public final e0 f10456o;

    /* renamed from: p, reason: collision with root package name */
    public final e0 f10457p;

    /* renamed from: q, reason: collision with root package name */
    public final String[] f10458q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    public StockAnalysisViewModel(StockRepository stockRepository, UserRepository userRepository, a schedulerProvider, ct.a compositeDisposable) {
        super(schedulerProvider, compositeDisposable, userRepository);
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(stockRepository, "stockRepository");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        this.f10455n = stockRepository;
        ?? liveData = new LiveData();
        this.f10456o = liveData;
        this.f10457p = liveData;
        this.f10458q = new String[]{"EMA", "BVPS"};
    }
}
