package com.assetgro.stockgro.ui.stock.detail;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.e0;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.ui.base.BaseViewModel;
import kj.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import pj.a;
import qf.b;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/assetgro/stockgro/ui/stock/detail/StockDetailHostViewModel;", "Lcom/assetgro/stockgro/ui/base/BaseViewModel;", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class StockDetailHostViewModel extends BaseViewModel {

    /* renamed from: n, reason: collision with root package name */
    public final e0 f10192n;

    /* renamed from: o, reason: collision with root package name */
    public final e0 f10193o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    public StockDetailHostViewModel(a schedulerProvider, ct.a compositeDisposable, UserRepository userRepository, qf.a maintenanceConfigManager) {
        super(schedulerProvider, compositeDisposable, userRepository);
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(maintenanceConfigManager, "maintenanceConfigManager");
        this.f10192n = new LiveData();
        ?? liveData = new LiveData();
        this.f10193o = liveData;
        liveData.postValue(new j(Boolean.valueOf(maintenanceConfigManager.b(b.f31938m))));
    }

    @Override // com.assetgro.stockgro.ui.base.BaseViewModel
    public final void e() {
    }
}
