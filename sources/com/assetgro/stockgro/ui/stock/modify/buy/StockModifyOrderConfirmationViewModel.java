package com.assetgro.stockgro.ui.stock.modify.buy;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.d0;
import androidx.lifecycle.e0;
import com.assetgro.stockgro.data.repository.StockRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.ui.base.BaseViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import pi.h;
import pj.a;
import qu.i0;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/assetgro/stockgro/ui/stock/modify/buy/StockModifyOrderConfirmationViewModel;", "Lcom/assetgro/stockgro/ui/base/BaseViewModel;", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class StockModifyOrderConfirmationViewModel extends BaseViewModel {
    public final d0 A;

    /* renamed from: n, reason: collision with root package name */
    public final StockRepository f10287n;

    /* renamed from: o, reason: collision with root package name */
    public final e0 f10288o;

    /* renamed from: p, reason: collision with root package name */
    public final e0 f10289p;

    /* renamed from: q, reason: collision with root package name */
    public final e0 f10290q;

    /* renamed from: r, reason: collision with root package name */
    public final d0 f10291r;

    /* renamed from: s, reason: collision with root package name */
    public final d0 f10292s;

    /* renamed from: t, reason: collision with root package name */
    public final d0 f10293t;

    /* renamed from: u, reason: collision with root package name */
    public final d0 f10294u;

    /* renamed from: v, reason: collision with root package name */
    public final d0 f10295v;

    /* renamed from: w, reason: collision with root package name */
    public final d0 f10296w;

    /* renamed from: x, reason: collision with root package name */
    public final d0 f10297x;

    /* renamed from: y, reason: collision with root package name */
    public final d0 f10298y;

    /* renamed from: z, reason: collision with root package name */
    public final d0 f10299z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r3v1, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r3v2, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    public StockModifyOrderConfirmationViewModel(StockRepository stockRepository, UserRepository userRepository, a schedulerProvider, ct.a compositeDisposable) {
        super(schedulerProvider, compositeDisposable, userRepository);
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(stockRepository, "stockRepository");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        this.f10287n = stockRepository;
        ?? liveData = new LiveData();
        this.f10288o = liveData;
        this.f10289p = new LiveData();
        this.f10290q = new LiveData();
        this.f10291r = i0.C(liveData, h.f31130h);
        this.f10292s = i0.C(liveData, h.f31131i);
        this.f10293t = i0.C(liveData, h.f31133k);
        this.f10294u = i0.C(liveData, h.f31136n);
        this.f10295v = i0.C(liveData, h.f31128f);
        this.f10296w = i0.C(liveData, h.f31137o);
        this.f10297x = i0.C(liveData, h.f31129g);
        this.f10298y = i0.C(liveData, h.f31132j);
        this.f10299z = i0.C(liveData, h.f31134l);
        this.A = i0.C(liveData, h.f31135m);
    }

    @Override // com.assetgro.stockgro.ui.base.BaseViewModel
    public final void e() {
    }
}
