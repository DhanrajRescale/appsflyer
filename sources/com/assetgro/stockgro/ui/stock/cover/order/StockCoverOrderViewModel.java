package com.assetgro.stockgro.ui.stock.cover.order;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.d0;
import androidx.lifecycle.e0;
import com.assetgro.stockgro.data.repository.StockRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.ui.base.BaseViewModel;
import ji.d;
import ji.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mt.p;
import okhttp3.HttpUrl;
import pj.a;
import qu.i0;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/assetgro/stockgro/ui/stock/cover/order/StockCoverOrderViewModel;", "Lcom/assetgro/stockgro/ui/base/BaseViewModel;", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class StockCoverOrderViewModel extends BaseViewModel {

    /* renamed from: n, reason: collision with root package name */
    public final StockRepository f10172n;

    /* renamed from: o, reason: collision with root package name */
    public final p f10173o;

    /* renamed from: p, reason: collision with root package name */
    public String f10174p;

    /* renamed from: q, reason: collision with root package name */
    public String f10175q;

    /* renamed from: r, reason: collision with root package name */
    public final e0 f10176r;

    /* renamed from: s, reason: collision with root package name */
    public final e0 f10177s;

    /* renamed from: t, reason: collision with root package name */
    public final e0 f10178t;

    /* renamed from: u, reason: collision with root package name */
    public final e0 f10179u;

    /* renamed from: v, reason: collision with root package name */
    public final d0 f10180v;

    /* renamed from: w, reason: collision with root package name */
    public final d0 f10181w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r3v1, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r3v2, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r3v3, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    public StockCoverOrderViewModel(a schedulerProvider, ct.a compositeDisposable, StockRepository stocksRepository, p orderValidator, UserRepository userRepository) {
        super(schedulerProvider, compositeDisposable, userRepository);
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(stocksRepository, "stocksRepository");
        Intrinsics.checkNotNullParameter(orderValidator, "orderValidator");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        this.f10172n = stocksRepository;
        this.f10173o = orderValidator;
        this.f10174p = HttpUrl.FRAGMENT_ENCODE_SET;
        this.f10175q = HttpUrl.FRAGMENT_ENCODE_SET;
        ?? liveData = new LiveData();
        this.f10176r = liveData;
        this.f10177s = new LiveData();
        this.f10178t = new LiveData();
        this.f10179u = new LiveData();
        this.f10180v = i0.C(liveData, new h(this, 5));
        this.f10181w = i0.C(liveData, d.f21400c);
    }
}
