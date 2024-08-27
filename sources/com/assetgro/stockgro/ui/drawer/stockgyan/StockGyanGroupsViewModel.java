package com.assetgro.stockgro.ui.drawer.stockgyan;

import af.b;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.e0;
import com.assetgro.stockgro.data.repository.StockRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.ui.base.BaseViewModel;
import ge.q;
import java.util.ArrayList;
import java.util.HashMap;
import jt.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kq.e;
import nt.h;
import qf.a;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/assetgro/stockgro/ui/drawer/stockgyan/StockGyanGroupsViewModel;", "Lcom/assetgro/stockgro/ui/base/BaseViewModel;", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class StockGyanGroupsViewModel extends BaseViewModel {

    /* renamed from: n, reason: collision with root package name */
    public final StockRepository f9501n;

    /* renamed from: o, reason: collision with root package name */
    public final a f9502o;

    /* renamed from: p, reason: collision with root package name */
    public final e0 f9503p;

    /* renamed from: q, reason: collision with root package name */
    public final e0 f9504q;

    /* renamed from: r, reason: collision with root package name */
    public HashMap f9505r;

    /* renamed from: s, reason: collision with root package name */
    public final e0 f9506s;

    /* renamed from: t, reason: collision with root package name */
    public final e0 f9507t;

    /* renamed from: u, reason: collision with root package name */
    public final ArrayList f9508u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v5, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    public StockGyanGroupsViewModel(StockRepository stockRepository, UserRepository userRepository, a maintenanceConfigManager, pj.a schedulerProvider, ct.a compositeDisposable) {
        super(schedulerProvider, compositeDisposable, userRepository);
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(stockRepository, "stockRepository");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(maintenanceConfigManager, "maintenanceConfigManager");
        this.f9501n = stockRepository;
        this.f9502o = maintenanceConfigManager;
        this.f9503p = new LiveData();
        this.f9504q = new LiveData();
        this.f9505r = new HashMap();
        this.f9506s = new LiveData();
        this.f9507t = new LiveData();
        this.f9508u = new ArrayList();
    }

    @Override // com.assetgro.stockgro.ui.base.BaseViewModel
    public final void e() {
    }

    public final void h() {
        this.f9084g.postValue(Boolean.TRUE);
        h c10 = this.f9501n.getStockGyanGroups().c(((e) this.f9079b).J());
        d dVar = new d(new q(18, new b(this, 0)), new q(19, new b(this, 1)));
        c10.a(dVar);
        this.f9080c.c(dVar);
    }
}
