package com.assetgro.stockgro.ui.stock.modify.short_sell;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.d0;
import androidx.lifecycle.e0;
import com.assetgro.stockgro.data.repository.StockRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.ui.base.BaseViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import pj.a;
import qu.i0;
import ti.h;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/assetgro/stockgro/ui/stock/modify/short_sell/StockModifyShortSellOrderConfirmationViewModel;", "Lcom/assetgro/stockgro/ui/base/BaseViewModel;", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class StockModifyShortSellOrderConfirmationViewModel extends BaseViewModel {
    public final d0 A;

    /* renamed from: n, reason: collision with root package name */
    public final StockRepository f10372n;

    /* renamed from: o, reason: collision with root package name */
    public final e0 f10373o;

    /* renamed from: p, reason: collision with root package name */
    public final e0 f10374p;

    /* renamed from: q, reason: collision with root package name */
    public final e0 f10375q;

    /* renamed from: r, reason: collision with root package name */
    public final d0 f10376r;

    /* renamed from: s, reason: collision with root package name */
    public final d0 f10377s;

    /* renamed from: t, reason: collision with root package name */
    public final d0 f10378t;

    /* renamed from: u, reason: collision with root package name */
    public final d0 f10379u;

    /* renamed from: v, reason: collision with root package name */
    public final d0 f10380v;

    /* renamed from: w, reason: collision with root package name */
    public final d0 f10381w;

    /* renamed from: x, reason: collision with root package name */
    public final d0 f10382x;

    /* renamed from: y, reason: collision with root package name */
    public final d0 f10383y;

    /* renamed from: z, reason: collision with root package name */
    public final d0 f10384z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r3v1, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r3v2, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    public StockModifyShortSellOrderConfirmationViewModel(StockRepository stockRepository, UserRepository userRepository, a schedulerProvider, ct.a compositeDisposable) {
        super(schedulerProvider, compositeDisposable, userRepository);
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(stockRepository, "stockRepository");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        this.f10372n = stockRepository;
        ?? liveData = new LiveData();
        this.f10373o = liveData;
        this.f10374p = new LiveData();
        this.f10375q = new LiveData();
        this.f10376r = i0.C(liveData, h.f36113i);
        this.f10377s = i0.C(liveData, h.f36114j);
        this.f10378t = i0.C(liveData, h.f36116l);
        this.f10379u = i0.C(liveData, h.f36119o);
        this.f10380v = i0.C(liveData, h.f36111g);
        this.f10381w = i0.C(liveData, h.f36120p);
        this.f10382x = i0.C(liveData, h.f36112h);
        this.f10383y = i0.C(liveData, h.f36115k);
        this.f10384z = i0.C(liveData, h.f36117m);
        this.A = i0.C(liveData, h.f36118n);
    }

    @Override // com.assetgro.stockgro.ui.base.BaseViewModel
    public final void e() {
    }
}
