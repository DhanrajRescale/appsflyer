package com.assetgro.stockgro.ui.stock.detail;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.e0;
import com.assetgro.stockgro.data.model.portfolio.holdings.Portfolio;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.ui.base.BaseViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import pj.a;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/assetgro/stockgro/ui/stock/detail/StockSharedViewModel;", "Lcom/assetgro/stockgro/ui/base/BaseViewModel;", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class StockSharedViewModel extends BaseViewModel {

    /* renamed from: n, reason: collision with root package name */
    public boolean f10197n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f10198o;

    /* renamed from: p, reason: collision with root package name */
    public final e0 f10199p;

    /* renamed from: q, reason: collision with root package name */
    public final e0 f10200q;

    /* renamed from: r, reason: collision with root package name */
    public Portfolio f10201r;

    /* renamed from: s, reason: collision with root package name */
    public String f10202s;

    /* renamed from: t, reason: collision with root package name */
    public String f10203t;

    /* renamed from: u, reason: collision with root package name */
    public String f10204u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    public StockSharedViewModel(a schedulerProvider, ct.a compositeDisposable, UserRepository userRepository) {
        super(schedulerProvider, compositeDisposable, userRepository);
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        this.f10199p = new LiveData();
        this.f10200q = new LiveData();
        new LiveData();
    }

    @Override // com.assetgro.stockgro.ui.base.BaseViewModel
    public final void e() {
    }
}
