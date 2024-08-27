package com.assetgro.stockgro.ui.subscription.purchase;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.e0;
import com.assetgro.stockgro.data.repository.PaymentRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.ui.base.BaseViewModel;
import jj.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/assetgro/stockgro/ui/subscription/purchase/SubscriptionPurchaseStatusViewModel;", "Lcom/assetgro/stockgro/ui/base/BaseViewModel;", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class SubscriptionPurchaseStatusViewModel extends BaseViewModel {

    /* renamed from: n, reason: collision with root package name */
    public final PaymentRepository f10572n;

    /* renamed from: o, reason: collision with root package name */
    public final a f10573o;

    /* renamed from: p, reason: collision with root package name */
    public final e0 f10574p;

    /* renamed from: q, reason: collision with root package name */
    public final e0 f10575q;

    /* renamed from: r, reason: collision with root package name */
    public final e0 f10576r;

    /* renamed from: s, reason: collision with root package name */
    public final e0 f10577s;

    /* renamed from: t, reason: collision with root package name */
    public final e0 f10578t;

    /* renamed from: u, reason: collision with root package name */
    public final e0 f10579u;

    /* renamed from: v, reason: collision with root package name */
    public final e0 f10580v;

    /* renamed from: w, reason: collision with root package name */
    public final e0 f10581w;

    /* renamed from: x, reason: collision with root package name */
    public final e0 f10582x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v3, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v5, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    public SubscriptionPurchaseStatusViewModel(pj.a schedulerProvider, ct.a compositeDisposable, UserRepository userRepository, PaymentRepository paymentRepository, a appsFlyerAnalyticsEngineImpl) {
        super(schedulerProvider, compositeDisposable, userRepository);
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(paymentRepository, "paymentRepository");
        Intrinsics.checkNotNullParameter(appsFlyerAnalyticsEngineImpl, "appsFlyerAnalyticsEngineImpl");
        this.f10572n = paymentRepository;
        this.f10573o = appsFlyerAnalyticsEngineImpl;
        ?? liveData = new LiveData();
        this.f10574p = liveData;
        this.f10575q = liveData;
        ?? liveData2 = new LiveData();
        this.f10576r = liveData2;
        this.f10577s = liveData2;
        this.f10578t = new LiveData();
        ?? liveData3 = new LiveData();
        this.f10579u = liveData3;
        this.f10580v = liveData3;
        ?? liveData4 = new LiveData();
        this.f10581w = liveData4;
        this.f10582x = liveData4;
    }
}
