package com.assetgro.stockgro.ui.stock.list;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.e0;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.ui.base.BaseViewModel;
import kj.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import qf.a;
import qf.b;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/assetgro/stockgro/ui/stock/list/StockListHostViewModel;", "Lcom/assetgro/stockgro/ui/base/BaseViewModel;", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class StockListHostViewModel extends BaseViewModel {

    /* renamed from: n, reason: collision with root package name */
    public final a f10251n;

    /* renamed from: o, reason: collision with root package name */
    public final e0 f10252o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    public StockListHostViewModel(pj.a schedulerProvider, ct.a compositeDisposable, UserRepository userRepository, a maintenanceConfigManager) {
        super(schedulerProvider, compositeDisposable, userRepository);
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(maintenanceConfigManager, "maintenanceConfigManager");
        this.f10251n = maintenanceConfigManager;
        this.f10252o = new LiveData();
    }

    public static final void h(StockListHostViewModel stockListHostViewModel, b bVar) {
        int ordinal = bVar.ordinal();
        e0 e0Var = stockListHostViewModel.f10252o;
        boolean z10 = true;
        a aVar = stockListHostViewModel.f10251n;
        if (ordinal != 12) {
            if (ordinal == 13) {
                if (!aVar.b(b.f31938m) && !aVar.b(b.f31940o)) {
                    z10 = false;
                }
                e0Var.postValue(new j(Boolean.valueOf(z10)));
                return;
            }
            return;
        }
        if (!aVar.b(b.f31938m) && !aVar.b(b.f31939n)) {
            z10 = false;
        }
        e0Var.postValue(new j(Boolean.valueOf(z10)));
    }

    @Override // com.assetgro.stockgro.ui.base.BaseViewModel
    public final void e() {
    }
}
