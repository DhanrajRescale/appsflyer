package com.assetgro.stockgro.ui.stock.detail.order;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.d0;
import androidx.lifecycle.e0;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.ui.base.BaseViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mi.d;
import pj.a;
import qu.i0;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/assetgro/stockgro/ui/stock/detail/order/StockOrderPaymentSuccessfulViewModel;", "Lcom/assetgro/stockgro/ui/base/BaseViewModel;", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class StockOrderPaymentSuccessfulViewModel extends BaseViewModel {

    /* renamed from: n, reason: collision with root package name */
    public final e0 f10225n;

    /* renamed from: o, reason: collision with root package name */
    public final e0 f10226o;

    /* renamed from: p, reason: collision with root package name */
    public final d0 f10227p;

    /* renamed from: q, reason: collision with root package name */
    public final d0 f10228q;

    /* renamed from: r, reason: collision with root package name */
    public final d0 f10229r;

    /* renamed from: s, reason: collision with root package name */
    public final d0 f10230s;

    /* renamed from: t, reason: collision with root package name */
    public final e0 f10231t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v3, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r3v1, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    public StockOrderPaymentSuccessfulViewModel(a schedulerProvider, ct.a compositeDisposable, UserRepository userRepository) {
        super(schedulerProvider, compositeDisposable, userRepository);
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        ?? liveData = new LiveData();
        this.f10225n = liveData;
        this.f10226o = new LiveData();
        this.f10227p = i0.C(liveData, d.f27775m);
        this.f10228q = i0.C(liveData, d.f27776n);
        this.f10229r = i0.C(liveData, d.f27774l);
        this.f10230s = i0.C(liveData, d.f27773k);
        this.f10231t = new LiveData();
    }

    @Override // com.assetgro.stockgro.ui.base.BaseViewModel
    public final void e() {
    }
}
